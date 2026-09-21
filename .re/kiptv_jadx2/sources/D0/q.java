package D0;

public final class q extends C {

    public final float f1926c;

    public final float f1927d;

    public final float f1928e;

    public final float f1929f;

    public q(float f9, float f10, float f11, float f12) {
        super(2);
        this.f1926c = f9;
        this.f1927d = f10;
        this.f1928e = f11;
        this.f1929f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f1926c, qVar.f1926c) == 0 && Float.compare(this.f1927d, qVar.f1927d) == 0 && Float.compare(this.f1928e, qVar.f1928e) == 0 && Float.compare(this.f1929f, qVar.f1929f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1929f) + p121o0.p.c(this.f1928e, p121o0.p.c(this.f1927d, Float.hashCode(this.f1926c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f1926c);
        sb.append(", y1=");
        sb.append(this.f1927d);
        sb.append(", x2=");
        sb.append(this.f1928e);
        sb.append(", y2=");
        return p121o0.p.q(sb, this.f1929f, ')');
    }
}
