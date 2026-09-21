package F3;

/* JADX INFO: loaded from: classes.dex */
public final class p implements android.content.DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f3612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f3613i;
    public final java.util.concurrent.atomic.AtomicReference j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Z3.d f3614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D3.e f3615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p136q.C2662f f3616m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final F3.C0366f f3617n;

    public p(F3.InterfaceC0367g interfaceC0367g, F3.C0366f c0366f) {
        D3.e eVar = D3.e.f2106d;
        this.f3612h = interfaceC0367g;
        this.j = new java.util.concurrent.atomic.AtomicReference(null);
        this.f3614k = new Z3.d(android.os.Looper.getMainLooper(), 0);
        this.f3615l = eVar;
        this.f3616m = new p136q.C2662f(0);
        this.f3617n = c0366f;
        interfaceC0367g.h(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [F3.g, java.lang.Object] */
    public final android.app.Activity a() {
        android.app.Activity activityF = this.f3612h.f();
        H3.q.g(activityF);
        return activityF;
    }

    public final void b(android.os.Bundle bundle) {
        if (bundle != null) {
            this.j.set(bundle.getBoolean("resolving_error", false) ? new F3.I(new D3.b(bundle.getInt("failed_status"), (android.app.PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void c() {
        this.f3613i = false;
        F3.C0366f c0366f = this.f3617n;
        c0366f.getClass();
        synchronized (F3.C0366f.y) {
            try {
                if (c0366f.f3593r == this) {
                    c0366f.f3593r = null;
                    c0366f.f3594s.clear();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f3616m.isEmpty()) {
            return;
        }
        this.f3617n.a(this);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        D3.b bVar = new D3.b(13, null, null);
        java.util.concurrent.atomic.AtomicReference atomicReference = this.j;
        F3.I i3 = (F3.I) atomicReference.get();
        int i9 = i3 == null ? -1 : i3.f3567a;
        atomicReference.set(null);
        this.f3617n.h(bVar, i9);
    }
}
