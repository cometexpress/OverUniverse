package com.cometexpress.overuniverse.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/cometexpress/overuniverse/data/local/dao/RoleDao;", "", "getAll", "Lio/reactivex/Flowable;", "", "Lcom/cometexpress/overuniverse/domain/entity/heroes/RoleEntity;", "insertRoleList", "", "list", "loadAllByRole", "role", "", "app_debug"})
@androidx.room.Dao()
public abstract interface RoleDao {
    
    @androidx.room.Query(value = "SELECT * FROM RoleEntity")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.RoleEntity>> getAll();
    
    @androidx.room.Query(value = "SELECT * FROM RoleEntity WHERE `key` IN (:role)")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.RoleEntity>> loadAllByRole(@org.jetbrains.annotations.NotNull()
    java.lang.String role);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertRoleList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.cometexpress.overuniverse.domain.entity.heroes.RoleEntity> list);
}