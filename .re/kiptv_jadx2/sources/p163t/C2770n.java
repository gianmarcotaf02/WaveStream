package p163t;

public final class C2770n extends r {

    public float f27648a;

    public C2770n(float f9) {
        this.f27648a = f9;
    }

    @Override
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f27648a;
        }
        return 0.0f;
    }

    @Override
    public final int b() {
        return 1;
    }

    @Override
    public final r c() {
        return new C2770n(0.0f);
    }

    @Override
    public final void d() {
        this.f27648a = 0.0f;
    }

    @Override
    public final void e(float f9, int i3) {
        if (i3 == 0) {
            this.f27648a = f9;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2770n) && ((C2770n) obj).f27648a == this.f27648a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27648a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f27648a;
    }
}
