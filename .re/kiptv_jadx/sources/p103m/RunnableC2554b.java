package p103m;

/* JADX INFO: renamed from: m.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2554b implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f25006i;

    public /* synthetic */ RunnableC2554b(androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f25005h = i3;
        this.f25006i = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25005h) {
            case 0:
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f25006i;
                actionBarOverlayLayout.d();
                actionBarOverlayLayout.f15694D = actionBarOverlayLayout.f15701k.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f15695E);
                break;
            default:
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = this.f25006i;
                actionBarOverlayLayout2.d();
                actionBarOverlayLayout2.f15694D = actionBarOverlayLayout2.f15701k.animate().translationY(-actionBarOverlayLayout2.f15701k.getHeight()).setListener(actionBarOverlayLayout2.f15695E);
                break;
        }
    }
}
