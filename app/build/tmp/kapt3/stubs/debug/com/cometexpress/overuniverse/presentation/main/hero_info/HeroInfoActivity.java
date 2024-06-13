package com.cometexpress.overuniverse.presentation.main.hero_info;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0012\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\'"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/hero_info/HeroInfoActivity;", "Lcom/cometexpress/overuniverse/common/base/BaseActivity;", "Lcom/cometexpress/overuniverse/databinding/ActivityHeroInfoBinding;", "Landroid/view/View$OnClickListener;", "()V", "abilities", "", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntityAbility;", "containerWidth", "", "heroAbilityAdapter", "Lcom/cometexpress/overuniverse/presentation/main/hero_info/HeroAbilityAdapter;", "getHeroAbilityAdapter", "()Lcom/cometexpress/overuniverse/presentation/main/hero_info/HeroAbilityAdapter;", "heroAbilityAdapter$delegate", "Lkotlin/Lazy;", "hpAdapter", "Lcom/cometexpress/overuniverse/presentation/main/hero_info/TotalHeroHPAdapter;", "getHpAdapter", "()Lcom/cometexpress/overuniverse/presentation/main/hero_info/TotalHeroHPAdapter;", "hpAdapter$delegate", "vm", "Lcom/cometexpress/overuniverse/presentation/main/hero_info/HeroInfoVM;", "getVm", "()Lcom/cometexpress/overuniverse/presentation/main/hero_info/HeroInfoVM;", "vm$delegate", "bind", "", "init", "onClick", "p0", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setData", "heroInfo", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntity;", "Companion", "app_debug"})
public final class HeroInfoActivity extends com.cometexpress.overuniverse.common.base.BaseActivity<com.cometexpress.overuniverse.databinding.ActivityHeroInfoBinding> implements android.view.View.OnClickListener {
    public static final long DELAY = 200L;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy vm$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy hpAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy heroAbilityAdapter$delegate = null;
    private int containerWidth = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility> abilities;
    @org.jetbrains.annotations.NotNull()
    public static final com.cometexpress.overuniverse.presentation.main.hero_info.HeroInfoActivity.Companion Companion = null;
    
    public HeroInfoActivity() {
        super(null);
    }
    
    private final com.cometexpress.overuniverse.presentation.main.hero_info.HeroInfoVM getVm() {
        return null;
    }
    
    private final com.cometexpress.overuniverse.presentation.main.hero_info.TotalHeroHPAdapter getHpAdapter() {
        return null;
    }
    
    private final com.cometexpress.overuniverse.presentation.main.hero_info.HeroAbilityAdapter getHeroAbilityAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void bind() {
    }
    
    private final void setData(com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity heroInfo) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/hero_info/HeroInfoActivity$Companion;", "", "()V", "DELAY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}