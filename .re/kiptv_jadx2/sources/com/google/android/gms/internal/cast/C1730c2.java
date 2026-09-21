package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class C1730c2 extends H {

    public final AtomicReferenceFieldUpdater f18881k;

    public final AtomicReferenceFieldUpdater f18882l;

    public final AtomicReferenceFieldUpdater f18883m;

    public final AtomicReferenceFieldUpdater f18884n;

    public final AtomicReferenceFieldUpdater f18885o;

    public C1730c2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(9);
        this.f18881k = atomicReferenceFieldUpdater;
        this.f18882l = atomicReferenceFieldUpdater2;
        this.f18883m = atomicReferenceFieldUpdater3;
        this.f18884n = atomicReferenceFieldUpdater4;
        this.f18885o = atomicReferenceFieldUpdater5;
    }

    @Override
    public final C1726b2 d(AbstractC1750h2 abstractC1750h2) {
        return (C1726b2) this.f18884n.getAndSet(abstractC1750h2, C1726b2.f18873d);
    }

    @Override
    public final C1746g2 k(AbstractC1750h2 abstractC1750h2) {
        return (C1746g2) this.f18883m.getAndSet(abstractC1750h2, C1746g2.f18913c);
    }

    @Override
    public final void m(C1746g2 c1746g2, C1746g2 c1746g3) {
        this.f18882l.lazySet(c1746g2, c1746g3);
    }

    @Override
    public final void o(C1746g2 c1746g2, Thread thread) {
        this.f18881k.lazySet(c1746g2, thread);
    }

    @Override
    public final boolean q(AbstractC1750h2 abstractC1750h2, C1726b2 c1726b2, C1726b2 c1726b3) {
        return H.j(this.f18884n, abstractC1750h2, c1726b2, c1726b3);
    }

    @Override
    public final boolean r(AbstractC1750h2 abstractC1750h2, Object obj, Object obj2) {
        return H.j(this.f18885o, abstractC1750h2, obj, obj2);
    }

    @Override
    public final boolean s(AbstractC1750h2 abstractC1750h2, C1746g2 c1746g2, C1746g2 c1746g3) {
        return H.j(this.f18883m, abstractC1750h2, c1746g2, c1746g3);
    }
}
