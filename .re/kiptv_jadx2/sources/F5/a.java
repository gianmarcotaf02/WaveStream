package F5;

import D.C0196c;
import p020c0.C1700q;
import p070h6.A;

public final class a implements p194x6.n {

    public static final a f3667i = new a(0);
    public static final a j = new a(1);

    public static final a f3668k = new a(2);

    public static final a f3669l = new a(3);

    public final int f3670h;

    public a(int i3) {
        this.f3670h = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f3670h) {
            case 0:
                C0196c item = (C0196c) obj;
                C1700q c1700q = (C1700q) obj2;
                int iIntValue = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                if ((iIntValue & 17) == 16 && c1700q.F()) {
                    c1700q.W();
                } else {
                    j.j(0, c1700q);
                }
                break;
            case 1:
                C0196c item2 = (C0196c) obj;
                C1700q c1700q2 = (C1700q) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.e(item2, "$this$item");
                if ((iIntValue2 & 17) == 16 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    j.b(0, c1700q2);
                }
                break;
            case 2:
                C0196c item3 = (C0196c) obj;
                C1700q c1700q3 = (C1700q) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.e(item3, "$this$item");
                if ((iIntValue3 & 17) == 16 && c1700q3.F()) {
                    c1700q3.W();
                } else {
                    j.d(0, c1700q3);
                }
                break;
            default:
                C0196c item4 = (C0196c) obj;
                C1700q c1700q4 = (C1700q) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.e(item4, "$this$item");
                if ((iIntValue4 & 17) == 16 && c1700q4.F()) {
                    c1700q4.W();
                } else {
                    j.e(0, c1700q4);
                }
                break;
        }
        return A.f22523a;
    }
}
