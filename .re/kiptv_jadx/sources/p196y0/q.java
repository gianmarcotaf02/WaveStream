package p196y0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p196y0.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final io.sentry.protocol.a f31778r = new io.sentry.protocol.a(24);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p196y0.s f31779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f31780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f31781f;
    public final p196y0.r g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f31782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f31783i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p196y0.i f31784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p196y0.p f31785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p196y0.m f31786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p196y0.i f31787n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p196y0.p f31788o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p196y0.m f31789p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f31790q;

    public q(java.lang.String str, float[] fArr, p196y0.s sVar, final p196y0.r rVar, int i3) {
        p196y0.i iVar;
        p196y0.i iVar2;
        double d4 = rVar.f31791a;
        boolean z6 = d4 == -3.0d;
        double d6 = rVar.g;
        double d9 = rVar.f31796f;
        if (z6) {
            final int i9 = 4;
            iVar = new p196y0.i() { // from class: y0.o
                @Override // p196y0.i
                public final double c(double d10) {
                    p196y0.r rVar2 = rVar;
                    switch (i9) {
                        case 0:
                            float[] fArr2 = p196y0.d.f31732a;
                            return p196y0.d.a(rVar2, d10);
                        case 1:
                            float[] fArr3 = p196y0.d.f31732a;
                            return p196y0.d.c(rVar2, d10);
                        case 2:
                            return d10 >= rVar2.f31795e ? java.lang.Math.pow((rVar2.f31792b * d10) + rVar2.f31793c, rVar2.f31791a) : d10 * rVar2.f31794d;
                        case 3:
                            double d11 = rVar2.f31792b;
                            if (d10 >= rVar2.f31795e) {
                                return java.lang.Math.pow((d11 * d10) + rVar2.f31793c, rVar2.f31791a) + rVar2.f31796f;
                            }
                            return rVar2.g + (rVar2.f31794d * d10);
                        case 4:
                            float[] fArr4 = p196y0.d.f31732a;
                            return p196y0.d.b(rVar2, d10);
                        case 5:
                            float[] fArr5 = p196y0.d.f31732a;
                            return p196y0.d.d(rVar2, d10);
                        case 6:
                            double d12 = rVar2.f31795e;
                            double d13 = rVar2.f31794d;
                            return d10 >= d12 * d13 ? (java.lang.Math.pow(d10, 1.0d / rVar2.f31791a) - rVar2.f31793c) / rVar2.f31792b : d10 / d13;
                        default:
                            double d14 = rVar2.f31792b;
                            double d15 = rVar2.f31795e;
                            double d16 = rVar2.f31794d;
                            return d10 >= d15 * d16 ? (java.lang.Math.pow(d10 - rVar2.f31796f, 1.0d / rVar2.f31791a) - rVar2.f31793c) / d14 : (d10 - rVar2.g) / d16;
                    }
                }
            };
        } else if (d4 == -2.0d) {
            final int i10 = 5;
            iVar = new p196y0.i() { // from class: y0.o
                @Override // p196y0.i
                public final double c(double d10) {
                    p196y0.r rVar2 = rVar;
                    switch (i10) {
                        case 0:
                            float[] fArr2 = p196y0.d.f31732a;
                            return p196y0.d.a(rVar2, d10);
                        case 1:
                            float[] fArr3 = p196y0.d.f31732a;
                            return p196y0.d.c(rVar2, d10);
                        case 2:
                            return d10 >= rVar2.f31795e ? java.lang.Math.pow((rVar2.f31792b * d10) + rVar2.f31793c, rVar2.f31791a) : d10 * rVar2.f31794d;
                        case 3:
                            double d11 = rVar2.f31792b;
                            if (d10 >= rVar2.f31795e) {
                                return java.lang.Math.pow((d11 * d10) + rVar2.f31793c, rVar2.f31791a) + rVar2.f31796f;
                            }
                            return rVar2.g + (rVar2.f31794d * d10);
                        case 4:
                            float[] fArr4 = p196y0.d.f31732a;
                            return p196y0.d.b(rVar2, d10);
                        case 5:
                            float[] fArr5 = p196y0.d.f31732a;
                            return p196y0.d.d(rVar2, d10);
                        case 6:
                            double d12 = rVar2.f31795e;
                            double d13 = rVar2.f31794d;
                            return d10 >= d12 * d13 ? (java.lang.Math.pow(d10, 1.0d / rVar2.f31791a) - rVar2.f31793c) / rVar2.f31792b : d10 / d13;
                        default:
                            double d14 = rVar2.f31792b;
                            double d15 = rVar2.f31795e;
                            double d16 = rVar2.f31794d;
                            return d10 >= d15 * d16 ? (java.lang.Math.pow(d10 - rVar2.f31796f, 1.0d / rVar2.f31791a) - rVar2.f31793c) / d14 : (d10 - rVar2.g) / d16;
                    }
                }
            };
        } else if (d9 == 0.0d && d6 == 0.0d) {
            final int i11 = 6;
            iVar = new p196y0.i() { // from class: y0.o
                @Override // p196y0.i
                public final double c(double d10) {
                    p196y0.r rVar2 = rVar;
                    switch (i11) {
                        case 0:
                            float[] fArr2 = p196y0.d.f31732a;
                            return p196y0.d.a(rVar2, d10);
                        case 1:
                            float[] fArr3 = p196y0.d.f31732a;
                            return p196y0.d.c(rVar2, d10);
                        case 2:
                            return d10 >= rVar2.f31795e ? java.lang.Math.pow((rVar2.f31792b * d10) + rVar2.f31793c, rVar2.f31791a) : d10 * rVar2.f31794d;
                        case 3:
                            double d11 = rVar2.f31792b;
                            if (d10 >= rVar2.f31795e) {
                                return java.lang.Math.pow((d11 * d10) + rVar2.f31793c, rVar2.f31791a) + rVar2.f31796f;
                            }
                            return rVar2.g + (rVar2.f31794d * d10);
                        case 4:
                            float[] fArr4 = p196y0.d.f31732a;
                            return p196y0.d.b(rVar2, d10);
                        case 5:
                            float[] fArr5 = p196y0.d.f31732a;
                            return p196y0.d.d(rVar2, d10);
                        case 6:
                            double d12 = rVar2.f31795e;
                            double d13 = rVar2.f31794d;
                            return d10 >= d12 * d13 ? (java.lang.Math.pow(d10, 1.0d / rVar2.f31791a) - rVar2.f31793c) / rVar2.f31792b : d10 / d13;
                        default:
                            double d14 = rVar2.f31792b;
                            double d15 = rVar2.f31795e;
                            double d16 = rVar2.f31794d;
                            return d10 >= d15 * d16 ? (java.lang.Math.pow(d10 - rVar2.f31796f, 1.0d / rVar2.f31791a) - rVar2.f31793c) / d14 : (d10 - rVar2.g) / d16;
                    }
                }
            };
        } else {
            final int i12 = 7;
            iVar = new p196y0.i() { // from class: y0.o
                @Override // p196y0.i
                public final double c(double d10) {
                    p196y0.r rVar2 = rVar;
                    switch (i12) {
                        case 0:
                            float[] fArr2 = p196y0.d.f31732a;
                            return p196y0.d.a(rVar2, d10);
                        case 1:
                            float[] fArr3 = p196y0.d.f31732a;
                            return p196y0.d.c(rVar2, d10);
                        case 2:
                            return d10 >= rVar2.f31795e ? java.lang.Math.pow((rVar2.f31792b * d10) + rVar2.f31793c, rVar2.f31791a) : d10 * rVar2.f31794d;
                        case 3:
                            double d11 = rVar2.f31792b;
                            if (d10 >= rVar2.f31795e) {
                                return java.lang.Math.pow((d11 * d10) + rVar2.f31793c, rVar2.f31791a) + rVar2.f31796f;
                            }
                            return rVar2.g + (rVar2.f31794d * d10);
                        case 4:
                            float[] fArr4 = p196y0.d.f31732a;
                            return p196y0.d.b(rVar2, d10);
                        case 5:
                            float[] fArr5 = p196y0.d.f31732a;
                            return p196y0.d.d(rVar2, d10);
                        case 6:
                            double d12 = rVar2.f31795e;
                            double d13 = rVar2.f31794d;
                            return d10 >= d12 * d13 ? (java.lang.Math.pow(d10, 1.0d / rVar2.f31791a) - rVar2.f31793c) / rVar2.f31792b : d10 / d13;
                        default:
                            double d14 = rVar2.f31792b;
                            double d15 = rVar2.f31795e;
                            double d16 = rVar2.f31794d;
                            return d10 >= d15 * d16 ? (java.lang.Math.pow(d10 - rVar2.f31796f, 1.0d / rVar2.f31791a) - rVar2.f31793c) / d14 : (d10 - rVar2.g) / d16;
                    }
                }
            };
        }
        if (d4 == -3.0d) {
            final int i13 = 0;
            iVar2 = new p196y0.i() { // from class: y0.o
                @Override // p196y0.i
                public final double c(double d10) {
                    p196y0.r rVar2 = rVar;
                    switch (i13) {
                        case 0:
                            float[] fArr2 = p196y0.d.f31732a;
                            return p196y0.d.a(rVar2, d10);
                        case 1:
                            float[] fArr3 = p196y0.d.f31732a;
                            return p196y0.d.c(rVar2, d10);
                        case 2:
                            return d10 >= rVar2.f31795e ? java.lang.Math.pow((rVar2.f31792b * d10) + rVar2.f31793c, rVar2.f31791a) : d10 * rVar2.f31794d;
                        case 3:
                            double d11 = rVar2.f31792b;
                            if (d10 >= rVar2.f31795e) {
                                return java.lang.Math.pow((d11 * d10) + rVar2.f31793c, rVar2.f31791a) + rVar2.f31796f;
                            }
                            return rVar2.g + (rVar2.f31794d * d10);
                        case 4:
                            float[] fArr4 = p196y0.d.f31732a;
                            return p196y0.d.b(rVar2, d10);
                        case 5:
                            float[] fArr5 = p196y0.d.f31732a;
                            return p196y0.d.d(rVar2, d10);
                        case 6:
                            double d12 = rVar2.f31795e;
                            double d13 = rVar2.f31794d;
                            return d10 >= d12 * d13 ? (java.lang.Math.pow(d10, 1.0d / rVar2.f31791a) - rVar2.f31793c) / rVar2.f31792b : d10 / d13;
                        default:
                            double d14 = rVar2.f31792b;
                            double d15 = rVar2.f31795e;
                            double d16 = rVar2.f31794d;
                            return d10 >= d15 * d16 ? (java.lang.Math.pow(d10 - rVar2.f31796f, 1.0d / rVar2.f31791a) - rVar2.f31793c) / d14 : (d10 - rVar2.g) / d16;
                    }
                }
            };
        } else if (d4 == -2.0d) {
            final int i14 = 1;
            iVar2 = new p196y0.i() { // from class: y0.o
                @Override // p196y0.i
                public final double c(double d10) {
                    p196y0.r rVar2 = rVar;
                    switch (i14) {
                        case 0:
                            float[] fArr2 = p196y0.d.f31732a;
                            return p196y0.d.a(rVar2, d10);
                        case 1:
                            float[] fArr3 = p196y0.d.f31732a;
                            return p196y0.d.c(rVar2, d10);
                        case 2:
                            return d10 >= rVar2.f31795e ? java.lang.Math.pow((rVar2.f31792b * d10) + rVar2.f31793c, rVar2.f31791a) : d10 * rVar2.f31794d;
                        case 3:
                            double d11 = rVar2.f31792b;
                            if (d10 >= rVar2.f31795e) {
                                return java.lang.Math.pow((d11 * d10) + rVar2.f31793c, rVar2.f31791a) + rVar2.f31796f;
                            }
                            return rVar2.g + (rVar2.f31794d * d10);
                        case 4:
                            float[] fArr4 = p196y0.d.f31732a;
                            return p196y0.d.b(rVar2, d10);
                        case 5:
                            float[] fArr5 = p196y0.d.f31732a;
                            return p196y0.d.d(rVar2, d10);
                        case 6:
                            double d12 = rVar2.f31795e;
                            double d13 = rVar2.f31794d;
                            return d10 >= d12 * d13 ? (java.lang.Math.pow(d10, 1.0d / rVar2.f31791a) - rVar2.f31793c) / rVar2.f31792b : d10 / d13;
                        default:
                            double d14 = rVar2.f31792b;
                            double d15 = rVar2.f31795e;
                            double d16 = rVar2.f31794d;
                            return d10 >= d15 * d16 ? (java.lang.Math.pow(d10 - rVar2.f31796f, 1.0d / rVar2.f31791a) - rVar2.f31793c) / d14 : (d10 - rVar2.g) / d16;
                    }
                }
            };
        } else if (d9 == 0.0d && d6 == 0.0d) {
            final int i15 = 2;
            iVar2 = new p196y0.i() { // from class: y0.o
                @Override // p196y0.i
                public final double c(double d10) {
                    p196y0.r rVar2 = rVar;
                    switch (i15) {
                        case 0:
                            float[] fArr2 = p196y0.d.f31732a;
                            return p196y0.d.a(rVar2, d10);
                        case 1:
                            float[] fArr3 = p196y0.d.f31732a;
                            return p196y0.d.c(rVar2, d10);
                        case 2:
                            return d10 >= rVar2.f31795e ? java.lang.Math.pow((rVar2.f31792b * d10) + rVar2.f31793c, rVar2.f31791a) : d10 * rVar2.f31794d;
                        case 3:
                            double d11 = rVar2.f31792b;
                            if (d10 >= rVar2.f31795e) {
                                return java.lang.Math.pow((d11 * d10) + rVar2.f31793c, rVar2.f31791a) + rVar2.f31796f;
                            }
                            return rVar2.g + (rVar2.f31794d * d10);
                        case 4:
                            float[] fArr4 = p196y0.d.f31732a;
                            return p196y0.d.b(rVar2, d10);
                        case 5:
                            float[] fArr5 = p196y0.d.f31732a;
                            return p196y0.d.d(rVar2, d10);
                        case 6:
                            double d12 = rVar2.f31795e;
                            double d13 = rVar2.f31794d;
                            return d10 >= d12 * d13 ? (java.lang.Math.pow(d10, 1.0d / rVar2.f31791a) - rVar2.f31793c) / rVar2.f31792b : d10 / d13;
                        default:
                            double d14 = rVar2.f31792b;
                            double d15 = rVar2.f31795e;
                            double d16 = rVar2.f31794d;
                            return d10 >= d15 * d16 ? (java.lang.Math.pow(d10 - rVar2.f31796f, 1.0d / rVar2.f31791a) - rVar2.f31793c) / d14 : (d10 - rVar2.g) / d16;
                    }
                }
            };
        } else {
            final int i16 = 3;
            iVar2 = new p196y0.i() { // from class: y0.o
                @Override // p196y0.i
                public final double c(double d10) {
                    p196y0.r rVar2 = rVar;
                    switch (i16) {
                        case 0:
                            float[] fArr2 = p196y0.d.f31732a;
                            return p196y0.d.a(rVar2, d10);
                        case 1:
                            float[] fArr3 = p196y0.d.f31732a;
                            return p196y0.d.c(rVar2, d10);
                        case 2:
                            return d10 >= rVar2.f31795e ? java.lang.Math.pow((rVar2.f31792b * d10) + rVar2.f31793c, rVar2.f31791a) : d10 * rVar2.f31794d;
                        case 3:
                            double d11 = rVar2.f31792b;
                            if (d10 >= rVar2.f31795e) {
                                return java.lang.Math.pow((d11 * d10) + rVar2.f31793c, rVar2.f31791a) + rVar2.f31796f;
                            }
                            return rVar2.g + (rVar2.f31794d * d10);
                        case 4:
                            float[] fArr4 = p196y0.d.f31732a;
                            return p196y0.d.b(rVar2, d10);
                        case 5:
                            float[] fArr5 = p196y0.d.f31732a;
                            return p196y0.d.d(rVar2, d10);
                        case 6:
                            double d12 = rVar2.f31795e;
                            double d13 = rVar2.f31794d;
                            return d10 >= d12 * d13 ? (java.lang.Math.pow(d10, 1.0d / rVar2.f31791a) - rVar2.f31793c) / rVar2.f31792b : d10 / d13;
                        default:
                            double d14 = rVar2.f31792b;
                            double d15 = rVar2.f31795e;
                            double d16 = rVar2.f31794d;
                            return d10 >= d15 * d16 ? (java.lang.Math.pow(d10 - rVar2.f31796f, 1.0d / rVar2.f31791a) - rVar2.f31793c) / d14 : (d10 - rVar2.g) / d16;
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, 0.0f, 1.0f, rVar, i3);
    }

    @Override // p196y0.c
    public final float a(int i3) {
        return this.f31781f;
    }

    @Override // p196y0.c
    public final float b(int i3) {
        return this.f31780e;
    }

    @Override // p196y0.c
    public final boolean c() {
        return this.f31790q;
    }

    @Override // p196y0.c
    public final long d(float f9, float f10, float f11) {
        double d4 = f9;
        p196y0.m mVar = this.f31789p;
        float fC = (float) mVar.c(d4);
        float fC2 = (float) mVar.c(f10);
        float fC3 = (float) mVar.c(f11);
        float[] fArr = this.f31783i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f12 = (fArr[6] * fC3) + (fArr[3] * fC2) + (fArr[0] * fC);
        return (((long) java.lang.Float.floatToRawIntBits((fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f12) << 32);
    }

    @Override // p196y0.c
    public final float e(float f9, float f10, float f11) {
        double d4 = f9;
        p196y0.m mVar = this.f31789p;
        float fC = (float) mVar.c(d4);
        float fC2 = (float) mVar.c(f10);
        float fC3 = (float) mVar.c(f11);
        float[] fArr = this.f31783i;
        return (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
    }

    @Override // p196y0.c
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p196y0.q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        p196y0.q qVar = (p196y0.q) obj;
        if (java.lang.Float.compare(qVar.f31780e, this.f31780e) != 0 || java.lang.Float.compare(qVar.f31781f, this.f31781f) != 0 || !kotlin.jvm.internal.m.a(this.f31779d, qVar.f31779d) || !java.util.Arrays.equals(this.f31782h, qVar.f31782h)) {
            return false;
        }
        p196y0.r rVar = qVar.g;
        p196y0.r rVar2 = this.g;
        if (rVar2 != null) {
            return kotlin.jvm.internal.m.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (kotlin.jvm.internal.m.a(this.f31784k, qVar.f31784k)) {
            return kotlin.jvm.internal.m.a(this.f31787n, qVar.f31787n);
        }
        return false;
    }

    @Override // p196y0.c
    public final long f(float f9, float f10, float f11, float f12, p196y0.c cVar) {
        float[] fArr = this.j;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f9);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f9);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f9);
        p196y0.m mVar = this.f31786m;
        return p188x0.z.b((float) mVar.c(f13), (float) mVar.c(f14), (float) mVar.c(f15), f12, cVar);
    }

    @Override // p196y0.c
    public final int hashCode() {
        int iHashCode = (java.util.Arrays.hashCode(this.f31782h) + ((this.f31779d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f9 = this.f31780e;
        int iFloatToIntBits = (iHashCode + (f9 == 0.0f ? 0 : java.lang.Float.floatToIntBits(f9))) * 31;
        float f10 = this.f31781f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f10 == 0.0f ? 0 : java.lang.Float.floatToIntBits(f10))) * 31;
        p196y0.r rVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f31787n.hashCode() + ((this.f31784k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:42:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x0210  */
    /* JADX WARN: Code duplicated, block: B:56:0x0219  */
    /* JADX WARN: Code duplicated, block: B:63:0x022d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0245  */
    /* JADX WARN: Code duplicated, block: B:68:0x025f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0262 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x025f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public q(java.lang.String str, float[] fArr, p196y0.s sVar, float[] fArr2, p196y0.i iVar, p196y0.i iVar2, float f9, float f10, p196y0.r rVar, int i3) {
        int i9;
        char c9;
        float f11;
        float f12;
        boolean z6;
        float[] fArr3;
        p196y0.q qVar;
        double d4;
        int i10;
        super(str, p196y0.b.f31724a, i3);
        int i11 = 0;
        int i12 = 1;
        this.f31779d = sVar;
        this.f31780e = f9;
        this.f31781f = f10;
        this.g = rVar;
        this.f31784k = iVar;
        this.f31785l = new p196y0.p(this, i12);
        this.f31786m = new p196y0.m(this, i11);
        this.f31787n = iVar2;
        this.f31788o = new p196y0.p(this, i11);
        this.f31789p = new p196y0.m(this, i12);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new java.lang.IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f9 < f10) {
            float[] fArr4 = new float[6];
            if (fArr.length == 9) {
                float f13 = fArr[0];
                float f14 = fArr[1];
                float f15 = f13 + f14 + fArr[2];
                fArr4[0] = f13 / f15;
                fArr4[1] = f14 / f15;
                float f16 = fArr[3];
                float f17 = fArr[4];
                float f18 = f16 + f17 + fArr[5];
                fArr4[2] = f16 / f18;
                fArr4[3] = f17 / f18;
                float f19 = fArr[6];
                float f20 = fArr[7];
                float f21 = f19 + f20 + fArr[8];
                fArr4[4] = f19 / f21;
                fArr4[5] = f20 / f21;
            } else {
                java.lang.System.arraycopy(fArr, 0, fArr4, 0, 6);
            }
            this.f31782h = fArr4;
            if (fArr2 == null) {
                float f22 = fArr4[0];
                float f23 = fArr4[1];
                float f24 = fArr4[2];
                float f25 = fArr4[3];
                float f26 = fArr4[4];
                float f27 = fArr4[5];
                f11 = 1.0f;
                float f28 = 1;
                float f29 = (f28 - f22) / f23;
                float f30 = (f28 - f24) / f25;
                float f31 = (f28 - f26) / f27;
                i9 = 0;
                float f32 = sVar.f31797a;
                c9 = 1;
                float f33 = sVar.f31798b;
                float f34 = (f28 - f32) / f33;
                float f35 = f22 / f23;
                float f36 = (f24 / f25) - f35;
                float f37 = (f32 / f33) - f35;
                float f38 = f30 - f29;
                float f39 = (f26 / f27) - f35;
                float f40 = (((f34 - f29) * f36) - (f37 * f38)) / (((f31 - f29) * f36) - (f38 * f39));
                float f41 = (f37 - (f39 * f40)) / f36;
                float f42 = (1.0f - f41) - f40;
                float f43 = f42 / f23;
                float f44 = f41 / f25;
                float f45 = f40 / f27;
                this.f31783i = new float[]{f43 * f22, f42, ((1.0f - f22) - f23) * f43, f44 * f24, f41, ((1.0f - f24) - f25) * f44, f45 * f26, f40, ((1.0f - f26) - f27) * f45};
            } else {
                i9 = 0;
                c9 = 1;
                f11 = 1.0f;
                if (fArr2.length == 9) {
                    this.f31783i = fArr2;
                } else {
                    throw new java.lang.IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.j = p196y0.j.f(this.f31783i);
            float fB = p196y0.j.b(fArr4);
            float[] fArr5 = p196y0.d.f31732a;
            if (fB / p196y0.j.b(p196y0.d.f31733b) > 0.9f) {
                float[] fArr6 = p196y0.d.f31732a;
                float f46 = fArr4[i9];
                float f47 = fArr6[i9];
                float f48 = fArr4[c9];
                float f49 = fArr6[c9];
                float f50 = fArr4[2];
                float f51 = fArr6[2];
                float f52 = fArr4[3];
                float f53 = fArr6[3];
                float f54 = fArr4[4];
                float f55 = fArr6[4];
                float f56 = fArr4[5];
                float f57 = fArr6[5];
                f12 = 0.0f;
                float[] fArr7 = new float[6];
                fArr7[i9] = f46 - f47;
                fArr7[c9] = f48 - f49;
                fArr7[2] = f50 - f51;
                fArr7[3] = f52 - f53;
                fArr7[4] = f54 - f55;
                fArr7[5] = f56 - f57;
                float f58 = fArr7[i9];
                float f59 = fArr7[c9];
                if (((f49 - f57) * f58) - ((f47 - f55) * f59) >= 0.0f && ((f47 - f51) * f59) - ((f49 - f53) * f58) >= 0.0f) {
                    float f60 = fArr7[2];
                    float f61 = fArr7[3];
                    if (((f53 - f49) * f60) - ((f51 - f47) * f61) >= 0.0f && ((f51 - f55) * f61) - ((f53 - f57) * f60) >= 0.0f) {
                        float f62 = fArr7[4];
                        float f63 = fArr7[5];
                        if (((f57 - f53) * f62) - ((f55 - f51) * f63) < 0.0f || ((f55 - f47) * f63) - ((f57 - f49) * f62) < 0.0f) {
                        }
                    }
                }
                if (i3 != 0) {
                    fArr3 = p196y0.d.f31732a;
                    if (fArr4 == fArr3) {
                        i10 = i9;
                        while (true) {
                            if (i10 < 6) {
                                if (java.lang.Float.compare(fArr4[i10], fArr3[i10]) != 0 || java.lang.Math.abs(fArr4[i10] - fArr3[i10]) <= 0.001f) {
                                    i10++;
                                }
                            } else if (p196y0.j.d(sVar, p196y0.j.f31764d)) {
                                float[] fArr8 = p196y0.d.f31732a;
                                qVar = p196y0.d.f31736e;
                                d4 = 0.0d;
                                while (true) {
                                    if (d4 <= 1.0d) {
                                        z6 = c9;
                                    } else if (java.lang.Math.abs(iVar.c(d4) - qVar.f31784k.c(d4)) > 0.001d) {
                                    }
                                    d4 += 0.00392156862745098d;
                                }
                            }
                        }
                    } else if (p196y0.j.d(sVar, p196y0.j.f31764d) && f9 == f12 && f10 == f11) {
                        float[] fArr9 = p196y0.d.f31732a;
                        qVar = p196y0.d.f31736e;
                        d4 = 0.0d;
                        while (true) {
                            if (d4 <= 1.0d) {
                                z6 = c9;
                            } else if (java.lang.Math.abs(iVar.c(d4) - qVar.f31784k.c(d4)) > 0.001d && java.lang.Math.abs(iVar2.c(d4) - qVar.f31787n.c(d4)) <= 0.001d) {
                                d4 += 0.00392156862745098d;
                            }
                        }
                    }
                    z6 = i9;
                } else {
                    z6 = c9;
                }
                this.f31790q = z6;
                return;
            }
            f12 = 0.0f;
            int i13 = (f9 > f12 ? 1 : (f9 == f12 ? 0 : -1));
            if (i3 != 0) {
                fArr3 = p196y0.d.f31732a;
                if (fArr4 == fArr3) {
                    i10 = i9;
                    while (true) {
                        if (i10 < 6) {
                            if (java.lang.Float.compare(fArr4[i10], fArr3[i10]) != 0) {
                            }
                            i10++;
                        } else if (p196y0.j.d(sVar, p196y0.j.f31764d)) {
                            float[] fArr10 = p196y0.d.f31732a;
                            qVar = p196y0.d.f31736e;
                            d4 = 0.0d;
                            while (true) {
                                if (d4 <= 1.0d) {
                                    z6 = c9;
                                } else if (java.lang.Math.abs(iVar.c(d4) - qVar.f31784k.c(d4)) > 0.001d) {
                                }
                                d4 += 0.00392156862745098d;
                            }
                        }
                    }
                } else if (p196y0.j.d(sVar, p196y0.j.f31764d)) {
                    float[] fArr11 = p196y0.d.f31732a;
                    qVar = p196y0.d.f31736e;
                    d4 = 0.0d;
                    while (true) {
                        if (d4 <= 1.0d) {
                            z6 = c9;
                        } else if (java.lang.Math.abs(iVar.c(d4) - qVar.f31784k.c(d4)) > 0.001d) {
                        }
                        d4 += 0.00392156862745098d;
                    }
                }
                z6 = i9;
            } else {
                z6 = c9;
            }
            this.f31790q = z6;
            return;
        }
        throw new java.lang.IllegalArgumentException("Invalid range: min=" + f9 + ", max=" + f10 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(java.lang.String str, float[] fArr, p196y0.s sVar, final double d4, float f9, float f10, int i3) {
        p196y0.i iVar;
        p196y0.i iVar2 = f31778r;
        if (d4 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i9 = 0;
            iVar = new p196y0.i() { // from class: y0.n
                @Override // p196y0.i
                public final double c(double d6) {
                    switch (i9) {
                        case 0:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return java.lang.Math.pow(d6, 1.0d / d4);
                        default:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return java.lang.Math.pow(d6, d4);
                    }
                }
            };
        }
        if (d4 != 1.0d) {
            final int i10 = 1;
            iVar2 = new p196y0.i() { // from class: y0.n
                @Override // p196y0.i
                public final double c(double d6) {
                    switch (i10) {
                        case 0:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return java.lang.Math.pow(d6, 1.0d / d4);
                        default:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return java.lang.Math.pow(d6, d4);
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, f9, f10, new p196y0.r(d4, 1.0d, 0.0d, 0.0d, 0.0d), i3);
    }
}
