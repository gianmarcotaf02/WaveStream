package D0;

public final class t extends C {

    public final float f1938c;

    public final float f1939d;

    public final float f1940e;

    public final float f1941f;
    public final float g;

    public final float f1942h;

    public t(float f9, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f1938c = f9;
        this.f1939d = f10;
        this.f1940e = f11;
        this.f1941f = f12;
        this.g = f13;
        this.f1942h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f1938c, tVar.f1938c) == 0 && Float.compare(this.f1939d, tVar.f1939d) == 0 && Float.compare(this.f1940e, tVar.f1940e) == 0 && Float.compare(this.f1941f, tVar.f1941f) == 0 && Float.compare(this.g, tVar.g) == 0 && Float.compare(this.f1942h, tVar.f1942h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1942h) + p121o0.p.c(this.g, p121o0.p.c(this.f1941f, p121o0.p.c(this.f1940e, p121o0.p.c(this.f1939d, Float.hashCode(this.f1938c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f1938c);
        sb.append(", dy1=");
        sb.append(this.f1939d);
        sb.append(", dx2=");
        sb.append(this.f1940e);
        sb.append(", dy2=");
        sb.append(this.f1941f);
        sb.append(", dx3=");
        sb.append(this.g);
        sb.append(", dy3=");
        return p121o0.p.q(sb, this.f1942h, ')');
    }
}
