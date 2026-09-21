package p153r8;

import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class C2707s extends AbstractC2692d0 {

    public double[] f26997a;

    public int f26998b;

    @Override
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f26997a, this.f26998b);
        m.d(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override
    public final void b(int i3) {
        double[] dArr = this.f26997a;
        if (dArr.length < i3) {
            int length = dArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i3);
            m.d(dArrCopyOf, "copyOf(...)");
            this.f26997a = dArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.f26998b;
    }
}
