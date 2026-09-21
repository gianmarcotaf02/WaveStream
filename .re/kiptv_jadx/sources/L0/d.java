package L0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L0.c f7047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L0.a[] f7049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f7051f;
    public final float[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f7052h;

    public d(boolean z6, L0.c cVar) {
        int i3;
        this.f7046a = z6;
        this.f7047b = cVar;
        if (z6 && cVar.equals(L0.c.f7044h)) {
            throw new java.lang.IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            i3 = 3;
        } else {
            if (iOrdinal != 1) {
                throw new I3.b();
            }
            i3 = 2;
        }
        this.f7048c = i3;
        this.f7049d = new L0.a[20];
        this.f7051f = new float[20];
        this.g = new float[20];
        this.f7052h = new float[3];
    }

    public final void a(long j, float f9) {
        int i3 = (this.f7050e + 1) % 20;
        this.f7050e = i3;
        L0.a[] aVarArr = this.f7049d;
        L0.a aVar = aVarArr[i3];
        if (aVar != null) {
            aVar.f7039a = j;
            aVar.f7040b = f9;
        } else {
            L0.a aVar2 = new L0.a();
            aVar2.f7039a = j;
            aVar2.f7040b = f9;
            aVarArr[i3] = aVar2;
        }
    }

    public final float b(float f9) {
        L0.c cVar;
        float[] fArr;
        float[] fArr2;
        float f10;
        boolean z6;
        int i3;
        float fSignum;
        float f11 = f9;
        float f12 = 0.0f;
        if (f11 <= 0.0f) {
            N0.a.b("maximumVelocity should be a positive value. You specified=" + f11);
        }
        int i9 = this.f7050e;
        L0.a[] aVarArr = this.f7049d;
        L0.a aVar = aVarArr[i9];
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            int i10 = 0;
            L0.a aVar2 = aVar;
            while (true) {
                L0.a aVar3 = aVarArr[i9];
                boolean z9 = this.f7046a;
                cVar = this.f7047b;
                fArr = this.f7051f;
                fArr2 = this.g;
                if (aVar3 == null) {
                    f10 = f12;
                    z6 = z9;
                    i3 = 1;
                    break;
                }
                long j = aVar.f7039a;
                f10 = f12;
                int i11 = i9;
                long j9 = aVar3.f7039a;
                float f13 = j - j9;
                z6 = z9;
                i3 = 1;
                float fAbs = java.lang.Math.abs(j9 - aVar2.f7039a);
                aVar2 = (cVar == L0.c.f7044h || z6) ? aVar3 : aVar;
                if (f13 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i10] = aVar3.f7040b;
                fArr2[i10] = -f13;
                i9 = (i11 == 0 ? 20 : i11) - 1;
                i10++;
                if (i10 >= 20) {
                    break;
                }
                f12 = f10;
            }
            if (i10 >= this.f7048c) {
                int iOrdinal = cVar.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.f7052h;
                        E6.G.K(fArr2, fArr, i10, fArr3);
                        fSignum = fArr3[1];
                    } catch (java.lang.IllegalArgumentException unused) {
                        fSignum = f10;
                    }
                } else {
                    if (iOrdinal != i3) {
                        throw new I3.b();
                    }
                    int i12 = i10 - i3;
                    float f14 = fArr2[i12];
                    int i13 = i12;
                    float fAbs2 = f10;
                    while (i13 > 0) {
                        int i14 = i13 - 1;
                        float f15 = fArr2[i14];
                        if (f14 != f15) {
                            float f16 = (z6 ? -fArr[i14] : fArr[i13] - fArr[i14]) / (f14 - f15);
                            fAbs2 += java.lang.Math.abs(f16) * (f16 - (java.lang.Math.signum(fAbs2) * ((float) java.lang.Math.sqrt(java.lang.Math.abs(fAbs2) * 2))));
                            if (i13 == i12) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i13--;
                        f14 = f15;
                    }
                    fSignum = java.lang.Math.signum(fAbs2) * ((float) java.lang.Math.sqrt(java.lang.Math.abs(fAbs2) * 2));
                }
                f12 = fSignum * 1000;
            } else {
                f12 = f10;
            }
        }
        if (f12 == f10 || java.lang.Float.isNaN(f12)) {
            return f10;
        }
        if (f12 <= f10) {
            f11 = -f11;
            if (f12 >= f11) {
                return f12;
            }
        } else if (f12 <= f11) {
            f11 = f12;
        }
        return f11;
    }

    public /* synthetic */ d() {
        this(false, L0.c.f7044h);
    }

    public d(int i3) {
        this(true, L0.c.f7045i);
    }
}
