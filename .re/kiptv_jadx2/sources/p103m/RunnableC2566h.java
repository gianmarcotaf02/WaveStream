package p103m;

import android.view.View;
import p095l.j;
import p095l.l;

public final class RunnableC2566h implements Runnable {

    public final C2562f f25044h;

    public final C2570j f25045i;

    public RunnableC2566h(C2570j c2570j, C2562f c2562f) {
        this.f25045i = c2570j;
        this.f25044h = c2562f;
    }

    @Override
    public final void run() {
        j jVar;
        C2570j c2570j = this.f25045i;
        l lVar = c2570j.j;
        if (lVar != null && (jVar = lVar.f24640e) != null) {
            jVar.m(lVar);
        }
        View view = (View) c2570j.f25059o;
        if (view != null && view.getWindowToken() != null) {
            C2562f c2562f = this.f25044h;
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
