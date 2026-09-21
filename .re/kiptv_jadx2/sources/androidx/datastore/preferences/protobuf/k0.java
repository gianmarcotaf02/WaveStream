package androidx.datastore.preferences.protobuf;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class k0 {

    public static final Unsafe f16221a;

    public static final Class f16222b;

    public static final j0 f16223c;

    public static final boolean f16224d;

    public static final boolean f16225e;

    public static final long f16226f;
    public static final boolean g;

    static {
        Unsafe unsafeI = i();
        f16221a = unsafeI;
        f16222b = AbstractC1496c.f16186a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        j0 i0Var = null;
        if (unsafeI != null) {
            if (!AbstractC1496c.a()) {
                i0Var = new i0(unsafeI);
            } else if (zH) {
                i0Var = new h0(unsafeI, 1);
            } else if (zH2) {
                i0Var = new h0(unsafeI, 0);
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
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && i0Var != null) {
            i0Var.i(fieldG);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(k0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j, Object obj) {
        return ((byte) ((f16223c.f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j, Object obj) {
        return ((byte) ((f16223c.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f16221a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static int e(Class cls) {
        if (f16225e) {
            return f16223c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f16225e) {
            f16223c.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1496c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField(SentryLockReason.JsonKeys.ADDRESS);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean h(Class cls) {
        if (!AbstractC1496c.a()) {
            return false;
        }
        try {
            Class cls2 = f16222b;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new g0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b9) {
        f16223c.k(bArr, f16226f + j, b9);
    }

    public static void k(Object obj, long j, byte b9) {
        long j9 = (-4) & j;
        int iF = f16223c.f(j9, obj);
        int i3 = ((~((int) j)) & 3) << 3;
        m(((255 & b9) << i3) | (iF & (~(255 << i3))), j9, obj);
    }

    public static void l(Object obj, long j, byte b9) {
        long j9 = (-4) & j;
        int i3 = (((int) j) & 3) << 3;
        m(((255 & b9) << i3) | (f16223c.f(j9, obj) & (~(255 << i3))), j9, obj);
    }

    public static void m(int i3, long j, Object obj) {
        f16223c.n(i3, j, obj);
    }

    public static void n(Object obj, long j, long j9) {
        f16223c.o(obj, j, j9);
    }

    public static void o(long j, Object obj, Object obj2) {
        f16223c.p(j, obj, obj2);
    }
}
