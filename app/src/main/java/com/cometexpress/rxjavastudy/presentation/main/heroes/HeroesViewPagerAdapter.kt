package com.cometexpress.rxjavastudy.presentation.main.heroes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cometexpress.rxjavastudy.common.extension.fromDpToPx
import com.cometexpress.rxjavastudy.databinding.VpItemHeroesBinding
import com.cometexpress.rxjavastudy.domain.entity.heroes.HeroEntity
import com.cometexpress.rxjavastudy.presentation.main.adapter_decoration.GridSpacingItemDecoration

class HeroesViewPagerAdapter: RecyclerView.Adapter<HeroesViewPagerAdapter.PagerViewHolder>() {

    private var allItems = mapOf<String, List<HeroEntity>>()

//    private lateinit var eventListener: OnHeroesViewPagerClickListener
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        val binding = VpItemHeroesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PagerViewHolder(binding)
    }
    override fun getItemCount(): Int = allItems.keys.size

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        val items = allItems.values.elementAt(position)
        holder.bind(items)
    }

    fun setList(items: Map<String, List<HeroEntity>>) {
        if (items.isNotEmpty()) {
            allItems = items
            notifyDataSetChanged()
        }
    }

    inner class PagerViewHolder(val itemBinding: VpItemHeroesBinding) : RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(items: List<HeroEntity>) {
            itemBinding.rvHero.apply {
                adapter = HeroAdapter(items)
                layoutManager = GridLayoutManager(itemBinding.root.context, 3)
                addItemDecoration(GridSpacingItemDecoration(spanCount = 3, spacing = 12f.fromDpToPx()))
                setHasFixedSize(true)
            }
        }
    }

}