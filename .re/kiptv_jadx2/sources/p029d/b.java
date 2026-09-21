package p029d;

import C5.F0;
import Q0.AbstractC0777k;
import Q0.B0;
import Q0.C0;
import Q0.F;
import android.graphics.Canvas;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.InterfaceC1540w;
import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p019c.u;
import p020c0.C1704s0;
import p070h6.A;
import p121o0.n;
import p138q1.y;
import p154s.C2729o;
import p154s.D;
import p154s.Q;
import p154s.b0;
import p163t.q0;
import p175v0.p;
import p188x0.AbstractC3083c;
import p188x0.InterfaceC3097q;
import p188x0.L;
import p188x0.T;
import p194x6.j;
import p203z0.d;
import t0.f;

public final class b extends o implements j {

    public final int f21079h;

    public final Object f21080i;
    public final Object j;

    public final Object f21081k;

    public b(Object obj, Object obj2, Object obj3, int i3) {
        super(1);
        this.f21079h = i3;
        this.f21080i = obj;
        this.j = obj2;
        this.f21081k = obj3;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        switch (this.f21079h) {
            case 0:
                u uVar = (u) this.f21080i;
                InterfaceC1540w interfaceC1540w = (InterfaceC1540w) this.j;
                d dVar = (d) this.f21081k;
                uVar.a(interfaceC1540w, dVar);
                return new F0(10, dVar);
            case 1:
                u uVar2 = (u) this.f21080i;
                InterfaceC1540w interfaceC1540w2 = (InterfaceC1540w) this.j;
                j jVar = (j) this.f21081k;
                uVar2.a(interfaceC1540w2, jVar);
                return new F0(11, jVar);
            case 2:
                InterfaceC3097q interfaceC3097qJ = ((d) obj).d0().j();
                y yVar = (y) this.f21080i;
                if (yVar.getView().getVisibility() != 8) {
                    yVar.f26522F = true;
                    AndroidComposeView androidComposeView = ((F) this.j).f8254v;
                    if (androidComposeView == null) {
                        androidComposeView = null;
                    }
                    if (androidComposeView != null) {
                        Canvas canvasA = AbstractC3083c.a(interfaceC3097qJ);
                        androidComposeView.getAndroidViewsHandler$ui().getClass();
                        ((y) this.f21081k).draw(canvasA);
                    }
                    yVar.f26522F = false;
                }
                return A.f22523a;
            case 3:
                return new p112n0.d((n) this.f21080i, this.j, (C2729o) this.f21081k, 2);
            case 4:
                L l2 = (L) obj;
                q0 q0Var = (q0) this.f21080i;
                l2.b(q0Var != null ? ((Number) q0Var.getValue()).floatValue() : 1.0f);
                q0 q0Var2 = (q0) this.j;
                l2.k(q0Var2 != null ? ((Number) q0Var2.getValue()).floatValue() : 1.0f);
                l2.n(q0Var2 != null ? ((Number) q0Var2.getValue()).floatValue() : 1.0f);
                q0 q0Var3 = (q0) this.f21081k;
                l2.A(q0Var3 != null ? ((T) q0Var3.getValue()).f31096a : T.f31094b);
                return A.f22523a;
            case 5:
                int iOrdinal = ((D) obj).ordinal();
                T t9 = null;
                Q q9 = (Q) this.f21081k;
                if (iOrdinal == 0) {
                    b0 b0Var = q9.f27095a;
                } else if (iOrdinal == 1) {
                    t9 = (T) this.f21080i;
                } else {
                    if (iOrdinal != 2) {
                        throw new I3.b();
                    }
                    b0 b0Var2 = q9.f27095a;
                }
                return new T(t9 != null ? t9.f31096a : T.f31094b);
            case 6:
                C0 c9 = (C0) obj;
                f fVar = (f) c9;
                f fVar2 = (f) this.j;
                fVar2.getClass();
                if (!((t0.b) AbstractC0777k.u(fVar2).getDragAndDropManager()).f27744b.contains(fVar) || !AbstractC1853k0.e(fVar, AbstractC1864o0.g0((C1704s0) this.f21081k))) {
                    return B0.f8207h;
                }
                ((kotlin.jvm.internal.A) this.f21080i).f24539h = c9;
                return B0.j;
            default:
                p175v0.F f9 = (p175v0.F) obj;
                if (m.a(f9, (p175v0.F) this.f21080i)) {
                    zBooleanValue = false;
                } else {
                    if (m.a(f9, ((p) this.j).f29082c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((o) this.f21081k).invoke(f9)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
        }
    }

    public b(p175v0.F f9, p pVar, j jVar) {
        super(1);
        this.f21079h = 7;
        this.f21080i = f9;
        this.j = pVar;
        this.f21081k = (o) jVar;
    }
}
