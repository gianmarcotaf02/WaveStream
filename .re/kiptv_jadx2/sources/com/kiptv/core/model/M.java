package com.kiptv.core.model;

public final class M {

    public final int f19842a;

    public final String f19843b;

    public final String f19844c;

    public final String f19845d;

    public final String f19846e;

    public final String f19847f;
    public final String g;

    public final Integer f19848h;

    public final String f19849i;
    public final String j;

    public final Integer f19850k;

    public final Integer f19851l;

    public final String f19852m;

    public final String f19853n;

    public M(int i3, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, Integer num2, Integer num3, String str9, String str10) {
        this.f19842a = i3;
        this.f19843b = str;
        this.f19844c = str2;
        this.f19845d = str3;
        this.f19846e = str4;
        this.f19847f = str5;
        this.g = str6;
        this.f19848h = num;
        this.f19849i = str7;
        this.j = str8;
        this.f19850k = num2;
        this.f19851l = num3;
        this.f19852m = str9;
        this.f19853n = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        return this.f19842a == m8.f19842a && kotlin.jvm.internal.m.a(this.f19843b, m8.f19843b) && kotlin.jvm.internal.m.a(this.f19844c, m8.f19844c) && kotlin.jvm.internal.m.a(this.f19845d, m8.f19845d) && kotlin.jvm.internal.m.a(this.f19846e, m8.f19846e) && kotlin.jvm.internal.m.a(this.f19847f, m8.f19847f) && kotlin.jvm.internal.m.a(this.g, m8.g) && kotlin.jvm.internal.m.a(this.f19848h, m8.f19848h) && kotlin.jvm.internal.m.a(this.f19849i, m8.f19849i) && kotlin.jvm.internal.m.a(this.j, m8.j) && kotlin.jvm.internal.m.a(this.f19850k, m8.f19850k) && kotlin.jvm.internal.m.a(this.f19851l, m8.f19851l) && kotlin.jvm.internal.m.a(this.f19852m, m8.f19852m) && kotlin.jvm.internal.m.a(this.f19853n, m8.f19853n);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f19842a) * 31;
        String str = this.f19843b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19844c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19845d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19846e;
        int iA = B2.a.a(B2.a.a((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f19847f), 31, this.g);
        Integer num = this.f19848h;
        int iHashCode5 = (iA + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f19849i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.f19850k;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f19851l;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.f19852m;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f19853n;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("M3UEntry(duration=");
        sb.append(this.f19842a);
        sb.append(", tvgId=");
        sb.append(this.f19843b);
        sb.append(", tvgName=");
        sb.append(this.f19844c);
        sb.append(", tvgLogo=");
        sb.append(this.f19845d);
        sb.append(", groupTitle=");
        sb.append(this.f19846e);
        sb.append(", displayName=");
        sb.append(this.f19847f);
        sb.append(", streamUrl=");
        sb.append(this.g);
        sb.append(", channelNumber=");
        sb.append(this.f19848h);
        sb.append(", catchup=");
        sb.append(this.f19849i);
        sb.append(", catchupSource=");
        sb.append(this.j);
        sb.append(", catchupDays=");
        sb.append(this.f19850k);
        sb.append(", timeshift=");
        sb.append(this.f19851l);
        sb.append(", userAgent=");
        sb.append(this.f19852m);
        sb.append(", referer=");
        return Y6.f.m(sb, this.f19853n, ")");
    }
}
