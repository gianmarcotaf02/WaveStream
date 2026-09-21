package D0;

public final class o extends C {

    public final float f1920c;

    public final float f1921d;

    public o(float f9, float f10) {
        super(3);
        this.f1920c = f9;
        this.f1921d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f1920c, oVar.f1920c) == 0 && Float.compare(this.f1921d, oVar.f1921d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1921d) + (Float.hashCode(this.f1920c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f1920c);
        sb.append(", y=");
        return p121o0.p.q(sb, this.f1921d, ')');
    }
}
