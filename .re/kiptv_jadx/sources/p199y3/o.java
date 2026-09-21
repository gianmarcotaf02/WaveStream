package p199y3;

/* JADX INFO: loaded from: classes.dex */
public final class o extends java.util.TimerTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p199y3.c f31881h;

    public o(p199y3.c cVar) {
        this.f31881h = cVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.BasePendingResult basePendingResultQ;
        p199y3.c cVar = this.f31881h;
        if (cVar.f31813h.isEmpty() || cVar.f31815k != null || cVar.f31808b == 0) {
            return;
        }
        java.util.ArrayDeque arrayDeque = cVar.f31813h;
        int[] iArrF = B3.AbstractC0088a.f(arrayDeque);
        p199y3.g gVar = cVar.f31809c;
        gVar.getClass();
        H3.q.d();
        if (gVar.t()) {
            p199y3.i iVar = new p199y3.i(gVar, iArrF);
            p199y3.g.u(iVar);
            basePendingResultQ = iVar;
        } else {
            basePendingResultQ = p199y3.g.q();
        }
        cVar.f31815k = basePendingResultQ;
        basePendingResultQ.o0(new p199y3.n(cVar, 1));
        arrayDeque.clear();
    }
}
