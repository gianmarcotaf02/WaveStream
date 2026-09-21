package p098l3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import p121o0.p;

public final class i extends SQLiteOpenHelper {
    public static final String j = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    public static final int f24734k = 5;

    public static final List f24735l = Arrays.asList(new h(0), new h(1), new h(2), new h(3), new h(4));

    public final int f24736h;

    public boolean f24737i;

    public i(Context context, int i3, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i3);
        this.f24737i = false;
        this.f24736h = i3;
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i3, int i9) {
        List list = f24735l;
        if (i9 > list.size()) {
            StringBuilder sbS = p.s(i3, i9, "Migration from ", " to ", " was requested, but cannot be performed. Only ");
            sbS.append(list.size());
            sbS.append(" migrations are provided");
            throw new IllegalArgumentException(sbS.toString());
        }
        while (i3 < i9) {
            switch (((h) list.get(i3)).f24733a) {
                case 0:
                    sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                    sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                    break;
                case 1:
                    sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                    sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                    break;
                case 2:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                    break;
                case 3:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                    sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                    break;
                default:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                    sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                    sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                    sQLiteDatabase.execSQL(j);
                    break;
            }
            i3++;
        }
    }

    @Override
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f24737i = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f24737i) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, 0, this.f24736h);
    }

    @Override
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i9) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f24737i) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, 0, i9);
    }

    @Override
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f24737i) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i9) {
        if (!this.f24737i) {
            onConfigure(sQLiteDatabase);
        }
        b(sQLiteDatabase, i3, i9);
    }
}
