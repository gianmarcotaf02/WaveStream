package O0;

public final class Y implements t0, InterfaceC0719h {

    public static final Y f7619i = new Y(0);

    public final int f7620h;

    public Y(int i3) {
        this.f7620h = i3;
    }

    @Override
    public long a(long j, long j9) {
        switch (this.f7620h) {
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j9 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i3 = m0.f7659a;
                return jFloatToRawIntBits;
            case 2:
                float fC = AbstractC0735y.c(j, j9);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
                int i9 = m0.f7659a;
                return jFloatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j9 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j9 & 4294967295L))) {
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i10 = m0.f7659a;
                    return jFloatToRawIntBits3;
                }
                float fC2 = AbstractC0735y.c(j, j9);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L);
                int i11 = m0.f7659a;
                return jFloatToRawIntBits4;
        }
    }

    @Override
    public boolean b(Object obj, Object obj2) {
        return false;
    }

    @Override
    public void d(s0 s0Var) {
        s0Var.clear();
    }

    public String toString() {
        switch (this.f7620h) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
