package w8;

import java.util.Comparator;

public final class C3028h implements Comparator {
    @Override
    public final int compare(Object obj, Object obj2) {
        String a2 = (String) obj;
        String b9 = (String) obj2;
        kotlin.jvm.internal.m.e(a2, "a");
        kotlin.jvm.internal.m.e(b9, "b");
        int iMin = Math.min(a2.length(), b9.length());
        for (int i3 = 4; i3 < iMin; i3++) {
            char cCharAt = a2.charAt(i3);
            char cCharAt2 = b9.charAt(i3);
            if (cCharAt != cCharAt2) {
                return kotlin.jvm.internal.m.f(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = a2.length();
        int length2 = b9.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
