package io.github.jan.supabase.auth;

import B3.o;
import M8.C0685m;
import O7.x;
import androidx.media3.container.NalUnitUtil;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p168t6.c;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"generateCodeVerifier", "", "generateCodeChallenge", "codeVerifier", "auth-kt_release"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PKCEKt {
    public static final String generateCodeChallenge(String codeVerifier) throws NoSuchAlgorithmException {
        m.e(codeVerifier, "codeVerifier");
        C0685m c0685m = C0685m.f7261k;
        C0685m c0685mC = o.q(x.p0(codeVerifier), -1234567890).c("SHA-256");
        c.f28521c.getClass();
        return x.w0(c.b(c.f28523e, c0685mC.q()), "=", "");
    }

    public static final String generateCodeVerifier() {
        byte[] bArr = new byte[64];
        new O8.a().nextBytes(bArr);
        c.f28521c.getClass();
        return c.b(c.f28523e, bArr);
    }
}
