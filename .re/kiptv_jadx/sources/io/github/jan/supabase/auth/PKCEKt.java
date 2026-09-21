package io.github.jan.supabase.auth;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"generateCodeVerifier", "", "generateCodeChallenge", "codeVerifier", "auth-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PKCEKt {
    public static final java.lang.String generateCodeChallenge(java.lang.String codeVerifier) throws java.security.NoSuchAlgorithmException {
        kotlin.jvm.internal.m.e(codeVerifier, "codeVerifier");
        M8.C0685m c0685m = M8.C0685m.f7261k;
        M8.C0685m c0685mC = B3.o.q(O7.x.p0(codeVerifier), -1234567890).c("SHA-256");
        p168t6.c.f28521c.getClass();
        return O7.x.w0(p168t6.c.b(p168t6.c.f28523e, c0685mC.q()), "=", "");
    }

    public static final java.lang.String generateCodeVerifier() {
        byte[] bArr = new byte[64];
        new O8.a().nextBytes(bArr);
        p168t6.c.f28521c.getClass();
        return p168t6.c.b(p168t6.c.f28523e, bArr);
    }
}
