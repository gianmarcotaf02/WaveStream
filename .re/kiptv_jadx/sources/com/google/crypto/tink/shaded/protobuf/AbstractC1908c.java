package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1908c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Class f19517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f19518b;

    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2 = null;
        try {
            cls = java.lang.Class.forName("libcore.io.Memory");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        f19517a = cls;
        try {
            cls2 = java.lang.Class.forName("org.robolectric.Robolectric");
        } catch (java.lang.Throwable unused2) {
        }
        f19518b = cls2 != null;
    }

    public static boolean a() {
        return (f19517a == null || f19518b) ? false : true;
    }
}
