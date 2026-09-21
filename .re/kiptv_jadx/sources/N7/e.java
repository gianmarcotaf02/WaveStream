package N7;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements N7.m, N7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N7.m f7440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7441c;

    public e(N7.m mVar, int i3, int i9) {
        this.f7439a = i9;
        switch (i9) {
            case 1:
                this.f7440b = mVar;
                this.f7441c = i3;
                if (i3 >= 0) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(("count must be non-negative, but was " + i3 + '.').toString());
            default:
                this.f7440b = mVar;
                this.f7441c = i3;
                if (i3 >= 0) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(("count must be non-negative, but was " + i3 + '.').toString());
        }
    }

    @Override // N7.f
    public final N7.m a(int i3) {
        switch (this.f7439a) {
            case 0:
                int i9 = this.f7441c;
                int i10 = i9 + i3;
                return i10 < 0 ? new N7.e(this, i3, 1) : new N7.t(this.f7440b, i9, i10);
            default:
                return i3 >= this.f7441c ? this : new N7.e(this.f7440b, i3, 1);
        }
    }

    @Override // N7.f
    public final N7.m b(int i3) {
        switch (this.f7439a) {
            case 0:
                int i9 = this.f7441c + i3;
                return i9 < 0 ? new N7.e(this, i3, 0) : new N7.e(this.f7440b, i9, 0);
            default:
                int i10 = this.f7441c;
                return i3 >= i10 ? N7.g.f7442a : new N7.t(this.f7440b, i3, i10);
        }
    }

    @Override // N7.m
    public final java.util.Iterator iterator() {
        switch (this.f7439a) {
            case 0:
                return new N7.d(this);
            default:
                return new N7.d(this, (byte) 0);
        }
    }
}
