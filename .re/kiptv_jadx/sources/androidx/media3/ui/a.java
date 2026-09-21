package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f17150i;

    public /* synthetic */ a(android.view.View view, int i3) {
        this.f17149h = i3;
        this.f17150i = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17149h) {
            case 0:
                ((androidx.media3.ui.DefaultTimeBar) this.f17150i).lambda$new$0();
                break;
            case 1:
                ((androidx.media3.ui.PlayerControlView) this.f17150i).updateProgress();
                break;
            default:
                ((androidx.media3.ui.PlayerView) this.f17150i).invalidate();
                break;
        }
    }
}
