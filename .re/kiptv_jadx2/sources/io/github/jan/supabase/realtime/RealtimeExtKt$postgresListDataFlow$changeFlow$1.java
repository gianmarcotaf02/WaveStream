package io.github.jan.supabase.realtime;

import io.github.jan.supabase.postgrest.query.filter.FilterOperation;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p194x6.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class RealtimeExtKt$postgresListDataFlow$changeFlow$1 implements j {
    final FilterOperation $filter;
    final String $table;

    public RealtimeExtKt$postgresListDataFlow$changeFlow$1(String str, FilterOperation filterOperation) {
        this.$table = str;
        this.$filter = filterOperation;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((PostgresChangeFilter) obj);
        return A.f22523a;
    }

    public final void invoke(PostgresChangeFilter postgresChangeFlow) {
        m.e(postgresChangeFlow, "$this$postgresChangeFlow");
        postgresChangeFlow.setTable(this.$table);
        FilterOperation filterOperation = this.$filter;
        if (filterOperation != null) {
            postgresChangeFlow.filter(filterOperation);
        }
    }
}
