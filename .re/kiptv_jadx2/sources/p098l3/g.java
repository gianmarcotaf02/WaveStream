package p098l3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.media3.exoplayer.analytics.v;
import androidx.media3.exoplayer.source.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p013b3.b;
import p041e3.i;
import p061g6.a;
import p106m3.c;

public final class g implements d, c, c {

    public static final b f24728m = new b("proto");

    public final i f24729h;

    public final V1.b f24730i;
    public final V1.b j;

    public final a f24731k;

    public final a f24732l;

    public g(V1.b bVar, V1.b bVar2, a aVar, i iVar, a aVar2) {
        this.f24729h = iVar;
        this.f24730i = bVar;
        this.j = bVar2;
        this.f24731k = aVar;
        this.f24732l = aVar2;
    }

    public static Long e(SQLiteDatabase sQLiteDatabase, i iVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f21395a, String.valueOf(p124o3.a.a(iVar.f21397c))));
        byte[] bArr = iVar.f21396b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String v(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f24723a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object z(Cursor cursor, e eVar) {
        try {
            return eVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase b() {
        i iVar = this.f24729h;
        Objects.requireNonNull(iVar);
        V1.b bVar = this.j;
        long jG = bVar.g();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e6) {
                if (bVar.g() >= ((long) this.f24731k.f24720c) + jG) {
                    throw new p106m3.a("Timed out while trying to open db.", e6);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override
    public final void close() {
        this.f24729h.close();
    }

    public final Object i(e eVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            Object objApply = eVar.apply(sQLiteDatabaseB);
            sQLiteDatabaseB.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    public final ArrayList j(SQLiteDatabase sQLiteDatabase, i iVar, int i3) {
        ArrayList arrayList = new ArrayList();
        Long lE = e(sQLiteDatabase, iVar);
        if (lE == null) {
            return arrayList;
        }
        z(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lE.toString()}, null, null, null, String.valueOf(i3)), new h(this, arrayList, iVar, 5));
        return arrayList;
    }

    public final void t(long j, p067h3.c cVar, String str) {
        i(new v(j, str, cVar));
    }

    public final Object u(p106m3.b bVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        V1.b bVar2 = this.j;
        long jG = bVar2.g();
        while (true) {
            try {
                sQLiteDatabaseB.beginTransaction();
                try {
                    Object objC = bVar.c();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return objC;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e6) {
                if (bVar2.g() >= ((long) this.f24731k.f24720c) + jG) {
                    throw new p106m3.a("Timed out while trying to acquire the lock.", e6);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
