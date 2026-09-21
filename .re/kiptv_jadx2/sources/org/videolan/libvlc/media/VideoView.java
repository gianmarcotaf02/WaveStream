package org.videolan.libvlc.media;

import android.content.Context;
import android.graphics.Canvas;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import java.io.InputStream;
import java.util.Map;
import org.videolan.libvlc.LibVLC;
import org.videolan.libvlc.Media;
import org.videolan.libvlc.interfaces.ILibVLC;

public class VideoView extends SurfaceView implements MediaController.MediaPlayerControl {
    private static ILibVLC sILibVLC;

    public VideoView(Context context) {
        super(context);
        sILibVLC = new LibVLC(context, null);
    }

    public void addSubtitleSource(InputStream inputStream, MediaFormat mediaFormat) {
    }

    @Override
    public boolean canPause() {
        return false;
    }

    @Override
    public boolean canSeekBackward() {
        return false;
    }

    @Override
    public boolean canSeekForward() {
        return false;
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    public int getAudioSessionId() {
        return 0;
    }

    @Override
    public int getBufferPercentage() {
        return 0;
    }

    @Override
    public int getCurrentPosition() {
        return 0;
    }

    @Override
    public int getDuration() {
        return -1;
    }

    @Override
    public boolean isPlaying() {
        return false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        return super.onKeyDown(i3, keyEvent);
    }

    @Override
    public void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        super.onLayout(z6, i3, i9, i10, i11);
    }

    @Override
    public void onMeasure(int i3, int i9) {
        super.onMeasure(i3, i9);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    @Override
    public void pause() {
    }

    public int resolveAdjustedSize(int i3, int i9) {
        return View.getDefaultSize(i3, i9);
    }

    public void resume() {
    }

    @Override
    public void seekTo(int i3) {
    }

    public void setMediaController(MediaController mediaController) {
    }

    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener onCompletionListener) {
    }

    public void setOnErrorListener(android.media.MediaPlayer.OnErrorListener onErrorListener) {
    }

    public void setOnInfoListener(android.media.MediaPlayer.OnInfoListener onInfoListener) {
    }

    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onPreparedListener) {
    }

    public void setVideoPath(String str) {
        new Media(sILibVLC, str);
    }

    public void setVideoURI(Uri uri) {
        new Media(sILibVLC, uri);
    }

    @Override
    public void start() {
    }

    public void stopPlayback() {
    }

    public void suspend() {
    }

    public void setVideoURI(Uri uri, Map<String, String> map) {
        setVideoURI(uri);
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoView(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public VideoView(Context context, AttributeSet attributeSet, int i3, int i9) {
        super(context, attributeSet, i3, i9);
    }
}
