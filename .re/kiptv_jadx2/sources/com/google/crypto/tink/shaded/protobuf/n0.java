package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public final class n0 extends o0 {
    @Override
    public final boolean c(long j, Object obj) {
        return this.f19564a.getBoolean(obj, j);
    }

    @Override
    public final byte d(long j, Object obj) {
        return this.f19564a.getByte(obj, j);
    }

    @Override
    public final double e(long j, Object obj) {
        return this.f19564a.getDouble(obj, j);
    }

    @Override
    public final float f(long j, Object obj) {
        return this.f19564a.getFloat(obj, j);
    }

    @Override
    public final void k(Object obj, long j, boolean z6) {
        this.f19564a.putBoolean(obj, j, z6);
    }

    @Override
    public final void l(Object obj, long j, byte b9) {
        this.f19564a.putByte(obj, j, b9);
    }

    @Override
    public final void m(Object obj, long j, double d4) {
        this.f19564a.putDouble(obj, j, d4);
    }

    @Override
    public final void n(Object obj, long j, float f9) {
        this.f19564a.putFloat(obj, j, f9);
    }

    @Override
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f19564a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            p0.a(th);
            return false;
        }
    }

    @Override
    public final boolean s() {
        Unsafe unsafe = this.f19564a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (p0.e() != null) {
                    try {
                        Class<?> cls3 = this.f19564a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        p0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                p0.a(th2);
            }
        }
        return false;
    }
}
