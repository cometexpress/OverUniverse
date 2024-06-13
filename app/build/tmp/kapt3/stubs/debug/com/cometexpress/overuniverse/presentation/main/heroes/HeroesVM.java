package com.cometexpress.overuniverse.presentation.main.heroes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0002J(\u0010\u001d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0004\u0012\u00020\u00070\u001f0\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0002J\b\u0010\u0017\u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001cH\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015\u00a8\u0006\""}, d2 = {"Lcom/cometexpress/overuniverse/presentation/main/heroes/HeroesVM;", "Landroidx/lifecycle/ViewModel;", "heroesRepository", "Lcom/cometexpress/overuniverse/domain/repository/HeroesRepository;", "(Lcom/cometexpress/overuniverse/domain/repository/HeroesRepository;)V", "_arrError", "", "Lcom/cometexpress/overuniverse/data/ErrorModel;", "_roles", "", "Lcom/cometexpress/overuniverse/domain/entity/heroes/RoleEntity;", "allHeroes", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroEntity;", "getAllHeroes", "()Lio/reactivex/subjects/BehaviorSubject;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isLoading", "Lio/reactivex/subjects/PublishSubject;", "", "()Lio/reactivex/subjects/PublishSubject;", "roles", "getRoles", "toastMessage", "", "getToastMessage", "getAllData", "", "getHeroes", "Lio/reactivex/Observable;", "Lcom/cometexpress/overuniverse/common/api/APIResult;", "role", "onCleared", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HeroesVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.cometexpress.overuniverse.domain.repository.HeroesRepository heroesRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.RoleEntity> _roles;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.RoleEntity>> roles = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity>> allHeroes = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<java.lang.String> toastMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.cometexpress.overuniverse.data.ErrorModel> _arrError = null;
    
    @javax.inject.Inject()
    public HeroesVM(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.domain.repository.HeroesRepository heroesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.RoleEntity>> getRoles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity>> getAllHeroes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<java.lang.String> getToastMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<java.lang.Boolean> isLoading() {
        return null;
    }
    
    private final void getAllData() {
    }
    
    private final io.reactivex.Observable<com.cometexpress.overuniverse.common.api.APIResult<java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity>, com.cometexpress.overuniverse.data.ErrorModel>> getHeroes(java.lang.String role) {
        return null;
    }
    
    private final void getRoles() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}