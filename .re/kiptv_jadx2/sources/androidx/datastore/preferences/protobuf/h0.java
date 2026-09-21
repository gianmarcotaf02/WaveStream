package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

public final class h0 extends j0 {

    public final int f16211b;

    public h0(Unsafe unsafe, int i3) {
        super(unsafe);
        this.f16211b = i3;
    }

    @Override
    public final boolean c(long j, Object obj) {
        switch (this.f16211b) {
            case 0:
                return k0.g ? k0.b(j, obj) : k0.c(j, obj);
            default:
                return k0.g ? k0.b(j, obj) : k0.c(j, obj);
        }
    }

    @Override
    public final double d(long j, Object obj) {
        switch (this.f16211b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override
    public final float e(long j, Object obj) {
        switch (this.f16211b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override
    public final void j(Object obj, long j, boolean z6) {
        switch (this.f16211b) {
            case 0:
                if (!k0.g) {
                    k0.l(obj, j, z6 ? (byte) 1 : (byte) 0);
                } else {
                    k0.k(obj, j, z6 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!k0.g) {
                    k0.l(obj, j, z6 ? (byte) 1 : (byte) 0);
                } else {
                    k0.k(obj, j, z6 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override
    public final void k(Object obj, long j, byte b9) {
        switch (this.f16211b) {
            case 0:
                if (!k0.g) {
                    k0.l(obj, j, b9);
                } else {
                    k0.k(obj, j, b9);
                }
                break;
            default:
                if (!k0.g) {
                    k0.l(obj, j, b9);
                } else {
                    k0.k(obj, j, b9);
                }
                break;
        }
    }

    @Override
    public final void l(Object obj, long j, double d4) {
        switch (this.f16211b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d4));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d4));
                break;
        }
    }

    @Override
    public final void m(Object obj, long j, float f9) {
        switch (this.f16211b) {
            case 0:
                n(Float.floatToIntBits(f9), j, obj);
                break;
            default:
                n(Float.floatToIntBits(f9), j, obj);
                break;
        }
    }

    @Override
    public final boolean r() {
        switch (this.f16211b) {
        }
        return false;
    }
}
