package com.cometexpress.overuniverse.data.remote.network.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J$\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\'J\u001a\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u00040\u0003H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/cometexpress/overuniverse/data/remote/network/api/HeroesService;", "", "getHeroInfo", "Lio/reactivex/Single;", "Lretrofit2/Response;", "Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroInfoDTO;", "heroKey", "", "getHeroes", "", "Lcom/cometexpress/overuniverse/data/remote/dto/heroes/HeroDTO;", "role", "getRoles", "Lcom/cometexpress/overuniverse/data/remote/dto/heroes/RoleDTO;", "app_debug"})
public abstract interface HeroesService {
    
    @retrofit2.http.GET(value = "roles")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<retrofit2.Response<java.util.List<com.cometexpress.overuniverse.data.remote.dto.heroes.RoleDTO>>> getRoles();
    
    @retrofit2.http.GET(value = "heroes")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<retrofit2.Response<java.util.List<com.cometexpress.overuniverse.data.remote.dto.heroes.HeroDTO>>> getHeroes(@retrofit2.http.Query(value = "role")
    @org.jetbrains.annotations.NotNull()
    java.lang.String role);
    
    @retrofit2.http.GET(value = "heroes/{heroKey}")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<retrofit2.Response<com.cometexpress.overuniverse.data.remote.dto.heroes.HeroInfoDTO>> getHeroInfo(@retrofit2.http.Path(value = "heroKey")
    @org.jetbrains.annotations.NotNull()
    java.lang.String heroKey);
}