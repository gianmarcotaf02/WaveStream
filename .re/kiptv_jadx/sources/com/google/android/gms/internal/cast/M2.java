package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class M2 extends com.google.android.gms.internal.cast.AbstractC1805v2 implements java.util.RandomAccess, com.google.android.gms.internal.cast.H2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.M2 f18795k = new com.google.android.gms.internal.cast.M2(new long[0], 0, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f18796i;
    public int j;

    public M2(long[] jArr, int i3, boolean z6) {
        super(z6);
        this.f18796i = jArr;
        this.j = i3;
    }

    @Override // com.google.android.gms.internal.cast.I2
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.cast.I2 a(int i3) {
        if (i3 >= this.j) {
            return new com.google.android.gms.internal.cast.M2(java.util.Arrays.copyOf(this.f18796i, i3), this.j, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, java.lang.Object obj) {
        int i9;
        long jLongValue = ((java.lang.Long) obj).longValue();
        d();
        if (i3 < 0 || i3 > (i9 = this.j)) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, this.j, "Index:", ", Size:"));
        }
        int i10 = i3 + 1;
        long[] jArr = this.f18796i;
        if (i9 < jArr.length) {
            java.lang.System.arraycopy(jArr, i3, jArr, i10, i9 - i3);
        } else {
            long[] jArr2 = new long[Y6.f.c(i9, 3, 2, 1)];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i3);
            java.lang.System.arraycopy(this.f18796i, i3, jArr2, i10, this.j - i3);
            this.f18796i = jArr2;
        }
        this.f18796i[i3] = jLongValue;
        this.j++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1805v2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        d();
        java.nio.charset.Charset charset = com.google.android.gms.internal.cast.J2.f18779a;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.cast.M2)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.cast.M2 m8 = (com.google.android.gms.internal.cast.M2) collection;
        int i3 = m8.j;
        if (i3 == 0) {
            return false;
        }
        int i9 = this.j;
        if (androidx.media3.common.util.Log.LOG_LEVEL_OFF - i9 < i3) {
            throw new java.lang.OutOfMemoryError();
        }
        int i10 = i9 + i3;
        long[] jArr = this.f18796i;
        if (i10 > jArr.length) {
            this.f18796i = java.util.Arrays.copyOf(jArr, i10);
        }
        java.lang.System.arraycopy(m8.f18796i, 0, this.f18796i, this.j, m8.j);
        this.j = i10;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i3) {
        f(i3);
        return this.f18796i[i3];
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1805v2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.cast.M2)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.cast.M2 m8 = (com.google.android.gms.internal.cast.M2) obj;
        if (this.j != m8.j) {
            return false;
        }
        long[] jArr = m8.f18796i;
        for (int i3 = 0; i3 < this.j; i3++) {
            if (this.f18796i[i3] != jArr[i3]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i3) {
        if (i3 < 0 || i3 >= this.j) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, this.j, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i3) {
        f(i3);
        return java.lang.Long.valueOf(this.f18796i[i3]);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1805v2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i9 = 0; i9 < this.j; i9++) {
            long j = this.f18796i[i9];
            java.nio.charset.Charset charset = com.google.android.gms.internal.cast.J2.f18779a;
            i3 = (i3 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        int i3 = this.j;
        for (int i9 = 0; i9 < i3; i9++) {
            if (this.f18796i[i9] == jLongValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1805v2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i3) {
        d();
        f(i3);
        long[] jArr = this.f18796i;
        long j = jArr[i3];
        int i9 = this.j;
        if (i3 < i9 - 1) {
            java.lang.System.arraycopy(jArr, i3 + 1, jArr, i3, (i9 - i3) - 1);
        }
        this.j--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i9) {
        d();
        if (i9 < i3) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f18796i;
        java.lang.System.arraycopy(jArr, i9, jArr, i3, this.j - i9);
        this.j -= i9 - i3;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i3, java.lang.Object obj) {
        long jLongValue = ((java.lang.Long) obj).longValue();
        d();
        f(i3);
        long[] jArr = this.f18796i;
        long j = jArr[i3];
        jArr[i3] = jLongValue;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        long jLongValue = ((java.lang.Long) obj).longValue();
        d();
        int i3 = this.j;
        long[] jArr = this.f18796i;
        if (i3 == jArr.length) {
            long[] jArr2 = new long[Y6.f.c(i3, 3, 2, 1)];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i3);
            this.f18796i = jArr2;
        }
        long[] jArr3 = this.f18796i;
        int i9 = this.j;
        this.j = i9 + 1;
        jArr3[i9] = jLongValue;
        return true;
    }
}
