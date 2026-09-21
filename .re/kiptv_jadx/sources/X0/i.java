package X0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f10811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f10812c;

    public i(int i3, X0.e eVar) {
        this.f10810a = i3;
        this.f10812c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float a(int i3, boolean z6, boolean z9, boolean z10) {
        boolean z11;
        int i9 = 1;
        p021c1.i iVar = (p021c1.i) this.f10812c;
        if (z6) {
            int iD = p021c1.f.d(iVar.f18473f, i3, z6);
            int lineStart = iVar.f18473f.getLineStart(iD);
            int iF = iVar.f(iD);
            if (i3 == lineStart || i3 == iF) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        int i10 = i3 * 4;
        if (!z10) {
            i9 = z11 ? 2 : 3;
        } else if (z11) {
            i9 = 0;
        }
        int i11 = i10 + i9;
        if (this.f10810a == i11) {
            return this.f10811b;
        }
        float fH = z10 ? iVar.h(i3, z6) : iVar.i(i3, z6);
        if (z9) {
            this.f10810a = i11;
            this.f10811b = fH;
        }
        return fH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public java.lang.Object b(float f9, p117n6.c cVar) {
        X0.h hVar;
        if (cVar instanceof X0.h) {
            hVar = (X0.h) cVar;
            int i3 = hVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.j = i3 - Integer.MIN_VALUE;
            } else {
                hVar = new X0.h(this, cVar);
            }
        } else {
            hVar = new X0.h(this, cVar);
        }
        java.lang.Object objInvoke = hVar.f10808h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = hVar.j;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objInvoke);
            java.lang.Float f10 = new java.lang.Float(f9);
            hVar.j = 1;
            objInvoke = ((X0.e) this.f10812c).invoke(f10, hVar);
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objInvoke);
        }
        this.f10811b += ((java.lang.Number) objInvoke).floatValue();
        return p070h6.A.f22523a;
    }

    public i(p021c1.i iVar) {
        this.f10812c = iVar;
        this.f10810a = -1;
    }
}
