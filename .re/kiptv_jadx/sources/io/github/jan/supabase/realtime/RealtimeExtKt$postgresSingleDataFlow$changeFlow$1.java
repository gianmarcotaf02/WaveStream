package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class RealtimeExtKt$postgresSingleDataFlow$changeFlow$1 implements p194x6.j {
    final /* synthetic */ java.lang.String $key;
    final /* synthetic */ io.github.jan.supabase.realtime.PrimaryKey<Data> $primaryKey;
    final /* synthetic */ java.lang.String $table;

    public RealtimeExtKt$postgresSingleDataFlow$changeFlow$1(java.lang.String str, io.github.jan.supabase.realtime.PrimaryKey<Data> primaryKey, java.lang.String str2) {
        this.$table = str;
        this.$primaryKey = primaryKey;
        this.$key = str2;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((io.github.jan.supabase.realtime.PostgresChangeFilter) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(io.github.jan.supabase.realtime.PostgresChangeFilter postgresChangeFlow) {
        kotlin.jvm.internal.m.e(postgresChangeFlow, "$this$postgresChangeFlow");
        postgresChangeFlow.setTable(this.$table);
        postgresChangeFlow.filter(this.$primaryKey.getColumnName(), io.github.jan.supabase.postgrest.query.filter.FilterOperator.EQ, this.$key);
    }
}
