package p153r8;

import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class m0 extends AbstractC2692d0 {

    public short[] f26978a;

    public int f26979b;

    @Override
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f26978a, this.f26979b);
        m.d(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override
    public final void b(int i3) {
        short[] sArr = this.f26978a;
        if (sArr.length < i3) {
            int length = sArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i3);
            m.d(sArrCopyOf, "copyOf(...)");
            this.f26978a = sArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.f26979b;
    }
}
