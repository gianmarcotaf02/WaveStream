package p155s1;

import com.google.android.gms.internal.cast.Z1;

public final class h {

    public Object f27246a;

    public k f27247b;

    public l f27248c;

    public boolean f27249d;

    public final void a(Object obj) {
        this.f27249d = true;
        k kVar = this.f27247b;
        if (kVar != null) {
            j jVar = kVar.f27252i;
            jVar.getClass();
            if (obj == null) {
                obj = g.f27243n;
            }
            if (g.f27242m.g0(jVar, null, obj)) {
                g.c(jVar);
                this.f27246a = null;
                this.f27247b = null;
                this.f27248c = null;
            }
        }
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f27247b;
        if (kVar != null) {
            j jVar = kVar.f27252i;
            if (!jVar.isDone()) {
                jVar.i(new Z1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f27246a, 5));
            }
        }
        if (this.f27249d || (lVar = this.f27248c) == null) {
            return;
        }
        lVar.j(null);
    }
}
