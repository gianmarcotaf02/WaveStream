package v;

import O0.InterfaceC0732v;
import kotlin.jvm.functions.Function0;

public final class C2890j0 implements Function0 {

    public final int f28953h;

    public final l0 f28954i;

    public C2890j0(l0 l0Var, int i3) {
        this.f28953h = i3;
        this.f28954i = l0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.f28953h) {
            case 0:
                this.f28954i.P0();
                return p070h6.A.f22523a;
            case 1:
                return new p181w0.a(this.f28954i.f28964D);
            default:
                InterfaceC0732v interfaceC0732v = (InterfaceC0732v) this.f28954i.f28962B.getValue();
                return new p181w0.a(interfaceC0732v != null ? interfaceC0732v.R(0L) : 9205357640488583168L);
        }
    }
}
