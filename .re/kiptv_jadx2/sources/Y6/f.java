package Y6;

import E6.InterfaceC0331d;
import E6.v;
import Z2.J0;
import androidx.media3.common.util.Log;
import com.google.android.gms.internal.cast.A2;
import com.google.android.gms.internal.play_billing.C1866p0;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.util.reflect.TypeInfo;
import io.sentry.profilemeasurements.ProfileMeasurement;
import java.util.HashMap;
import org.xml.sax.Attributes;
import p136q.C2661e;
import p194x6.j;

public abstract class f {
    public static int A(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("pad")) {
            return 1;
        }
        if (str.equals("reflect")) {
            return 2;
        }
        if (str.equals("repeat")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(str));
    }

    public static int B(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals(ProfileMeasurement.UNIT_PERCENT)) {
            return 9;
        }
        throw new IllegalArgumentException("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
    }

    public static boolean a(int i3) {
        if (i3 == 1 || i3 == 2) {
            return false;
        }
        if (i3 == 3 || i3 == 4) {
            return true;
        }
        throw null;
    }

    public static int b(int i3, int i9, int i10) {
        return A2.K(i3) + i9 + i10;
    }

    public static int c(int i3, int i9, int i10, int i11) {
        return ((i3 * i9) / i10) + i11;
    }

    public static int d(Attributes attributes, int i3) {
        return J0.a(attributes.getLocalName(i3)).ordinal();
    }

    public static String e(int i3, String str) {
        return i3 + str;
    }

    public static String f(int i3, String str, String str2) {
        return str + i3 + str2;
    }

    public static String g(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String h(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String i(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String j(StringBuilder sb, int i3, char c9) {
        sb.append(i3);
        sb.append(c9);
        return sb.toString();
    }

    public static String k(StringBuilder sb, int i3, String str) {
        sb.append(i3);
        sb.append(str);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, char c9) {
        sb.append(str);
        sb.append(c9);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder n(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void p(int i3, String str, String str2) {
        Log.w(str2, str + i3);
    }

    public static void q(int i3, HashMap map, String str, int i9, String str2) {
        map.put(str, Integer.valueOf(i3));
        map.put(str2, Integer.valueOf(i9));
    }

    public static void r(int i3, C2661e c2661e, String str, int i9, String str2) {
        c2661e.put(str, Integer.valueOf(i3));
        c2661e.put(str2, Integer.valueOf(i9));
    }

    public static void s(InterfaceC0331d interfaceC0331d, v vVar, HttpRequestBuilder httpRequestBuilder) {
        httpRequestBuilder.setBodyType(new TypeInfo(interfaceC0331d, vVar));
    }

    public static void t(HttpRequestBuilder httpRequestBuilder, Url url, j jVar, HttpRequestBuilder httpRequestBuilder2) {
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        jVar.invoke(httpRequestBuilder2);
    }

    public static void u(Exception exc, String str, String str2) {
        android.util.Log.d(str2, str + exc);
    }

    public static void v(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    public static void w(StringBuilder sb, int i3, String str, int i9, String str2) {
        sb.append(i3);
        sb.append(str);
        sb.append(i9);
        sb.append(str2);
    }

    public static int x(int i3, int i9, int i10) {
        return C1866p0.U(i3) + i9 + i10;
    }

    public static int y(int i3, int i9, int i10, int i11) {
        return A2.K(i3) + i9 + i10 + i11;
    }

    public static void z(int i3, HashMap map, String str, int i9, String str2) {
        map.put(str, Integer.valueOf(i3));
        map.put(str2, Integer.valueOf(i9));
    }
}
