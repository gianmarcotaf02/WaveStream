package D0;

public final class n extends C {

    public final float f1918c;

    public final float f1919d;

    public n(float f9, float f10) {
        super(3);
        this.f1918c = f9;
        this.f1919d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f1918c, nVar.f1918c) == 0 && Float.compare(this.f1919d, nVar.f1919d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1919d) + (Float.hashCode(this.f1918c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f1918c);
        sb.append(", y=");
        return p121o0.p.q(sb, this.f1919d, ')');
    }
}
