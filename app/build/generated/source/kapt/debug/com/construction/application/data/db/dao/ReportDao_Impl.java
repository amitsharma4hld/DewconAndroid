package com.construction.application.data.db.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.construction.application.data.db.entities.PoliceBackupEntity;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ReportDao_Impl implements ReportDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PoliceBackupEntity> __insertionAdapterOfPoliceBackupEntity;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSyncStatus;

  public ReportDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPoliceBackupEntity = new EntityInsertionAdapter<PoliceBackupEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `PoliceBackupEntity` (`id`,`crew_leader`,`date`,`work_address`,`work_order_number`,`officer_name`,`police_department`,`hours_worked`,`is_car_used`,`image`,`police_sheet_img_two`,`police_sheet_img_three`,`delivery_status`,`registration_id`,`synced`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PoliceBackupEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getCrew_leader() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCrew_leader());
        }
        if (value.getDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDate());
        }
        if (value.getWork_address() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getWork_address());
        }
        if (value.getWork_order_number() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getWork_order_number());
        }
        if (value.getOfficer_name() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOfficer_name());
        }
        if (value.getPolice_department() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPolice_department());
        }
        if (value.getHours_worked() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getHours_worked());
        }
        if (value.is_car_used() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.is_car_used());
        }
        if (value.getPolice_sheet_img_one() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindBlob(10, value.getPolice_sheet_img_one());
        }
        if (value.getPolice_sheet_img_two() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindBlob(11, value.getPolice_sheet_img_two());
        }
        if (value.getPolice_sheet_img_three() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindBlob(12, value.getPolice_sheet_img_three());
        }
        stmt.bindLong(13, value.getDelivery_status());
        if (value.getRegistration_id() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getRegistration_id());
        }
        final Integer _tmp;
        _tmp = value.getSynced() == null ? null : (value.getSynced() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindLong(15, _tmp);
        }
      }
    };
    this.__preparedStmtOfUpdateSyncStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE PoliceBackupEntity SET synced=? WHERE registration_id=?";
        return _query;
      }
    };
  }

  @Override
  public Object insertPoliceBackupToRoomDb(final PoliceBackupEntity policeBackupEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPoliceBackupEntity.insert(policeBackupEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateSyncStatus(final boolean isSynced, final String localId,
      final Continuation<? super Unit> p2) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSyncStatus.acquire();
        int _argIndex = 1;
        final int _tmp;
        _tmp = isSynced ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        if (localId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, localId);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateSyncStatus.release(_stmt);
        }
      }
    }, p2);
  }

  @Override
  public Object getPoliceBackupOfflineData(final boolean isSync,
      final Continuation<? super List<PoliceBackupEntity>> p1) {
    final String _sql = "SELECT *  FROM PoliceBackupEntity  WHERE synced=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = isSync ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<PoliceBackupEntity>>() {
      @Override
      public List<PoliceBackupEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCrewLeader = CursorUtil.getColumnIndexOrThrow(_cursor, "crew_leader");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfWorkAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "work_address");
          final int _cursorIndexOfWorkOrderNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "work_order_number");
          final int _cursorIndexOfOfficerName = CursorUtil.getColumnIndexOrThrow(_cursor, "officer_name");
          final int _cursorIndexOfPoliceDepartment = CursorUtil.getColumnIndexOrThrow(_cursor, "police_department");
          final int _cursorIndexOfHoursWorked = CursorUtil.getColumnIndexOrThrow(_cursor, "hours_worked");
          final int _cursorIndexOfIsCarUsed = CursorUtil.getColumnIndexOrThrow(_cursor, "is_car_used");
          final int _cursorIndexOfPoliceSheetImgOne = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfPoliceSheetImgTwo = CursorUtil.getColumnIndexOrThrow(_cursor, "police_sheet_img_two");
          final int _cursorIndexOfPoliceSheetImgThree = CursorUtil.getColumnIndexOrThrow(_cursor, "police_sheet_img_three");
          final int _cursorIndexOfDeliveryStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "delivery_status");
          final int _cursorIndexOfRegistrationId = CursorUtil.getColumnIndexOrThrow(_cursor, "registration_id");
          final int _cursorIndexOfSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "synced");
          final List<PoliceBackupEntity> _result = new ArrayList<PoliceBackupEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PoliceBackupEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpCrew_leader;
            if (_cursor.isNull(_cursorIndexOfCrewLeader)) {
              _tmpCrew_leader = null;
            } else {
              _tmpCrew_leader = _cursor.getString(_cursorIndexOfCrewLeader);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpWork_address;
            if (_cursor.isNull(_cursorIndexOfWorkAddress)) {
              _tmpWork_address = null;
            } else {
              _tmpWork_address = _cursor.getString(_cursorIndexOfWorkAddress);
            }
            final String _tmpWork_order_number;
            if (_cursor.isNull(_cursorIndexOfWorkOrderNumber)) {
              _tmpWork_order_number = null;
            } else {
              _tmpWork_order_number = _cursor.getString(_cursorIndexOfWorkOrderNumber);
            }
            final String _tmpOfficer_name;
            if (_cursor.isNull(_cursorIndexOfOfficerName)) {
              _tmpOfficer_name = null;
            } else {
              _tmpOfficer_name = _cursor.getString(_cursorIndexOfOfficerName);
            }
            final String _tmpPolice_department;
            if (_cursor.isNull(_cursorIndexOfPoliceDepartment)) {
              _tmpPolice_department = null;
            } else {
              _tmpPolice_department = _cursor.getString(_cursorIndexOfPoliceDepartment);
            }
            final String _tmpHours_worked;
            if (_cursor.isNull(_cursorIndexOfHoursWorked)) {
              _tmpHours_worked = null;
            } else {
              _tmpHours_worked = _cursor.getString(_cursorIndexOfHoursWorked);
            }
            final String _tmpIs_car_used;
            if (_cursor.isNull(_cursorIndexOfIsCarUsed)) {
              _tmpIs_car_used = null;
            } else {
              _tmpIs_car_used = _cursor.getString(_cursorIndexOfIsCarUsed);
            }
            final byte[] _tmpPolice_sheet_img_one;
            if (_cursor.isNull(_cursorIndexOfPoliceSheetImgOne)) {
              _tmpPolice_sheet_img_one = null;
            } else {
              _tmpPolice_sheet_img_one = _cursor.getBlob(_cursorIndexOfPoliceSheetImgOne);
            }
            final byte[] _tmpPolice_sheet_img_two;
            if (_cursor.isNull(_cursorIndexOfPoliceSheetImgTwo)) {
              _tmpPolice_sheet_img_two = null;
            } else {
              _tmpPolice_sheet_img_two = _cursor.getBlob(_cursorIndexOfPoliceSheetImgTwo);
            }
            final byte[] _tmpPolice_sheet_img_three;
            if (_cursor.isNull(_cursorIndexOfPoliceSheetImgThree)) {
              _tmpPolice_sheet_img_three = null;
            } else {
              _tmpPolice_sheet_img_three = _cursor.getBlob(_cursorIndexOfPoliceSheetImgThree);
            }
            final int _tmpDelivery_status;
            _tmpDelivery_status = _cursor.getInt(_cursorIndexOfDeliveryStatus);
            final String _tmpRegistration_id;
            if (_cursor.isNull(_cursorIndexOfRegistrationId)) {
              _tmpRegistration_id = null;
            } else {
              _tmpRegistration_id = _cursor.getString(_cursorIndexOfRegistrationId);
            }
            final Boolean _tmpSynced;
            final Integer _tmp_1;
            if (_cursor.isNull(_cursorIndexOfSynced)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(_cursorIndexOfSynced);
            }
            _tmpSynced = _tmp_1 == null ? null : _tmp_1 != 0;
            _item = new PoliceBackupEntity(_tmpId,_tmpCrew_leader,_tmpDate,_tmpWork_address,_tmpWork_order_number,_tmpOfficer_name,_tmpPolice_department,_tmpHours_worked,_tmpIs_car_used,_tmpPolice_sheet_img_one,_tmpPolice_sheet_img_two,_tmpPolice_sheet_img_three,_tmpDelivery_status,_tmpRegistration_id,_tmpSynced);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
