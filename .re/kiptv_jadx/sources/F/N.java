package F;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p194x6.j f3358a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F.i0 f3360c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3363f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.session.q f3359b = new android.support.v4.media.session.q(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3361d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3362e = -1;

    public N(p194x6.j jVar) {
        this.f3358a = jVar;
    }

    public final F.M a(int i3, long j, boolean z6, p194x6.j jVar) {
        F.i0 i0Var = this.f3360c;
        if (i0Var == null) {
            return F.C0343h.f3444a;
        }
        F.j0 j0Var = (F.j0) i0Var.f3467d;
        boolean z9 = j0Var instanceof F.ViewOnAttachStateChangeListenerC0337b;
        F.h0 h0Var = new F.h0(i0Var, i3, this.f3359b, jVar);
        h0Var.f3448d = new p113n1.a(j);
        if (!z9) {
            j0Var.a(h0Var);
        } else if (z6) {
            F.ViewOnAttachStateChangeListenerC0337b viewOnAttachStateChangeListenerC0337b = (F.ViewOnAttachStateChangeListenerC0337b) j0Var;
            viewOnAttachStateChangeListenerC0337b.f3408i.add(new F.m0(1, h0Var));
            if (!viewOnAttachStateChangeListenerC0337b.j) {
                viewOnAttachStateChangeListenerC0337b.j = true;
                viewOnAttachStateChangeListenerC0337b.f3407h.post(viewOnAttachStateChangeListenerC0337b);
            }
        } else {
            F.ViewOnAttachStateChangeListenerC0337b viewOnAttachStateChangeListenerC0337b2 = (F.ViewOnAttachStateChangeListenerC0337b) j0Var;
            viewOnAttachStateChangeListenerC0337b2.f3408i.add(new F.m0(0, h0Var));
            if (!viewOnAttachStateChangeListenerC0337b2.j) {
                viewOnAttachStateChangeListenerC0337b2.j = true;
                viewOnAttachStateChangeListenerC0337b2.f3407h.post(viewOnAttachStateChangeListenerC0337b2);
            }
        }
        com.google.common.util.concurrent.P.v0(i3, "compose:lazy:schedule_prefetch:index");
        return h0Var;
    }
}
