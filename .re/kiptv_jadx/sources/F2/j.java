package F2;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F2.j f3538a = new F2.j();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(E2.o oVar, S2.h hVar, p117n6.c cVar) {
        F2.i iVar;
        if (cVar instanceof F2.i) {
            iVar = (F2.i) cVar;
            int i3 = iVar.f3537k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.f3537k = i3 - Integer.MIN_VALUE;
            } else {
                iVar = new F2.i(this, cVar);
            }
        } else {
            iVar = new F2.i(this, cVar);
        }
        java.lang.Object objB = iVar.f3536i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = iVar.f3537k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objB);
            iVar.f3535h = hVar;
            iVar.f3537k = 1;
            objB = ((E2.w) oVar).b(hVar, iVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = iVar.f3535h;
            com.google.common.util.concurrent.P.u0(objB);
        }
        S2.k kVar = (S2.k) objB;
        if (kVar instanceof S2.q) {
            S2.q qVar = (S2.q) kVar;
            return new coil3.compose.AsyncImagePainter$State$Success(p199y3.e.i(qVar.f9292a, hVar.f9253a, 1), qVar);
        }
        if (!(kVar instanceof S2.d)) {
            throw new I3.b();
        }
        S2.d dVar = (S2.d) kVar;
        E2.l lVar = dVar.f9216a;
        return new coil3.compose.AsyncImagePainter$State$Error(lVar != null ? p199y3.e.i(lVar, hVar.f9253a, 1) : null, dVar);
    }
}
