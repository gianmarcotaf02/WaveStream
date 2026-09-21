package O7;

import B.d0;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class q extends x {
    public static boolean B0(CharSequence charSequence, CharSequence other, boolean z6) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        if (other instanceof String) {
            if (L0(charSequence, (String) other, 0, z6, 2) >= 0) {
                return true;
            }
        } else if (J0(charSequence, other, 0, charSequence.length(), z6, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean C0(CharSequence charSequence, char c9) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return K0(charSequence, c9, 0, 2) >= 0;
    }

    public static String D0(int i3, String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(Y6.f.f(i3, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i3 > length) {
            i3 = length;
        }
        String strSubstring = str.substring(i3);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String E0(int i3, String str) {
        if (i3 < 0) {
            throw new IllegalArgumentException(Y6.f.f(i3, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length() - i3;
        if (length < 0) {
            length = 0;
        }
        return p1(length, str);
    }

    public static boolean F0(CharSequence charSequence, char c9) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return charSequence.length() > 0 && R8.i.q(charSequence.charAt(H0(charSequence)), c9, false);
    }

    public static boolean G0(String str, CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return charSequence instanceof String ? x.q0((String) charSequence, str, false) : U0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int H0(CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int I0(CharSequence charSequence, String string, int i3, boolean z6) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(string, "string");
        return (z6 || !(charSequence instanceof String)) ? J0(charSequence, string, i3, charSequence.length(), z6, false) : ((String) charSequence).indexOf(string, i3);
    }

    public static final int J0(CharSequence charSequence, CharSequence charSequence2, int i3, int i9, boolean z6, boolean z9) {
        D6.e eVar;
        if (z9) {
            int iH0 = H0(charSequence);
            if (i3 > iH0) {
                i3 = iH0;
            }
            if (i9 < 0) {
                i9 = 0;
            }
            eVar = new D6.e(i3, i9, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i9 > length) {
                i9 = length;
            }
            eVar = new D6.g(i3, i9, 1);
        }
        boolean z10 = charSequence instanceof String;
        int i10 = eVar.j;
        int i11 = eVar.f2459i;
        int i12 = eVar.f2458h;
        if (!z10 || !(charSequence2 instanceof String)) {
            boolean z11 = z6;
            if ((i10 > 0 && i12 <= i11) || (i10 < 0 && i11 <= i12)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z12 = z11;
                    z11 = z12;
                    if (U0(charSequence4, 0, charSequence3, i12, charSequence2.length(), z12)) {
                        return i12;
                    }
                    if (i12 != i11) {
                        i12 += i10;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    }
                }
            }
        } else if ((i10 > 0 && i12 <= i11) || (i10 < 0 && i11 <= i12)) {
            int i13 = i12;
            while (true) {
                String str = (String) charSequence2;
                boolean z13 = z6;
                if (x.t0(0, i13, str.length(), str, (String) charSequence, z13)) {
                    return i13;
                }
                if (i13 != i11) {
                    i13 += i10;
                    z6 = z13;
                }
            }
        }
        return -1;
    }

    public static int K0(CharSequence charSequence, char c9, int i3, int i9) {
        if ((i9 & 2) != 0) {
            i3 = 0;
        }
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? M0(charSequence, new char[]{c9}, i3, false) : ((String) charSequence).indexOf(c9, i3);
    }

    public static int L0(CharSequence charSequence, String str, int i3, boolean z6, int i9) {
        if ((i9 & 2) != 0) {
            i3 = 0;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        return I0(charSequence, str, i3, z6);
    }

    public static final int M0(CharSequence charSequence, char[] chars, int i3, boolean z6) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(chars, "chars");
        if (!z6 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(p078i6.m.y0(chars), i3);
        }
        if (i3 < 0) {
            i3 = 0;
        }
        int iH0 = H0(charSequence);
        if (i3 > iH0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i3);
            for (char c9 : chars) {
                if (R8.i.q(c9, cCharAt, z6)) {
                    return i3;
                }
            }
            if (i3 == iH0) {
                return -1;
            }
            i3++;
        }
    }

    public static boolean N0(CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (!R8.i.w(charSequence.charAt(i3))) {
                return false;
            }
        }
        return true;
    }

    public static char O0(CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(H0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int P0(int i3, int i9, String str, String string) {
        if ((i9 & 2) != 0) {
            i3 = H0(str);
        }
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(string, "string");
        return str.lastIndexOf(string, i3);
    }

    public static int Q0(String str, int i3, int i9, char c9) {
        if ((i9 & 2) != 0) {
            i3 = H0(str);
        }
        kotlin.jvm.internal.m.e(str, "<this>");
        return str.lastIndexOf(c9, i3);
    }

    public static String R0(String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.m.e(str, "<this>");
        if (3 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(3);
            sb.append((CharSequence) str);
            int length = 3 - str.length();
            int i3 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('_');
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String S0(int i3, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.m.e(str, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(Y6.f.f(i3, "Desired length ", " is less than zero."));
        }
        if (i3 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i3);
            int length = i3 - str.length();
            int i9 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static c T0(CharSequence charSequence, String[] strArr, int i3) {
        Y0(i3);
        return new c(charSequence, i3, new y(p078i6.m.S(strArr)));
    }

    public static final boolean U0(CharSequence charSequence, int i3, CharSequence other, int i9, int i10, boolean z6) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        if (i9 < 0 || i3 < 0 || i3 > charSequence.length() - i10 || i9 > other.length() - i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!R8.i.q(charSequence.charAt(i3 + i11), other.charAt(i9 + i11), z6)) {
                return false;
            }
        }
        return true;
    }

    public static String V0(String str, String prefix) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        if (!e1(str, prefix, false)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String W0(String str, String str2) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (!G0(str2, str)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String X0(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (str.length() < 2 || !e1(str, "\"", false) || !G0("\"", str)) {
            return str;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void Y0(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(M0.l(i3, "Limit must be non-negative, but was ").toString());
        }
    }

    public static char Z0(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        int length = str.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return str.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static final List a1(String str, CharSequence charSequence, int i3) {
        Y0(i3);
        int iI0 = I0(charSequence, str, 0, false);
        if (iI0 == -1 || i3 == 1) {
            return P.i0(charSequence.toString());
        }
        boolean z6 = i3 > 0;
        int i9 = 10;
        if (z6 && i3 <= 10) {
            i9 = i3;
        }
        ArrayList arrayList = new ArrayList(i9);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iI0).toString());
            length = str.length() + iI0;
            if (z6 && arrayList.size() == i3 - 1) {
                break;
            }
            iI0 = I0(charSequence, str, length, false);
        } while (iI0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List b1(CharSequence charSequence, String[] strArr, int i3, int i9) {
        if ((i9 & 4) != 0) {
            i3 = 0;
        }
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return a1(str, charSequence, i3);
            }
        }
        c cVarT0 = T0(charSequence, strArr, i3);
        ArrayList arrayList = new ArrayList(p078i6.q.I0(new N7.r(0, cVarT0), 10));
        Iterator it = cVarT0.iterator();
        while (it.hasNext()) {
            arrayList.add(g1(charSequence, (D6.g) it.next()));
        }
        return arrayList;
    }

    public static List c1(String str, char[] cArr) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (cArr.length == 1) {
            return a1(String.valueOf(cArr[0]), str, 0);
        }
        Y0(0);
        c cVar = new c(str, 0, new d0(11, cArr));
        ArrayList arrayList = new ArrayList(p078i6.q.I0(new N7.r(0, cVar), 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(g1(str, (D6.g) it.next()));
        }
        return arrayList;
    }

    public static boolean d1(CharSequence charSequence, String prefix, int i3, boolean z6) {
        kotlin.jvm.internal.m.e(prefix, "prefix");
        return (z6 || !(charSequence instanceof String)) ? U0(charSequence, i3, prefix, 0, prefix.length(), z6) : x.y0(false, (String) charSequence, i3, prefix);
    }

    public static boolean e1(CharSequence charSequence, String prefix, boolean z6) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        return (z6 || !(charSequence instanceof String)) ? U0(charSequence, 0, prefix, 0, prefix.length(), z6) : x.x0((String) charSequence, prefix, false);
    }

    public static boolean f1(String str, char c9) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return str.length() > 0 && R8.i.q(str.charAt(0), c9, false);
    }

    public static final String g1(CharSequence charSequence, D6.g range) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(range, "range");
        return charSequence.subSequence(range.f2458h, range.f2459i + 1).toString();
    }

    public static String h1(String str, D6.g range) {
        kotlin.jvm.internal.m.e(range, "range");
        String strSubstring = str.substring(range.f2458h, range.f2459i + 1);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String i1(char c9, String str, String str2) {
        int iK0 = K0(str, c9, 0, 6);
        if (iK0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iK0 + 1, str.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String j1(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(delimiter, "delimiter");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iL0 = L0(str, delimiter, 0, false, 6);
        if (iL0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(delimiter.length() + iL0, str.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String k1(char c9, String str, String missingDelimiterValue) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iQ0 = Q0(str, 0, 6, c9);
        if (iQ0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iQ0 + 1, str.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String l1(String missingDelimiterValue, char c9) {
        kotlin.jvm.internal.m.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iK0 = K0(missingDelimiterValue, c9, 0, 6);
        if (iK0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iK0);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String m1(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.m.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iL0 = L0(missingDelimiterValue, str, 0, false, 6);
        if (iL0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iL0);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String n1(String str, String str2, String str3) {
        kotlin.jvm.internal.m.e(str, "<this>");
        int iP0 = P0(0, 6, str, str2);
        if (iP0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iP0);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String o1(String missingDelimiterValue, char c9) {
        kotlin.jvm.internal.m.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iQ0 = Q0(missingDelimiterValue, 0, 6, c9);
        if (iQ0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iQ0);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String p1(int i3, String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(Y6.f.f(i3, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i3 > length) {
            i3 = length;
        }
        String strSubstring = str.substring(0, i3);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String q1(int i3, String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(Y6.f.f(i3, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i3 > length) {
            i3 = length;
        }
        String strSubstring = str.substring(length - i3);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence r1(CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i3 = 0;
        boolean z6 = false;
        while (i3 <= length) {
            boolean zW = R8.i.w(charSequence.charAt(!z6 ? i3 : length));
            if (z6) {
                if (!zW) {
                    break;
                }
                length--;
            } else if (zW) {
                i3++;
            } else {
                z6 = true;
            }
        }
        return charSequence.subSequence(i3, length + 1);
    }

    public static String s1(String str, char... chars) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(chars, "chars");
        int length = str.length() - 1;
        int i3 = 0;
        boolean z6 = false;
        while (i3 <= length) {
            boolean zU = p078i6.m.U(chars, str.charAt(!z6 ? i3 : length));
            if (z6) {
                if (!zU) {
                    break;
                }
                length--;
            } else if (zU) {
                i3++;
            } else {
                z6 = true;
            }
        }
        return str.subSequence(i3, length + 1).toString();
    }

    public static String t1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.m.e(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i3 = length - 1;
            if (!p078i6.m.U(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i3 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i3;
        }
        return charSequenceSubSequence.toString();
    }

    public static String u1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.m.e(str, "<this>");
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (!p078i6.m.U(cArr, str.charAt(i3))) {
                charSequenceSubSequence = str.subSequence(i3, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }
}
