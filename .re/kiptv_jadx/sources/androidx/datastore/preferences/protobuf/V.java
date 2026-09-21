package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class V extends androidx.datastore.preferences.protobuf.AbstractC1495b implements java.util.RandomAccess {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.V f16165k = new androidx.datastore.preferences.protobuf.V(new java.lang.Object[0], 0, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object[] f16166i;
    public int j;

    public V(java.lang.Object[] objArr, int i3, boolean z6) {
        this.f16181h = z6;
        this.f16166i = objArr;
        this.j = i3;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        d();
        int i3 = this.j;
        java.lang.Object[] objArr = this.f16166i;
        if (i3 == objArr.length) {
            this.f16166i = java.util.Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        java.lang.Object[] objArr2 = this.f16166i;
        int i9 = this.j;
        this.j = i9 + 1;
        objArr2[i9] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    public final void e(int i3) {
        if (i3 < 0 || i3 >= this.j) {
            java.lang.StringBuilder sbT = p121o0.p.t(i3, "Index:", ", Size:");
            sbT.append(this.j);
            throw new java.lang.IndexOutOfBoundsException(sbT.toString());
        }
    }

    public final androidx.datastore.preferences.protobuf.V f(int i3) {
        if (i3 >= this.j) {
            return new androidx.datastore.preferences.protobuf.V(java.util.Arrays.copyOf(this.f16166i, i3), this.j, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i3) {
        e(i3);
        return this.f16166i[i3];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1495b, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i3) {
        d();
        e(i3);
        java.lang.Object[] objArr = this.f16166i;
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
        java.lang.Object[] objArr = this.f16166i;
        java.lang.Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((java.util.AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, java.lang.Object obj) {
        int i9;
        d();
        if (i3 >= 0 && i3 <= (i9 = this.j)) {
            java.lang.Object[] objArr = this.f16166i;
            if (i9 < objArr.length) {
                java.lang.System.arraycopy(objArr, i3, objArr, i3 + 1, i9 - i3);
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[Y6.f.c(i9, 3, 2, 1)];
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, i3);
                java.lang.System.arraycopy(this.f16166i, i3, objArr2, i3 + 1, this.j - i3);
                this.f16166i = objArr2;
            }
            this.f16166i[i3] = obj;
            this.j++;
            ((java.util.AbstractList) this).modCount++;
            return;
        }
        java.lang.StringBuilder sbT = p121o0.p.t(i3, "Index:", ", Size:");
        sbT.append(this.j);
        throw new java.lang.IndexOutOfBoundsException(sbT.toString());
    }
}
