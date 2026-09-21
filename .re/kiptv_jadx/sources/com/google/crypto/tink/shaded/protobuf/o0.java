package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sun.misc.Unsafe f19564a;

    public o0(sun.misc.Unsafe unsafe) {
        this.f19564a = unsafe;
    }

    public final int a(java.lang.Class cls) {
        return this.f19564a.arrayBaseOffset(cls);
    }

    public final int b(java.lang.Class cls) {
        return this.f19564a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, java.lang.Object obj);

    public abstract byte d(long j, java.lang.Object obj);

    public abstract double e(long j, java.lang.Object obj);

    public abstract float f(long j, java.lang.Object obj);

    public final int g(long j, java.lang.Object obj) {
        return this.f19564a.getInt(obj, j);
    }

    public final long h(long j, java.lang.Object obj) {
        return this.f19564a.getLong(obj, j);
    }

    public final java.lang.Object i(long j, java.lang.Object obj) {
        return this.f19564a.getObject(obj, j);
    }

    public final long j(java.lang.reflect.Field field) {
        return this.f19564a.objectFieldOffset(field);
    }

    public abstract void k(java.lang.Object obj, long j, boolean z6);

    public abstract void l(java.lang.Object obj, long j, byte b9);

    public abstract void m(java.lang.Object obj, long j, double d4);

    public abstract void n(java.lang.Object obj, long j, float f9);

    public final void o(int i3, long j, java.lang.Object obj) {
        this.f19564a.putInt(obj, j, i3);
    }

    public final void p(java.lang.Object obj, long j, long j9) {
        this.f19564a.putLong(obj, j, j9);
    }

    public final void q(long j, java.lang.Object obj, java.lang.Object obj2) {
        this.f19564a.putObject(obj, j, obj2);
    }

    public boolean r() {
        sun.misc.Unsafe unsafe = this.f19564a;
        if (unsafe == null) {
            return false;
        }
        try {
            java.lang.Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", java.lang.Class.class);
            cls.getMethod("arrayIndexScale", java.lang.Class.class);
            java.lang.Class cls2 = java.lang.Long.TYPE;
            cls.getMethod("getInt", java.lang.Object.class, cls2);
            cls.getMethod("putInt", java.lang.Object.class, cls2, java.lang.Integer.TYPE);
            cls.getMethod("getLong", java.lang.Object.class, cls2);
            cls.getMethod("putLong", java.lang.Object.class, cls2, cls2);
            cls.getMethod("getObject", java.lang.Object.class, cls2);
            cls.getMethod("putObject", java.lang.Object.class, cls2, java.lang.Object.class);
            return true;
        } catch (java.lang.Throwable th) {
            com.google.crypto.tink.shaded.protobuf.p0.a(th);
            return false;
        }
    }

    public abstract boolean s();
}
