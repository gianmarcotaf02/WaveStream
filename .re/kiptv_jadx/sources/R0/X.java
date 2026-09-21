package R0;

/* JADX INFO: loaded from: classes.dex */
public final class X extends S7.AbstractC0906w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p070h6.p f8853s = com.google.common.util.concurrent.D.B(R0.M.f8813n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final B4.a f8854t = new B4.a(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.view.Choreographer f8855i;
    public final android.os.Handler j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8861p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final R0.Z f8863r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f8856k = new java.lang.Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p078i6.l f8857l = new p078i6.l();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f8858m = new java.util.ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f8859n = new java.util.ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final R0.W f8862q = new R0.W(this);

    public X(android.view.Choreographer choreographer, android.os.Handler handler) {
        this.f8855i = choreographer;
        this.j = handler;
        this.f8863r = new R0.Z(choreographer, this);
    }

    public static final void Z(R0.X x9) {
        java.lang.Runnable runnable;
        boolean z6;
        do {
            synchronized (x9.f8856k) {
                p078i6.l lVar = x9.f8857l;
                runnable = (java.lang.Runnable) (lVar.isEmpty() ? null : lVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (x9.f8856k) {
                    p078i6.l lVar2 = x9.f8857l;
                    runnable = (java.lang.Runnable) (lVar2.isEmpty() ? null : lVar2.removeFirst());
                }
            }
            synchronized (x9.f8856k) {
                if (x9.f8857l.isEmpty()) {
                    z6 = false;
                    x9.f8860o = false;
                } else {
                    z6 = true;
                }
            }
        } while (z6);
    }

    @Override // S7.AbstractC0906w
    public final void V(p100l6.h hVar, java.lang.Runnable runnable) {
        synchronized (this.f8856k) {
            this.f8857l.addLast(runnable);
            if (!this.f8860o) {
                this.f8860o = true;
                this.j.post(this.f8862q);
                if (!this.f8861p) {
                    this.f8861p = true;
                    this.f8855i.postFrameCallback(this.f8862q);
                }
            }
        }
    }
}
