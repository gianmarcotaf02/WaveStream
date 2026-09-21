package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p057g2.d f16352a = new p057g2.d();

    public final void a(java.lang.String str, java.lang.AutoCloseable autoCloseable) {
        java.lang.AutoCloseable autoCloseable2;
        p057g2.d dVar = this.f16352a;
        if (dVar != null) {
            if (dVar.f21861d) {
                p057g2.d.a(autoCloseable);
                return;
            }
            synchronized (dVar.f21858a) {
                autoCloseable2 = (java.lang.AutoCloseable) dVar.f21859b.put(str, autoCloseable);
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
                    java.util.Iterator it = dVar.f21859b.values().iterator();
                    while (it.hasNext()) {
                        p057g2.d.a((java.lang.AutoCloseable) it.next());
                    }
                    java.util.Iterator it2 = dVar.f21860c.iterator();
                    while (it2.hasNext()) {
                        p057g2.d.a((java.lang.AutoCloseable) it2.next());
                    }
                    dVar.f21860c.clear();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final java.lang.AutoCloseable c(java.lang.String str) {
        java.lang.AutoCloseable autoCloseable;
        p057g2.d dVar = this.f16352a;
        if (dVar == null) {
            return null;
        }
        synchronized (dVar.f21858a) {
            autoCloseable = (java.lang.AutoCloseable) dVar.f21859b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
