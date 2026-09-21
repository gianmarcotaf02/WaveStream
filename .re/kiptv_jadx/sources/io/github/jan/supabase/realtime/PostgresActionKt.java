package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\u0004\u001a \u0010\u0005\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0006H\u0086\b¢\u0006\u0002\u0010\u0007\u001a\u001e\u0010\b\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\u0004\u001a\u001e\u0010\t\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0006H\u0086\b¢\u0006\u0002\u0010\u0007¨\u0006\n"}, d2 = {"decodeRecordOrNull", "T", "", "Lio/github/jan/supabase/realtime/HasRecord;", "(Lio/github/jan/supabase/realtime/HasRecord;)Ljava/lang/Object;", "decodeOldRecordOrNull", "Lio/github/jan/supabase/realtime/HasOldRecord;", "(Lio/github/jan/supabase/realtime/HasOldRecord;)Ljava/lang/Object;", "decodeRecord", "decodeOldRecord", "realtime-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostgresActionKt {
    public static final <T> T decodeOldRecord(io.github.jan.supabase.realtime.HasOldRecord hasOldRecord) {
        kotlin.jvm.internal.m.e(hasOldRecord, "<this>");
        hasOldRecord.getSerializer();
        hasOldRecord.getOldRecord().toString();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public static final <T> T decodeOldRecordOrNull(io.github.jan.supabase.realtime.HasOldRecord hasOldRecord) {
        kotlin.jvm.internal.m.e(hasOldRecord, "<this>");
        try {
            hasOldRecord.getSerializer();
            hasOldRecord.getOldRecord().toString();
            kotlin.jvm.internal.m.j();
            throw null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static final <T> T decodeRecord(io.github.jan.supabase.realtime.HasRecord hasRecord) {
        kotlin.jvm.internal.m.e(hasRecord, "<this>");
        hasRecord.getSerializer();
        hasRecord.getRecord().toString();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public static final <T> T decodeRecordOrNull(io.github.jan.supabase.realtime.HasRecord hasRecord) {
        kotlin.jvm.internal.m.e(hasRecord, "<this>");
        try {
            hasRecord.getSerializer();
            hasRecord.getRecord().toString();
            kotlin.jvm.internal.m.j();
            throw null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
