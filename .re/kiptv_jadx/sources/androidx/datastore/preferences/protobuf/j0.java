package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sun.misc.Unsafe f16220a;

    public j0(sun.misc.Unsafe unsafe) {
        this.f16220a = unsafe;
    }

    public final int a(java.lang.Class cls) {
        return this.f16220a.arrayBaseOffset(cls);
    }

    public final int b(java.lang.Class cls) {
        return this.f16220a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, java.lang.Object obj);

    public abstract double d(long j, java.lang.Object obj);

    public abstract float e(long j, java.lang.Object obj);

    public final int f(long j, java.lang.Object obj) {
        return this.f16220a.getInt(obj, j);
    }

    public final long g(long j, java.lang.Object obj) {
        return this.f16220a.getLong(obj, j);
    }

    public final java.lang.Object h(long j, java.lang.Object obj) {
        return this.f16220a.getObject(obj, j);
    }

    public final long i(java.lang.reflect.Field field) {
        return this.f16220a.objectFieldOffset(field);
    }

    public abstract void j(java.lang.Object obj, long j, boolean z6);

    public abstract void k(java.lang.Object obj, long j, byte b9);

    public abstract void l(java.lang.Object obj, long j, double d4);

    public abstract void m(java.lang.Object obj, long j, float f9);

    public final void n(int i3, long j, java.lang.Object obj) {
        this.f16220a.putInt(obj, j, i3);
    }

    public final void o(java.lang.Object obj, long j, long j9) {
        this.f16220a.putLong(obj, j, j9);
    }

    public final void p(long j, java.lang.Object obj, java.lang.Object obj2) {
        this.f16220a.putObject(obj, j, obj2);
    }

    public boolean q() {
        sun.misc.Unsafe unsafe = this.f16220a;
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
            androidx.datastore.preferences.protobuf.k0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
