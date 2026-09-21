package t5;

import p020c0.C1700q;

public final class C2788c implements p194x6.n {

    public static final C2788c f28141i = new C2788c(0);
    public static final C2788c j = new C2788c(1);

    public final int f28142h;

    public C2788c(int i3) {
        this.f28142h = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f28142h) {
            case 0:
                B.a0 TextButton = (B.a0) obj;
                C1700q c1700q = (C1700q) obj2;
                int iIntValue = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.e(TextButton, "$this$TextButton");
                if ((iIntValue & 17) == 16 && c1700q.F()) {
                    c1700q.W();
                } else {
                    Z.K0.b(p015b5.u.a("detail.alreadyWatched.restart"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q, 0, 0, 131070);
                }
                break;
            default:
                B.a0 TextButton2 = (B.a0) obj;
                C1700q c1700q2 = (C1700q) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.e(TextButton2, "$this$TextButton");
                if ((iIntValue2 & 17) == 16 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    Z.K0.b(p015b5.u.a("common.cancel"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q2, 0, 0, 131070);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
