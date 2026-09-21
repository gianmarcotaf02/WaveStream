package androidx.mediarouter.app;

import android.view.View;

public final class a implements View.OnClickListener {

    public final MediaRouteExpandCollapseButton f17185h;

    public a(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.f17185h = mediaRouteExpandCollapseButton;
    }

    @Override
    public final void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.f17185h;
        boolean z6 = mediaRouteExpandCollapseButton.f17181o;
        mediaRouteExpandCollapseButton.f17181o = !z6;
        if (z6) {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f17178l);
            mediaRouteExpandCollapseButton.f17178l.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f17179m);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f17177k);
            mediaRouteExpandCollapseButton.f17177k.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f17180n);
        }
        View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.f17182p;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
