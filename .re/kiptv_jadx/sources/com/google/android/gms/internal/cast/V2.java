package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class V2 extends com.google.android.gms.internal.cast.AbstractC1805v2 implements java.util.RandomAccess {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.V2 f18829k = new com.google.android.gms.internal.cast.V2(new java.lang.Object[0], 0, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object[] f18830i;
    public int j;

    public V2(java.lang.Object[] objArr, int i3, boolean z6) {
        super(z6);
        this.f18830i = objArr;
        this.j = i3;
    }

    @Override // com.google.android.gms.internal.cast.I2
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.cast.I2 a(int i3) {
        if (i3 >= this.j) {
            return new com.google.android.gms.internal.cast.V2(java.util.Arrays.copyOf(this.f18830i, i3), this.j, true);
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
        java.lang.Object[] objArr = this.f18830i;
        if (i9 < objArr.length) {
            java.lang.System.arraycopy(objArr, i3, objArr, i10, i9 - i3);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[Y6.f.c(i9, 3, 2, 1)];
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, i3);
            java.lang.System.arraycopy(this.f18830i, i3, objArr2, i10, this.j - i3);
            this.f18830i = objArr2;
        }
        this.f18830i[i3] = obj;
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
        return this.f18830i[i3];
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1805v2, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i3) {
        d();
        e(i3);
        java.lang.Object[] objArr = this.f18830i;
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
        java.lang.Object[] objArr = this.f18830i;
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
        java.lang.Object[] objArr = this.f18830i;
        if (i3 == objArr.length) {
            this.f18830i = java.util.Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        java.lang.Object[] objArr2 = this.f18830i;
        int i9 = this.j;
        this.j = i9 + 1;
        objArr2[i9] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }
}
