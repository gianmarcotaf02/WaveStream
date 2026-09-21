package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17163b;

    public /* synthetic */ g(int i3, java.lang.Object obj) {
        this.f17162a = i3;
        this.f17163b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        switch (this.f17162a) {
            case 0:
                ((androidx.media3.ui.PlayerControlViewLayoutManager) this.f17163b).lambda$new$0(valueAnimator);
                break;
            case 1:
                ((androidx.media3.ui.PlayerControlViewLayoutManager) this.f17163b).lambda$new$1(valueAnimator);
                break;
            case 2:
                ((androidx.media3.ui.PlayerControlViewLayoutManager) this.f17163b).lambda$new$2(valueAnimator);
                break;
            case 3:
                ((androidx.media3.ui.PlayerControlViewLayoutManager) this.f17163b).lambda$new$3(valueAnimator);
                break;
            default:
                ((androidx.media3.ui.DefaultTimeBar) this.f17163b).lambda$new$1(valueAnimator);
                break;
        }
    }
}
