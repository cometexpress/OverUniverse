package com.cometexpress.overuniverse.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/cometexpress/overuniverse/data/local/dao/HeroInfoDao;", "", "insertHeroInfo", "", "entity", "Lcom/cometexpress/overuniverse/domain/entity/heroes/HeroInfoEntity;", "loadByHeroKey", "Lio/reactivex/Flowable;", "heroKey", "", "app_debug"})
@androidx.room.Dao()
public abstract interface HeroInfoDao {
    
    @androidx.room.Query(value = "SELECT * FROM HeroInfoEntity WHERE `key` = :heroKey")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity> loadByHeroKey(@org.jetbrains.annotations.NotNull()
    java.lang.String heroKey);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertHeroInfo(@org.jetbrains.annotations.NotNull()
    com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity entity);
}