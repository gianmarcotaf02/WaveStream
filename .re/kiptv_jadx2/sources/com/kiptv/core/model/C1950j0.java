package com.kiptv.core.model;

public final class C1950j0 {

    public final Double f20783a;

    public final Double f20784b;

    public final Double f20785c;

    public final Double f20786d;

    public final Double f20787e;

    public final Double f20788f;
    public final Double g;

    public final Double f20789h;

    public C1950j0(Double d4, Double d6, Double d9, Double d10, Double d11, Double d12, Double d13, Double d14) {
        this.f20783a = d4;
        this.f20784b = d6;
        this.f20785c = d9;
        this.f20786d = d10;
        this.f20787e = d11;
        this.f20788f = d12;
        this.g = d13;
        this.f20789h = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1950j0)) {
            return false;
        }
        C1950j0 c1950j0 = (C1950j0) obj;
        return kotlin.jvm.internal.m.a(this.f20783a, c1950j0.f20783a) && kotlin.jvm.internal.m.a(this.f20784b, c1950j0.f20784b) && kotlin.jvm.internal.m.a(this.f20785c, c1950j0.f20785c) && kotlin.jvm.internal.m.a(this.f20786d, c1950j0.f20786d) && kotlin.jvm.internal.m.a(this.f20787e, c1950j0.f20787e) && kotlin.jvm.internal.m.a(this.f20788f, c1950j0.f20788f) && kotlin.jvm.internal.m.a(this.g, c1950j0.g) && kotlin.jvm.internal.m.a(this.f20789h, c1950j0.f20789h);
    }

    public final int hashCode() {
        Double d4 = this.f20783a;
        int iHashCode = (d4 == null ? 0 : d4.hashCode()) * 31;
        Double d6 = this.f20784b;
        int iHashCode2 = (iHashCode + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d9 = this.f20785c;
        int iHashCode3 = (iHashCode2 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d10 = this.f20786d;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f20787e;
        int iHashCode5 = (iHashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f20788f;
        int iHashCode6 = (iHashCode5 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.g;
        int iHashCode7 = (iHashCode6 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f20789h;
        return iHashCode7 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        return "SkipIntroSegments(recapStart=" + this.f20783a + ", recapEnd=" + this.f20784b + ", introStart=" + this.f20785c + ", introEnd=" + this.f20786d + ", creditsStart=" + this.f20787e + ", creditsEnd=" + this.f20788f + ", previewStart=" + this.g + ", previewEnd=" + this.f20789h + ")";
    }
}
