package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class AesFlushingCipher {
    private final int blockSize;
    private final javax.crypto.Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int i3, byte[] bArr, java.lang.String str, long j) {
        this(i3, bArr, getFNV64Hash(str), j);
    }

    private static long getFNV64Hash(java.lang.String str) {
        long j = 0;
        if (str == null) {
            return 0L;
        }
        for (int i3 = 0; i3 < str.length(); i3++) {
            long jCharAt = j ^ ((long) str.charAt(i3));
            j = jCharAt + (jCharAt << 1) + (jCharAt << 4) + (jCharAt << 5) + (jCharAt << 7) + (jCharAt << 8) + (jCharAt << 40);
        }
        return j;
    }

    private byte[] getInitializationVector(long j, long j9) {
        return java.nio.ByteBuffer.allocate(16).putLong(j).putLong(j9).array();
    }

    private int nonFlushingUpdate(byte[] bArr, int i3, int i9, byte[] bArr2, int i10) {
        try {
            return this.cipher.update(bArr, i3, i9, bArr2, i10);
        } catch (javax.crypto.ShortBufferException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    public void update(byte[] bArr, int i3, int i9, byte[] bArr2, int i10) {
        int i11 = i3;
        int i12 = i9;
        int i13 = i10;
        do {
            int i14 = this.pendingXorBytes;
            if (i14 <= 0) {
                int iNonFlushingUpdate = nonFlushingUpdate(bArr, i11, i12, bArr2, i13);
                if (i12 == iNonFlushingUpdate) {
                    return;
                }
                int i15 = i12 - iNonFlushingUpdate;
                int i16 = 0;
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(i15 < this.blockSize);
                int i17 = i13 + iNonFlushingUpdate;
                int i18 = this.blockSize - i15;
                this.pendingXorBytes = i18;
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(nonFlushingUpdate(this.zerosBlock, 0, i18, this.flushedBlock, 0) == this.blockSize);
                while (i16 < i15) {
                    bArr2[i17] = this.flushedBlock[i16];
                    i16++;
                    i17++;
                }
                return;
            }
            bArr2[i13] = (byte) (bArr[i11] ^ this.flushedBlock[this.blockSize - i14]);
            i13++;
            i11++;
            this.pendingXorBytes = i14 - 1;
            i12--;
        } while (i12 != 0);
    }

    public void updateInPlace(byte[] bArr, int i3, int i9) {
        update(bArr, i3, i9, bArr, i3);
    }

    public AesFlushingCipher(int i3, byte[] bArr, long j, long j9) {
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CTR/NoPadding");
            this.cipher = cipher;
            int blockSize = cipher.getBlockSize();
            this.blockSize = blockSize;
            this.zerosBlock = new byte[blockSize];
            this.flushedBlock = new byte[blockSize];
            long j10 = j9 / ((long) blockSize);
            int i9 = (int) (j9 % ((long) blockSize));
            cipher.init(i3, new javax.crypto.spec.SecretKeySpec(bArr, androidx.media3.common.util.Util.splitAtFirst(cipher.getAlgorithm(), "/")[0]), new javax.crypto.spec.IvParameterSpec(getInitializationVector(j, j10)));
            if (i9 != 0) {
                updateInPlace(new byte[i9], 0, i9);
            }
        } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }
}
