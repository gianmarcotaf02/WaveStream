package D0;

public final class x extends C {

    public final float f1948c;

    public final float f1949d;

    public final float f1950e;

    public final float f1951f;

    public x(float f9, float f10, float f11, float f12) {
        super(1);
        this.f1948c = f9;
        this.f1949d = f10;
        this.f1950e = f11;
        this.f1951f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f1948c, xVar.f1948c) == 0 && Float.compare(this.f1949d, xVar.f1949d) == 0 && Float.compare(this.f1950e, xVar.f1950e) == 0 && Float.compare(this.f1951f, xVar.f1951f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1951f) + p121o0.p.c(this.f1950e, p121o0.p.c(this.f1949d, Float.hashCode(this.f1948c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f1948c);
        sb.append(", dy1=");
        sb.append(this.f1949d);
        sb.append(", dx2=");
        sb.append(this.f1950e);
        sb.append(", dy2=");
        return p121o0.p.q(sb, this.f1951f, ')');
    }
}
