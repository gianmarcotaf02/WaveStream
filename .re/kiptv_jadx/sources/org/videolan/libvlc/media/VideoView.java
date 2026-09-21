package org.videolan.libvlc.media;

/* JADX INFO: loaded from: classes4.dex */
public class VideoView extends android.view.SurfaceView implements android.widget.MediaController.MediaPlayerControl {
    private static org.videolan.libvlc.interfaces.ILibVLC sILibVLC;

    public VideoView(android.content.Context context) {
        super(context);
        sILibVLC = new org.videolan.libvlc.LibVLC(context, null);
    }

    public void addSubtitleSource(java.io.InputStream inputStream, android.media.MediaFormat mediaFormat) {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i3, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i3, keyEvent);
    }

    @Override // android.view.View
    public void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        super.onLayout(z6, i3, i9, i10, i11);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i3, int i9) {
        super.onMeasure(i3, i9);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTrackballEvent(android.view.MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
    }

    public int resolveAdjustedSize(int i3, int i9) {
        return android.view.View.getDefaultSize(i3, i9);
    }

    public void resume() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i3) {
    }

    public void setMediaController(android.widget.MediaController mediaController) {
    }

    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener onCompletionListener) {
    }

    public void setOnErrorListener(android.media.MediaPlayer.OnErrorListener onErrorListener) {
    }

    public void setOnInfoListener(android.media.MediaPlayer.OnInfoListener onInfoListener) {
    }

    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onPreparedListener) {
    }

    public void setVideoPath(java.lang.String str) {
        new org.videolan.libvlc.Media(sILibVLC, str);
    }

    public void setVideoURI(android.net.Uri uri) {
        new org.videolan.libvlc.Media(sILibVLC, uri);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
    }

    public void stopPlayback() {
    }

    public void suspend() {
    }

    public void setVideoURI(android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> map) {
        setVideoURI(uri);
    }

    public VideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public VideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i3, int i9) {
        super(context, attributeSet, i3, i9);
    }
}
