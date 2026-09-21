package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1629k extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17448a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.C1631m f17449b;

    public C1629k(androidx.recyclerview.widget.C1631m c1631m) {
        this.f17449b = c1631m;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.f17448a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (this.f17448a) {
            this.f17448a = false;
            return;
        }
        androidx.recyclerview.widget.C1631m c1631m = this.f17449b;
        if (((java.lang.Float) c1631m.f17477z.getAnimatedValue()).floatValue() == 0.0f) {
            c1631m.f17453A = 0;
            c1631m.d(0);
        } else {
            c1631m.f17453A = 2;
            c1631m.f17471s.invalidate();
        }
    }
}
