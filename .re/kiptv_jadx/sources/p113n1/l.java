package p113n1;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p113n1.l f25560e = new p113n1.l(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p113n1.l)) {
            return false;
        }
        p113n1.l lVar = (p113n1.l) obj;
        return this.f25561a == lVar.f25561a && this.f25562b == lVar.f25562b && this.f25563c == lVar.f25563c && this.f25564d == lVar.f25564d;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f25564d) + p121o0.p.d(this.f25563c, p121o0.p.d(this.f25562b, java.lang.Integer.hashCode(this.f25561a) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f25561a);
        sb.append(", ");
        sb.append(this.f25562b);
        sb.append(", ");
        sb.append(this.f25563c);
        sb.append(", ");
        return Y6.f.j(sb, this.f25564d, ')');
    }
}
