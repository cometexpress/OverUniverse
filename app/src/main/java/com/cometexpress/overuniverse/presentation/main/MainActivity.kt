package com.cometexpress.overuniverse.presentation.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.cometexpress.overuniverse.R
import com.cometexpress.overuniverse.common.base.BaseActivity
import com.cometexpress.overuniverse.databinding.ActivityMainBinding
import com.cometexpress.overuniverse.presentation.main.heroes.HeroesFragment
import com.cometexpress.overuniverse.presentation.main.maps.MapsFragment
import com.cometexpress.overuniverse.presentation.main.modes.ModesFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setBottomNavigationView()

        // 앱 초기 실행시 화면 설정
        if (savedInstanceState == null) {
            binding.bottomNavigationView.selectedItemId = R.id.fragment_heroes
        }
    }

    private fun replaceBottomView(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .replace(R.id.main_container, fragment)
            .commitAllowingStateLoss()
    }

    private fun setBottomNavigationView() {
        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.fragment_heroes -> {
                    replaceBottomView(HeroesFragment.newInstance())
                    true
                }

                R.id.fragment_maps -> {
                    replaceBottomView(MapsFragment.newInstance())
                    true
                }

                R.id.fragment_modes -> {
                    replaceBottomView(ModesFragment.newInstance())
                    true
                }

                else -> false
            }
        }
    }
}