package com.cometexpress.overuniverse.presentation.main.hero_info

import android.os.Bundle
import android.text.Html
import android.view.View
import androidx.activity.viewModels
import androidx.core.view.doOnLayout
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.cometexpress.overuniverse.R
import com.cometexpress.overuniverse.common.Constant
import com.cometexpress.overuniverse.common.base.BaseActivity
import com.cometexpress.overuniverse.common.extension.dpToPx
import com.cometexpress.overuniverse.common.extension.showToast
import com.cometexpress.overuniverse.databinding.ActivityHeroInfoBinding
import com.cometexpress.overuniverse.domain.entity.heroes.HeroHPEntity
import com.cometexpress.overuniverse.domain.entity.heroes.HeroHPType
import com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity
import com.cometexpress.overuniverse.domain.entity.heroes.getHpSize
import com.orhanobut.logger.Logger
import dagger.hilt.android.AndroidEntryPoint
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit


@AndroidEntryPoint
class HeroInfoActivity : BaseActivity<ActivityHeroInfoBinding>(ActivityHeroInfoBinding::inflate),
    View.OnClickListener {

    private val vm: HeroInfoVM by viewModels()

    private lateinit var hpAdapter: TotalHeroHPAdapter

    private var containerWidth = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
        bind()

        val key = intent.getStringExtra(Constant.Intent.HERO_KEY)
        key?.let { vm.getHeroInfo(key) }

        // 컨테이너 Width
        binding.clContainer.doOnLayout {
            containerWidth = it.measuredWidth
        }
    }

    private fun init() {
        binding.ivBack.setOnClickListener(this)

        hpAdapter = TotalHeroHPAdapter()

        binding.rvTotal.apply {
            adapter = hpAdapter
            layoutManager =
                LinearLayoutManager(this@HeroInfoActivity, LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            isNestedScrollingEnabled = false
        }
    }

    private fun bind() {
        vm.heroInfo
            .delay(100L, TimeUnit.MILLISECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { heroInfo ->
                Logger.i("영웅 정보 = $heroInfo")
                setData(heroInfo)
            }
            .also { compositeDisposable.add(it) }

        vm.isLoading.subscribe { isLoading ->
            binding.loadingView.isVisible = isLoading
        }.also { compositeDisposable.add(it) }

        vm.toastMessage.subscribe { message ->
            showToast(message)
        }.also { compositeDisposable.add(it) }
    }

    private fun setData(heroInfo: HeroInfoEntity) {
        Glide.with(this)
            .load(heroInfo.portrait)
            .into(binding.ivThumb)

        binding.tvName.text = heroInfo.name
        binding.tvRole.text = heroInfo.role.uppercase()
        binding.tvDescription.text = heroInfo.description

        // HP RecyclerView
        val totalHp = heroInfo.hitpoints.total / heroInfo.getHpSize()

        val hpList = mutableListOf<HeroHPEntity>()
        val cntShield = heroInfo.hitpoints.shields / heroInfo.getHpSize()
        val cntArmor = heroInfo.hitpoints.armor / heroInfo.getHpSize()
        val cntHealth = heroInfo.hitpoints.health / heroInfo.getHpSize()

        repeat(cntShield) {
            hpList.add(HeroHPEntity(HeroHPType.SHIELD))
        }
        repeat(cntArmor) {
            hpList.add(HeroHPEntity(HeroHPType.ARMOR))
        }
        repeat(cntHealth) {
            hpList.add(HeroHPEntity(HeroHPType.NORMAL))
        }

        val itemWidth = (containerWidth / totalHp) - (this.dpToPx(2f))
        hpAdapter.setList(itemWidth, hpList)

        binding.tvHp.text = Html.fromHtml(
            getString(
                R.string.hero_full_hp,
                heroInfo.hitpoints.shields,
                heroInfo.hitpoints.armor,
                heroInfo.hitpoints.health
            ),
            Html.FROM_HTML_MODE_LEGACY
        )

        when {
            heroInfo.hitpoints.shields == 0 && heroInfo.hitpoints.armor == 0 -> {
                binding.tvHp.text = Html.fromHtml(
                    getString(R.string.hero_only_hp, heroInfo.hitpoints.health),
                    Html.FROM_HTML_MODE_LEGACY
                )
            }

            heroInfo.hitpoints.shields == 0 -> {
                binding.tvHp.text = Html.fromHtml(
                    getString(
                        R.string.hero_armor_hp,
                        heroInfo.hitpoints.armor,
                        heroInfo.hitpoints.health
                    ),
                    Html.FROM_HTML_MODE_LEGACY
                )
            }

            heroInfo.hitpoints.armor == 0 -> {
                binding.tvHp.text = Html.fromHtml(
                    getString(
                        R.string.hero_shield_hp,
                        heroInfo.hitpoints.shields,
                        heroInfo.hitpoints.health
                    ),
                    Html.FROM_HTML_MODE_LEGACY
                )
            }
        }
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            binding.ivBack.id -> {
                finish()
            }
        }
    }
}