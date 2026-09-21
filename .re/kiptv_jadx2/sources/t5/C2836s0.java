package t5;

import x.InterfaceC3034c;

public final class C2836s0 implements InterfaceC3034c {

    public final float f28372b;

    public final float f28373c;

    public final boolean f28374d;

    public C2836s0(float f9, float f10, boolean z6) {
        this.f28372b = f9;
        this.f28373c = f10;
        this.f28374d = z6;
    }

    @Override
    public final float a(float f9, float f10, float f11) {
        boolean z6 = this.f28374d;
        float f12 = this.f28372b;
        float f13 = z6 ? (f9 + f10) - (f11 - f12) : f9 - f12;
        if (Math.abs(f13) <= this.f28373c) {
            return 0.0f;
        }
        return f13;
    }
}
