package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1623e extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.C1624f f17395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f17396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f17397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.C1626h f17398e;

    public /* synthetic */ C1623e(androidx.recyclerview.widget.C1626h c1626h, androidx.recyclerview.widget.C1624f c1624f, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view, int i3) {
        this.f17394a = i3;
        this.f17398e = c1626h;
        this.f17395b = c1624f;
        this.f17396c = viewPropertyAnimator;
        this.f17397d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        switch (this.f17394a) {
            case 0:
                this.f17396c.setListener(null);
                android.view.View view = this.f17397d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                androidx.recyclerview.widget.C1624f c1624f = this.f17395b;
                androidx.recyclerview.widget.X x9 = c1624f.f17408a;
                androidx.recyclerview.widget.C1626h c1626h = this.f17398e;
                c1626h.c(x9);
                c1626h.f17440r.remove(c1624f.f17408a);
                c1626h.i();
                break;
            default:
                this.f17396c.setListener(null);
                android.view.View view2 = this.f17397d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                androidx.recyclerview.widget.C1624f c1624f2 = this.f17395b;
                androidx.recyclerview.widget.X x10 = c1624f2.f17409b;
                androidx.recyclerview.widget.C1626h c1626h2 = this.f17398e;
                c1626h2.c(x10);
                c1626h2.f17440r.remove(c1624f2.f17409b);
                c1626h2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        switch (this.f17394a) {
            case 0:
                androidx.recyclerview.widget.X x9 = this.f17395b.f17408a;
                this.f17398e.getClass();
                break;
            default:
                androidx.recyclerview.widget.X x10 = this.f17395b.f17409b;
                this.f17398e.getClass();
                break;
        }
    }
}
