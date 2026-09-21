package D1;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends D1.l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.view.WindowInsetsAnimation f2035e;

    public k0(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2035e = windowInsetsAnimation;
    }

    @Override // D1.l0
    public final float a() {
        return this.f2035e.getAlpha();
    }

    @Override // D1.l0
    public final long b() {
        return this.f2035e.getDurationMillis();
    }

    @Override // D1.l0
    public final float c() {
        return this.f2035e.getInterpolatedFraction();
    }

    @Override // D1.l0
    public final int d() {
        return this.f2035e.getTypeMask();
    }

    @Override // D1.l0
    public final void e(float f9) {
        this.f2035e.setFraction(f9);
    }
}
