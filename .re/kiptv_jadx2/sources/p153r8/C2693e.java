package p153r8;

import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class C2693e extends AbstractC2692d0 {

    public boolean[] f26956a;

    public int f26957b;

    @Override
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f26956a, this.f26957b);
        m.d(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override
    public final void b(int i3) {
        boolean[] zArr = this.f26956a;
        if (zArr.length < i3) {
            int length = zArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i3);
            m.d(zArrCopyOf, "copyOf(...)");
            this.f26956a = zArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.f26957b;
    }
}
