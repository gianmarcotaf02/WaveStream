package p153r8;

import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class C2703n extends AbstractC2692d0 {

    public char[] f26980a;

    public int f26981b;

    @Override
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f26980a, this.f26981b);
        m.d(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override
    public final void b(int i3) {
        char[] cArr = this.f26980a;
        if (cArr.length < i3) {
            int length = cArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i3);
            m.d(cArrCopyOf, "copyOf(...)");
            this.f26980a = cArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.f26981b;
    }
}
