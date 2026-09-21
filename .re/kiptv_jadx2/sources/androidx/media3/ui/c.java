package androidx.media3.ui;

import android.view.View;

public final class c implements View.OnClickListener {

    public final int f17153h;

    public final Object f17154i;

    public c(int i3, Object obj) {
        this.f17153h = i3;
        this.f17154i = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17153h) {
            case 0:
                ((PlayerControlView.AudioTrackSelectionAdapter) this.f17154i).lambda$onBindViewHolderAtZeroPosition$0(view);
                break;
            case 1:
                ((PlayerControlView.SettingViewHolder) this.f17154i).lambda$new$0(view);
                break;
            case 2:
                ((PlayerControlView.TextTrackSelectionAdapter) this.f17154i).lambda$onBindViewHolderAtZeroPosition$0(view);
                break;
            case 3:
                ((PlayerControlViewLayoutManager) this.f17154i).onOverflowButtonClick(view);
                break;
            default:
                ((PlayerControlView) this.f17154i).onFullscreenButtonClicked(view);
                break;
        }
    }
}
