package com.cometexpress.rxjavastudy.presentation.main.heroes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.CenterInside
import com.bumptech.glide.load.resource.bitmap.FitCenter
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.cometexpress.rxjavastudy.R
import com.cometexpress.rxjavastudy.databinding.ItemHeroBinding
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroEntity

class HeroAdapter(private val items: List<HeroEntity>): RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val binding = ItemHeroBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HeroViewHolder(binding)
    }
    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    inner class HeroViewHolder(val itemBinding: ItemHeroBinding) : RecyclerView.ViewHolder(itemBinding.root) {

        init {
//            itemBinding.ivThumb.setOnClickListener {
//                eventListener.onImgClick(bindingAdapterPosition)
//            }
        }

        fun bind(item: HeroEntity) {
            val multiOption = MultiTransformation(
                RoundedCorners(20))

            Glide.with(itemBinding.root.context)
                .load(item.image)
                .apply(RequestOptions.bitmapTransform(multiOption))
                .into(itemBinding.ivThumb)

            itemBinding.tvName.text = item.name
        }
    }

}