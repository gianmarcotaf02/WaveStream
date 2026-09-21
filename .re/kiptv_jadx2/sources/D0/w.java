package D0;

public final class w extends C {

    public final float f1946c;

    public final float f1947d;

    public w(float f9, float f10) {
        super(3);
        this.f1946c = f9;
        this.f1947d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f1946c, wVar.f1946c) == 0 && Float.compare(this.f1947d, wVar.f1947d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1947d) + (Float.hashCode(this.f1946c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f1946c);
        sb.append(", dy=");
        return p121o0.p.q(sb, this.f1947d, ')');
    }
}
