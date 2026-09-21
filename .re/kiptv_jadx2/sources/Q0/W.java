package Q0;

import O0.C0723l;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.media3.common.util.Log;
import java.util.List;

public final class W extends O0.g0 implements O0.Q, InterfaceC0762a, Y {

    public boolean f8349A;

    public boolean f8350B;

    public boolean f8351C;

    public boolean f8352D;
    public boolean H;

    public float f8359L;

    public boolean f8360M;

    public p194x6.j f8361N;

    public float f8363P;

    public boolean f8365R;

    public final J f8366m;

    public boolean f8367n;

    public boolean f8370q;

    public boolean f8371r;

    public boolean f8373t;

    public p194x6.j f8375v;

    public float f8376w;
    public Object y;

    public boolean f8378z;

    public int f8368o = Log.LOG_LEVEL_OFF;

    public int f8369p = Log.LOG_LEVEL_OFF;

    public D f8372s = D.j;

    public long f8374u = 0;

    public boolean f8377x = true;

    public final G f8353E = new G(this, 0);

    public final p038e0.e f8354F = new p038e0.e(new W[16]);

    public boolean f8355G = true;

    public long f8356I = p113n1.b.b(0, 0, 15);

    public final V f8357J = new V(this, 1);

    public final V f8358K = new V(this, 0);

    public long f8362O = 0;

    public final V f8364Q = new V(this, 2);

    public W(J j) {
        this.f8366m = j;
    }

    public final boolean B0(long j) {
        J j9 = this.f8366m;
        F f9 = j9.f8269a;
        F f10 = j9.f8269a;
        try {
            if (f9.f8240Y) {
                N0.a.a("measure is called on a deactivated node");
            }
            o0 o0VarA = I.a(f10);
            F fX = f10.x();
            boolean z6 = true;
            f10.f8231M = f10.f8231M || (fX != null && fX.f8231M);
            if (!f10.s() && p113n1.a.b(this.f7641k, j)) {
                ((AndroidComposeView) o0VarA).k(f10, false);
                f10.c0();
                return false;
            }
            this.f8353E.f8263f = false;
            p038e0.e eVarC = f10.C();
            Object[] objArr = eVarC.f21324h;
            int i3 = eVarC.j;
            for (int i9 = 0; i9 < i3; i9++) {
                ((F) objArr[i9]).f8233O.f8282p.f8353E.f8260c = false;
            }
            this.f8370q = true;
            long j10 = j9.a().j;
            j0(j);
            B b9 = j9.f8272d;
            B b10 = B.f8205l;
            if (b9 != b10) {
                N0.a.b("layout state is not idle before measure starts");
            }
            this.f8356I = j;
            B b11 = B.f8202h;
            j9.f8272d = b11;
            this.f8350B = false;
            q0 snapshotObserver = I.a(f10).getSnapshotObserver();
            snapshotObserver.f8460a.d(f10, snapshotObserver.f8462c, this.f8357J);
            if (j9.f8272d == b11) {
                this.f8351C = true;
                this.f8352D = true;
                j9.f8272d = b10;
            }
            if (p113n1.m.a(j9.a().j, j10) && j9.a().f7639h == this.f7639h && j9.a().f7640i == this.f7640i) {
                z6 = false;
            }
            i0((((long) j9.a().f7640i) & 4294967295L) | (((long) j9.a().f7639h) << 32));
            return z6;
        } catch (Throwable th) {
            f9.d0(th);
            throw null;
        }
    }

