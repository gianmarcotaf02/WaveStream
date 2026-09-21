package p168t6;

import O7.a;
import R8.i;
import Y6.f;
import androidx.media3.common.util.Log;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.AbstractC1903s;
import kotlin.jvm.internal.m;

public class c {

    public static final a f28521c;

    public static final byte[] f28522d;

    public static final c f28523e;

    public final boolean f28524a;

    public final boolean f28525b;

    static {
        b[] bVarArr = b.f28520h;
        f28521c = new a(false, false);
        f28522d = new byte[]{13, 10};
        f28523e = new c(true, false);
        new c(false, true);
    }

    public c(boolean z6, boolean z9) {
        b[] bVarArr = b.f28520h;
        this.f28524a = z6;
        this.f28525b = z9;
        if (z6 && z9) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static byte[] a(a aVar, CharSequence source, int i3, int i9) {
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
        m.e(source, "source");
        if (source instanceof String) {
            String str = (String) source;
            AbstractC1903s.m(i16, length, str.length());
            String strSubstring = str.substring(i16, length);
            m.d(strSubstring, "substring(...)");
            bytes = strSubstring.getBytes(a.f8025c);
            m.d(bytes, "getBytes(...)");
        } else {
            AbstractC1903s.m(i16, length, source.length());
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
        AbstractC1903s.m(0, length2, bytes.length);
        boolean z9 = aVar.f28525b;
        if (length2 == 0) {
            i11 = 0;
        } else {
            if (length2 == 1) {
                throw new IllegalArgumentException(M0.l(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
            }
            if (z9) {
                i10 = length2;
                for (int i18 = 0; i18 < length2; i18++) {
                    int i19 = d.f28527b[bytes[i18] & 255];
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
        int[] iArr = aVar.f28524a ? d.f28529d : d.f28527b;
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
                        throw new IllegalArgumentException(M0.l(i22, "Redundant pad character at index "));
                    }
                    if (i24 == -6) {
                        b[] bVarArr = b.f28520h;
                    } else if (i24 == -4) {
                        b[] bVarArr2 = b.f28520h;
                        i22++;
                        if (z9) {
                            while (i22 < length2) {
                                if (d.f28527b[bytes[i22] & 255] != -1) {
                                    break;
                                }
                                i22++;
                            }
                        }
                        if (i22 == length2 || bytes[i22] != 61) {
                            throw new IllegalArgumentException(M0.l(i22, "Missing one pad character at index "));
                        }
                    } else if (i24 != -2) {
                        throw new IllegalStateException("Unreachable");
                    }
                    i22++;
                    z6 = true;
                    i12 = -2;
                    break;
                }
                if (!z9) {
                    StringBuilder sb = new StringBuilder("Invalid symbol '");
                    sb.append((char) i29);
                    sb.append("'(");
                    i.i(i25);
                    String string = Integer.toString(i29, i25);
                    m.d(string, "toString(...)");
                    sb.append(string);
                    sb.append(") at index ");
                    sb.append(i22);
                    throw new IllegalArgumentException(sb.toString());
                }
                i22++;
                i14 = i25;
            }
            i15 = -2;
            i20 = -8;
        }
        if (i24 == i12) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i24 != -8 && !z6) {
            b[] bVarArr3 = b.f28520h;
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i23 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        if (z9) {
            while (i22 < length2) {
                if (d.f28527b[bytes[i22] & 255] != -1) {
                    break;
                }
                i22++;
            }
        }
        if (i22 >= length2) {
            if (i21 == i11) {
                return bArr2;
            }
            throw new IllegalStateException("Check failed.");
        }
        int i32 = bytes[i22] & 255;
        StringBuilder sb2 = new StringBuilder("Symbol '");
        sb2.append((char) i32);
        sb2.append("'(");
        i.i(8);
        String string2 = Integer.toString(i32, 8);
        m.d(string2, "toString(...)");
        sb2.append(string2);
        sb2.append(") at index ");
        throw new IllegalArgumentException(f.k(sb2, i22 - 1, " is prohibited after the pad character"));
    }

    public static String b(c cVar, byte[] source) {
        int i3;
        int length = source.length;
        cVar.getClass();
        m.e(source, "source");
        AbstractC1903s.m(0, length, source.length);
        int iC = cVar.c(length);
        byte[] bArr = new byte[iC];
        AbstractC1903s.m(0, length, source.length);
        int iC2 = cVar.c(length);
        if (iC < 0) {
            throw new IndexOutOfBoundsException(M0.l(iC, "destination offset: 0, destination size: "));
        }
        if (iC2 < 0 || iC2 > iC) {
            throw new IndexOutOfBoundsException(M0.k(iC, iC2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
        }
        byte[] bArr2 = cVar.f28524a ? d.f28528c : d.f28526a;
        int i9 = cVar.f28525b ? 19 : Log.LOG_LEVEL_OFF;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i3 = i10 + 2;
            if (i3 >= length) {
                break;
            }
            int iMin = Math.min((length - i10) / 3, i9);
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
            b[] bVarArr = b.f28520h;
            bArr[2 + i11] = 61;
            bArr[i11 + 3] = 61;
            i10++;
        } else if (i19 == 2) {
            int i21 = ((source[i10 + 1] & 255) << 2) | ((source[i10] & 255) << 10);
            bArr[i11] = bArr2[i21 >>> 12];
            bArr[1 + i11] = bArr2[(i21 >>> 6) & 63];
            bArr[2 + i11] = bArr2[i21 & 63];
            b[] bVarArr2 = b.f28520h;
            bArr[i11 + 3] = 61;
            i10 = i3;
        }
        if (i10 == length) {
            return new String(bArr, a.f8025c);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int c(int i3) {
        int i9 = (i3 / 3) * 4;
        if (i3 % 3 != 0) {
            b[] bVarArr = b.f28520h;
            i9 += 4;
        }
        if (this.f28525b) {
            i9 += ((i9 - 1) / 76) * 2;
        }
        if (i9 >= 0) {
            return i9;
        }
        throw new IllegalArgumentException("Input is too big");
    }
}
