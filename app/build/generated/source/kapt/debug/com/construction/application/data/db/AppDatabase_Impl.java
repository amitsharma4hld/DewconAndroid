package com.construction.application.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.construction.application.data.db.dao.ReportDao;
import com.construction.application.data.db.dao.ReportDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ReportDao _reportDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PoliceBackupEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `crew_leader` TEXT NOT NULL, `date` TEXT NOT NULL, `work_address` TEXT NOT NULL, `work_order_number` TEXT NOT NULL, `officer_name` TEXT NOT NULL, `police_department` TEXT NOT NULL, `hours_worked` TEXT NOT NULL, `is_car_used` TEXT NOT NULL, `image` BLOB, `police_sheet_img_two` BLOB, `police_sheet_img_three` BLOB, `delivery_status` INTEGER NOT NULL, `registration_id` TEXT NOT NULL, `synced` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '24ec7e79185cb809c0cc50181026ac27')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `PoliceBackupEntity`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPoliceBackupEntity = new HashMap<String, TableInfo.Column>(15);
        _columnsPoliceBackupEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPoliceBackupEntity.put("crew_leader", new TableInfo.Column("crew_leader", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPoliceBackupEntity.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPoliceBackupEntity.put("work_address", new TableInfo.Column("work_address", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPoliceBackupEntity.put("work_order_number", new TableInfo.Column("work_order_number", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPoliceBackupEntity.put("officer_name", new TableInfo.Column("officer_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPoliceBackupEntity.put("police_department", new TableInfo.Column("police_department", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPoliceBackupEntity.put("hours_worked", new TableInfo.Column("hours_worked", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPoliceBackupEntity.put("is_car_used", new TableInfo.Column("is_car_used", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPoliceBackupEntity.put("image", new TableInfo.Column("image", "BLOB", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPoliceBackupEntity.put("police_sheet_img_two", new TableInfo.Column("police_sheet_img_two", "BLOB", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPoliceBackupEntity.put("police_sheet_img_three", new TableInfo.Column("police_sheet_img_three", "BLOB", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPoliceBackupEntity.put("delivery_status", new TableInfo.Column("delivery_status", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPoliceBackupEntity.put("registration_id", new TableInfo.Column("registration_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPoliceBackupEntity.put("synced", new TableInfo.Column("synced", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPoliceBackupEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPoliceBackupEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPoliceBackupEntity = new TableInfo("PoliceBackupEntity", _columnsPoliceBackupEntity, _foreignKeysPoliceBackupEntity, _indicesPoliceBackupEntity);
        final TableInfo _existingPoliceBackupEntity = TableInfo.read(_db, "PoliceBackupEntity");
        if (! _infoPoliceBackupEntity.equals(_existingPoliceBackupEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "PoliceBackupEntity(com.construction.application.data.db.entities.PoliceBackupEntity).\n"
                  + " Expected:\n" + _infoPoliceBackupEntity + "\n"
                  + " Found:\n" + _existingPoliceBackupEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "24ec7e79185cb809c0cc50181026ac27", "85af05c33fa7c429d1f3f500ea4ede60");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "PoliceBackupEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `PoliceBackupEntity`");
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
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ReportDao.class, ReportDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public ReportDao getReportDao() {
    if (_reportDao != null) {
      return _reportDao;
    } else {
      synchronized(this) {
        if(_reportDao == null) {
          _reportDao = new ReportDao_Impl(this);
        }
        return _reportDao;
      }
    }
  }
}
