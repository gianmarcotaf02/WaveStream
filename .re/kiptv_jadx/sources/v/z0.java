package v;

/* JADX INFO: loaded from: classes.dex */
public class z0 implements v.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.Magnifier f29044a;

    public z0(android.widget.Magnifier magnifier) {
        this.f29044a = magnifier;
    }

    @Override // v.x0
    public void a(long j, long j9) {
        this.f29044a.show(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.f29044a.dismiss();
    }

    public final long c() {
        return (((long) this.f29044a.getHeight()) & 4294967295L) | (((long) this.f29044a.getWidth()) << 32);
    }

    public final void d() {
        this.f29044a.update();
    }
}
