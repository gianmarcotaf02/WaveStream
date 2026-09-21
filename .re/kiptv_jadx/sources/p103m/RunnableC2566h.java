package p103m;

/* JADX INFO: renamed from: m.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2566h implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p103m.C2562f f25044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p103m.C2570j f25045i;

    public RunnableC2566h(p103m.C2570j c2570j, p103m.C2562f c2562f) {
        this.f25045i = c2570j;
        this.f25044h = c2562f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p095l.j jVar;
        p103m.C2570j c2570j = this.f25045i;
        p095l.l lVar = c2570j.j;
        if (lVar != null && (jVar = lVar.f24640e) != null) {
            jVar.m(lVar);
        }
        android.view.View view = (android.view.View) c2570j.f25059o;
        if (view != null && view.getWindowToken() != null) {
            p103m.C2562f c2562f = this.f25044h;
            if (c2562f.b()) {
                c2570j.f25069z = c2562f;
            } else if (c2562f.f24702e != null) {
                c2562f.d(0, 0, false, false);
                c2570j.f25069z = c2562f;
            }
        }
        c2570j.f25050B = null;
    }
}
