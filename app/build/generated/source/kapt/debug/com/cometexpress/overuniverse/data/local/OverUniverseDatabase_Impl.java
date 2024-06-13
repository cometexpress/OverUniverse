package com.cometexpress.overuniverse.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.cometexpress.overuniverse.data.local.dao.HeroDao;
import com.cometexpress.overuniverse.data.local.dao.HeroDao_Impl;
import com.cometexpress.overuniverse.data.local.dao.HeroInfoDao;
import com.cometexpress.overuniverse.data.local.dao.HeroInfoDao_Impl;
import com.cometexpress.overuniverse.data.local.dao.RoleDao;
import com.cometexpress.overuniverse.data.local.dao.RoleDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OverUniverseDatabase_Impl extends OverUniverseDatabase {
  private volatile RoleDao _roleDao;

  private volatile HeroDao _heroDao;

  private volatile HeroInfoDao _heroInfoDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `RoleEntity` (`key` TEXT NOT NULL, `description` TEXT NOT NULL, `icon` TEXT NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`key`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `HeroEntity` (`key` TEXT NOT NULL, `name` TEXT NOT NULL, `image` TEXT NOT NULL, `role` TEXT NOT NULL, PRIMARY KEY(`key`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `HeroInfoEntity` (`key` TEXT NOT NULL, `abilities` TEXT NOT NULL, `age` INTEGER NOT NULL, `birthday` TEXT NOT NULL, `description` TEXT NOT NULL, `hitpoints` TEXT NOT NULL, `location` TEXT NOT NULL, `name` TEXT NOT NULL, `portrait` TEXT NOT NULL, `role` TEXT NOT NULL, `story` TEXT NOT NULL, PRIMARY KEY(`key`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '19b58f605e88f45950f205128cf63dc6')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `RoleEntity`");
        db.execSQL("DROP TABLE IF EXISTS `HeroEntity`");
        db.execSQL("DROP TABLE IF EXISTS `HeroInfoEntity`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsRoleEntity = new HashMap<String, TableInfo.Column>(4);
        _columnsRoleEntity.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoleEntity.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoleEntity.put("icon", new TableInfo.Column("icon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoleEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRoleEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRoleEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRoleEntity = new TableInfo("RoleEntity", _columnsRoleEntity, _foreignKeysRoleEntity, _indicesRoleEntity);
        final TableInfo _existingRoleEntity = TableInfo.read(db, "RoleEntity");
        if (!_infoRoleEntity.equals(_existingRoleEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "RoleEntity(com.cometexpress.overuniverse.domain.entity.heroes.RoleEntity).\n"
                  + " Expected:\n" + _infoRoleEntity + "\n"
                  + " Found:\n" + _existingRoleEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsHeroEntity = new HashMap<String, TableInfo.Column>(4);
        _columnsHeroEntity.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeroEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeroEntity.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeroEntity.put("role", new TableInfo.Column("role", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHeroEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHeroEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHeroEntity = new TableInfo("HeroEntity", _columnsHeroEntity, _foreignKeysHeroEntity, _indicesHeroEntity);
        final TableInfo _existingHeroEntity = TableInfo.read(db, "HeroEntity");
        if (!_infoHeroEntity.equals(_existingHeroEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "HeroEntity(com.cometexpress.overuniverse.domain.entity.heroes.HeroEntity).\n"
                  + " Expected:\n" + _infoHeroEntity + "\n"
                  + " Found:\n" + _existingHeroEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsHeroInfoEntity = new HashMap<String, TableInfo.Column>(11);
        _columnsHeroInfoEntity.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeroInfoEntity.put("abilities", new TableInfo.Column("abilities", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeroInfoEntity.put("age", new TableInfo.Column("age", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeroInfoEntity.put("birthday", new TableInfo.Column("birthday", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeroInfoEntity.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeroInfoEntity.put("hitpoints", new TableInfo.Column("hitpoints", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeroInfoEntity.put("location", new TableInfo.Column("location", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeroInfoEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeroInfoEntity.put("portrait", new TableInfo.Column("portrait", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeroInfoEntity.put("role", new TableInfo.Column("role", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHeroInfoEntity.put("story", new TableInfo.Column("story", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHeroInfoEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHeroInfoEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHeroInfoEntity = new TableInfo("HeroInfoEntity", _columnsHeroInfoEntity, _foreignKeysHeroInfoEntity, _indicesHeroInfoEntity);
        final TableInfo _existingHeroInfoEntity = TableInfo.read(db, "HeroInfoEntity");
        if (!_infoHeroInfoEntity.equals(_existingHeroInfoEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "HeroInfoEntity(com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity).\n"
                  + " Expected:\n" + _infoHeroInfoEntity + "\n"
                  + " Found:\n" + _existingHeroInfoEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "19b58f605e88f45950f205128cf63dc6", "fdc95f6574403cabc333d44fcf173efe");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "RoleEntity","HeroEntity","HeroInfoEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `RoleEntity`");
      _db.execSQL("DELETE FROM `HeroEntity`");
      _db.execSQL("DELETE FROM `HeroInfoEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(RoleDao.class, RoleDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(HeroDao.class, HeroDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(HeroInfoDao.class, HeroInfoDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public RoleDao roleDao() {
    if (_roleDao != null) {
      return _roleDao;
    } else {
      synchronized(this) {
        if(_roleDao == null) {
          _roleDao = new RoleDao_Impl(this);
        }
        return _roleDao;
      }
    }
  }

  @Override
  public HeroDao heroDao() {
    if (_heroDao != null) {
      return _heroDao;
    } else {
      synchronized(this) {
        if(_heroDao == null) {
          _heroDao = new HeroDao_Impl(this);
        }
        return _heroDao;
      }
    }
  }

  @Override
  public HeroInfoDao heroInfoDao() {
    if (_heroInfoDao != null) {
      return _heroInfoDao;
    } else {
      synchronized(this) {
        if(_heroInfoDao == null) {
          _heroInfoDao = new HeroInfoDao_Impl(this);
        }
        return _heroInfoDao;
      }
    }
  }
}
