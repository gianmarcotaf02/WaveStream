package p005a5;

import kotlin.jvm.internal.m;

public final class O0 extends Q0 {

    public final String f13724a;

    public final Integer f13725b;

    public O0(String str, Integer num) {
        this.f13724a = str;
        this.f13725b = num;
    }

    public static O0 a(O0 o8, Integer num) {
        String str = o8.f13724a;
        o8.getClass();
        return new O0(str, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o8 = (O0) obj;
        return m.a(this.f13724a, o8.f13724a) && m.a(this.f13725b, o8.f13725b);
    }

    public final int hashCode() {
        int iHashCode = this.f13724a.hashCode() * 31;
        Integer num = this.f13725b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "LoggedIn(username=" + this.f13724a + ", remainingDownloads=" + this.f13725b + ")";
    }
}
