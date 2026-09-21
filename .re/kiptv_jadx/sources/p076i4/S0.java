package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends p076i4.AbstractC2186b0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p076i4.S0 f22832l = new p076i4.S0(new java.lang.Object[0], 0);
    public final transient java.lang.Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient int f22833k;

    public S0(java.lang.Object[] objArr, int i3) {
        this.j = objArr;
        this.f22833k = i3;
    }

    @Override // p076i4.AbstractC2186b0, p076i4.W
    public final int e(java.lang.Object[] objArr, int i3) {
        java.lang.Object[] objArr2 = this.j;
        int i9 = this.f22833k;
        java.lang.System.arraycopy(objArr2, 0, objArr, i3, i9);
        return i3 + i9;
    }

    @Override // p076i4.W
    public final java.lang.Object[] f() {
        return this.j;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.R(i3, this.f22833k);
        java.lang.Object obj = this.j[i3];
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p076i4.W
    public final int n() {
        return this.f22833k;
    }

    @Override // p076i4.W
    public final int o() {
        return 0;
    }

    @Override // p076i4.W
    public final boolean p() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22833k;
    }
}
