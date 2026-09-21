package com.kiptv.core.model;

public final class J {

    public final Integer f19806a;

    public final Integer f19807b;

    public J(Integer num, Integer num2) {
        this.f19806a = num;
        this.f19807b = num2;
    }

    public final Double a() {
        Integer num = this.f19807b;
        if (num != null) {
            return Double.valueOf(((double) num.intValue()) / 1000.0d);
        }
        return null;
    }

    public final Double b() {
        Integer num = this.f19806a;
        if (num != null) {
            return Double.valueOf(((double) num.intValue()) / 1000.0d);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return kotlin.jvm.internal.m.a(this.f19806a, j.f19806a) && kotlin.jvm.internal.m.a(this.f19807b, j.f19807b);
    }

    public final int hashCode() {
        Integer num = this.f19806a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f19807b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "IntroDBSegment(startMs=" + this.f19806a + ", endMs=" + this.f19807b + ")";
    }
}
