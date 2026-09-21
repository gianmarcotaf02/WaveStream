package p100l6;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements p100l6.c, p117n6.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f24821i = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p100l6.j.class, java.lang.Object.class, "result");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p100l6.c f24822h;
    private volatile java.lang.Object result;

    public j(p100l6.c cVar, p109m6.a aVar) {
        this.f24822h = cVar;
        this.result = aVar;
    }

    public final java.lang.Object a() throws java.lang.Throwable {
        java.lang.Object obj = this.result;
        p109m6.a aVar = p109m6.a.f25431i;
        if (obj == aVar) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24821i;
            p109m6.a aVar2 = p109m6.a.f25430h;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return p109m6.a.f25430h;
        }
        if (obj == p109m6.a.j) {
            return p109m6.a.f25430h;
        }
        if (obj instanceof p070h6.m) {
            throw ((p070h6.m) obj).f22541h;
        }
        return obj;
    }

    @Override // p117n6.d
    public final p117n6.d getCallerFrame() {
        p100l6.c cVar = this.f24822h;
        if (cVar instanceof p117n6.d) {
            return (p117n6.d) cVar;
        }
        return null;
    }

    @Override // p100l6.c
    public final p100l6.h getContext() {
        return this.f24822h.getContext();
    }

    @Override // p100l6.c
    public final void resumeWith(java.lang.Object obj) {
        while (true) {
            java.lang.Object obj2 = this.result;
            p109m6.a aVar = p109m6.a.f25431i;
            if (obj2 == aVar) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24821i;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    }
                }
                return;
            }
            p109m6.a aVar2 = p109m6.a.f25430h;
            if (obj2 != aVar2) {
                throw new java.lang.IllegalStateException("Already resumed");
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f24821i;
            p109m6.a aVar3 = p109m6.a.j;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    this.f24822h.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == aVar2);
        }
    }

    public final java.lang.String toString() {
        return "SafeContinuation for " + this.f24822h;
    }
}
