package p020c0;

import S7.A;
import p100l6.h;

public final class C1695n0 implements X, A {

    public final X f18288h;

    public final h f18289i;

    public C1695n0(X x9, h hVar) {
        this.f18288h = x9;
        this.f18289i = hVar;
    }

    @Override
    public final h getCoroutineContext() {
        return this.f18289i;
    }

    @Override
    public final Object getValue() {
        return this.f18288h.getValue();
    }

    @Override
    public final void setValue(Object obj) {
        this.f18288h.setValue(obj);
    }
}
