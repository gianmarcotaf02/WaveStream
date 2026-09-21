package p153r8;

import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class I extends AbstractC2692d0 {

    public int[] f26912a;

    public int f26913b;

    @Override
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f26912a, this.f26913b);
        m.d(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override
    public final void b(int i3) {
        int[] iArr = this.f26912a;
        if (iArr.length < i3) {
            int length = iArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
            m.d(iArrCopyOf, "copyOf(...)");
            this.f26912a = iArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.f26913b;
    }
}
