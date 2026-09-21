package S4;

public final class M {

    public final boolean f9354a;

    public final int f9355b;

    public final int f9356c;

    public M(boolean z6, int i3, int i9) {
        this.f9354a = z6;
        this.f9355b = i3;
        this.f9356c = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        m8.getClass();
        return this.f9354a == m8.f9354a && this.f9355b == m8.f9355b && this.f9356c == m8.f9356c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9356c) + p121o0.p.d(this.f9355b, p121o0.p.f(Boolean.hashCode(true) * 31, 31, this.f9354a), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TermMatchResult(isConsecutive=true, startsAtFirstWord=");
        sb.append(this.f9354a);
        sb.append(", minWordIndex=");
        sb.append(this.f9355b);
        sb.append(", maxWordIndex=");
        return Y6.f.k(sb, this.f9356c, ")");
    }
}
