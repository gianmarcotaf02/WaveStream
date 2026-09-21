package p117n6;

import kotlin.jvm.internal.B;
import kotlin.jvm.internal.InterfaceC2543h;
import kotlin.jvm.internal.m;
import p100l6.c;

public abstract class i extends c implements InterfaceC2543h {
    private final int arity;

    public i(int i3, c cVar) {
        super(cVar);
        this.arity = i3;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strI = B.f24540a.i(this);
        m.d(strI, "renderLambdaToString(...)");
        return strI;
    }
}
