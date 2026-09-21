package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public final class i0 extends j0 {
    @Override
    public final boolean c(long j, Object obj) {
        return this.f16220a.getBoolean(obj, j);
    }

    @Override
    public final double d(long j, Object obj) {
        return this.f16220a.getDouble(obj, j);
    }

    @Override
    public final float e(long j, Object obj) {
        return this.f16220a.getFloat(obj, j);
    }

    @Override
    public final void j(Object obj, long j, boolean z6) {
        this.f16220a.putBoolean(obj, j, z6);
    }

    @Override
    public final void k(Object obj, long j, byte b9) {
        this.f16220a.putByte(obj, j, b9);
    }

    @Override
    public final void l(Object obj, long j, double d4) {
        this.f16220a.putDouble(obj, j, d4);
    }

    @Override
    public final void m(Object obj, long j, float f9) {
        this.f16220a.putFloat(obj, j, f9);
    }

    @Override
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f16220a.getClass();
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
            k0.a(th);
            return false;
        }
    }

    @Override
    public final boolean r() {
        Unsafe unsafe = this.f16220a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (k0.g() != null) {
                    try {
                        Class<?> cls3 = this.f16220a.getClass();
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
                        k0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                k0.a(th2);
            }
        }
        return false;
    }
}
