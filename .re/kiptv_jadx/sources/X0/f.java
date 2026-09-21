package X0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements android.view.ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y0.p f10801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p113n1.l f10802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A.a f10803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.platform.AndroidComposeView f10804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X7.c f10805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X0.i f10806f;

    public f(Y0.p pVar, p113n1.l lVar, X7.c cVar, A.a aVar, androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        this.f10801a = pVar;
        this.f10802b = lVar;
        this.f10803c = aVar;
        this.f10804d = androidComposeView;
        this.f10805e = new X7.c(cVar.f10906h.plus(X0.g.f10807h));
        this.f10806f = new X0.i(lVar.f25564d - lVar.f25562b, new X0.e(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (r10 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(X0.f fVar, android.view.ScrollCaptureSession scrollCaptureSession, p113n1.l lVar, p117n6.c cVar) {
        X0.c cVar2;
        int i3;
        int i9;
        android.view.ScrollCaptureSession scrollCaptureSessionK;
        p113n1.l lVar2;
        int i10;
        int i11;
        X0.d dVar;
        p113n1.l lVar3;
        android.view.ScrollCaptureSession scrollCaptureSessionK2;
        int iS;
        int iS2;
        int i12;
        android.graphics.Canvas canvasLockHardwareCanvas;
        if (cVar instanceof X0.c) {
            cVar2 = (X0.c) cVar;
            int i13 = cVar2.f10795n;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar2.f10795n = i13 - Integer.MIN_VALUE;
            } else {
                cVar2 = new X0.c(fVar, cVar);
            }
        } else {
            cVar2 = new X0.c(fVar, cVar);
        }
        java.lang.Object obj = cVar2.f10793l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i14 = cVar2.f10795n;
        if (i14 != 0) {
            if (i14 == 1) {
                int i15 = cVar2.f10792k;
                int i16 = cVar2.j;
                p113n1.l lVar4 = cVar2.f10791i;
                android.view.ScrollCaptureSession scrollCaptureSessionK3 = D1.AbstractC0215c.k(cVar2.f10790h);
                com.google.common.util.concurrent.P.u0(obj);
                i9 = i15;
                i3 = i16;
                lVar = lVar4;
                scrollCaptureSession = scrollCaptureSessionK3;
            } else {
                if (i14 == 2) {
                    i11 = cVar2.f10792k;
                    i10 = cVar2.j;
                    lVar2 = cVar2.f10791i;
                    scrollCaptureSessionK = D1.AbstractC0215c.k(cVar2.f10790h);
                    com.google.common.util.concurrent.P.u0(obj);
                    dVar = X0.d.f10796i;
                    cVar2.f10790h = scrollCaptureSessionK;
                    cVar2.f10791i = lVar2;
                    cVar2.j = i10;
                    cVar2.f10792k = i11;
                    cVar2.f10795n = 3;
                    if (p020c0.AbstractC1703s.v(cVar2.getContext()).a(dVar, cVar2) != aVar) {
                        lVar3 = lVar2;
                        scrollCaptureSessionK2 = scrollCaptureSessionK;
                    }
                    return aVar;
                }
                if (i14 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = cVar2.f10792k;
                i10 = cVar2.j;
                lVar3 = cVar2.f10791i;
                scrollCaptureSessionK2 = D1.AbstractC0215c.k(cVar2.f10790h);
                com.google.common.util.concurrent.P.u0(obj);
            }
            X0.i iVar = fVar.f10806f;
            iS = O7.r.s(i10 - O7.r.Q(iVar.f10811b), 0, iVar.f10810a);
            X0.i iVar2 = fVar.f10806f;
            iS2 = O7.r.s(i11 - O7.r.Q(iVar2.f10811b), 0, iVar2.f10810a);
            i12 = lVar3.f25561a;
            if (iS == iS2) {
                return p113n1.l.f25560e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionK2.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-i12, -iS);
                p113n1.l lVar5 = fVar.f10802b;
                canvasLockHardwareCanvas.translate(-lVar5.f25561a, -lVar5.f25562b);
                fVar.f10804d.getRootView().draw(canvasLockHardwareCanvas);
                int iQ = O7.r.Q(fVar.f10806f.f10811b);
                return new p113n1.l(i12, iS + iQ, lVar3.f25563c, iS2 + iQ);
            } finally {
                scrollCaptureSessionK2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
            }
        }
        com.google.common.util.concurrent.P.u0(obj);
        i3 = lVar.f25562b;
        X0.i iVar3 = fVar.f10806f;
        cVar2.f10790h = scrollCaptureSession;
        cVar2.f10791i = lVar;
        cVar2.j = i3;
        i9 = lVar.f25564d;
        cVar2.f10792k = i9;
        cVar2.f10795n = 1;
        if (i3 > i9) {
            iVar3.getClass();
            throw new java.lang.IllegalArgumentException(("Expected min=" + i3 + " ≤ max=" + i9).toString());
        }
        int i17 = i9 - i3;
        int i18 = iVar3.f10810a;
        if (i17 > i18) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(i17, i18, "Expected range (", ") to be ≤ viewportSize=").toString());
        }
        float f9 = i3;
        float f10 = iVar3.f10811b;
        java.lang.Object obj2 = p070h6.A.f22523a;
        if (f9 < f10 || i9 > i18 + f10) {
            java.lang.Object objB = iVar3.b((((i17 / 2) + i3) - (i18 / 2)) - f10, cVar2);
            if (objB != aVar) {
                objB = obj2;
            }
            if (objB == aVar) {
                obj2 = objB;
            }
        }
        scrollCaptureSessionK = scrollCaptureSession;
        lVar2 = lVar;
        i10 = i3;
        i11 = i9;
        dVar = X0.d.f10796i;
        cVar2.f10790h = scrollCaptureSessionK;
        cVar2.f10791i = lVar2;
        cVar2.j = i10;
        cVar2.f10792k = i11;
        cVar2.f10795n = 3;
        if (p020c0.AbstractC1703s.v(cVar2.getContext()).a(dVar, cVar2) != aVar) {
            lVar3 = lVar2;
            scrollCaptureSessionK2 = scrollCaptureSessionK;
            X0.i iVar4 = fVar.f10806f;
            iS = O7.r.s(i10 - O7.r.Q(iVar4.f10811b), 0, iVar4.f10810a);
            X0.i iVar5 = fVar.f10806f;
            iS2 = O7.r.s(i11 - O7.r.Q(iVar5.f10811b), 0, iVar5.f10810a);
            i12 = lVar3.f25561a;
            if (iS == iS2) {
                return p113n1.l.f25560e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionK2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i12, -iS);
            p113n1.l lVar6 = fVar.f10802b;
            canvasLockHardwareCanvas.translate(-lVar6.f25561a, -lVar6.f25562b);
            fVar.f10804d.getRootView().draw(canvasLockHardwareCanvas);
            int iQ2 = O7.r.Q(fVar.f10806f.f10811b);
            return new p113n1.l(i12, iS + iQ2, lVar3.f25563c, iS2 + iQ2);
        }
        return aVar;
    }

    public final void onScrollCaptureEnd(java.lang.Runnable runnable) {
        S7.C.A(this.f10805e, S7.s0.f9618h, new X0.a(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(android.view.ScrollCaptureSession scrollCaptureSession, android.os.CancellationSignal cancellationSignal, android.graphics.Rect rect, java.util.function.Consumer consumer) {
        S7.w0 w0VarA = S7.C.A(this.f10805e, null, new X0.b(this, scrollCaptureSession, rect, consumer, null), 3);
        w0VarA.j(new A0.b(14, cancellationSignal));
        cancellationSignal.setOnCancelListener(new S.n(1, w0VarA));
    }

    public final void onScrollCaptureSearch(android.os.CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        consumer.accept(p188x0.z.F(this.f10802b));
    }

    public final void onScrollCaptureStart(android.view.ScrollCaptureSession scrollCaptureSession, android.os.CancellationSignal cancellationSignal, java.lang.Runnable runnable) {
        this.f10806f.f10811b = 0.0f;
        A.a aVar = this.f10803c;
        ((p020c0.C1681g0) aVar.f9i).setValue(java.lang.Boolean.TRUE);
        runnable.run();
    }
}
