package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sun.misc.Unsafe f19567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.Class f19568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.o0 f19569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f19570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f19571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f19572f;
    public static final boolean g;

    static {
        sun.misc.Unsafe unsafeJ = j();
        f19567a = unsafeJ;
        f19568b = com.google.crypto.tink.shaded.protobuf.AbstractC1908c.f19517a;
        boolean zF = f(java.lang.Long.TYPE);
        boolean zF2 = f(java.lang.Integer.TYPE);
        com.google.crypto.tink.shaded.protobuf.o0 n0Var = null;
        if (unsafeJ != null) {
            if (!com.google.crypto.tink.shaded.protobuf.AbstractC1908c.a()) {
                n0Var = new com.google.crypto.tink.shaded.protobuf.n0(unsafeJ);
            } else if (zF) {
                n0Var = new com.google.crypto.tink.shaded.protobuf.m0(unsafeJ, 1);
            } else if (zF2) {
                n0Var = new com.google.crypto.tink.shaded.protobuf.m0(unsafeJ, 0);
            }
        }
        f19569c = n0Var;
        f19570d = n0Var == null ? false : n0Var.s();
        f19571e = n0Var == null ? false : n0Var.r();
        f19572f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(java.lang.Object[].class);
        d(java.lang.Object[].class);
        java.lang.reflect.Field fieldE = e();
        if (fieldE != null && n0Var != null) {
            n0Var.j(fieldE);
        }
        g = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    public static void a(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(com.google.crypto.tink.shaded.protobuf.p0.class.getName()).log(java.util.logging.Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static java.lang.Object b(java.lang.Class cls) {
        try {
            return f19567a.allocateInstance(cls);
        } catch (java.lang.InstantiationException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    public static int c(java.lang.Class cls) {
        if (f19571e) {
            return f19569c.a(cls);
        }
        return -1;
    }

    public static void d(java.lang.Class cls) {
        if (f19571e) {
            f19569c.b(cls);
        }
    }

    public static java.lang.reflect.Field e() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (com.google.crypto.tink.shaded.protobuf.AbstractC1908c.a()) {
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

    public static boolean f(java.lang.Class cls) {
        if (!com.google.crypto.tink.shaded.protobuf.AbstractC1908c.a()) {
            return false;
        }
        try {
            java.lang.Class cls2 = f19568b;
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

    public static byte g(long j, byte[] bArr) {
        return f19569c.d(f19572f + j, bArr);
    }

    public static byte h(long j, java.lang.Object obj) {
        return (byte) ((f19569c.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, java.lang.Object obj) {
        return (byte) ((f19569c.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static sun.misc.Unsafe j() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.crypto.tink.shaded.protobuf.l0());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j, byte b9) {
        f19569c.l(bArr, f19572f + j, b9);
    }

    public static void l(java.lang.Object obj, long j, byte b9) {
        long j9 = (-4) & j;
        int iG = f19569c.g(j9, obj);
        int i3 = ((~((int) j)) & 3) << 3;
        n(((255 & b9) << i3) | (iG & (~(255 << i3))), j9, obj);
    }

    public static void m(java.lang.Object obj, long j, byte b9) {
        long j9 = (-4) & j;
        int i3 = (((int) j) & 3) << 3;
        n(((255 & b9) << i3) | (f19569c.g(j9, obj) & (~(255 << i3))), j9, obj);
    }

    public static void n(int i3, long j, java.lang.Object obj) {
        f19569c.o(i3, j, obj);
    }

    public static void o(java.lang.Object obj, long j, long j9) {
        f19569c.p(obj, j, j9);
    }

    public static void p(long j, java.lang.Object obj, java.lang.Object obj2) {
        f19569c.q(j, obj, obj2);
    }
}
