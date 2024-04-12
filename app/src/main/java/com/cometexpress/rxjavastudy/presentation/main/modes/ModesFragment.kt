package com.cometexpress.rxjavastudy.presentation.main.modes

import android.os.Bundle
import android.view.View
import com.cometexpress.rxjavastudy.common.base.BaseFragment
import com.cometexpress.rxjavastudy.databinding.FragmentModesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ModesFragment : BaseFragment<FragmentModesBinding>(FragmentModesBinding::inflate) {

    companion object {
        @JvmStatic
        fun newInstance() = ModesFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}