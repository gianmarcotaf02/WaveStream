package D0;

public final class C0209j extends C {

    public final float f1905c;

    public final float f1906d;

    public final float f1907e;

    public final boolean f1908f;
    public final boolean g;

    public final float f1909h;

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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0209j)) {
            return false;
        }
        C0209j c0209j = (C0209j) obj;
        return Float.compare(this.f1905c, c0209j.f1905c) == 0 && Float.compare(this.f1906d, c0209j.f1906d) == 0 && Float.compare(this.f1907e, c0209j.f1907e) == 0 && this.f1908f == c0209j.f1908f && this.g == c0209j.g && Float.compare(this.f1909h, c0209j.f1909h) == 0 && Float.compare(this.f1910i, c0209j.f1910i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1910i) + p121o0.p.c(this.f1909h, p121o0.p.f(p121o0.p.f(p121o0.p.c(this.f1907e, p121o0.p.c(this.f1906d, Float.hashCode(this.f1905c) * 31, 31), 31), 31, this.f1908f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
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
