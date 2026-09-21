package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public abstract class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sun.misc.Unsafe f18897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.Class f18898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.d3 f18899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f18900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f18901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f18902f;
    public static final boolean g;

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    /* JADX WARN: Code duplicated, block: B:4:0x001c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0168 A[PHI: r0
  0x0168: PHI (r0v41 java.lang.reflect.Field) = (r0v34 java.lang.reflect.Field), (r0v36 java.lang.reflect.Field) binds: [B:44:0x0158, B:50:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        com.google.android.gms.internal.cast.d3 b3Var;
        java.lang.reflect.Field declaredField;
        boolean z6;
        boolean z9;
        java.lang.reflect.Field declaredField2;
        java.lang.reflect.Field field;
        com.google.android.gms.internal.cast.d3 d3Var;
        java.lang.Class<java.lang.Class> cls = java.lang.Class.class;
        sun.misc.Unsafe unsafeH = h();
        f18897a = unsafeH;
        int i3 = com.google.android.gms.internal.cast.AbstractC1809w2.f19165a;
        f18898b = libcore.io.Memory.class;
        java.lang.Class<?> cls2 = java.lang.Long.TYPE;
        boolean zN = n(cls2);
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        boolean zN2 = n(cls3);
        if (unsafeH == null) {
            b3Var = null;
        } else if (zN) {
            b3Var = new com.google.android.gms.internal.cast.c3(unsafeH);
        } else if (zN2) {
            b3Var = new com.google.android.gms.internal.cast.b3(unsafeH);
        } else {
            b3Var = null;
        }
        f18899c = b3Var;
        if (b3Var == null) {
            z6 = false;
        } else {
            try {
                java.lang.Class<?> cls4 = b3Var.f18889a.getClass();
                cls4.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls4.getMethod("getLong", java.lang.Object.class, cls2);
                try {
                    declaredField = java.nio.Buffer.class.getDeclaredField("effectiveDirectAddress");
                } catch (java.lang.Throwable unused) {
                    declaredField = null;
                }
                if (declaredField == null) {
                    try {
                        declaredField = java.nio.Buffer.class.getDeclaredField(io.sentry.SentryLockReason.JsonKeys.ADDRESS);
                    } catch (java.lang.Throwable unused2) {
                        declaredField = null;
                    }
                    if (declaredField == null || declaredField.getType() != cls2) {
                        declaredField = null;
                    }
                }
                if (declaredField == null) {
                    z6 = false;
                } else {
                    cls = cls;
                    z6 = true;
                }
            } catch (java.lang.Throwable th) {
                java.util.logging.Logger.getLogger(com.google.android.gms.internal.cast.e3.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f18900d = z6;
        com.google.android.gms.internal.cast.d3 d3Var2 = f18899c;
        if (d3Var2 == null) {
            z9 = false;
        } else {
            try {
                java.lang.Class<?> cls5 = d3Var2.f18889a.getClass();
                cls5.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls5.getMethod("arrayBaseOffset", cls);
                cls5.getMethod("arrayIndexScale", cls);
                cls5.getMethod("getInt", java.lang.Object.class, cls2);
                cls5.getMethod("putInt", java.lang.Object.class, cls2, cls3);
                cls5.getMethod("getLong", java.lang.Object.class, cls2);
                cls5.getMethod("putLong", java.lang.Object.class, cls2, cls2);
                cls5.getMethod("getObject", java.lang.Object.class, cls2);
                cls5.getMethod("putObject", java.lang.Object.class, cls2, java.lang.Object.class);
                z9 = true;
            } catch (java.lang.Throwable th2) {
                java.util.logging.Logger.getLogger(com.google.android.gms.internal.cast.e3.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z9 = false;
            }
        }
        f18901e = z9;
        f18902f = o(byte[].class);
        o(boolean[].class);
        a(boolean[].class);
        o(int[].class);
        a(int[].class);
        o(long[].class);
        a(long[].class);
        o(float[].class);
        a(float[].class);
        o(double[].class);
        a(double[].class);
        o(java.lang.Object[].class);
        a(java.lang.Object[].class);
        int i9 = com.google.android.gms.internal.cast.AbstractC1809w2.f19165a;
        try {
            declaredField2 = java.nio.Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (java.lang.Throwable unused3) {
            declaredField2 = null;
        }
        if (declaredField2 == null) {
            try {
                declaredField2 = java.nio.Buffer.class.getDeclaredField(io.sentry.SentryLockReason.JsonKeys.ADDRESS);
            } catch (java.lang.Throwable unused4) {
                declaredField2 = null;
            }
            if (declaredField2 == null || declaredField2.getType() != cls2) {
                field = null;
            } else {
                field = declaredField2;
            }
        } else {
            field = declaredField2;
        }
        if (field != null && (d3Var = f18899c) != null) {
            d3Var.f18889a.objectFieldOffset(field);
        }
        g = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    public static void a(java.lang.Class cls) {
        if (f18901e) {
            f18899c.f18889a.arrayIndexScale(cls);
        }
    }

    public static void b(java.lang.Object obj, long j, byte b9) {
        com.google.android.gms.internal.cast.d3 d3Var = f18899c;
        long j9 = (-4) & j;
        int i3 = d3Var.f18889a.getInt(obj, j9);
        int i9 = ((~((int) j)) & 3) << 3;
        d3Var.f18889a.putInt(obj, j9, ((255 & b9) << i9) | (i3 & (~(255 << i9))));
    }

    public static void c(java.lang.Object obj, long j, byte b9) {
        com.google.android.gms.internal.cast.d3 d3Var = f18899c;
        long j9 = (-4) & j;
        int i3 = (((int) j) & 3) << 3;
        d3Var.f18889a.putInt(obj, j9, ((255 & b9) << i3) | (d3Var.f18889a.getInt(obj, j9) & (~(255 << i3))));
    }

    public static int d(long j, java.lang.Object obj) {
        return f18899c.f18889a.getInt(obj, j);
    }

    public static long e(long j, java.lang.Object obj) {
        return f18899c.f18889a.getLong(obj, j);
    }

    public static java.lang.Object f(java.lang.Class cls) {
        try {
            return f18897a.allocateInstance(cls);
        } catch (java.lang.InstantiationException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    public static java.lang.Object g(long j, java.lang.Object obj) {
        return f18899c.f18889a.getObject(obj, j);
    }

    public static sun.misc.Unsafe h() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.cast.a3());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static void i(int i3, long j, java.lang.Object obj) {
        f18899c.f18889a.putInt(obj, j, i3);
    }

    public static void j(java.lang.Object obj, long j, long j9) {
        f18899c.f18889a.putLong(obj, j, j9);
    }

    public static void k(long j, java.lang.Object obj, java.lang.Object obj2) {
        f18899c.f18889a.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean l(long j, java.lang.Object obj) {
        return ((byte) ((f18899c.f18889a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean m(long j, java.lang.Object obj) {
        return ((byte) ((f18899c.f18889a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean n(java.lang.Class cls) {
        int i3 = com.google.android.gms.internal.cast.AbstractC1809w2.f19165a;
        try {
            java.lang.Class cls2 = f18898b;
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

    public static int o(java.lang.Class cls) {
        if (f18901e) {
            return f18899c.f18889a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
