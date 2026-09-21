package p146r1;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26719e;

    public F(int i3) {
        this((i3 & 1) == 0, p146r1.G.f26720h, true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p146r1.F)) {
            return false;
        }
        p146r1.F f9 = (p146r1.F) obj;
        return this.f26715a == f9.f26715a && this.f26716b == f9.f26716b && this.f26717c == f9.f26717c && this.f26718d == f9.f26718d && this.f26719e == f9.f26719e;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(false) + p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(this.f26715a * 31, 31, this.f26716b), 31, this.f26717c), 31, this.f26718d), 31, this.f26719e);
    }

    public F(boolean z6, p146r1.G g, boolean z9) {
        p020c0.C c9 = p146r1.p.f26768a;
        int i3 = !z6 ? 262152 : 262144;
        i3 = g == p146r1.G.f26721i ? i3 | 8192 : i3;
        i3 = z9 ? i3 : i3 | 512;
        boolean z10 = g == p146r1.G.f26720h;
        this.f26715a = i3;
        this.f26716b = z10;
        this.f26717c = true;
        this.f26718d = true;
        this.f26719e = true;
    }
}
