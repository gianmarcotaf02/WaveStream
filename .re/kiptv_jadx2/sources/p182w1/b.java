package p182w1;

import Y6.f;
import android.graphics.Insets;

public final class b {

    public static final b f29759e = new b(0, 0, 0, 0);

    public final int f29760a;

    public final int f29761b;

    public final int f29762c;

    public final int f29763d;

    public b(int i3, int i9, int i10, int i11) {
        this.f29760a = i3;
        this.f29761b = i9;
        this.f29762c = i10;
        this.f29763d = i11;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f29760a, bVar2.f29760a), Math.max(bVar.f29761b, bVar2.f29761b), Math.max(bVar.f29762c, bVar2.f29762c), Math.max(bVar.f29763d, bVar2.f29763d));
    }

    public static b b(int i3, int i9, int i10, int i11) {
        return (i3 == 0 && i9 == 0 && i10 == 0 && i11 == 0) ? f29759e : new b(i3, i9, i10, i11);
    }

    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return U0.b.i(this.f29760a, this.f29761b, this.f29762c, this.f29763d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f29763d == bVar.f29763d && this.f29760a == bVar.f29760a && this.f29762c == bVar.f29762c && this.f29761b == bVar.f29761b;
    }

    public final int hashCode() {
        return (((((this.f29760a * 31) + this.f29761b) * 31) + this.f29762c) * 31) + this.f29763d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f29760a);
        sb.append(", top=");
        sb.append(this.f29761b);
        sb.append(", right=");
        sb.append(this.f29762c);
        sb.append(", bottom=");
        return f.j(sb, this.f29763d, '}');
    }
}
