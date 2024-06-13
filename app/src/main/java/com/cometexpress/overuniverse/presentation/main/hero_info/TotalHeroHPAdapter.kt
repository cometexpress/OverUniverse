package com.cometexpress.overuniverse.presentation.main.hero_info

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.cometexpress.overuniverse.databinding.ItemHpBinding
import com.cometexpress.overuniverse.domain.entity.heroes.HeroHPEntity
import com.cometexpress.overuniverse.domain.entity.heroes.getColorResId

class TotalHeroHPAdapter: RecyclerView.Adapter<TotalHeroHPAdapter.ViewHolder>() {

    private var items = listOf<HeroHPEntity>()
    private var itemWidth = 0

    fun setList(itemWidth: Int,items: List<HeroHPEntity>) {
        if (items.isNotEmpty()) {
            this.items = items
            this.itemWidth = itemWidth
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemHpBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        binding.flBackground.layoutParams.width = itemWidth
        return ViewHolder(binding)
    }
    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    inner class ViewHolder(private val itemBinding: ItemHpBinding) : RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(item: HeroHPEntity) {
            val bgColor = ContextCompat.getColor(itemBinding.root.context, item.type.getColorResId())
            itemBinding.flBackground.setBackgroundColor(bgColor)
        }
    }

}