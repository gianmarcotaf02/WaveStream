package com.kiptv.core.model;

@p119n8.i(with = C0.class)
public final class B0 {
    public static final XtreamEPGProgram$Companion Companion = new XtreamEPGProgram$Companion();

    public final String f19673a;

    public final String f19674b;

    public final String f19675c;

    public final String f19676d;

    public final String f19677e;

    public final String f19678f;
    public final String g;

    public B0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f19673a = str;
        this.f19674b = str2;
        this.f19675c = str3;
        this.f19676d = str4;
        this.f19677e = str5;
        this.f19678f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b9 = (B0) obj;
        return kotlin.jvm.internal.m.a(this.f19673a, b9.f19673a) && kotlin.jvm.internal.m.a(this.f19674b, b9.f19674b) && kotlin.jvm.internal.m.a(this.f19675c, b9.f19675c) && kotlin.jvm.internal.m.a(this.f19676d, b9.f19676d) && kotlin.jvm.internal.m.a(this.f19677e, b9.f19677e) && kotlin.jvm.internal.m.a(this.f19678f, b9.f19678f) && kotlin.jvm.internal.m.a(this.g, b9.g);
    }

    public final int hashCode() {
        String str = this.f19673a;
        int iA = B2.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f19674b);
        String str2 = this.f19675c;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19676d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19677e;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f19678f;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XtreamEPGProgram(id=");
        sb.append(this.f19673a);
        sb.append(", title=");
        sb.append(this.f19674b);
        sb.append(", description=");
        sb.append(this.f19675c);
        sb.append(", start=");
        sb.append(this.f19676d);
        sb.append(", end=");
        sb.append(this.f19677e);
        sb.append(", startTimestamp=");
        sb.append(this.f19678f);
        sb.append(", stopTimestamp=");
        return Y6.f.m(sb, this.g, ")");
    }
}
