package X7;

import S7.AbstractC0876a;
import S7.C;
import S7.J;
import com.google.common.util.concurrent.P;

public class p extends AbstractC0876a implements p117n6.d {

    public final p100l6.c f10932k;

    public p(p100l6.c cVar, p100l6.h hVar) {
        super(hVar, true, true);
        this.f10932k = cVar;
    }

    @Override
    public final boolean I() {
        return true;
    }

    @Override
    public void f(Object obj) throws J {
        a.h(C.C(obj), P.h0(this.f10932k));
    }

    @Override
    public final p117n6.d getCallerFrame() {
        p100l6.c cVar = this.f10932k;
        if (cVar instanceof p117n6.d) {
            return (p117n6.d) cVar;
        }
        return null;
    }

    @Override
    public void h(Object obj) {
        this.f10932k.resumeWith(C.C(obj));
    }

    public void c0() {
    }
}
