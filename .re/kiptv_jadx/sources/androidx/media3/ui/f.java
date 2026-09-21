package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.ui.PlayerControlViewLayoutManager f17161i;

    public /* synthetic */ f(androidx.media3.ui.PlayerControlViewLayoutManager playerControlViewLayoutManager, int i3) {
        this.f17160h = i3;
        this.f17161i = playerControlViewLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17160h) {
            case 0:
                this.f17161i.updateLayoutForSizeChange();
                break;
            case 1:
                this.f17161i.onLayoutWidthChanged();
                break;
            case 2:
                this.f17161i.showAllBars();
                break;
            case 3:
                this.f17161i.hideAllBars();
                break;
            case 4:
                this.f17161i.hideProgressBar();
                break;
            case 5:
                this.f17161i.hideMainBar();
                break;
            default:
                this.f17161i.hideController();
                break;
        }
    }
}
