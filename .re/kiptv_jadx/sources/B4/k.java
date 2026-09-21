package B4;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B4.j f704a = new B4.j(new android.support.v4.media.session.q(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 1), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f705b = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f706c = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f707d = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f708e = {67108863, 33554431};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f709f = {26, 25};

    public static boolean a(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        l(jArr2);
        byte[] bArrD = d(jArr2);
        for (int i3 = 0; i3 < 32; i3++) {
            if (bArrD[i3] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void b(B4.j jVar, B4.j jVar2, B4.h hVar) {
        long[] jArr = new long[10];
        android.support.v4.media.session.q qVar = jVar.f702a;
        long[] jArr2 = (long[]) qVar.f15617i;
        android.support.v4.media.session.q qVar2 = jVar2.f702a;
        q(jArr2, (long[]) qVar2.j, (long[]) qVar2.f15617i);
        p((long[]) qVar.j, (long[]) qVar2.j, (long[]) qVar2.f15617i);
        long[] jArr3 = hVar.f699b;
        long[] jArr4 = (long[]) qVar.j;
        j(jArr4, jArr4, jArr3);
        long[] jArr5 = hVar.f698a;
        long[] jArr6 = (long[]) qVar.f15618k;
        long[] jArr7 = (long[]) qVar.f15617i;
        j(jArr6, jArr7, jArr5);
        long[] jArr8 = hVar.f700c;
        long[] jArr9 = jVar.f703b;
        j(jArr9, jVar2.f703b, jArr8);
        hVar.a(jArr7, (long[]) qVar2.f15618k);
        q(jArr, jArr7, jArr7);
        p(jArr7, jArr6, jArr4);
        q(jArr4, jArr6, jArr4);
        q(jArr6, jArr, jArr9);
        p(jArr9, jArr, jArr9);
    }

    public static byte[] c(byte[]... bArr) throws java.security.GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > androidx.media3.common.util.Log.LOG_LEVEL_OFF - bArr2.length) {
                throw new java.security.GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            java.lang.System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static byte[] d(long[] jArr) {
        int[] iArr;
        int i3;
        int[] iArr2;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, 10);
        int i9 = 0;
        int i10 = 0;
        while (true) {
            iArr = f709f;
            if (i10 >= 2) {
                break;
            }
            int i11 = 0;
            while (i11 < 9) {
                long j = jArrCopyOf[i11];
                int i12 = iArr[i11 & 1];
                int i13 = -((int) (((j >> 31) & j) >> i12));
                jArrCopyOf[i11] = j + ((long) (i13 << i12));
                i11++;
                jArrCopyOf[i11] = jArrCopyOf[i11] - ((long) i13);
            }
            long j9 = jArrCopyOf[9];
            int i14 = -((int) (((j9 >> 31) & j9) >> 25));
            jArrCopyOf[9] = j9 + ((long) (i14 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - ((long) (i14 * 19));
            i10++;
        }
        long j10 = jArrCopyOf[0];
        int i15 = -((int) (((j10 >> 31) & j10) >> 26));
        jArrCopyOf[0] = j10 + ((long) (i15 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i15);
        int i16 = 0;
        while (true) {
            iArr2 = f708e;
            if (i16 >= 2) {
                break;
            }
            int i17 = i9;
            while (i17 < 9) {
                long j11 = jArrCopyOf[i17];
                int i18 = i17 & 1;
                int i19 = i9;
                int i20 = (int) (j11 >> iArr[i18]);
                jArrCopyOf[i17] = j11 & ((long) iArr2[i18]);
                i17++;
                jArrCopyOf[i17] = jArrCopyOf[i17] + ((long) i20);
                i9 = i19;
                i16 = i16;
            }
            i16++;
        }
        int i21 = i9;
        long j12 = jArrCopyOf[9];
        jArrCopyOf[9] = j12 & 33554431;
        long j13 = jArrCopyOf[i21] + ((long) (((int) (j12 >> 25)) * 19));
        jArrCopyOf[i21] = j13;
        int i22 = ~((((int) j13) - 67108845) >> 31);
        for (int i23 = 1; i23 < 10; i23++) {
            int i24 = ~(((int) jArrCopyOf[i23]) ^ iArr2[i23 & 1]);
            int i25 = i24 & (i24 << 16);
            int i26 = i25 & (i25 << 8);
            int i27 = i26 & (i26 << 4);
            int i28 = i27 & (i27 << 2);
            i22 &= (i28 & (i28 << 1)) >> 31;
        }
        jArrCopyOf[i21] = jArrCopyOf[i21] - ((long) (67108845 & i22));
        long j14 = 33554431 & i22;
        jArrCopyOf[1] = jArrCopyOf[1] - j14;
        for (i3 = 2; i3 < 10; i3 += 2) {
            jArrCopyOf[i3] = jArrCopyOf[i3] - ((long) (67108863 & i22));
            int i29 = i3 + 1;
            jArrCopyOf[i29] = jArrCopyOf[i29] - j14;
        }
        for (int i30 = i21; i30 < 10; i30++) {
            jArrCopyOf[i30] = jArrCopyOf[i30] << f707d[i30];
        }
        byte[] bArr = new byte[32];
        for (int i31 = i21; i31 < 10; i31++) {
            int i32 = f706c[i31];
            long j15 = bArr[i32];
            long j16 = jArrCopyOf[i31];
            bArr[i32] = (byte) (j15 | (j16 & 255));
            int i33 = i32 + 1;
            bArr[i33] = (byte) (((long) bArr[i33]) | ((j16 >> 8) & 255));
            int i34 = i32 + 2;
            bArr[i34] = (byte) (((long) bArr[i34]) | ((j16 >> 16) & 255));
            int i35 = i32 + 3;
            bArr[i35] = (byte) (((long) bArr[i35]) | ((j16 >> 24) & 255));
        }
        return bArr;
    }

    public static byte[] e(java.lang.String str) {
        if (str.length() % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            int i9 = i3 * 2;
            int iDigit = java.lang.Character.digit(str.charAt(i9), 16);
            int iDigit2 = java.lang.Character.digit(str.charAt(i9 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new java.lang.IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i3] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static java.lang.String f(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            int i3 = b9 & 255;
            sb.append("0123456789abcdef".charAt(i3 / 16));
            sb.append("0123456789abcdef".charAt(i3 % 16));
        }
        return sb.toString();
    }

    public static long[] g(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i3 = 0; i3 < 10; i3++) {
            int i9 = f706c[i3];
            jArr[i3] = ((((((long) (bArr[i9] & 255)) | (((long) (bArr[i9 + 1] & 255)) << 8)) | (((long) (bArr[i9 + 2] & 255)) << 16)) | (((long) (bArr[i9 + 3] & 255)) << 24)) >> f707d[i3]) & ((long) f708e[i3 & 1]);
        }
        return jArr;
    }

    public static long h(byte[] bArr, int i3) {
        return (((long) (bArr[i3 + 2] & 255)) << 16) | (((long) bArr[i3]) & 255) | (((long) (bArr[i3 + 1] & 255)) << 8);
    }

    public static long i(byte[] bArr, int i3) {
        return (((long) (bArr[i3 + 3] & 255)) << 24) | h(bArr, i3);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr2[0];
        long j9 = jArr3[0];
        long j10 = j * j9;
        long j11 = jArr3[1];
        long j12 = jArr2[1];
        long j13 = (j12 * j9) + (j * j11);
        long j14 = jArr3[2];
        long j15 = jArr2[2];
        long j16 = (j15 * j9) + (j * j14) + (j12 * 2 * j11);
        long j17 = jArr3[3];
        long j18 = jArr2[3];
        long j19 = (j18 * j9) + (j * j17) + (j15 * j11) + (j12 * j14);
        long j20 = jArr3[4];
        long j21 = jArr2[4];
        long j22 = (j21 * j9) + (j * j20) + (((j18 * j11) + (j12 * j17)) * 2) + (j15 * j14);
        long j23 = jArr3[5];
        long j24 = (j * j23) + (j21 * j11) + (j12 * j20) + (j18 * j14) + (j15 * j17);
        long j25 = jArr2[5];
        long j26 = (j25 * j9) + j24;
        long j27 = jArr3[6];
        long j28 = (j * j27) + (j21 * j14) + (j15 * j20) + (((j25 * j11) + (j12 * j23) + (j18 * j17)) * 2);
        long j29 = jArr2[6];
        long j30 = (j29 * j9) + j28;
        long j31 = jArr3[7];
        long j32 = (j * j31) + (j29 * j11) + (j12 * j27) + (j25 * j14) + (j15 * j23) + (j21 * j17) + (j18 * j20);
        long j33 = jArr2[7];
        long j34 = (j33 * j9) + j32;
        long j35 = jArr3[8];
        long j36 = jArr2[8];
        long j37 = (j36 * j9) + (j * j35) + (j29 * j14) + (j15 * j27) + (((j33 * j11) + (j12 * j31) + (j25 * j17) + (j18 * j23)) * 2) + (j21 * j20);
        long j38 = jArr3[9];
        long j39 = (j * j38) + (j36 * j11) + (j12 * j35) + (j33 * j14) + (j15 * j31) + (j29 * j17) + (j18 * j27) + (j25 * j20) + (j21 * j23);
        long j40 = jArr2[9];
        long j41 = j11 * j40;
        long j42 = (j36 * j14) + (j15 * j35) + (j29 * j20) + (j21 * j27) + ((j41 + (j12 * j38) + (j33 * j17) + (j18 * j31) + (j25 * j23)) * 2);
        long j43 = j14 * j40;
        long j44 = j43 + (j15 * j38) + (j36 * j17) + (j18 * j35) + (j33 * j20) + (j21 * j31) + (j29 * j23) + (j25 * j27);
        long j45 = j17 * j40;
        long j46 = j36 * j20;
        long j47 = j20 * j40;
        long j48 = j36 * j27;
        long j49 = j27 * j40;
        k(new long[]{j10, j13, j16, j19, j22, j26, j30, j34, j37, (j9 * j40) + j39, j42, j44, j46 + (j21 * j35) + ((j45 + (j18 * j38) + (j33 * j23) + (j25 * j31)) * 2) + (j29 * j27), j47 + (j21 * j38) + (j36 * j23) + (j25 * j35) + (j33 * j27) + (j29 * j31), j48 + (j29 * j35) + (((j23 * j40) + (j25 * j38) + (j33 * j31)) * 2), j49 + (j29 * j38) + (j36 * j31) + (j33 * j35), (((j31 * j40) + (j33 * j38)) * 2) + (j36 * j35), (j35 * j40) + (j36 * j38), j40 * 2 * j38}, jArr);
    }

    public static void k(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            java.lang.System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        long j = jArr[8];
        long j9 = jArr[18];
        long j10 = j + (j9 << 4);
        jArr[8] = j10;
        long j11 = j10 + (j9 << 1);
        jArr[8] = j11;
        jArr[8] = j11 + j9;
        long j12 = jArr[7];
        long j13 = jArr[17];
        long j14 = j12 + (j13 << 4);
        jArr[7] = j14;
        long j15 = j14 + (j13 << 1);
        jArr[7] = j15;
        jArr[7] = j15 + j13;
        long j16 = jArr[6];
        long j17 = jArr[16];
        long j18 = j16 + (j17 << 4);
        jArr[6] = j18;
        long j19 = j18 + (j17 << 1);
        jArr[6] = j19;
        jArr[6] = j19 + j17;
        long j20 = jArr[5];
        long j21 = jArr[15];
        long j22 = j20 + (j21 << 4);
        jArr[5] = j22;
        long j23 = j22 + (j21 << 1);
        jArr[5] = j23;
        jArr[5] = j23 + j21;
        long j24 = jArr[4];
        long j25 = jArr[14];
        long j26 = j24 + (j25 << 4);
        jArr[4] = j26;
        long j27 = j26 + (j25 << 1);
        jArr[4] = j27;
        jArr[4] = j27 + j25;
        long j28 = jArr[3];
        long j29 = jArr[13];
        long j30 = j28 + (j29 << 4);
        jArr[3] = j30;
        long j31 = j30 + (j29 << 1);
        jArr[3] = j31;
        jArr[3] = j31 + j29;
        long j32 = jArr[2];
        long j33 = jArr[12];
        long j34 = j32 + (j33 << 4);
        jArr[2] = j34;
        long j35 = j34 + (j33 << 1);
        jArr[2] = j35;
        jArr[2] = j35 + j33;
        long j36 = jArr[1];
        long j37 = jArr[11];
        long j38 = j36 + (j37 << 4);
        jArr[1] = j38;
        long j39 = j38 + (j37 << 1);
        jArr[1] = j39;
        jArr[1] = j39 + j37;
        long j40 = jArr[0];
        long j41 = jArr[10];
        long j42 = j40 + (j41 << 4);
        jArr[0] = j42;
        long j43 = j42 + (j41 << 1);
        jArr[0] = j43;
        jArr[0] = j43 + j41;
        l(jArr);
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void l(long[] jArr) {
        jArr[10] = 0;
        int i3 = 0;
        while (i3 < 10) {
            long j = jArr[i3];
            long j9 = j / 67108864;
            jArr[i3] = j - (j9 << 26);
            int i9 = i3 + 1;
            long j10 = jArr[i9] + j9;
            jArr[i9] = j10;
            long j11 = j10 / 33554432;
            jArr[i9] = j10 - (j11 << 25);
            i3 += 2;
            jArr[i3] = jArr[i3] + j11;
        }
        long j12 = jArr[0];
        long j13 = jArr[10];
        long j14 = j12 + (j13 << 4);
        jArr[0] = j14;
        long j15 = j14 + (j13 << 1);
        jArr[0] = j15;
        long j16 = j15 + j13;
        jArr[0] = j16;
        jArr[10] = 0;
        long j17 = j16 / 67108864;
        jArr[0] = j16 - (j17 << 26);
        jArr[1] = jArr[1] + j17;
    }

    public static byte[] m(byte[] bArr) {
        int i3;
        byte[] bArr2 = new byte[256];
        for (int i9 = 0; i9 < 256; i9++) {
            bArr2[i9] = (byte) (1 & ((bArr[i9 >> 3] & 255) >> (i9 & 7)));
        }
        for (int i10 = 0; i10 < 256; i10++) {
            if (bArr2[i10] != 0) {
                for (int i11 = 1; i11 <= 6 && (i3 = i10 + i11) < 256; i11++) {
                    byte b9 = bArr2[i3];
                    if (b9 != 0) {
                        byte b10 = bArr2[i10];
                        if ((b9 << i11) + b10 > 15) {
                            if (b10 - (b9 << i11) < -15) {
                                break;
                            }
                            bArr2[i10] = (byte) (b10 - (b9 << i11));
                            while (i3 < 256) {
                                if (bArr2[i3] == 0) {
                                    bArr2[i3] = 1;
                                    break;
                                }
                                bArr2[i3] = 0;
                                i3++;
                            }
                        } else {
                            bArr2[i10] = (byte) (b10 + (b9 << i11));
                            bArr2[i3] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static void n(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j9 = j * 2;
        long j10 = jArr2[1];
        long j11 = jArr2[2];
        long j12 = jArr2[3];
        long j13 = jArr2[4];
        long j14 = jArr2[5];
        long j15 = jArr2[6];
        long j16 = jArr2[7];
        long j17 = jArr2[8];
        long j18 = jArr2[9];
        k(new long[]{j * j, j9 * j10, ((j * j11) + (j10 * j10)) * 2, ((j * j12) + (j10 * j11)) * 2, (j9 * j13) + (j10 * 4 * j12) + (j11 * j11), ((j * j14) + (j10 * j13) + (j11 * j12)) * 2, ((j10 * 2 * j14) + (j * j15) + (j11 * j13) + (j12 * j12)) * 2, ((j * j16) + (j10 * j15) + (j11 * j14) + (j12 * j13)) * 2, (((((j12 * j14) + (j10 * j16)) * 2) + (j * j17) + (j11 * j15)) * 2) + (j13 * j13), ((j * j18) + (j10 * j17) + (j11 * j16) + (j12 * j15) + (j13 * j14)) * 2, ((((j10 * j18) + (j12 * j16)) * 2) + (j11 * j17) + (j13 * j15) + (j14 * j14)) * 2, ((j11 * j18) + (j12 * j17) + (j13 * j16) + (j14 * j15)) * 2, (((((j12 * j18) + (j14 * j16)) * 2) + (j13 * j17)) * 2) + (j15 * j15), ((j13 * j18) + (j14 * j17) + (j15 * j16)) * 2, ((j14 * 2 * j18) + (j15 * j17) + (j16 * j16)) * 2, ((j15 * j18) + (j16 * j17)) * 2, (j16 * 4 * j18) + (j17 * j17), j17 * 2 * j18, 2 * j18 * j18}, jArr);
    }

    public static void o(B4.j jVar, B4.j jVar2, B4.h hVar) {
        long[] jArr = new long[10];
        android.support.v4.media.session.q qVar = jVar.f702a;
        long[] jArr2 = (long[]) qVar.f15617i;
        android.support.v4.media.session.q qVar2 = jVar2.f702a;
        q(jArr2, (long[]) qVar2.j, (long[]) qVar2.f15617i);
        p((long[]) qVar.j, (long[]) qVar2.j, (long[]) qVar2.f15617i);
        long[] jArr3 = hVar.f698a;
        long[] jArr4 = (long[]) qVar.j;
        j(jArr4, jArr4, jArr3);
        long[] jArr5 = hVar.f699b;
        long[] jArr6 = (long[]) qVar.f15618k;
        long[] jArr7 = (long[]) qVar.f15617i;
        j(jArr6, jArr7, jArr5);
        long[] jArr8 = hVar.f700c;
        long[] jArr9 = jVar.f703b;
        j(jArr9, jVar2.f703b, jArr8);
        hVar.a(jArr7, (long[]) qVar2.f15618k);
        q(jArr, jArr7, jArr7);
        p(jArr7, jArr6, jArr4);
        q(jArr4, jArr6, jArr4);
        p(jArr6, jArr, jArr9);
        q(jArr9, jArr, jArr9);
    }

    public static void p(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i3 = 0; i3 < 10; i3++) {
            jArr[i3] = jArr2[i3] - jArr3[i3];
        }
    }

    public static void q(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i3 = 0; i3 < 10; i3++) {
            jArr[i3] = jArr2[i3] + jArr3[i3];
        }
    }

    public static final void r(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, int i3) {
        if (i3 < 0 || byteBuffer2.remaining() < i3 || byteBuffer3.remaining() < i3 || byteBuffer.remaining() < i3) {
            throw new java.lang.IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i9 = 0; i9 < i3; i9++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] s(byte[] bArr, int i3, int i9, byte[] bArr2, int i10) {
        if (i10 < 0 || bArr.length - i10 < i3 || bArr2.length - i10 < i9) {
            throw new java.lang.IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr3[i11] = (byte) (bArr[i11 + i3] ^ bArr2[i11 + i9]);
        }
        return bArr3;
    }

    public static final byte[] t(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return s(bArr, 0, 0, bArr2, bArr.length);
        }
        throw new java.lang.IllegalArgumentException("The lengths of x and y should match.");
    }
}
