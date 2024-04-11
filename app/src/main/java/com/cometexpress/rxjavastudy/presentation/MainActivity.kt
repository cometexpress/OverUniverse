package com.cometexpress.rxjavastudy.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.cometexpress.rxjavastudy.R
import com.cometexpress.rxjavastudy.common.base.BaseActivity
import com.cometexpress.rxjavastudy.common.extension.showToast
import com.cometexpress.rxjavastudy.databinding.ActivityMainBinding
import com.cometexpress.rxjavastudy.presentation.heroes.HeroesFragment
import com.cometexpress.rxjavastudy.presentation.maps.MapsFragment
import com.cometexpress.rxjavastudy.presentation.modes.ModesFragment
import dagger.hilt.android.AndroidEntryPoint
import io.reactivex.disposables.CompositeDisposable

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

    private fun setBottomNavigationView() {
        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.fragment_heroes -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_container, HeroesFragment.newInstance()).commit()
                    true
                }

                R.id.fragment_maps -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_container, MapsFragment.newInstance()).commit()
                    true
                }

                R.id.fragment_modes -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_container, ModesFragment.newInstance()).commit()
                    true
                }

                else -> false
            }
        }
    }
}