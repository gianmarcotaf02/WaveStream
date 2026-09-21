package S;

/* JADX INFO: loaded from: classes.dex */
public final class s extends p137q0.o implements Q0.InterfaceC0774h, Q0.InterfaceC0780n, Q0.InterfaceC0775i {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public S.d f9159v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public J.X f9160w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public U.i0 f9161x;
    public final p020c0.C1681g0 y = p020c0.AbstractC1703s.y(null);

    public s(S.d dVar, J.X x9, U.i0 i0Var) {
        this.f9159v = dVar;
        this.f9160w = x9;
        this.f9161x = i0Var;
    }

    @Override // p137q0.o
    public final void F0() {
        S.d dVar = this.f9159v;
        if (dVar.f9117a != null) {
            A.b.c("Expected textInputModifierNode to be null");
        }
        dVar.f9117a = this;
    }

    @Override // p137q0.o
    public final void G0() {
        this.f9159v.k(this);
    }

    @Override // Q0.InterfaceC0780n
    public final void y0(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
        this.y.setValue(nodeCoordinator);
    }
}
