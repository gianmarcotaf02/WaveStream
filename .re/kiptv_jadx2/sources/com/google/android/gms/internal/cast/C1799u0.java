package com.google.android.gms.internal.cast;

import B3.C0089b;
import android.os.Parcel;
import java.io.IOException;
import p191x3.C3100a;

public final class C1799u0 implements P2, p013b3.d, F3.l, T {

    public static final C1799u0 f19096i = new C1799u0(0);
    public static final C1799u0 j = new C1799u0(1);

    public static final C1799u0 f19097k = new C1799u0(2);

    public static final C1799u0 f19098l = new C1799u0(3);

    public static final C1799u0 f19099m = new C1799u0(4);

    public static final C1799u0 f19100n = new C1799u0(5);

    public static final C1799u0 f19101o = new C1799u0(6);

    public static final C1799u0 f19102p = new C1799u0(7);

    public final int f19103h;

    public C1799u0(int i3) {
        this.f19103h = i3;
    }

    @Override
    public void K(Object obj, Object obj2) {
        I i3 = new I((p059g4.d) obj2);
        P p2 = (P) ((S) obj).p();
        Parcel parcelY = p2.Y();
        AbstractC1818z.d(parcelY, i3);
        p2.a0(parcelY, 2);
    }

    @Override
    public W2 a(Class cls) {
        switch (this.f19103h) {
            case 3:
                if (!E2.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (W2) E2.m(cls.asSubclass(E2.class)).j(3, null);
                } catch (Exception e6) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override
    public Object apply(Object obj) {
        L0 l2 = (L0) obj;
        try {
            int iK = l2.k();
            byte[] bArr = new byte[iK];
            A2 a2 = new A2(bArr, iK);
            X2 x2A = U2.f18826c.a(L0.class);
            N2 n3 = a2.f18741k;
            if (n3 == null) {
                n3 = new N2(a2);
            }
            x2A.d(l2, n3);
            if (iK - a2.f18744n == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e6) {
            throw new RuntimeException(Y6.f.h("Serializing ", L0.class.getName(), " to a byte array threw an IOException (should never happen)."), e6);
        }
    }

    @Override
    public boolean b(Class cls) {
        switch (this.f19103h) {
            case 3:
                return E2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override
    public Object c() {
        switch (this.f19103h) {
            case 10:
                throw new IllegalStateException();
            default:
                C0089b c0089b = m3.f18982u;
                C0089b c0089b2 = C3100a.j;
                H3.q.d();
                C3100a c3100a = C3100a.f31157l;
                H3.q.g(c3100a);
                H3.q.d();
                return c3100a.f31161d.f31168h;
        }
    }

    public C1799u0(J j9) {
        this.f19103h = 9;
    }
}
