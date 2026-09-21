package W7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends W7.g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V7.InterfaceC0981g f10743k;

    public i(V7.InterfaceC0981g interfaceC0981g, p100l6.h hVar, int i3, U7.EnumC0955c enumC0955c) {
        super(hVar, i3, enumC0955c);
        this.f10743k = interfaceC0981g;
    }

    @Override // W7.g
    public final java.lang.Object c(U7.A a2, p100l6.c cVar) {
        java.lang.Object objG = g(new W7.B(a2), cVar);
        return objG == p109m6.a.f25430h ? objG : p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[RETURN] */
    @Override // W7.g, V7.InterfaceC0981g
    public final java.lang.Object collect(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        java.lang.Object objCollect;
        p070h6.A a2 = p070h6.A.f22523a;
        if (this.f10740i == -3) {
            p100l6.h context = cVar.getContext();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            B.C0063a c0063a = new B.C0063a(23);
            p100l6.h hVar = this.f10739h;
            p100l6.h hVarPlus = !((java.lang.Boolean) hVar.fold(bool, c0063a)).booleanValue() ? context.plus(hVar) : S7.C.q(context, hVar, false);
            if (kotlin.jvm.internal.m.a(hVarPlus, context)) {
                java.lang.Object objG = g(interfaceC0982h, cVar);
                if (objG == p109m6.a.f25430h) {
                    return objG;
                }
            } else {
                p100l6.d dVar = p100l6.d.f24819h;
                if (kotlin.jvm.internal.m.a(hVarPlus.get(dVar), context.get(dVar))) {
                    p100l6.h context2 = cVar.getContext();
                    if (!(interfaceC0982h instanceof W7.B) && !(interfaceC0982h instanceof W7.x)) {
                        interfaceC0982h = new E5.D0(interfaceC0982h, context2);
                    }
                    java.lang.Object objC = W7.AbstractC1009c.c(hVarPlus, interfaceC0982h, X7.a.m(hVarPlus), new W7.h(this, null), cVar);
                    if (objC == p109m6.a.f25430h) {
                        return objC;
                    }
                } else {
                    objCollect = super.collect(interfaceC0982h, cVar);
                    if (objCollect == p109m6.a.f25430h) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(interfaceC0982h, cVar);
            if (objCollect == p109m6.a.f25430h) {
                return objCollect;
            }
        }
        return a2;
    }

    public abstract java.lang.Object g(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar);

    @Override // W7.g
    public final java.lang.String toString() {
        return this.f10743k + " -> " + super.toString();
    }
}
