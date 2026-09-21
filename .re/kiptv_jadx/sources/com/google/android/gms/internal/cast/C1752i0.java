package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1752i0 extends com.google.android.gms.internal.cast.AbstractC1720a0 {
    public final transient java.lang.Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient int f18927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient int f18928l;

    public C1752i0(java.lang.Object[] objArr, int i3, int i9) {
        this.j = objArr;
        this.f18927k = i3;
        this.f18928l = i9;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        com.google.android.gms.internal.cast.H.i(i3, this.f18928l);
        java.lang.Object obj = this.j[i3 + i3 + this.f18927k];
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18928l;
    }
}
