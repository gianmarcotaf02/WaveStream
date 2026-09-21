package A5;

import B.AbstractC0065c;
import B.AbstractC0071i;
import B.AbstractC0083v;
import B.C0085x;
import Q0.C0772f;
import Q0.C0790y;
import Q0.InterfaceC0773g;
import Z.K0;
import Z.R0;
import Z.S0;
import kotlin.jvm.internal.m;
import p011b1.M;
import p015b5.u;
import p020c0.AbstractC1703s;
import p020c0.C1700q;
import p020c0.InterfaceC1691l0;
import p020c0.f1;
import p048f1.s;
import p070h6.A;
import p137q0.p;
import p154s.C2724j;
import p188x0.C3098s;
import p194x6.o;

public final class a implements o {

    public static final a f246h = new a();

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C2724j AnimatedContent = (C2724j) obj;
        int iIntValue = ((Number) obj2).intValue();
        C1700q c1700q = (C1700q) obj3;
        ((Number) obj4).intValue();
        m.e(AnimatedContent, "$this$AnimatedContent");
        String str = (String) i.f263a.get(iIntValue);
        p137q0.f fVar = p137q0.c.f26461u;
        p137q0.m mVar = p137q0.m.f26474b;
        p pVarP = AbstractC0065c.p(androidx.compose.foundation.layout.b.e(mVar, 1.0f), 60, 0.0f, 2);
        C0085x c0085xA = AbstractC0083v.a(AbstractC0071i.f538c, fVar, c1700q, 48);
        int iHashCode = Long.hashCode(c1700q.f18323T);
        InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
        p pVarC = p137q0.a.c(c1700q, pVarP);
        InterfaceC0773g.f8436c.getClass();
        C0790y c0790y = C0772f.f8424b;
        c1700q.g0();
        if (c1700q.f18322S) {
            c1700q.k(c0790y);
        } else {
            c1700q.q0();
        }
        AbstractC1703s.H(c1700q, c0085xA, C0772f.f8427e);
        AbstractC1703s.H(c1700q, interfaceC1691l0L, C0772f.f8426d);
        AbstractC1703s.w(c1700q, Integer.valueOf(iHashCode), C0772f.f8428f);
        AbstractC1703s.D(c1700q, C0772f.g);
        AbstractC1703s.H(c1700q, pVarC, C0772f.f8425c);
        String strA = u.a("onboarding.slides." + str + ".title");
        f1 f1Var = S0.f12323a;
        M m8 = ((R0) c1700q.j(f1Var)).f12311d;
        s sVar = s.f21669m;
        long j = C3098s.f31124c;
        K0.b(strA, null, j, 0L, sVar, null, 0L, new p104m1.k(3), 0L, 0, false, 0, 0, m8, c1700q, 196992, 0, 64986);
        AbstractC0065c.d(c1700q, androidx.compose.foundation.layout.b.g(mVar, 8));
        K0.b(u.a("onboarding.slides." + str + ".subtitle"), null, C3098s.c(j, 0.7f), 0L, s.f21668l, null, 0L, new p104m1.k(3), 0L, 0, false, 0, 0, ((R0) c1700q.j(f1Var)).f12314h, c1700q, 196992, 0, 64986);
        c1700q.p(true);
        return A.f22523a;
    }
}
