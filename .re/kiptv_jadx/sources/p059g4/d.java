package p059g4;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0.a f21865a = new A0.a();

    public final void a(java.lang.Exception exc) {
        this.f21865a.j(exc);
    }

    public final void b(java.lang.Object obj) {
        A0.a aVar = this.f21865a;
        synchronized (aVar.f13b) {
            aVar.k();
            aVar.f12a = true;
            aVar.f15d = obj;
        }
        ((K0.C0661i) aVar.f14c).h(aVar);
    }

    public final void c(java.lang.Exception exc) {
        A0.a aVar = this.f21865a;
        aVar.getClass();
        H3.q.h(exc, "Exception must not be null");
        synchronized (aVar.f13b) {
            try {
                if (aVar.f12a) {
                    return;
                }
                aVar.f12a = true;
                aVar.f16e = exc;
                ((K0.C0661i) aVar.f14c).h(aVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void d(java.lang.Boolean bool) {
        A0.a aVar = this.f21865a;
        synchronized (aVar.f13b) {
            try {
                if (aVar.f12a) {
                    return;
                }
                aVar.f12a = true;
                aVar.f15d = bool;
                ((K0.C0661i) aVar.f14c).h(aVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
