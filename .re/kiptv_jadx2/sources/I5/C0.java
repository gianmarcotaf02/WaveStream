package I5;

import com.kiptv.core.model.TMDBSeasonDetail;
import p005a5.C1451x5;

public final class C0 extends p117n6.i implements p194x6.n {

    public int f4676h;

    public int f4677i;
    public int j;

    public final D0 f4678k;

    public C0(D0 d4, p100l6.c cVar) {
        super(3, cVar);
        this.f4678k = d4;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        C0 c9 = new C0(this.f4678k, (p100l6.c) obj3);
        c9.f4677i = iIntValue;
        c9.j = iIntValue2;
        return c9.invokeSuspend(p070h6.A.f22523a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f4676h;
        try {
            if (i3 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                int i9 = this.f4677i;
                int i10 = this.j;
                C1451x5 c1451x5 = this.f4678k.f4695c;
                this.f4676h = 1;
                obj = c1451x5.v(i9, i10, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            return (TMDBSeasonDetail) obj;
        } catch (Exception unused) {
            return null;
        }
    }
}
