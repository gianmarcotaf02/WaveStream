package B2;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ java.lang.String A(int i3) {
        if (i3 == 1) {
            return "DECLARATION";
        }
        if (i3 == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i3 != 3) {
            return i3 != 4 ? "null" : "SYNTHESIZED";
        }
        return "DELEGATION";
    }

    public static int a(int i3, int i9, java.lang.String str) {
        return (str.hashCode() + i3) * i9;
    }

    public static int b(int i3, int i9, java.util.List list) {
        return (list.hashCode() + i3) * i9;
    }

    public static int c(int i3, int i9, java.util.Map map) {
        return (map.hashCode() + i3) * i9;
    }

    public static E6.l d(java.lang.Class cls, java.lang.String str, java.lang.String str2, int i3, kotlin.jvm.internal.C c9) {
        return c9.f(new kotlin.jvm.internal.r(cls, str, str2, i3));
    }

    public static E6.t e(java.lang.Class cls, java.lang.String str, java.lang.String str2, int i3, kotlin.jvm.internal.C c9) {
        return c9.h(new kotlin.jvm.internal.u(cls, str, str2, i3));
    }

    public static I3.b f(java.lang.Object obj) {
        com.google.common.util.concurrent.P.u0(obj);
        return new I3.b();
    }

    public static io.ktor.client.request.HttpRequestBuilder g(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        io.ktor.client.request.UtilsKt.parameter(httpRequestBuilder, str2, str3);
        return httpRequestBuilder;
    }

    public static io.ktor.client.statement.HttpStatement h(io.ktor.http.HttpMethod.Companion companion, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2, io.ktor.client.HttpClient httpClient) {
        httpRequestBuilder.setMethod(companion.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder2, httpClient);
    }

    public static java.lang.String i(char c9, java.lang.String str, java.lang.String str2) {
        return str + str2 + c9;
    }

    public static java.lang.String j(long j, java.lang.String str) {
        return str + j;
    }

    public static java.lang.String k(long j, java.lang.String str, java.lang.String str2) {
        return str + j + str2;
    }

    public static java.lang.String l(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return p015b5.u.b(str3, p078i6.D.J0(new p070h6.k(str, str2)));
    }

    public static java.lang.String m(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return str + str2 + str3 + str4;
    }

    public static java.lang.String n(java.lang.StringBuilder sb, java.lang.Object obj, char c9) {
        sb.append(obj);
        sb.append(c9);
        return sb.toString();
    }

    public static java.lang.String o(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static java.lang.String p(java.lang.Object[] objArr, int i3, java.lang.String str, java.lang.StringBuilder sb) {
        sb.append(java.lang.String.format(str, java.util.Arrays.copyOf(objArr, i3)));
        return sb.toString();
    }

    public static java.lang.StringBuilder q(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(i3);
        return sb;
    }

    public static p175v0.y r(p020c0.C1700q c1700q) {
        p175v0.y yVar = new p175v0.y();
        c1700q.n0(yVar);
        return yVar;
    }

    public static void s(int i3, int i9, int i10, int i11, int i12) {
        I0.c.a(i3);
        I0.c.a(i9);
        I0.c.a(i10);
        I0.c.a(i11);
        I0.c.a(i12);
    }

    public static void t(p020c0.C1700q c1700q, boolean z6, boolean z9, boolean z10) {
        c1700q.p(z6);
        c1700q.p(z9);
        c1700q.p(z10);
    }

    public static /* synthetic */ void u(java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.ClassCastException();
        }
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.util.Log.w(str3, str + str2);
    }

    public static void w(java.lang.StringBuilder sb, java.lang.String str, int i3, java.lang.String str2) {
        sb.append(str);
        sb.append(i3);
        android.util.Log.d(str2, sb.toString());
    }

    public static void x(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static boolean y(p020c0.C1700q c1700q, int i3, C5.c2 c2Var) {
        c1700q.p(false);
        c1700q.c0(i3);
        return c1700q.h(c2Var);
    }

    public static boolean z(p020c0.C1700q c1700q, boolean z6, int i3, I5.P2 p2) {
        c1700q.p(z6);
        c1700q.c0(i3);
        return c1700q.h(p2);
    }
}
