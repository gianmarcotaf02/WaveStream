package com.google.android.gms.internal.play_billing;

public final class Z0 extends AbstractC1827b1 {
    @Override
    public final double a(long j, Object obj) {
        return Double.longBitsToDouble(this.f19307a.getLong(obj, j));
    }

    @Override
    public final float b(long j, Object obj) {
        return Float.intBitsToFloat(this.f19307a.getInt(obj, j));
    }

    @Override
    public final void c(Object obj, long j, boolean z6) {
        if (AbstractC1830c1.g) {
            AbstractC1830c1.b(obj, j, z6 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC1830c1.c(obj, j, z6 ? (byte) 1 : (byte) 0);
        }
    }

    @Override
    public final void d(Object obj, long j, byte b9) {
        if (AbstractC1830c1.g) {
            AbstractC1830c1.b(obj, j, b9);
        } else {
            AbstractC1830c1.c(obj, j, b9);
        }
    }

    @Override
    public final void e(Object obj, long j, double d4) {
        this.f19307a.putLong(obj, j, Double.doubleToLongBits(d4));
    }

    @Override
    public final void f(Object obj, long j, float f9) {
        this.f19307a.putInt(obj, j, Float.floatToIntBits(f9));
    }

    @Override
    public final boolean g(long j, Object obj) {
        return AbstractC1830c1.g ? AbstractC1830c1.l(j, obj) : AbstractC1830c1.m(j, obj);
    }
}
