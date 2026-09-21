package p174u4;

/* JADX INFO: loaded from: classes.dex */
public final class b implements o4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final javax.crypto.SecretKey f28679a;

    public b(java.lang.String str, java.security.KeyStore keyStore) throws java.security.InvalidKeyException {
        javax.crypto.SecretKey secretKey = (javax.crypto.SecretKey) keyStore.getKey(str, null);
        this.f28679a = secretKey;
        if (secretKey == null) {
            throw new java.security.InvalidKeyException(p121o0.p.C("Keystore cannot load the key with ID: ", str));
        }
    }

    @Override // o4.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return d(bArr, bArr2);
        } catch (java.security.GeneralSecurityException | java.security.ProviderException e6) {
            android.util.Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e6);
            try {
                java.lang.Thread.sleep((int) (java.lang.Math.random() * 100.0d));
            } catch (java.lang.InterruptedException unused) {
            }
            return d(bArr, bArr2);
        }
    }

    @Override // o4.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr.length < 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        try {
            return c(bArr, bArr2);
        } catch (java.security.ProviderException e6) {
            e = e6;
            android.util.Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                java.lang.Thread.sleep((int) (java.lang.Math.random() * 100.0d));
            } catch (java.lang.InterruptedException unused) {
            }
            return c(bArr, bArr2);
        } catch (javax.crypto.AEADBadTagException e9) {
            throw e9;
        } catch (java.security.GeneralSecurityException e10) {
            e = e10;
            android.util.Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e);
            java.lang.Thread.sleep((int) (java.lang.Math.random() * 100.0d));
            return c(bArr, bArr2);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        javax.crypto.spec.GCMParameterSpec gCMParameterSpec = new javax.crypto.spec.GCMParameterSpec(128, bArr, 0, 12);
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f28679a, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    public final byte[] d(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.f28679a);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        java.lang.System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }
}
