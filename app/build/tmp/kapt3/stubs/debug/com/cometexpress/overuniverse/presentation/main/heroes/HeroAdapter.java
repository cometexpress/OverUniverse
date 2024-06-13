package com.cometexpress.overuniverse.presentation.main.heroes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0013\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroAdapter$HeroViewHolder;", "items", "", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroEntity;", "onItemClickListener", "Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroAdapter$OnHeroItemClickListener;", "(Ljava/util/List;Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroAdapter$OnHeroItemClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "HeroViewHolder", "OnHeroItemClickListener", "app_debug"})
public final class HeroAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.cometexpress.overuniverse.presentation.main.heroes.HeroAdapter.HeroViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity> items = null;
    @org.jetbrains.annotations.NotNull()
    private final com.cometexpress.overuniverse.presentation.main.heroes.HeroAdapter.OnHeroItemClickListener onItemClickListener = null;
    
    public HeroAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity> items, @org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.presentation.main.heroes.HeroAdapter.OnHeroItemClickListener onItemClickListener) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.cometexpress.overuniverse.presentation.main.heroes.HeroAdapter.HeroViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.presentation.main.heroes.HeroAdapter.HeroViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroAdapter$HeroViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/cometexpress/overuniverse/databinding/ItemHeroBinding;", "(Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroAdapter;Lcom/cometexpress/overuniverse/databinding/ItemHeroBinding;)V", "bind", "", "item", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroEntity;", "app_debug"})
    public final class HeroViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.cometexpress.overuniverse.databinding.ItemHeroBinding itemBinding = null;
        
        public HeroViewHolder(@org.jetbrains.annotations.NotNull()
        com.cometexpress.overuniverse.databinding.ItemHeroBinding itemBinding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroAdapter$OnHeroItemClickListener;", "", "heroClick", "", "thumbView", "Landroid/view/View;", "hero", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroEntity;", "app_debug"})
    public static abstract interface OnHeroItemClickListener {
        
        public abstract void heroClick(@org.jetbrains.annotations.NotNull()
        android.view.View thumbView, @org.jetbrains.annotations.NotNull()
        com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity hero);
    }
}