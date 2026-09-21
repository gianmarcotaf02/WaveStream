package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends androidx.datastore.preferences.protobuf.j0 {
    @Override // androidx.datastore.preferences.protobuf.j0
    public final boolean c(long j, java.lang.Object obj) {
        return this.f16220a.getBoolean(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final double d(long j, java.lang.Object obj) {
        return this.f16220a.getDouble(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final float e(long j, java.lang.Object obj) {
        return this.f16220a.getFloat(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final void j(java.lang.Object obj, long j, boolean z6) {
        this.f16220a.putBoolean(obj, j, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final void k(java.lang.Object obj, long j, byte b9) {
        this.f16220a.putByte(obj, j, b9);
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final void l(java.lang.Object obj, long j, double d4) {
        this.f16220a.putDouble(obj, j, d4);
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final void m(java.lang.Object obj, long j, float f9) {
        this.f16220a.putFloat(obj, j, f9);
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            java.lang.Class<?> cls = this.f16220a.getClass();
            java.lang.Class cls2 = java.lang.Long.TYPE;
            cls.getMethod("getByte", java.lang.Object.class, cls2);
            cls.getMethod("putByte", java.lang.Object.class, cls2, java.lang.Byte.TYPE);
            cls.getMethod("getBoolean", java.lang.Object.class, cls2);
            cls.getMethod("putBoolean", java.lang.Object.class, cls2, java.lang.Boolean.TYPE);
            cls.getMethod("getFloat", java.lang.Object.class, cls2);
            cls.getMethod("putFloat", java.lang.Object.class, cls2, java.lang.Float.TYPE);
            cls.getMethod("getDouble", java.lang.Object.class, cls2);
            cls.getMethod("putDouble", java.lang.Object.class, cls2, java.lang.Double.TYPE);
            return true;
        } catch (java.lang.Throwable th) {
            androidx.datastore.preferences.protobuf.k0.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final boolean r() {
        sun.misc.Unsafe unsafe = this.f16220a;
        if (unsafe != null) {
            try {
                java.lang.Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                java.lang.Class cls2 = java.lang.Long.TYPE;
                cls.getMethod("getLong", java.lang.Object.class, cls2);
                if (androidx.datastore.preferences.protobuf.k0.g() != null) {
                    try {
                        java.lang.Class<?> cls3 = this.f16220a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, java.lang.Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, java.lang.Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", java.lang.Object.class, cls2, java.lang.Object.class, cls2, cls2);
                        return true;
                    } catch (java.lang.Throwable th) {
                        androidx.datastore.preferences.protobuf.k0.a(th);
                        return false;
                    }
                }
            } catch (java.lang.Throwable th2) {
                androidx.datastore.preferences.protobuf.k0.a(th2);
            }
        }
        return false;
    }
}
