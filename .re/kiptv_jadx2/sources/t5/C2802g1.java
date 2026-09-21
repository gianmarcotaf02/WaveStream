package t5;

import x.InterfaceC3034c;

public final class C2802g1 implements InterfaceC3034c {

    public final float f28190b;

    public final float f28191c;

    public C2802g1(float f9, float f10) {
        this.f28190b = f9;
        this.f28191c = f10;
    }

    @Override
    public final float a(float f9, float f10, float f11) {
        float f12 = f9 - this.f28190b;
        if (Math.abs(f12) <= this.f28191c) {
            return 0.0f;
        }
        return f12;
    }
}
