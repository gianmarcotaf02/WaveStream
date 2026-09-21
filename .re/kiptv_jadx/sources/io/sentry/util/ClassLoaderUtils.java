package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class ClassLoaderUtils {
    public static java.lang.ClassLoader classLoaderOrDefault(java.lang.ClassLoader classLoader) {
        return classLoader == null ? java.lang.ClassLoader.getSystemClassLoader() : classLoader;
    }
}
