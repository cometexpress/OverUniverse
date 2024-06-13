package com.cometexpress.overuniverse.presentation.main.hero_info;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\u0005H\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u001c\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/hero_info/TotalHeroHPAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/cometexpress/overuniverse/presentation/main/hero_info/TotalHeroHPAdapter$ViewHolder;", "()V", "itemWidth", "", "items", "", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroHPEntity;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setList", "ViewHolder", "app_debug"})
public final class TotalHeroHPAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.cometexpress.overuniverse.presentation.main.hero_info.TotalHeroHPAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroHPEntity> items;
    private int itemWidth = 0;
    
    public TotalHeroHPAdapter() {
        super();
    }
    
    public final void setList(int itemWidth, @org.jetbrains.annotations.NotNull()
    java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroHPEntity> items) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.cometexpress.overuniverse.presentation.main.hero_info.TotalHeroHPAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.presentation.main.hero_info.TotalHeroHPAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/hero_info/TotalHeroHPAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/cometexpress/overuniverse/databinding/ItemHpBinding;", "(Lcom/cometexpress/overuniverse/presentation/main/hero_info/TotalHeroHPAdapter;Lcom/cometexpress/overuniverse/databinding/ItemHpBinding;)V", "bind", "", "item", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroHPEntity;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.cometexpress.overuniverse.databinding.ItemHpBinding itemBinding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.cometexpress.overuniverse.databinding.ItemHpBinding itemBinding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.cometexpress.overuniverse.domain.entity.heroes.HeroHPEntity item) {
        }
    }
}