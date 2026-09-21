package D0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1951f;

    public x(float f9, float f10, float f11, float f12) {
        super(1);
        this.f1948c = f9;
        this.f1949d = f10;
        this.f1950e = f11;
        this.f1951f = f12;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0.x)) {
            return false;
        }
        D0.x xVar = (D0.x) obj;
        return java.lang.Float.compare(this.f1948c, xVar.f1948c) == 0 && java.lang.Float.compare(this.f1949d, xVar.f1949d) == 0 && java.lang.Float.compare(this.f1950e, xVar.f1950e) == 0 && java.lang.Float.compare(this.f1951f, xVar.f1951f) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1951f) + p121o0.p.c(this.f1950e, p121o0.p.c(this.f1949d, java.lang.Float.hashCode(this.f1948c) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f1948c);
        sb.append(", dy1=");
        sb.append(this.f1949d);
        sb.append(", dx2=");
        sb.append(this.f1950e);
        sb.append(", dy2=");
        return p121o0.p.q(sb, this.f1951f, ')');
    }
}
