package androidx.core.app;

/* JADX INFO: renamed from: androidx.core.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1483c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Class f16016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Field f16017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Field f16018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.lang.reflect.Method f16019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.lang.reflect.Method f16020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.lang.reflect.Method f16021f;
    public static final android.os.Handler g = new android.os.Handler(android.os.Looper.getMainLooper());

    static {
        java.lang.Class<?> cls;
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        java.lang.reflect.Method declaredMethod;
        java.lang.reflect.Method declaredMethod2;
        java.lang.reflect.Method method = null;
        try {
            cls = java.lang.Class.forName("android.app.ActivityThread");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        f16016a = cls;
        try {
            declaredField = android.app.Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (java.lang.Throwable unused2) {
            declaredField = null;
        }
        f16017b = declaredField;
        try {
            declaredField2 = android.app.Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (java.lang.Throwable unused3) {
            declaredField2 = null;
        }
        f16018c = declaredField2;
        java.lang.Class cls2 = f16016a;
        java.lang.Class cls3 = java.lang.Boolean.TYPE;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", android.os.IBinder.class, cls3, java.lang.String.class);
                declaredMethod.setAccessible(true);
            } catch (java.lang.Throwable unused4) {
                declaredMethod = null;
            }
        }
        f16019d = declaredMethod;
        java.lang.Class cls4 = f16016a;
        if (cls4 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", android.os.IBinder.class, cls3);
                declaredMethod2.setAccessible(true);
            } catch (java.lang.Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f16020e = declaredMethod2;
        java.lang.Class cls5 = f16016a;
        int i3 = android.os.Build.VERSION.SDK_INT;
        if ((i3 == 26 || i3 == 27) && cls5 != null) {
            try {
                java.lang.Class cls6 = java.lang.Integer.TYPE;
                java.lang.Class cls7 = java.lang.Boolean.TYPE;
                java.lang.reflect.Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", android.os.IBinder.class, java.util.List.class, java.util.List.class, cls6, cls7, android.content.res.Configuration.class, android.content.res.Configuration.class, cls7, cls7);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (java.lang.Throwable unused6) {
            }
        }
        f16021f = method;
    }
}
