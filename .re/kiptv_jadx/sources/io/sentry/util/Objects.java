package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class Objects {
    private Objects() {
    }

    public static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hash(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }

    public static <T> T requireNonNull(T t9, java.lang.String str) {
        if (t9 != null) {
            return t9;
        }
        throw new java.lang.IllegalArgumentException(str);
    }
}
