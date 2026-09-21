package F3;

/* JADX INFO: loaded from: classes.dex */
public final class v extends E3.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E3.f f3640b;

    public v(E3.f fVar) {
        this.f3640b = fVar;
    }

    public final p166t3.g a(p166t3.g gVar) {
        E3.f fVar = this.f3640b;
        fVar.getClass();
        boolean z6 = true;
        if (!gVar.f18705w && !((java.lang.Boolean) com.google.android.gms.common.api.internal.BasePendingResult.f18693x.get()).booleanValue()) {
            z6 = false;
        }
        gVar.f18705w = z6;
        F3.C0366f c0366f = fVar.j;
        c0366f.getClass();
        F3.A a2 = new F3.A(new F3.E(gVar), c0366f.f3591p.get(), fVar);
        Z3.d dVar = c0366f.f3596u;
        dVar.sendMessage(dVar.obtainMessage(4, a2));
        return gVar;
    }
}
