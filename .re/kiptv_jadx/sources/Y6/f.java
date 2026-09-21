package Y6;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ int A(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Name is null");
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
        throw new java.lang.IllegalArgumentException("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(str));
    }

    public static /* synthetic */ int B(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Name is null");
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
        if (str.equals(io.sentry.profilemeasurements.ProfileMeasurement.UNIT_PERCENT)) {
            return 9;
        }
        throw new java.lang.IllegalArgumentException("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
    }

    public static /* synthetic */ boolean a(int i3) {
        if (i3 == 1 || i3 == 2) {
            return false;
        }
        if (i3 == 3 || i3 == 4) {
            return true;
        }
        throw null;
    }

    public static int b(int i3, int i9, int i10) {
        return com.google.android.gms.internal.cast.A2.K(i3) + i9 + i10;
    }

    public static int c(int i3, int i9, int i10, int i11) {
        return ((i3 * i9) / i10) + i11;
    }

    public static int d(org.xml.sax.Attributes attributes, int i3) {
        return Z2.J0.a(attributes.getLocalName(i3)).ordinal();
    }

    public static java.lang.String e(int i3, java.lang.String str) {
        return i3 + str;
    }

    public static java.lang.String f(int i3, java.lang.String str, java.lang.String str2) {
        return str + i3 + str2;
    }

    public static java.lang.String g(long j, java.lang.String str, java.lang.StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static java.lang.String h(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + str2 + str3;
    }

    public static java.lang.String i(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static java.lang.String j(java.lang.StringBuilder sb, int i3, char c9) {
        sb.append(i3);
        sb.append(c9);
        return sb.toString();
    }

    public static java.lang.String k(java.lang.StringBuilder sb, int i3, java.lang.String str) {
        sb.append(i3);
        sb.append(str);
        return sb.toString();
    }

    public static java.lang.String l(java.lang.StringBuilder sb, java.lang.String str, char c9) {
        sb.append(str);
        sb.append(c9);
        return sb.toString();
    }

    public static java.lang.String m(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static java.lang.StringBuilder n(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static java.lang.StringBuilder o(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void p(int i3, java.lang.String str, java.lang.String str2) {
        androidx.media3.common.util.Log.w(str2, str + i3);
    }

    public static void q(int i3, java.util.HashMap map, java.lang.String str, int i9, java.lang.String str2) {
        map.put(str, java.lang.Integer.valueOf(i3));
        map.put(str2, java.lang.Integer.valueOf(i9));
    }

    public static void r(int i3, p136q.C2661e c2661e, java.lang.String str, int i9, java.lang.String str2) {
        c2661e.put(str, java.lang.Integer.valueOf(i3));
        c2661e.put(str2, java.lang.Integer.valueOf(i9));
    }

    public static void s(E6.InterfaceC0331d interfaceC0331d, E6.v vVar, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(interfaceC0331d, vVar));
    }

    public static void t(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.http.Url url, p194x6.j jVar, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2) {
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        jVar.invoke(httpRequestBuilder2);
    }

    public static void u(java.lang.Exception exc, java.lang.String str, java.lang.String str2) {
        android.util.Log.d(str2, str + exc);
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        androidx.media3.common.util.Log.w(str3, str + str2);
    }

    public static void w(java.lang.StringBuilder sb, int i3, java.lang.String str, int i9, java.lang.String str2) {
        sb.append(i3);
        sb.append(str);
        sb.append(i9);
        sb.append(str2);
    }

    public static int x(int i3, int i9, int i10) {
        return com.google.android.gms.internal.play_billing.C1866p0.U(i3) + i9 + i10;
    }

    public static int y(int i3, int i9, int i10, int i11) {
        return com.google.android.gms.internal.cast.A2.K(i3) + i9 + i10 + i11;
    }

    public static void z(int i3, java.util.HashMap map, java.lang.String str, int i9, java.lang.String str2) {
        map.put(str, java.lang.Integer.valueOf(i3));
        map.put(str2, java.lang.Integer.valueOf(i9));
    }
}
