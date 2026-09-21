package p146r1;

import kotlin.jvm.internal.o;
import p020c0.C1700q;
import p070h6.A;
import p194x6.m;

public final class t extends o implements m {

    public static final t f26773i = new t(2, 0);
    public static final t j = new t(2, 1);

    public final int f26774h;

    public t(int i3, int i9) {
        super(i3);
        this.f26774h = i9;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26774h) {
            case 0:
                C1700q c1700q = (C1700q) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c1700q.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1700q.W();
                }
                break;
            default:
                C1700q c1700q2 = (C1700q) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c1700q2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c1700q2.W();
                }
                break;
        }
        return A.f22523a;
    }
}
