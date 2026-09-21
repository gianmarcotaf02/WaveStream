package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1630l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.C1631m f17450a;

    public C1630l(androidx.recyclerview.widget.C1631m c1631m) {
        this.f17450a = c1631m;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        androidx.recyclerview.widget.C1631m c1631m = this.f17450a;
        c1631m.f17457c.setAlpha(iFloatValue);
        c1631m.f17458d.setAlpha(iFloatValue);
        c1631m.f17471s.invalidate();
    }
}
