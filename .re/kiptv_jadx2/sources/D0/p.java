package D0;

public final class p extends C {

    public final float f1922c;

    public final float f1923d;

    public final float f1924e;

    public final float f1925f;

    public p(float f9, float f10, float f11, float f12) {
        super(1);
        this.f1922c = f9;
        this.f1923d = f10;
        this.f1924e = f11;
        this.f1925f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f1922c, pVar.f1922c) == 0 && Float.compare(this.f1923d, pVar.f1923d) == 0 && Float.compare(this.f1924e, pVar.f1924e) == 0 && Float.compare(this.f1925f, pVar.f1925f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1925f) + p121o0.p.c(this.f1924e, p121o0.p.c(this.f1923d, Float.hashCode(this.f1922c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f1922c);
        sb.append(", y1=");
        sb.append(this.f1923d);
        sb.append(", x2=");
        sb.append(this.f1924e);
        sb.append(", y2=");
        return p121o0.p.q(sb, this.f1925f, ')');
    }
}
