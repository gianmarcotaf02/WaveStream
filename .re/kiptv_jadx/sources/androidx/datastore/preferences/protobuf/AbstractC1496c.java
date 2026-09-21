package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1496c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Class f16186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f16187b;

    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2 = null;
        try {
            cls = java.lang.Class.forName("libcore.io.Memory");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        f16186a = cls;
        try {
            cls2 = java.lang.Class.forName("org.robolectric.Robolectric");
        } catch (java.lang.Throwable unused2) {
        }
        f16187b = cls2 != null;
    }

    public static boolean a() {
        return (f16186a == null || f16187b) ? false : true;
    }
}
