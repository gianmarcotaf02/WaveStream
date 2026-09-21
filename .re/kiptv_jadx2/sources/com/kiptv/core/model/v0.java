package com.kiptv.core.model;

public final class v0 {

    public final double f20850a;

    public final long f20851b;

    public final long f20852c;

    public final String f20853d;

    public final Integer f20854e;

    public v0(double d4, long j, long j9, String str, Integer num) {
        this.f20850a = d4;
        this.f20851b = j;
        this.f20852c = j9;
        this.f20853d = str;
        this.f20854e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Double.compare(this.f20850a, v0Var.f20850a) == 0 && this.f20851b == v0Var.f20851b && this.f20852c == v0Var.f20852c && kotlin.jvm.internal.m.a(this.f20853d, v0Var.f20853d) && kotlin.jvm.internal.m.a(this.f20854e, v0Var.f20854e);
    }

    public final int hashCode() {
        int iE = p121o0.p.e(p121o0.p.e(Double.hashCode(this.f20850a) * 31, 31, this.f20851b), 31, this.f20852c);
        String str = this.f20853d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f20854e;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "TraktPlaybackHint(progressPercent=" + this.f20850a + ", pausedAtMs=" + this.f20851b + ", playbackId=" + this.f20852c + ", title=" + this.f20853d + ", year=" + this.f20854e + ")";
    }
}
