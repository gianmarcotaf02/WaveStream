package androidx.media3.exoplayer.upstream.experimental;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.util.Clock;
import io.sentry.protocol.SentryThread;
import java.util.Deque;
import p013b3.c;
import p041e3.i;
import p098l3.e;

public final class a implements SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction, e {

    public final long f16813h;

    public final Object f16814i;

    public a(long j, Object obj) {
        this.f16813h = j;
        this.f16814i = obj;
    }

    @Override
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f16813h));
        i iVar = (i) this.f16814i;
        String str = iVar.f21395a;
        c cVar = iVar.f21397c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(p124o3.a.a(cVar))}) < 1) {
            contentValues.put("backend_name", iVar.f21395a);
            contentValues.put(SentryThread.JsonKeys.PRIORITY, Integer.valueOf(p124o3.a.a(cVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public boolean shouldEvictSample(Deque deque) {
        return SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$1(this.f16813h, (Clock) this.f16814i, deque);
    }
}
