package p029d;

/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f21080i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f21081k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i3) {
        super(1);
        this.f21079h = i3;
        this.f21080i = obj;
        this.j = obj2;
        this.f21081k = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [kotlin.jvm.internal.o, x6.j] */
    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean zBooleanValue;
        switch (this.f21079h) {
            case 0:
                p019c.u uVar = (p019c.u) this.f21080i;
                androidx.lifecycle.InterfaceC1540w interfaceC1540w = (androidx.lifecycle.InterfaceC1540w) this.j;
                p029d.d dVar = (p029d.d) this.f21081k;
                uVar.a(interfaceC1540w, dVar);
                return new C5.F0(10, dVar);
            case 1:
                p019c.u uVar2 = (p019c.u) this.f21080i;
                androidx.lifecycle.InterfaceC1540w interfaceC1540w2 = (androidx.lifecycle.InterfaceC1540w) this.j;
                p029d.j jVar = (p029d.j) this.f21081k;
                uVar2.a(interfaceC1540w2, jVar);
                return new C5.F0(11, jVar);
            case 2:
                p188x0.InterfaceC3097q interfaceC3097qJ = ((p203z0.d) obj).d0().j();
                p138q1.y yVar = (p138q1.y) this.f21080i;
                if (yVar.getView().getVisibility() != 8) {
                    yVar.f26522F = true;
                    androidx.compose.ui.platform.AndroidComposeView androidComposeView = ((Q0.F) this.j).f8254v;
                    if (androidComposeView == null) {
                        androidComposeView = null;
                    }
                    if (androidComposeView != null) {
                        android.graphics.Canvas canvasA = p188x0.AbstractC3083c.a(interfaceC3097qJ);
                        androidComposeView.getAndroidViewsHandler$ui().getClass();
                        ((p138q1.y) this.f21081k).draw(canvasA);
                    }
                    yVar.f26522F = false;
                }
                return p070h6.A.f22523a;
            case 3:
                return new p112n0.d((p121o0.n) this.f21080i, this.j, (p154s.C2729o) this.f21081k, 2);
            case 4:
                p188x0.L l2 = (p188x0.L) obj;
                p163t.q0 q0Var = (p163t.q0) this.f21080i;
                l2.b(q0Var != null ? ((java.lang.Number) q0Var.getValue()).floatValue() : 1.0f);
                p163t.q0 q0Var2 = (p163t.q0) this.j;
                l2.k(q0Var2 != null ? ((java.lang.Number) q0Var2.getValue()).floatValue() : 1.0f);
                l2.n(q0Var2 != null ? ((java.lang.Number) q0Var2.getValue()).floatValue() : 1.0f);
                p163t.q0 q0Var3 = (p163t.q0) this.f21081k;
                l2.A(q0Var3 != null ? ((p188x0.T) q0Var3.getValue()).f31096a : p188x0.T.f31094b);
                return p070h6.A.f22523a;
            case 5:
                int iOrdinal = ((p154s.D) obj).ordinal();
                p188x0.T t9 = null;
                p154s.Q q9 = (p154s.Q) this.f21081k;
                if (iOrdinal == 0) {
                    p154s.b0 b0Var = q9.f27095a;
                } else if (iOrdinal == 1) {
                    t9 = (p188x0.T) this.f21080i;
                } else {
                    if (iOrdinal != 2) {
                        throw new I3.b();
                    }
                    p154s.b0 b0Var2 = q9.f27095a;
                }
                return new p188x0.T(t9 != null ? t9.f31096a : p188x0.T.f31094b);
            case 6:
                Q0.C0 c9 = (Q0.C0) obj;
                t0.f fVar = (t0.f) c9;
                t0.f fVar2 = (t0.f) this.j;
                fVar2.getClass();
                if (!((t0.b) Q0.AbstractC0777k.u(fVar2).getDragAndDropManager()).f27744b.contains(fVar) || !com.google.android.gms.internal.play_billing.AbstractC1853k0.e(fVar, com.google.android.gms.internal.play_billing.AbstractC1864o0.g0((p020c0.C1704s0) this.f21081k))) {
                    return Q0.B0.f8207h;
                }
                ((kotlin.jvm.internal.A) this.f21080i).f24539h = c9;
                return Q0.B0.j;
            default:
                p175v0.F f9 = (p175v0.F) obj;
                if (kotlin.jvm.internal.m.a(f9, (p175v0.F) this.f21080i)) {
                    zBooleanValue = false;
                } else {
                    if (kotlin.jvm.internal.m.a(f9, ((p175v0.p) this.j).f29082c)) {
                        throw new java.lang.IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((java.lang.Boolean) ((kotlin.jvm.internal.o) this.f21081k).invoke(f9)).booleanValue();
                }
                return java.lang.Boolean.valueOf(zBooleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(p175v0.F f9, p175v0.p pVar, p194x6.j jVar) {
        super(1);
        this.f21079h = 7;
        this.f21080i = f9;
        this.j = pVar;
        this.f21081k = (kotlin.jvm.internal.o) jVar;
    }
}
