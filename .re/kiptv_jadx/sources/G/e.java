package G;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p137q0.o {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public G.c f3746v;

    @Override // p137q0.o
    public final boolean C0() {
        return false;
    }

    @Override // p137q0.o
    public final void F0() {
        G.c cVar = this.f3746v;
        if (cVar != null) {
            cVar.f3745a.l(this);
        }
        if (cVar != null) {
            cVar.f3745a.c(this);
        }
        this.f3746v = cVar;
    }

    @Override // p137q0.o
    public final void G0() {
        G.c cVar = this.f3746v;
        if (cVar != null) {
            kotlin.jvm.internal.m.c(cVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            cVar.f3745a.l(this);
        }
    }
}
