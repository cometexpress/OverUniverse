package com.cometexpress.overuniverse.presentation.main.maps

import android.os.Bundle
import android.view.View
import com.cometexpress.overuniverse.common.base.BaseFragment
import com.cometexpress.overuniverse.databinding.FragmentMapsBinding
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