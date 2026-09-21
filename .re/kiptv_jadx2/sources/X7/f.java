package X7;

import S7.AbstractC0906w;
import S7.C;
import S7.C0903t;
import S7.J;
import S7.L;
import S7.X;
import S7.z0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class f extends L implements p117n6.d, p100l6.c {

    public static final AtomicReferenceFieldUpdater f10909o = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;

    public final AbstractC0906w f10910k;

    public final p117n6.c f10911l;

    public Object f10912m;

    public final Object f10913n;

    public f(AbstractC0906w abstractC0906w, p117n6.c cVar) {
        super(-1);
        this.f10910k = abstractC0906w;
        this.f10911l = cVar;
        this.f10912m = a.f10899b;
        this.f10913n = a.m(cVar.getContext());
    }

    @Override
    public final p117n6.d getCallerFrame() {
        return this.f10911l;
    }

    @Override
    public final p100l6.h getContext() {
        return this.f10911l.getContext();
    }

    @Override
    public final Object h() {
        Object obj = this.f10912m;
        this.f10912m = a.f10899b;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) throws J {
        Throwable thA = p070h6.n.a(obj);
        Object c0903t = thA == null ? obj : new C0903t(thA, false);
        p117n6.c cVar = this.f10911l;
        p100l6.h context = cVar.getContext();
        AbstractC0906w abstractC0906w = this.f10910k;
        if (a.j(abstractC0906w, context)) {
            this.f10912m = c0903t;
            this.j = 0;
            a.i(abstractC0906w, cVar.getContext(), this);
            return;
        }
        X xA = z0.a();
        if (xA.f9563i >= 4294967296L) {
            this.f10912m = c0903t;
            this.j = 0;
            xA.a0(this);
            return;
        }
        xA.c0(true);
        try {
            p100l6.h context2 = cVar.getContext();
            Object objN = a.n(context2, this.f10913n);
            try {
                cVar.resumeWith(obj);
                a.g(context2, objN);
                while (xA.e0()) {
                }
            } catch (Throwable th) {
                a.g(context2, objN);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                f(th2);
            } finally {
                xA.Z(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f10910k + ", " + C.H(this.f10911l) + ']';
    }

    @Override
    public final p100l6.c c() {
        return this;
    }
}
