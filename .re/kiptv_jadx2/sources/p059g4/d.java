package p059g4;

import A0.a;
import H3.q;
import K0.C0661i;

public final class d {

    public final a f21865a = new a();

    public final void a(Exception exc) {
        this.f21865a.j(exc);
    }

    public final void b(Object obj) {
        a aVar = this.f21865a;
        synchronized (aVar.f13b) {
            aVar.k();
            aVar.f12a = true;
            aVar.f15d = obj;
        }
        ((C0661i) aVar.f14c).h(aVar);
    }

    public final void c(Exception exc) {
        a aVar = this.f21865a;
        aVar.getClass();
        q.h(exc, "Exception must not be null");
        synchronized (aVar.f13b) {
            try {
                if (aVar.f12a) {
                    return;
                }
                aVar.f12a = true;
                aVar.f16e = exc;
                ((C0661i) aVar.f14c).h(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Boolean bool) {
        a aVar = this.f21865a;
        synchronized (aVar.f13b) {
            try {
                if (aVar.f12a) {
                    return;
                }
                aVar.f12a = true;
                aVar.f15d = bool;
                ((C0661i) aVar.f14c).h(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
