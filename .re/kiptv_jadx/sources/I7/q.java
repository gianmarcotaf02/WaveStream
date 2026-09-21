package I7;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends I7.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C7.C0176h f5581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5582i;

    public q(int i3, C7.C0176h c0176h) {
        this.f5581h = c0176h;
        this.f5582i = i3;
    }

    @Override // I7.a
    public final int d() {
        return 1;
    }

    @Override // I7.a
    public final void e(int i3, C7.C0176h c0176h) {
        throw new java.lang.IllegalStateException();
    }

    @Override // I7.a
    public final java.lang.Object get(int i3) {
        if (i3 == this.f5582i) {
            return this.f5581h;
        }
        return null;
    }

    @Override // I7.a, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new I7.p(0, this);
    }
}
