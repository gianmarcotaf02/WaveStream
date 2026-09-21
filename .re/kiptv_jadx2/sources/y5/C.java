package y5;

import D0.C0205f;

public final class C {

    public final B f31897a;

    public final String f31898b;

    public final C0205f f31899c;

    public C(B b9, String str, C0205f c0205f) {
        this.f31897a = b9;
        this.f31898b = str;
        this.f31899c = c0205f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c9 = (C) obj;
        return this.f31897a == c9.f31897a && kotlin.jvm.internal.m.a(this.f31898b, c9.f31898b) && kotlin.jvm.internal.m.a(this.f31899c, c9.f31899c);
    }

    public final int hashCode() {
        int iHashCode = this.f31897a.hashCode() * 31;
        String str = this.f31898b;
        return this.f31899c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "TvTabEntry(tab=" + this.f31897a + ", labelKey=" + this.f31898b + ", icon=" + this.f31899c + ")";
    }
}
