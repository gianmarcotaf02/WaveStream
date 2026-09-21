package x;

public final class C3039e0 {

    public final long f30872a;

    public final long f30873b;

    public final boolean f30874c;

    public C3039e0(long j, long j9, boolean z6) {
        this.f30872a = j;
        this.f30873b = j9;
        this.f30874c = z6;
    }

    public final C3039e0 a(C3039e0 c3039e0) {
        return new C3039e0(p181w0.a.g(this.f30872a, c3039e0.f30872a), Math.max(this.f30873b, c3039e0.f30873b), this.f30874c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3039e0)) {
            return false;
        }
        C3039e0 c3039e0 = (C3039e0) obj;
        return p181w0.a.b(this.f30872a, c3039e0.f30872a) && this.f30873b == c3039e0.f30873b && this.f30874c == c3039e0.f30874c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30874c) + p121o0.p.e(Long.hashCode(this.f30872a) * 31, 31, this.f30873b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) p181w0.a.i(this.f30872a));
        sb.append(", timeMillis=");
        sb.append(this.f30873b);
        sb.append(", shouldApplyImmediately=");
        return v5.L.a(sb, this.f30874c, ')');
    }
}
