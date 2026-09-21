package p117n6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends p117n6.a {
    private final p100l6.h _context;
    private transient p100l6.c intercepted;

    public c(p100l6.c cVar, p100l6.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // p100l6.c
    public p100l6.h getContext() {
        p100l6.h hVar = this._context;
        kotlin.jvm.internal.m.b(hVar);
        return hVar;
    }

    public final p100l6.c intercepted() {
        p100l6.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        p100l6.e eVar = (p100l6.e) getContext().get(p100l6.d.f24819h);
        p100l6.c fVar = eVar != null ? new X7.f((S7.AbstractC0906w) eVar, this) : this;
        this.intercepted = fVar;
        return fVar;
    }

    @Override // p117n6.a
    public void releaseIntercepted() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p100l6.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            p100l6.f fVar = getContext().get(p100l6.d.f24819h);
            kotlin.jvm.internal.m.b(fVar);
            X7.f fVar2 = (X7.f) cVar;
            do {
                atomicReferenceFieldUpdater = X7.f.f10909o;
            } while (atomicReferenceFieldUpdater.get(fVar2) == X7.a.f10900c);
            java.lang.Object obj = atomicReferenceFieldUpdater.get(fVar2);
            S7.C0895k c0895k = obj instanceof S7.C0895k ? (S7.C0895k) obj : null;
            if (c0895k != null) {
                c0895k.l();
            }
        }
        this.intercepted = p117n6.b.f25831h;
    }

    public c(p100l6.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
