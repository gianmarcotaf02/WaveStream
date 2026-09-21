package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class j0 {

    public final Unsafe f16220a;

    public j0(Unsafe unsafe) {
        this.f16220a = unsafe;
    }

    public final int a(Class cls) {
        return this.f16220a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f16220a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract double d(long j, Object obj);

    public abstract float e(long j, Object obj);

    public final int f(long j, Object obj) {
        return this.f16220a.getInt(obj, j);
    }

    public final long g(long j, Object obj) {
        return this.f16220a.getLong(obj, j);
    }

    public final Object h(long j, Object obj) {
        return this.f16220a.getObject(obj, j);
    }

    public final long i(Field field) {
        return this.f16220a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j, boolean z6);

    public abstract void k(Object obj, long j, byte b9);

    public abstract void l(Object obj, long j, double d4);

    public abstract void m(Object obj, long j, float f9);

    public final void n(int i3, long j, Object obj) {
        this.f16220a.putInt(obj, j, i3);
    }

    public final void o(Object obj, long j, long j9) {
        this.f16220a.putLong(obj, j, j9);
    }

    public final void p(long j, Object obj, Object obj2) {
        this.f16220a.putObject(obj, j, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f16220a;
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
            k0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
