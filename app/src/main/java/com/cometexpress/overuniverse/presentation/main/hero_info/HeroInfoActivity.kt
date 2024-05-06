package com.cometexpress.overuniverse.presentation.main.hero_info

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.core.view.doOnLayout
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
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
            layoutManager = LinearLayoutManager(this@HeroInfoActivity, LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            isNestedScrollingEnabled = false
        }
    }

    private fun bind() {
        vm.heroInfo
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

        val totalHp = heroInfo.hitpoints.total / heroInfo.getHpSize()

        heroInfo.hitpoints.health

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


        binding.tvNormal.text = "${heroInfo.hitpoints.health} / ${heroInfo.hitpoints.total}"
        binding.pbNormal.max = heroInfo.hitpoints.total
        binding.pbNormal.setProgress(heroInfo.hitpoints.health,true)
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            binding.ivBack.id -> { finish() }
        }
    }
}