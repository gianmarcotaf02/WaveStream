package com.google.android.gms.internal.play_billing;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

public abstract class AbstractC1830c1 {

    public static final Unsafe f19308a;

    public static final Class f19309b;

    public static final AbstractC1827b1 f19310c;

    public static final boolean f19311d;

    public static final boolean f19312e;

    public static final long f19313f;
    public static final boolean g;

    static {
        AbstractC1827b1 z6;
        Field declaredField;
        boolean z9;
        boolean z10;
        Field declaredField2;
        Field field;
        AbstractC1827b1 abstractC1827b1;
        Class<Class> cls = Class.class;
        Unsafe unsafeH = h();
        f19308a = unsafeH;
        int i3 = AbstractC1847i0.f19337a;
        f19309b = Memory.class;
        Class<?> cls2 = Long.TYPE;
        boolean zN = n(cls2);
        Class cls3 = Integer.TYPE;
        boolean zN2 = n(cls3);
        if (unsafeH == null) {
            z6 = null;
        } else if (zN) {
            z6 = new C1824a1(unsafeH);
        } else if (zN2) {
            z6 = new Z0(unsafeH);
        } else {
            z6 = null;
        }
        f19310c = z6;
        if (z6 == null) {
            z9 = false;
        } else {
            try {
                Class<?> cls4 = z6.f19307a.getClass();
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
                    z9 = false;
                } else {
                    cls = cls;
                    z9 = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(AbstractC1830c1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f19311d = z9;
        AbstractC1827b1 abstractC1827b2 = f19310c;
        if (abstractC1827b2 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls5 = abstractC1827b2.f19307a.getClass();
                cls5.getMethod("objectFieldOffset", Field.class);
                cls5.getMethod("arrayBaseOffset", cls);
                cls5.getMethod("arrayIndexScale", cls);
                cls5.getMethod("getInt", Object.class, cls2);
                cls5.getMethod("putInt", Object.class, cls2, cls3);
                cls5.getMethod("getLong", Object.class, cls2);
                cls5.getMethod("putLong", Object.class, cls2, cls2);
                cls5.getMethod("getObject", Object.class, cls2);
                cls5.getMethod("putObject", Object.class, cls2, Object.class);
                z10 = true;
            } catch (Throwable th2) {
                Logger.getLogger(AbstractC1830c1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
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
        o(Object[].class);
        a(Object[].class);
        int i9 = AbstractC1847i0.f19337a;
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
        if (field != null && (abstractC1827b1 = f19310c) != null) {
            abstractC1827b1.f19307a.objectFieldOffset(field);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (f19312e) {
            f19310c.f19307a.arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j, byte b9) {
        Unsafe unsafe = f19310c.f19307a;
        long j9 = (-4) & j;
        int i3 = unsafe.getInt(obj, j9);
        int i9 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j9, ((255 & b9) << i9) | (i3 & (~(255 << i9))));
    }

    public static void c(Object obj, long j, byte b9) {
        Unsafe unsafe = f19310c.f19307a;
        long j9 = (-4) & j;
        int i3 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j9, ((255 & b9) << i3) | (unsafe.getInt(obj, j9) & (~(255 << i3))));
    }

    public static int d(long j, Object obj) {
        return f19310c.f19307a.getInt(obj, j);
    }

    public static long e(long j, Object obj) {
        return f19310c.f19307a.getLong(obj, j);
    }

    public static Object f(Class cls) {
        try {
            return f19308a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static Object g(long j, Object obj) {
        return f19310c.f19307a.getObject(obj, j);
    }

    public static Unsafe h() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new Y0());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(AbstractC1830c1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void i(int i3, long j, Object obj) {
        f19310c.f19307a.putInt(obj, j, i3);
    }

    public static void j(Object obj, long j, long j9) {
        f19310c.f19307a.putLong(obj, j, j9);
    }

    public static void k(long j, Object obj, Object obj2) {
        f19310c.f19307a.putObject(obj, j, obj2);
    }

    public static boolean l(long j, Object obj) {
        return ((byte) ((f19310c.f19307a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean m(long j, Object obj) {
        return ((byte) ((f19310c.f19307a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean n(Class cls) {
        int i3 = AbstractC1847i0.f19337a;
        try {
            Class cls2 = f19309b;
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
        if (f19312e) {
            return f19310c.f19307a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
