package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class T0 extends p076i4.AbstractC2186b0 {
    public final /* synthetic */ p076i4.U0 j;

    public T0(p076i4.U0 u1) {
        this.j = u1;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        p076i4.U0 u1 = this.j;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.R(i3, u1.f22840n);
        int i9 = i3 * 2;
        int i10 = u1.f22839m;
        java.lang.Object[] objArr = u1.f22838l;
        java.lang.Object obj = objArr[i9 + i10];
        java.util.Objects.requireNonNull(obj);
        java.lang.Object obj2 = objArr[i9 + (i10 ^ 1)];
        java.util.Objects.requireNonNull(obj2);
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // p076i4.W
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.j.f22840n;
    }
}
