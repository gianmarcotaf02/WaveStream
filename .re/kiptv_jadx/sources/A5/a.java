package A5;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements p194x6.o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final A5.a f246h = new A5.a();

    @Override // p194x6.o
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        p154s.C2724j AnimatedContent = (p154s.C2724j) obj;
        int iIntValue = ((java.lang.Number) obj2).intValue();
        p020c0.C1700q c1700q = (p020c0.C1700q) obj3;
        ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.m.e(AnimatedContent, "$this$AnimatedContent");
        java.lang.String str = (java.lang.String) A5.i.f263a.get(iIntValue);
        p137q0.f fVar = p137q0.c.f26461u;
        p137q0.m mVar = p137q0.m.f26474b;
        p137q0.p pVarP = B.AbstractC0065c.p(androidx.compose.foundation.layout.b.e(mVar, 1.0f), 60, 0.0f, 2);
        B.C0085x c0085xA = B.AbstractC0083v.a(B.AbstractC0071i.f538c, fVar, c1700q, 48);
        int iHashCode = java.lang.Long.hashCode(c1700q.f18323T);
        p020c0.InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
        p137q0.p pVarC = p137q0.a.c(c1700q, pVarP);
        Q0.InterfaceC0773g.f8436c.getClass();
        Q0.C0790y c0790y = Q0.C0772f.f8424b;
        c1700q.g0();
        if (c1700q.f18322S) {
            c1700q.k(c0790y);
        } else {
            c1700q.q0();
        }
        p020c0.AbstractC1703s.H(c1700q, c0085xA, Q0.C0772f.f8427e);
        p020c0.AbstractC1703s.H(c1700q, interfaceC1691l0L, Q0.C0772f.f8426d);
        p020c0.AbstractC1703s.w(c1700q, java.lang.Integer.valueOf(iHashCode), Q0.C0772f.f8428f);
        p020c0.AbstractC1703s.D(c1700q, Q0.C0772f.g);
        p020c0.AbstractC1703s.H(c1700q, pVarC, Q0.C0772f.f8425c);
        java.lang.String strA = p015b5.u.a("onboarding.slides." + str + ".title");
        p020c0.f1 f1Var = Z.S0.f12323a;
        p011b1.M m8 = ((Z.R0) c1700q.j(f1Var)).f12311d;
        p048f1.s sVar = p048f1.s.f21669m;
        long j = p188x0.C3098s.f31124c;
        Z.K0.b(strA, null, j, 0L, sVar, null, 0L, new p104m1.k(3), 0L, 0, false, 0, 0, m8, c1700q, 196992, 0, 64986);
        B.AbstractC0065c.d(c1700q, androidx.compose.foundation.layout.b.g(mVar, 8));
        Z.K0.b(p015b5.u.a("onboarding.slides." + str + ".subtitle"), null, p188x0.C3098s.c(j, 0.7f), 0L, p048f1.s.f21668l, null, 0L, new p104m1.k(3), 0L, 0, false, 0, 0, ((Z.R0) c1700q.j(f1Var)).f12314h, c1700q, 196992, 0, 64986);
        c1700q.p(true);
        return p070h6.A.f22523a;
    }
}
