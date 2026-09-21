package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends p117n6.i implements p194x6.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10411h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10412i;
    public /* synthetic */ V7.InterfaceC0982h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object[] f10413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p117n6.i f10414l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public P(p100l6.c cVar, p194x6.q qVar) {
        super(3, cVar);
        this.f10414l = (p117n6.i) qVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [n6.i, x6.o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [n6.i, x6.p] */
    /* JADX WARN: Type inference failed for: r1v2, types: [n6.i, x6.q] */
    /* JADX WARN: Type inference failed for: r1v3, types: [n6.i, x6.n] */
    @Override // p194x6.n
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        V7.InterfaceC0982h interfaceC0982h = (V7.InterfaceC0982h) obj;
        java.lang.Object[] objArr = (java.lang.Object[]) obj2;
        p100l6.c cVar = (p100l6.c) obj3;
        switch (this.f10411h) {
            case 0:
                V7.P p2 = new V7.P((p194x6.o) this.f10414l, cVar);
                p2.j = interfaceC0982h;
                p2.f10413k = objArr;
                return p2.invokeSuspend(p070h6.A.f22523a);
            case 1:
                V7.P p9 = new V7.P((p194x6.p) this.f10414l, cVar);
                p9.j = interfaceC0982h;
                p9.f10413k = objArr;
                return p9.invokeSuspend(p070h6.A.f22523a);
            case 2:
                V7.P p10 = new V7.P(cVar, (p194x6.q) this.f10414l);
                p10.j = interfaceC0982h;
                p10.f10413k = objArr;
                return p10.invokeSuspend(p070h6.A.f22523a);
            default:
                V7.P p11 = new V7.P((p194x6.n) this.f10414l, cVar);
                p11.j = interfaceC0982h;
                p11.f10413k = objArr;
                return p11.invokeSuspend(p070h6.A.f22523a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [n6.i, x6.o] */
    /* JADX WARN: Type inference failed for: r3v4, types: [n6.i, x6.p] */
    /* JADX WARN: Type inference failed for: r3v9, types: [n6.i, x6.n] */
    /* JADX WARN: Type inference failed for: r5v2, types: [n6.i, x6.q] */
    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        V7.InterfaceC0982h interfaceC0982h;
        V7.InterfaceC0982h interfaceC0982h2;
        V7.InterfaceC0982h interfaceC0982h3;
        V7.P p2;
        V7.InterfaceC0982h interfaceC0982h4;
        switch (this.f10411h) {
            case 0:
                p109m6.a aVar = p109m6.a.f25430h;
                int i3 = this.f10412i;
                if (i3 != 0) {
                    if (i3 == 1) {
                        interfaceC0982h = this.j;
                        com.google.common.util.concurrent.P.u0(obj);
                    } else {
                        if (i3 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.common.util.concurrent.P.u0(obj);
                    }
                    return p070h6.A.f22523a;
                }
                com.google.common.util.concurrent.P.u0(obj);
                interfaceC0982h = this.j;
                java.lang.Object[] objArr = this.f10413k;
                java.lang.Object obj2 = objArr[0];
                java.lang.Object obj3 = objArr[1];
                java.lang.Object obj4 = objArr[2];
                this.j = interfaceC0982h;
                this.f10412i = 1;
                obj = this.f10414l.invoke(obj2, obj3, obj4, this);
                if (obj == aVar) {
                    return aVar;
                }
                this.j = null;
                this.f10412i = 2;
                if (interfaceC0982h.emit(obj, this) == aVar) {
                    return aVar;
                }
                return p070h6.A.f22523a;
            case 1:
                p109m6.a aVar2 = p109m6.a.f25430h;
                int i9 = this.f10412i;
                if (i9 != 0) {
                    if (i9 == 1) {
                        interfaceC0982h2 = this.j;
                        com.google.common.util.concurrent.P.u0(obj);
                    } else {
                        if (i9 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.common.util.concurrent.P.u0(obj);
                    }
                    return p070h6.A.f22523a;
                }
                com.google.common.util.concurrent.P.u0(obj);
                interfaceC0982h2 = this.j;
                java.lang.Object[] objArr2 = this.f10413k;
                java.lang.Object obj5 = objArr2[0];
                java.lang.Object obj6 = objArr2[1];
                java.lang.Object obj7 = objArr2[2];
                java.lang.Object obj8 = objArr2[3];
                this.j = interfaceC0982h2;
                this.f10412i = 1;
                obj = this.f10414l.invoke(obj5, obj6, obj7, obj8, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                this.j = null;
                this.f10412i = 2;
                if (interfaceC0982h2.emit(obj, this) == aVar2) {
                    return aVar2;
                }
                return p070h6.A.f22523a;
            case 2:
                p109m6.a aVar3 = p109m6.a.f25430h;
                int i10 = this.f10412i;
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC0982h3 = this.j;
                        com.google.common.util.concurrent.P.u0(obj);
                        p2 = this;
                    } else {
                        if (i10 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.common.util.concurrent.P.u0(obj);
                    }
                    return p070h6.A.f22523a;
                }
                com.google.common.util.concurrent.P.u0(obj);
                interfaceC0982h3 = this.j;
                java.lang.Object[] objArr3 = this.f10413k;
                java.lang.Object obj9 = objArr3[0];
                java.lang.Object obj10 = objArr3[1];
                java.lang.Object obj11 = objArr3[2];
                java.lang.Object obj12 = objArr3[3];
                java.lang.Object obj13 = objArr3[4];
                this.j = interfaceC0982h3;
                this.f10412i = 1;
                obj = this.f10414l.e(obj9, obj10, obj11, obj12, obj13, this);
                p2 = this;
                if (obj == aVar3) {
                    return aVar3;
                }
                p2.j = null;
                p2.f10412i = 2;
                if (interfaceC0982h3.emit(obj, this) == aVar3) {
                    return aVar3;
                }
                return p070h6.A.f22523a;
            default:
                p109m6.a aVar4 = p109m6.a.f25430h;
                int i11 = this.f10412i;
                if (i11 != 0) {
                    if (i11 == 1) {
                        interfaceC0982h4 = this.j;
                        com.google.common.util.concurrent.P.u0(obj);
                    } else {
                        if (i11 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.common.util.concurrent.P.u0(obj);
                    }
                    return p070h6.A.f22523a;
                }
                com.google.common.util.concurrent.P.u0(obj);
                interfaceC0982h4 = this.j;
                java.lang.Object[] objArr4 = this.f10413k;
                java.lang.Object obj14 = objArr4[0];
                java.lang.Object obj15 = objArr4[1];
                this.j = interfaceC0982h4;
                this.f10412i = 1;
                obj = this.f10414l.invoke(obj14, obj15, this);
                if (obj == aVar4) {
                    return aVar4;
                }
                this.j = null;
                this.f10412i = 2;
                if (interfaceC0982h4.emit(obj, this) == aVar4) {
                    return aVar4;
                }
                return p070h6.A.f22523a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public P(p194x6.n nVar, p100l6.c cVar) {
        super(3, cVar);
        this.f10414l = (p117n6.i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public P(p194x6.o oVar, p100l6.c cVar) {
        super(3, cVar);
        this.f10414l = (p117n6.i) oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public P(p194x6.p pVar, p100l6.c cVar) {
        super(3, cVar);
        this.f10414l = (p117n6.i) pVar;
    }
}
