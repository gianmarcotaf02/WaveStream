package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O implements java.security.PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final java.lang.Object run() throws java.lang.IllegalAccessException {
        sun.misc.Unsafe unsafe = com.google.android.gms.internal.play_billing.J.f19233n;
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        throw new java.lang.NoSuchFieldError("the Unsafe");
    }
}
