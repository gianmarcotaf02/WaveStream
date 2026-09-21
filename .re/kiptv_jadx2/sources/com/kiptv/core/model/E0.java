package com.kiptv.core.model;

@p119n8.i(with = H0.class)
public final class E0 {
    public static final XtreamEpisode$Companion Companion = new XtreamEpisode$Companion();

    public final String f19731a;

    public final int f19732b;

    public final String f19733c;

    public final String f19734d;

    public final F0 f19735e;

    public final String f19736f;
    public final Integer g;

    public final Integer f19737h;

    public E0(String str, int i3, String str2, String str3, F0 f9, String str4, Integer num, int i9) {
        this(str, i3, str2, str3, (i9 & 16) != 0 ? null : f9, (i9 & 32) != 0 ? null : str4, num, (Integer) null);
    }

    public final int a() {
        Integer num = this.f19737h;
        return num != null ? num.intValue() : this.f19732b;
    }

    public final Integer b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e6 = (E0) obj;
        return kotlin.jvm.internal.m.a(this.f19731a, e6.f19731a) && this.f19732b == e6.f19732b && kotlin.jvm.internal.m.a(this.f19733c, e6.f19733c) && kotlin.jvm.internal.m.a(this.f19734d, e6.f19734d) && kotlin.jvm.internal.m.a(this.f19735e, e6.f19735e) && kotlin.jvm.internal.m.a(this.f19736f, e6.f19736f) && kotlin.jvm.internal.m.a(this.g, e6.g) && kotlin.jvm.internal.m.a(this.f19737h, e6.f19737h);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f19732b, this.f19731a.hashCode() * 31, 31);
        String str = this.f19733c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19734d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        F0 f9 = this.f19735e;
        int iHashCode3 = (iHashCode2 + (f9 == null ? 0 : f9.hashCode())) * 31;
        String str3 = this.f19736f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f19737h;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "XtreamEpisode(id=" + this.f19731a + ", episodeNum=" + this.f19732b + ", title=" + this.f19733c + ", containerExtension=" + this.f19734d + ", info=" + this.f19735e + ", added=" + this.f19736f + ", season=" + this.g + ", normalizedEpisodeNum=" + this.f19737h + ")";
    }

    public E0(String id, int i3, String str, String str2, F0 f9, String str3, Integer num, Integer num2) {
        kotlin.jvm.internal.m.e(id, "id");
        this.f19731a = id;
        this.f19732b = i3;
        this.f19733c = str;
        this.f19734d = str2;
        this.f19735e = f9;
        this.f19736f = str3;
        this.g = num;
        this.f19737h = num2;
    }
}
