package kotlin.jvm.internal;

import java.io.Serializable;

public abstract class o implements InterfaceC2543h, Serializable {
    private final int arity;

    public o(int i3) {
        this.arity = i3;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strJ = B.f24540a.j(this);
        m.d(strJ, "renderLambdaToString(...)");
        return strJ;
    }
}
