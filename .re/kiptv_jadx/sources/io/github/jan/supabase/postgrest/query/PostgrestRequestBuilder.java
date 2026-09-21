package io.github.jan.supabase.postgrest.query;

/* JADX INFO: loaded from: classes4.dex */
@io.github.jan.supabase.auth.PostgrestFilterDSL
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0018J!\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00192\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020 2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001e\u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\u0010J\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010\u0010JI\u0010*\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020\u00152\b\b\u0002\u0010&\u001a\u00020\u00152\b\b\u0002\u0010'\u001a\u00020\u00152\b\b\u0002\u0010(\u001a\u00020\u00152\b\b\u0002\u0010)\u001a\u00020\u0011¢\u0006\u0004\b*\u0010+J,\u00100\u001a\u00020\b2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0,¢\u0006\u0002\b.H\u0086\bø\u0001\u0000¢\u0006\u0004\b0\u00101R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u00102\u0012\u0004\b5\u0010\u0010\u001a\u0004\b3\u00104R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u00106\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u00109R$\u0010;\u001a\u00020:2\u0006\u00106\u001a\u00020:8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R2\u0010A\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110@0?8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u0010\u0010\u001a\u0004\bC\u0010DR \u0010G\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bK\u0010\u0010\u001a\u0004\bI\u0010J\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006L"}, d2 = {"Lio/github/jan/supabase/postgrest/query/PostgrestRequestBuilder;", "", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "propertyConversionMethod", "<init>", "(Lio/github/jan/supabase/postgrest/PropertyConversionMethod;)V", "Lio/github/jan/supabase/postgrest/query/Count;", "count", "Lh6/A;", "(Lio/github/jan/supabase/postgrest/query/Count;)V", "Lio/github/jan/supabase/postgrest/query/Columns;", "columns", "select-fYsiLaM", "(Ljava/lang/String;)V", "select", "single", "()V", "", "column", "Lio/github/jan/supabase/postgrest/query/Order;", "order", "", "nullsFirst", "referencedTable", "(Ljava/lang/String;Lio/github/jan/supabase/postgrest/query/Order;ZLjava/lang/String;)V", "", "limit", "(JLjava/lang/String;)V", "from", "to", "range", "(JJLjava/lang/String;)V", "LD6/j;", "(LD6/j;Ljava/lang/String;)V", "geojson", "csv", "analyze", "verbose", "settings", "buffers", "wal", "format", "explain", "(ZZZZZLjava/lang/String;)V", "Lkotlin/Function1;", "Lio/github/jan/supabase/postgrest/query/filter/PostgrestFilterBuilder;", "Lio/github/jan/supabase/auth/PostgrestFilterDSL;", "block", "filter", "(Lx6/j;)V", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "getPropertyConversionMethod", "()Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "getPropertyConversionMethod$annotations", "value", "Lio/github/jan/supabase/postgrest/query/Count;", "getCount", "()Lio/github/jan/supabase/postgrest/query/Count;", "Lio/github/jan/supabase/postgrest/query/Returning;", "returning", "Lio/github/jan/supabase/postgrest/query/Returning;", "getReturning", "()Lio/github/jan/supabase/postgrest/query/Returning;", "", "", io.sentry.protocol.Message.JsonKeys.PARAMS, "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getParams$annotations", "Lio/ktor/http/HeadersBuilder;", "headers", "Lio/ktor/http/HeadersBuilder;", "getHeaders", "()Lio/ktor/http/HeadersBuilder;", "getHeaders$annotations", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class PostgrestRequestBuilder {
    private io.github.jan.supabase.postgrest.query.Count count;
    private final io.ktor.http.HeadersBuilder headers;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> params;
    private final io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod;
    private io.github.jan.supabase.postgrest.query.Returning returning;

    public PostgrestRequestBuilder(io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod) {
        kotlin.jvm.internal.m.e(propertyConversionMethod, "propertyConversionMethod");
        this.propertyConversionMethod = propertyConversionMethod;
        this.returning = io.github.jan.supabase.postgrest.query.Returning.Minimal.INSTANCE;
        this.params = new java.util.LinkedHashMap();
        this.headers = new io.ktor.http.HeadersBuilder(0, 1, null);
    }

    public static /* synthetic */ void explain$default(io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder, boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, java.lang.String str, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: explain");
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

    @io.github.jan.supabase.annotations.SupabaseExperimental
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @io.github.jan.supabase.annotations.SupabaseExperimental
    public static /* synthetic */ void getParams$annotations() {
    }

    public static /* synthetic */ void getPropertyConversionMethod$annotations() {
    }

    public static /* synthetic */ void limit$default(io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder, long j, java.lang.String str, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limit");
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        postgrestRequestBuilder.limit(j, str);
    }

    public static /* synthetic */ void order$default(io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder, java.lang.String str, io.github.jan.supabase.postgrest.query.Order order, boolean z6, java.lang.String str2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: order");
        }
        if ((i3 & 4) != 0) {
            z6 = false;
        }
        if ((i3 & 8) != 0) {
            str2 = null;
        }
        postgrestRequestBuilder.order(str, order, z6, str2);
    }

    public static /* synthetic */ void range$default(io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder, long j, long j9, java.lang.String str, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: range");
        }
        if ((i3 & 4) != 0) {
            str = null;
        }
        postgrestRequestBuilder.range(j, j9, str);
    }

    /* JADX INFO: renamed from: select-fYsiLaM$default, reason: not valid java name */
    public static /* synthetic */ void m307selectfYsiLaM$default(io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder, java.lang.String str, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: select-fYsiLaM");
        }
        if ((i3 & 1) != 0) {
            str = io.github.jan.supabase.postgrest.query.Columns.INSTANCE.m299getALLU9NzzuM();
        }
        postgrestRequestBuilder.m308selectfYsiLaM(str);
    }

    public final void count(io.github.jan.supabase.postgrest.query.Count count) {
        kotlin.jvm.internal.m.e(count, "count");
        this.count = count;
    }

    public final void csv() {
        this.headers.set(io.ktor.http.HttpHeaders.INSTANCE.getAccept(), "text/csv");
    }

    public final void explain(boolean analyze, boolean verbose, boolean settings, boolean buffers, boolean wal, java.lang.String format) {
        kotlin.jvm.internal.m.e(format, "format");
        p086j6.b bVarU = com.google.common.util.concurrent.P.U();
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
        java.lang.String strO1 = p078i6.o.o1(com.google.common.util.concurrent.P.M(bVarU), "|", null, null, null, 62);
        java.lang.String str = this.headers.get("Accept");
        if (str == null) {
            str = "application/json";
        }
        io.ktor.http.HeadersBuilder headersBuilder = this.headers;
        java.lang.String accept = io.ktor.http.HttpHeaders.INSTANCE.getAccept();
        java.lang.StringBuilder sbO = Y6.f.o("application/vnd.pgrst.plan+", format, "; for=\"", str, "\"; options=");
        sbO.append(strO1);
        sbO.append(';');
        headersBuilder.set(accept, sbO.toString());
    }

    public final void filter(p194x6.j block) {
        kotlin.jvm.internal.m.e(block, "block");
        block.invoke(new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(getPropertyConversionMethod(), getParams(), false, 4, null));
    }

    public final void geojson() {
        this.headers.set(io.ktor.http.HttpHeaders.INSTANCE.getAccept(), "application/geo+json");
    }

    public final io.github.jan.supabase.postgrest.query.Count getCount() {
        return this.count;
    }

    public final io.ktor.http.HeadersBuilder getHeaders() {
        return this.headers;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getParams() {
        return this.params;
    }

    public final io.github.jan.supabase.postgrest.PropertyConversionMethod getPropertyConversionMethod() {
        return this.propertyConversionMethod;
    }

    public final io.github.jan.supabase.postgrest.query.Returning getReturning() {
        return this.returning;
    }

    public final void limit(long count, java.lang.String referencedTable) {
        this.params.put(referencedTable == null ? "limit" : referencedTable.concat(".limit"), com.google.common.util.concurrent.P.i0(java.lang.String.valueOf(count)));
    }

    public final void order(java.lang.String column, io.github.jan.supabase.postgrest.query.Order order, boolean nullsFirst, java.lang.String referencedTable) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(order, "order");
        java.lang.String strConcat = referencedTable != null ? referencedTable.concat(".order") : "order";
        java.util.List<java.lang.String> list = this.params.get(strConcat);
        java.lang.String str = list != null ? (java.lang.String) p078i6.o.j1(list) : null;
        java.lang.String strConcat2 = str == null ? "" : str.concat(",");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(strConcat2);
        sb.append(column);
        sb.append('.');
        sb.append(order.getValue());
        sb.append('.');
        sb.append(nullsFirst ? "nullsfirst" : "nullslast");
        this.params.put(strConcat, com.google.common.util.concurrent.P.i0(sb.toString()));
    }

    public final void range(long from, long to, java.lang.String referencedTable) {
        java.lang.String strConcat = referencedTable == null ? "offset" : referencedTable.concat(".offset");
        java.lang.String strConcat2 = referencedTable == null ? "limit" : referencedTable.concat(".limit");
        this.params.put(strConcat, com.google.common.util.concurrent.P.i0(java.lang.String.valueOf(from)));
        this.params.put(strConcat2, com.google.common.util.concurrent.P.i0(java.lang.String.valueOf((to - from) + 1)));
    }

    /* JADX INFO: renamed from: select-fYsiLaM, reason: not valid java name */
    public final void m308selectfYsiLaM(java.lang.String columns) {
        kotlin.jvm.internal.m.e(columns, "columns");
        this.returning = new io.github.jan.supabase.postgrest.query.Returning.Representation(columns, null);
    }

    public final void single() {
        this.headers.set(io.ktor.http.HttpHeaders.INSTANCE.getAccept(), "application/vnd.pgrst.object+json");
    }

    public static /* synthetic */ void range$default(io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder, D6.j jVar, java.lang.String str, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: range");
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        postgrestRequestBuilder.range(jVar, str);
    }

    public final void range(D6.j range, java.lang.String referencedTable) {
        kotlin.jvm.internal.m.e(range, "range");
        range(range.f2464h, range.f2465i, referencedTable);
    }
}
