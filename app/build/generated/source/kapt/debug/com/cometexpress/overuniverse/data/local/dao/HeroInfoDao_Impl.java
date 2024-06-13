package com.cometexpress.overuniverse.data.local.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.cometexpress.overuniverse.data.local.typeconverter.HeroInfoAbilityTypeConverter;
import com.cometexpress.overuniverse.data.local.typeconverter.HeroInfoHitpointsTypeConverter;
import com.cometexpress.overuniverse.data.local.typeconverter.HeroInfoStoryTypeConverter;
import com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntity;
import com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityAbility;
import com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityHitpoints;
import com.cometexpress.overuniverse.domain.entity.heroes.HeroInfoEntityStory;
import io.reactivex.Flowable;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HeroInfoDao_Impl implements HeroInfoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HeroInfoEntity> __insertionAdapterOfHeroInfoEntity;

  private final HeroInfoAbilityTypeConverter __heroInfoAbilityTypeConverter = new HeroInfoAbilityTypeConverter();

  private final HeroInfoHitpointsTypeConverter __heroInfoHitpointsTypeConverter = new HeroInfoHitpointsTypeConverter();

  private final HeroInfoStoryTypeConverter __heroInfoStoryTypeConverter = new HeroInfoStoryTypeConverter();

  public HeroInfoDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHeroInfoEntity = new EntityInsertionAdapter<HeroInfoEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `HeroInfoEntity` (`key`,`abilities`,`age`,`birthday`,`description`,`hitpoints`,`location`,`name`,`portrait`,`role`,`story`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final HeroInfoEntity entity) {
        if (entity.getKey() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getKey());
        }
        final String _tmp = __heroInfoAbilityTypeConverter.fromAbilities(entity.getAbilities());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, _tmp);
        }
        statement.bindLong(3, entity.getAge());
        if (entity.getBirthday() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getBirthday());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getDescription());
        }
        final String _tmp_1 = __heroInfoHitpointsTypeConverter.fromHitpoints(entity.getHitpoints());
        if (_tmp_1 == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, _tmp_1);
        }
        if (entity.getLocation() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getLocation());
        }
        if (entity.getName() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getName());
        }
        if (entity.getPortrait() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getPortrait());
        }
        if (entity.getRole() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getRole());
        }
        final String _tmp_2 = __heroInfoStoryTypeConverter.fromStory(entity.getStory());
        if (_tmp_2 == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, _tmp_2);
        }
      }
    };
  }

  @Override
  public void insertHeroInfo(final HeroInfoEntity entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHeroInfoEntity.insert(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flowable<HeroInfoEntity> loadByHeroKey(final String heroKey) {
    final String _sql = "SELECT * FROM HeroInfoEntity WHERE `key` = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (heroKey == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, heroKey);
    }
    return RxRoom.createFlowable(__db, false, new String[] {"HeroInfoEntity"}, new Callable<HeroInfoEntity>() {
      @Override
      @NonNull
      public HeroInfoEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
          final int _cursorIndexOfAbilities = CursorUtil.getColumnIndexOrThrow(_cursor, "abilities");
          final int _cursorIndexOfAge = CursorUtil.getColumnIndexOrThrow(_cursor, "age");
          final int _cursorIndexOfBirthday = CursorUtil.getColumnIndexOrThrow(_cursor, "birthday");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfHitpoints = CursorUtil.getColumnIndexOrThrow(_cursor, "hitpoints");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPortrait = CursorUtil.getColumnIndexOrThrow(_cursor, "portrait");
          final int _cursorIndexOfRole = CursorUtil.getColumnIndexOrThrow(_cursor, "role");
          final int _cursorIndexOfStory = CursorUtil.getColumnIndexOrThrow(_cursor, "story");
          final HeroInfoEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpKey;
            if (_cursor.isNull(_cursorIndexOfKey)) {
              _tmpKey = null;
            } else {
              _tmpKey = _cursor.getString(_cursorIndexOfKey);
            }
            final List<HeroInfoEntityAbility> _tmpAbilities;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfAbilities)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfAbilities);
            }
            _tmpAbilities = __heroInfoAbilityTypeConverter.toAbilities(_tmp);
            final int _tmpAge;
            _tmpAge = _cursor.getInt(_cursorIndexOfAge);
            final String _tmpBirthday;
            if (_cursor.isNull(_cursorIndexOfBirthday)) {
              _tmpBirthday = null;
            } else {
              _tmpBirthday = _cursor.getString(_cursorIndexOfBirthday);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final HeroInfoEntityHitpoints _tmpHitpoints;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfHitpoints)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfHitpoints);
            }
            _tmpHitpoints = __heroInfoHitpointsTypeConverter.toHitpoints(_tmp_1);
            final String _tmpLocation;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmpLocation = null;
            } else {
              _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpPortrait;
            if (_cursor.isNull(_cursorIndexOfPortrait)) {
              _tmpPortrait = null;
            } else {
              _tmpPortrait = _cursor.getString(_cursorIndexOfPortrait);
            }
            final String _tmpRole;
            if (_cursor.isNull(_cursorIndexOfRole)) {
              _tmpRole = null;
            } else {
              _tmpRole = _cursor.getString(_cursorIndexOfRole);
            }
            final HeroInfoEntityStory _tmpStory;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfStory)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfStory);
            }
            _tmpStory = __heroInfoStoryTypeConverter.toStory(_tmp_2);
            _result = new HeroInfoEntity(_tmpKey,_tmpAbilities,_tmpAge,_tmpBirthday,_tmpDescription,_tmpHitpoints,_tmpLocation,_tmpName,_tmpPortrait,_tmpRole,_tmpStory);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
