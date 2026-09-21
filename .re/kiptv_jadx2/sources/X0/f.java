package X0;

import D1.AbstractC0215c;
import O7.r;
import S.n;
import S7.C;
import S7.s0;
import S7.w0;
import Y0.p;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.P;
import java.util.function.Consumer;
import p020c0.AbstractC1703s;
import p020c0.C1681g0;
import p070h6.A;
import p113n1.l;
import p188x0.z;

public final class f implements ScrollCaptureCallback {

    public final p f10801a;

    public final l f10802b;

    public final A.a f10803c;

    public final AndroidComposeView f10804d;

    public final X7.c f10805e;

    public final i f10806f;

    public f(p pVar, l lVar, X7.c cVar, A.a aVar, AndroidComposeView androidComposeView) {
        this.f10801a = pVar;
        this.f10802b = lVar;
        this.f10803c = aVar;
        this.f10804d = androidComposeView;
        this.f10805e = new X7.c(cVar.f10906h.plus(g.f10807h));
        this.f10806f = new i(lVar.f25564d - lVar.f25562b, new e(this, null));
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, ScrollCaptureSession scrollCaptureSession, l lVar, p117n6.c cVar) {
        c cVar2;
        int i3;
        int i9;
        ScrollCaptureSession scrollCaptureSessionK;
        l lVar2;
        int i10;
        int i11;
        d dVar;
        l lVar3;
        ScrollCaptureSession scrollCaptureSessionK2;
        int iS;
        int iS2;
        int i12;
        Canvas canvasLockHardwareCanvas;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i13 = cVar2.f10795n;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar2.f10795n = i13 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(fVar, cVar);
            }
        } else {
            cVar2 = new c(fVar, cVar);
        }
        Object obj = cVar2.f10793l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i14 = cVar2.f10795n;
        if (i14 != 0) {
            if (i14 == 1) {
                int i15 = cVar2.f10792k;
                int i16 = cVar2.j;
                l lVar4 = cVar2.f10791i;
                ScrollCaptureSession scrollCaptureSessionK3 = AbstractC0215c.k(cVar2.f10790h);
                P.u0(obj);
                i9 = i15;
                i3 = i16;
                lVar = lVar4;
                scrollCaptureSession = scrollCaptureSessionK3;
            } else {
                if (i14 == 2) {
                    i11 = cVar2.f10792k;
                    i10 = cVar2.j;
                    lVar2 = cVar2.f10791i;
                    scrollCaptureSessionK = AbstractC0215c.k(cVar2.f10790h);
                    P.u0(obj);
                    dVar = d.f10796i;
                    cVar2.f10790h = scrollCaptureSessionK;
                    cVar2.f10791i = lVar2;
                    cVar2.j = i10;
                    cVar2.f10792k = i11;
                    cVar2.f10795n = 3;
                    if (AbstractC1703s.v(cVar2.getContext()).a(dVar, cVar2) != aVar) {
                        lVar3 = lVar2;
                        scrollCaptureSessionK2 = scrollCaptureSessionK;
                    }
                    return aVar;
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = cVar2.f10792k;
                i10 = cVar2.j;
                lVar3 = cVar2.f10791i;
                scrollCaptureSessionK2 = AbstractC0215c.k(cVar2.f10790h);
                P.u0(obj);
            }
            i iVar = fVar.f10806f;
            iS = r.s(i10 - r.Q(iVar.f10811b), 0, iVar.f10810a);
            i iVar2 = fVar.f10806f;
            iS2 = r.s(i11 - r.Q(iVar2.f10811b), 0, iVar2.f10810a);
            i12 = lVar3.f25561a;
            if (iS == iS2) {
                return l.f25560e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionK2.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-i12, -iS);
                l lVar5 = fVar.f10802b;
                canvasLockHardwareCanvas.translate(-lVar5.f25561a, -lVar5.f25562b);
                fVar.f10804d.getRootView().draw(canvasLockHardwareCanvas);
                int iQ = r.Q(fVar.f10806f.f10811b);
                return new l(i12, iS + iQ, lVar3.f25563c, iS2 + iQ);
            } finally {
                scrollCaptureSessionK2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
            }
        }
        P.u0(obj);
        i3 = lVar.f25562b;
        i iVar3 = fVar.f10806f;
        cVar2.f10790h = scrollCaptureSession;
        cVar2.f10791i = lVar;
        cVar2.j = i3;
        i9 = lVar.f25564d;
        cVar2.f10792k = i9;
        cVar2.f10795n = 1;
        if (i3 > i9) {
            iVar3.getClass();
            throw new IllegalArgumentException(("Expected min=" + i3 + " ≤ max=" + i9).toString());
        }
        int i17 = i9 - i3;
        int i18 = iVar3.f10810a;
        if (i17 > i18) {
            throw new IllegalArgumentException(M0.k(i17, i18, "Expected range (", ") to be ≤ viewportSize=").toString());
        }
        float f9 = i3;
        float f10 = iVar3.f10811b;
        Object obj2 = A.f22523a;
        if (f9 < f10 || i9 > i18 + f10) {
            Object objB = iVar3.b((((i17 / 2) + i3) - (i18 / 2)) - f10, cVar2);
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
        dVar = d.f10796i;
        cVar2.f10790h = scrollCaptureSessionK;
        cVar2.f10791i = lVar2;
        cVar2.j = i10;
        cVar2.f10792k = i11;
        cVar2.f10795n = 3;
        if (AbstractC1703s.v(cVar2.getContext()).a(dVar, cVar2) != aVar) {
            lVar3 = lVar2;
            scrollCaptureSessionK2 = scrollCaptureSessionK;
            i iVar4 = fVar.f10806f;
            iS = r.s(i10 - r.Q(iVar4.f10811b), 0, iVar4.f10810a);
            i iVar5 = fVar.f10806f;
            iS2 = r.s(i11 - r.Q(iVar5.f10811b), 0, iVar5.f10810a);
            i12 = lVar3.f25561a;
            if (iS == iS2) {
                return l.f25560e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionK2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i12, -iS);
            l lVar6 = fVar.f10802b;
            canvasLockHardwareCanvas.translate(-lVar6.f25561a, -lVar6.f25562b);
            fVar.f10804d.getRootView().draw(canvasLockHardwareCanvas);
            int iQ2 = r.Q(fVar.f10806f.f10811b);
            return new l(i12, iS + iQ2, lVar3.f25563c, iS2 + iQ2);
        }
        return aVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        C.A(this.f10805e, s0.f9618h, new a(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        w0 w0VarA = C.A(this.f10805e, null, new b(this, scrollCaptureSession, rect, consumer, null), 3);
        w0VarA.j(new A0.b(14, cancellationSignal));
        cancellationSignal.setOnCancelListener(new n(1, w0VarA));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(z.F(this.f10802b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f10806f.f10811b = 0.0f;
        A.a aVar = this.f10803c;
        ((C1681g0) aVar.f9i).setValue(Boolean.TRUE);
        runnable.run();
    }
}
