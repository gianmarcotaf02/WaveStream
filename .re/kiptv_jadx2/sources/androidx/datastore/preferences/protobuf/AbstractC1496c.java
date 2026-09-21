package androidx.datastore.preferences.protobuf;

public abstract class AbstractC1496c {

    public static final Class f16186a;

    public static final boolean f16187b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f16186a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f16187b = cls2 != null;
    }

    public static boolean a() {
        return (f16186a == null || f16187b) ? false : true;
    }
}
