package com.google.common.util.concurrent;

/* JADX INFO: renamed from: com.google.common.util.concurrent.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1899n implements java.security.PrivilegedExceptionAction {
    public static sun.misc.Unsafe a() throws java.lang.IllegalAccessException {
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        throw new java.lang.NoSuchFieldError("the Unsafe");
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ java.lang.Object run() {
        return a();
    }
}
