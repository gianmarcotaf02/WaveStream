package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1503j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f16219b;

    public static int d(int i3) {
        return (-(i3 & 1)) ^ (i3 >>> 1);
    }

    public static long e(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static com.google.crypto.tink.shaded.protobuf.C1916k h(byte[] bArr, int i3, int i9, boolean z6) {
        com.google.crypto.tink.shaded.protobuf.C1916k c1916k = new com.google.crypto.tink.shaded.protobuf.C1916k(bArr, i3, i9, z6);
        try {
            c1916k.l(i9);
            return c1916k;
        } catch (com.google.crypto.tink.shaded.protobuf.D e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    public abstract java.lang.String A();

    public abstract java.lang.String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i3);

    public void G() {
        boolean zF;
        do {
            int iC = C();
            if (iC == 0) {
                return;
            }
            int i3 = this.f16218a;
            if (i3 >= 100) {
                throw new androidx.datastore.preferences.protobuf.C1518z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f16218a = i3 + 1;
            zF = F(iC);
            this.f16218a--;
        } while (zF);
    }

    public java.nio.ByteBuffer a(byte[] bArr, int i3) {
        int[] iArrC = c(p140q4.a.c(bArr), i3);
        int[] iArr = (int[]) iArrC.clone();
        p140q4.a.b(iArr);
        for (int i9 = 0; i9 < iArrC.length; i9++) {
            iArrC[i9] = iArrC[i9] + iArr[i9];
        }
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(64).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrC, 0, 16);
        return byteBufferOrder;
    }

    public abstract void b(int i3);

    public abstract int[] c(int[] iArr, int i3);

    public abstract int f();

    public abstract boolean g();

    public abstract int i();

    public abstract void j(int i3);

    public void k(byte[] bArr, java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2) throws java.security.GeneralSecurityException {
        if (bArr.length != i()) {
            throw new java.security.GeneralSecurityException("The nonce length (in bytes) must be " + i());
        }
        int iRemaining = byteBuffer2.remaining();
        int i3 = iRemaining / 64;
        int i9 = i3 + 1;
        for (int i10 = 0; i10 < i9; i10++) {
            java.nio.ByteBuffer byteBufferA = a(bArr, this.f16218a + i10);
            if (i10 == i3) {
                B4.k.r(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                B4.k.r(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    public abstract int l(int i3);

    public abstract boolean m();

    public abstract androidx.datastore.preferences.protobuf.C1500g n();

    public abstract com.google.crypto.tink.shaded.protobuf.C1914i o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}
