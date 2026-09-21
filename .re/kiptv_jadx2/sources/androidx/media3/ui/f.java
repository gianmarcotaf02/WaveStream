package androidx.media3.ui;

public final class f implements Runnable {

    public final int f17160h;

    public final PlayerControlViewLayoutManager f17161i;

    public f(PlayerControlViewLayoutManager playerControlViewLayoutManager, int i3) {
        this.f17160h = i3;
        this.f17161i = playerControlViewLayoutManager;
    }

    @Override
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
