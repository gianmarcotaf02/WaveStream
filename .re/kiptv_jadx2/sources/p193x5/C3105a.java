package p193x5;

import B.AbstractC0065c;
import D.C0196c;
import Z.K0;
import Z.R0;
import Z.S0;
import kotlin.jvm.internal.m;
import p015b5.u;
import p020c0.C1700q;
import p048f1.s;
import p070h6.A;
import p188x0.C3098s;
import p194x6.n;

public final class C3105a implements n {

    public static final C3105a f31418i = new C3105a(0);
    public static final C3105a j = new C3105a(1);

    public final int f31419h;

    public C3105a(int i3) {
        this.f31419h = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f31419h) {
            case 0:
                C0196c item = (C0196c) obj;
                C1700q c1700q = (C1700q) obj2;
                int iIntValue = ((Number) obj3).intValue();
                m.e(item, "$this$item");
                if ((iIntValue & 17) == 16 && c1700q.F()) {
                    c1700q.W();
                } else {
                    K0.b(u.a("livetv.epgSheet.refineSearch"), AbstractC0065c.p(p137q0.m.f26474b, 0.0f, 8, 1), C3098s.c(C3098s.f31124c, 0.45f), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((R0) c1700q.j(S0.f12323a)).f12320o, c1700q, 432, 0, 65528);
                }
                break;
            default:
                C0196c item2 = (C0196c) obj;
                C1700q c1700q2 = (C1700q) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                m.e(item2, "$this$item");
                if ((iIntValue2 & 17) == 16 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    K0.b(u.a("livetv.categoriesSection"), AbstractC0065c.r(p137q0.m.f26474b, 12, 14, 0.0f, 6, 4), C3098s.c(C3098s.f31124c, 0.45f), 0L, s.f21669m, null, 0L, null, 0L, 0, false, 0, 0, ((R0) c1700q2.j(S0.f12323a)).f12319n, c1700q2, 197040, 0, 65496);
                }
                break;
        }
        return A.f22523a;
    }
}
