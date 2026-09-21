package p153r8;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import p070h6.s;

public final class r0 extends AbstractC2692d0 {

    public byte[] f26995a;

    public int f26996b;

    @Override
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f26995a, this.f26996b);
        m.d(bArrCopyOf, "copyOf(...)");
        return new s(bArrCopyOf);
    }

    @Override
    public final void b(int i3) {
        byte[] bArr = this.f26995a;
        if (bArr.length < i3) {
            int length = bArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
            m.d(bArrCopyOf, "copyOf(...)");
            this.f26995a = bArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.f26996b;
    }
}
