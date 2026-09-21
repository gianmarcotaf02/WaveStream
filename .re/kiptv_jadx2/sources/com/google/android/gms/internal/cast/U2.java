package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

public final class U2 {

    public static final U2 f18826c = new U2();

    public final ConcurrentHashMap f18828b = new ConcurrentHashMap();

    public final N2 f18827a = new N2();

    public final X2 a(Class cls) {
        X2 x2K;
        Charset charset = J2.f18779a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f18828b;
        X2 x9 = (X2) concurrentHashMap.get(cls);
        if (x9 != null) {
            return x9;
        }
        N2 n3 = this.f18827a;
        n3.getClass();
        C1799u0 c1799u0 = Y2.f18851a;
        E2.class.isAssignableFrom(cls);
        W2 w2A = ((N2) n3.f18803h).a(cls);
        if ((w2A.f18843d & 2) == 2) {
            C1799u0 c1799u1 = Y2.f18851a;
            C1799u0 c1799u2 = B2.f18746a;
            x2K = new S2(c1799u1, w2A.f18840a);
        } else {
            int i3 = T2.f18821a;
            int i9 = L2.f18794a;
            C1799u0 c1799u3 = Y2.f18851a;
            C1799u0 c1799u4 = w2A.a() + (-1) != 1 ? B2.f18746a : null;
            int i10 = O2.f18804a;
            x2K = R2.k(w2A, c1799u3, c1799u4);
        }
        X2 x10 = (X2) concurrentHashMap.putIfAbsent(cls, x2K);
        return x10 == null ? x2K : x10;
    }
}
