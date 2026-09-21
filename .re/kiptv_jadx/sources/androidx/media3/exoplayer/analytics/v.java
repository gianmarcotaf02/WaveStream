package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements androidx.media3.common.util.ListenerSet.Event, p106m3.b, p098l3.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f16579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16580i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ v(long j, java.lang.Object obj, java.lang.Object obj2) {
        this.f16580i = obj;
        this.j = obj2;
        this.f16579h = j;
    }

    @Override // p098l3.e
    public java.lang.Object apply(java.lang.Object obj) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) obj;
        int i3 = ((p067h3.c) this.j).f22474h;
        java.lang.String string = java.lang.Integer.toString(i3);
        java.lang.String str = (java.lang.String) this.f16580i;
        android.database.Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new java.lang.String[]{str, string});
        try {
            boolean z6 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f16579h;
            if (z6) {
                sQLiteDatabase.execSQL(B2.a.k(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new java.lang.String[]{str, java.lang.Integer.toString(i3)});
                return null;
            }
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("log_source", str);
            contentValues.put(io.sentry.clientreport.DiscardedEvent.JsonKeys.REASON, java.lang.Integer.valueOf(i3));
            contentValues.put("events_dropped_count", java.lang.Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (java.lang.Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // p106m3.b
    public java.lang.Object c() {
        k3.i iVar = (k3.i) this.f16580i;
        long jG = iVar.g.g() + this.f16579h;
        p098l3.g gVar = (p098l3.g) iVar.f24461c;
        p041e3.i iVar2 = (p041e3.i) this.j;
        gVar.getClass();
        gVar.i(new androidx.media3.exoplayer.upstream.experimental.a(jG, iVar2));
        return null;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onRenderedFirstFrame((androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime) this.f16580i, this.j, this.f16579h);
    }
}
