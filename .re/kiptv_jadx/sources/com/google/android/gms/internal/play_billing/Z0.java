package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends com.google.android.gms.internal.play_billing.AbstractC1827b1 {
    @Override // com.google.android.gms.internal.play_billing.AbstractC1827b1
    public final double a(long j, java.lang.Object obj) {
        return java.lang.Double.longBitsToDouble(this.f19307a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1827b1
    public final float b(long j, java.lang.Object obj) {
        return java.lang.Float.intBitsToFloat(this.f19307a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1827b1
    public final void c(java.lang.Object obj, long j, boolean z6) {
        if (com.google.android.gms.internal.play_billing.AbstractC1830c1.g) {
            com.google.android.gms.internal.play_billing.AbstractC1830c1.b(obj, j, z6 ? (byte) 1 : (byte) 0);
        } else {
            com.google.android.gms.internal.play_billing.AbstractC1830c1.c(obj, j, z6 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1827b1
    public final void d(java.lang.Object obj, long j, byte b9) {
        if (com.google.android.gms.internal.play_billing.AbstractC1830c1.g) {
            com.google.android.gms.internal.play_billing.AbstractC1830c1.b(obj, j, b9);
        } else {
            com.google.android.gms.internal.play_billing.AbstractC1830c1.c(obj, j, b9);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1827b1
    public final void e(java.lang.Object obj, long j, double d4) {
        this.f19307a.putLong(obj, j, java.lang.Double.doubleToLongBits(d4));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1827b1
    public final void f(java.lang.Object obj, long j, float f9) {
        this.f19307a.putInt(obj, j, java.lang.Float.floatToIntBits(f9));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1827b1
    public final boolean g(long j, java.lang.Object obj) {
        return com.google.android.gms.internal.play_billing.AbstractC1830c1.g ? com.google.android.gms.internal.play_billing.AbstractC1830c1.l(j, obj) : com.google.android.gms.internal.play_billing.AbstractC1830c1.m(j, obj);
    }
}
