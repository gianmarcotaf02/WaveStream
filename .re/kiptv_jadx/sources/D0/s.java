package D0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1935f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1937i;

    public s(float f9, float f10, float f11, boolean z6, boolean z9, float f12, float f13) {
        super(3);
        this.f1932c = f9;
        this.f1933d = f10;
        this.f1934e = f11;
        this.f1935f = z6;
        this.g = z9;
        this.f1936h = f12;
        this.f1937i = f13;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0.s)) {
            return false;
        }
        D0.s sVar = (D0.s) obj;
        return java.lang.Float.compare(this.f1932c, sVar.f1932c) == 0 && java.lang.Float.compare(this.f1933d, sVar.f1933d) == 0 && java.lang.Float.compare(this.f1934e, sVar.f1934e) == 0 && this.f1935f == sVar.f1935f && this.g == sVar.g && java.lang.Float.compare(this.f1936h, sVar.f1936h) == 0 && java.lang.Float.compare(this.f1937i, sVar.f1937i) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1937i) + p121o0.p.c(this.f1936h, p121o0.p.f(p121o0.p.f(p121o0.p.c(this.f1934e, p121o0.p.c(this.f1933d, java.lang.Float.hashCode(this.f1932c) * 31, 31), 31), 31, this.f1935f), 31, this.g), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f1932c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f1933d);
        sb.append(", theta=");
        sb.append(this.f1934e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f1935f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartDx=");
        sb.append(this.f1936h);
        sb.append(", arcStartDy=");
        return p121o0.p.q(sb, this.f1937i, ')');
    }
}
