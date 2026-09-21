package Z2;

import io.ktor.sse.ServerSentEventKt;

public final class v0 {

    public final float f12956a;

    public final float f12957b;

    public float f12958c;

    public float f12959d;

    public boolean f12960e = false;

    public v0(float f9, float f10, float f11, float f12) {
        this.f12958c = 0.0f;
        this.f12959d = 0.0f;
        this.f12956a = f9;
        this.f12957b = f10;
        double dSqrt = Math.sqrt((f12 * f12) + (f11 * f11));
        if (dSqrt != 0.0d) {
            this.f12958c = (float) (((double) f11) / dSqrt);
            this.f12959d = (float) (((double) f12) / dSqrt);
        }
    }

    public final void a(float f9, float f10) {
        float f11 = f9 - this.f12956a;
        float f12 = f10 - this.f12957b;
        double dSqrt = Math.sqrt((f12 * f12) + (f11 * f11));
        if (dSqrt != 0.0d) {
            f11 = (float) (((double) f11) / dSqrt);
            f12 = (float) (((double) f12) / dSqrt);
        }
        float f13 = this.f12958c;
        if (f11 != (-f13) || f12 != (-this.f12959d)) {
            this.f12958c = f13 + f11;
            this.f12959d += f12;
        } else {
            this.f12960e = true;
            this.f12958c = -f12;
            this.f12959d = f11;
        }
    }

    public final void b(v0 v0Var) {
        float f9 = v0Var.f12958c;
        float f10 = this.f12958c;
        if (f9 == (-f10)) {
            float f11 = v0Var.f12959d;
            if (f11 == (-this.f12959d)) {
                this.f12960e = true;
                this.f12958c = -f11;
                this.f12959d = v0Var.f12958c;
                return;
            }
        }
        this.f12958c = f10 + f9;
        this.f12959d += v0Var.f12959d;
    }

    public final String toString() {
        return "(" + this.f12956a + "," + this.f12957b + ServerSentEventKt.SPACE + this.f12958c + "," + this.f12959d + ")";
    }
}
