package p140q4;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B4.a f26627c = new B4.a(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final javax.crypto.spec.SecretKeySpec f26628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26629b;

    public b(byte[] bArr) throws java.security.GeneralSecurityException {
        if (!p121o0.p.b(2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        B4.w.a(bArr.length);
        this.f26628a = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        this.f26629b = true;
    }

    public static java.security.spec.AlgorithmParameterSpec a(byte[] bArr) {
        int length = bArr.length;
        if ("The Android Project".equals(java.lang.System.getProperty("java.vendor"))) {
            int i3 = p179v4.t.f29193a;
            java.lang.Integer numValueOf = !java.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project") ? null : java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT);
            if ((numValueOf != null ? numValueOf.intValue() : -1) <= 19) {
                return new javax.crypto.spec.IvParameterSpec(bArr, 0, length);
            }
        }
        return new javax.crypto.spec.GCMParameterSpec(128, bArr, 0, length);
    }
}
