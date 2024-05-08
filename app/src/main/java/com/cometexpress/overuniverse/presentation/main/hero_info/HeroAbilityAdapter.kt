package com.cometexpress.overuniverse.presentation.main.hero_info

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.view.doOnAttach
import androidx.core.view.doOnDetach
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.findViewTreeLifecycleOwner
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cometexpress.overuniverse.common.ExoPlayerUtil
import com.cometexpress.overuniverse.databinding.ItemHeroAbilityBinding
import com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility

class HeroAbilityAdapter : RecyclerView.Adapter<HeroAbilityAdapter.ViewHolder>() {

    private var items = listOf<HeroInfoEntityAbility>()

    private var listener: OnHeroAbilityListener? = null

    interface OnHeroAbilityListener {
        fun onPlay(item: HeroInfoEntityAbility)
    }

    fun setOnHeroAbilityListener(listener: OnHeroAbilityListener) {
        this.listener = listener
    }

    fun setList(items: List<HeroInfoEntityAbility>) {
        if (items.isNotEmpty()) {
            this.items = items
            notifyDataSetChanged()
        }
    }

    override fun onViewAttachedToWindow(holder: ViewHolder) {
        super.onViewAttachedToWindow(holder)
        holder.bind(items[holder.bindingAdapterPosition])
    }

    override fun onViewDetachedFromWindow(holder: ViewHolder) {
        holder.releasePlayer()
        super.onViewDetachedFromWindow(holder)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemHeroAbilityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    inner class ViewHolder(private val itemBinding: ItemHeroAbilityBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        private var lifecycleOwner: LifecycleOwner? = null

        var exoPlayer: ExoPlayer? = null

        init {
            itemView.doOnAttach {
                lifecycleOwner = itemView.findViewTreeLifecycleOwner()
            }
            itemView.doOnDetach {
                lifecycleOwner = null
            }
            itemBinding.ivPlay.setOnClickListener {
                listener?.onPlay(items[bindingAdapterPosition])
            }
        }

        fun bind(item: HeroInfoEntityAbility) {

            itemBinding.playerView.player = null
            stopStatus()

            // TODO: 재생버튼 UI 추가 필요
            if (item.playWhenReady) {
                initExoPlayer(item)
            } else {
                stopStatus()
            }

            lifecycleOwner?.lifecycle?.addObserver(object : LifecycleEventObserver {
                override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
                    when(event) {
                        Lifecycle.Event.ON_START -> {
                            if (item.playWhenReady) {
                                exoPlayer?.prepare()
                                exoPlayer?.play()
                            }
                        }
                        Lifecycle.Event.ON_PAUSE -> {
                            stopStatus()
                            exoPlayer?.pause()
                        }
                        else -> Unit
                    }
                }
            })

            Glide.with(itemBinding.root.context)
                .load(item.icon)
                .into(itemBinding.ivIcon)

            Glide.with(itemBinding.root.context)
                .load(item.video.thumbnail)
                .into(itemBinding.ivPreview)

            itemBinding.tvName.text = item.name
            itemBinding.tvDescription.text = item.description
        }

        fun releasePlayer() {
            exoPlayer?.release()
            exoPlayer = null
        }

        private fun initExoPlayer(item: HeroInfoEntityAbility) {
            exoPlayer = ExoPlayerUtil.prepare(
                itemBinding.root.context,
                item.video.link.mp4,
                item.playWhenReady,
                0,
                1f,
                ExoPlayerUtil.playbackStateListener(
                    ready = {
                        itemBinding.progress.visibility = View.GONE
                    },
                    end = {
                        exoPlayer?.seekTo(0)
                        exoPlayer?.playWhenReady = false
                        item.playWhenReady = false
                        stopStatus()
                    },
                    buffering = {
                        itemBinding.ivPreview.visibility = View.VISIBLE
                        itemBinding.progress.visibility = View.VISIBLE
                    },
                    idle = {},
                    isPlayingChanged = { isPlay ->
                        if (isPlay) {
                            playStatus()
                        } else {
                            stopStatus()
                        }
                    }
                ),
                itemBinding.playerView
            )
        }

        private fun playStatus() {
            itemBinding.ivPreview.visibility = View.GONE
            itemBinding.ivPlay.visibility = View.GONE
        }

        private fun stopStatus() {
            itemBinding.ivPreview.visibility = View.VISIBLE
            itemBinding.ivPlay.visibility = View.VISIBLE
        }
    }

}