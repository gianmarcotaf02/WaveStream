package io.github.jan.supabase.realtime;

import io.github.jan.supabase.postgrest.query.filter.FilterOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p194x6.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class RealtimeExtKt$postgresSingleDataFlow$changeFlow$1 implements j {
    final String $key;
    final PrimaryKey<Data> $primaryKey;
    final String $table;

    public RealtimeExtKt$postgresSingleDataFlow$changeFlow$1(String str, PrimaryKey<Data> primaryKey, String str2) {
        this.$table = str;
        this.$primaryKey = primaryKey;
        this.$key = str2;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((PostgresChangeFilter) obj);
        return A.f22523a;
    }

    public final void invoke(PostgresChangeFilter postgresChangeFlow) {
        m.e(postgresChangeFlow, "$this$postgresChangeFlow");
        postgresChangeFlow.setTable(this.$table);
        postgresChangeFlow.filter(this.$primaryKey.getColumnName(), FilterOperator.EQ, this.$key);
    }
}
