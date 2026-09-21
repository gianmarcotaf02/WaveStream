package p117n6;

import kotlin.jvm.internal.B;
import kotlin.jvm.internal.InterfaceC2543h;
import kotlin.jvm.internal.m;
import p100l6.c;

public abstract class h extends g implements InterfaceC2543h {

    public final int f25834h;

    public h(int i3, c cVar) {
        super(cVar);
        this.f25834h = i3;
    }

    @Override
    public final int getArity() {
        return this.f25834h;
    }

    @Override
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strI = B.f24540a.i(this);
        m.d(strI, "renderLambdaToString(...)");
        return strI;
    }
}
