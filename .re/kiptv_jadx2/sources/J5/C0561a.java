package J5;

import B.AbstractC0071i;
import B.AbstractC0083v;
import B.C0085x;
import Q0.C0772f;
import Q0.C0790y;
import Q0.InterfaceC0773g;
import com.kiptv.tv.R;
import p020c0.AbstractC1703s;
import p020c0.C1700q;
import p020c0.InterfaceC1691l0;
import p188x0.C3098s;
import v.AbstractC2901v;

public final class C0561a implements p194x6.o {

    public static final C0561a f6337i = new C0561a(0);
    public static final C0561a j = new C0561a(1);

    public final int f6338h;

    public C0561a(int i3) {
        this.f6338h = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i3;
        int i9;
        switch (this.f6338h) {
            case 0:
                B.a0 TvFocusableRow = (B.a0) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                C1700q c1700q = (C1700q) obj3;
                int iIntValue = ((Number) obj4).intValue();
                kotlin.jvm.internal.m.e(TvFocusableRow, "$this$TvFocusableRow");
                if ((iIntValue & 6) == 0) {
                    i3 = (c1700q.f(TvFocusableRow) ? 4 : 2) | iIntValue;
                } else {
                    i3 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i3 |= c1700q.g(zBooleanValue) ? 32 : 16;
                }
                if ((i3 & 147) == 146 && c1700q.F()) {
                    c1700q.W();
                } else {
                    AbstractC2901v.b(p000a.a.C(R.drawable.kiptv_logo_gold, c1700q, 0), null, androidx.compose.foundation.layout.b.l(p137q0.m.f26474b, 40), null, null, 0.0f, c1700q, 440, 120);
                    p137q0.p pVarA = B.a0.a(TvFocusableRow, 1.0f);
                    C0085x c0085xA = AbstractC0083v.a(AbstractC0071i.f538c, p137q0.c.f26460t, c1700q, 0);
                    int iHashCode = Long.hashCode(c1700q.f18323T);
                    InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
                    p137q0.p pVarC = p137q0.a.c(c1700q, pVarA);
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
                    String strA = p015b5.u.a("premium.upgradeToPremium");
                    p020c0.f1 f1Var = Z.S0.f12323a;
                    Z.K0.b(strA, null, zBooleanValue ? C3098s.f31123b : C3098s.f31124c, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Z.R0) c1700q.j(f1Var)).f12314h, c1700q, 0, 0, 65530);
                    Z.K0.b(p015b5.u.a("premium.streamingUnlimited"), null, C3098s.c(zBooleanValue ? C3098s.f31123b : C3098s.f31124c, 0.6f), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Z.R0) c1700q.j(f1Var)).f12317l, c1700q, 0, 0, 65530);
                    c1700q.p(true);
                }
                break;
            default:
                B.a0 TvFocusableRow2 = (B.a0) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                C1700q c1700q2 = (C1700q) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                kotlin.jvm.internal.m.e(TvFocusableRow2, "$this$TvFocusableRow");
                if ((iIntValue2 & 6) == 0) {
                    i9 = (c1700q2.f(TvFocusableRow2) ? 4 : 2) | iIntValue2;
                } else {
                    i9 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i9 |= c1700q2.g(zBooleanValue2) ? 32 : 16;
                }
                if ((i9 & 147) == 146 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    AbstractC2901v.b(p000a.a.C(R.drawable.kiptv_logo_gold, c1700q2, 0), null, androidx.compose.foundation.layout.b.l(p137q0.m.f26474b, 40), null, null, 0.0f, c1700q2, 440, 120);
                    p137q0.p pVarA2 = B.a0.a(TvFocusableRow2, 1.0f);
                    C0085x c0085xA2 = AbstractC0083v.a(AbstractC0071i.f538c, p137q0.c.f26460t, c1700q2, 0);
                    int iHashCode2 = Long.hashCode(c1700q2.f18323T);
                    InterfaceC1691l0 interfaceC1691l0L2 = c1700q2.l();
                    p137q0.p pVarC2 = p137q0.a.c(c1700q2, pVarA2);
                    InterfaceC0773g.f8436c.getClass();
                    C0790y c0790y2 = C0772f.f8424b;
                    c1700q2.g0();
                    if (c1700q2.f18322S) {
                        c1700q2.k(c0790y2);
                    } else {
                        c1700q2.q0();
                    }
                    AbstractC1703s.H(c1700q2, c0085xA2, C0772f.f8427e);
                    AbstractC1703s.H(c1700q2, interfaceC1691l0L2, C0772f.f8426d);
                    AbstractC1703s.w(c1700q2, Integer.valueOf(iHashCode2), C0772f.f8428f);
                    AbstractC1703s.D(c1700q2, C0772f.g);
                    AbstractC1703s.H(c1700q2, pVarC2, C0772f.f8425c);
                    String strA2 = p015b5.u.a("premium.upgradeToPremium");
                    p020c0.f1 f1Var2 = Z.S0.f12323a;
                    Z.K0.b(strA2, null, zBooleanValue2 ? C3098s.f31123b : C3098s.f31124c, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Z.R0) c1700q2.j(f1Var2)).f12314h, c1700q2, 0, 0, 65530);
                    Z.K0.b(p015b5.u.a("premium.streamingUnlimited"), null, C3098s.c(zBooleanValue2 ? C3098s.f31123b : C3098s.f31124c, 0.6f), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Z.R0) c1700q2.j(f1Var2)).f12317l, c1700q2, 0, 0, 65530);
                    c1700q2.p(true);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
