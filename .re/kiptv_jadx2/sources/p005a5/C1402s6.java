package p005a5;

import B2.a;
import Y6.f;
import kotlin.jvm.internal.m;

public final class C1402s6 extends AbstractC1412t6 {

    public final String f15074a;

    public final String f15075b;

    public final long f15076c;

    public C1402s6(long j, String userCode, String str) {
        m.e(userCode, "userCode");
        this.f15074a = userCode;
        this.f15075b = str;
        this.f15076c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1402s6)) {
            return false;
        }
        C1402s6 c1402s6 = (C1402s6) obj;
        return m.a(this.f15074a, c1402s6.f15074a) && m.a(this.f15075b, c1402s6.f15075b) && this.f15076c == c1402s6.f15076c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15076c) + a.a(this.f15074a.hashCode() * 31, 31, this.f15075b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Waiting(userCode=");
        sb.append(this.f15074a);
        sb.append(", verificationUrl=");
        sb.append(this.f15075b);
        sb.append(", expiresAtMs=");
        return f.g(this.f15076c, ")", sb);
    }
}
