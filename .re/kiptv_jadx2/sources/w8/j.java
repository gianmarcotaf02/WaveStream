package w8;

import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p103m.P0;
import v5.L;

public final class j {

    public static final j f30554e;

    public static final j f30555f;

    public final boolean f30556a;

    public final boolean f30557b;

    public final String[] f30558c;

    public final String[] f30559d;

    static {
        C3029i c3029i = C3029i.f30550r;
        C3029i c3029i2 = C3029i.f30551s;
        C3029i c3029i3 = C3029i.f30552t;
        C3029i c3029i4 = C3029i.f30544l;
        C3029i c3029i5 = C3029i.f30546n;
        C3029i c3029i6 = C3029i.f30545m;
        C3029i c3029i7 = C3029i.f30547o;
        C3029i c3029i8 = C3029i.f30549q;
        C3029i c3029i9 = C3029i.f30548p;
        C3029i[] c3029iArr = {c3029i, c3029i2, c3029i3, c3029i4, c3029i5, c3029i6, c3029i7, c3029i8, c3029i9};
        C3029i[] c3029iArr2 = {c3029i, c3029i2, c3029i3, c3029i4, c3029i5, c3029i6, c3029i7, c3029i8, c3029i9, C3029i.j, C3029i.f30543k, C3029i.f30541h, C3029i.f30542i, C3029i.f30540f, C3029i.g, C3029i.f30539e};
        P0 p2 = new P0();
        p2.c((C3029i[]) Arrays.copyOf(c3029iArr, 9));
        F f9 = F.TLS_1_3;
        F f10 = F.TLS_1_2;
        p2.e(f9, f10);
        if (!p2.f24958a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        p2.f24959b = true;
        p2.a();
        P0 p9 = new P0();
        p9.c((C3029i[]) Arrays.copyOf(c3029iArr2, 16));
        p9.e(f9, f10);
        if (!p9.f24958a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        p9.f24959b = true;
        f30554e = p9.a();
        P0 p10 = new P0();
        p10.c((C3029i[]) Arrays.copyOf(c3029iArr2, 16));
        p10.e(f9, f10, F.TLS_1_1, F.TLS_1_0);
        if (!p10.f24958a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        p10.f24959b = true;
        p10.a();
        f30555f = new j(false, false, null, null);
    }

    public j(boolean z6, boolean z9, String[] strArr, String[] strArr2) {
        this.f30556a = z6;
        this.f30557b = z9;
        this.f30558c = strArr;
        this.f30559d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f30558c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C3029i.f30536b.c(str));
        }
        return p078i6.o.N1(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f30556a) {
            return false;
        }
        String[] strArr = this.f30559d;
        if (strArr != null && !x8.b.j(strArr, sSLSocket.getEnabledProtocols(), p093k6.a.f24495i)) {
            return false;
        }
        String[] strArr2 = this.f30558c;
        return strArr2 == null || x8.b.j(strArr2, sSLSocket.getEnabledCipherSuites(), C3029i.f30537c);
    }

    public final List c() {
        String[] strArr = this.f30559d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC1853k0.r(str));
        }
        return p078i6.o.N1(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z6 = jVar.f30556a;
        boolean z9 = this.f30556a;
        if (z9 != z6) {
            return false;
        }
        if (z9) {
            return Arrays.equals(this.f30558c, jVar.f30558c) && Arrays.equals(this.f30559d, jVar.f30559d) && this.f30557b == jVar.f30557b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f30556a) {
            return 17;
        }
        String[] strArr = this.f30558c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f30559d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f30557b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f30556a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return L.a(sb, this.f30557b, ')');
    }
}
