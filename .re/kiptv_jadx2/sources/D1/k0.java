package D1;

import android.view.WindowInsetsAnimation;

public final class k0 extends l0 {

    public final WindowInsetsAnimation f2035e;

    public k0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2035e = windowInsetsAnimation;
    }

    @Override
    public final float a() {
        return this.f2035e.getAlpha();
    }

    @Override
    public final long b() {
        return this.f2035e.getDurationMillis();
    }

    @Override
    public final float c() {
        return this.f2035e.getInterpolatedFraction();
    }

    @Override
    public final int d() {
        return this.f2035e.getTypeMask();
    }

    @Override
    public final void e(float f9) {
        this.f2035e.setFraction(f9);
    }
}