    @Override
    public final O0.g0 C(long j) {
        D d4;
        J j9 = this.f8366m;
        F f9 = j9.f8269a;
        D d6 = f9.f8229K;
        D d9 = D.j;
        if (d6 == d9) {
            f9.e();
        }
        if (AbstractC0777k.o(j9.f8269a)) {
            S s9 = j9.f8283q;
            kotlin.jvm.internal.m.b(s9);
            s9.f8327q = d9;
            s9.C(j);
        }
        F f10 = j9.f8269a;
        F fX = f10.x();
        if (fX != null) {
            if (this.f8372s != d9 && !f10.f8231M) {
                N0.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            J j10 = fX.f8233O;
            int iOrdinal = j10.f8272d.ordinal();
            if (iOrdinal == 0) {
                d4 = D.f8211h;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + j10.f8272d);
                }
                d4 = D.f8212i;
            }
            this.f8372s = d4;
        } else {
            this.f8372s = d9;
        }
        B0(j);
        return this;
    }

    @Override
    public final Object E() {
        return this.y;
    }

    @Override
    public final void I(boolean z6) {
        J j = this.f8366m;
        if (z6 != j.a().f8299p) {
            j.a().f8299p = z6;
            this.f8365R = true;
        }
    }

    @Override
    public final void L() {
        this.H = true;
        G g = this.f8353E;
        g.h();
        boolean z6 = this.f8351C;
        J j = this.f8366m;
        if (z6) {
            p038e0.e eVarC = j.f8269a.C();
            Object[] objArr = eVarC.f21324h;
            int i3 = eVarC.j;
            for (int i9 = 0; i9 < i3; i9++) {
                F f9 = (F) objArr[i9];
                if (f9.s() && f9.t() == D.f8211h && F.T(f9)) {
                    F.a0(j.f8269a, false, 7);
                }
            }
        }
        if (this.f8352D || (!this.f8373t && !g().f8301r && this.f8351C)) {
            this.f8351C = false;
            B b9 = j.f8272d;
            j.f8272d = B.j;
            j.g(false);
            F f10 = j.f8269a;
            q0 snapshotObserver = I.a(f10).getSnapshotObserver();
            snapshotObserver.f8460a.d(f10, snapshotObserver.f8464e, this.f8358K);
            j.f8272d = b9;
            this.f8352D = false;
        }
        if (g.f8261d) {
            g.f8262e = true;
        }
        if (g.f8259b && g.e()) {
            g.g();
        }
        this.H = false;
    }

    @Override
    public final void X() {
        F.a0(this.f8366m.f8269a, false, 7);
    }

    @Override
    public final int Z(int i3) {
        J j = this.f8366m;
        if (!AbstractC0777k.o(j.f8269a)) {
            x0();
            return j.a().Z(i3);
        }
        S s9 = j.f8283q;
        kotlin.jvm.internal.m.b(s9);
        return s9.Z(i3);
    }

    @Override
    public final int a(int i3) {
        J j = this.f8366m;
        if (!AbstractC0777k.o(j.f8269a)) {
            x0();
            return j.a().a(i3);
        }
        S s9 = j.f8283q;
        kotlin.jvm.internal.m.b(s9);
        return s9.a(i3);
    }

    @Override
    public final void b(A0.b bVar) {
        p038e0.e eVarC = this.f8366m.f8269a.C();
        Object[] objArr = eVarC.f21324h;
        int i3 = eVarC.j;
        for (int i9 = 0; i9 < i3; i9++) {
            bVar.invoke(((F) objArr[i9]).f8233O.f8282p);
        }
    }

    @Override
    public final int b0(C0723l c0723l) {
        J j = this.f8366m;
        F fX = j.f8269a.x();
        B b9 = fX != null ? fX.f8233O.f8272d : null;
        B b10 = B.f8202h;
        G g = this.f8353E;
        if (b9 == b10) {
            g.f8260c = true;
        } else {
            F fX2 = j.f8269a.x();
            if ((fX2 != null ? fX2.f8233O.f8272d : null) == B.j) {
                g.f8261d = true;
            }
        }
        this.f8373t = true;
        int iB0 = j.a().b0(c0723l);
        this.f8373t = false;
        return iB0;
    }

    @Override
    public final G c() {
        return this.f8353E;
    }

    @Override
    public final int e0() {
        return this.f8366m.a().e0();
    }

    @Override
    public final int f0() {
        return this.f8366m.a().f0();
    }

    @Override
    public final androidx.compose.ui.node.a g() {
        return this.f8366m.f8269a.f8232N.f8388c;
    }

    @Override
    public final InterfaceC0762a h() {
        J j;
        F fX = this.f8366m.f8269a.x();
        if (fX == null || (j = fX.f8233O) == null) {
            return null;
        }
        return j.f8282p;
    }

    @Override
    public final void h0(long j, float f9, p194x6.j jVar) {
        O0.f0 placementScope;
        J j9 = this.f8366m;
        F f10 = j9.f8269a;
        try {
            this.f8349A = true;
            if (!p113n1.k.a(j, this.f8374u) || this.f8365R) {
                if (j9.f8277k || j9.j || this.f8365R) {
                    this.f8351C = true;
                    this.f8365R = false;
                }
                v0();
            }
            S s9 = j9.f8283q;
            if (s9 != null && s9.f8334x == P.j) {
                J j10 = s9.f8323m;
                if (!AbstractC0777k.o(j10.f8269a)) {
                    j10.f8271c = true;
                }
            }
            S s10 = j9.f8283q;
            if (s10 != null && s10.n0()) {
                NodeCoordinator nodeCoordinator = j9.a().f15863x;
                F f11 = j9.f8269a;
                if (nodeCoordinator == null || (placementScope = nodeCoordinator.f8302s) == null) {
                    placementScope = I.a(f11).getPlacementScope();
                }
                S s11 = j9.f8283q;
                kotlin.jvm.internal.m.b(s11);
                F fX = f11.x();
                if (fX != null) {
                    fX.f8233O.f8275h = 0;
                }
                s11.f8326p = Log.LOG_LEVEL_OFF;
                placementScope.g(s11, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            S s12 = j9.f8283q;
            if (s12 != null && !s12.f8329s) {
                N0.a.b("Error: Placement happened before lookahead.");
            }
            z0(j, f9, jVar);
        } catch (Throwable th) {
            f10.d0(th);
            throw null;
        }
    }

    @Override
    public final int n(int i3) {
        J j = this.f8366m;
        if (!AbstractC0777k.o(j.f8269a)) {
            x0();
            return j.a().n(i3);
        }
        S s9 = j.f8283q;
        kotlin.jvm.internal.m.b(s9);
        return s9.n(i3);
    }

    public final List n0() {
        J j = this.f8366m;
        j.f8269a.k0();
        boolean z6 = this.f8355G;
        p038e0.e eVar = this.f8354F;
        if (!z6) {
            return eVar.h();
        }
        F f9 = j.f8269a;
        p038e0.e eVarC = f9.C();
        Object[] objArr = eVarC.f21324h;
        int i3 = eVarC.j;
        for (int i9 = 0; i9 < i3; i9++) {
            F f10 = (F) objArr[i9];
            if (eVar.j <= i9) {
                eVar.c(f10.f8233O.f8282p);
            } else {
                W w6 = f10.f8233O.f8282p;
                Object[] objArr2 = eVar.f21324h;
                Object obj = objArr2[i9];
                objArr2[i9] = w6;
            }
        }
        eVar.n(((p038e0.e) ((p038e0.b) f9.n()).f21318i).j, eVar.j);
        this.f8355G = false;
        return eVar.h();
    }

    @Override
    public final int p() {
        return this.f8369p;
    }

    public final void r0() {
        boolean z6 = this.f8378z;
        this.f8378z = true;
        J j = this.f8366m;
        F f9 = j.f8269a;
        if (!z6) {
            f9.f8232N.f8388c.f1();
            I.a(f9).getRectManager().e(j.f8269a, true);
            if (f9.s()) {
                F.a0(f9, true, 6);
            } else if (f9.f8233O.f8273e) {
                F.Y(f9, true, 6);
            }
        }
        C0765b0 c0765b0 = f9.f8232N;
        NodeCoordinator nodeCoordinator = c0765b0.f8388c.f15862w;
        for (NodeCoordinator nodeCoordinator2 = c0765b0.f8389d; !kotlin.jvm.internal.m.a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f15862w) {
            if (nodeCoordinator2.f15859R) {
                nodeCoordinator2.b1();
            }
        }
        p038e0.e eVarC = f9.C();
        Object[] objArr = eVarC.f21324h;
        int i3 = eVarC.j;
        for (int i9 = 0; i9 < i3; i9++) {
            F f10 = (F) objArr[i9];
            if (f10.y() != Integer.MAX_VALUE) {
                f10.f8233O.f8282p.r0();
                F.b0(f10);
            }
        }
    }

    @Override
    public final void requestLayout() {
        this.f8366m.f8269a.Z(false);
    }

    public final void t0() {
        if (this.f8378z) {
            this.f8378z = false;
            J j = this.f8366m;
            Z0.b rectManager = I.a(j.f8269a).getRectManager();
            F f9 = j.f8269a;
            rectManager.g(f9);
            C0765b0 c0765b0 = f9.f8232N;
            NodeCoordinator nodeCoordinator = c0765b0.f8388c.f15862w;
            for (NodeCoordinator nodeCoordinator2 = c0765b0.f8389d; !kotlin.jvm.internal.m.a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f15862w) {
                nodeCoordinator2.h1();
                nodeCoordinator2.m1();
            }
            p038e0.e eVarC = f9.C();
            Object[] objArr = eVarC.f21324h;
            int i3 = eVarC.j;
            for (int i9 = 0; i9 < i3; i9++) {
                ((F) objArr[i9]).f8233O.f8282p.t0();
            }
        }
    }

    public final void v0() {
        J j = this.f8366m;
        if (j.f8278l > 0) {
            p038e0.e eVarC = j.f8269a.C();
            Object[] objArr = eVarC.f21324h;
            int i3 = eVarC.j;
            for (int i9 = 0; i9 < i3; i9++) {
                F f9 = (F) objArr[i9];
                J j9 = f9.f8233O;
                boolean z6 = j9.j;
                W w6 = j9.f8282p;
                if ((z6 || j9.f8277k) && !w6.f8351C) {
                    f9.Z(false);
                }
                w6.v0();
            }
        }
    }

    public final void x0() {
        D d4;
        J j = this.f8366m;
        F.a0(j.f8269a, false, 7);
        F f9 = j.f8269a;
        F fX = f9.x();
        if (fX == null || f9.f8229K != D.j) {
            return;
        }
        int iOrdinal = fX.f8233O.f8272d.ordinal();
        if (iOrdinal != 0) {
            d4 = iOrdinal != 2 ? fX.f8229K : D.f8212i;
        } else {
            d4 = D.f8211h;
        }
        f9.f8229K = d4;
    }

    public final void y0() {
        this.f8360M = true;
        J j = this.f8366m;
        F fX = j.f8269a.x();
        float f9 = g().H;
        F f10 = j.f8269a;
        C0765b0 c0765b0 = f10.f8232N;
        NodeCoordinator nodeCoordinator = c0765b0.f8389d;
        while (nodeCoordinator != c0765b0.f8388c) {
            kotlin.jvm.internal.m.c(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            androidx.compose.ui.node.b bVar = (androidx.compose.ui.node.b) nodeCoordinator;
            f9 += bVar.H;
            nodeCoordinator = bVar.f15862w;
        }
        if (f9 != this.f8359L) {
            this.f8359L = f9;
            if (fX != null) {
                fX.R();
            }
            if (fX != null) {
                fX.F();
            }
        }
        if (!g().f8301r) {
            boolean z6 = this.f8378z;
            if (!z6 || this.f8353E.d()) {
                r0();
            }
            if (z6) {
                f10.f8232N.f8388c.f1();
            } else {
                if (fX != null) {
                    fX.F();
                }
                if (this.f8367n && fX != null) {
                    fX.Z(false);
                }
            }
        }
        if (fX == null) {
            this.f8369p = 0;
        } else if (!this.f8367n) {
            J j9 = fX.f8233O;
            if (j9.f8272d == B.j) {
                if (this.f8369p != Integer.MAX_VALUE) {
                    N0.a.b("Place was called on a node which was placed already");
                }
                int i3 = j9.f8276i;
                this.f8369p = i3;
                j9.f8276i = i3 + 1;
            }
        }
        L();
    }

    @Override
    public final int z(int i3) {
        J j = this.f8366m;
        if (!AbstractC0777k.o(j.f8269a)) {
            x0();
            return j.a().z(i3);
        }
        S s9 = j.f8283q;
        kotlin.jvm.internal.m.b(s9);
        return s9.z(i3);
    }

    public final void z0(long j, float f9, p194x6.j jVar) {
        J j9 = this.f8366m;
        if (j9.f8269a.f8240Y) {
            N0.a.a("place is called on a deactivated node");
        }
        j9.f8272d = B.j;
        this.f8374u = j;
        this.f8376w = f9;
        this.f8375v = jVar;
        this.f8360M = false;
        F f10 = j9.f8269a;
        o0 o0VarA = I.a(f10);
        if (this.f8351C || !this.f8378z) {
            this.f8353E.g = false;
            j9.f(false);
            this.f8361N = jVar;
            this.f8362O = j;
            this.f8363P = f9;
            q0 snapshotObserver = o0VarA.getSnapshotObserver();
            snapshotObserver.f8460a.d(f10, snapshotObserver.f8465f, this.f8364Q);
        } else {
            NodeCoordinator nodeCoordinatorA = j9.a();
            nodeCoordinatorA.k1(p113n1.k.c(j, nodeCoordinatorA.f7642l), f9, jVar);
            y0();
        }
        j9.f8272d = B.f8205l;
        if (j9.a().f8301r && (j9.f8277k || j9.j)) {
            requestLayout();
        }
        this.f8371r = true;
    }
}
