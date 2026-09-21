package y5;

import B.a0;
import Z.K0;
import p020c0.C1700q;

public final class C3156a implements p194x6.n {

    public static final C3156a f31900i = new C3156a(0);
    public static final C3156a j = new C3156a(1);

    public final int f31901h;

    public C3156a(int i3) {
        this.f31901h = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f31901h) {
            case 0:
                a0 TextButton = (a0) obj;
                C1700q c1700q = (C1700q) obj2;
                int iIntValue = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.e(TextButton, "$this$TextButton");
                if ((iIntValue & 17) == 16 && c1700q.F()) {
                    c1700q.W();
                } else {
                    K0.b(p015b5.u.a("common.confirm"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q, 0, 0, 131070);
                }
                break;
            default:
                a0 TextButton2 = (a0) obj;
                C1700q c1700q2 = (C1700q) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.e(TextButton2, "$this$TextButton");
                if ((iIntValue2 & 17) == 16 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    K0.b(p015b5.u.a("common.cancel"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q2, 0, 0, 131070);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
