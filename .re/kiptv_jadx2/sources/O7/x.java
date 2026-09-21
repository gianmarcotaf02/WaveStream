package O7;

import androidx.media3.common.C;
import com.google.common.util.concurrent.AbstractC1903s;

public abstract class x extends w {
    public static Long A0(String str) {
        boolean z6;
        kotlin.jvm.internal.m.e(str, "<this>");
        R8.i.i(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int iF = kotlin.jvm.internal.m.f(cCharAt, 48);
        long j = C.TIME_UNSET;
        if (iF < 0) {
            z6 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z6 = false;
                i3 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i3 = 1;
            }
        } else {
            z6 = false;
        }
        long j9 = 0;
        long j10 = -256204778801521550L;
        while (i3 < length) {
            int iDigit = Character.digit((int) str.charAt(i3), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j9 < j10) {
                if (j10 != -256204778801521550L) {
                    return null;
                }
                j10 = j / ((long) 10);
                if (j9 < j10) {
                    return null;
                }
            }
            long j11 = j9 * ((long) 10);
            long j12 = iDigit;
            if (j11 < j + j12) {
                return null;
            }
            j9 = j11 - j12;
            i3++;
        }
        return z6 ? Long.valueOf(j9) : Long.valueOf(-j9);
    }

    public static String m0(char[] cArr, int i3, int i9) {
        AbstractC1903s.m(i3, i9, cArr.length);
        return new String(cArr, i3, i9 - i3);
    }

    public static String n0(byte[] bArr) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        return new String(bArr, a.f8024b);
    }

    public static String o0(int i3, int i9, int i10, byte[] bArr) {
        if ((i10 & 1) != 0) {
            i3 = 0;
        }
        kotlin.jvm.internal.m.e(bArr, "<this>");
        AbstractC1903s.m(i3, i9, bArr.length);
        return new String(bArr, i3, i9 - i3, a.f8024b);
    }

    public static byte[] p0(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        byte[] bytes = str.getBytes(a.f8024b);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean q0(String str, String suffix, boolean z6) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(suffix, "suffix");
        return !z6 ? str.endsWith(suffix) : t0(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static boolean r0(String str, String str2, boolean z6) {
        if (str == null) {
            return str2 == null;
        }
        return !z6 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final void s0(String str) {
        throw new NumberFormatException(B2.a.i('\'', "Invalid number format: '", str));
    }

    public static boolean t0(int i3, int i9, int i10, String str, String other, boolean z6) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        return !z6 ? str.regionMatches(i3, other, i9, i10) : str.regionMatches(z6, i3, other, i9, i10);
    }

    public static String u0(int i3, String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i3 + '.').toString());
        }
        if (i3 == 0) {
            return "";
        }
        int i9 = 1;
        if (i3 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i3];
            for (int i10 = 0; i10 < i3; i10++) {
                cArr[i10] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i3);
        if (1 <= i3) {
            while (true) {
                sb.append((CharSequence) str);
                if (i9 == i3) {
                    break;
                }
                i9++;
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.b(string);
        return string;
    }

    public static String v0(String str, char c9, char c10) {
        kotlin.jvm.internal.m.e(str, "<this>");
        String strReplace = str.replace(c9, c10);
        kotlin.jvm.internal.m.d(strReplace, "replace(...)");
        return strReplace;
    }

    public static String w0(String str, String oldValue, String newValue) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(oldValue, "oldValue");
        kotlin.jvm.internal.m.e(newValue, "newValue");
        int iI0 = q.I0(str, oldValue, 0, false);
        if (iI0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i3 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i9 = 0;
        do {
            sb.append((CharSequence) str, i9, iI0);
            sb.append(newValue);
            i9 = iI0 + length;
            if (iI0 >= str.length()) {
                break;
            }
            iI0 = q.I0(str, oldValue, iI0 + i3, false);
        } while (iI0 > 0);
        sb.append((CharSequence) str, i9, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static boolean x0(String str, String prefix, boolean z6) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        return !z6 ? str.startsWith(prefix) : t0(0, 0, prefix.length(), str, prefix, z6);
    }

    public static boolean y0(boolean z6, String str, int i3, String prefix) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        return !z6 ? str.startsWith(prefix, i3) : t0(i3, 0, prefix.length(), str, prefix, z6);
    }

    public static Integer z0(String str) {
        boolean z6;
        int i3;
        int i9;
        kotlin.jvm.internal.m.e(str, "<this>");
        R8.i.i(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        int iF = kotlin.jvm.internal.m.f(cCharAt, 48);
        int i11 = C.RATE_UNSET_INT;
        if (iF < 0) {
            i3 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z6 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i11 = Integer.MIN_VALUE;
                z6 = true;
            }
        } else {
            z6 = false;
            i3 = 0;
        }
        int i12 = -59652323;
        while (i3 < length) {
            int iDigit = Character.digit((int) str.charAt(i3), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i10 < i12 && (i12 != -59652323 || i10 < (i12 = i11 / 10))) || (i9 = i10 * 10) < i11 + iDigit) {
                return null;
            }
            i10 = i9 - iDigit;
            i3++;
        }
        return z6 ? Integer.valueOf(i10) : Integer.valueOf(-i10);
    }
}
