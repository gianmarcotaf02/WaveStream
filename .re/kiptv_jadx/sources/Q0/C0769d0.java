package Q0;

/* JADX INFO: renamed from: Q0.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0769d0 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.node.NodeCoordinator f8410i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0769d0(androidx.compose.ui.node.NodeCoordinator nodeCoordinator, int i3) {
        super(0);
        this.f8409h = i3;
        this.f8410i = nodeCoordinator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f8409h) {
            case 0:
                androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.f8410i;
                p188x0.InterfaceC3097q interfaceC3097q = nodeCoordinator.f15856O;
                kotlin.jvm.internal.m.b(interfaceC3097q);
                nodeCoordinator.O0(interfaceC3097q, nodeCoordinator.f15855N);
                break;
            default:
                androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = this.f8410i.f15863x;
                if (nodeCoordinator2 != null) {
                    nodeCoordinator2.b1();
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
