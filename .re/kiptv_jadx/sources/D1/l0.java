package D1;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.view.animation.Interpolator f2039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2040d;

    public l0(int i3, android.view.animation.Interpolator interpolator, long j) {
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
        android.view.animation.Interpolator interpolator = this.f2039c;
        return interpolator != null ? interpolator.getInterpolation(this.f2038b) : this.f2038b;
    }

    public int d() {
        return this.f2037a;
    }

    public void e(float f9) {
        this.f2038b = f9;
    }
}
