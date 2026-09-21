package D0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1931d;

    public r(float f9, float f10) {
        super(1);
        this.f1930c = f9;
        this.f1931d = f10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0.r)) {
            return false;
        }
        D0.r rVar = (D0.r) obj;
        return java.lang.Float.compare(this.f1930c, rVar.f1930c) == 0 && java.lang.Float.compare(this.f1931d, rVar.f1931d) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1931d) + (java.lang.Float.hashCode(this.f1930c) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f1930c);
        sb.append(", y=");
        return p121o0.p.q(sb, this.f1931d, ')');
    }
}
