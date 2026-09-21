package t8;

import Y2.C1038h;
import com.google.common.util.concurrent.P;
import p070h6.C2180b;

public final class F extends p117n6.h implements p194x6.n {

    public int f28566i;
    public C2180b j;

    public final C1038h f28567k;

    public F(C1038h c1038h, p100l6.c cVar) {
        super(3, cVar);
        this.f28567k = c1038h;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        F f9 = new F(this.f28567k, (p100l6.c) obj3);
        f9.j = (C2180b) obj;
        return f9.invokeSuspend(p070h6.A.f22523a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f28566i;
        if (i3 == 0) {
            P.u0(obj);
            C2180b c2180b = this.j;
            C1038h c1038h = this.f28567k;
            AbstractC2851a abstractC2851a = (AbstractC2851a) c1038h.f11470c;
            byte bW = abstractC2851a.w();
            if (bW == 1) {
                return c1038h.l(true);
            }
            if (bW == 0) {
                return c1038h.l(false);
            }
            if (bW != 6) {
                if (bW == 8) {
                    return c1038h.k();
                }
                AbstractC2851a.r(abstractC2851a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f28566i = 1;
            obj = C1038h.d(c1038h, c2180b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
        }
        return (kotlinx.serialization.json.b) obj;
    }
}
