package p100l6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p070h6.m;
import p109m6.a;
import p117n6.d;

public final class j implements c, d {

    public static final AtomicReferenceFieldUpdater f24821i = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");

    public final c f24822h;
    private volatile Object result;

    public j(c cVar, a aVar) {
        this.f24822h = cVar;
        this.result = aVar;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        a aVar = a.f25431i;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24821i;
            a aVar2 = a.f25430h;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return a.f25430h;
        }
        if (obj == a.j) {
            return a.f25430h;
        }
        if (obj instanceof m) {
            throw ((m) obj).f22541h;
        }
        return obj;
    }

    @Override
    public final d getCallerFrame() {
        c cVar = this.f24822h;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    @Override
    public final h getContext() {
        return this.f24822h.getContext();
    }

    @Override
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            a aVar = a.f25431i;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24821i;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    }
                }
                return;
            }
            a aVar2 = a.f25430h;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f24821i;
            a aVar3 = a.j;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    this.f24822h.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == aVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f24822h;
    }
}
