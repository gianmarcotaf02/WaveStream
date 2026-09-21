package com.kiptv.core.model;

public final class w0 {

    public final t0 f20855a;

    public final int f20856b;

    public final Integer f20857c;

    public final Integer f20858d;

    public w0(t0 t0Var, int i3, Integer num, Integer num2) {
        this.f20855a = t0Var;
        this.f20856b = i3;
        this.f20857c = num;
        this.f20858d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f20855a == w0Var.f20855a && this.f20856b == w0Var.f20856b && kotlin.jvm.internal.m.a(this.f20857c, w0Var.f20857c) && kotlin.jvm.internal.m.a(this.f20858d, w0Var.f20858d);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f20856b, this.f20855a.hashCode() * 31, 31);
        Integer num = this.f20857c;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f20858d;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "TraktPlaybackKey(kind=" + this.f20855a + ", tmdbId=" + this.f20856b + ", season=" + this.f20857c + ", episode=" + this.f20858d + ")";
    }
}
