package H6;

import kotlin.jvm.functions.Function0;

public final class Z implements Function0 {

    public final int f4406h;

    public final C0411b0 f4407i;

    public Z(C0411b0 c0411b0, int i3) {
        this.f4406h = i3;
        this.f4407i = c0411b0;
    }

    @Override
    public final Object invoke() {
        switch (this.f4406h) {
            case 0:
                return new C0409a0(this.f4407i);
            default:
                C0411b0 c0411b0 = this.f4407i;
                return c0411b0.s(c0411b0.r(), null);
        }
    }
}
