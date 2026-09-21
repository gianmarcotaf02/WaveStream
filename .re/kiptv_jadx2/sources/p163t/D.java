package p163t;

public final class D implements B {

    public final int f27443a;

    public final InterfaceC2780y f27444b;

    public final long f27445c;

    public final long f27446d;

    public D(int i3, int i9, InterfaceC2780y interfaceC2780y) {
        this.f27443a = i3;
        this.f27444b = interfaceC2780y;
        this.f27445c = ((long) i3) * 1000000;
        this.f27446d = ((long) i9) * 1000000;
    }

    @Override
    public final float b(long j, float f9, float f10, float f11) {
        long j9 = j - this.f27446d;
        if (j9 < 0) {
            j9 = 0;
        }
        long j10 = this.f27445c;
        long j11 = j9 > j10 ? j10 : j9;
        if (j11 == 0) {
            return f11;
        }
        return (e(j11, f9, f10, f11) - e(j11 - 1000000, f9, f10, f11)) * 1000.0f;
    }

    @Override
    public final long c(float f9, float f10, float f11) {
        return this.f27446d + this.f27445c;
    }

    @Override
    public final float e(long j, float f9, float f10, float f11) {
        long j9 = j - this.f27446d;
        if (j9 < 0) {
            j9 = 0;
        }
        long j10 = this.f27445c;
        if (j9 > j10) {
            j9 = j10;
        }
        float fB = this.f27444b.b(this.f27443a == 0 ? 1.0f : j9 / j10);
        return (f10 * fB) + ((1 - fB) * f9);
    }
}
