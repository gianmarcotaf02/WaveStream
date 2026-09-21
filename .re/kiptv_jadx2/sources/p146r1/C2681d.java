package p146r1;

import E6.u;
import Y0.t;
import Y0.v;
import Y0.x;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

public final class C2681d extends o implements j {

    public static final C2681d f26729i = new C2681d(1, 0);
    public static final C2681d j = new C2681d(1, 1);

    public static final C2681d f26730k = new C2681d(1, 2);

    public static final C2681d f26731l = new C2681d(1, 3);

    public static final C2681d f26732m = new C2681d(1, 4);

    public static final C2681d f26733n = new C2681d(1, 5);

    public final int f26734h;

    public C2681d(int i3, int i9) {
        super(i3);
        this.f26734h = i9;
    }

    @Override
    public final Object invoke(Object obj) {
        A a2 = A.f22523a;
        switch (this.f26734h) {
            case 0:
                u[] uVarArr = v.f11144a;
                ((x) obj).d(t.f11140x, a2);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                u[] uVarArr2 = v.f11144a;
                ((x) obj).d(t.f11139w, a2);
                break;
            case 4:
                break;
            default:
                A a9 = (A) obj;
                if (a9.isAttachedToWindow()) {
                    a9.m();
                }
                break;
        }
        return a2;
    }
}
