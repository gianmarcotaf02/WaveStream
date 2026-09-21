package com.google.android.gms.internal.play_billing;

import java.io.IOException;

public abstract class AbstractC1841g0 {
    protected transient int zza;

    public abstract void a(C1866p0 c1866p0);

    public final byte[] b() {
        try {
            int iD = d();
            byte[] bArr = new byte[iD];
            C1866p0 c1866p0 = new C1866p0(bArr, iD);
            a(c1866p0);
            if (iD - c1866p0.f19375o == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e6) {
            throw new RuntimeException(Y6.f.h("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e6);
        }
    }

    public abstract int c(T0 t9);

    public abstract int d();
}
