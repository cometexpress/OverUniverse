package com.cometexpress.overuniverse.presentation.main.heroes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J \u0010\u0015\u001a\u00020\u000e2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroesViewPagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroesViewPagerAdapter$PagerViewHolder;", "onItemClickListener", "Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroAdapter$OnHeroItemClickListener;", "(Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroAdapter$OnHeroItemClickListener;)V", "allItems", "", "", "", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroEntity;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setList", "items", "PagerViewHolder", "app_debug"})
public final class HeroesViewPagerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.cometexpress.overuniverse.presentation.main.heroes.HeroesViewPagerAdapter.PagerViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.cometexpress.overuniverse.presentation.main.heroes.HeroAdapter.OnHeroItemClickListener onItemClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, ? extends java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity>> allItems;
    
    public HeroesViewPagerAdapter(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.presentation.main.heroes.HeroAdapter.OnHeroItemClickListener onItemClickListener) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.cometexpress.overuniverse.presentation.main.heroes.HeroesViewPagerAdapter.PagerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.presentation.main.heroes.HeroesViewPagerAdapter.PagerViewHolder holder, int position) {
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity>> items) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroesViewPagerAdapter$PagerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/cometexpress/overuniverse/databinding/VpItemHeroesBinding;", "(Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroesViewPagerAdapter;Lcom/cometexpress/overuniverse/databinding/VpItemHeroesBinding;)V", "bind", "", "items", "", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroEntity;", "app_debug"})
    public final class PagerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.cometexpress.overuniverse.databinding.VpItemHeroesBinding itemBinding = null;
        
        public PagerViewHolder(@org.jetbrains.annotations.NotNull()
        com.cometexpress.overuniverse.databinding.VpItemHeroesBinding itemBinding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity> items) {
        }
    }
}