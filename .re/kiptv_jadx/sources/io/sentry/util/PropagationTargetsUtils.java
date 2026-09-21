package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class PropagationTargetsUtils {
    public static boolean contain(java.util.List<java.lang.String> list, java.lang.String str) {
        if (list.isEmpty()) {
            return false;
        }
        for (java.lang.String str2 : list) {
            if (str.contains(str2)) {
                return true;
            }
            try {
                if (str.matches(str2)) {
                    return true;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public static boolean contain(java.util.List<java.lang.String> list, java.net.URI uri) {
        return contain(list, uri.toString());
    }
}
