package B;

public final class S {

    public final float f492a;

    public final float f493b;

    public final float f494c;

    public final float f495d;

    public S(float f9, float f10, float f11, float f12) {
        this.f492a = f9;
        this.f493b = f10;
        this.f494c = f11;
        this.f495d = f12;
        if (!((f9 >= 0.0f) & (f10 >= 0.0f) & (f11 >= 0.0f)) || !(f12 >= 0.0f)) {
            C.a.a("Padding must be non-negative");
        }
    }

    public final float a(p113n1.n nVar) {
        return nVar == p113n1.n.f25566h ? this.f492a : this.f494c;
    }

    public final float b(p113n1.n nVar) {
        return nVar == p113n1.n.f25566h ? this.f494c : this.f492a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof S)) {
            return false;
        }
        S s9 = (S) obj;
        return p113n1.f.c(this.f492a, s9.f492a) && p113n1.f.c(this.f493b, s9.f493b) && p113n1.f.c(this.f494c, s9.f494c) && p113n1.f.c(this.f495d, s9.f495d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f495d) + p121o0.p.c(this.f494c, p121o0.p.c(this.f493b, Float.hashCode(this.f492a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) p113n1.f.d(this.f492a)) + ", top=" + ((Object) p113n1.f.d(this.f493b)) + ", end=" + ((Object) p113n1.f.d(this.f494c)) + ", bottom=" + ((Object) p113n1.f.d(this.f495d)) + ')';
    }
}
