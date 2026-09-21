package p153r8;

import D7.t;
import kotlin.jvm.internal.m;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class C2711w {

    public static final long[] f27010e = new long[0];

    public final SerialDescriptor f27011a;

    public final t f27012b;

    public long f27013c;

    public final long[] f27014d;

    public C2711w(SerialDescriptor descriptor, t tVar) {
        m.e(descriptor, "descriptor");
        this.f27011a = descriptor;
        this.f27012b = tVar;
        int iF = descriptor.f();
        if (iF <= 64) {
            this.f27013c = iF != 64 ? (-1) << iF : 0L;
            this.f27014d = f27010e;
            return;
        }
        this.f27013c = 0L;
        int i3 = (iF - 1) >>> 6;
        long[] jArr = new long[i3];
        if ((iF & 63) != 0) {
            jArr[i3 - 1] = (-1) << iF;
        }
        this.f27014d = jArr;
    }
}
