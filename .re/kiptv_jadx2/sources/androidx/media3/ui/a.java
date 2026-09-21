package androidx.media3.ui;

import android.view.View;

public final class a implements Runnable {

    public final int f17149h;

    public final View f17150i;

    public a(View view, int i3) {
        this.f17149h = i3;
        this.f17150i = view;
    }

    @Override
    public final void run() {
        switch (this.f17149h) {
            case 0:
                ((DefaultTimeBar) this.f17150i).lambda$new$0();
                break;
            case 1:
                ((PlayerControlView) this.f17150i).updateProgress();
                break;
            default:
                ((PlayerView) this.f17150i).invalidate();
                break;
        }
    }
}
