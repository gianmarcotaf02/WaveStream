package B2;

import C5.c2;
import E6.l;
import E6.t;
import I0.c;
import I5.P2;
import android.util.Log;
import com.google.common.util.concurrent.P;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.u;
import p020c0.C1700q;
import p070h6.k;
import p078i6.D;
import p175v0.y;

public abstract class a {
    public static String A(int i3) {
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

    public static int a(int i3, int i9, String str) {
        return (str.hashCode() + i3) * i9;
    }

    public static int b(int i3, int i9, List list) {
        return (list.hashCode() + i3) * i9;
    }

    public static int c(int i3, int i9, Map map) {
        return (map.hashCode() + i3) * i9;
    }

    public static l d(Class cls, String str, String str2, int i3, C c9) {
        return c9.f(new r(cls, str, str2, i3));
    }

    public static t e(Class cls, String str, String str2, int i3, C c9) {
        return c9.h(new u(cls, str, str2, i3));
    }

    public static I3.b f(Object obj) {
        P.u0(obj);
        return new I3.b();
    }

    public static HttpRequestBuilder g(String str, String str2, String str3) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        UtilsKt.parameter(httpRequestBuilder, str2, str3);
        return httpRequestBuilder;
    }

    public static HttpStatement h(HttpMethod.Companion companion, HttpRequestBuilder httpRequestBuilder, HttpRequestBuilder httpRequestBuilder2, HttpClient httpClient) {
        httpRequestBuilder.setMethod(companion.getGet());
        return new HttpStatement(httpRequestBuilder2, httpClient);
    }

    public static String i(char c9, String str, String str2) {
        return str + str2 + c9;
    }

    public static String j(long j, String str) {
        return str + j;
    }

    public static String k(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String l(String str, String str2, String str3) {
        return p015b5.u.b(str3, D.J0(new k(str, str2)));
    }

    public static String m(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String n(StringBuilder sb, Object obj, char c9) {
        sb.append(obj);
        sb.append(c9);
        return sb.toString();
    }

    public static String o(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String p(Object[] objArr, int i3, String str, StringBuilder sb) {
        sb.append(String.format(str, Arrays.copyOf(objArr, i3)));
        return sb.toString();
    }

    public static StringBuilder q(int i3, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(i3);
        return sb;
    }

    public static y r(C1700q c1700q) {
        y yVar = new y();
        c1700q.n0(yVar);
        return yVar;
    }

    public static void s(int i3, int i9, int i10, int i11, int i12) {
        c.a(i3);
        c.a(i9);
        c.a(i10);
        c.a(i11);
        c.a(i12);
    }

    public static void t(C1700q c1700q, boolean z6, boolean z9, boolean z10) {
        c1700q.p(z6);
        c1700q.p(z9);
        c1700q.p(z10);
    }

    public static void u(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void v(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    public static void w(StringBuilder sb, String str, int i3, String str2) {
        sb.append(str);
        sb.append(i3);
        Log.d(str2, sb.toString());
    }

    public static void x(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static boolean y(C1700q c1700q, int i3, c2 c2Var) {
        c1700q.p(false);
        c1700q.c0(i3);
        return c1700q.h(c2Var);
    }

    public static boolean z(C1700q c1700q, boolean z6, int i3, P2 p2) {
        c1700q.p(z6);
        c1700q.c0(i3);
        return c1700q.h(p2);
    }
}
