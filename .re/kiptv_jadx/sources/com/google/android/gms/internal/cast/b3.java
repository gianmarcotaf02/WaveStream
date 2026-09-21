package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class b3 extends com.google.android.gms.internal.cast.d3 {
    @Override // com.google.android.gms.internal.cast.d3
    public final double a(long j, java.lang.Object obj) {
        return java.lang.Double.longBitsToDouble(this.f18889a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.cast.d3
    public final float b(long j, java.lang.Object obj) {
        return java.lang.Float.intBitsToFloat(this.f18889a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.cast.d3
    public final void c(java.lang.Object obj, long j, boolean z6) {
        if (com.google.android.gms.internal.cast.e3.g) {
            com.google.android.gms.internal.cast.e3.b(obj, j, z6 ? (byte) 1 : (byte) 0);
        } else {
            com.google.android.gms.internal.cast.e3.c(obj, j, z6 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast.d3
    public final void d(java.lang.Object obj, long j, byte b9) {
        if (com.google.android.gms.internal.cast.e3.g) {
            com.google.android.gms.internal.cast.e3.b(obj, j, b9);
        } else {
            com.google.android.gms.internal.cast.e3.c(obj, j, b9);
        }
    }

    @Override // com.google.android.gms.internal.cast.d3
    public final void e(java.lang.Object obj, long j, double d4) {
        this.f18889a.putLong(obj, j, java.lang.Double.doubleToLongBits(d4));
    }

    @Override // com.google.android.gms.internal.cast.d3
    public final void f(java.lang.Object obj, long j, float f9) {
        this.f18889a.putInt(obj, j, java.lang.Float.floatToIntBits(f9));
    }

    @Override // com.google.android.gms.internal.cast.d3
    public final boolean g(long j, java.lang.Object obj) {
        return com.google.android.gms.internal.cast.e3.g ? com.google.android.gms.internal.cast.e3.l(j, obj) : com.google.android.gms.internal.cast.e3.m(j, obj);
    }
}
