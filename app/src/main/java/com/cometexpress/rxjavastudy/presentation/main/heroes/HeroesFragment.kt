package com.cometexpress.rxjavastudy.presentation.main.heroes

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.viewpager2.widget.ViewPager2
import com.cometexpress.rxjavastudy.common.base.BaseFragment
import com.cometexpress.rxjavastudy.common.extension.showToast
import com.cometexpress.rxjavastudy.databinding.FragmentHeroesBinding
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroEntity
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HeroesFragment : BaseFragment<FragmentHeroesBinding>(FragmentHeroesBinding::inflate) {

    companion object {
        @JvmStatic
        fun newInstance() = HeroesFragment()
    }

    private val vm: HeroesVM by activityViewModels()

    private val viewPagerAdapter by lazy {
        HeroesViewPagerAdapter(object : HeroAdapter.OnHeroItemClickListener {
            override fun heroClick(hero: HeroEntity) {
                // TODO: Detail 페이지로 데이터 전달 및 이동
                activity?.showToast(hero.name)
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
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                }
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