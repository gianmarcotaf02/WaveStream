package p163t;

import p121o0.p;

public final class C2772p extends r {

    public float f27664a;

    public float f27665b;

    public float f27666c;

    public C2772p(float f9, float f10, float f11) {
        this.f27664a = f9;
        this.f27665b = f10;
        this.f27666c = f11;
    }

    @Override
    public final float a(int i3) {
        if (i3 == 0) {
            return this.f27664a;
        }
        if (i3 == 1) {
            return this.f27665b;
        }
        if (i3 != 2) {
            return 0.0f;
        }
        return this.f27666c;
    }

    @Override
    public final int b() {
        return 3;
    }

    @Override
    public final r c() {
        return new C2772p(0.0f, 0.0f, 0.0f);
    }

    @Override
    public final void d() {
        this.f27664a = 0.0f;
        this.f27665b = 0.0f;
        this.f27666c = 0.0f;
    }

    @Override
    public final void e(float f9, int i3) {
        if (i3 == 0) {
            this.f27664a = f9;
        } else if (i3 == 1) {
            this.f27665b = f9;
        } else {
            if (i3 != 2) {
                return;
            }
            this.f27666c = f9;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2772p)) {
            return false;
        }
        C2772p c2772p = (C2772p) obj;
        return c2772p.f27664a == this.f27664a && c2772p.f27665b == this.f27665b && c2772p.f27666c == this.f27666c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27666c) + p.c(this.f27665b, Float.hashCode(this.f27664a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f27664a + ", v2 = " + this.f27665b + ", v3 = " + this.f27666c;
    }
}
