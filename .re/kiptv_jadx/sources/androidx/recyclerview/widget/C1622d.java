package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1622d extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.X f17387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f17389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f17391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.C1626h f17392f;

    public C1622d(androidx.recyclerview.widget.C1626h c1626h, androidx.recyclerview.widget.X x9, int i3, android.view.View view, int i9, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f17392f = c1626h;
        this.f17387a = x9;
        this.f17388b = i3;
        this.f17389c = view;
        this.f17390d = i9;
        this.f17391e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        int i3 = this.f17388b;
        android.view.View view = this.f17389c;
        if (i3 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f17390d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.f17391e.setListener(null);
        androidx.recyclerview.widget.C1626h c1626h = this.f17392f;
        androidx.recyclerview.widget.X x9 = this.f17387a;
        c1626h.c(x9);
        c1626h.f17438p.remove(x9);
        c1626h.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        this.f17392f.getClass();
    }
}
