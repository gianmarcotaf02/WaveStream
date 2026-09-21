package O0;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements O0.t0, O0.InterfaceC0719h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final O0.Y f7619i = new O0.Y(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7620h;

    public /* synthetic */ Y(int i3) {
        this.f7620h = i3;
    }

    @Override // O0.InterfaceC0719h
    public long a(long j, long j9) {
        switch (this.f7620h) {
            case 1:
                float fMax = java.lang.Math.max(java.lang.Float.intBitsToFloat((int) (j9 >> 32)) / java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fMax)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i3 = O0.m0.f7659a;
                return jFloatToRawIntBits;
            case 2:
                float fC = O0.AbstractC0735y.c(j, j9);
                long jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(fC)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fC)) & 4294967295L);
                int i9 = O0.m0.f7659a;
                return jFloatToRawIntBits2;
            default:
                if (java.lang.Float.intBitsToFloat((int) (j >> 32)) <= java.lang.Float.intBitsToFloat((int) (j9 >> 32)) && java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) <= java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L))) {
                    long jFloatToRawIntBits3 = (((long) java.lang.Float.floatToRawIntBits(1.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i10 = O0.m0.f7659a;
                    return jFloatToRawIntBits3;
                }
                float fC2 = O0.AbstractC0735y.c(j, j9);
                long jFloatToRawIntBits4 = (((long) java.lang.Float.floatToRawIntBits(fC2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fC2)) & 4294967295L);
                int i11 = O0.m0.f7659a;
                return jFloatToRawIntBits4;
        }
    }

    @Override // O0.t0
    public boolean b(java.lang.Object obj, java.lang.Object obj2) {
        return false;
    }

    @Override // O0.t0
    public void d(O0.s0 s0Var) {
        s0Var.clear();
    }

    public java.lang.String toString() {
        switch (this.f7620h) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
