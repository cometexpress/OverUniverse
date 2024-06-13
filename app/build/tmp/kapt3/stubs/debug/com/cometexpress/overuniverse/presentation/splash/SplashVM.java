package com.cometexpress.overuniverse.presentation.splash;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/cometexpress/overuniverse/presentation/splash/SplashVM;", "Landroidx/lifecycle/ViewModel;", "heroesRepository", "Lcom/cometexpress/overuniverse/domain/repository/HeroesRepository;", "(Lcom/cometexpress/overuniverse/domain/repository/HeroesRepository;)V", "completeRoles", "Lio/reactivex/subjects/CompletableSubject;", "getCompleteRoles", "()Lio/reactivex/subjects/CompletableSubject;", "setCompleteRoles", "(Lio/reactivex/subjects/CompletableSubject;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isLoading", "Lio/reactivex/subjects/PublishSubject;", "", "()Lio/reactivex/subjects/PublishSubject;", "setLoading", "(Lio/reactivex/subjects/PublishSubject;)V", "toastMessage", "", "getToastMessage", "setToastMessage", "getRoles", "", "onCleared", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SplashVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.cometexpress.overuniverse.domain.repository.HeroesRepository heroesRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.subjects.CompletableSubject completeRoles;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.subjects.PublishSubject<java.lang.Boolean> isLoading;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.subjects.PublishSubject<java.lang.String> toastMessage;
    
    @javax.inject.Inject()
    public SplashVM(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.domain.repository.HeroesRepository heroesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.CompletableSubject getCompleteRoles() {
        return null;
    }
    
    public final void setCompleteRoles(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.CompletableSubject p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.PublishSubject<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<java.lang.String> getToastMessage() {
        return null;
    }
    
    public final void setToastMessage(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.PublishSubject<java.lang.String> p0) {
    }
    
    private final void getRoles() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}