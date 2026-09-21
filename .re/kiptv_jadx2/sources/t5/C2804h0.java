package t5;

import kotlin.jvm.functions.Function0;
import p020c0.AbstractC1703s;
import v.AbstractC2878d0;
import v5.AbstractC2930h0;

public final class C2804h0 implements Function0 {

    public final int f28194h;

    public C2804h0(int i3) {
        this.f28194h = i3;
    }

    @Override
    public final Object invoke() {
        p070h6.A a2 = p070h6.A.f22523a;
        switch (this.f28194h) {
            case 0:
                return AbstractC1703s.y(Boolean.FALSE);
            case 1:
                return a2;
            case 2:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 3:
                return AbstractC1703s.y("MAIN");
            case 4:
                p020c0.C c9 = AbstractC2878d0.f28929a;
                return v.K.f28875a;
            case 5:
                return new v.u0();
            case 6:
                return new v.G0(0);
            case 7:
                float f9 = AbstractC2930h0.f29480a;
                return a2;
            default:
                float f10 = x.G.f30721a;
                return Boolean.TRUE;
        }
    }
}
