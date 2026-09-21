package io.github.jan.supabase.postgrest.result;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0012J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0012J\u001e\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u001cR \u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001d¨\u0006'"}, d2 = {"Lio/github/jan/supabase/postgrest/result/PostgrestResult;", "", "", "data", "Lio/ktor/http/Headers;", "headers", "Lio/github/jan/supabase/postgrest/Postgrest;", "postgrest", "<init>", "(Ljava/lang/String;Lio/ktor/http/Headers;Lio/github/jan/supabase/postgrest/Postgrest;)V", "", "countOrNull", "()Ljava/lang/Long;", "LD6/j;", "rangeOrNull", "()LD6/j;", "T", "decodeAs", "()Ljava/lang/Object;", "decodeAsOrNull", "", "decodeList", "()Ljava/util/List;", "decodeSingle", "decodeSingleOrNull", "component1", "()Ljava/lang/String;", "component2", "()Lio/ktor/http/Headers;", "Ljava/lang/String;", "getData", "Lio/ktor/http/Headers;", "getHeaders", "Lio/github/jan/supabase/postgrest/Postgrest;", "getPostgrest", "()Lio/github/jan/supabase/postgrest/Postgrest;", "getPostgrest$annotations", "()V", "contentRange", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostgrestResult {
    private final java.lang.String contentRange;
    private final java.lang.String data;
    private final io.ktor.http.Headers headers;
    private final io.github.jan.supabase.postgrest.Postgrest postgrest;

    public PostgrestResult(java.lang.String data, io.ktor.http.Headers headers, io.github.jan.supabase.postgrest.Postgrest postgrest) {
        kotlin.jvm.internal.m.e(data, "data");
        kotlin.jvm.internal.m.e(headers, "headers");
        kotlin.jvm.internal.m.e(postgrest, "postgrest");
        this.data = data;
        this.headers = headers;
        this.postgrest = postgrest;
        this.contentRange = headers.get("Content-Range");
    }

    public static /* synthetic */ void getPostgrest$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    public final java.lang.Long countOrNull() {
        java.lang.String str = this.contentRange;
        if (str != null) {
            return O7.x.A0(O7.q.j1(str, "/", str));
        }
        return null;
    }

    public final <T> T decodeAs() {
        getPostgrest().getSerializer();
        getData();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final <T> T decodeAsOrNull() {
        try {
            getPostgrest().getSerializer();
            getData();
            kotlin.jvm.internal.m.j();
            throw null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final <T> java.util.List<T> decodeList() {
        getPostgrest().getSerializer();
        getData();
        E6.y yVar = E6.y.f3222c;
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final <T> T decodeSingle() {
        getPostgrest().getSerializer();
        getData();
        E6.y yVar = E6.y.f3222c;
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final <T> T decodeSingleOrNull() {
        getPostgrest().getSerializer();
        getData();
        E6.y yVar = E6.y.f3222c;
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final java.lang.String getData() {
        return this.data;
    }

    public final io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    public final io.github.jan.supabase.postgrest.Postgrest getPostgrest() {
        return this.postgrest;
    }

    public final D6.j rangeOrNull() {
        java.lang.String str = this.contentRange;
        if (str == null) {
            return null;
        }
        java.util.List listB1 = O7.q.b1(O7.q.m1(str, "/"), new java.lang.String[]{"-"}, 0, 6);
        return new D6.j(java.lang.Long.parseLong((java.lang.String) listB1.get(0)), java.lang.Long.parseLong((java.lang.String) listB1.get(1)));
    }
}
