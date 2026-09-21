package N8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f7472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f7473b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(O7.a.f8024b);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        f7472a = bytes;
        f7473b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final java.lang.String a(long j, M8.C0682j c0682j) throws java.io.EOFException {
        kotlin.jvm.internal.m.e(c0682j, "<this>");
        if (j > 0) {
            long j9 = j - 1;
            if (c0682j.i(j9) == 13) {
                java.lang.String strP = c0682j.P(j9, O7.a.f8024b);
                c0682j.C(2L);
                return strP;
            }
        }
        java.lang.String strP2 = c0682j.P(j, O7.a.f8024b);
        c0682j.C(1L);
        return strP2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab A[LOOP:0: B:8:0x0021->B:48:0x00ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[SYNTHETIC] */
    public static final int b(M8.C0682j c0682j, M8.z options, boolean z6) {
        int i3;
        byte[] bArr;
        int i9;
        int i10;
        M8.F f9;
        byte[] bArr2;
        int i11;
        kotlin.jvm.internal.m.e(c0682j, "<this>");
        kotlin.jvm.internal.m.e(options, "options");
        M8.F f10 = c0682j.f7259h;
        if (f10 == null) {
            return z6 ? -2 : -1;
        }
        int i12 = f10.f7220b;
        int i13 = f10.f7221c;
        byte[] bArr3 = f10.f7219a;
        M8.F f11 = f10;
        int i14 = -1;
        int i15 = 0;
        loop0: while (true) {
            int i16 = i15 + 1;
            int[] iArr = options.f7292i;
            int i17 = iArr[i15];
            int i18 = i15 + 2;
            int i19 = iArr[i16];
            if (i19 != -1) {
                i14 = i19;
            }
            if (f11 == null) {
                break;
            }
            if (i17 >= 0) {
                int i20 = i12 + 1;
                int i21 = bArr3[i12] & 255;
                int i22 = i18 + i17;
                while (i18 != i22) {
                    if (i21 == iArr[i18]) {
                        i3 = iArr[i18 + i17];
                        if (i20 == i13) {
                            f11 = f11.f7224f;
                            kotlin.jvm.internal.m.b(f11);
                            i10 = f11.f7220b;
                            i9 = f11.f7221c;
                            bArr = f11.f7219a;
                            if (f11 == f10) {
                                f11 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i9 = i13;
                            i10 = i20;
                        }
                        if (i3 >= 0) {
                            return i3;
                        }
                        byte[] bArr4 = bArr;
                        i15 = -i3;
                        i12 = i10;
                        i13 = i9;
                        bArr3 = bArr4;
                    } else {
                        i18++;
                    }
                }
                return i14;
            }
            int i23 = (i17 * (-1)) + i18;
            while (true) {
                int i24 = i12 + 1;
                int i25 = i18 + 1;
                if ((bArr3[i12] & 255) == iArr[i18]) {
                    boolean z9 = i25 == i23;
                    if (i24 == i13) {
                        kotlin.jvm.internal.m.b(f11);
                        M8.F f12 = f11.f7224f;
                        kotlin.jvm.internal.m.b(f12);
                        i11 = f12.f7220b;
                        int i26 = f12.f7221c;
                        bArr2 = f12.f7219a;
                        if (f12 != f10) {
                            f9 = f12;
                            i13 = i26;
                        } else {
                            if (!z9) {
                                break loop0;
                            }
                            i13 = i26;
                            f9 = null;
                        }
                    } else {
                        f9 = f11;
                        bArr2 = bArr3;
                        i11 = i24;
                    }
                    if (z9) {
                        i3 = iArr[i25];
                        int i27 = i11;
                        i9 = i13;
                        i10 = i27;
                        byte[] bArr5 = bArr2;
                        f11 = f9;
                        bArr = bArr5;
                        break;
                    }
                    i12 = i11;
                    bArr3 = bArr2;
                    f11 = f9;
                    i18 = i25;
                }
                return i14;
            }
            if (i3 >= 0) {
                return i3;
            }
            byte[] bArr6 = bArr;
            i15 = -i3;
            i12 = i10;
            i13 = i9;
            bArr3 = bArr6;
        }
        if (z6) {
            return -2;
        }
        return i14;
    }
}
