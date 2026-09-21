package B4;

/* JADX INFO: loaded from: classes.dex */
public final class b implements B4.r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B4.a f679d = new B4.a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final javax.crypto.spec.SecretKeySpec f680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f682c;

    public b(byte[] bArr, int i3) throws java.security.GeneralSecurityException {
        if (!p121o0.p.b(2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        B4.w.a(bArr.length);
        this.f680a = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        int blockSize = ((javax.crypto.Cipher) f679d.get()).getBlockSize();
        this.f682c = blockSize;
        if (i3 < 12 || i3 > blockSize) {
            throw new java.security.GeneralSecurityException("invalid IV size");
        }
        this.f681b = i3;
    }

    public final void a(byte[] bArr, int i3, int i9, byte[] bArr2, int i10, byte[] bArr3, boolean z6) throws java.security.GeneralSecurityException {
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) f679d.get();
        byte[] bArr4 = new byte[this.f682c];
        java.lang.System.arraycopy(bArr3, 0, bArr4, 0, this.f681b);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr4);
        javax.crypto.spec.SecretKeySpec secretKeySpec = this.f680a;
        if (z6) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i3, i9, bArr2, i10) != i9) {
            throw new java.security.GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
