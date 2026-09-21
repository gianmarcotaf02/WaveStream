package E3;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f2829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S.p f2831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E3.b f2832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F3.C0362b f2833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final android.os.Looper f2834f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F3.v f2835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F3.C0361a f2836i;
    public final F3.C0366f j;

    public f(android.content.Context context, androidx.credentials.playservices.HiddenActivity hiddenActivity, S.p pVar, E3.b bVar, E3.e eVar) {
        F3.J j;
        H3.q.h(context, "Null context is not permitted.");
        H3.q.h(pVar, "Api must not be null.");
        H3.q.h(eVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        android.content.Context applicationContext = context.getApplicationContext();
        H3.q.h(applicationContext, "The provided context did not have an application context.");
        this.f2829a = applicationContext;
        java.lang.String attributionTag = android.os.Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f2830b = attributionTag;
        this.f2831c = pVar;
        this.f2832d = bVar;
        this.f2834f = eVar.f2828b;
        F3.C0362b c0362b = new F3.C0362b(pVar, bVar, attributionTag);
        this.f2833e = c0362b;
        this.f2835h = new F3.v(this);
        F3.C0366f c0366fG = F3.C0366f.g(applicationContext);
        this.j = c0366fG;
        this.g = c0366fG.f3590o.getAndIncrement();
        this.f2836i = eVar.f2827a;
        if (hiddenActivity != null && android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            java.util.WeakHashMap weakHashMap = F3.J.f3569i;
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) weakHashMap.get(hiddenActivity);
            if (weakReference == null || (j = (F3.J) weakReference.get()) == null) {
                try {
                    j = (F3.J) hiddenActivity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (j == null || j.isRemoving()) {
                        j = new F3.J();
                        hiddenActivity.getFragmentManager().beginTransaction().add(j, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap.put(hiddenActivity, new java.lang.ref.WeakReference(j));
                } catch (java.lang.ClassCastException e6) {
                    throw new java.lang.IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e6);
                }
            }
            F3.p pVarB = j.b();
            if (pVarB == null) {
                java.lang.Object obj = D3.e.f2105c;
                pVarB = new F3.p(j, c0366fG);
            }
            pVarB.f3616m.add(c0362b);
            c0366fG.a(pVarB);
        }
        Z3.d dVar = c0366fG.f3596u;
        dVar.sendMessage(dVar.obtainMessage(7, this));
    }

    public final android.support.v4.media.session.q a() {
        android.support.v4.media.session.q qVar = new android.support.v4.media.session.q(9, false);
        java.util.Set set = java.util.Collections.EMPTY_SET;
        if (((p136q.C2662f) qVar.f15617i) == null) {
            qVar.f15617i = new p136q.C2662f(0);
        }
        ((p136q.C2662f) qVar.f15617i).addAll(set);
        android.content.Context context = this.f2829a;
        qVar.f15618k = context.getClass().getName();
        qVar.j = context.getPackageName();
        return qVar;
    }

    public final F3.C0369i b(B3.j jVar) {
        android.os.Looper looper = this.f2834f;
        H3.q.h(jVar, "Listener must not be null");
        H3.q.h(looper, "Looper must not be null");
        F3.C0369i c0369i = new F3.C0369i();
        new Z3.d(looper, 1);
        H3.q.e("castDeviceControllerListenerKey");
        c0369i.f3599a = new F3.C0368h(jVar);
        return c0369i;
    }

    public final A0.a c(int i3, F3.n nVar) {
        p059g4.d dVar = new p059g4.d();
        F3.C0366f c0366f = this.j;
        c0366f.getClass();
        c0366f.f(dVar, nVar.f3607c, this);
        F3.A a2 = new F3.A(new F3.G(i3, nVar, dVar, this.f2836i), c0366f.f3591p.get(), this);
        Z3.d dVar2 = c0366f.f3596u;
        dVar2.sendMessage(dVar2.obtainMessage(4, a2));
        return dVar.f21865a;
    }
}
