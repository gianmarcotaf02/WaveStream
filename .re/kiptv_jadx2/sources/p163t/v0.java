package p163t;

import O0.f0;
import O0.g0;
import O7.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p020c0.C1677e0;
import p020c0.C1681g0;
import p070h6.A;
import p113n1.c;
import p113n1.k;
import p194x6.j;

public final class v0 implements j {

    public final int f27721h;

    public final float f27722i;
    public final Object j;

    public v0(float f9, Function0 function0) {
        this.f27721h = 2;
        this.f27722i = f9;
        this.j = function0;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f27721h) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                y0 y0Var = (y0) this.j;
                if (!y0Var.g()) {
                    C1677e0 c1677e0 = y0Var.g;
                    if (c1677e0.g() == Long.MIN_VALUE) {
                        c1677e0.h(jLongValue);
                        ((C1681g0) y0Var.f27727a.f2006h).setValue(Boolean.TRUE);
                    }
                    long jG = jLongValue - c1677e0.g();
                    float f9 = this.f27722i;
                    if (f9 != 0.0f) {
                        jG = r.R(jG / ((double) f9));
                    }
                    y0Var.n(jG);
                    y0Var.h(jG, f9 == 0.0f);
                }
                return A.f22523a;
            case 1:
                f0 layout = (f0) obj;
                m.e(layout, "$this$layout");
                layout.g((g0) this.j, -layout.k0(this.f27722i), 0, 0.0f);
                return A.f22523a;
            default:
                c offset = (c) obj;
                m.e(offset, "$this$offset");
                return new k((((long) r.Q(this.f27722i - ((Number) ((Function0) this.j).invoke()).floatValue())) << 32) | (((long) 0) & 4294967295L));
        }
    }

    public v0(Object obj, float f9, int i3) {
        this.f27721h = i3;
        this.j = obj;
        this.f27722i = f9;
    }
}
