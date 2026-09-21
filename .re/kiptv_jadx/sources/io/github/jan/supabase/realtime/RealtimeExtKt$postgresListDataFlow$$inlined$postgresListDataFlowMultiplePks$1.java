package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class RealtimeExtKt$postgresListDataFlow$$inlined$postgresListDataFlowMultiplePks$1 implements p194x6.j {
    final /* synthetic */ E6.t $primaryKey;

    public RealtimeExtKt$postgresListDataFlow$$inlined$postgresListDataFlowMultiplePks$1(E6.t tVar) {
        this.$primaryKey = tVar;
    }

    @Override // p194x6.j
    public final java.lang.String invoke(Data it) {
        kotlin.jvm.internal.m.e(it, "it");
        return java.lang.String.valueOf(this.$primaryKey.get(it));
    }
}
