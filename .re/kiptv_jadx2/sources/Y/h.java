package Y;

public final class h {

    public final float f10977a;

    public final float f10978b;

    public final float f10979c;

    public final float f10980d;

    public h(float f9, float f10, float f11, float f12) {
        this.f10977a = f9;
        this.f10978b = f10;
        this.f10979c = f11;
        this.f10980d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f10977a == hVar.f10977a && this.f10978b == hVar.f10978b && this.f10979c == hVar.f10979c && this.f10980d == hVar.f10980d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10980d) + p121o0.p.c(this.f10979c, p121o0.p.c(this.f10978b, Float.hashCode(this.f10977a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f10977a);
        sb.append(", focusedAlpha=");
        sb.append(this.f10978b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f10979c);
        sb.append(", pressedAlpha=");
        return p121o0.p.q(sb, this.f10980d, ')');
    }
}
