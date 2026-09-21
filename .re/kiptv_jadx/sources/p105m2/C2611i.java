package p105m2;

/* JADX INFO: renamed from: m2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2611i extends p105m2.AbstractC2620s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f25323f;
    public final android.media.MediaRouter2.RoutingController g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.os.Messenger f25324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.os.Messenger f25325i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final android.os.Handler f25326k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p105m2.C2617o f25330o;
    public final android.util.SparseArray j = new android.util.SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f25327l = new java.util.concurrent.atomic.AtomicInteger(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final D1.RunnableC0239y f25328m = new D1.RunnableC0239y(27, this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25329n = -1;

    public C2611i(android.media.MediaRouter2.RoutingController routingController, java.lang.String str) {
        this.g = routingController;
        this.f25323f = str;
        int i3 = p105m2.C2615m.y;
        android.os.Bundle controlHints = routingController.getControlHints();
        android.os.Messenger messenger = controlHints == null ? null : (android.os.Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        this.f25324h = messenger;
        this.f25325i = messenger != null ? new android.os.Messenger(new android.support.v4.media.session.i(this)) : null;
        this.f25326k = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    @Override // p105m2.AbstractC2621t
    public final void d() {
        this.g.release();
    }

    @Override // p105m2.AbstractC2621t
    public final void f(int i3) {
        android.media.MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i3);
        this.f25329n = i3;
        android.os.Handler handler = this.f25326k;
        D1.RunnableC0239y runnableC0239y = this.f25328m;
        handler.removeCallbacks(runnableC0239y);
        handler.postDelayed(runnableC0239y, 1000L);
    }

    @Override // p105m2.AbstractC2621t
    public final void i(int i3) {
        android.media.MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        int volume = this.f25329n;
        if (volume < 0) {
            volume = routingController.getVolume();
        }
        int iMax = java.lang.Math.max(0, java.lang.Math.min(volume + i3, this.g.getVolumeMax()));
        this.f25329n = iMax;
        this.g.setVolume(iMax);
        android.os.Handler handler = this.f25326k;
        D1.RunnableC0239y runnableC0239y = this.f25328m;
        handler.removeCallbacks(runnableC0239y);
        handler.postDelayed(runnableC0239y, 1000L);
    }
}
