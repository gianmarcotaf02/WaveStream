package p114n2;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f25683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2.f f25684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D3.j f25685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.app.Activity f25686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Y1.v f25688f;
    public final boolean g;

    public y(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        this.f25683a = context;
        this.f25684b = new q2.f(this, new p114n2.C2652k(this, 0));
        this.f25685c = new D3.j(context, (byte) 0);
        for (java.lang.Object obj : N7.o.m0(context, new p108m5.c(7))) {
            if (((android.content.Context) obj) instanceof android.app.Activity) {
                this.f25686d = (android.app.Activity) obj;
                this.f25688f = new Y1.v(2, this);
                this.g = true;
                p114n2.L l2 = this.f25684b.f26611s;
                l2.a(new p114n2.x(l2));
                this.f25684b.f26611s.a(new p114n2.C2643b(this.f25683a));
                com.google.common.util.concurrent.D.B(new p114n2.C2652k(this, 1));
            }
        }
        obj = null;
        this.f25686d = (android.app.Activity) obj;
        this.f25688f = new Y1.v(2, this);
        this.g = true;
        p114n2.L l9 = this.f25684b.f26611s;
        l9.a(new p114n2.x(l9));
        this.f25684b.f26611s.a(new p114n2.C2643b(this.f25683a));
        com.google.common.util.concurrent.D.B(new p114n2.C2652k(this, 1));
    }

    public static void b(p114n2.y yVar, java.lang.String route) {
        yVar.getClass();
        kotlin.jvm.internal.m.e(route, "route");
        yVar.f25684b.l(route, null);
    }

    public final void a(java.lang.String route, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(route, "route");
        q2.f fVar = this.f25684b;
        fVar.getClass();
        fVar.l(route, com.google.android.gms.internal.play_billing.AbstractC1864o0.k0(jVar));
    }

    public final void c() {
        q2.f fVar = this.f25684b;
        if (fVar.f26600f.isEmpty()) {
            return;
        }
        p114n2.t tVarG = fVar.g();
        kotlin.jvm.internal.m.b(tVarG);
        if (fVar.n(tVarG.f25671i.f8482a, true, false)) {
            fVar.b();
        }
    }
}
