package F2;

import E2.o;
import E2.w;
import S2.q;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Success;
import com.google.common.util.concurrent.P;

public final class j {

    public static final j f3538a = new j();

    public final Object a(o oVar, S2.h hVar, p117n6.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i3 = iVar.f3537k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.f3537k = i3 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objB = iVar.f3536i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = iVar.f3537k;
        if (i9 == 0) {
            P.u0(objB);
            iVar.f3535h = hVar;
            iVar.f3537k = 1;
            objB = ((w) oVar).b(hVar, iVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = iVar.f3535h;
            P.u0(objB);
        }
        S2.k kVar = (S2.k) objB;
        if (kVar instanceof q) {
            q qVar = (q) kVar;
            return new AsyncImagePainter$State$Success(p199y3.e.i(qVar.f9292a, hVar.f9253a, 1), qVar);
        }
        if (!(kVar instanceof S2.d)) {
            throw new I3.b();
        }
        S2.d dVar = (S2.d) kVar;
        E2.l lVar = dVar.f9216a;
        return new AsyncImagePainter$State$Error(lVar != null ? p199y3.e.i(lVar, hVar.f9253a, 1) : null, dVar);
    }
}
