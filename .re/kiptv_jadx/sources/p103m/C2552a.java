package p103m;

/* JADX INFO: renamed from: m.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2552a extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f25002a;

    public C2552a(androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f25002a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f25002a;
        actionBarOverlayLayout.f15694D = null;
        actionBarOverlayLayout.f15707q = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f25002a;
        actionBarOverlayLayout.f15694D = null;
        actionBarOverlayLayout.f15707q = false;
    }
}
