package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class o0 {

    public final Unsafe f19564a;

    public o0(Unsafe unsafe) {
        this.f19564a = unsafe;
    }

    public final int a(Class cls) {
        return this.f19564a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f19564a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract byte d(long j, Object obj);

    public abstract double e(long j, Object obj);

    public abstract float f(long j, Object obj);

    public final int g(long j, Object obj) {
        return this.f19564a.getInt(obj, j);
    }

    public final long h(long j, Object obj) {
        return this.f19564a.getLong(obj, j);
    }

    public final Object i(long j, Object obj) {
        return this.f19564a.getObject(obj, j);
    }

    public final long j(Field field) {
        return this.f19564a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j, boolean z6);

    public abstract void l(Object obj, long j, byte b9);

    public abstract void m(Object obj, long j, double d4);

    public abstract void n(Object obj, long j, float f9);

    public final void o(int i3, long j, Object obj) {
        this.f19564a.putInt(obj, j, i3);
    }

    public final void p(Object obj, long j, long j9) {
        this.f19564a.putLong(obj, j, j9);
    }

    public final void q(long j, Object obj, Object obj2) {
        this.f19564a.putObject(obj, j, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f19564a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            p0.a(th);
            return false;
        }
    }

    public abstract boolean s();
}
