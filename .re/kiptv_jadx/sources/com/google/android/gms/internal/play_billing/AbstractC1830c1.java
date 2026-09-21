package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1830c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sun.misc.Unsafe f19308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.Class f19309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.AbstractC1827b1 f19310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f19311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f19312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f19313f;
    public static final boolean g;

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    /* JADX WARN: Code duplicated, block: B:4:0x001c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0168 A[PHI: r0
  0x0168: PHI (r0v41 java.lang.reflect.Field) = (r0v34 java.lang.reflect.Field), (r0v36 java.lang.reflect.Field) binds: [B:44:0x0158, B:50:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        com.google.android.gms.internal.play_billing.AbstractC1827b1 z6;
        java.lang.reflect.Field declaredField;
        boolean z9;
        boolean z10;
        java.lang.reflect.Field declaredField2;
        java.lang.reflect.Field field;
        com.google.android.gms.internal.play_billing.AbstractC1827b1 abstractC1827b1;
        java.lang.Class<java.lang.Class> cls = java.lang.Class.class;
        sun.misc.Unsafe unsafeH = h();
        f19308a = unsafeH;
        int i3 = com.google.android.gms.internal.play_billing.AbstractC1847i0.f19337a;
        f19309b = libcore.io.Memory.class;
        java.lang.Class<?> cls2 = java.lang.Long.TYPE;
        boolean zN = n(cls2);
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        boolean zN2 = n(cls3);
        if (unsafeH == null) {
            z6 = null;
        } else if (zN) {
            z6 = new com.google.android.gms.internal.play_billing.C1824a1(unsafeH);
        } else if (zN2) {
            z6 = new com.google.android.gms.internal.play_billing.Z0(unsafeH);
        } else {
            z6 = null;
        }
        f19310c = z6;
        if (z6 == null) {
            z9 = false;
        } else {
            try {
                java.lang.Class<?> cls4 = z6.f19307a.getClass();
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
                    z9 = false;
                } else {
                    cls = cls;
                    z9 = true;
                }
            } catch (java.lang.Throwable th) {
                java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_billing.AbstractC1830c1.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f19311d = z9;
        com.google.android.gms.internal.play_billing.AbstractC1827b1 abstractC1827b2 = f19310c;
        if (abstractC1827b2 == null) {
            z10 = false;
        } else {
            try {
                java.lang.Class<?> cls5 = abstractC1827b2.f19307a.getClass();
                cls5.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls5.getMethod("arrayBaseOffset", cls);
                cls5.getMethod("arrayIndexScale", cls);
                cls5.getMethod("getInt", java.lang.Object.class, cls2);
                cls5.getMethod("putInt", java.lang.Object.class, cls2, cls3);
                cls5.getMethod("getLong", java.lang.Object.class, cls2);
                cls5.getMethod("putLong", java.lang.Object.class, cls2, cls2);
                cls5.getMethod("getObject", java.lang.Object.class, cls2);
                cls5.getMethod("putObject", java.lang.Object.class, cls2, java.lang.Object.class);
                z10 = true;
            } catch (java.lang.Throwable th2) {
                java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_billing.AbstractC1830c1.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z10 = false;
            }
        }
        f19312e = z10;
        f19313f = o(byte[].class);
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
        int i9 = com.google.android.gms.internal.play_billing.AbstractC1847i0.f19337a;
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
        if (field != null && (abstractC1827b1 = f19310c) != null) {
            abstractC1827b1.f19307a.objectFieldOffset(field);
        }
        g = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    public static void a(java.lang.Class cls) {
        if (f19312e) {
            f19310c.f19307a.arrayIndexScale(cls);
        }
    }

    public static void b(java.lang.Object obj, long j, byte b9) {
        sun.misc.Unsafe unsafe = f19310c.f19307a;
        long j9 = (-4) & j;
        int i3 = unsafe.getInt(obj, j9);
        int i9 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j9, ((255 & b9) << i9) | (i3 & (~(255 << i9))));
    }

    public static void c(java.lang.Object obj, long j, byte b9) {
        sun.misc.Unsafe unsafe = f19310c.f19307a;
        long j9 = (-4) & j;
        int i3 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j9, ((255 & b9) << i3) | (unsafe.getInt(obj, j9) & (~(255 << i3))));
    }

    public static int d(long j, java.lang.Object obj) {
        return f19310c.f19307a.getInt(obj, j);
    }

    public static long e(long j, java.lang.Object obj) {
        return f19310c.f19307a.getLong(obj, j);
    }

    public static java.lang.Object f(java.lang.Class cls) {
        try {
            return f19308a.allocateInstance(cls);
        } catch (java.lang.InstantiationException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    public static java.lang.Object g(long j, java.lang.Object obj) {
        return f19310c.f19307a.getObject(obj, j);
    }

    public static sun.misc.Unsafe h() {
        sun.misc.Unsafe unsafe;
        try {
            unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.play_billing.Y0());
        } catch (java.lang.Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (java.lang.Exception unused2) {
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_billing.AbstractC1830c1.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void i(int i3, long j, java.lang.Object obj) {
        f19310c.f19307a.putInt(obj, j, i3);
    }

    public static void j(java.lang.Object obj, long j, long j9) {
        f19310c.f19307a.putLong(obj, j, j9);
    }

    public static void k(long j, java.lang.Object obj, java.lang.Object obj2) {
        f19310c.f19307a.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean l(long j, java.lang.Object obj) {
        return ((byte) ((f19310c.f19307a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean m(long j, java.lang.Object obj) {
        return ((byte) ((f19310c.f19307a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean n(java.lang.Class cls) {
        int i3 = com.google.android.gms.internal.play_billing.AbstractC1847i0.f19337a;
        try {
            java.lang.Class cls2 = f19309b;
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
        if (f19312e) {
            return f19310c.f19307a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
