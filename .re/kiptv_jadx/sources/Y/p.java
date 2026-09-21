package Y;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p181w0.a f10996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Float f10999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p181w0.a f11000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p163t.C2748c f11001f = p163t.AbstractC2750d.a(0.0f);
    public final p163t.C2748c g = p163t.AbstractC2750d.a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p163t.C2748c f11002h = p163t.AbstractC2750d.a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final S7.C0901q f11003i;
    public final p020c0.C1681g0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p020c0.C1681g0 f11004k;

    public p(p181w0.a aVar, float f9, boolean z6) {
        this.f10996a = aVar;
        this.f10997b = f9;
        this.f10998c = z6;
        S7.C0901q c0901q = new S7.C0901q(true);
        c0901q.G(null);
        this.f11003i = c0901q;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.j = p020c0.AbstractC1703s.y(bool);
        this.f11004k = p020c0.AbstractC1703s.y(bool);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(p117n6.c cVar) {
        Y.i iVar;
        Y.p pVar;
        java.lang.Object objM;
        if (cVar instanceof Y.i) {
            iVar = (Y.i) cVar;
            int i3 = iVar.f10983k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.f10983k = i3 - Integer.MIN_VALUE;
            } else {
                iVar = new Y.i(this, cVar);
            }
        } else {
            iVar = new Y.i(this, cVar);
        }
        java.lang.Object obj = iVar.f10982i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = iVar.f10983k;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            iVar.f10981h = this;
            iVar.f10983k = 1;
            java.lang.Object objM2 = S7.C.m(new Y.m(this, null), iVar);
            if (objM2 != aVar) {
                objM2 = a2;
            }
            if (objM2 != aVar) {
                pVar = this;
            }
            return aVar;
        }
        if (i9 == 1) {
            pVar = iVar.f10981h;
            com.google.common.util.concurrent.P.u0(obj);
        } else {
            if (i9 != 2) {
                if (i9 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                return a2;
            }
            pVar = iVar.f10981h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        iVar.f10981h = null;
        iVar.f10983k = 3;
        pVar.getClass();
        objM = S7.C.m(new Y.o(pVar, null), iVar);
        if (objM != aVar) {
            objM = a2;
        }
        if (objM != aVar) {
            return aVar;
        }
        return a2;
        pVar.j.setValue(java.lang.Boolean.TRUE);
        iVar.f10981h = pVar;
        iVar.f10983k = 2;
        if (pVar.f11003i.k(iVar) != aVar) {
            iVar.f10981h = null;
            iVar.f10983k = 3;
            pVar.getClass();
            objM = S7.C.m(new Y.o(pVar, null), iVar);
            if (objM != aVar) {
                objM = a2;
            }
            if (objM != aVar) {
                return a2;
            }
        }
        return aVar;
    }
}
