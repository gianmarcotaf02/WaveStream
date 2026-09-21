package N7;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements N7.m, N7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N7.m f7467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7469c;

    public t(N7.m mVar, int i3, int i9) {
        this.f7467a = mVar;
        this.f7468b = i3;
        this.f7469c = i9;
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "startIndex should be non-negative, but is ").toString());
        }
        if (i9 < 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i9, "endIndex should be non-negative, but is ").toString());
        }
        if (i9 < i3) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(i9, i3, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // N7.f
    public final N7.m a(int i3) {
        int i9 = this.f7469c;
        int i10 = this.f7468b;
        if (i3 >= i9 - i10) {
            return this;
        }
        return new N7.t(this.f7467a, i10, i3 + i10);
    }

    @Override // N7.f
    public final N7.m b(int i3) {
        int i9 = this.f7469c;
        int i10 = this.f7468b;
        if (i3 >= i9 - i10) {
            return N7.g.f7442a;
        }
        return new N7.t(this.f7467a, i10 + i3, i9);
    }

    @Override // N7.m
    public final java.util.Iterator iterator() {
        return new N7.k(this);
    }
}
