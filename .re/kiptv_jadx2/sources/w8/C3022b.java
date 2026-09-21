package w8;

import M8.C0682j;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class C3022b {

    public static final C3022b f30518a = new C3022b();

    public static final C3022b f30519b = new C3022b();

    public static final C3022b f30520c = new C3022b();

    public static final C3029i a(C3022b c3022b, String str) {
        C3029i c3029i = new C3029i(str);
        C3029i.f30538d.put(str, c3029i);
        return c3029i;
    }

    public static String b(int i3, int i9, int i10, String str, String str2) throws EOFException {
        int i11 = (i10 & 1) != 0 ? 0 : i3;
        int length = (i10 & 2) != 0 ? str.length() : i9;
        boolean z6 = (i10 & 8) == 0;
        boolean z9 = (i10 & 16) == 0;
        boolean z10 = (i10 & 32) == 0;
        boolean z11 = (i10 & 64) == 0;
        kotlin.jvm.internal.m.e(str, "<this>");
        int iCharCount = i11;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i12 = 32;
            int i13 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z11) || O7.q.C0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z6 || (z9 && !d(iCharCount, length, str)))) || (iCodePointAt == 43 && z10)))) {
                C0682j c0682j = new C0682j();
                c0682j.c0(i11, iCharCount, str);
                C0682j c0682j2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z6 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z10) {
                            c0682j.d0(z6 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i12 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i13 && !z11) || O7.q.C0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z6 || (z9 && !d(iCharCount, length, str)))))) {
                            if (c0682j2 == null) {
                                c0682j2 = new C0682j();
                            }
                            c0682j2.e0(iCodePointAt2);
                            while (!c0682j2.o()) {
                                byte b9 = c0682j2.readByte();
                                c0682j.Z(37);
                                char[] cArr = o.j;
                                c0682j.Z(cArr[((b9 & 255) >> 4) & 15]);
                                c0682j.Z(cArr[b9 & 15]);
                            }
                        } else {
                            c0682j.e0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i12 = 32;
                    i13 = 128;
                }
                return c0682j.T();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i11, length);
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static boolean d(int i3, int i9, String str) {
        int i10 = i3 + 2;
        return i10 < i9 && str.charAt(i3) == '%' && x8.b.r(str.charAt(i3 + 1)) != -1 && x8.b.r(str.charAt(i10)) != -1;
    }

    public static String e(String str, int i3, int i9, int i10) {
        int i11;
        if ((i10 & 1) != 0) {
            i3 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        boolean z6 = (i10 & 4) == 0;
        kotlin.jvm.internal.m.e(str, "<this>");
        int iCharCount = i3;
        while (iCharCount < i9) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z6)) {
                C0682j c0682j = new C0682j();
                c0682j.c0(i3, iCharCount, str);
                while (iCharCount < i9) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i11 = iCharCount + 2) < i9) {
                        int iR = x8.b.r(str.charAt(iCharCount + 1));
                        int iR2 = x8.b.r(str.charAt(i11));
                        if (iR == -1 || iR2 == -1) {
                            c0682j.e0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c0682j.Z((iR << 4) + iR2);
                            iCharCount = Character.charCount(iCodePointAt) + i11;
                        }
                    } else if (iCodePointAt == 43 && z6) {
                        c0682j.Z(32);
                        iCharCount++;
                    } else {
                        c0682j.e0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c0682j.T();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i3, i9);
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 <= str.length()) {
            int iK0 = O7.q.K0(str, '&', i3, 4);
            if (iK0 == -1) {
                iK0 = str.length();
            }
            int iK1 = O7.q.K0(str, '=', i3, 4);
            if (iK1 == -1 || iK1 > iK0) {
                String strSubstring = str.substring(i3, iK0);
                kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i3, iK1);
                kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iK1 + 1, iK0);
                kotlin.jvm.internal.m.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i3 = iK0 + 1;
        }
        return arrayList;
    }

    public synchronized C3029i c(String javaName) {
        C3029i c3029i;
        String strConcat;
        try {
            kotlin.jvm.internal.m.e(javaName, "javaName");
            LinkedHashMap linkedHashMap = C3029i.f30538d;
            c3029i = (C3029i) linkedHashMap.get(javaName);
            if (c3029i == null) {
                if (O7.x.x0(javaName, "TLS_", false)) {
                    String strSubstring = javaName.substring(4);
                    kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (O7.x.x0(javaName, "SSL_", false)) {
                    String strSubstring2 = javaName.substring(4);
                    kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = javaName;
                }
                c3029i = (C3029i) linkedHashMap.get(strConcat);
                if (c3029i == null) {
                    c3029i = new C3029i(javaName);
                }
                linkedHashMap.put(javaName, c3029i);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3029i;
    }
}
