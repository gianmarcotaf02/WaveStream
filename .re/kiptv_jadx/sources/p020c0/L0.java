package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class L0 implements p129p0.c, java.lang.Iterable, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p020c0.K0 f18147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18148i;
    public final int j;

    public L0(p020c0.K0 k1, int i3, int i9) {
        this.f18147h = k1;
        this.f18148i = i3;
        this.j = i9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p020c0.L0)) {
            return false;
        }
        p020c0.L0 l2 = (p020c0.L0) obj;
        return l2.f18148i == this.f18148i && l2.j == this.j && kotlin.jvm.internal.m.a(l2.f18147h, this.f18147h);
    }

    public final int hashCode() {
        return (this.f18147h.hashCode() * 31) + this.f18148i;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        p020c0.K0 k1 = this.f18147h;
        if (k1.f18140o != this.j) {
            p020c0.M0.f();
        }
        int i3 = this.f18148i;
        k1.q(i3);
        return new p020c0.M(k1, i3 + 1, k1.f18134h[(i3 * 5) + 3] + i3);
    }
}
