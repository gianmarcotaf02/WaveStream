package B4;

/* JADX INFO: loaded from: classes.dex */
public final class c implements o4.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B4.a f683e = new B4.a(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B4.a f684f = new B4.a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final javax.crypto.spec.SecretKeySpec f687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f688d;

    public c(byte[] bArr, int i3) throws java.security.GeneralSecurityException {
        if (!p121o0.p.a(1)) {
            throw new java.security.GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i3 != 12 && i3 != 16) {
            throw new java.lang.IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f688d = i3;
        B4.w.a(bArr.length);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        this.f687c = secretKeySpec;
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) f683e.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrC = c(cipher.doFinal(new byte[16]));
        this.f685a = bArrC;
        this.f686b = c(bArrC);
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i3 = 0;
        while (i3 < 15) {
            int i9 = i3 + 1;
            bArr2[i3] = (byte) (((bArr[i3] << 1) ^ ((bArr[i9] & 255) >>> 7)) & 255);
            i3 = i9;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_E_AC3) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
        }
        return bArr3;
    }

    @Override // o4.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        int i3 = this.f688d;
        if (length > 2147483631 - i3) {
            throw new java.security.GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i3 + 16];
        byte[] bArrA = B4.v.a(i3);
        java.lang.System.arraycopy(bArrA, 0, bArr3, 0, i3);
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) f683e.get();
        javax.crypto.spec.SecretKeySpec secretKeySpec = this.f687c;
        cipher.init(1, secretKeySpec);
        byte[] bArrD = d(cipher, 0, bArrA, 0, bArrA.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrD2 = d(cipher, 1, bArr4, 0, bArr4.length);
        javax.crypto.Cipher cipher2 = (javax.crypto.Cipher) f684f.get();
        cipher2.init(1, secretKeySpec, new javax.crypto.spec.IvParameterSpec(bArrD));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f688d);
        byte[] bArrD3 = d(cipher, 2, bArr3, this.f688d, bArr.length);
        int length2 = bArr.length + i3;
        for (int i9 = 0; i9 < 16; i9++) {
            bArr3[length2 + i9] = (byte) ((bArrD2[i9] ^ bArrD[i9]) ^ bArrD3[i9]);
        }
        return bArr3;
    }

    @Override // o4.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        int i3 = this.f688d;
        int i9 = (length - i3) - 16;
        if (i9 < 0) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) f683e.get();
        javax.crypto.spec.SecretKeySpec secretKeySpec = this.f687c;
        cipher.init(1, secretKeySpec);
        byte[] bArrD = d(cipher, 0, bArr, 0, this.f688d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrD2 = d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrD3 = d(cipher, 2, bArr, this.f688d, i9);
        int length2 = bArr.length - 16;
        byte b9 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b9 = (byte) (b9 | (((bArr[length2 + i10] ^ bArrD2[i10]) ^ bArrD[i10]) ^ bArrD3[i10]));
        }
        if (b9 != 0) {
            throw new javax.crypto.AEADBadTagException("tag mismatch");
        }
        javax.crypto.Cipher cipher2 = (javax.crypto.Cipher) f684f.get();
        cipher2.init(1, secretKeySpec, new javax.crypto.spec.IvParameterSpec(bArrD));
        return cipher2.doFinal(bArr, i3, i9);
    }

    public final byte[] d(javax.crypto.Cipher cipher, int i3, byte[] bArr, int i9, int i10) throws javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException {
        byte[] bArrCopyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i3;
        byte[] bArr3 = this.f685a;
        if (i10 == 0) {
            return cipher.doFinal(e(bArr2, bArr3));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i11 = 0;
        while (i10 - i11 > 16) {
            for (int i12 = 0; i12 < 16; i12++) {
                bArrDoFinal[i12] = (byte) (bArrDoFinal[i12] ^ bArr[(i9 + i11) + i12]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i11 += 16;
        }
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, i11 + i9, i9 + i10);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = e(bArrCopyOfRange, bArr3);
        } else {
            bArrCopyOf = java.util.Arrays.copyOf(this.f686b, 16);
            for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                bArrCopyOf[i13] = (byte) (bArrCopyOf[i13] ^ bArrCopyOfRange[i13]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
        }
        return cipher.doFinal(e(bArrDoFinal, bArrCopyOf));
    }
}
