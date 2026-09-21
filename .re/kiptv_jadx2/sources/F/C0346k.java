package F;

public final class C0346k {

    public final int f3470a;

    public final int f3471b;

    public C0346k(int i3, int i9) {
        this.f3470a = i3;
        this.f3471b = i9;
        if (!(i3 >= 0)) {
            A.b.a("negative start index");
        }
        if (i9 >= i3) {
            return;
        }
        A.b.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0346k)) {
            return false;
        }
        C0346k c0346k = (C0346k) obj;
        return this.f3470a == c0346k.f3470a && this.f3471b == c0346k.f3471b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3471b) + (Integer.hashCode(this.f3470a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f3470a);
        sb.append(", end=");
        return Y6.f.j(sb, this.f3471b, ')');
    }
}
