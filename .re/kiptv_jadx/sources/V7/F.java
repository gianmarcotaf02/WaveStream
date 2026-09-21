package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p117n6.i f10382i;
    public final /* synthetic */ kotlin.jvm.internal.A j;

    /* JADX WARN: Multi-variable type inference failed */
    public F(p194x6.m mVar, kotlin.jvm.internal.A a2, int i3) {
        this.f10381h = i3;
        switch (i3) {
            case 1:
                this.f10382i = (p117n6.i) mVar;
                this.j = a2;
                break;
            default:
                this.f10382i = (p117n6.i) mVar;
                this.j = a2;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r6v10, types: [n6.i, x6.m] */
    /* JADX WARN: Type inference failed for: r6v2, types: [n6.i, x6.m] */
    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
        V7.E e6;
        V7.F f9;
        V7.I i3;
        V7.F f10;
        switch (this.f10381h) {
            case 0:
                if (cVar instanceof V7.E) {
                    e6 = (V7.E) cVar;
                    int i9 = e6.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        e6.j = i9 - Integer.MIN_VALUE;
                    } else {
                        e6 = new V7.E(this, cVar);
                    }
                } else {
                    e6 = new V7.E(this, cVar);
                }
                java.lang.Object objInvoke = e6.f10378i;
                p109m6.a aVar = p109m6.a.f25430h;
                int i10 = e6.j;
                if (i10 == 0) {
                    com.google.common.util.concurrent.P.u0(objInvoke);
                    e6.f10377h = this;
                    e6.f10380l = obj;
                    e6.j = 1;
                    objInvoke = this.f10382i.invoke(obj, e6);
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    f9 = this;
                } else {
                    if (i10 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = e6.f10380l;
                    f9 = e6.f10377h;
                    com.google.common.util.concurrent.P.u0(objInvoke);
                }
                if (!((java.lang.Boolean) objInvoke).booleanValue()) {
                    return p070h6.A.f22523a;
                }
                f9.j.f24539h = obj;
                throw new W7.C1007a(f9);
            default:
                if (cVar instanceof V7.I) {
                    i3 = (V7.I) cVar;
                    int i11 = i3.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        i3.j = i11 - Integer.MIN_VALUE;
                    } else {
                        i3 = new V7.I(this, cVar);
                    }
                } else {
                    i3 = new V7.I(this, cVar);
                }
                java.lang.Object objInvoke2 = i3.f10390i;
                p109m6.a aVar2 = p109m6.a.f25430h;
                int i12 = i3.j;
                if (i12 == 0) {
                    com.google.common.util.concurrent.P.u0(objInvoke2);
                    i3.f10389h = this;
                    i3.f10392l = obj;
                    i3.j = 1;
                    objInvoke2 = this.f10382i.invoke(obj, i3);
                    if (objInvoke2 == aVar2) {
                        return aVar2;
                    }
                    f10 = this;
                } else {
                    if (i12 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = i3.f10392l;
                    f10 = i3.f10389h;
                    com.google.common.util.concurrent.P.u0(objInvoke2);
                }
                if (!((java.lang.Boolean) objInvoke2).booleanValue()) {
                    return p070h6.A.f22523a;
                }
                f10.j.f24539h = obj;
                throw new W7.C1007a(f10);
        }
    }
}
