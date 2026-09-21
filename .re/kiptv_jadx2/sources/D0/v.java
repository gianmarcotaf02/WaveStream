package D0;

public final class v extends C {

    public final float f1944c;

    public final float f1945d;

    public v(float f9, float f10) {
        super(3);
        this.f1944c = f9;
        this.f1945d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f1944c, vVar.f1944c) == 0 && Float.compare(this.f1945d, vVar.f1945d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1945d) + (Float.hashCode(this.f1944c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f1944c);
        sb.append(", dy=");
        return p121o0.p.q(sb, this.f1945d, ')');
    }
}
