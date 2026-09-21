package p188x0;

import Y6.f;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import p136q.w;
import p196y0.c;
import p196y0.d;
import p196y0.g;
import p196y0.h;
import p196y0.j;

public final class C3098s {

    public static final long f31123b = z.d(4278190080L);

    public static final long f31124c;

    public static final long f31125d;

    public static final long f31126e;

    public static final long f31127f;
    public static final long g;

    public static final int f31128h = 0;

    public final long f31129a;

    static {
        z.d(4282664004L);
        z.d(4287137928L);
        z.d(4291611852L);
        f31124c = z.d(4294967295L);
        f31125d = z.d(4294901760L);
        z.d(4278255360L);
        f31126e = z.d(4278190335L);
        z.d(4294967040L);
        z.d(4278255615L);
        z.d(4294902015L);
        f31127f = z.c(0);
        g = z.b(0.0f, 0.0f, 0.0f, 0.0f, d.f31750u);
    }

    public C3098s(long j) {
        this.f31129a = j;
    }

    public static final C3098s a(long j) {
        return new C3098s(j);
    }

    public static final long b(long j, c cVar) {
        g gVarE;
        c cVarG = g(j);
        int i3 = cVarG.f31731c;
        int i9 = cVar.f31731c;
        if ((i3 | i9) < 0) {
            gVarE = j.e(cVarG, cVar);
        } else {
            w wVar = h.f31760a;
            int i10 = i3 | (i9 << 6);
            Object objB = wVar.b(i10);
            if (objB == null) {
                objB = j.e(cVarG, cVar);
                wVar.h(i10, objB);
            }
            gVarE = (g) objB;
        }
        return gVarE.a(j);
    }

    public static long c(long j, float f9) {
        return z.b(i(j), h(j), f(j), f9, g(j));
    }

    public static final boolean d(long j, long j9) {
        return j == j9;
    }

    public static final float e(long j) {
        float fK0;
        float f9;
        if ((63 & j) == 0) {
            fK0 = (float) AbstractC1909d.k0((j >>> 56) & 255);
            f9 = 255.0f;
        } else {
            fK0 = (float) AbstractC1909d.k0((j >>> 6) & 1023);
            f9 = 1023.0f;
        }
        return fK0 / f9;
    }

    public static final float f(long j) {
        int i3;
        int i9;
        int i10;
        if ((63 & j) == 0) {
            return ((float) AbstractC1909d.k0((j >>> 32) & 255)) / 255.0f;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i13 + 1056964608) - w.f31132a;
                return i11 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i10 = 0;
            i9 = 0;
        }
        return Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i9);
    }

    public static final c g(long j) {
        float[] fArr = d.f31732a;
        return d.y[(int) (j & 63)];
    }

    public static final float h(long j) {
        int i3;
        int i9;
        int i10;
        if ((63 & j) == 0) {
            return ((float) AbstractC1909d.k0((j >>> 40) & 255)) / 255.0f;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i13 + 1056964608) - w.f31132a;
                return i11 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i10 = 0;
            i9 = 0;
        }
        return Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i9);
    }

    public static final float i(long j) {
        int i3;
        int i9;
        int i10;
        if ((63 & j) == 0) {
            return ((float) AbstractC1909d.k0((j >>> 48) & 255)) / 255.0f;
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
                float fIntBitsToFloat = Float.intBitsToFloat(i13 + 1056964608) - w.f31132a;
                return i11 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i10 = 0;
            i9 = 0;
        }
        return Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i9);
    }

    public static String j(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(i(j));
        sb.append(", ");
        sb.append(h(j));
        sb.append(", ");
        sb.append(f(j));
        sb.append(", ");
        sb.append(e(j));
        sb.append(", ");
        return f.l(sb, g(j).f31729a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3098s) {
            return this.f31129a == ((C3098s) obj).f31129a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31129a);
    }

    public final String toString() {
        return j(this.f31129a);
    }
}
