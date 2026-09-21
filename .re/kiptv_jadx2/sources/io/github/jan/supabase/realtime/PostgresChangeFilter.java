package io.github.jan.supabase.realtime;

import androidx.media3.container.NalUnitUtil;
import com.kiptv.core.model.C1933b;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.postgrest.query.filter.FilterOperation;
import io.github.jan.supabase.postgrest.query.filter.FilterOperator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p078i6.o;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\nJ%\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresChangeFilter;", "", "", "event", "schema", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/github/jan/supabase/postgrest/query/filter/FilterOperation;", "filter", "Lh6/A;", "(Lio/github/jan/supabase/postgrest/query/filter/FilterOperation;)V", "column", "Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;", "operator", "value", "(Ljava/lang/String;Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;Ljava/lang/Object;)V", "Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "buildConfig", "()Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "Ljava/lang/String;", "table", "getTable", "()Ljava/lang/String;", "setTable", "(Ljava/lang/String;)V", "getFilter", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostgresChangeFilter {
    private final String event;
    private String filter;
    private final String schema;
    private String table;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilterOperator.values().length];
            try {
                iArr[FilterOperator.EQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterOperator.NEQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FilterOperator.GT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FilterOperator.GTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FilterOperator.LT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FilterOperator.LTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FilterOperator.IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PostgresChangeFilter(String event, String schema) {
        m.e(event, "event");
        m.e(schema, "schema");
        this.event = event;
        this.schema = schema;
    }

    @SupabaseInternal
    public final PostgresJoinConfig buildConfig() {
        return new PostgresJoinConfig(this.schema, this.table, this.filter, this.event, 0L, 16, (AbstractC2541f) null);
    }

    public final void filter(FilterOperation filter) {
        String string;
        m.e(filter, "filter");
        switch (WhenMappings.$EnumSwitchMapping$0[filter.getOperator().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                string = filter.getValue().toString();
                break;
            case 7:
                if (!(filter.getValue() instanceof List)) {
                    string = filter.getValue().toString();
                } else {
                    Object value = filter.getValue();
                    m.c(value, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    string = o.o1((List) value, ",", "(", ")", new C1933b(22), 24);
                }
                break;
            default:
                throw new UnsupportedOperationException("Unsupported filter operator: " + filter.getOperator());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(filter.getColumn());
        sb.append('=');
        String lowerCase = filter.getOperator().name().toLowerCase(Locale.ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        sb.append(lowerCase);
        sb.append('.');
        sb.append(string);
        this.filter = sb.toString();
    }

    public final String getFilter() {
        return this.filter;
    }

    public final String getTable() {
        return this.table;
    }

    public final void setTable(String str) {
        this.table = str;
    }

    public final void filter(String column, FilterOperator operator, Object value) {
        m.e(column, "column");
        m.e(operator, "operator");
        m.e(value, "value");
        filter(new FilterOperation(column, operator, value));
    }
}
