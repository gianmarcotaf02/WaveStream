package W7;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ U7.j f10757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10758i;

    public q(U7.j jVar, int i3) {
        this.f10757h = jVar;
        this.f10758i = i3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (S7.C.M(r0) == r1) goto L21;
     */
    @Override // V7.InterfaceC0982h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
        W7.p pVar;
        if (cVar instanceof W7.p) {
            pVar = (W7.p) cVar;
            int i3 = pVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pVar.j = i3 - Integer.MIN_VALUE;
            } else {
                pVar = new W7.p(this, cVar);
            }
        } else {
            pVar = new W7.p(this, cVar);
        }
        java.lang.Object obj2 = pVar.f10755h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = pVar.j;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj2);
            p078i6.z zVar = new p078i6.z(this.f10758i, obj);
            pVar.j = 1;
            if (this.f10757h.send(zVar, pVar) != aVar) {
            }
            return aVar;
        }
        if (i9 == 1) {
            com.google.common.util.concurrent.P.u0(obj2);
        } else {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj2);
        }
        return p070h6.A.f22523a;
        pVar.j = 2;
    }
}
