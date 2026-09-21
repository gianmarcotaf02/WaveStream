package W7;

import B.C0063a;
import B.d0;
import V7.InterfaceC0982h;

public final class y extends p117n6.c implements InterfaceC0982h {

    public final InterfaceC0982h f10779h;

    public final p100l6.h f10780i;
    public final int j;

    public p100l6.h f10781k;

    public p100l6.c f10782l;

    public y(InterfaceC0982h interfaceC0982h, p100l6.h hVar) {
        super(w.f10777h, p100l6.i.f24820h);
        this.f10779h = interfaceC0982h;
        this.f10780i = hVar;
        this.j = ((Number) hVar.fold(0, new C0063a(27))).intValue();
    }

    public final Object a(p100l6.c cVar, Object obj) {
        p100l6.h context = cVar.getContext();
        S7.C.p(context);
        p100l6.h hVar = this.f10781k;
        if (hVar != context) {
            if (hVar instanceof t) {
                throw new IllegalStateException(O7.r.T("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((t) hVar).f10773i + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new d0(13, this))).intValue() != this.j) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f10780i + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f10781k = context;
        }
        this.f10782l = cVar;
        z zVar = A.f10720a;
        InterfaceC0982h interfaceC0982h = this.f10779h;
        kotlin.jvm.internal.m.c(interfaceC0982h, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        zVar.getClass();
        Object objEmit = interfaceC0982h.emit(obj, this);
        if (!kotlin.jvm.internal.m.a(objEmit, p109m6.a.f25430h)) {
            this.f10782l = null;
        }
        return objEmit;
    }

    @Override
    public final Object emit(Object obj, p100l6.c cVar) {
        try {
            Object objA = a(cVar, obj);
            return objA == p109m6.a.f25430h ? objA : p070h6.A.f22523a;
        } catch (Throwable th) {
            this.f10781k = new t(cVar.getContext(), th);
            throw th;
        }
    }

    @Override
    public final p117n6.d getCallerFrame() {
        p100l6.c cVar = this.f10782l;
        if (cVar instanceof p117n6.d) {
            return (p117n6.d) cVar;
        }
        return null;
    }

    @Override
    public final p100l6.h getContext() {
        p100l6.h hVar = this.f10781k;
        return hVar == null ? p100l6.i.f24820h : hVar;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable thA = p070h6.n.a(obj);
        if (thA != null) {
            this.f10781k = new t(getContext(), thA);
        }
        p100l6.c cVar = this.f10782l;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return p109m6.a.f25430h;
    }
}
