package com.google.crypto.tink.shaded.protobuf;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class p0 {

    public static final Unsafe f19567a;

    public static final Class f19568b;

    public static final o0 f19569c;

    public static final boolean f19570d;

    public static final boolean f19571e;

    public static final long f19572f;
    public static final boolean g;

    static {
        Unsafe unsafeJ = j();
        f19567a = unsafeJ;
        f19568b = AbstractC1908c.f19517a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        o0 n0Var = null;
        if (unsafeJ != null) {
            if (!AbstractC1908c.a()) {
                n0Var = new n0(unsafeJ);
            } else if (zF) {
                n0Var = new m0(unsafeJ, 1);
            } else if (zF2) {
                n0Var = new m0(unsafeJ, 0);
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
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && n0Var != null) {
            n0Var.j(fieldE);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(p0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f19567a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static int c(Class cls) {
        if (f19571e) {
            return f19569c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f19571e) {
            f19569c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1908c.a()) {
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

    public static boolean f(Class cls) {
        if (!AbstractC1908c.a()) {
            return false;
        }
        try {
            Class cls2 = f19568b;
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

    public static byte g(long j, byte[] bArr) {
        return f19569c.d(f19572f + j, bArr);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((f19569c.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((f19569c.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new l0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j, byte b9) {
        f19569c.l(bArr, f19572f + j, b9);
    }

    public static void l(Object obj, long j, byte b9) {
        long j9 = (-4) & j;
        int iG = f19569c.g(j9, obj);
        int i3 = ((~((int) j)) & 3) << 3;
        n(((255 & b9) << i3) | (iG & (~(255 << i3))), j9, obj);
    }

    public static void m(Object obj, long j, byte b9) {
        long j9 = (-4) & j;
        int i3 = (((int) j) & 3) << 3;
        n(((255 & b9) << i3) | (f19569c.g(j9, obj) & (~(255 << i3))), j9, obj);
    }

    public static void n(int i3, long j, Object obj) {
        f19569c.o(i3, j, obj);
    }

    public static void o(Object obj, long j, long j9) {
        f19569c.p(obj, j, j9);
    }

    public static void p(long j, Object obj, Object obj2) {
        f19569c.q(j, obj, obj2);
    }
}
