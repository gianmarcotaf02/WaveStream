package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 extends p076i4.AbstractC2210n0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p076i4.Y0 f22852o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient p076i4.N0 f22853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient int f22854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient p076i4.C2208m0 f22855n;

    static {
        p076i4.N0 n3 = new p076i4.N0();
        n3.d(3);
        f22852o = new p076i4.Y0(n3);
    }

    public Y0(p076i4.N0 n3) {
        this.f22853l = n3;
        long j = 0;
        int i3 = 0;
        while (true) {
            int i9 = n3.f22819c;
            if (i3 >= i9) {
                this.f22854m = com.google.crypto.tink.shaded.protobuf.q0.F(j);
                return;
            } else {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.R(i3, i9);
                j += (long) n3.f22818b[i3];
                i3++;
            }
        }
    }

    @Override // p076i4.W
    public final boolean p() {
        throw null;
    }

    @Override // p076i4.AbstractC2210n0
    public final p076i4.AbstractC2214p0 r() {
        p076i4.C2208m0 c2208m0 = this.f22855n;
        if (c2208m0 != null) {
            return c2208m0;
        }
        p076i4.C2208m0 c2208m1 = new p076i4.C2208m0(this, 1);
        this.f22855n = c2208m1;
        return c2208m1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f22854m;
    }
}
