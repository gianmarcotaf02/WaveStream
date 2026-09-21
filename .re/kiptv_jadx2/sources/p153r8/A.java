package p153r8;

import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class A extends AbstractC2692d0 {

    public float[] f26889a;

    public int f26890b;

    @Override
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f26889a, this.f26890b);
        m.d(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override
    public final void b(int i3) {
        float[] fArr = this.f26889a;
        if (fArr.length < i3) {
            int length = fArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i3);
            m.d(fArrCopyOf, "copyOf(...)");
            this.f26889a = fArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.f26890b;
    }
}
