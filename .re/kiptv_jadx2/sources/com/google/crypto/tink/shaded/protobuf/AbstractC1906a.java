package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

public abstract class AbstractC1906a implements S {
    protected int memoizedHashCode;

    public abstract int b(d0 d0Var);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract AbstractC1926v d();

    public final byte[] e() {
        try {
            int iB = ((AbstractC1928x) this).b(null);
            byte[] bArr = new byte[iB];
            C1918m c1918m = new C1918m(bArr, iB);
            f(c1918m);
            if (iB - c1918m.g == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e6) {
            throw new RuntimeException(c("byte array"), e6);
        }
    }

    public abstract void f(C1918m c1918m);
}
