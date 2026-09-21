package com.google.android.gms.internal.cast;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

public abstract class e3 {

    public static final Unsafe f18897a;

    public static final Class f18898b;

    public static final d3 f18899c;

    public static final boolean f18900d;

    public static final boolean f18901e;

    public static final long f18902f;
    public static final boolean g;

    static {
        d3 b3Var;
        Field declaredField;
        boolean z6;
        boolean z9;
        Field declaredField2;
        Field field;
        d3 d3Var;
        Class<Class> cls = Class.class;
        Unsafe unsafeH = h();
        f18897a = unsafeH;
        int i3 = AbstractC1809w2.f19165a;
        f18898b = Memory.class;
        Class<?> cls2 = Long.TYPE;
        boolean zN = n(cls2);
        Class cls3 = Integer.TYPE;
        boolean zN2 = n(cls3);
        if (unsafeH == null) {
            b3Var = null;
        } else if (zN) {
            b3Var = new c3(unsafeH);
        } else if (zN2) {
            b3Var = new b3(unsafeH);
        } else {
            b3Var = null;
        }
        f18899c = b3Var;
        if (b3Var == null) {
            z6 = false;
        } else {
            try {
                Class<?> cls4 = b3Var.f18889a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("getLong", Object.class, cls2);
                try {
                    declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                } catch (Throwable unused) {
                    declaredField = null;
                }
                if (declaredField == null) {
                    try {
                        declaredField = Buffer.class.getDeclaredField(SentryLockReason.JsonKeys.ADDRESS);
                    } catch (Throwable unused2) {
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
            } catch (Throwable th) {
                Logger.getLogger(e3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f18900d = z6;
        d3 d3Var2 = f18899c;
        if (d3Var2 == null) {
            z9 = false;
        } else {
            try {
                Class<?> cls5 = d3Var2.f18889a.getClass();
                cls5.getMethod("objectFieldOffset", Field.class);
                cls5.getMethod("arrayBaseOffset", cls);
                cls5.getMethod("arrayIndexScale", cls);
                cls5.getMethod("getInt", Object.class, cls2);
                cls5.getMethod("putInt", Object.class, cls2, cls3);
                cls5.getMethod("getLong", Object.class, cls2);
                cls5.getMethod("putLong", Object.class, cls2, cls2);
                cls5.getMethod("getObject", Object.class, cls2);
                cls5.getMethod("putObject", Object.class, cls2, Object.class);
                z9 = true;
            } catch (Throwable th2) {
                Logger.getLogger(e3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
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
        o(Object[].class);
        a(Object[].class);
        int i9 = AbstractC1809w2.f19165a;
        try {
            declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        if (declaredField2 == null) {
            try {
                declaredField2 = Buffer.class.getDeclaredField(SentryLockReason.JsonKeys.ADDRESS);
            } catch (Throwable unused4) {
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
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (f18901e) {
            f18899c.f18889a.arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j, byte b9) {
        d3 d3Var = f18899c;
        long j9 = (-4) & j;
        int i3 = d3Var.f18889a.getInt(obj, j9);
        int i9 = ((~((int) j)) & 3) << 3;
        d3Var.f18889a.putInt(obj, j9, ((255 & b9) << i9) | (i3 & (~(255 << i9))));
    }

    public static void c(Object obj, long j, byte b9) {
        d3 d3Var = f18899c;
        long j9 = (-4) & j;
        int i3 = (((int) j) & 3) << 3;
        d3Var.f18889a.putInt(obj, j9, ((255 & b9) << i3) | (d3Var.f18889a.getInt(obj, j9) & (~(255 << i3))));
    }

    public static int d(long j, Object obj) {
        return f18899c.f18889a.getInt(obj, j);
    }

    public static long e(long j, Object obj) {
        return f18899c.f18889a.getLong(obj, j);
    }

    public static Object f(Class cls) {
        try {
            return f18897a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static Object g(long j, Object obj) {
        return f18899c.f18889a.getObject(obj, j);
    }

    public static Unsafe h() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a3());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void i(int i3, long j, Object obj) {
        f18899c.f18889a.putInt(obj, j, i3);
    }

    public static void j(Object obj, long j, long j9) {
        f18899c.f18889a.putLong(obj, j, j9);
    }

    public static void k(long j, Object obj, Object obj2) {
        f18899c.f18889a.putObject(obj, j, obj2);
    }

    public static boolean l(long j, Object obj) {
        return ((byte) ((f18899c.f18889a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean m(long j, Object obj) {
        return ((byte) ((f18899c.f18889a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean n(Class cls) {
        int i3 = AbstractC1809w2.f19165a;
        try {
            Class cls2 = f18898b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int o(Class cls) {
        if (f18901e) {
            return f18899c.f18889a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
