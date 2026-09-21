package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f20850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f20854e;

    public v0(double d4, long j, long j9, java.lang.String str, java.lang.Integer num) {
        this.f20850a = d4;
        this.f20851b = j;
        this.f20852c = j9;
        this.f20853d = str;
        this.f20854e = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.v0)) {
            return false;
        }
        com.kiptv.core.model.v0 v0Var = (com.kiptv.core.model.v0) obj;
        return java.lang.Double.compare(this.f20850a, v0Var.f20850a) == 0 && this.f20851b == v0Var.f20851b && this.f20852c == v0Var.f20852c && kotlin.jvm.internal.m.a(this.f20853d, v0Var.f20853d) && kotlin.jvm.internal.m.a(this.f20854e, v0Var.f20854e);
    }

    public final int hashCode() {
        int iE = p121o0.p.e(p121o0.p.e(java.lang.Double.hashCode(this.f20850a) * 31, 31, this.f20851b), 31, this.f20852c);
        java.lang.String str = this.f20853d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num = this.f20854e;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TraktPlaybackHint(progressPercent=" + this.f20850a + ", pausedAtMs=" + this.f20851b + ", playbackId=" + this.f20852c + ", title=" + this.f20853d + ", year=" + this.f20854e + ")";
    }
}
