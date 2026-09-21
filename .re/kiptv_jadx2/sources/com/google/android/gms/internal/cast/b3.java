package com.google.android.gms.internal.cast;

public final class b3 extends d3 {
    @Override
    public final double a(long j, Object obj) {
        return Double.longBitsToDouble(this.f18889a.getLong(obj, j));
    }

    @Override
    public final float b(long j, Object obj) {
        return Float.intBitsToFloat(this.f18889a.getInt(obj, j));
    }

    @Override
    public final void c(Object obj, long j, boolean z6) {
        if (e3.g) {
            e3.b(obj, j, z6 ? (byte) 1 : (byte) 0);
        } else {
            e3.c(obj, j, z6 ? (byte) 1 : (byte) 0);
        }
    }

    @Override
    public final void d(Object obj, long j, byte b9) {
        if (e3.g) {
            e3.b(obj, j, b9);
        } else {
            e3.c(obj, j, b9);
        }
    }

    @Override
    public final void e(Object obj, long j, double d4) {
        this.f18889a.putLong(obj, j, Double.doubleToLongBits(d4));
    }

    @Override
    public final void f(Object obj, long j, float f9) {
        this.f18889a.putInt(obj, j, Float.floatToIntBits(f9));
    }

    @Override
    public final boolean g(long j, Object obj) {
        return e3.g ? e3.l(j, obj) : e3.m(j, obj);
    }
}
