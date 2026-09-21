package D1;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D1.l0 f2041a;

    public m0(int i3, android.view.animation.Interpolator interpolator, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.f2041a = new D1.k0(A0.l.i(i3, interpolator, j));
        } else {
            this.f2041a = new D1.i0(i3, interpolator, j);
        }
    }
}
