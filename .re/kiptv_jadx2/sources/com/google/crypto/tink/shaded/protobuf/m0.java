package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

public final class m0 extends o0 {

    public final int f19562b;

    public m0(Unsafe unsafe, int i3) {
        super(unsafe);
        this.f19562b = i3;
    }

    @Override
    public final boolean c(long j, Object obj) {
        switch (this.f19562b) {
            case 0:
                if (p0.g) {
                    if (p0.h(j, obj) == 0) {
                        return false;
                    }
                } else if (p0.i(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (p0.g) {
                    if (p0.h(j, obj) == 0) {
                        return false;
                    }
                } else if (p0.i(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final byte d(long j, Object obj) {
        switch (this.f19562b) {
            case 0:
                return p0.g ? p0.h(j, obj) : p0.i(j, obj);
            default:
                return p0.g ? p0.h(j, obj) : p0.i(j, obj);
        }
    }

    @Override
    public final double e(long j, Object obj) {
        switch (this.f19562b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override
    public final float f(long j, Object obj) {
        switch (this.f19562b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override
    public final void k(Object obj, long j, boolean z6) {
        switch (this.f19562b) {
            case 0:
                if (!p0.g) {
                    p0.m(obj, j, z6 ? (byte) 1 : (byte) 0);
                } else {
                    p0.l(obj, j, z6 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!p0.g) {
                    p0.m(obj, j, z6 ? (byte) 1 : (byte) 0);
                } else {
                    p0.l(obj, j, z6 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override
    public final void l(Object obj, long j, byte b9) {
        switch (this.f19562b) {
            case 0:
                if (!p0.g) {
                    p0.m(obj, j, b9);
                } else {
                    p0.l(obj, j, b9);
                }
                break;
            default:
                if (!p0.g) {
                    p0.m(obj, j, b9);
                } else {
                    p0.l(obj, j, b9);
                }
                break;
        }
    }

    @Override
    public final void m(Object obj, long j, double d4) {
        switch (this.f19562b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d4));
                break;
            default:
                p(obj, j, Double.doubleToLongBits(d4));
                break;
        }
    }

    @Override
    public final void n(Object obj, long j, float f9) {
        switch (this.f19562b) {
            case 0:
                o(Float.floatToIntBits(f9), j, obj);
                break;
            default:
                o(Float.floatToIntBits(f9), j, obj);
                break;
        }
    }

    @Override
    public final boolean s() {
        switch (this.f19562b) {
        }
        return false;
    }
}
