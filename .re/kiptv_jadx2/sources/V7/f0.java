package V7;

import O1.C0754s;

public final class f0 implements e0 {

    public final int f10459a;

    public f0(int i3) {
        this.f10459a = i3;
    }

    @Override
    public final InterfaceC0981g a(W7.D d4) {
        switch (this.f10459a) {
            case 0:
                c0 c0Var = c0.f10447h;
                return new C0984j();
            default:
                return new C0754s(new h0(d4, null));
        }
    }

    public final String toString() {
        switch (this.f10459a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
