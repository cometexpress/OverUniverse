package com.cometexpress.rxjavastudy.presentation.heroes

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.activityViewModels
import com.cometexpress.rxjavastudy.common.base.BaseFragment
import com.cometexpress.rxjavastudy.common.extension.showToast
import com.cometexpress.rxjavastudy.databinding.FragmentHeroesBinding
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroType
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HeroesFragment : BaseFragment<FragmentHeroesBinding>(FragmentHeroesBinding::inflate) {

    companion object {
        @JvmStatic
        fun newInstance() = HeroesFragment()
    }

    private val vm: HeroesVM by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        vm.getHeroes(HeroType.TANK.name.lowercase())
        vm.getHeroes(HeroType.DAMAGE.name.lowercase())
        vm.getHeroes(HeroType.SUPPORT.name.lowercase())
    }

    private fun bind() {
        // TODO: RecyclerView 연결
        vm.allHeroes.subscribe { heroes ->
            binding.tvResult.text = heroes.toString()
        }.also { compositeDisposable.add(it) }

        vm.isLoading.subscribe { isLoading ->
            Log.i("info", "로딩상태 = $isLoading")
        }.also { compositeDisposable.add(it) }

        vm.toastMessage.subscribe { message ->
            activity?.showToast(message)
        }.also { compositeDisposable.add(it) }
    }
}