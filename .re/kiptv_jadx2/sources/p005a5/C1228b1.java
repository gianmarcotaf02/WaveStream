package p005a5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class C1228b1 implements InterfaceC1268f1 {

    public final String f14238a;

    public final String f14239b;

    public C1228b1(String accessToken, String refreshToken) {
        m.e(accessToken, "accessToken");
        m.e(refreshToken, "refreshToken");
        this.f14238a = accessToken;
        this.f14239b = refreshToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1228b1)) {
            return false;
        }
        C1228b1 c1228b1 = (C1228b1) obj;
        return m.a(this.f14238a, c1228b1.f14238a) && m.a(this.f14239b, c1228b1.f14239b);
    }

    public final int hashCode() {
        return this.f14239b.hashCode() + (this.f14238a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Authenticated(accessToken=");
        sb.append(this.f14238a);
        sb.append(", refreshToken=");
        return f.m(sb, this.f14239b, ")");
    }
}
