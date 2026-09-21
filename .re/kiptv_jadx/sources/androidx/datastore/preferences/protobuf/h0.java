package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends androidx.datastore.preferences.protobuf.j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16211b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(sun.misc.Unsafe unsafe, int i3) {
        super(unsafe);
        this.f16211b = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final boolean c(long j, java.lang.Object obj) {
        switch (this.f16211b) {
            case 0:
                return androidx.datastore.preferences.protobuf.k0.g ? androidx.datastore.preferences.protobuf.k0.b(j, obj) : androidx.datastore.preferences.protobuf.k0.c(j, obj);
            default:
                return androidx.datastore.preferences.protobuf.k0.g ? androidx.datastore.preferences.protobuf.k0.b(j, obj) : androidx.datastore.preferences.protobuf.k0.c(j, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final double d(long j, java.lang.Object obj) {
        switch (this.f16211b) {
            case 0:
                break;
        }
        return java.lang.Double.longBitsToDouble(g(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final float e(long j, java.lang.Object obj) {
        switch (this.f16211b) {
            case 0:
                break;
        }
        return java.lang.Float.intBitsToFloat(f(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final void j(java.lang.Object obj, long j, boolean z6) {
        switch (this.f16211b) {
            case 0:
                if (!androidx.datastore.preferences.protobuf.k0.g) {
                    androidx.datastore.preferences.protobuf.k0.l(obj, j, z6 ? (byte) 1 : (byte) 0);
                } else {
                    androidx.datastore.preferences.protobuf.k0.k(obj, j, z6 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!androidx.datastore.preferences.protobuf.k0.g) {
                    androidx.datastore.preferences.protobuf.k0.l(obj, j, z6 ? (byte) 1 : (byte) 0);
                } else {
                    androidx.datastore.preferences.protobuf.k0.k(obj, j, z6 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final void k(java.lang.Object obj, long j, byte b9) {
        switch (this.f16211b) {
            case 0:
                if (!androidx.datastore.preferences.protobuf.k0.g) {
                    androidx.datastore.preferences.protobuf.k0.l(obj, j, b9);
                } else {
                    androidx.datastore.preferences.protobuf.k0.k(obj, j, b9);
                }
                break;
            default:
                if (!androidx.datastore.preferences.protobuf.k0.g) {
                    androidx.datastore.preferences.protobuf.k0.l(obj, j, b9);
                } else {
                    androidx.datastore.preferences.protobuf.k0.k(obj, j, b9);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final void l(java.lang.Object obj, long j, double d4) {
        switch (this.f16211b) {
            case 0:
                o(obj, j, java.lang.Double.doubleToLongBits(d4));
                break;
            default:
                o(obj, j, java.lang.Double.doubleToLongBits(d4));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final void m(java.lang.Object obj, long j, float f9) {
        switch (this.f16211b) {
            case 0:
                n(java.lang.Float.floatToIntBits(f9), j, obj);
                break;
            default:
                n(java.lang.Float.floatToIntBits(f9), j, obj);
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final boolean r() {
        switch (this.f16211b) {
        }
        return false;
    }
}
