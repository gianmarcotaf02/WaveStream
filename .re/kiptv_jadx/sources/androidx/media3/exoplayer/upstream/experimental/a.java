package androidx.media3.exoplayer.upstream.experimental;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction, p098l3.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f16813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16814i;

    public /* synthetic */ a(long j, java.lang.Object obj) {
        this.f16813h = j;
        this.f16814i = obj;
    }

    @Override // p098l3.e
    public java.lang.Object apply(java.lang.Object obj) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) obj;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("next_request_ms", java.lang.Long.valueOf(this.f16813h));
        p041e3.i iVar = (p041e3.i) this.f16814i;
        java.lang.String str = iVar.f21395a;
        p013b3.c cVar = iVar.f21397c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new java.lang.String[]{str, java.lang.String.valueOf(p124o3.a.a(cVar))}) < 1) {
            contentValues.put("backend_name", iVar.f21395a);
            contentValues.put(io.sentry.protocol.SentryThread.JsonKeys.PRIORITY, java.lang.Integer.valueOf(p124o3.a.a(cVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(java.util.Deque deque) {
        return androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$1(this.f16813h, (androidx.media3.common.util.Clock) this.f16814i, deque);
    }
}
