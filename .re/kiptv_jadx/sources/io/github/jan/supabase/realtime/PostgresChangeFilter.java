package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\nJ%\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresChangeFilter;", "", "", "event", "schema", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/github/jan/supabase/postgrest/query/filter/FilterOperation;", "filter", "Lh6/A;", "(Lio/github/jan/supabase/postgrest/query/filter/FilterOperation;)V", "column", "Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;", "operator", "value", "(Ljava/lang/String;Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;Ljava/lang/Object;)V", "Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "buildConfig", "()Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "Ljava/lang/String;", "table", "getTable", "()Ljava/lang/String;", "setTable", "(Ljava/lang/String;)V", "getFilter", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostgresChangeFilter {
    private final java.lang.String event;
    private java.lang.String filter;
    private final java.lang.String schema;
    private java.lang.String table;

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[io.github.jan.supabase.postgrest.query.filter.FilterOperator.values().length];
            try {
                iArr[io.github.jan.supabase.postgrest.query.filter.FilterOperator.EQ.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[io.github.jan.supabase.postgrest.query.filter.FilterOperator.NEQ.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[io.github.jan.supabase.postgrest.query.filter.FilterOperator.GT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[io.github.jan.supabase.postgrest.query.filter.FilterOperator.GTE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[io.github.jan.supabase.postgrest.query.filter.FilterOperator.LT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[io.github.jan.supabase.postgrest.query.filter.FilterOperator.LTE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[io.github.jan.supabase.postgrest.query.filter.FilterOperator.IN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PostgresChangeFilter(java.lang.String event, java.lang.String schema) {
        kotlin.jvm.internal.m.e(event, "event");
        kotlin.jvm.internal.m.e(schema, "schema");
        this.event = event;
        this.schema = schema;
    }

    @io.github.jan.supabase.annotations.SupabaseInternal
    public final io.github.jan.supabase.realtime.PostgresJoinConfig buildConfig() {
        return new io.github.jan.supabase.realtime.PostgresJoinConfig(this.schema, this.table, this.filter, this.event, 0L, 16, (kotlin.jvm.internal.AbstractC2541f) null);
    }

    public final void filter(io.github.jan.supabase.postgrest.query.filter.FilterOperation filter) {
        java.lang.String string;
        kotlin.jvm.internal.m.e(filter, "filter");
        switch (io.github.jan.supabase.realtime.PostgresChangeFilter.WhenMappings.$EnumSwitchMapping$0[filter.getOperator().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                string = filter.getValue().toString();
                break;
            case 7:
                if (!(filter.getValue() instanceof java.util.List)) {
                    string = filter.getValue().toString();
                } else {
                    java.lang.Object value = filter.getValue();
                    kotlin.jvm.internal.m.c(value, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    string = p078i6.o.o1((java.util.List) value, ",", "(", ")", new com.kiptv.core.model.C1933b(22), 24);
                }
                break;
            default:
                throw new java.lang.UnsupportedOperationException("Unsupported filter operator: " + filter.getOperator());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(filter.getColumn());
        sb.append('=');
        java.lang.String lowerCase = filter.getOperator().name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        sb.append(lowerCase);
        sb.append('.');
        sb.append(string);
        this.filter = sb.toString();
    }

    public final java.lang.String getFilter() {
        return this.filter;
    }

    public final java.lang.String getTable() {
        return this.table;
    }

    public final void setTable(java.lang.String str) {
        this.table = str;
    }

    public final void filter(java.lang.String column, io.github.jan.supabase.postgrest.query.filter.FilterOperator operator, java.lang.Object value) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(operator, "operator");
        kotlin.jvm.internal.m.e(value, "value");
        filter(new io.github.jan.supabase.postgrest.query.filter.FilterOperation(column, operator, value));
    }
}
