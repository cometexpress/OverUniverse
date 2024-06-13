package com.cometexpress.overuniverse.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/cometexpress/overuniverse/data/local/OverUniverseDatabase;", "Landroidx/room/RoomDatabase;", "()V", "heroDao", "Lcom/cometexpress/overuniverse/data/local/dao/HeroDao;", "heroInfoDao", "Lcom/cometexpress/overuniverse/data/local/dao/HeroInfoDao;", "roleDao", "Lcom/cometexpress/overuniverse/data/local/dao/RoleDao;", "app_debug"})
@androidx.room.Database(entities = {com.cometexpress.overuniverse.domain.entity.heroes.RoleEntity.class, com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity.class, com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity.class}, version = 1)
@androidx.room.TypeConverters(value = {com.cometexpress.overuniverse.data.local.typeconverter.HeroInfoHitpointsTypeConverter.class, com.cometexpress.overuniverse.data.local.typeconverter.HeroInfoAbilityTypeConverter.class, com.cometexpress.overuniverse.data.local.typeconverter.HeroInfoStoryTypeConverter.class, com.cometexpress.overuniverse.data.local.typeconverter.HeroInfoMediaTypeConverter.class, com.cometexpress.overuniverse.data.local.typeconverter.HeroInfoChapterTypeConverter.class})
public abstract class OverUniverseDatabase extends androidx.room.RoomDatabase {
    
    public OverUniverseDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.cometexpress.overuniverse.data.local.dao.RoleDao roleDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.cometexpress.overuniverse.data.local.dao.HeroDao heroDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.cometexpress.overuniverse.data.local.dao.HeroInfoDao heroInfoDao();
}