package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends com.google.android.gms.internal.cast.AbstractC1720a0 {
    public final transient int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient int f18852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.cast.AbstractC1720a0 f18853l;

    public Z(com.google.android.gms.internal.cast.AbstractC1720a0 abstractC1720a0, int i3, int i9) {
        this.f18853l = abstractC1720a0;
        this.j = i3;
        this.f18852k = i9;
    }

    @Override // com.google.android.gms.internal.cast.X
    public final int e() {
        return this.f18853l.f() + this.j + this.f18852k;
    }

    @Override // com.google.android.gms.internal.cast.X
    public final int f() {
        return this.f18853l.f() + this.j;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        com.google.android.gms.internal.cast.H.i(i3, this.f18852k);
        return this.f18853l.get(i3 + this.j);
    }

    @Override // com.google.android.gms.internal.cast.X
    public final java.lang.Object[] n() {
        return this.f18853l.n();
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1720a0, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.cast.AbstractC1720a0 subList(int i3, int i9) {
        com.google.android.gms.internal.cast.H.n(i3, i9, this.f18852k);
        int i10 = this.j;
        return this.f18853l.subList(i3 + i10, i9 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18852k;
    }
}
