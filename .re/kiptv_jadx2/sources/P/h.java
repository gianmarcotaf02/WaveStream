package P;

import J.D;
import K0.C0667o;
import K0.N;
import K0.U;
import Q0.AbstractC0776j;
import Q0.InterfaceC0774h;
import Q0.InterfaceC0780n;
import U.X;
import androidx.compose.ui.node.NodeCoordinator;
import p020c0.C1676e;
import p020c0.C1681g0;

public final class h extends AbstractC0776j implements InterfaceC0774h, InterfaceC0780n {

    public X f8083x;
    public final C1681g0 y = new C1681g0(null, C1676e.f18240k);

    public h(X x9) {
        this.f8083x = x9;
        D d4 = new D(1, this);
        C0667o c0667o = N.f6662a;
        N0(new U(null, null, d4));
    }

    @Override
    public final void y0(NodeCoordinator nodeCoordinator) {
        this.y.setValue(nodeCoordinator);
    }
}
