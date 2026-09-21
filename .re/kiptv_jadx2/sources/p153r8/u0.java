package p153r8;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import p070h6.u;

public final class u0 extends AbstractC2692d0 {

    public int[] f27005a;

    public int f27006b;

    @Override
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f27005a, this.f27006b);
        m.d(iArrCopyOf, "copyOf(...)");
        return new u(iArrCopyOf);
    }

    @Override
    public final void b(int i3) {
        int[] iArr = this.f27005a;
        if (iArr.length < i3) {
            int length = iArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
            m.d(iArrCopyOf, "copyOf(...)");
            this.f27005a = iArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.f27006b;
    }
}
