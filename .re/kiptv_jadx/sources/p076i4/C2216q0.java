package p076i4;

/* JADX INFO: renamed from: i4.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2216q0 extends p076i4.AbstractC2186b0 {
    public final /* synthetic */ p076i4.C2208m0 j;

    public C2216q0(p076i4.C2208m0 c2208m0) {
        this.j = c2208m0;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        p076i4.C2208m0 c2208m0 = this.j;
        switch (c2208m0.f22921k) {
            case 0:
                p076i4.N0 n3 = ((p076i4.Y0) c2208m0.f22922l).f22853l;
                com.google.android.gms.internal.play_billing.AbstractC1864o0.R(i3, n3.f22819c);
                return new p076i4.M0(n3, i3);
            default:
                p076i4.N0 n9 = ((p076i4.Y0) c2208m0.f22922l).f22853l;
                com.google.android.gms.internal.play_billing.AbstractC1864o0.R(i3, n9.f22819c);
                return n9.f22817a[i3];
        }
    }

    @Override // p076i4.W
    public final boolean p() {
        return this.j.p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.j.size();
    }
}
