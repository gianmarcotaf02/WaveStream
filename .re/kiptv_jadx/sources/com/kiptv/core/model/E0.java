package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@p119n8.i(with = com.kiptv.core.model.H0.class)
public final class E0 {
    public static final com.kiptv.core.model.XtreamEpisode$Companion Companion = new com.kiptv.core.model.XtreamEpisode$Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f19734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.kiptv.core.model.F0 f19735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f19736f;
    public final java.lang.Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f19737h;

    public /* synthetic */ E0(java.lang.String str, int i3, java.lang.String str2, java.lang.String str3, com.kiptv.core.model.F0 f9, java.lang.String str4, java.lang.Integer num, int i9) {
        this(str, i3, str2, str3, (i9 & 16) != 0 ? null : f9, (i9 & 32) != 0 ? null : str4, num, (java.lang.Integer) null);
    }

    public final int a() {
        java.lang.Integer num = this.f19737h;
        return num != null ? num.intValue() : this.f19732b;
    }

    public final java.lang.Integer b() {
        return this.g;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.E0)) {
            return false;
        }
        com.kiptv.core.model.E0 e6 = (com.kiptv.core.model.E0) obj;
        return kotlin.jvm.internal.m.a(this.f19731a, e6.f19731a) && this.f19732b == e6.f19732b && kotlin.jvm.internal.m.a(this.f19733c, e6.f19733c) && kotlin.jvm.internal.m.a(this.f19734d, e6.f19734d) && kotlin.jvm.internal.m.a(this.f19735e, e6.f19735e) && kotlin.jvm.internal.m.a(this.f19736f, e6.f19736f) && kotlin.jvm.internal.m.a(this.g, e6.g) && kotlin.jvm.internal.m.a(this.f19737h, e6.f19737h);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f19732b, this.f19731a.hashCode() * 31, 31);
        java.lang.String str = this.f19733c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f19734d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.kiptv.core.model.F0 f9 = this.f19735e;
        int iHashCode3 = (iHashCode2 + (f9 == null ? 0 : f9.hashCode())) * 31;
        java.lang.String str3 = this.f19736f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Integer num = this.g;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f19737h;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "XtreamEpisode(id=" + this.f19731a + ", episodeNum=" + this.f19732b + ", title=" + this.f19733c + ", containerExtension=" + this.f19734d + ", info=" + this.f19735e + ", added=" + this.f19736f + ", season=" + this.g + ", normalizedEpisodeNum=" + this.f19737h + ")";
    }

    public E0(java.lang.String id, int i3, java.lang.String str, java.lang.String str2, com.kiptv.core.model.F0 f9, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2) {
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
