package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1736e0 extends com.google.android.gms.internal.cast.AbstractC1720a0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.C1736e0 f18895l = new com.google.android.gms.internal.cast.C1736e0(new java.lang.Object[0], 0);
    public final transient java.lang.Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient int f18896k;

    public C1736e0(java.lang.Object[] objArr, int i3) {
        this.j = objArr;
        this.f18896k = i3;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1720a0, com.google.android.gms.internal.cast.X
    public final int d(java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = this.j;
        int i3 = this.f18896k;
        java.lang.System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.cast.X
    public final int e() {
        return this.f18896k;
    }

    @Override // com.google.android.gms.internal.cast.X
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        com.google.android.gms.internal.cast.H.i(i3, this.f18896k);
        java.lang.Object obj = this.j[i3];
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.cast.X
    public final java.lang.Object[] n() {
        return this.j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18896k;
    }
}
