package C5;

/* JADX INFO: renamed from: C5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0095b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1214d;

    public C0095b(int i3, int i9, int i10, int i11) {
        this.f1211a = i3;
        this.f1212b = i9;
        this.f1213c = i10;
        this.f1214d = i11;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5.C0095b)) {
            return false;
        }
        C5.C0095b c0095b = (C5.C0095b) obj;
        return this.f1211a == c0095b.f1211a && this.f1212b == c0095b.f1212b && this.f1213c == c0095b.f1213c && this.f1214d == c0095b.f1214d;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f1214d) + p121o0.p.d(this.f1213c, p121o0.p.d(this.f1212b, java.lang.Integer.hashCode(this.f1211a) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TileFrame(x=");
        sb.append(this.f1211a);
        sb.append(", y=");
        sb.append(this.f1212b);
        sb.append(", width=");
        sb.append(this.f1213c);
        sb.append(", height=");
        return Y6.f.k(sb, this.f1214d, ")");
    }
}
