package p153r8;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import p070h6.z;

public final class A0 extends AbstractC2692d0 {

    public short[] f26891a;

    public int f26892b;

    @Override
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f26891a, this.f26892b);
        m.d(sArrCopyOf, "copyOf(...)");
        return new z(sArrCopyOf);
    }

    @Override
    public final void b(int i3) {
        short[] sArr = this.f26891a;
        if (sArr.length < i3) {
            int length = sArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i3);
            m.d(sArrCopyOf, "copyOf(...)");
            this.f26891a = sArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.f26892b;
    }
}
