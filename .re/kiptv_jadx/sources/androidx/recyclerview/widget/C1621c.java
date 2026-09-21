package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1621c extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17379a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.X f17380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f17381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f17382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.C1626h f17383e;

    public C1621c(androidx.recyclerview.widget.C1626h c1626h, androidx.recyclerview.widget.X x9, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f17383e = c1626h;
        this.f17380b = x9;
        this.f17382d = viewPropertyAnimator;
        this.f17381c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        switch (this.f17379a) {
            case 1:
                this.f17381c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        switch (this.f17379a) {
            case 0:
                this.f17382d.setListener(null);
                this.f17381c.setAlpha(1.0f);
                androidx.recyclerview.widget.C1626h c1626h = this.f17383e;
                androidx.recyclerview.widget.X x9 = this.f17380b;
                c1626h.c(x9);
                c1626h.f17439q.remove(x9);
                c1626h.i();
                break;
            default:
                this.f17382d.setListener(null);
                androidx.recyclerview.widget.C1626h c1626h2 = this.f17383e;
                androidx.recyclerview.widget.X x10 = this.f17380b;
                c1626h2.c(x10);
                c1626h2.f17437o.remove(x10);
                c1626h2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        switch (this.f17379a) {
            case 0:
                this.f17383e.getClass();
                break;
            default:
                this.f17383e.getClass();
                break;
        }
    }

    public C1621c(androidx.recyclerview.widget.C1626h c1626h, androidx.recyclerview.widget.X x9, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f17383e = c1626h;
        this.f17380b = x9;
        this.f17381c = view;
        this.f17382d = viewPropertyAnimator;
    }
}
