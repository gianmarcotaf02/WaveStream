package p205z2;

import A2.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import p020c0.f1;
import p113n1.f;
import p188x0.C3098s;

public final class C3168d extends o implements Function0 {

    public static final C3168d f32246i = new C3168d(0, 0);
    public static final C3168d j = new C3168d(0, 1);

    public static final C3168d f32247k = new C3168d(0, 2);

    public static final C3168d f32248l = new C3168d(0, 3);

    public final int f32249h;

    public C3168d(int i3, int i9) {
        super(i3);
        this.f32249h = i9;
    }

    @Override
    public final Object invoke() {
        switch (this.f32249h) {
            case 0:
                f1 f1Var = AbstractC3169e.f32250a;
                long j9 = a.f179t;
                return new C3167c(j9, a.j, a.f180u, a.f170k, a.f166e, a.f182w, a.f171l, a.f183x, a.f172m, a.f160A, a.f175p, a.f161B, a.f176q, a.f162a, a.g, a.y, a.f173n, a.f184z, a.f174o, j9, a.f167f, a.f165d, a.f163b, a.f168h, a.f164c, a.f169i, a.f177r, a.f178s, a.f181v);
            case 1:
                return new C3098s(C3098s.f31123b);
            case 2:
                return new C3181q();
            case 3:
                return new f(0);
            default:
                return Boolean.FALSE;
        }
    }
}
