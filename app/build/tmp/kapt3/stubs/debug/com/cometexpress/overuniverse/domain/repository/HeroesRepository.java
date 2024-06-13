package com.cometexpress.overuniverse.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&J(\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0006\u0010\f\u001a\u00020\bH&J \u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\u0004\u0012\u00020\u00060\u00040\u0003H&\u00a8\u0006\u000f"}, d2 = {"Lcom/cometexpress/overuniverse/domain/repository/HeroesRepository;", "", "getHeroInfo", "Lio/reactivex/Single;", "Lcom/cometexpress/overuniverse/common/api/APIResult;", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntity;", "Lcom/cometexpress/overuniverse/data/ErrorModel;", "heroKey", "", "getHeroes", "", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroEntity;", "role", "getRoles", "Lcom/cometexpress/overuniverse/domain/entity/heroes/RoleEntity;", "app_debug"})
public abstract interface HeroesRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.cometexpress.overuniverse.common.api.APIResult<java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.RoleEntity>, com.cometexpress.overuniverse.data.ErrorModel>> getRoles();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.cometexpress.overuniverse.common.api.APIResult<java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity>, com.cometexpress.overuniverse.data.ErrorModel>> getHeroes(@org.jetbrains.annotations.NotNull()
    java.lang.String role);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.cometexpress.overuniverse.common.api.APIResult<com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity, com.cometexpress.overuniverse.data.ErrorModel>> getHeroInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String heroKey);
}