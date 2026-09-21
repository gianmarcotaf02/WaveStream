package p163t;

public final class C2771o extends r {

    public float f27654a;

    public float f27655b;

    public C2771o(float f9, float f10) {
        this.f27654a = f9;
        this.f27655b = f10;
    }

    @Override
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f27654a;
        }
        if (i3 != 1) {
            return 0.0f;
        }
        return this.f27655b;
    }

    @Override
    public final int b() {
        return 2;
    }

    @Override
    public final r c() {
        return new C2771o(0.0f, 0.0f);
    }

    @Override
    public final void d() {
        this.f27654a = 0.0f;
        this.f27655b = 0.0f;
    }

    @Override
    public final void e(float f9, int i3) {
        if (i3 == 0) {
            this.f27654a = f9;
        } else {
            if (i3 != 1) {
                return;
            }
            this.f27655b = f9;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2771o)) {
            return false;
        }
        C2771o c2771o = (C2771o) obj;
        return c2771o.f27654a == this.f27654a && c2771o.f27655b == this.f27655b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27655b) + (Float.hashCode(this.f27654a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f27654a + ", v2 = " + this.f27655b;
    }
}
