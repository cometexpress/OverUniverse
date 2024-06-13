package com.cometexpress.overuniverse.data.local.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/cometexpress/overuniverse/data/local/di/DatabaseModule;", "", "()V", "provideAppDatabase", "Lcom/cometexpress/overuniverse/data/local/OverUniverseDatabase;", "application", "Landroid/app/Application;", "provideGson", "Lcom/google/gson/Gson;", "provideHeroDao", "Lcom/cometexpress/overuniverse/data/local/dao/HeroDao;", "appDatabase", "provideHeroInfoDao", "Lcom/cometexpress/overuniverse/data/local/dao/HeroInfoDao;", "provideRoleDao", "Lcom/cometexpress/overuniverse/data/local/dao/RoleDao;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.cometexpress.overuniverse.data.local.di.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.cometexpress.overuniverse.data.local.OverUniverseDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.cometexpress.overuniverse.data.local.dao.RoleDao provideRoleDao(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.data.local.OverUniverseDatabase appDatabase) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.cometexpress.overuniverse.data.local.dao.HeroDao provideHeroDao(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.data.local.OverUniverseDatabase appDatabase) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.cometexpress.overuniverse.data.local.dao.HeroInfoDao provideHeroInfoDao(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.data.local.OverUniverseDatabase appDatabase) {
        return null;
    }
}