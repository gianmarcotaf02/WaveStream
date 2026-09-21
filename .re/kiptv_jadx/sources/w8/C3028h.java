package w8;

/* JADX INFO: renamed from: w8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3028h implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String a2 = (java.lang.String) obj;
        java.lang.String b9 = (java.lang.String) obj2;
        kotlin.jvm.internal.m.e(a2, "a");
        kotlin.jvm.internal.m.e(b9, "b");
        int iMin = java.lang.Math.min(a2.length(), b9.length());
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
