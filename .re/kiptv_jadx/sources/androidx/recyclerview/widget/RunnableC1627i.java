package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1627i implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17446i;

    public /* synthetic */ RunnableC1627i(int i3, java.lang.Object obj) {
        this.f17445h = i3;
        this.f17446i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj = this.f17446i;
        switch (this.f17445h) {
            case 0:
                androidx.recyclerview.widget.C1631m c1631m = (androidx.recyclerview.widget.C1631m) obj;
                int i3 = c1631m.f17453A;
                android.animation.ValueAnimator valueAnimator = c1631m.f17477z;
                if (i3 == 1) {
                    valueAnimator.cancel();
                } else if (i3 != 2) {
                }
                c1631m.f17453A = 3;
                valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            default:
                ((androidx.recyclerview.widget.StaggeredGridLayoutManager) obj).t0();
                break;
        }
    }
}
