package com.cometexpress.overuniverse.presentation.main.heroes;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroesFragment;", "Lcom/cometexpress/overuniverse/common/base/BaseFragment;", "Lcom/cometexpress/overuniverse/databinding/FragmentHeroesBinding;", "()V", "allHeroes", "", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroEntity;", "tabMenus", "", "viewPagerAdapter", "Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroesViewPagerAdapter;", "getViewPagerAdapter", "()Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroesViewPagerAdapter;", "viewPagerAdapter$delegate", "Lkotlin/Lazy;", "vm", "Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroesVM;", "getVm", "()Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroesVM;", "vm$delegate", "bind", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setViewPager", "Companion", "app_debug"})
public final class HeroesFragment extends com.cometexpress.overuniverse.common.base.BaseFragment<com.cometexpress.overuniverse.databinding.FragmentHeroesBinding> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy vm$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewPagerAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> tabMenus;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity> allHeroes;
    @org.jetbrains.annotations.NotNull()
    public static final com.cometexpress.overuniverse.presentation.main.heroes.HeroesFragment.Companion Companion = null;
    
    public HeroesFragment() {
        super(null);
    }
    
    private final com.cometexpress.overuniverse.presentation.main.heroes.HeroesVM getVm() {
        return null;
    }
    
    private final com.cometexpress.overuniverse.presentation.main.heroes.HeroesViewPagerAdapter getViewPagerAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setViewPager() {
    }
    
    private final void bind() {
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final com.cometexpress.overuniverse.presentation.main.heroes.HeroesFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroesFragment$Companion;", "", "()V", "newInstance", "Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroesFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final com.cometexpress.overuniverse.presentation.main.heroes.HeroesFragment newInstance() {
            return null;
        }
    }
}