package p182w1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p182w1.b f29759e = new p182w1.b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29763d;

    public b(int i3, int i9, int i10, int i11) {
        this.f29760a = i3;
        this.f29761b = i9;
        this.f29762c = i10;
        this.f29763d = i11;
    }

    public static p182w1.b a(p182w1.b bVar, p182w1.b bVar2) {
        return b(java.lang.Math.max(bVar.f29760a, bVar2.f29760a), java.lang.Math.max(bVar.f29761b, bVar2.f29761b), java.lang.Math.max(bVar.f29762c, bVar2.f29762c), java.lang.Math.max(bVar.f29763d, bVar2.f29763d));
    }

    public static p182w1.b b(int i3, int i9, int i10, int i11) {
        return (i3 == 0 && i9 == 0 && i10 == 0 && i11 == 0) ? f29759e : new p182w1.b(i3, i9, i10, i11);
    }

    public static p182w1.b c(android.graphics.Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final android.graphics.Insets d() {
        return U0.b.i(this.f29760a, this.f29761b, this.f29762c, this.f29763d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p182w1.b.class != obj.getClass()) {
            return false;
        }
        p182w1.b bVar = (p182w1.b) obj;
        return this.f29763d == bVar.f29763d && this.f29760a == bVar.f29760a && this.f29762c == bVar.f29762c && this.f29761b == bVar.f29761b;
    }

    public final int hashCode() {
        return (((((this.f29760a * 31) + this.f29761b) * 31) + this.f29762c) * 31) + this.f29763d;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Insets{left=");
        sb.append(this.f29760a);
        sb.append(", top=");
        sb.append(this.f29761b);
        sb.append(", right=");
        sb.append(this.f29762c);
        sb.append(", bottom=");
        return Y6.f.j(sb, this.f29763d, '}');
    }
}
