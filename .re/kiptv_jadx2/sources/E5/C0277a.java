package E5;

import p020c0.C1700q;

public final class C0277a implements p194x6.n {

    public static final C0277a f2982i = new C0277a(0);
    public static final C0277a j = new C0277a(1);

    public static final C0277a f2983k = new C0277a(2);

    public static final C0277a f2984l = new C0277a(3);

    public final int f2985h;

    public C0277a(int i3) {
        this.f2985h = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f2985h) {
            case 0:
                B.a0 TextButton = (B.a0) obj;
                C1700q c1700q = (C1700q) obj2;
                int iIntValue = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.e(TextButton, "$this$TextButton");
                if ((iIntValue & 17) == 16 && c1700q.F()) {
                    c1700q.W();
                } else {
                    Z.K0.b(p015b5.u.a("common.ok"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q, 0, 0, 131070);
                }
                break;
            case 1:
                B.a0 TextButton2 = (B.a0) obj;
                C1700q c1700q2 = (C1700q) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.e(TextButton2, "$this$TextButton");
                if ((iIntValue2 & 17) == 16 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    Z.K0.b(p015b5.u.a("common.delete"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q2, 0, 0, 131070);
                }
                break;
            case 2:
                B.a0 TextButton3 = (B.a0) obj;
                C1700q c1700q3 = (C1700q) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.e(TextButton3, "$this$TextButton");
                if ((iIntValue3 & 17) == 16 && c1700q3.F()) {
                    c1700q3.W();
                } else {
                    Z.K0.b(p015b5.u.a("common.cancel"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q3, 0, 0, 131070);
                }
                break;
            default:
                B.a0 TextButton4 = (B.a0) obj;
                C1700q c1700q4 = (C1700q) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.e(TextButton4, "$this$TextButton");
                if ((iIntValue4 & 17) == 16 && c1700q4.F()) {
                    c1700q4.W();
                } else {
                    Z.K0.b(p015b5.u.a("common.ok"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q4, 0, 0, 131070);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
