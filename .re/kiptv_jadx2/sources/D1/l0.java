package D1;

import android.view.animation.Interpolator;

public abstract class l0 {

    public final int f2037a;

    public float f2038b;

    public final Interpolator f2039c;

    public final long f2040d;

    public l0(int i3, Interpolator interpolator, long j) {
        this.f2037a = i3;
        this.f2039c = interpolator;
        this.f2040d = j;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f2040d;
    }

    public float c() {
        Interpolator interpolator = this.f2039c;
        return interpolator != null ? interpolator.getInterpolation(this.f2038b) : this.f2038b;
    }

    public int d() {
        return this.f2037a;
    }

    public void e(float f9) {
        this.f2038b = f9;
    }
}
