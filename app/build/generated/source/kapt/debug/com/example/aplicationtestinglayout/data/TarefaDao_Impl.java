package com.example.aplicationtestinglayout.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.aplicationtestinglayout.model.Tarefas;
import java.lang.Class;
import java.lang.Exception;
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
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TarefaDao_Impl implements TarefaDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Tarefas> __insertionAdapterOfTarefas;

  private final EntityDeletionOrUpdateAdapter<Tarefas> __deletionAdapterOfTarefas;

  private final EntityDeletionOrUpdateAdapter<Tarefas> __updateAdapterOfTarefas;

  public TarefaDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTarefas = new EntityInsertionAdapter<Tarefas>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `tarefa_table` (`id`,`name`,`description`,`assignetTo`,`dueDate`,`status`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Tarefas value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getAssignetTo() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAssignetTo());
        }
        if (value.getDueDate() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDueDate());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStatus());
        }
      }
    };
    this.__deletionAdapterOfTarefas = new EntityDeletionOrUpdateAdapter<Tarefas>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `tarefa_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Tarefas value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfTarefas = new EntityDeletionOrUpdateAdapter<Tarefas>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `tarefa_table` SET `id` = ?,`name` = ?,`description` = ?,`assignetTo` = ?,`dueDate` = ?,`status` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Tarefas value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getAssignetTo() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAssignetTo());
        }
        if (value.getDueDate() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDueDate());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStatus());
        }
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public Object insertTarefa(final Tarefas tarefas, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTarefas.insert(tarefas);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteTarefasRoom(final Tarefas task,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfTarefas.handle(task);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateRoom(final Tarefas task, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTarefas.handle(task);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<Tarefas>> queryAllTarefas() {
    final String _sql = "SELECT * FROM tarefa_table ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tarefa_table"}, new Callable<List<Tarefas>>() {
      @Override
      public List<Tarefas> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAssignetTo = CursorUtil.getColumnIndexOrThrow(_cursor, "assignetTo");
          final int _cursorIndexOfDueDate = CursorUtil.getColumnIndexOrThrow(_cursor, "dueDate");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final List<Tarefas> _result = new ArrayList<Tarefas>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Tarefas _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpAssignetTo;
            if (_cursor.isNull(_cursorIndexOfAssignetTo)) {
              _tmpAssignetTo = null;
            } else {
              _tmpAssignetTo = _cursor.getString(_cursorIndexOfAssignetTo);
            }
            final String _tmpDueDate;
            if (_cursor.isNull(_cursorIndexOfDueDate)) {
              _tmpDueDate = null;
            } else {
              _tmpDueDate = _cursor.getString(_cursorIndexOfDueDate);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            _item = new Tarefas(_tmpId,_tmpName,_tmpDescription,_tmpAssignetTo,_tmpDueDate,_tmpStatus);
            _result.add(_item);
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

  @Override
  public Flow<Tarefas> queryById(final int id) {
    final String _sql = "SELECT * FROM tarefa_table WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tarefa_table"}, new Callable<Tarefas>() {
      @Override
      public Tarefas call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAssignetTo = CursorUtil.getColumnIndexOrThrow(_cursor, "assignetTo");
          final int _cursorIndexOfDueDate = CursorUtil.getColumnIndexOrThrow(_cursor, "dueDate");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final Tarefas _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpAssignetTo;
            if (_cursor.isNull(_cursorIndexOfAssignetTo)) {
              _tmpAssignetTo = null;
            } else {
              _tmpAssignetTo = _cursor.getString(_cursorIndexOfAssignetTo);
            }
            final String _tmpDueDate;
            if (_cursor.isNull(_cursorIndexOfDueDate)) {
              _tmpDueDate = null;
            } else {
              _tmpDueDate = _cursor.getString(_cursorIndexOfDueDate);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            _result = new Tarefas(_tmpId,_tmpName,_tmpDescription,_tmpAssignetTo,_tmpDueDate,_tmpStatus);
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
