package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1744g0 extends com.google.android.gms.internal.cast.AbstractC1728c0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient com.google.android.gms.internal.cast.C1756j0 f18910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient java.lang.Object[] f18911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient int f18912m;

    public C1744g0(com.google.android.gms.internal.cast.C1756j0 c1756j0, java.lang.Object[] objArr, int i3) {
        this.f18910k = c1756j0;
        this.f18911l = objArr;
        this.f18912m = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value != null && value.equals(this.f18910k.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.X
    public final int d(java.lang.Object[] objArr) {
        com.google.android.gms.internal.cast.AbstractC1720a0 abstractC1720a0Q = this.f18880i;
        if (abstractC1720a0Q == null) {
            abstractC1720a0Q = q();
            this.f18880i = abstractC1720a0Q;
        }
        return abstractC1720a0Q.d(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        com.google.android.gms.internal.cast.AbstractC1720a0 abstractC1720a0Q = this.f18880i;
        if (abstractC1720a0Q == null) {
            abstractC1720a0Q = q();
            this.f18880i = abstractC1720a0Q;
        }
        return abstractC1720a0Q.listIterator(0);
    }

    public final com.google.android.gms.internal.cast.AbstractC1720a0 q() {
        return new com.google.android.gms.internal.cast.C1740f0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18912m;
    }
}
