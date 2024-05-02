package com.cometexpress.overuniverse.presentation.main.heroes

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.viewpager2.widget.ViewPager2
import com.cometexpress.overuniverse.common.Constant
import com.cometexpress.overuniverse.common.base.BaseFragment
import com.cometexpress.overuniverse.common.extension.showToast
import com.cometexpress.overuniverse.databinding.FragmentHeroesBinding
import com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity
import com.cometexpress.overuniverse.presentation.main.hero_info.HeroInfoActivity
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint
import androidx.core.util.Pair


@AndroidEntryPoint
class HeroesFragment : BaseFragment<FragmentHeroesBinding>(FragmentHeroesBinding::inflate) {

    companion object {
        @JvmStatic
        fun newInstance() = HeroesFragment()
    }

    private val vm: HeroesVM by activityViewModels()

    private val viewPagerAdapter by lazy {
        HeroesViewPagerAdapter(object : HeroAdapter.OnHeroItemClickListener {
            override fun heroClick(thumbView: View, hero: HeroEntity) {
                activity?.let {
                    val optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(
                        it,
                        Pair(thumbView, thumbView.transitionName)
                    )
                    val intent = Intent(it, HeroInfoActivity::class.java)
                    intent.putExtra(Constant.Intent.HERO_KEY, hero.key)
                    startActivity(intent, optionsCompat.toBundle())
                }
            }
        })
    }

    private var tabMenus = listOf<String>()
    private var allHeroes = listOf<HeroEntity>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewPager()
        bind()
    }

    private fun setViewPager() {
        binding.viewpager.apply {
            adapter = viewPagerAdapter
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            })
        }

        TabLayoutMediator(binding.tabLayout, binding.viewpager) { tab, position ->
            tab.text = tabMenus[position]
            binding.viewpager.setCurrentItem(tab.position, true)
        }.attach()
    }

    private fun bind() {
        vm.roles.subscribe {
            tabMenus = it.map { roleEntity -> roleEntity.name }
        }.also { compositeDisposable.add(it) }

        vm.allHeroes.subscribe { heroes ->
            allHeroes = heroes
            val heroRole = heroes.groupBy { it.role }
            viewPagerAdapter.setList(heroRole)
        }.also { compositeDisposable.add(it) }

        vm.isLoading.subscribe { isLoading ->
            binding.loadingView.isVisible = isLoading
        }.also { compositeDisposable.add(it) }

        vm.toastMessage.subscribe { message ->
            activity?.showToast(message)
        }.also { compositeDisposable.add(it) }
    }

}