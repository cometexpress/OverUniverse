package com.cometexpress.overuniverse.presentation.main.heroes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cometexpress.overuniverse.common.extension.dpToPx
import com.cometexpress.overuniverse.common.extension.pxToDp
import com.cometexpress.overuniverse.databinding.VpItemHeroesBinding
import com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity
import com.cometexpress.overuniverse.presentation.main.adapter_decoration.GridSpacingItemDecoration

class HeroesViewPagerAdapter(
    private val onItemClickListener: HeroAdapter.OnHeroItemClickListener
): RecyclerView.Adapter<HeroesViewPagerAdapter.PagerViewHolder>() {

    private var allItems = mapOf<String, List<HeroEntity>>()

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

    inner class PagerViewHolder(private val itemBinding: VpItemHeroesBinding) : RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(items: List<HeroEntity>) {
            itemBinding.rvHero.apply {
                adapter = HeroAdapter(items, onItemClickListener = object: HeroAdapter.OnHeroItemClickListener{
                    override fun heroClick(thumbView: View, hero: HeroEntity) {
                        onItemClickListener.heroClick(thumbView, hero)
                    }
                })
                layoutManager = GridLayoutManager(itemBinding.root.context, 3)
                addItemDecoration(GridSpacingItemDecoration(
                    spanCount = 3,
                    spacing = itemBinding.root.context.dpToPx(12f))
                )
                setHasFixedSize(true)
            }
        }
    }

}