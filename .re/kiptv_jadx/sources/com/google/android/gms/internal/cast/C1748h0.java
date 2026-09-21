package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1748h0 extends com.google.android.gms.internal.cast.AbstractC1728c0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient com.google.android.gms.internal.cast.C1756j0 f18916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient com.google.android.gms.internal.cast.C1752i0 f18917l;

    public C1748h0(com.google.android.gms.internal.cast.C1756j0 c1756j0, com.google.android.gms.internal.cast.C1752i0 c1752i0) {
        this.f18916k = c1756j0;
        this.f18917l = c1752i0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f18916k.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.cast.X
    public final int d(java.lang.Object[] objArr) {
        return this.f18917l.d(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.f18917l.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18916k.f18936m;
    }
}
