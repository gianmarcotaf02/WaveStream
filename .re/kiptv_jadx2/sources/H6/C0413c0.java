package H6;

import kotlin.jvm.functions.Function0;

public final class C0413c0 implements Function0 {

    public final int f4428h;

    public final e0 f4429i;

    public C0413c0(e0 e0Var, int i3) {
        this.f4428h = i3;
        this.f4429i = e0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.f4428h) {
            case 0:
                return new d0(this.f4429i);
            default:
                return this.f4429i.r();
        }
    }
}
