package S;

import J.X;
import Q0.InterfaceC0774h;
import Q0.InterfaceC0775i;
import Q0.InterfaceC0780n;
import U.i0;
import androidx.compose.ui.node.NodeCoordinator;
import p020c0.AbstractC1703s;
import p020c0.C1681g0;

public final class s extends p137q0.o implements InterfaceC0774h, InterfaceC0780n, InterfaceC0775i {

    public d f9159v;

    public X f9160w;

    public i0 f9161x;
    public final C1681g0 y = AbstractC1703s.y(null);

    public s(d dVar, X x9, i0 i0Var) {
        this.f9159v = dVar;
        this.f9160w = x9;
        this.f9161x = i0Var;
    }

    @Override
    public final void F0() {
        d dVar = this.f9159v;
        if (dVar.f9117a != null) {
            A.b.c("Expected textInputModifierNode to be null");
        }
        dVar.f9117a = this;
    }

    @Override
    public final void G0() {
        this.f9159v.k(this);
    }

    @Override
    public final void y0(NodeCoordinator nodeCoordinator) {
        this.y.setValue(nodeCoordinator);
    }
}
