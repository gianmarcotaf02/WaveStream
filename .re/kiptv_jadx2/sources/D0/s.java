package D0;

public final class s extends C {

    public final float f1932c;

    public final float f1933d;

    public final float f1934e;

    public final boolean f1935f;
    public final boolean g;

    public final float f1936h;

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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f1932c, sVar.f1932c) == 0 && Float.compare(this.f1933d, sVar.f1933d) == 0 && Float.compare(this.f1934e, sVar.f1934e) == 0 && this.f1935f == sVar.f1935f && this.g == sVar.g && Float.compare(this.f1936h, sVar.f1936h) == 0 && Float.compare(this.f1937i, sVar.f1937i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1937i) + p121o0.p.c(this.f1936h, p121o0.p.f(p121o0.p.f(p121o0.p.c(this.f1934e, p121o0.p.c(this.f1933d, Float.hashCode(this.f1932c) * 31, 31), 31), 31, this.f1935f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
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
