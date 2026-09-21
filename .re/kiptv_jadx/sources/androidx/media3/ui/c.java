package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17154i;

    public /* synthetic */ c(int i3, java.lang.Object obj) {
        this.f17153h = i3;
        this.f17154i = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        switch (this.f17153h) {
            case 0:
                ((androidx.media3.ui.PlayerControlView.AudioTrackSelectionAdapter) this.f17154i).lambda$onBindViewHolderAtZeroPosition$0(view);
                break;
            case 1:
                ((androidx.media3.ui.PlayerControlView.SettingViewHolder) this.f17154i).lambda$new$0(view);
                break;
            case 2:
                ((androidx.media3.ui.PlayerControlView.TextTrackSelectionAdapter) this.f17154i).lambda$onBindViewHolderAtZeroPosition$0(view);
                break;
            case 3:
                ((androidx.media3.ui.PlayerControlViewLayoutManager) this.f17154i).onOverflowButtonClick(view);
                break;
            default:
                ((androidx.media3.ui.PlayerControlView) this.f17154i).onFullscreenButtonClicked(view);
                break;
        }
    }
}
