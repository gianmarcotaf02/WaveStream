package D0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1929f;

    public q(float f9, float f10, float f11, float f12) {
        super(2);
        this.f1926c = f9;
        this.f1927d = f10;
        this.f1928e = f11;
        this.f1929f = f12;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0.q)) {
            return false;
        }
        D0.q qVar = (D0.q) obj;
        return java.lang.Float.compare(this.f1926c, qVar.f1926c) == 0 && java.lang.Float.compare(this.f1927d, qVar.f1927d) == 0 && java.lang.Float.compare(this.f1928e, qVar.f1928e) == 0 && java.lang.Float.compare(this.f1929f, qVar.f1929f) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1929f) + p121o0.p.c(this.f1928e, p121o0.p.c(this.f1927d, java.lang.Float.hashCode(this.f1926c) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f1926c);
        sb.append(", y1=");
        sb.append(this.f1927d);
        sb.append(", x2=");
        sb.append(this.f1928e);
        sb.append(", y2=");
        return p121o0.p.q(sb, this.f1929f, ')');
    }
}
