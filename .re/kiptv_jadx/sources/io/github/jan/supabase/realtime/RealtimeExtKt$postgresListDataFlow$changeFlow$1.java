package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class RealtimeExtKt$postgresListDataFlow$changeFlow$1 implements p194x6.j {
    final /* synthetic */ io.github.jan.supabase.postgrest.query.filter.FilterOperation $filter;
    final /* synthetic */ java.lang.String $table;

    public RealtimeExtKt$postgresListDataFlow$changeFlow$1(java.lang.String str, io.github.jan.supabase.postgrest.query.filter.FilterOperation filterOperation) {
        this.$table = str;
        this.$filter = filterOperation;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((io.github.jan.supabase.realtime.PostgresChangeFilter) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(io.github.jan.supabase.realtime.PostgresChangeFilter postgresChangeFlow) {
        kotlin.jvm.internal.m.e(postgresChangeFlow, "$this$postgresChangeFlow");
        postgresChangeFlow.setTable(this.$table);
        io.github.jan.supabase.postgrest.query.filter.FilterOperation filterOperation = this.$filter;
        if (filterOperation != null) {
            postgresChangeFlow.filter(filterOperation);
        }
    }
}
