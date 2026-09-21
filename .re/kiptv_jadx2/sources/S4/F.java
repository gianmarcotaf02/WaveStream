package S4;

import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public abstract class F {

    public static final O7.o f9310a = new O7.o("[^\\p{Alnum}]+");

    static {
        kotlin.jvm.internal.m.d(Pattern.compile("\\s+"), "compile(...)");
    }

    public static double a(String str1, String str2) {
        kotlin.jvm.internal.m.e(str1, "str1");
        kotlin.jvm.internal.m.e(str2, "str2");
        K k9 = K.f9329a;
        return b(K.h(str1), K.h(str2));
    }

    public static double b(String str1, String str2) {
        int length;
        kotlin.jvm.internal.m.e(str1, "str1");
        kotlin.jvm.internal.m.e(str2, "str2");
        String strC = c(str1);
        String strC2 = c(str2);
        if (kotlin.jvm.internal.m.a(strC, strC2)) {
            return 1.0d;
        }
        int iMax = Math.max(strC.length(), strC2.length());
        if (iMax == 0) {
            return 0.0d;
        }
        if (strC.length() == 0) {
            length = strC2.length();
        } else if (strC2.length() == 0) {
            length = strC.length();
        } else {
            int length2 = strC.length();
            int i3 = length2 + 1;
            int[] iArr = new int[i3];
            for (int i9 = 0; i9 < i3; i9++) {
                iArr[i9] = i9;
            }
            int[] iArr2 = new int[i3];
            int length3 = strC2.length();
            if (1 <= length3) {
                iArr = iArr2;
                int[] iArr3 = iArr;
                int i10 = 1;
                while (true) {
                    iArr[0] = i10;
                    char cCharAt = strC2.charAt(i10 - 1);
                    if (1 <= length2) {
                        int i11 = 1;
                        while (true) {
                            int i12 = i11 - 1;
                            iArr[i11] = strC.charAt(i12) == cCharAt ? iArr3[i12] : Math.min(iArr3[i12] + 1, Math.min(iArr[i12] + 1, iArr3[i11] + 1));
                            if (i11 == length2) {
                                break;
                            }
                            i11++;
                        }
                    }
                    if (i10 == length3) {
                        break;
                    }
                    i10++;
                    int[] iArr4 = iArr;
                    iArr = iArr3;
                    iArr3 = iArr4;
                }
            }
            length = iArr[length2];
        }
        return ((double) (iMax - length)) / ((double) iMax);
    }

    public static String c(String str) {
        kotlin.jvm.internal.m.e(str, "str");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        K k9 = K.f9329a;
        int length = lowerCase.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (lowerCase.charAt(i3) >= 128) {
                K k10 = K.f9329a;
                List listG = f9310a.g(K.i(lowerCase));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listG) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                return p078i6.o.o1(arrayList, ServerSentEventKt.SPACE, null, null, null, 62);
            }
        }
        int length2 = lowerCase.length();
        for (int i9 = 0; i9 < length2; i9++) {
            char cCharAt = lowerCase.charAt(i9);
            if (('a' > cCharAt || cCharAt >= '{') && (('0' > cCharAt || cCharAt >= ':') && ('A' > cCharAt || cCharAt >= '['))) {
                StringBuilder sb = new StringBuilder(lowerCase.length());
                int length3 = lowerCase.length();
                boolean z6 = false;
                for (int i10 = 0; i10 < length3; i10++) {
                    char cCharAt2 = lowerCase.charAt(i10);
                    if (('a' > cCharAt2 || cCharAt2 >= '{') && (('0' > cCharAt2 || cCharAt2 >= ':') && ('A' > cCharAt2 || cCharAt2 >= '['))) {
                        z6 = true;
                    } else {
                        if (z6 && sb.length() > 0) {
                            sb.append(' ');
                        }
                        sb.append(cCharAt2);
                        z6 = false;
                    }
                }
                String string = sb.toString();
                kotlin.jvm.internal.m.d(string, "toString(...)");
                return string;
            }
        }
        return lowerCase;
    }
}
