package R;

import K0.J;
import Q0.C0778l;
import kotlin.jvm.functions.Function0;
import p137q0.m;
import p137q0.p;

public abstract class b {

    public static final C0778l f8720a;

    static {
        float f9 = 40;
        float f10 = 10;
        f8720a = new C0778l(f10, f9, f10, f9);
    }

    public static final p a(boolean z6, boolean z9, Function0 function0) {
        p j = m.f26474b;
        if (!z6 || !e.f8727a) {
            return j;
        }
        if (z9) {
            j = new J(f8720a);
        }
        return j.d(new a(function0));
    }
}
