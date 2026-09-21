package p153r8;

import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class N extends AbstractC2692d0 {

    public long[] f26919a;

    public int f26920b;

    @Override
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f26919a, this.f26920b);
        m.d(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override
    public final void b(int i3) {
        long[] jArr = this.f26919a;
        if (jArr.length < i3) {
            int length = jArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i3);
            m.d(jArrCopyOf, "copyOf(...)");
            this.f26919a = jArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.f26920b;
    }
}
