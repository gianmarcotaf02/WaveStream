package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w8.j f30554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w8.j f30555f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String[] f30558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f30559d;

    static {
        w8.C3029i c3029i = w8.C3029i.f30550r;
        w8.C3029i c3029i2 = w8.C3029i.f30551s;
        w8.C3029i c3029i3 = w8.C3029i.f30552t;
        w8.C3029i c3029i4 = w8.C3029i.f30544l;
        w8.C3029i c3029i5 = w8.C3029i.f30546n;
        w8.C3029i c3029i6 = w8.C3029i.f30545m;
        w8.C3029i c3029i7 = w8.C3029i.f30547o;
        w8.C3029i c3029i8 = w8.C3029i.f30549q;
        w8.C3029i c3029i9 = w8.C3029i.f30548p;
        w8.C3029i[] c3029iArr = {c3029i, c3029i2, c3029i3, c3029i4, c3029i5, c3029i6, c3029i7, c3029i8, c3029i9};
        w8.C3029i[] c3029iArr2 = {c3029i, c3029i2, c3029i3, c3029i4, c3029i5, c3029i6, c3029i7, c3029i8, c3029i9, w8.C3029i.j, w8.C3029i.f30543k, w8.C3029i.f30541h, w8.C3029i.f30542i, w8.C3029i.f30540f, w8.C3029i.g, w8.C3029i.f30539e};
        p103m.P0 p2 = new p103m.P0();
        p2.c((w8.C3029i[]) java.util.Arrays.copyOf(c3029iArr, 9));
        w8.F f9 = w8.F.TLS_1_3;
        w8.F f10 = w8.F.TLS_1_2;
        p2.e(f9, f10);
        if (!p2.f24958a) {
            throw new java.lang.IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        p2.f24959b = true;
        p2.a();
        p103m.P0 p9 = new p103m.P0();
        p9.c((w8.C3029i[]) java.util.Arrays.copyOf(c3029iArr2, 16));
        p9.e(f9, f10);
        if (!p9.f24958a) {
            throw new java.lang.IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        p9.f24959b = true;
        f30554e = p9.a();
        p103m.P0 p10 = new p103m.P0();
        p10.c((w8.C3029i[]) java.util.Arrays.copyOf(c3029iArr2, 16));
        p10.e(f9, f10, w8.F.TLS_1_1, w8.F.TLS_1_0);
        if (!p10.f24958a) {
            throw new java.lang.IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        p10.f24959b = true;
        p10.a();
        f30555f = new w8.j(false, false, null, null);
    }

    public j(boolean z6, boolean z9, java.lang.String[] strArr, java.lang.String[] strArr2) {
        this.f30556a = z6;
        this.f30557b = z9;
        this.f30558c = strArr;
        this.f30559d = strArr2;
    }

    public final java.util.List a() {
        java.lang.String[] strArr = this.f30558c;
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(w8.C3029i.f30536b.c(str));
        }
        return p078i6.o.N1(arrayList);
    }

    public final boolean b(javax.net.ssl.SSLSocket sSLSocket) {
        if (!this.f30556a) {
            return false;
        }
        java.lang.String[] strArr = this.f30559d;
        if (strArr != null && !x8.b.j(strArr, sSLSocket.getEnabledProtocols(), p093k6.a.f24495i)) {
            return false;
        }
        java.lang.String[] strArr2 = this.f30558c;
        return strArr2 == null || x8.b.j(strArr2, sSLSocket.getEnabledCipherSuites(), w8.C3029i.f30537c);
    }

    public final java.util.List c() {
        java.lang.String[] strArr = this.f30559d;
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(com.google.android.gms.internal.play_billing.AbstractC1853k0.r(str));
        }
        return p078i6.o.N1(arrayList);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof w8.j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        w8.j jVar = (w8.j) obj;
        boolean z6 = jVar.f30556a;
        boolean z9 = this.f30556a;
        if (z9 != z6) {
            return false;
        }
        if (z9) {
            return java.util.Arrays.equals(this.f30558c, jVar.f30558c) && java.util.Arrays.equals(this.f30559d, jVar.f30559d) && this.f30557b == jVar.f30557b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f30556a) {
            return 17;
        }
        java.lang.String[] strArr = this.f30558c;
        int iHashCode = (527 + (strArr != null ? java.util.Arrays.hashCode(strArr) : 0)) * 31;
        java.lang.String[] strArr2 = this.f30559d;
        return ((iHashCode + (strArr2 != null ? java.util.Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f30557b ? 1 : 0);
    }

    public final java.lang.String toString() {
        if (!this.f30556a) {
            return "ConnectionSpec()";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(java.util.Objects.toString(a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(java.util.Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return v5.L.a(sb, this.f30557b, ')');
    }
}
