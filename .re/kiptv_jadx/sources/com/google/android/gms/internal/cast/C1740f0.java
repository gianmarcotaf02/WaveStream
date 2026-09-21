package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1740f0 extends com.google.android.gms.internal.cast.AbstractC1720a0 {
    public final /* synthetic */ com.google.android.gms.internal.cast.C1744g0 j;

    public C1740f0(com.google.android.gms.internal.cast.C1744g0 c1744g0) {
        this.j = c1744g0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i3) {
        com.google.android.gms.internal.cast.C1744g0 c1744g0 = this.j;
        com.google.android.gms.internal.cast.H.i(i3, c1744g0.f18912m);
        int i9 = i3 + i3;
        java.lang.Object[] objArr = c1744g0.f18911l;
        java.lang.Object obj = objArr[i9];
        java.util.Objects.requireNonNull(obj);
        java.lang.Object obj2 = objArr[i9 + 1];
        java.util.Objects.requireNonNull(obj2);
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.j.f18912m;
    }
}
