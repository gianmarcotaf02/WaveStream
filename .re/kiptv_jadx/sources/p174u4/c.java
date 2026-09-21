package p174u4;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f28680b = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.security.KeyStore f28681a;

    public c() {
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f28681a = keyStore;
        } catch (java.io.IOException | java.security.GeneralSecurityException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    public static boolean a(java.lang.String str) {
        p174u4.c cVar = new p174u4.c();
        synchronized (f28680b) {
            try {
                if (cVar.d(str)) {
                    return false;
                }
                b(str);
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static void b(java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidAlgorithmParameterException {
        java.lang.String strB = B4.w.b(str);
        javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new android.security.keystore.KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized p174u4.b c(java.lang.String str) {
        p174u4.b bVar;
        bVar = new p174u4.b(B4.w.b(str), this.f28681a);
        byte[] bArrA = B4.v.a(10);
        byte[] bArr = new byte[0];
        if (!java.util.Arrays.equals(bArrA, bVar.b(bVar.a(bArrA, bArr), bArr))) {
            throw new java.security.KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return bVar;
    }

    public final synchronized boolean d(java.lang.String str) {
        java.lang.String strB;
        strB = B4.w.b(str);
        try {
        } catch (java.lang.NullPointerException unused) {
            android.util.Log.w("c", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    java.lang.Thread.sleep((int) (java.lang.Math.random() * 40.0d));
                } catch (java.lang.InterruptedException unused2) {
                }
                java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
                this.f28681a = keyStore;
                keyStore.load(null);
                return this.f28681a.containsAlias(strB);
            } catch (java.io.IOException e6) {
                throw new java.security.GeneralSecurityException(e6);
            }
        }
        return this.f28681a.containsAlias(strB);
    }
}
