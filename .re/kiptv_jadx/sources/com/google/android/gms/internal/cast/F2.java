package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class F2 extends com.google.android.gms.internal.cast.AbstractC1805v2 implements java.util.RandomAccess, com.google.android.gms.internal.cast.G2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.F2 f18771k = new com.google.android.gms.internal.cast.F2(new int[0], 0, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f18772i;
    public int j;

    public F2(int[] iArr, int i3, boolean z6) {
        super(z6);
        this.f18772i = iArr;
        this.j = i3;
    }

    @Override // com.google.android.gms.internal.cast.I2
    public final com.google.android.gms.internal.cast.I2 a(int i3) {
        if (i3 >= this.j) {
            return new com.google.android.gms.internal.cast.F2(java.util.Arrays.copyOf(this.f18772i, i3), this.j, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, java.lang.Object obj) {
        int i9;
        int iIntValue = ((java.lang.Integer) obj).intValue();
        d();
        if (i3 < 0 || i3 > (i9 = this.j)) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, this.j, "Index:", ", Size:"));
        }
        int i10 = i3 + 1;
        int[] iArr = this.f18772i;
        if (i9 < iArr.length) {
            java.lang.System.arraycopy(iArr, i3, iArr, i10, i9 - i3);
        } else {
            int[] iArr2 = new int[Y6.f.c(i9, 3, 2, 1)];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i3);
            java.lang.System.arraycopy(this.f18772i, i3, iArr2, i10, this.j - i3);
            this.f18772i = iArr2;
        }
        this.f18772i[i3] = iIntValue;
        this.j++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1805v2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        d();
        java.nio.charset.Charset charset = com.google.android.gms.internal.cast.J2.f18779a;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.cast.F2)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.cast.F2 f9 = (com.google.android.gms.internal.cast.F2) collection;
        int i3 = f9.j;
        if (i3 == 0) {
            return false;
        }
        int i9 = this.j;
        if (androidx.media3.common.util.Log.LOG_LEVEL_OFF - i9 < i3) {
            throw new java.lang.OutOfMemoryError();
        }
        int i10 = i9 + i3;
        int[] iArr = this.f18772i;
        if (i10 > iArr.length) {
            this.f18772i = java.util.Arrays.copyOf(iArr, i10);
        }
        java.lang.System.arraycopy(f9.f18772i, 0, this.f18772i, this.j, f9.j);
        this.j = i10;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i3) {
        n(i3);
        return this.f18772i[i3];
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1805v2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.cast.F2)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.cast.F2 f9 = (com.google.android.gms.internal.cast.F2) obj;
        if (this.j != f9.j) {
            return false;
        }
        int[] iArr = f9.f18772i;
        for (int i3 = 0; i3 < this.j; i3++) {
            if (this.f18772i[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i3) {
        d();
        int i9 = this.j;
        int[] iArr = this.f18772i;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[Y6.f.c(i9, 3, 2, 1)];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.f18772i = iArr2;
        }
        int[] iArr3 = this.f18772i;
        int i10 = this.j;
        this.j = i10 + 1;
        iArr3[i10] = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i3) {
        n(i3);
        return java.lang.Integer.valueOf(this.f18772i[i3]);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1805v2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i9 = 0; i9 < this.j; i9++) {
            i3 = (i3 * 31) + this.f18772i[i9];
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        int i3 = this.j;
        for (int i9 = 0; i9 < i3; i9++) {
            if (this.f18772i[i9] == iIntValue) {
                return i9;
            }
        }
        return -1;
    }

    public final void n(int i3) {
        if (i3 < 0 || i3 >= this.j) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, this.j, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1805v2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i3) {
        d();
        n(i3);
        int[] iArr = this.f18772i;
        int i9 = iArr[i3];
        int i10 = this.j;
        if (i3 < i10 - 1) {
            java.lang.System.arraycopy(iArr, i3 + 1, iArr, i3, (i10 - i3) - 1);
        }
        this.j--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i9) {
        d();
        if (i9 < i3) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f18772i;
        java.lang.System.arraycopy(iArr, i9, iArr, i3, this.j - i9);
        this.j -= i9 - i3;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i3, java.lang.Object obj) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        d();
        n(i3);
        int[] iArr = this.f18772i;
        int i9 = iArr[i3];
        iArr[i3] = iIntValue;
        return java.lang.Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        f(((java.lang.Integer) obj).intValue());
        return true;
    }
}
