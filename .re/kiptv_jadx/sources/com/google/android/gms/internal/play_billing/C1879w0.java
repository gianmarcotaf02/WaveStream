package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1879w0 extends com.google.android.gms.internal.play_billing.AbstractC1844h0 implements java.util.RandomAccess, com.google.android.gms.internal.play_billing.InterfaceC1883y0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f19396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.C1879w0 f19397l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f19398i;
    public int j;

    static {
        int[] iArr = new int[0];
        f19396k = iArr;
        f19397l = new com.google.android.gms.internal.play_billing.C1879w0(iArr, 0, false);
    }

    public C1879w0(int[] iArr, int i3, boolean z6) {
        super(z6);
        this.f19398i = iArr;
        this.j = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1885z0
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.play_billing.InterfaceC1885z0 a(int i3) {
        if (i3 >= this.j) {
            return new com.google.android.gms.internal.play_billing.C1879w0(i3 == 0 ? f19396k : java.util.Arrays.copyOf(this.f19398i, i3), this.j, true);
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
        int[] iArr = this.f19398i;
        int length = iArr.length;
        if (i9 < length) {
            java.lang.System.arraycopy(iArr, i3, iArr, i10, i9 - i3);
        } else {
            int[] iArr2 = new int[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.f19398i, 0, iArr2, 0, i3);
            java.lang.System.arraycopy(this.f19398i, i3, iArr2, i10, this.j - i3);
            this.f19398i = iArr2;
        }
        this.f19398i[i3] = iIntValue;
        this.j++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1844h0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        d();
        java.nio.charset.Charset charset = com.google.android.gms.internal.play_billing.B0.f19193a;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.play_billing.C1879w0)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.play_billing.C1879w0 c1879w0 = (com.google.android.gms.internal.play_billing.C1879w0) collection;
        int i3 = c1879w0.j;
        if (i3 == 0) {
            return false;
        }
        int i9 = this.j;
        if (androidx.media3.common.util.Log.LOG_LEVEL_OFF - i9 < i3) {
            throw new java.lang.OutOfMemoryError();
        }
        int i10 = i9 + i3;
        int[] iArr = this.f19398i;
        if (i10 > iArr.length) {
            this.f19398i = java.util.Arrays.copyOf(iArr, i10);
        }
        java.lang.System.arraycopy(c1879w0.f19398i, 0, this.f19398i, this.j, c1879w0.j);
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
        return this.f19398i[i3];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1844h0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_billing.C1879w0)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.play_billing.C1879w0 c1879w0 = (com.google.android.gms.internal.play_billing.C1879w0) obj;
        if (this.j != c1879w0.j) {
            return false;
        }
        int[] iArr = c1879w0.f19398i;
        for (int i3 = 0; i3 < this.j; i3++) {
            if (this.f19398i[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i3) {
        d();
        int i9 = this.j;
        int length = this.f19398i.length;
        if (i9 == length) {
            int[] iArr = new int[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.f19398i, 0, iArr, 0, this.j);
            this.f19398i = iArr;
        }
        int[] iArr2 = this.f19398i;
        int i10 = this.j;
        this.j = i10 + 1;
        iArr2[i10] = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i3) {
        n(i3);
        return java.lang.Integer.valueOf(this.f19398i[i3]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1844h0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i9 = 0; i9 < this.j; i9++) {
            i3 = (i3 * 31) + this.f19398i[i9];
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
            if (this.f19398i[i9] == iIntValue) {
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

    @Override // com.google.android.gms.internal.play_billing.AbstractC1844h0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i3) {
        d();
        n(i3);
        int[] iArr = this.f19398i;
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
        int[] iArr = this.f19398i;
        java.lang.System.arraycopy(iArr, i9, iArr, i3, this.j - i9);
        this.j -= i9 - i3;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i3, java.lang.Object obj) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        d();
        n(i3);
        int[] iArr = this.f19398i;
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
