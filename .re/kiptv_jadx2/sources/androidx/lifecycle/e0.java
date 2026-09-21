package androidx.lifecycle;

import java.util.Iterator;

public abstract class e0 {

    public final p057g2.d f16352a = new p057g2.d();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        p057g2.d dVar = this.f16352a;
        if (dVar != null) {
            if (dVar.f21861d) {
                p057g2.d.a(autoCloseable);
                return;
            }
            synchronized (dVar.f21858a) {
                autoCloseable2 = (AutoCloseable) dVar.f21859b.put(str, autoCloseable);
            }
            p057g2.d.a(autoCloseable2);
        }
    }

    public final void b() {
        p057g2.d dVar = this.f16352a;
        if (dVar != null && !dVar.f21861d) {
            dVar.f21861d = true;
            synchronized (dVar.f21858a) {
                try {
                    Iterator it = dVar.f21859b.values().iterator();
                    while (it.hasNext()) {
                        p057g2.d.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.f21860c.iterator();
                    while (it2.hasNext()) {
                        p057g2.d.a((AutoCloseable) it2.next());
                    }
                    dVar.f21860c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        p057g2.d dVar = this.f16352a;
        if (dVar == null) {
            return null;
        }
        synchronized (dVar.f21858a) {
            autoCloseable = (AutoCloseable) dVar.f21859b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
