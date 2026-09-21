package p140q4;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f26626a = c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void a(int i3, int i9, int i10, int i11, int[] iArr) {
        int i12 = iArr[i3] + iArr[i9];
        iArr[i3] = i12;
        int i13 = i12 ^ iArr[i11];
        int i14 = (i13 >>> (-16)) | (i13 << 16);
        iArr[i11] = i14;
        int i15 = iArr[i10] + i14;
        iArr[i10] = i15;
        int i16 = iArr[i9] ^ i15;
        int i17 = (i16 >>> (-12)) | (i16 << 12);
        iArr[i9] = i17;
        int i18 = iArr[i3] + i17;
        iArr[i3] = i18;
        int i19 = iArr[i11] ^ i18;
        int i20 = (i19 >>> (-8)) | (i19 << 8);
        iArr[i11] = i20;
        int i21 = iArr[i10] + i20;
        iArr[i10] = i21;
        int i22 = iArr[i9] ^ i21;
        iArr[i9] = (i22 >>> (-7)) | (i22 << 7);
    }

    public static void b(int[] iArr) {
        for (int i3 = 0; i3 < 10; i3++) {
            a(0, 4, 8, 12, iArr);
            a(1, 5, 9, 13, iArr);
            a(2, 6, 10, 14, iArr);
            a(3, 7, 11, 15, iArr);
            a(0, 5, 10, 15, iArr);
            a(1, 6, 11, 12, iArr);
            a(2, 7, 8, 13, iArr);
            a(3, 4, 9, 14, iArr);
        }
    }

    public static int[] c(byte[] bArr) {
        java.nio.IntBuffer intBufferAsIntBuffer = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
