package com.cometexpress.overuniverse.data.repository_impl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J(\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u000f0\r0\f2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J \u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0013\u0012\u0004\u0012\u00020\u000f0\r0\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/cometexpress/overuniverse/data/repository_impl/HeroesRepositoryImpl;", "Lcom/cometexpress/overuniverse/domain/repository/HeroesRepository;", "apiService", "Lcom/cometexpress/overuniverse/data/remote/network/api/HeroesService;", "roleDao", "Lcom/cometexpress/overuniverse/data/local/dao/RoleDao;", "heroDao", "Lcom/cometexpress/overuniverse/data/local/dao/HeroDao;", "heroInfoDao", "Lcom/cometexpress/overuniverse/data/local/dao/HeroInfoDao;", "(Lcom/cometexpress/overuniverse/data/remote/network/api/HeroesService;Lcom/cometexpress/overuniverse/data/local/dao/RoleDao;Lcom/cometexpress/overuniverse/data/local/dao/HeroDao;Lcom/cometexpress/overuniverse/data/local/dao/HeroInfoDao;)V", "getHeroInfo", "Lio/reactivex/Single;", "Lcom/cometexpress/overuniverse/common/api/APIResult;", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntity;", "Lcom/cometexpress/overuniverse/data/ErrorModel;", "heroKey", "", "getHeroes", "", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroEntity;", "role", "getRoles", "Lcom/cometexpress/overuniverse/domain/entity/heroes/RoleEntity;", "app_debug"})
public final class HeroesRepositoryImpl implements com.cometexpress.overuniverse.domain.repository.HeroesRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.cometexpress.overuniverse.data.remote.network.api.HeroesService apiService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.cometexpress.overuniverse.data.local.dao.RoleDao roleDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.cometexpress.overuniverse.data.local.dao.HeroDao heroDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.cometexpress.overuniverse.data.local.dao.HeroInfoDao heroInfoDao = null;
    
    @javax.inject.Inject()
    public HeroesRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.data.remote.network.api.HeroesService apiService, @org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.data.local.dao.RoleDao roleDao, @org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.data.local.dao.HeroDao heroDao, @org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.data.local.dao.HeroInfoDao heroInfoDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.cometexpress.overuniverse.common.api.APIResult<java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.RoleEntity>, com.cometexpress.overuniverse.data.ErrorModel>> getRoles() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.cometexpress.overuniverse.common.api.APIResult<java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity>, com.cometexpress.overuniverse.data.ErrorModel>> getHeroes(@org.jetbrains.annotations.NotNull()
    java.lang.String role) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.cometexpress.overuniverse.common.api.APIResult<com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity, com.cometexpress.overuniverse.data.ErrorModel>> getHeroInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String heroKey) {
        return null;
    }
}