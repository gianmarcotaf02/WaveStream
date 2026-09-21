package D1;

/* JADX INFO: renamed from: D1.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0214b0 extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f1998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1999c;

    public /* synthetic */ C0214b0(java.lang.Object obj, android.view.View view, int i3) {
        this.f1997a = i3;
        this.f1999c = obj;
        this.f1998b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        switch (this.f1997a) {
            case 0:
                ((D1.InterfaceC0218d0) this.f1999c).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        switch (this.f1997a) {
            case 0:
                ((D1.InterfaceC0218d0) this.f1999c).c();
                break;
            default:
                D1.m0 m0Var = (D1.m0) this.f1999c;
                m0Var.f2041a.e(1.0f);
                D1.i0.f(this.f1998b, m0Var);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        switch (this.f1997a) {
            case 0:
                ((D1.InterfaceC0218d0) this.f1999c).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
