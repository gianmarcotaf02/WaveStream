package E5;

/* JADX INFO: loaded from: classes4.dex */
public final class D0 implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f2854i;
    public final java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f2855k;

    public /* synthetic */ D0(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i3) {
        this.f2853h = i3;
        this.f2854i = obj;
        this.j = obj2;
        this.f2855k = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v22, types: [n6.i, x6.m] */
    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
        V7.C0979e c0979e;
        V7.A a2;
        E5.D0 d4;
        boolean zBooleanValue;
        switch (this.f2853h) {
            case 0:
                E5.U u6 = (E5.U) obj;
                if (u6 instanceof E5.T) {
                    E5.T t9 = (E5.T) u6;
                    ((p194x6.m) this.f2854i).invoke(java.lang.Boolean.valueOf(t9.f2939a), java.lang.Boolean.valueOf(t9.f2940b));
                } else if (kotlin.jvm.internal.m.a(u6, E5.Q.f2931a)) {
                    ((kotlin.jvm.functions.Function0) this.j).invoke();
                } else if (kotlin.jvm.internal.m.a(u6, E5.S.f2936a)) {
                    ((kotlin.jvm.functions.Function0) this.f2855k).invoke();
                }
                return p070h6.A.f22523a;
            case 1:
                if (cVar instanceof V7.C0979e) {
                    c0979e = (V7.C0979e) cVar;
                    int i3 = c0979e.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c0979e.j = i3 - Integer.MIN_VALUE;
                    } else {
                        c0979e = new V7.C0979e(this, cVar);
                    }
                } else {
                    c0979e = new V7.C0979e(this, cVar);
                }
                java.lang.Object obj2 = c0979e.f10455h;
                p109m6.a aVar = p109m6.a.f25430h;
                int i9 = c0979e.j;
                p070h6.A a9 = p070h6.A.f22523a;
                if (i9 == 0) {
                    com.google.common.util.concurrent.P.u0(obj2);
                    V7.C0980f c0980f = (V7.C0980f) this.f2854i;
                    c0980f.getClass();
                    kotlin.jvm.internal.A a10 = (kotlin.jvm.internal.A) this.j;
                    java.lang.Object obj3 = a10.f24539h;
                    if (obj3 == W7.AbstractC1009c.f10731b || !((java.lang.Boolean) c0980f.f10458i.invoke(obj3, obj)).booleanValue()) {
                        a10.f24539h = obj;
                        c0979e.j = 1;
                        if (((V7.InterfaceC0982h) this.f2855k).emit(obj, c0979e) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj2);
                }
                return a9;
            case 2:
                if (cVar instanceof V7.A) {
                    a2 = (V7.A) cVar;
                    int i10 = a2.f10368l;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        a2.f10368l = i10 - Integer.MIN_VALUE;
                    } else {
                        a2 = new V7.A(this, cVar);
                    }
                } else {
                    a2 = new V7.A(this, cVar);
                }
                java.lang.Object objInvoke = a2.j;
                p109m6.a aVar2 = p109m6.a.f25430h;
                int i11 = a2.f10368l;
                p070h6.A a11 = p070h6.A.f22523a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            obj = a2.f10366i;
                            d4 = a2.f10365h;
                            com.google.common.util.concurrent.P.u0(objInvoke);
                            if (!((java.lang.Boolean) objInvoke).booleanValue()) {
                                ((kotlin.jvm.internal.w) d4.f2854i).f24553h = true;
                                a2.f10365h = null;
                                a2.f10366i = null;
                                a2.f10368l = 3;
                                if (((V7.InterfaceC0982h) d4.j).emit(obj, a2) == aVar2) {
                                    return aVar2;
                                }
                            }
                        } else if (i11 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    com.google.common.util.concurrent.P.u0(objInvoke);
                } else {
                    com.google.common.util.concurrent.P.u0(objInvoke);
                    if (((kotlin.jvm.internal.w) this.f2854i).f24553h) {
                        a2.f10368l = 1;
                        if (((V7.InterfaceC0982h) this.j).emit(obj, a2) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        a2.f10365h = this;
                        a2.f10366i = obj;
                        a2.f10368l = 2;
                        objInvoke = ((p117n6.i) this.f2855k).invoke(obj, a2);
                        if (objInvoke == aVar2) {
                            return aVar2;
                        }
                        d4 = this;
                        if (!((java.lang.Boolean) objInvoke).booleanValue()) {
                            ((kotlin.jvm.internal.w) d4.f2854i).f24553h = true;
                            a2.f10365h = null;
                            a2.f10366i = null;
                            a2.f10368l = 3;
                            if (((V7.InterfaceC0982h) d4.j).emit(obj, a2) == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                }
                return a11;
            case 3:
                java.lang.Object objC = W7.AbstractC1009c.c((p100l6.h) this.f2854i, obj, this.j, (W7.E) this.f2855k, cVar);
                return objC == p109m6.a.f25430h ? objC : p070h6.A.f22523a;
            case 4:
                p019c.a aVar3 = (p019c.a) obj;
                if (((java.util.List) ((p020c0.X) this.f2854i).getValue()).size() > 1) {
                    ((p020c0.X) this.j).setValue(java.lang.Boolean.TRUE);
                    ((p020c0.C1673c0) this.f2855k).h(aVar3.f18028c);
                }
                return p070h6.A.f22523a;
            default:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    p194x6.m mVar = (p194x6.m) ((p020c0.X) this.f2855k).getValue();
                    p163t.y0 y0Var = (p163t.y0) this.j;
                    zBooleanValue = ((java.lang.Boolean) mVar.invoke(y0Var.f27727a.s0(), y0Var.f27730d.getValue())).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                ((p020c0.C1695n0) this.f2854i).setValue(java.lang.Boolean.valueOf(zBooleanValue));
                return p070h6.A.f22523a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D0(kotlin.jvm.internal.w wVar, V7.InterfaceC0982h interfaceC0982h, p194x6.m mVar) {
        this.f2853h = 2;
        this.f2854i = wVar;
        this.j = interfaceC0982h;
        this.f2855k = (p117n6.i) mVar;
    }

    public D0(V7.InterfaceC0982h interfaceC0982h, p100l6.h hVar) {
        this.f2853h = 3;
        this.f2854i = hVar;
        this.j = X7.a.m(hVar);
        this.f2855k = new W7.E(interfaceC0982h, null);
    }
}
