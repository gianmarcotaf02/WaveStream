package S4;

import D5.C0261o;

public final class C0869h {

    public final String f9393a;

    public final String f9394b;

    public final String f9395c;

    public final Integer f9396d;

    public final Integer f9397e;

    public final Object f9398f;

    public C0869h(String normalized, String matching, String aggressive, Integer num, Integer num2) {
        kotlin.jvm.internal.m.e(normalized, "normalized");
        kotlin.jvm.internal.m.e(matching, "matching");
        kotlin.jvm.internal.m.e(aggressive, "aggressive");
        this.f9393a = normalized;
        this.f9394b = matching;
        this.f9395c = aggressive;
        this.f9396d = num;
        this.f9397e = num2;
        this.f9398f = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new C0261o(22, this));
    }

    public final String a() {
        return (String) this.f9398f.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0869h)) {
            return false;
        }
        C0869h c0869h = (C0869h) obj;
        return kotlin.jvm.internal.m.a(this.f9393a, c0869h.f9393a) && kotlin.jvm.internal.m.a(this.f9394b, c0869h.f9394b) && kotlin.jvm.internal.m.a(this.f9395c, c0869h.f9395c) && kotlin.jvm.internal.m.a(this.f9396d, c0869h.f9396d) && kotlin.jvm.internal.m.a(this.f9397e, c0869h.f9397e);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(this.f9393a.hashCode() * 31, 31, this.f9394b), 31, this.f9395c);
        Integer num = this.f9396d;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9397e;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "MatchKey(normalized=" + this.f9393a + ", matching=" + this.f9394b + ", aggressive=" + this.f9395c + ", year=" + this.f9396d + ", tmdbId=" + this.f9397e + ")";
    }
}
