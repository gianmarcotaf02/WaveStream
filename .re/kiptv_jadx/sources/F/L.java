package F;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f3356b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F.N f3357c;

    public L(F.N n3, int i3) {
        this.f3357c = n3;
        this.f3355a = i3;
    }

    public final void a(int i3) {
        F.N n3 = this.f3357c;
        F.i0 i0Var = n3.f3360c;
        if (i0Var == null) {
            return;
        }
        java.util.ArrayList arrayList = this.f3356b;
        boolean z6 = ((F.j0) i0Var.f3467d) instanceof F.ViewOnAttachStateChangeListenerC0337b;
        arrayList.add(new F.h0(i0Var, i3, n3.f3359b, null));
    }
}
