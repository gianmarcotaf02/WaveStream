package p149r4;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B4.a f26857b = new B4.a(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final javax.crypto.spec.SecretKeySpec f26858a;

    public a(byte[] bArr) throws java.security.InvalidAlgorithmParameterException {
        B4.w.a(bArr.length);
        this.f26858a = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
    }

    public static java.security.spec.AlgorithmParameterSpec c(byte[] bArr, int i3) throws java.security.GeneralSecurityException {
        try {
            java.lang.Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new javax.crypto.spec.GCMParameterSpec(128, bArr, 0, i3);
        } catch (java.lang.ClassNotFoundException unused) {
            if ("The Android Project".equals(java.lang.System.getProperty("java.vendor"))) {
                return new javax.crypto.spec.IvParameterSpec(bArr, 0, i3);
            }
            throw new java.security.GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // o4.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrA = B4.v.a(12);
        java.lang.System.arraycopy(bArrA, 0, bArr3, 0, 12);
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpecC = c(bArrA, bArrA.length);
        B4.a aVar = f26857b;
        ((javax.crypto.Cipher) aVar.get()).init(1, this.f26858a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((javax.crypto.Cipher) aVar.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((javax.crypto.Cipher) aVar.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new java.security.GeneralSecurityException(Y6.f.f(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // o4.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr.length < 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpecC = c(bArr, 12);
        B4.a aVar = f26857b;
        ((javax.crypto.Cipher) aVar.get()).init(2, this.f26858a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((javax.crypto.Cipher) aVar.get()).updateAAD(bArr2);
        }
        return ((javax.crypto.Cipher) aVar.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
