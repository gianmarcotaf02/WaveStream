package F3;

import com.google.android.gms.common.api.internal.BasePendingResult;

public final class v extends E3.i {

    public final E3.f f3640b;

    public v(E3.f fVar) {
        this.f3640b = fVar;
    }

    public final p166t3.g a(p166t3.g gVar) {
        E3.f fVar = this.f3640b;
        fVar.getClass();
        boolean z6 = true;
        if (!gVar.f18705w && !((Boolean) BasePendingResult.f18693x.get()).booleanValue()) {
            z6 = false;
        }
        gVar.f18705w = z6;
        C0366f c0366f = fVar.j;
        c0366f.getClass();
        A a2 = new A(new E(gVar), c0366f.f3591p.get(), fVar);
        Z3.d dVar = c0366f.f3596u;
        dVar.sendMessage(dVar.obtainMessage(4, a2));
        return gVar;
    }
}
