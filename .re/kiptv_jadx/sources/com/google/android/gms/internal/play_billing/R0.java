package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends com.google.android.gms.internal.play_billing.AbstractC1844h0 implements java.util.RandomAccess {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.lang.Object[] f19279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.R0 f19280l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object[] f19281i;
    public int j;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        f19279k = objArr;
        f19280l = new com.google.android.gms.internal.play_billing.R0(objArr, 0, false);
    }

    public R0(java.lang.Object[] objArr, int i3, boolean z6) {
        super(z6);
        this.f19281i = objArr;
        this.j = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1885z0
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.play_billing.InterfaceC1885z0 a(int i3) {
        if (i3 >= this.j) {
            return new com.google.android.gms.internal.play_billing.R0(i3 == 0 ? f19279k : java.util.Arrays.copyOf(this.f19281i, i3), this.j, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, java.lang.Object obj) {
        int i9;
        d();
        if (i3 < 0 || i3 > (i9 = this.j)) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, this.j, "Index:", ", Size:"));
        }
        int i10 = i3 + 1;
        java.lang.Object[] objArr = this.f19281i;
        int length = objArr.length;
        if (i9 < length) {
            java.lang.System.arraycopy(objArr, i3, objArr, i10, i9 - i3);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.f19281i, 0, objArr2, 0, i3);
            java.lang.System.arraycopy(this.f19281i, i3, objArr2, i10, this.j - i3);
            this.f19281i = objArr2;
        }
        this.f19281i[i3] = obj;
        this.j++;
        ((java.util.AbstractList) this).modCount++;
    }

    public final void e(int i3) {
        if (i3 < 0 || i3 >= this.j) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, this.j, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i3) {
        e(i3);
        return this.f19281i[i3];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1844h0, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i3) {
        d();
        e(i3);
        java.lang.Object[] objArr = this.f19281i;
        java.lang.Object obj = objArr[i3];
        int i9 = this.j;
        if (i3 < i9 - 1) {
            java.lang.System.arraycopy(objArr, i3 + 1, objArr, i3, (i9 - i3) - 1);
        }
        this.j--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i3, java.lang.Object obj) {
        d();
        e(i3);
        java.lang.Object[] objArr = this.f19281i;
        java.lang.Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((java.util.AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        d();
        int i3 = this.j;
        int length = this.f19281i.length;
        if (i3 == length) {
            this.f19281i = java.util.Arrays.copyOf(this.f19281i, java.lang.Math.max(((length * 3) / 2) + 1, 10));
        }
        java.lang.Object[] objArr = this.f19281i;
        int i9 = this.j;
        this.j = i9 + 1;
        objArr[i9] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }
}
