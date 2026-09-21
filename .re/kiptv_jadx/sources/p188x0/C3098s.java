package p188x0;

/* JADX INFO: renamed from: x0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3098s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f31123b = p188x0.z.d(4278190080L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f31124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f31125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f31126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f31127f;
    public static final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f31128h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31129a;

    static {
        p188x0.z.d(4282664004L);
        p188x0.z.d(4287137928L);
        p188x0.z.d(4291611852L);
        f31124c = p188x0.z.d(4294967295L);
        f31125d = p188x0.z.d(4294901760L);
        p188x0.z.d(4278255360L);
        f31126e = p188x0.z.d(4278190335L);
        p188x0.z.d(4294967040L);
        p188x0.z.d(4278255615L);
        p188x0.z.d(4294902015L);
        f31127f = p188x0.z.c(0);
        g = p188x0.z.b(0.0f, 0.0f, 0.0f, 0.0f, p196y0.d.f31750u);
    }

    public /* synthetic */ C3098s(long j) {
        this.f31129a = j;
    }

    public static final /* synthetic */ p188x0.C3098s a(long j) {
        return new p188x0.C3098s(j);
    }

    public static final long b(long j, p196y0.c cVar) {
        p196y0.g gVarE;
        p196y0.c cVarG = g(j);
        int i3 = cVarG.f31731c;
        int i9 = cVar.f31731c;
        if ((i3 | i9) < 0) {
            gVarE = p196y0.j.e(cVarG, cVar);
        } else {
            p136q.w wVar = p196y0.h.f31760a;
            int i10 = i3 | (i9 << 6);
            java.lang.Object objB = wVar.b(i10);
            if (objB == null) {
                objB = p196y0.j.e(cVarG, cVar);
                wVar.h(i10, objB);
            }
            gVarE = (p196y0.g) objB;
        }
        return gVarE.a(j);
    }

    public static long c(long j, float f9) {
        return p188x0.z.b(i(j), h(j), f(j), f9, g(j));
    }

    public static final boolean d(long j, long j9) {
        return j == j9;
    }

    public static final float e(long j) {
        float fK0;
        float f9;
        if ((63 & j) == 0) {
            fK0 = (float) com.google.crypto.tink.shaded.protobuf.AbstractC1909d.k0((j >>> 56) & 255);
            f9 = 255.0f;
        } else {
            fK0 = (float) com.google.crypto.tink.shaded.protobuf.AbstractC1909d.k0((j >>> 6) & 1023);
            f9 = 1023.0f;
        }
        return fK0 / f9;
    }

    public static final float f(long j) {
        int i3;
        int i9;
        int i10;
        if ((63 & j) == 0) {
            return ((float) com.google.crypto.tink.shaded.protobuf.AbstractC1909d.k0((j >>> 32) & 255)) / 255.0f;
        }
        short s9 = (short) ((j >>> 16) & 65535);
        int i11 = Short.MIN_VALUE & s9;
        int i12 = ((65535 & s9) >>> 10) & 31;
        int i13 = s9 & 1023;
        if (i12 != 0) {
            int i14 = i13 << 13;
            if (i12 == 31) {
                i3 = 255;
                if (i14 != 0) {
                    i14 |= 4194304;
                }
            } else {
                i3 = i12 + 112;
            }
            int i15 = i3;
            i9 = i14;
            i10 = i15;
        } else {
            if (i13 != 0) {
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i13 + 1056964608) - p188x0.w.f31132a;
                return i11 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i10 = 0;
            i9 = 0;
        }
        return java.lang.Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i9);
    }

    public static final p196y0.c g(long j) {
        float[] fArr = p196y0.d.f31732a;
        return p196y0.d.y[(int) (j & 63)];
    }

    public static final float h(long j) {
        int i3;
        int i9;
        int i10;
        if ((63 & j) == 0) {
            return ((float) com.google.crypto.tink.shaded.protobuf.AbstractC1909d.k0((j >>> 40) & 255)) / 255.0f;
        }
        short s9 = (short) ((j >>> 32) & 65535);
        int i11 = Short.MIN_VALUE & s9;
        int i12 = ((65535 & s9) >>> 10) & 31;
        int i13 = s9 & 1023;
        if (i12 != 0) {
            int i14 = i13 << 13;
            if (i12 == 31) {
                i3 = 255;
                if (i14 != 0) {
                    i14 |= 4194304;
                }
            } else {
                i3 = i12 + 112;
            }
            int i15 = i3;
            i9 = i14;
            i10 = i15;
        } else {
            if (i13 != 0) {
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i13 + 1056964608) - p188x0.w.f31132a;
                return i11 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i10 = 0;
            i9 = 0;
        }
        return java.lang.Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i9);
    }

    public static final float i(long j) {
        int i3;
        int i9;
        int i10;
        if ((63 & j) == 0) {
            return ((float) com.google.crypto.tink.shaded.protobuf.AbstractC1909d.k0((j >>> 48) & 255)) / 255.0f;
        }
        short s9 = (short) ((j >>> 48) & 65535);
        int i11 = Short.MIN_VALUE & s9;
        int i12 = ((65535 & s9) >>> 10) & 31;
        int i13 = s9 & 1023;
        if (i12 != 0) {
            int i14 = i13 << 13;
            if (i12 == 31) {
                i3 = 255;
                if (i14 != 0) {
                    i14 |= 4194304;
                }
            } else {
                i3 = i12 + 112;
            }
            int i15 = i3;
            i9 = i14;
            i10 = i15;
        } else {
            if (i13 != 0) {
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i13 + 1056964608) - p188x0.w.f31132a;
                return i11 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i10 = 0;
            i9 = 0;
        }
        return java.lang.Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i9);
    }

    public static java.lang.String j(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Color(");
        sb.append(i(j));
        sb.append(", ");
        sb.append(h(j));
        sb.append(", ");
        sb.append(f(j));
        sb.append(", ");
        sb.append(e(j));
        sb.append(", ");
        return Y6.f.l(sb, g(j).f31729a, ')');
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p188x0.C3098s) {
            return this.f31129a == ((p188x0.C3098s) obj).f31129a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f31129a);
    }

    public final java.lang.String toString() {
        return j(this.f31129a);
    }
}
