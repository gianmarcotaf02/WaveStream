package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sun.misc.Unsafe f16221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.Class f16222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.j0 f16223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f16224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f16225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f16226f;
    public static final boolean g;

    static {
        sun.misc.Unsafe unsafeI = i();
        f16221a = unsafeI;
        f16222b = androidx.datastore.preferences.protobuf.AbstractC1496c.f16186a;
        boolean zH = h(java.lang.Long.TYPE);
        boolean zH2 = h(java.lang.Integer.TYPE);
        androidx.datastore.preferences.protobuf.j0 i0Var = null;
        if (unsafeI != null) {
            if (!androidx.datastore.preferences.protobuf.AbstractC1496c.a()) {
                i0Var = new androidx.datastore.preferences.protobuf.i0(unsafeI);
            } else if (zH) {
                i0Var = new androidx.datastore.preferences.protobuf.h0(unsafeI, 1);
            } else if (zH2) {
                i0Var = new androidx.datastore.preferences.protobuf.h0(unsafeI, 0);
            }
        }
        f16223c = i0Var;
        f16224d = i0Var == null ? false : i0Var.r();
        f16225e = i0Var == null ? false : i0Var.q();
        f16226f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(java.lang.Object[].class);
        f(java.lang.Object[].class);
        java.lang.reflect.Field fieldG = g();
        if (fieldG != null && i0Var != null) {
            i0Var.i(fieldG);
        }
        g = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    public static void a(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(androidx.datastore.preferences.protobuf.k0.class.getName()).log(java.util.logging.Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j, java.lang.Object obj) {
        return ((byte) ((f16223c.f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j, java.lang.Object obj) {
        return ((byte) ((f16223c.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static java.lang.Object d(java.lang.Class cls) {
        try {
            return f16221a.allocateInstance(cls);
        } catch (java.lang.InstantiationException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    public static int e(java.lang.Class cls) {
        if (f16225e) {
            return f16223c.a(cls);
        }
        return -1;
    }

    public static void f(java.lang.Class cls) {
        if (f16225e) {
            f16223c.b(cls);
        }
    }

    public static java.lang.reflect.Field g() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (androidx.datastore.preferences.protobuf.AbstractC1496c.a()) {
            try {
                declaredField2 = java.nio.Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (java.lang.Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = java.nio.Buffer.class.getDeclaredField(io.sentry.SentryLockReason.JsonKeys.ADDRESS);
        } catch (java.lang.Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean h(java.lang.Class cls) {
        if (!androidx.datastore.preferences.protobuf.AbstractC1496c.a()) {
            return false;
        }
        try {
            java.lang.Class cls2 = f16222b;
            java.lang.Class cls3 = java.lang.Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, cls3);
            java.lang.Class cls4 = java.lang.Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static sun.misc.Unsafe i() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new androidx.datastore.preferences.protobuf.g0());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b9) {
        f16223c.k(bArr, f16226f + j, b9);
    }

    public static void k(java.lang.Object obj, long j, byte b9) {
        long j9 = (-4) & j;
        int iF = f16223c.f(j9, obj);
        int i3 = ((~((int) j)) & 3) << 3;
        m(((255 & b9) << i3) | (iF & (~(255 << i3))), j9, obj);
    }

    public static void l(java.lang.Object obj, long j, byte b9) {
        long j9 = (-4) & j;
        int i3 = (((int) j) & 3) << 3;
        m(((255 & b9) << i3) | (f16223c.f(j9, obj) & (~(255 << i3))), j9, obj);
    }

    public static void m(int i3, long j, java.lang.Object obj) {
        f16223c.n(i3, j, obj);
    }

    public static void n(java.lang.Object obj, long j, long j9) {
        f16223c.o(obj, j, j9);
    }

    public static void o(long j, java.lang.Object obj, java.lang.Object obj2) {
        f16223c.p(j, obj, obj2);
    }
}
