package p205z2;

import kotlin.jvm.internal.o;
import p020c0.C1700q;
import p070h6.A;
import p194x6.m;

public final class C3170f extends o implements m {

    public static final C3170f f32251h = new C3170f(2);

    @Override
    public final Object invoke(Object obj, Object obj2) {
        C1700q c1700q = (C1700q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c1700q.F()) {
            c1700q.W();
        } else {
            M.f32202a.a(6, c1700q);
        }
        return A.f22523a;
    }
}
