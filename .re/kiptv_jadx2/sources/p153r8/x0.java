package p153r8;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import p070h6.w;

public final class x0 extends AbstractC2692d0 {

    public long[] f27020a;

    public int f27021b;

    @Override
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f27020a, this.f27021b);
        m.d(jArrCopyOf, "copyOf(...)");
        return new w(jArrCopyOf);
    }

    @Override
    public final void b(int i3) {
        long[] jArr = this.f27020a;
        if (jArr.length < i3) {
            int length = jArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i3);
            m.d(jArrCopyOf, "copyOf(...)");
            this.f27020a = jArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.f27021b;
    }
}
