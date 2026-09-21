package U;

public abstract class K {

    public static final float f9919a;

    public static final float f9920b;

    public static final Y0.w f9921c = new Y0.w("SelectionHandleInfo");

    static {
        float f9 = 25;
        f9919a = f9;
        f9920b = f9;
    }

    public static final long a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
