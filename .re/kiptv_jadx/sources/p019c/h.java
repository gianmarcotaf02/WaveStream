package p019c;

/* JADX INFO: loaded from: classes.dex */
public final class h implements android.view.ViewTreeObserver.OnDrawListener, java.lang.Runnable, java.util.concurrent.Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18037h = android.os.SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f18038i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p019c.k f18039k;

    public h(p019c.k kVar) {
        this.f18039k = kVar;
    }

    public final void a(android.view.View view) {
        if (this.j) {
            return;
        }
        this.j = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        kotlin.jvm.internal.m.e(runnable, "runnable");
        this.f18038i = runnable;
        android.view.View decorView = this.f18039k.getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        if (!this.j) {
            decorView.postOnAnimation(new D1.RunnableC0239y(12, this));
        } else if (kotlin.jvm.internal.m.a(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z6;
        java.lang.Runnable runnable = this.f18038i;
        if (runnable == null) {
            if (android.os.SystemClock.uptimeMillis() > this.f18037h) {
                this.j = false;
                this.f18039k.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f18038i = null;
        p019c.m mVar = (p019c.m) this.f18039k.f18054n.getValue();
        synchronized (mVar.f18069b) {
            z6 = mVar.f18070c;
        }
        if (z6) {
            this.j = false;
            this.f18039k.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18039k.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
