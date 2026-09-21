package V4;

/* JADX INFO: renamed from: V4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0963f implements V7.InterfaceC0981g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f10304i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ C0963f(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f10303h = i3;
        this.f10304i = obj;
        this.j = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // V7.InterfaceC0981g
    public final java.lang.Object collect(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar) throws java.lang.Throwable {
        V7.C0995v c0995v;
        java.lang.Throwable th;
        W7.y yVar;
        V4.C0963f c0963f;
        V7.InterfaceC0982h interfaceC0982h2;
        V7.C0996w c0996w;
        V4.C0963f c0963f2;
        V7.B b9;
        U.O o8;
        switch (this.f10303h) {
            case 0:
                java.lang.Object objCollect = ((V7.InterfaceC0981g) this.f10304i).collect(new U.O(interfaceC0982h, (V4.C0967j) this.j, 1), cVar);
                return objCollect == p109m6.a.f25430h ? objCollect : p070h6.A.f22523a;
            case 1:
                java.lang.Object objCollect2 = ((V7.InterfaceC0981g) this.f10304i).collect(new U.O(interfaceC0982h, (V4.C0974q) this.j, 2), cVar);
                return objCollect2 == p109m6.a.f25430h ? objCollect2 : p070h6.A.f22523a;
            case 2:
                java.lang.Object objCollect3 = ((V7.InterfaceC0981g) this.f10304i).collect(new U.O(interfaceC0982h, (V4.P) this.j, 3), cVar);
                return objCollect3 == p109m6.a.f25430h ? objCollect3 : p070h6.A.f22523a;
            case 3:
                if (cVar instanceof V7.C0995v) {
                    c0995v = (V7.C0995v) cVar;
                    int i3 = c0995v.f10520i;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c0995v.f10520i = i3 - Integer.MIN_VALUE;
                    } else {
                        c0995v = new V7.C0995v(this, cVar);
                    }
                } else {
                    c0995v = new V7.C0995v(this, cVar);
                }
                java.lang.Object obj = c0995v.f10519h;
                p109m6.a aVar = p109m6.a.f25430h;
                int i9 = c0995v.f10520i;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.common.util.concurrent.P.u0(obj);
                        return p070h6.A.f22523a;
                    }
                    yVar = c0995v.f10523m;
                    interfaceC0982h2 = c0995v.f10522l;
                    c0963f = c0995v.f10521k;
                    try {
                        com.google.common.util.concurrent.P.u0(obj);
                        yVar.releaseIntercepted();
                        V7.n0 n0Var = (V7.n0) c0963f.j;
                        c0995v.f10521k = null;
                        c0995v.f10522l = null;
                        c0995v.f10523m = null;
                        c0995v.f10520i = 2;
                        n0Var.collect(interfaceC0982h2, c0995v);
                        return aVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        yVar.releaseIntercepted();
                        throw th;
                    }
                }
                com.google.common.util.concurrent.P.u0(obj);
                W7.y yVar2 = new W7.y(interfaceC0982h, c0995v.getContext());
                try {
                    O1.C0750n c0750n = (O1.C0750n) this.f10304i;
                    c0995v.f10521k = this;
                    c0995v.f10522l = interfaceC0982h;
                    c0995v.f10523m = yVar2;
                    c0995v.f10520i = 1;
                    if (c0750n.invoke(yVar2, c0995v) == aVar) {
                        return aVar;
                    }
                    c0963f = this;
                    interfaceC0982h2 = interfaceC0982h;
                    yVar = yVar2;
                    yVar.releaseIntercepted();
                    V7.n0 n0Var2 = (V7.n0) c0963f.j;
                    c0995v.f10521k = null;
                    c0995v.f10522l = null;
                    c0995v.f10523m = null;
                    c0995v.f10520i = 2;
                    n0Var2.collect(interfaceC0982h2, c0995v);
                    return aVar;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    yVar = yVar2;
                    yVar.releaseIntercepted();
                    throw th;
                }
            case 4:
                if (cVar instanceof V7.C0996w) {
                    c0996w = (V7.C0996w) cVar;
                    int i10 = c0996w.f10525i;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0996w.f10525i = i10 - Integer.MIN_VALUE;
                    } else {
                        c0996w = new V7.C0996w(this, cVar);
                    }
                } else {
                    c0996w = new V7.C0996w(this, cVar);
                }
                java.lang.Object objG = c0996w.f10524h;
                java.lang.Object obj2 = p109m6.a.f25430h;
                int i11 = c0996w.f10525i;
                if (i11 != 0) {
                    if (i11 == 1) {
                        interfaceC0982h = c0996w.f10527l;
                        c0963f2 = c0996w.f10526k;
                        com.google.common.util.concurrent.P.u0(objG);
                    } else {
                        if (i11 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.common.util.concurrent.P.u0(objG);
                    }
                    return p070h6.A.f22523a;
                }
                com.google.common.util.concurrent.P.u0(objG);
                c0996w.f10526k = this;
                c0996w.f10527l = interfaceC0982h;
                c0996w.f10525i = 1;
                objG = V7.r.g((O1.C0754s) this.f10304i, interfaceC0982h, c0996w);
                if (objG == obj2) {
                    return obj2;
                }
                c0963f2 = this;
                java.lang.Throwable th4 = (java.lang.Throwable) objG;
                if (th4 != null) {
                    p194x6.n nVar = (p194x6.n) c0963f2.j;
                    c0996w.f10526k = null;
                    c0996w.f10527l = null;
                    c0996w.f10525i = 2;
                    if (nVar.invoke(interfaceC0982h, th4, c0996w) == obj2) {
                        return obj2;
                    }
                }
                return p070h6.A.f22523a;
            default:
                if (cVar instanceof V7.B) {
                    b9 = (V7.B) cVar;
                    int i12 = b9.f10370i;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        b9.f10370i = i12 - Integer.MIN_VALUE;
                    } else {
                        b9 = new V7.B(this, cVar);
                    }
                } else {
                    b9 = new V7.B(this, cVar);
                }
                java.lang.Object obj3 = b9.f10369h;
                p109m6.a aVar2 = p109m6.a.f25430h;
                int i13 = b9.f10370i;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o8 = b9.f10371k;
                    try {
                        com.google.common.util.concurrent.P.u0(obj3);
                    } catch (W7.C1007a e6) {
                        e = e6;
                        if (e.f10726h == o8) {
                            throw e;
                        }
                        S7.C.p(b9.getContext());
                    }
                    break;
                } else {
                    com.google.common.util.concurrent.P.u0(obj3);
                    V4.C0963f c0963f3 = (V4.C0963f) this.f10304i;
                    U.O o9 = new U.O((O1.C0751o) this.j, interfaceC0982h, 5);
                    try {
                        b9.f10371k = o9;
                        b9.f10370i = 1;
                        if (c0963f3.collect(o9, b9) == aVar2) {
                            return aVar2;
                        }
                    } catch (W7.C1007a e9) {
                        e = e9;
                        o8 = o9;
                        if (e.f10726h == o8) {
                            throw e;
                        }
                        S7.C.p(b9.getContext());
                    }
                }
                return p070h6.A.f22523a;
        }
    }
}
