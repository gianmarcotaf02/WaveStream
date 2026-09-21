package C5;

public final class C0095b {

    public final int f1211a;

    public final int f1212b;

    public final int f1213c;

    public final int f1214d;

    public C0095b(int i3, int i9, int i10, int i11) {
        this.f1211a = i3;
        this.f1212b = i9;
        this.f1213c = i10;
        this.f1214d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0095b)) {
            return false;
        }
        C0095b c0095b = (C0095b) obj;
        return this.f1211a == c0095b.f1211a && this.f1212b == c0095b.f1212b && this.f1213c == c0095b.f1213c && this.f1214d == c0095b.f1214d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1214d) + p121o0.p.d(this.f1213c, p121o0.p.d(this.f1212b, Integer.hashCode(this.f1211a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TileFrame(x=");
        sb.append(this.f1211a);
        sb.append(", y=");
        sb.append(this.f1212b);
        sb.append(", width=");
        sb.append(this.f1213c);
        sb.append(", height=");
        return Y6.f.k(sb, this.f1214d, ")");
    }
}
