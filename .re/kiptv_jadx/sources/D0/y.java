package D0;

/* JADX INFO: loaded from: classes.dex */
public final class y extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1955f;

    public y(float f9, float f10, float f11, float f12) {
        super(2);
        this.f1952c = f9;
        this.f1953d = f10;
        this.f1954e = f11;
        this.f1955f = f12;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0.y)) {
            return false;
        }
        D0.y yVar = (D0.y) obj;
        return java.lang.Float.compare(this.f1952c, yVar.f1952c) == 0 && java.lang.Float.compare(this.f1953d, yVar.f1953d) == 0 && java.lang.Float.compare(this.f1954e, yVar.f1954e) == 0 && java.lang.Float.compare(this.f1955f, yVar.f1955f) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1955f) + p121o0.p.c(this.f1954e, p121o0.p.c(this.f1953d, java.lang.Float.hashCode(this.f1952c) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f1952c);
        sb.append(", dy1=");
        sb.append(this.f1953d);
        sb.append(", dx2=");
        sb.append(this.f1954e);
        sb.append(", dy2=");
        return p121o0.p.q(sb, this.f1955f, ')');
    }
}
