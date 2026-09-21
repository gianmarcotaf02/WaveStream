package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

public final class I extends J {
    @Override
    public final void a(long j, Object obj) {
        ((AbstractC1907b) ((A) p0.f19569c.i(j, obj))).f19514h = false;
    }

    @Override
    public final void b(long j, Object obj, Object obj2) {
        o0 o0Var = p0.f19569c;
        A aG = (A) o0Var.i(j, obj);
        A a2 = (A) o0Var.i(j, obj2);
        int size = aG.size();
        int size2 = a2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1907b) aG).f19514h) {
                aG = aG.g(size2 + size);
            }
            aG.addAll(a2);
        }
        if (size > 0) {
            a2 = aG;
        }
        p0.p(j, obj, a2);
    }

    @Override
    public final List c(long j, Object obj) {
        A a2 = (A) p0.f19569c.i(j, obj);
        if (((AbstractC1907b) a2).f19514h) {
            return a2;
        }
        int size = a2.size();
        A aG = a2.g(size == 0 ? 10 : size * 2);
        p0.p(j, obj, aG);
        return aG;
    }
}
