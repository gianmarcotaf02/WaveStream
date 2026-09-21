package F;

public final class N {

    public final p194x6.j f3358a;

    public i0 f3360c;

    public int f3363f;

    public final android.support.v4.media.session.q f3359b = new android.support.v4.media.session.q(5);

    public int f3361d = -1;

    public int f3362e = -1;

    public N(p194x6.j jVar) {
        this.f3358a = jVar;
    }

    public final M a(int i3, long j, boolean z6, p194x6.j jVar) {
        i0 i0Var = this.f3360c;
        if (i0Var == null) {
            return C0343h.f3444a;
        }
        j0 j0Var = (j0) i0Var.f3467d;
        boolean z9 = j0Var instanceof ViewOnAttachStateChangeListenerC0337b;
        h0 h0Var = new h0(i0Var, i3, this.f3359b, jVar);
        h0Var.f3448d = new p113n1.a(j);
        if (!z9) {
            j0Var.a(h0Var);
        } else if (z6) {
            ViewOnAttachStateChangeListenerC0337b viewOnAttachStateChangeListenerC0337b = (ViewOnAttachStateChangeListenerC0337b) j0Var;
            viewOnAttachStateChangeListenerC0337b.f3408i.add(new m0(1, h0Var));
            if (!viewOnAttachStateChangeListenerC0337b.j) {
                viewOnAttachStateChangeListenerC0337b.j = true;
                viewOnAttachStateChangeListenerC0337b.f3407h.post(viewOnAttachStateChangeListenerC0337b);
            }
        } else {
            ViewOnAttachStateChangeListenerC0337b viewOnAttachStateChangeListenerC0337b2 = (ViewOnAttachStateChangeListenerC0337b) j0Var;
            viewOnAttachStateChangeListenerC0337b2.f3408i.add(new m0(0, h0Var));
            if (!viewOnAttachStateChangeListenerC0337b2.j) {
                viewOnAttachStateChangeListenerC0337b2.j = true;
                viewOnAttachStateChangeListenerC0337b2.f3407h.post(viewOnAttachStateChangeListenerC0337b2);
            }
        }
        com.google.common.util.concurrent.P.v0(i3, "compose:lazy:schedule_prefetch:index");
        return h0Var;
    }
}
