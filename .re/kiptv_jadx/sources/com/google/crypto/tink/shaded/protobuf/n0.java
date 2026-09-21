package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends com.google.crypto.tink.shaded.protobuf.o0 {
    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final boolean c(long j, java.lang.Object obj) {
        return this.f19564a.getBoolean(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final byte d(long j, java.lang.Object obj) {
        return this.f19564a.getByte(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final double e(long j, java.lang.Object obj) {
        return this.f19564a.getDouble(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final float f(long j, java.lang.Object obj) {
        return this.f19564a.getFloat(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final void k(java.lang.Object obj, long j, boolean z6) {
        this.f19564a.putBoolean(obj, j, z6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final void l(java.lang.Object obj, long j, byte b9) {
        this.f19564a.putByte(obj, j, b9);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final void m(java.lang.Object obj, long j, double d4) {
        this.f19564a.putDouble(obj, j, d4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final void n(java.lang.Object obj, long j, float f9) {
        this.f19564a.putFloat(obj, j, f9);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            java.lang.Class<?> cls = this.f19564a.getClass();
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
            com.google.crypto.tink.shaded.protobuf.p0.a(th);
            return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final boolean s() {
        sun.misc.Unsafe unsafe = this.f19564a;
        if (unsafe != null) {
            try {
                java.lang.Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                java.lang.Class cls2 = java.lang.Long.TYPE;
                cls.getMethod("getLong", java.lang.Object.class, cls2);
                if (com.google.crypto.tink.shaded.protobuf.p0.e() != null) {
                    try {
                        java.lang.Class<?> cls3 = this.f19564a.getClass();
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
                        com.google.crypto.tink.shaded.protobuf.p0.a(th);
                        return false;
                    }
                }
            } catch (java.lang.Throwable th2) {
                com.google.crypto.tink.shaded.protobuf.p0.a(th2);
            }
        }
        return false;
    }
}
