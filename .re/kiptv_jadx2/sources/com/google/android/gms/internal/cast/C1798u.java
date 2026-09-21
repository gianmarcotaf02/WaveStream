package com.google.android.gms.internal.cast;

import B3.C0089b;

public final class C1798u implements p059g4.c, p059g4.b {

    public final p059g4.d f19095h;

    public C1798u(p059g4.d dVar) {
        this.f19095h = dVar;
    }

    @Override
    public void onFailure(Exception exc) {
        C1806w.f19161d.a(exc, "get checkbox consent failed", new Object[0]);
        this.f19095h.d(Boolean.FALSE);
    }

    @Override
    public void onSuccess(Object obj) {
        K k9 = (K) obj;
        C0089b c0089b = C1806w.f19161d;
        boolean z6 = false;
        if (k9 != null) {
            N n3 = k9.f18781a.f18805h;
            H3.q.g(n3);
            if (n3.f18797h == 1) {
                z6 = true;
            }
        }
        this.f19095h.d(Boolean.valueOf(z6));
    }
}
