package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f19806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f19807b;

    public J(java.lang.Integer num, java.lang.Integer num2) {
        this.f19806a = num;
        this.f19807b = num2;
    }

    public final java.lang.Double a() {
        java.lang.Integer num = this.f19807b;
        if (num != null) {
            return java.lang.Double.valueOf(((double) num.intValue()) / 1000.0d);
        }
        return null;
    }

    public final java.lang.Double b() {
        java.lang.Integer num = this.f19806a;
        if (num != null) {
            return java.lang.Double.valueOf(((double) num.intValue()) / 1000.0d);
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.J)) {
            return false;
        }
        com.kiptv.core.model.J j = (com.kiptv.core.model.J) obj;
        return kotlin.jvm.internal.m.a(this.f19806a, j.f19806a) && kotlin.jvm.internal.m.a(this.f19807b, j.f19807b);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f19806a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.f19807b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "IntroDBSegment(startMs=" + this.f19806a + ", endMs=" + this.f19807b + ")";
    }
}
