package p104m1;

public final class p {

    public static final p f25182c = new p(1.0f, 0.0f);

    public final float f25183a;

    public final float f25184b;

    public p(float f9, float f10) {
        this.f25183a = f9;
        this.f25184b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f25183a == pVar.f25183a && this.f25184b == pVar.f25184b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25184b) + (Float.hashCode(this.f25183a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f25183a);
        sb.append(", skewX=");
        return p121o0.p.q(sb, this.f25184b, ')');
    }
}
