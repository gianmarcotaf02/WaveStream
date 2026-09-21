package P;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Q0.AbstractC0776j implements Q0.InterfaceC0774h, Q0.InterfaceC0780n {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public U.X f8083x;
    public final p020c0.C1681g0 y = new p020c0.C1681g0(null, p020c0.C1676e.f18240k);

    public h(U.X x9) {
        this.f8083x = x9;
        J.D d4 = new J.D(1, this);
        K0.C0667o c0667o = K0.N.f6662a;
        N0(new K0.U(null, null, d4));
    }

    @Override // Q0.InterfaceC0780n
    public final void y0(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
        this.y.setValue(nodeCoordinator);
    }
}
