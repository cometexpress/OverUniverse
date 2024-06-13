package com.cometexpress.overuniverse.presentation.main.heroes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.cometexpress.overuniverse.databinding.ItemHeroBinding
import com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity

class HeroAdapter(
    private val items: List<HeroEntity>,
    private val onItemClickListener: OnHeroItemClickListener
): RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    interface OnHeroItemClickListener {
        fun heroClick(thumbView: View, hero: HeroEntity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val binding = ItemHeroBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HeroViewHolder(binding)
    }
    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    inner class HeroViewHolder(private val itemBinding: ItemHeroBinding) : RecyclerView.ViewHolder(itemBinding.root) {

        init {
            itemBinding.root.setOnClickListener {
                onItemClickListener.heroClick(itemBinding.ivThumb, items[adapterPosition])
            }
        }

        fun bind(item: HeroEntity) {
            val multiOption = MultiTransformation(
                RoundedCorners(20))

            Glide.with(itemBinding.root.context)
                .load(item.image)
                .override(300)
                .apply(RequestOptions.bitmapTransform(multiOption))
                .into(itemBinding.ivThumb)

            itemBinding.tvName.text = item.name
        }
    }

}