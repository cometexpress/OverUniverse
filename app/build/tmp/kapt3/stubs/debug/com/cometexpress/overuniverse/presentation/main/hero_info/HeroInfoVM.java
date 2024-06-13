package com.cometexpress.overuniverse.presentation.main.hero_info;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012J\b\u0010\u0016\u001a\u00020\u0014H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/hero_info/HeroInfoVM;", "Landroidx/lifecycle/ViewModel;", "heroesRepository", "Lcom/cometexpress/overuniverse/domain/repository/HeroesRepository;", "(Lcom/cometexpress/overuniverse/domain/repository/HeroesRepository;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "heroInfo", "Lio/reactivex/subjects/PublishSubject;", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntity;", "getHeroInfo", "()Lio/reactivex/subjects/PublishSubject;", "isLoading", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "()Lio/reactivex/subjects/BehaviorSubject;", "toastMessage", "", "getToastMessage", "", "key", "onCleared", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HeroInfoVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.cometexpress.overuniverse.domain.repository.HeroesRepository heroesRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity> heroInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<java.lang.String> toastMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> isLoading = null;
    
    @javax.inject.Inject()
    public HeroInfoVM(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.domain.repository.HeroesRepository heroesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity> getHeroInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<java.lang.String> getToastMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void getHeroInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}