package com.cometexpress.overuniverse.presentation.main.hero_info

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cometexpress.overuniverse.databinding.ItemHeroAbilityBinding
import com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility

class HeroAbilityAdapter : RecyclerView.Adapter<HeroAbilityAdapter.ViewHolder>() {

    private var items = listOf<HeroInfoEntityAbility>()

    fun setList(items: List<HeroInfoEntityAbility>) {
        if (items.isNotEmpty()) {
            this.items = items
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemHeroAbilityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    inner class ViewHolder(private val itemBinding: ItemHeroAbilityBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(item: HeroInfoEntityAbility) {

            Glide.with(itemBinding.root.context)
                .load(item.icon)
                .into(itemBinding.ivIcon)

            Glide.with(itemBinding.root.context)
                .load(item.video.thumbnail)
                .into(itemBinding.ivPreview)

            itemBinding.tvName.text = item.name
            itemBinding.tvDescription.text = item.description

//            val player = ExoPlayer.Builder(this).build()
//            binding.playerView.player = player
//
//            Glide.with(this)
//                .load(heroInfo.abilities[1].video.thumbnail)
//                .into(binding.ivPreview)
//
//            val mediaItem = MediaItem.fromUri(heroInfo.abilities[0].video.link.mp4)
//            player.setMediaItem(mediaItem)
//            player.prepare()
////                player.play()
        }
    }

}