package Q0;

import androidx.compose.ui.node.NodeCoordinator;
import kotlin.jvm.functions.Function0;
import p188x0.InterfaceC3097q;

public final class C0769d0 extends kotlin.jvm.internal.o implements Function0 {

    public final int f8409h;

    public final NodeCoordinator f8410i;

    public C0769d0(NodeCoordinator nodeCoordinator, int i3) {
        super(0);
        this.f8409h = i3;
        this.f8410i = nodeCoordinator;
    }

    @Override
    public final Object invoke() {
        switch (this.f8409h) {
            case 0:
                NodeCoordinator nodeCoordinator = this.f8410i;
                InterfaceC3097q interfaceC3097q = nodeCoordinator.f15856O;
                kotlin.jvm.internal.m.b(interfaceC3097q);
                nodeCoordinator.O0(interfaceC3097q, nodeCoordinator.f15855N);
                break;
            default:
                NodeCoordinator nodeCoordinator2 = this.f8410i.f15863x;
                if (nodeCoordinator2 != null) {
                    nodeCoordinator2.b1();
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
