package U;

import J5.t2;
import p163t.C2761i0;
import p163t.C2771o;
import p163t.E0;

public abstract class Q {

    public static final C2771o f9933a = new C2771o(Float.NaN, Float.NaN);

    public static final E0 f9934b = new E0(new t2(28), new t2(29));

    public static final long f9935c;

    public static final C2761i0 f9936d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f9935c = jFloatToRawIntBits;
        f9936d = new C2761i0(new p181w0.a(jFloatToRawIntBits));
    }
}
