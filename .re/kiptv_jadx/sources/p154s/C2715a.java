package p154s;

/* JADX INFO: renamed from: s.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2715a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27108b;

    public C2715a(float f9, float f10) {
        this.f27107a = f9;
        this.f27108b = f10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p154s.C2715a)) {
            return false;
        }
        p154s.C2715a c2715a = (p154s.C2715a) obj;
        return java.lang.Float.compare(this.f27107a, c2715a.f27107a) == 0 && java.lang.Float.compare(this.f27108b, c2715a.f27108b) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f27108b) + (java.lang.Float.hashCode(this.f27107a) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f27107a);
        sb.append(", velocityCoefficient=");
        return p121o0.p.q(sb, this.f27108b, ')');
    }
}
