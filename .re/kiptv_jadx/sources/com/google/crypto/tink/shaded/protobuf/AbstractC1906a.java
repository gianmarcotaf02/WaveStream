package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1906a implements com.google.crypto.tink.shaded.protobuf.S {
    protected int memoizedHashCode;

    public abstract int b(com.google.crypto.tink.shaded.protobuf.d0 d0Var);

    public final java.lang.String c(java.lang.String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract com.google.crypto.tink.shaded.protobuf.AbstractC1926v d();

    public final byte[] e() {
        try {
            int iB = ((com.google.crypto.tink.shaded.protobuf.AbstractC1928x) this).b(null);
            byte[] bArr = new byte[iB];
            com.google.crypto.tink.shaded.protobuf.C1918m c1918m = new com.google.crypto.tink.shaded.protobuf.C1918m(bArr, iB);
            f(c1918m);
            if (iB - c1918m.g == 0) {
                return bArr;
            }
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        } catch (java.io.IOException e6) {
            throw new java.lang.RuntimeException(c("byte array"), e6);
        }
    }

    public abstract void f(com.google.crypto.tink.shaded.protobuf.C1918m c1918m);
}
