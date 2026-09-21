package p020c0;

import p136q.C;
import p136q.H;
import p194x6.m;

public final class C1701q0 {

    public C1715y f18348a;

    public int f18349b;

    public C1668a f18350c;

    public m f18351d;

    public int f18352e;

    public C f18353f;
    public H g;

    public C1701q0(C1715y c1715y) {
        this.f18348a = c1715y;
    }

    public static boolean a(F f9, H h9) {
        kotlin.jvm.internal.m.c(f9, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        C1676e c1676e = f9.j;
        if (c1676e == null) {
            c1676e = C1676e.f18243n;
        }
        return !c1676e.a(f9.h().f18110f, h9.g(f9));
    }

    public final boolean b() {
        if (this.f18348a != null) {
            C1668a c1668a = this.f18350c;
            if (c1668a != null ? c1668a.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final P c(Object obj) {
        P pS;
        C1715y c1715y = this.f18348a;
        return (c1715y == null || (pS = c1715y.s(this, obj)) == null) ? P.f18179h : pS;
    }

    public final void d() {
        C1715y c1715y = this.f18348a;
        if (c1715y != null) {
            c1715y.f18411v = true;
            c1715y.f18394A.O();
        }
        this.f18348a = null;
        this.f18353f = null;
        this.g = null;
        this.f18351d = null;
    }

    public final void e(boolean z6) {
        int i3 = this.f18349b;
        this.f18349b = z6 ? i3 | 32 : i3 & (-33);
    }

    public final void f(m mVar) {
        this.f18351d = mVar;
    }
}
