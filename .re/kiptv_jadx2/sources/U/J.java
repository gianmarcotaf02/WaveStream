package U;

public final class J {

    public final J.L f9915a;

    public final long f9916b;

    public final I f9917c;

    public final boolean f9918d;

    public J(J.L l2, long j, I i3, boolean z6) {
        this.f9915a = l2;
        this.f9916b = j;
        this.f9917c = i3;
        this.f9918d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return this.f9915a == j.f9915a && p181w0.a.b(this.f9916b, j.f9916b) && this.f9917c == j.f9917c && this.f9918d == j.f9918d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9918d) + ((this.f9917c.hashCode() + p121o0.p.e(this.f9915a.hashCode() * 31, 31, this.f9916b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f9915a);
        sb.append(", position=");
        sb.append((Object) p181w0.a.i(this.f9916b));
        sb.append(", anchor=");
        sb.append(this.f9917c);
        sb.append(", visible=");
        return v5.L.a(sb, this.f9918d, ')');
    }
}
