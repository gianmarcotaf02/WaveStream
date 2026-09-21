package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends com.google.crypto.tink.shaded.protobuf.o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19562b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(sun.misc.Unsafe unsafe, int i3) {
        super(unsafe);
        this.f19562b = i3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final boolean c(long j, java.lang.Object obj) {
        switch (this.f19562b) {
            case 0:
                if (com.google.crypto.tink.shaded.protobuf.p0.g) {
                    if (com.google.crypto.tink.shaded.protobuf.p0.h(j, obj) == 0) {
                        return false;
                    }
                } else if (com.google.crypto.tink.shaded.protobuf.p0.i(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (com.google.crypto.tink.shaded.protobuf.p0.g) {
                    if (com.google.crypto.tink.shaded.protobuf.p0.h(j, obj) == 0) {
                        return false;
                    }
                } else if (com.google.crypto.tink.shaded.protobuf.p0.i(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final byte d(long j, java.lang.Object obj) {
        switch (this.f19562b) {
            case 0:
                return com.google.crypto.tink.shaded.protobuf.p0.g ? com.google.crypto.tink.shaded.protobuf.p0.h(j, obj) : com.google.crypto.tink.shaded.protobuf.p0.i(j, obj);
            default:
                return com.google.crypto.tink.shaded.protobuf.p0.g ? com.google.crypto.tink.shaded.protobuf.p0.h(j, obj) : com.google.crypto.tink.shaded.protobuf.p0.i(j, obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final double e(long j, java.lang.Object obj) {
        switch (this.f19562b) {
            case 0:
                break;
        }
        return java.lang.Double.longBitsToDouble(h(j, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final float f(long j, java.lang.Object obj) {
        switch (this.f19562b) {
            case 0:
                break;
        }
        return java.lang.Float.intBitsToFloat(g(j, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final void k(java.lang.Object obj, long j, boolean z6) {
        switch (this.f19562b) {
            case 0:
                if (!com.google.crypto.tink.shaded.protobuf.p0.g) {
                    com.google.crypto.tink.shaded.protobuf.p0.m(obj, j, z6 ? (byte) 1 : (byte) 0);
                } else {
                    com.google.crypto.tink.shaded.protobuf.p0.l(obj, j, z6 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!com.google.crypto.tink.shaded.protobuf.p0.g) {
                    com.google.crypto.tink.shaded.protobuf.p0.m(obj, j, z6 ? (byte) 1 : (byte) 0);
                } else {
                    com.google.crypto.tink.shaded.protobuf.p0.l(obj, j, z6 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final void l(java.lang.Object obj, long j, byte b9) {
        switch (this.f19562b) {
            case 0:
                if (!com.google.crypto.tink.shaded.protobuf.p0.g) {
                    com.google.crypto.tink.shaded.protobuf.p0.m(obj, j, b9);
                } else {
                    com.google.crypto.tink.shaded.protobuf.p0.l(obj, j, b9);
                }
                break;
            default:
                if (!com.google.crypto.tink.shaded.protobuf.p0.g) {
                    com.google.crypto.tink.shaded.protobuf.p0.m(obj, j, b9);
                } else {
                    com.google.crypto.tink.shaded.protobuf.p0.l(obj, j, b9);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final void m(java.lang.Object obj, long j, double d4) {
        switch (this.f19562b) {
            case 0:
                p(obj, j, java.lang.Double.doubleToLongBits(d4));
                break;
            default:
                p(obj, j, java.lang.Double.doubleToLongBits(d4));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final void n(java.lang.Object obj, long j, float f9) {
        switch (this.f19562b) {
            case 0:
                o(java.lang.Float.floatToIntBits(f9), j, obj);
                break;
            default:
                o(java.lang.Float.floatToIntBits(f9), j, obj);
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final boolean s() {
        switch (this.f19562b) {
        }
        return false;
    }
}
