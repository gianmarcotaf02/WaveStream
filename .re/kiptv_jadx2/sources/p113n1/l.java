package p113n1;

import Y6.f;
import p121o0.p;

public final class l {

    public static final l f25560e = new l(0, 0, 0, 0);

    public final int f25561a;

    public final int f25562b;

    public final int f25563c;

    public final int f25564d;

    public l(int i3, int i9, int i10, int i11) {
        this.f25561a = i3;
        this.f25562b = i9;
        this.f25563c = i10;
        this.f25564d = i11;
    }

    public final long a() {
        return (((long) this.f25561a) << 32) | (((long) this.f25562b) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f25561a == lVar.f25561a && this.f25562b == lVar.f25562b && this.f25563c == lVar.f25563c && this.f25564d == lVar.f25564d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25564d) + p.d(this.f25563c, p.d(this.f25562b, Integer.hashCode(this.f25561a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f25561a);
        sb.append(", ");
        sb.append(this.f25562b);
        sb.append(", ");
        sb.append(this.f25563c);
        sb.append(", ");
        return f.j(sb, this.f25564d, ')');
    }
}
