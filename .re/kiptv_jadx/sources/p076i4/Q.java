package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends p076i4.AbstractC2215q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient int f22825n;

    public Q() {
        super(p076i4.D.b(12));
        this.f22825n = 2;
        this.f22825n = 2;
    }

    @Override // p076i4.AbstractC2222u, p076i4.G0
    public final java.util.Collection entries() {
        return (java.util.Set) super.entries();
    }

    @Override // p076i4.AbstractC2215q, p076i4.G0
    public final java.util.Collection get(java.lang.Object obj) {
        return (java.util.Set) super.get(obj);
    }

    @Override // p076i4.AbstractC2215q
    public final java.util.Collection j() {
        return p076i4.F.d(this.f22825n);
    }

    @Override // p076i4.AbstractC2215q
    public final java.util.Collection k(java.lang.Object obj, java.util.Collection collection) {
        return new p076i4.C2213p(this, obj, (java.util.Set) collection);
    }

    public final java.util.Set l(java.lang.String str) {
        return (java.util.Set) super.get(str);
    }
}
