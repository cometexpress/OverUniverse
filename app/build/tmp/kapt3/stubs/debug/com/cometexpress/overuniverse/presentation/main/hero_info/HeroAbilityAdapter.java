package com.cometexpress.overuniverse.presentation.main.hero_info;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0017\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u0000H\u0016J\u0014\u0010\u0014\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u0000H\u0016J\u0014\u0010\u0015\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/hero_info/HeroAbilityAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/cometexpress/overuniverse/presentation/main/hero_info/HeroAbilityAdapter$ViewHolder;", "()V", "items", "", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntityAbility;", "listener", "Lcom/cometexpress/overuniverse/presentation/main/hero_info/HeroAbilityAdapter$OnHeroAbilityListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "setList", "setOnHeroAbilityListener", "OnHeroAbilityListener", "ViewHolder", "app_debug"})
public final class HeroAbilityAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.cometexpress.overuniverse.presentation.main.hero_info.HeroAbilityAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility> items;
    @org.jetbrains.annotations.Nullable()
    private com.cometexpress.overuniverse.presentation.main.hero_info.HeroAbilityAdapter.OnHeroAbilityListener listener;
    
    public HeroAbilityAdapter() {
        super();
    }
    
    public final void setOnHeroAbilityListener(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.presentation.main.hero_info.HeroAbilityAdapter.OnHeroAbilityListener listener) {
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility> items) {
    }
    
    @java.lang.Override()
    public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.presentation.main.hero_info.HeroAbilityAdapter.ViewHolder holder) {
    }
    
    @java.lang.Override()
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.presentation.main.hero_info.HeroAbilityAdapter.ViewHolder holder) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.cometexpress.overuniverse.presentation.main.hero_info.HeroAbilityAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.presentation.main.hero_info.HeroAbilityAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/hero_info/HeroAbilityAdapter$OnHeroAbilityListener;", "", "onPlay", "", "item", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntityAbility;", "app_debug"})
    public static abstract interface OnHeroAbilityListener {
        
        public abstract void onPlay(@org.jetbrains.annotations.NotNull()
        com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility item);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\u0006\u0010\u0013\u001a\u00020\u000eJ\b\u0010\u0014\u001a\u00020\u000eH\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/hero_info/HeroAbilityAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/cometexpress/overuniverse/databinding/ItemHeroAbilityBinding;", "(Lcom/cometexpress/overuniverse/presentation/main/hero_info/HeroAbilityAdapter;Lcom/cometexpress/overuniverse/databinding/ItemHeroAbilityBinding;)V", "exoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "getExoPlayer", "()Landroidx/media3/exoplayer/ExoPlayer;", "setExoPlayer", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "bind", "", "item", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntityAbility;", "initExoPlayer", "playStatus", "releasePlayer", "stopStatus", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.cometexpress.overuniverse.databinding.ItemHeroAbilityBinding itemBinding = null;
        @org.jetbrains.annotations.Nullable()
        private androidx.lifecycle.LifecycleOwner lifecycleOwner;
        @org.jetbrains.annotations.Nullable()
        private androidx.media3.exoplayer.ExoPlayer exoPlayer;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.cometexpress.overuniverse.databinding.ItemHeroAbilityBinding itemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.media3.exoplayer.ExoPlayer getExoPlayer() {
            return null;
        }
        
        public final void setExoPlayer(@org.jetbrains.annotations.Nullable()
        androidx.media3.exoplayer.ExoPlayer p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility item) {
        }
        
        public final void releasePlayer() {
        }
        
        private final void initExoPlayer(com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility item) {
        }
        
        private final void playStatus() {
        }
        
        private final void stopStatus() {
        }
    }
}