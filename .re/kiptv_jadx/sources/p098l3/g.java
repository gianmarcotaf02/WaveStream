package p098l3;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p098l3.d, p106m3.c, p098l3.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p013b3.b f24728m = new p013b3.b("proto");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p098l3.i f24729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V1.b f24730i;
    public final V1.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p098l3.a f24731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p061g6.a f24732l;

    public g(V1.b bVar, V1.b bVar2, p098l3.a aVar, p098l3.i iVar, p061g6.a aVar2) {
        this.f24729h = iVar;
        this.f24730i = bVar;
        this.j = bVar2;
        this.f24731k = aVar;
        this.f24732l = aVar2;
    }

    public static java.lang.Long e(android.database.sqlite.SQLiteDatabase sQLiteDatabase, p041e3.i iVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("backend_name = ? and priority = ?");
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(iVar.f21395a, java.lang.String.valueOf(p124o3.a.a(iVar.f21397c))));
        byte[] bArr = iVar.f21396b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(android.util.Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        android.database.Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new java.lang.String[]{"_id"}, sb.toString(), (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : java.lang.Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static java.lang.String v(java.lang.Iterable iterable) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((p098l3.b) it.next()).f24723a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static java.lang.Object z(android.database.Cursor cursor, p098l3.e eVar) {
        try {
            return eVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final android.database.sqlite.SQLiteDatabase b() {
        p098l3.i iVar = this.f24729h;
        java.util.Objects.requireNonNull(iVar);
        V1.b bVar = this.j;
        long jG = bVar.g();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                if (bVar.g() >= ((long) this.f24731k.f24720c) + jG) {
                    throw new p106m3.a("Timed out while trying to open db.", e6);
                }
                android.os.SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24729h.close();
    }

    public final java.lang.Object i(p098l3.e eVar) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            java.lang.Object objApply = eVar.apply(sQLiteDatabaseB);
            sQLiteDatabaseB.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    public final java.util.ArrayList j(android.database.sqlite.SQLiteDatabase sQLiteDatabase, p041e3.i iVar, int i3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Long lE = e(sQLiteDatabase, iVar);
        if (lE == null) {
            return arrayList;
        }
        z(sQLiteDatabase.query("events", new java.lang.String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new java.lang.String[]{lE.toString()}, null, null, null, java.lang.String.valueOf(i3)), new androidx.media3.exoplayer.source.h(this, arrayList, iVar, 5));
        return arrayList;
    }

    public final void t(long j, p067h3.c cVar, java.lang.String str) {
        i(new androidx.media3.exoplayer.analytics.v(j, str, cVar));
    }

    public final java.lang.Object u(p106m3.b bVar) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseB = b();
        V1.b bVar2 = this.j;
        long jG = bVar2.g();
        while (true) {
            try {
                sQLiteDatabaseB.beginTransaction();
                try {
                    java.lang.Object objC = bVar.c();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return objC;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                if (bVar2.g() >= ((long) this.f24731k.f24720c) + jG) {
                    throw new p106m3.a("Timed out while trying to acquire the lock.", e6);
                }
                android.os.SystemClock.sleep(50L);
            }
        }
    }
}
