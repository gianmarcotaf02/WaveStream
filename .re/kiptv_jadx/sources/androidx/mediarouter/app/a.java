package androidx.mediarouter.app;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.mediarouter.app.MediaRouteExpandCollapseButton f17185h;

    public a(androidx.mediarouter.app.MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.f17185h = mediaRouteExpandCollapseButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        androidx.mediarouter.app.MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.f17185h;
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
        android.view.View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.f17182p;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
