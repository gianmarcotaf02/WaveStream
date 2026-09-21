package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@p119n8.i(with = com.kiptv.core.model.G0.class)
public final class F0 {
    public static final com.kiptv.core.model.XtreamEpisodeInfo$Companion Companion = new com.kiptv.core.model.XtreamEpisodeInfo$Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19769c;

    public F0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f19767a = str;
        this.f19768b = str2;
        this.f19769c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.F0)) {
            return false;
        }
        com.kiptv.core.model.F0 f9 = (com.kiptv.core.model.F0) obj;
        return kotlin.jvm.internal.m.a(this.f19767a, f9.f19767a) && kotlin.jvm.internal.m.a(this.f19768b, f9.f19768b) && kotlin.jvm.internal.m.a(this.f19769c, f9.f19769c);
    }

    public final int hashCode() {
        java.lang.String str = this.f19767a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f19768b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f19769c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("XtreamEpisodeInfo(duration=");
        sb.append(this.f19767a);
        sb.append(", plot=");
        sb.append(this.f19768b);
        sb.append(", movieImage=");
        return Y6.f.m(sb, this.f19769c, ")");
    }
}
