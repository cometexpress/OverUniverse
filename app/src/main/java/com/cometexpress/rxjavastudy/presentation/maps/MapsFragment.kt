package com.cometexpress.rxjavastudy.presentation.maps

import android.os.Bundle
import android.view.View
import com.cometexpress.rxjavastudy.common.base.BaseFragment
import com.cometexpress.rxjavastudy.databinding.FragmentMapsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MapsFragment : BaseFragment<FragmentMapsBinding>(FragmentMapsBinding::inflate) {
    companion object {
        @JvmStatic
        fun newInstance() = MapsFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}