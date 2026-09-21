package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class D implements p163t.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p163t.InterfaceC2780y f27444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f27446d;

    public D(int i3, int i9, p163t.InterfaceC2780y interfaceC2780y) {
        this.f27443a = i3;
        this.f27444b = interfaceC2780y;
        this.f27445c = ((long) i3) * 1000000;
        this.f27446d = ((long) i9) * 1000000;
    }

    @Override // p163t.B
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

    @Override // p163t.B
    public final long c(float f9, float f10, float f11) {
        return this.f27446d + this.f27445c;
    }

    @Override // p163t.B
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
