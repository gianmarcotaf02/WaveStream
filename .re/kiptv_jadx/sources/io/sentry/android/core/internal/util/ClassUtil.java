package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public class ClassUtil {
    public static java.lang.String getClassName(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        java.lang.String canonicalName = obj.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : obj.getClass().getSimpleName();
    }
}
