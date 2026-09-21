package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1841g0 {
    protected transient int zza;

    public abstract void a(com.google.android.gms.internal.play_billing.C1866p0 c1866p0);

    public final byte[] b() {
        try {
            int iD = d();
            byte[] bArr = new byte[iD];
            com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = new com.google.android.gms.internal.play_billing.C1866p0(bArr, iD);
            a(c1866p0);
            if (iD - c1866p0.f19375o == 0) {
                return bArr;
            }
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        } catch (java.io.IOException e6) {
            throw new java.lang.RuntimeException(Y6.f.h("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e6);
        }
    }

    public abstract int c(com.google.android.gms.internal.play_billing.T0 t9);

    public abstract int d();
}
