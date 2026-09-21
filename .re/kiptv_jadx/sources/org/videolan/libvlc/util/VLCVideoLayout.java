package org.videolan.libvlc.util;

/* JADX INFO: loaded from: classes4.dex */
public class VLCVideoLayout extends android.widget.FrameLayout {
    public VLCVideoLayout(android.content.Context context) {
        super(context);
        setupLayout(context);
    }

    private void setupLayout(android.content.Context context) {
        android.view.View.inflate(context, com.kiptv.tv.R.layout.vlc_video_layout, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBackgroundResource(com.kiptv.tv.R.color.black);
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        setLayoutParams(layoutParams);
    }

    public VLCVideoLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setupLayout(context);
    }

    public VLCVideoLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        setupLayout(context);
    }

    public VLCVideoLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i3, int i9) {
        super(context, attributeSet, i3, i9);
        setupLayout(context);
    }
}
