package p142q7;

import C7.AbstractC0191x;
import E7.k;
import E7.l;
import N6.B;
import kotlin.jvm.internal.m;
import p070h6.A;

public final class j extends g {

    public final String f26660b;

    public j(String str) {
        super(A.f22523a);
        this.f26660b = str;
    }

    @Override
    public final AbstractC0191x a(B module) {
        m.e(module, "module");
        return l.c(k.f3250A, this.f26660b);
    }

    @Override
    public final Object b() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final String toString() {
        return this.f26660b;
    }
}
