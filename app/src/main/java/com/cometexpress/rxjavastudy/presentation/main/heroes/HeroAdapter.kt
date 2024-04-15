package com.cometexpress.rxjavastudy.presentation.main.heroes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
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
            itemBinding.tvName.text = item.name
        }
    }

}