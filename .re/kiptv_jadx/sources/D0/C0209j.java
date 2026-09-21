package D0;

/* JADX INFO: renamed from: D0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0209j extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1908f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1910i;

    public C0209j(float f9, float f10, float f11, boolean z6, boolean z9, float f12, float f13) {
        super(3);
        this.f1905c = f9;
        this.f1906d = f10;
        this.f1907e = f11;
        this.f1908f = z6;
        this.g = z9;
        this.f1909h = f12;
        this.f1910i = f13;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0.C0209j)) {
            return false;
        }
        D0.C0209j c0209j = (D0.C0209j) obj;
        return java.lang.Float.compare(this.f1905c, c0209j.f1905c) == 0 && java.lang.Float.compare(this.f1906d, c0209j.f1906d) == 0 && java.lang.Float.compare(this.f1907e, c0209j.f1907e) == 0 && this.f1908f == c0209j.f1908f && this.g == c0209j.g && java.lang.Float.compare(this.f1909h, c0209j.f1909h) == 0 && java.lang.Float.compare(this.f1910i, c0209j.f1910i) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1910i) + p121o0.p.c(this.f1909h, p121o0.p.f(p121o0.p.f(p121o0.p.c(this.f1907e, p121o0.p.c(this.f1906d, java.lang.Float.hashCode(this.f1905c) * 31, 31), 31), 31, this.f1908f), 31, this.g), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f1905c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f1906d);
        sb.append(", theta=");
        sb.append(this.f1907e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f1908f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartX=");
        sb.append(this.f1909h);
        sb.append(", arcStartY=");
        return p121o0.p.q(sb, this.f1910i, ')');
    }
}
