package p020c0;

/* JADX INFO: renamed from: c0.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1701q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p020c0.C1715y f18348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p020c0.C1668a f18350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p194x6.m f18351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p136q.C f18353f;
    public p136q.H g;

    public C1701q0(p020c0.C1715y c1715y) {
        this.f18348a = c1715y;
    }

    public static boolean a(p020c0.F f9, p136q.H h9) {
        kotlin.jvm.internal.m.c(f9, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        p020c0.C1676e c1676e = f9.j;
        if (c1676e == null) {
            c1676e = p020c0.C1676e.f18243n;
        }
        return !c1676e.a(f9.h().f18110f, h9.g(f9));
    }

    public final boolean b() {
        if (this.f18348a != null) {
            p020c0.C1668a c1668a = this.f18350c;
            if (c1668a != null ? c1668a.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final p020c0.P c(java.lang.Object obj) {
        p020c0.P pS;
        p020c0.C1715y c1715y = this.f18348a;
        return (c1715y == null || (pS = c1715y.s(this, obj)) == null) ? p020c0.P.f18179h : pS;
    }

    public final void d() {
        p020c0.C1715y c1715y = this.f18348a;
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

    public final void f(p194x6.m mVar) {
        this.f18351d = mVar;
    }
}
