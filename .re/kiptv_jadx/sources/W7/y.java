package W7;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends p117n6.c implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.InterfaceC0982h f10779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p100l6.h f10780i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p100l6.h f10781k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p100l6.c f10782l;

    public y(V7.InterfaceC0982h interfaceC0982h, p100l6.h hVar) {
        super(W7.w.f10777h, p100l6.i.f24820h);
        this.f10779h = interfaceC0982h;
        this.f10780i = hVar;
        this.j = ((java.lang.Number) hVar.fold(0, new B.C0063a(27))).intValue();
    }

    public final java.lang.Object a(p100l6.c cVar, java.lang.Object obj) {
        p100l6.h context = cVar.getContext();
        S7.C.p(context);
        p100l6.h hVar = this.f10781k;
        if (hVar != context) {
            if (hVar instanceof W7.t) {
                throw new java.lang.IllegalStateException(O7.r.T("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((W7.t) hVar).f10773i + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((java.lang.Number) context.fold(0, new B.d0(13, this))).intValue() != this.j) {
                throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f10780i + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f10781k = context;
        }
        this.f10782l = cVar;
        W7.z zVar = W7.A.f10720a;
        V7.InterfaceC0982h interfaceC0982h = this.f10779h;
        kotlin.jvm.internal.m.c(interfaceC0982h, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        zVar.getClass();
        java.lang.Object objEmit = interfaceC0982h.emit(obj, this);
        if (!kotlin.jvm.internal.m.a(objEmit, p109m6.a.f25430h)) {
            this.f10782l = null;
        }
        return objEmit;
    }

    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
        try {
            java.lang.Object objA = a(cVar, obj);
            return objA == p109m6.a.f25430h ? objA : p070h6.A.f22523a;
        } catch (java.lang.Throwable th) {
            this.f10781k = new W7.t(cVar.getContext(), th);
            throw th;
        }
    }

    @Override // p117n6.a, p117n6.d
    public final p117n6.d getCallerFrame() {
        p100l6.c cVar = this.f10782l;
        if (cVar instanceof p117n6.d) {
            return (p117n6.d) cVar;
        }
        return null;
    }

    @Override // p117n6.c, p100l6.c
    public final p100l6.h getContext() {
        p100l6.h hVar = this.f10781k;
        return hVar == null ? p100l6.i.f24820h : hVar;
    }

    @Override // p117n6.a
    public final java.lang.StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable thA = p070h6.n.a(obj);
        if (thA != null) {
            this.f10781k = new W7.t(getContext(), thA);
        }
        p100l6.c cVar = this.f10782l;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return p109m6.a.f25430h;
    }
}
