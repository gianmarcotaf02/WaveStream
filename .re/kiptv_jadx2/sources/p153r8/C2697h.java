package p153r8;

import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class C2697h extends AbstractC2692d0 {

    public byte[] f26965a;

    public int f26966b;

    @Override
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f26965a, this.f26966b);
        m.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override
    public final void b(int i3) {
        byte[] bArr = this.f26965a;
        if (bArr.length < i3) {
            int length = bArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
            m.d(bArrCopyOf, "copyOf(...)");
            this.f26965a = bArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.f26966b;
    }
}
