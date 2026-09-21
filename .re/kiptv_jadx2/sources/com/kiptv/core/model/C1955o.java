package com.kiptv.core.model;

public final class C1955o {

    public final EnumC1956p f20802a;

    public final String f20803b;

    public final Integer f20804c;

    public final String f20805d;

    public C1955o(EnumC1956p enumC1956p, String value, Integer num, String str) {
        kotlin.jvm.internal.m.e(value, "value");
        this.f20802a = enumC1956p;
        this.f20803b = value;
        this.f20804c = num;
        this.f20805d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1955o)) {
            return false;
        }
        C1955o c1955o = (C1955o) obj;
        return this.f20802a == c1955o.f20802a && kotlin.jvm.internal.m.a(this.f20803b, c1955o.f20803b) && kotlin.jvm.internal.m.a(this.f20804c, c1955o.f20804c) && kotlin.jvm.internal.m.a(this.f20805d, c1955o.f20805d);
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f20802a.hashCode() * 31, 31, this.f20803b);
        Integer num = this.f20804c;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f20805d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ExternalRatingItem(source=" + this.f20802a + ", value=" + this.f20803b + ", score=" + this.f20804c + ", link=" + this.f20805d + ")";
    }
}
