package H3;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f4000a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f4001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f4002c;

    public static void a(java.lang.String str, boolean z6) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(str));
        }
    }

    public static void b(boolean z6) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void c(android.os.Handler handler) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            java.lang.String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            java.lang.String name2 = handler.getLooper().getThread().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + java.lang.String.valueOf(name2).length() + 35 + 1);
            B2.a.x(sb, "Must be called on ", name2, " thread, but got ", name);
            sb.append(".");
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    public static void d() {
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("Must be called from the main thread.");
        }
    }

    public static void e(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void f(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException(str2);
        }
    }

    public static void g(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null reference");
        }
    }

    public static void h(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str);
        }
    }

    public static void i(java.lang.String str, boolean z6) {
        if (!z6) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static boolean j(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static E3.d k(com.google.android.gms.common.api.Status status) {
        return status.j != null ? new E3.j(status) : new E3.d(status);
    }
}
