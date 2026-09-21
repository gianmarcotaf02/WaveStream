package D0;

public final class y extends C {

    public final float f1952c;

    public final float f1953d;

    public final float f1954e;

    public final float f1955f;

    public y(float f9, float f10, float f11, float f12) {
        super(2);
        this.f1952c = f9;
        this.f1953d = f10;
        this.f1954e = f11;
        this.f1955f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f1952c, yVar.f1952c) == 0 && Float.compare(this.f1953d, yVar.f1953d) == 0 && Float.compare(this.f1954e, yVar.f1954e) == 0 && Float.compare(this.f1955f, yVar.f1955f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1955f) + p121o0.p.c(this.f1954e, p121o0.p.c(this.f1953d, Float.hashCode(this.f1952c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f1952c);
        sb.append(", dy1=");
        sb.append(this.f1953d);
        sb.append(", dx2=");
        sb.append(this.f1954e);
        sb.append(", dy2=");
        return p121o0.p.q(sb, this.f1955f, ')');
    }
}
