package com.cometexpress.rxjavastudy.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.cometexpress.rxjavastudy.data.network.api.HeroesAPI
import com.cometexpress.rxjavastudy.data.network.NetworkUtil
import com.cometexpress.rxjavastudy.databinding.ActivityMainBinding
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val service = NetworkUtil.getAPI<HeroesAPI>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //test
        lifecycleScope.launch {
            val call = service.getHeroes("damage")
            if (call.isSuccessful) {
                binding.tvResult.text = call.body().toString()
            }
        }
    }
}