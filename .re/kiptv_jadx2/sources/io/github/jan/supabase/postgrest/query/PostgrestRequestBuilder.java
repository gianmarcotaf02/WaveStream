package io.github.jan.supabase.postgrest.query;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import io.github.jan.supabase.annotations.SupabaseExperimental;
import io.github.jan.supabase.auth.PostgrestFilterDSL;
import io.github.jan.supabase.postgrest.PropertyConversionMethod;
import io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.sentry.protocol.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p078i6.o;
import p086j6.b;
import p194x6.j;

@PostgrestFilterDSL
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0018J!\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00192\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020 2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001e\u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\u0010J\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010\u0010JI\u0010*\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020\u00152\b\b\u0002\u0010&\u001a\u00020\u00152\b\b\u0002\u0010'\u001a\u00020\u00152\b\b\u0002\u0010(\u001a\u00020\u00152\b\b\u0002\u0010)\u001a\u00020\u0011¢\u0006\u0004\b*\u0010+J,\u00100\u001a\u00020\b2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0,¢\u0006\u0002\b.H\u0086\bø\u0001\u0000¢\u0006\u0004\b0\u00101R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u00102\u0012\u0004\b5\u0010\u0010\u001a\u0004\b3\u00104R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u00106\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u00109R$\u0010;\u001a\u00020:2\u0006\u00106\u001a\u00020:8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R2\u0010A\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110@0?8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u0010\u0010\u001a\u0004\bC\u0010DR \u0010G\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bK\u0010\u0010\u001a\u0004\bI\u0010J\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006L"}, d2 = {"Lio/github/jan/supabase/postgrest/query/PostgrestRequestBuilder;", "", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "propertyConversionMethod", "<init>", "(Lio/github/jan/supabase/postgrest/PropertyConversionMethod;)V", "Lio/github/jan/supabase/postgrest/query/Count;", "count", "Lh6/A;", "(Lio/github/jan/supabase/postgrest/query/Count;)V", "Lio/github/jan/supabase/postgrest/query/Columns;", "columns", "select-fYsiLaM", "(Ljava/lang/String;)V", "select", "single", "()V", "", "column", "Lio/github/jan/supabase/postgrest/query/Order;", "order", "", "nullsFirst", "referencedTable", "(Ljava/lang/String;Lio/github/jan/supabase/postgrest/query/Order;ZLjava/lang/String;)V", "", "limit", "(JLjava/lang/String;)V", "from", "to", "range", "(JJLjava/lang/String;)V", "LD6/j;", "(LD6/j;Ljava/lang/String;)V", "geojson", "csv", "analyze", "verbose", "settings", "buffers", "wal", "format", "explain", "(ZZZZZLjava/lang/String;)V", "Lkotlin/Function1;", "Lio/github/jan/supabase/postgrest/query/filter/PostgrestFilterBuilder;", "Lio/github/jan/supabase/auth/PostgrestFilterDSL;", "block", "filter", "(Lx6/j;)V", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "getPropertyConversionMethod", "()Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "getPropertyConversionMethod$annotations", "value", "Lio/github/jan/supabase/postgrest/query/Count;", "getCount", "()Lio/github/jan/supabase/postgrest/query/Count;", "Lio/github/jan/supabase/postgrest/query/Returning;", "returning", "Lio/github/jan/supabase/postgrest/query/Returning;", "getReturning", "()Lio/github/jan/supabase/postgrest/query/Returning;", "", "", Message.JsonKeys.PARAMS, "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getParams$annotations", "Lio/ktor/http/HeadersBuilder;", "headers", "Lio/ktor/http/HeadersBuilder;", "getHeaders", "()Lio/ktor/http/HeadersBuilder;", "getHeaders$annotations", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class PostgrestRequestBuilder {
    private Count count;
    private final HeadersBuilder headers;
    private final Map<String, List<String>> params;
    private final PropertyConversionMethod propertyConversionMethod;
    private Returning returning;

    public PostgrestRequestBuilder(PropertyConversionMethod propertyConversionMethod) {
        m.e(propertyConversionMethod, "propertyConversionMethod");
        this.propertyConversionMethod = propertyConversionMethod;
        this.returning = Returning.Minimal.INSTANCE;
        this.params = new LinkedHashMap();
        this.headers = new HeadersBuilder(0, 1, null);
    }

    public static void explain$default(PostgrestRequestBuilder postgrestRequestBuilder, boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: explain");
        }
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        if ((i3 & 2) != 0) {
            z9 = false;
        }
        if ((i3 & 4) != 0) {
            z10 = false;
        }
        if ((i3 & 8) != 0) {
            z11 = false;
        }
        if ((i3 & 16) != 0) {
            z12 = false;
        }
        if ((i3 & 32) != 0) {
            str = "text";
        }
        postgrestRequestBuilder.explain(z6, z9, z10, z11, z12, str);
    }

    @SupabaseExperimental
    public static void getHeaders$annotations() {
    }

    @SupabaseExperimental
    public static void getParams$annotations() {
    }

    public static void getPropertyConversionMethod$annotations() {
    }

    public static void limit$default(PostgrestRequestBuilder postgrestRequestBuilder, long j, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limit");
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        postgrestRequestBuilder.limit(j, str);
    }

    public static void order$default(PostgrestRequestBuilder postgrestRequestBuilder, String str, Order order, boolean z6, String str2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: order");
        }
        if ((i3 & 4) != 0) {
            z6 = false;
        }
        if ((i3 & 8) != 0) {
            str2 = null;
        }
        postgrestRequestBuilder.order(str, order, z6, str2);
    }

    public static void range$default(PostgrestRequestBuilder postgrestRequestBuilder, long j, long j9, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: range");
        }
        if ((i3 & 4) != 0) {
            str = null;
        }
        postgrestRequestBuilder.range(j, j9, str);
    }

    public static void m307selectfYsiLaM$default(PostgrestRequestBuilder postgrestRequestBuilder, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: select-fYsiLaM");
        }
        if ((i3 & 1) != 0) {
            str = Columns.INSTANCE.m299getALLU9NzzuM();
        }
        postgrestRequestBuilder.m308selectfYsiLaM(str);
    }

    public final void count(Count count) {
        m.e(count, "count");
        this.count = count;
    }

    public final void csv() {
        this.headers.set(HttpHeaders.INSTANCE.getAccept(), "text/csv");
    }

    public final void explain(boolean analyze, boolean verbose, boolean settings, boolean buffers, boolean wal, String format) {
        m.e(format, "format");
        b bVarU = P.U();
        if (analyze) {
            bVarU.add("analyze");
        }
        if (verbose) {
            bVarU.add("verbose");
        }
        if (settings) {
            bVarU.add("settings");
        }
        if (buffers) {
            bVarU.add("buffers");
        }
        if (wal) {
            bVarU.add("wal");
        }
        String strO1 = o.o1(P.M(bVarU), "|", null, null, null, 62);
        String str = this.headers.get("Accept");
        if (str == null) {
            str = "application/json";
        }
        HeadersBuilder headersBuilder = this.headers;
        String accept = HttpHeaders.INSTANCE.getAccept();
        StringBuilder sbO = f.o("application/vnd.pgrst.plan+", format, "; for=\"", str, "\"; options=");
        sbO.append(strO1);
        sbO.append(';');
        headersBuilder.set(accept, sbO.toString());
    }

    public final void filter(j block) {
        m.e(block, "block");
        block.invoke(new PostgrestFilterBuilder(getPropertyConversionMethod(), getParams(), false, 4, null));
    }

    public final void geojson() {
        this.headers.set(HttpHeaders.INSTANCE.getAccept(), "application/geo+json");
    }

    public final Count getCount() {
        return this.count;
    }

    public final HeadersBuilder getHeaders() {
        return this.headers;
    }

    public final Map<String, List<String>> getParams() {
        return this.params;
    }

    public final PropertyConversionMethod getPropertyConversionMethod() {
        return this.propertyConversionMethod;
    }

    public final Returning getReturning() {
        return this.returning;
    }

    public final void limit(long count, String referencedTable) {
        this.params.put(referencedTable == null ? "limit" : referencedTable.concat(".limit"), P.i0(String.valueOf(count)));
    }

    public final void order(String column, Order order, boolean nullsFirst, String referencedTable) {
        m.e(column, "column");
        m.e(order, "order");
        String strConcat = referencedTable != null ? referencedTable.concat(".order") : "order";
        List<String> list = this.params.get(strConcat);
        String str = list != null ? (String) o.j1(list) : null;
        String strConcat2 = str == null ? "" : str.concat(",");
        StringBuilder sb = new StringBuilder();
        sb.append(strConcat2);
        sb.append(column);
        sb.append('.');
        sb.append(order.getValue());
        sb.append('.');
        sb.append(nullsFirst ? "nullsfirst" : "nullslast");
        this.params.put(strConcat, P.i0(sb.toString()));
    }

    public final void range(long from, long to, String referencedTable) {
        String strConcat = referencedTable == null ? "offset" : referencedTable.concat(".offset");
        String strConcat2 = referencedTable == null ? "limit" : referencedTable.concat(".limit");
        this.params.put(strConcat, P.i0(String.valueOf(from)));
        this.params.put(strConcat2, P.i0(String.valueOf((to - from) + 1)));
    }

    public final void m308selectfYsiLaM(String columns) {
        m.e(columns, "columns");
        this.returning = new Returning.Representation(columns, null);
    }

    public final void single() {
        this.headers.set(HttpHeaders.INSTANCE.getAccept(), "application/vnd.pgrst.object+json");
    }

    public static void range$default(PostgrestRequestBuilder postgrestRequestBuilder, D6.j jVar, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: range");
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        postgrestRequestBuilder.range(jVar, str);
    }

    public final void range(D6.j range, String referencedTable) {
        m.e(range, "range");
        range(range.f2464h, range.f2465i, referencedTable);
    }
}
