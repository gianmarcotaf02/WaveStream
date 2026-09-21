package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1730c2 extends com.google.android.gms.internal.cast.H {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f18881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f18882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f18883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f18884n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f18885o;

    public C1730c2(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(9);
        this.f18881k = atomicReferenceFieldUpdater;
        this.f18882l = atomicReferenceFieldUpdater2;
        this.f18883m = atomicReferenceFieldUpdater3;
        this.f18884n = atomicReferenceFieldUpdater4;
        this.f18885o = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.cast.H
    public final com.google.android.gms.internal.cast.C1726b2 d(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2) {
        return (com.google.android.gms.internal.cast.C1726b2) this.f18884n.getAndSet(abstractC1750h2, com.google.android.gms.internal.cast.C1726b2.f18873d);
    }

    @Override // com.google.android.gms.internal.cast.H
    public final com.google.android.gms.internal.cast.C1746g2 k(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2) {
        return (com.google.android.gms.internal.cast.C1746g2) this.f18883m.getAndSet(abstractC1750h2, com.google.android.gms.internal.cast.C1746g2.f18913c);
    }

    @Override // com.google.android.gms.internal.cast.H
    public final void m(com.google.android.gms.internal.cast.C1746g2 c1746g2, com.google.android.gms.internal.cast.C1746g2 c1746g3) {
        this.f18882l.lazySet(c1746g2, c1746g3);
    }

    @Override // com.google.android.gms.internal.cast.H
    public final void o(com.google.android.gms.internal.cast.C1746g2 c1746g2, java.lang.Thread thread) {
        this.f18881k.lazySet(c1746g2, thread);
    }

    @Override // com.google.android.gms.internal.cast.H
    public final boolean q(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, com.google.android.gms.internal.cast.C1726b2 c1726b2, com.google.android.gms.internal.cast.C1726b2 c1726b3) {
        return com.google.android.gms.internal.cast.H.j(this.f18884n, abstractC1750h2, c1726b2, c1726b3);
    }

    @Override // com.google.android.gms.internal.cast.H
    public final boolean r(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.cast.H.j(this.f18885o, abstractC1750h2, obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.H
    public final boolean s(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, com.google.android.gms.internal.cast.C1746g2 c1746g2, com.google.android.gms.internal.cast.C1746g2 c1746g3) {
        return com.google.android.gms.internal.cast.H.j(this.f18883m, abstractC1750h2, c1746g2, c1746g3);
    }
}
