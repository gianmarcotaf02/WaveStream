package p113n1;

/* JADX INFO: loaded from: classes.dex */
public interface c {
    default long G(float f9) {
        return l(N(f9));
    }

    default float K(int i3) {
        return i3 / getDensity();
    }

    default float N(float f9) {
        return f9 / getDensity();
    }

    float S();

    default float Y(float f9) {
        return getDensity() * f9;
    }

    float getDensity();

    default int k0(float f9) {
        float fY = Y(f9);
        return java.lang.Float.isInfinite(fY) ? androidx.media3.common.util.Log.LOG_LEVEL_OFF : java.lang.Math.round(fY);
    }

    default long l(float f9) {
        float[] fArr = p122o1.b.f26041a;
        if (!(S() >= 1.03f)) {
            return com.google.common.util.concurrent.D.C(4294967296L, f9 / S());
        }
        p122o1.a aVarA = p122o1.b.a(S());
        return com.google.common.util.concurrent.D.C(4294967296L, aVarA != null ? aVarA.a(f9) : f9 / S());
    }

    default long m(long j) {
        if (j != 9205357640488583168L) {
            return com.google.crypto.tink.shaded.protobuf.q0.a(N(java.lang.Float.intBitsToFloat((int) (j >> 32))), N(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default long o0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fY = Y(java.lang.Float.intBitsToFloat((int) (j >> 32)));
        return (((long) java.lang.Float.floatToRawIntBits(Y(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fY) << 32);
    }

    default float s0(long j) {
        if (!p113n1.q.a(p113n1.p.b(j), 4294967296L)) {
            p113n1.j.b("Only Sp can convert to Px");
        }
        return Y(t(j));
    }

    default float t(long j) {
        float fC;
        float fS;
        if (!p113n1.q.a(p113n1.p.b(j), 4294967296L)) {
            p113n1.j.b("Only Sp can convert to Px");
        }
        float[] fArr = p122o1.b.f26041a;
        if (S() >= 1.03f) {
            p122o1.a aVarA = p122o1.b.a(S());
            fC = p113n1.p.c(j);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fS = S();
        } else {
            fC = p113n1.p.c(j);
            fS = S();
        }
        return fS * fC;
    }
}
