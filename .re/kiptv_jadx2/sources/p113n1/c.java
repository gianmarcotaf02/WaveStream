package p113n1;

import androidx.media3.common.util.Log;
import com.google.common.util.concurrent.D;
import com.google.crypto.tink.shaded.protobuf.q0;
import p122o1.a;
import p122o1.b;

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
        return Float.isInfinite(fY) ? Log.LOG_LEVEL_OFF : Math.round(fY);
    }

    default long l(float f9) {
        float[] fArr = b.f26041a;
        if (!(S() >= 1.03f)) {
            return D.C(4294967296L, f9 / S());
        }
        a aVarA = b.a(S());
        return D.C(4294967296L, aVarA != null ? aVarA.a(f9) : f9 / S());
    }

    default long m(long j) {
        if (j != 9205357640488583168L) {
            return q0.a(N(Float.intBitsToFloat((int) (j >> 32))), N(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default long o0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fY = Y(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Float.floatToRawIntBits(Y(Float.intBitsToFloat((int) (j & 4294967295L))))) & 4294967295L) | (Float.floatToRawIntBits(fY) << 32);
    }

    default float s0(long j) {
        if (!q.a(p.b(j), 4294967296L)) {
            j.b("Only Sp can convert to Px");
        }
        return Y(t(j));
    }

    default float t(long j) {
        float fC;
        float fS;
        if (!q.a(p.b(j), 4294967296L)) {
            j.b("Only Sp can convert to Px");
        }
        float[] fArr = b.f26041a;
        if (S() >= 1.03f) {
            a aVarA = b.a(S());
            fC = p.c(j);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fS = S();
        } else {
            fC = p.c(j);
            fS = S();
        }
        return fS * fC;
    }
}
