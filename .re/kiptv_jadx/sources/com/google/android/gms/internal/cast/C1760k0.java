package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1760k0 extends com.google.android.gms.internal.cast.AbstractC1728c0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final java.lang.Object[] f18939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.C1760k0 f18940q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient java.lang.Object[] f18941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient int f18942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient java.lang.Object[] f18943m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient int f18944n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient int f18945o;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        f18939p = objArr;
        f18940q = new com.google.android.gms.internal.cast.C1760k0(0, 0, 0, objArr, objArr);
    }

    public C1760k0(int i3, int i9, int i10, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        this.f18941k = objArr;
        this.f18942l = i3;
        this.f18943m = objArr2;
        this.f18944n = i9;
        this.f18945o = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj != null) {
            java.lang.Object[] objArr = this.f18943m;
            if (objArr.length != 0) {
                int iB = com.google.android.gms.internal.cast.H.b(obj.hashCode());
                while (true) {
                    int i3 = iB & this.f18944n;
                    java.lang.Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iB = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.X
    public final int d(java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = this.f18941k;
        int i3 = this.f18945o;
        java.lang.System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.cast.X
    public final int e() {
        return this.f18945o;
    }

    @Override // com.google.android.gms.internal.cast.X
    public final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1728c0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18942l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        com.google.android.gms.internal.cast.AbstractC1720a0 abstractC1720a0P = this.f18880i;
        if (abstractC1720a0P == null) {
            abstractC1720a0P = com.google.android.gms.internal.cast.AbstractC1720a0.p(this.f18941k, this.f18945o);
            this.f18880i = abstractC1720a0P;
        }
        return abstractC1720a0P.listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.X
    public final java.lang.Object[] n() {
        return this.f18941k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18945o;
    }
}
