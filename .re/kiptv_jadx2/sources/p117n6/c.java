package p117n6;

import S7.AbstractC0906w;
import S7.C0895k;
import X7.a;
import X7.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import p100l6.d;
import p100l6.e;
import p100l6.h;

public abstract class c extends a {
    private final h _context;
    private transient p100l6.c intercepted;

    public c(p100l6.c cVar, h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override
    public h getContext() {
        h hVar = this._context;
        m.b(hVar);
        return hVar;
    }

    public final p100l6.c intercepted() {
        p100l6.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        e eVar = (e) getContext().get(d.f24819h);
        p100l6.c fVar = eVar != null ? new f((AbstractC0906w) eVar, this) : this;
        this.intercepted = fVar;
        return fVar;
    }

    @Override
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p100l6.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            p100l6.f fVar = getContext().get(d.f24819h);
            m.b(fVar);
            f fVar2 = (f) cVar;
            do {
                atomicReferenceFieldUpdater = f.f10909o;
            } while (atomicReferenceFieldUpdater.get(fVar2) == a.f10900c);
            Object obj = atomicReferenceFieldUpdater.get(fVar2);
            C0895k c0895k = obj instanceof C0895k ? (C0895k) obj : null;
            if (c0895k != null) {
                c0895k.l();
            }
        }
        this.intercepted = b.f25831h;
    }

    public c(p100l6.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
