package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends p076i4.AbstractC2186b0 {
    public final transient java.lang.Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient int f22844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient int f22845l;

    public W0(java.lang.Object[] objArr, int i3, int i9) {
        this.j = objArr;
        this.f22844k = i3;
        this.f22845l = i9;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.R(i3, this.f22845l);
        java.lang.Object obj = this.j[(i3 * 2) + this.f22844k];
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p076i4.W
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22845l;
    }
}
