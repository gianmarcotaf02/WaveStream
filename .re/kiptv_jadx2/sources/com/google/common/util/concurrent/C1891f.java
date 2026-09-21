package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class C1891f extends AbstractC1887b {

    public final AtomicReferenceFieldUpdater f19435a;

    public final AtomicReferenceFieldUpdater f19436b;

    public final AtomicReferenceFieldUpdater f19437c;

    public final AtomicReferenceFieldUpdater f19438d;

    public final AtomicReferenceFieldUpdater f19439e;

    public C1891f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f19435a = atomicReferenceFieldUpdater;
        this.f19436b = atomicReferenceFieldUpdater2;
        this.f19437c = atomicReferenceFieldUpdater3;
        this.f19438d = atomicReferenceFieldUpdater4;
        this.f19439e = atomicReferenceFieldUpdater5;
    }

    @Override
    public final boolean a(AbstractC1902q abstractC1902q, C1890e c1890e, C1890e c1890e2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19438d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1902q, c1890e, c1890e2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1902q) == c1890e);
        return false;
    }

    @Override
    public final boolean b(AbstractC1902q abstractC1902q, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19439e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1902q, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1902q) == obj);
        return false;
    }

    @Override
    public final boolean c(AbstractC1902q abstractC1902q, C1901p c1901p, C1901p c1901p2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19437c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1902q, c1901p, c1901p2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1902q) == c1901p);
        return false;
    }

    @Override
    public final C1890e d(AbstractC1902q abstractC1902q) {
        return (C1890e) this.f19438d.getAndSet(abstractC1902q, C1890e.f19431d);
    }

    @Override
    public final C1901p e(AbstractC1902q abstractC1902q) {
        return (C1901p) this.f19437c.getAndSet(abstractC1902q, C1901p.f19448c);
    }

    @Override
    public final void f(C1901p c1901p, C1901p c1901p2) {
        this.f19436b.lazySet(c1901p, c1901p2);
    }

    @Override
    public final void g(C1901p c1901p, Thread thread) {
        this.f19435a.lazySet(c1901p, thread);
    }
}
