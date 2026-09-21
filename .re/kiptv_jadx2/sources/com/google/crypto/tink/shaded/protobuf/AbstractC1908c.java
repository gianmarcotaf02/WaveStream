package com.google.crypto.tink.shaded.protobuf;

public abstract class AbstractC1908c {

    public static final Class f19517a;

    public static final boolean f19518b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f19517a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f19518b = cls2 != null;
    }

    public static boolean a() {
        return (f19517a == null || f19518b) ? false : true;
    }
}
