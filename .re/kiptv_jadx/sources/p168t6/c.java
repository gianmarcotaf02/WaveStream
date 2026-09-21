package p168t6;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p168t6.a f28521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f28522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p168t6.c f28523e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28525b;

    static {
        p168t6.b[] bVarArr = p168t6.b.f28520h;
        f28521c = new p168t6.a(false, false);
        f28522d = new byte[]{13, 10};
        f28523e = new p168t6.c(true, false);
        new p168t6.c(false, true);
    }

    public c(boolean z6, boolean z9) {
        p168t6.b[] bVarArr = p168t6.b.f28520h;
        this.f28524a = z6;
        this.f28525b = z9;
        if (z6 && z9) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
    }

    public static byte[] a(p168t6.a aVar, java.lang.CharSequence source, int i3, int i9) {
        byte[] bytes;
        int i10;
        int i11;
        int i12;
        boolean z6;
        int i13;
        int i14 = 8;
        int i15 = -2;
        int i16 = (i9 & 2) != 0 ? 0 : i3;
        int length = source.length();
        aVar.getClass();
        kotlin.jvm.internal.m.e(source, "source");
        if (source instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) source;
            com.google.common.util.concurrent.AbstractC1903s.m(i16, length, str.length());
            java.lang.String strSubstring = str.substring(i16, length);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            bytes = strSubstring.getBytes(O7.a.f8025c);
            kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        } else {
            com.google.common.util.concurrent.AbstractC1903s.m(i16, length, source.length());
            byte[] bArr = new byte[length - i16];
            int i17 = 0;
            while (i16 < length) {
                char cCharAt = source.charAt(i16);
                if (cCharAt <= 255) {
                    bArr[i17] = (byte) cCharAt;
                    i17++;
                } else {
                    bArr[i17] = 63;
                    i17++;
                }
                i16++;
            }
            bytes = bArr;
        }
        int length2 = bytes.length;
        com.google.common.util.concurrent.AbstractC1903s.m(0, length2, bytes.length);
        boolean z9 = aVar.f28525b;
        if (length2 == 0) {
            i11 = 0;
        } else {
            if (length2 == 1) {
                throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
            }
            if (z9) {
                i10 = length2;
                for (int i18 = 0; i18 < length2; i18++) {
                    int i19 = p168t6.d.f28527b[bytes[i18] & 255];
                    if (i19 < 0) {
                        if (i19 == -2) {
                            i10 -= length2 - i18;
                            break;
                        }
                        i10--;
                    }
                }
            } else if (bytes[length2 - 1] == 61) {
                i10 = length2 - 1;
                if (bytes[length2 - 2] == 61) {
                    i10 = length2 - 2;
                }
            } else {
                i10 = length2;
            }
            i11 = (int) ((((long) i10) * ((long) 6)) / ((long) 8));
        }
        byte[] bArr2 = new byte[i11];
        int[] iArr = aVar.f28524a ? p168t6.d.f28529d : p168t6.d.f28527b;
        int i20 = -8;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = -8;
        while (true) {
            int i25 = i14;
            if (i22 >= length2) {
                i12 = i15;
                z6 = false;
                break;
            }
            if (i24 != i20 || (i13 = i22 + 3) >= length2) {
                iArr = iArr;
            } else {
                iArr = iArr;
                int i26 = i22 + 4;
                int i27 = (iArr[bytes[i22 + 2] & 255] << 6) | (iArr[bytes[i22 + 1] & 255] << 12) | (iArr[bytes[i22] & 255] << 18) | iArr[bytes[i13] & 255];
                if (i27 >= 0) {
                    bArr2[i21] = (byte) (i27 >> 16);
                    int i28 = i21 + 2;
                    bArr2[i21 + 1] = (byte) (i27 >> 8);
                    i21 += 3;
                    bArr2[i28] = (byte) i27;
                    iArr = iArr;
                    i14 = i25;
                    i22 = i26;
                    i15 = -2;
                }
                i20 = -8;
            }
            int i29 = bytes[i22] & 255;
            int i30 = iArr[i29];
            if (i30 >= 0) {
                i22++;
                i23 = (i23 << 6) | i30;
                int i31 = i24 + 6;
                if (i31 >= 0) {
                    bArr2[i21] = (byte) (i23 >>> i31);
                    i23 &= (1 << i31) - 1;
                    i24 -= 2;
                    i21++;
                    i15 = -2;
                    i14 = 8;
                    i20 = -8;
                    iArr = iArr;
                } else {
                    i24 = i31;
                    i14 = 8;
                }
            } else {
                if (i30 == -2) {
                    if (i24 == -8) {
                        throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i22, "Redundant pad character at index "));
                    }
                    if (i24 == -6) {
                        p168t6.b[] bVarArr = p168t6.b.f28520h;
                    } else if (i24 == -4) {
                        p168t6.b[] bVarArr2 = p168t6.b.f28520h;
                        i22++;
                        if (z9) {
                            while (i22 < length2) {
                                if (p168t6.d.f28527b[bytes[i22] & 255] != -1) {
                                    break;
                                }
                                i22++;
                            }
                        }
                        if (i22 == length2 || bytes[i22] != 61) {
                            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i22, "Missing one pad character at index "));
                        }
                    } else if (i24 != -2) {
                        throw new java.lang.IllegalStateException("Unreachable");
                    }
                    i22++;
                    z6 = true;
                    i12 = -2;
                    break;
                }
                if (!z9) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid symbol '");
                    sb.append((char) i29);
                    sb.append("'(");
                    R8.i.i(i25);
                    java.lang.String string = java.lang.Integer.toString(i29, i25);
                    kotlin.jvm.internal.m.d(string, "toString(...)");
                    sb.append(string);
                    sb.append(") at index ");
                    sb.append(i22);
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                i22++;
                i14 = i25;
            }
            i15 = -2;
            i20 = -8;
        }
        if (i24 == i12) {
            throw new java.lang.IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i24 != -8 && !z6) {
            p168t6.b[] bVarArr3 = p168t6.b.f28520h;
            throw new java.lang.IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i23 != 0) {
            throw new java.lang.IllegalArgumentException("The pad bits must be zeros");
        }
        if (z9) {
            while (i22 < length2) {
                if (p168t6.d.f28527b[bytes[i22] & 255] != -1) {
                    break;
                }
                i22++;
            }
        }
        if (i22 >= length2) {
            if (i21 == i11) {
                return bArr2;
            }
            throw new java.lang.IllegalStateException("Check failed.");
        }
        int i32 = bytes[i22] & 255;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Symbol '");
        sb2.append((char) i32);
        sb2.append("'(");
        R8.i.i(8);
        java.lang.String string2 = java.lang.Integer.toString(i32, 8);
        kotlin.jvm.internal.m.d(string2, "toString(...)");
        sb2.append(string2);
        sb2.append(") at index ");
        throw new java.lang.IllegalArgumentException(Y6.f.k(sb2, i22 - 1, " is prohibited after the pad character"));
    }

    public static java.lang.String b(p168t6.c cVar, byte[] source) {
        int i3;
        int length = source.length;
        cVar.getClass();
        kotlin.jvm.internal.m.e(source, "source");
        com.google.common.util.concurrent.AbstractC1903s.m(0, length, source.length);
        int iC = cVar.c(length);
        byte[] bArr = new byte[iC];
        com.google.common.util.concurrent.AbstractC1903s.m(0, length, source.length);
        int iC2 = cVar.c(length);
        if (iC < 0) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.l(iC, "destination offset: 0, destination size: "));
        }
        if (iC2 < 0 || iC2 > iC) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(iC, iC2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
        }
        byte[] bArr2 = cVar.f28524a ? p168t6.d.f28528c : p168t6.d.f28526a;
        int i9 = cVar.f28525b ? 19 : androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i3 = i10 + 2;
            if (i3 >= length) {
                break;
            }
            int iMin = java.lang.Math.min((length - i10) / 3, i9);
            for (int i12 = 0; i12 < iMin; i12++) {
                int i13 = source[i10] & 255;
                int i14 = i10 + 2;
                int i15 = source[i10 + 1] & 255;
                i10 += 3;
                int i16 = (i15 << 8) | (i13 << 16) | (source[i14] & 255);
                bArr[i11] = bArr2[i16 >>> 18];
                bArr[i11 + 1] = bArr2[(i16 >>> 12) & 63];
                int i17 = i11 + 3;
                bArr[i11 + 2] = bArr2[(i16 >>> 6) & 63];
                i11 += 4;
                bArr[i17] = bArr2[i16 & 63];
            }
            if (iMin == i9 && i10 != length) {
                int i18 = i11 + 1;
                byte[] bArr3 = f28522d;
                bArr[i11] = bArr3[0];
                i11 += 2;
                bArr[i18] = bArr3[1];
            }
        }
        int i19 = length - i10;
        if (i19 == 1) {
            int i20 = (source[i10] & 255) << 4;
            bArr[i11] = bArr2[i20 >>> 6];
            bArr[1 + i11] = bArr2[i20 & 63];
            p168t6.b[] bVarArr = p168t6.b.f28520h;
            bArr[2 + i11] = 61;
            bArr[i11 + 3] = 61;
            i10++;
        } else if (i19 == 2) {
            int i21 = ((source[i10 + 1] & 255) << 2) | ((source[i10] & 255) << 10);
            bArr[i11] = bArr2[i21 >>> 12];
            bArr[1 + i11] = bArr2[(i21 >>> 6) & 63];
            bArr[2 + i11] = bArr2[i21 & 63];
            p168t6.b[] bVarArr2 = p168t6.b.f28520h;
            bArr[i11 + 3] = 61;
            i10 = i3;
        }
        if (i10 == length) {
            return new java.lang.String(bArr, O7.a.f8025c);
        }
        throw new java.lang.IllegalStateException("Check failed.");
    }

    public final int c(int i3) {
        int i9 = (i3 / 3) * 4;
        if (i3 % 3 != 0) {
            p168t6.b[] bVarArr = p168t6.b.f28520h;
            i9 += 4;
        }
        if (this.f28525b) {
            i9 += ((i9 - 1) / 76) * 2;
        }
        if (i9 >= 0) {
            return i9;
        }
        throw new java.lang.IllegalArgumentException("Input is too big");
    }
}
