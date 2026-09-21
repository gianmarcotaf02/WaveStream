package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class B implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.F f16272h;

    public B(androidx.lifecycle.F f9) {
        this.f16272h = f9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        synchronized (this.f16272h.f16279a) {
            obj = this.f16272h.f16284f;
            this.f16272h.f16284f = androidx.lifecycle.F.f16278k;
        }
        this.f16272h.i(obj);
    }
}
