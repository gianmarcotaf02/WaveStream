package R0;

/* JADX INFO: loaded from: classes.dex */
public final class W implements android.view.Choreographer.FrameCallback, java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ R0.X f8851h;

    public W(R0.X x9) {
        this.f8851h = x9;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f8851h.j.removeCallbacks(this);
        R0.X.Z(this.f8851h);
        R0.X x9 = this.f8851h;
        synchronized (x9.f8856k) {
            if (x9.f8861p) {
                x9.f8861p = false;
                java.util.ArrayList arrayList = x9.f8858m;
                x9.f8858m = x9.f8859n;
                x9.f8859n = arrayList;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((android.view.Choreographer.FrameCallback) arrayList.get(i3)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        R0.X.Z(this.f8851h);
        R0.X x9 = this.f8851h;
        synchronized (x9.f8856k) {
            if (x9.f8858m.isEmpty()) {
                x9.f8855i.removeFrameCallback(this);
                x9.f8861p = false;
            }
        }
    }
}
