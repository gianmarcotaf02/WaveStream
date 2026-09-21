package org.videolan.libvlc.interfaces;

/* JADX INFO: loaded from: classes4.dex */
public interface IVLCVout {

    public interface Callback {
        void onSurfacesCreated(org.videolan.libvlc.interfaces.IVLCVout iVLCVout);

        void onSurfacesDestroyed(org.videolan.libvlc.interfaces.IVLCVout iVLCVout);
    }

    public interface OnNewVideoLayoutListener {
        void onNewVideoLayout(org.videolan.libvlc.interfaces.IVLCVout iVLCVout, int i3, int i9, int i10, int i11, int i12, int i13);
    }

    void addCallback(org.videolan.libvlc.interfaces.IVLCVout.Callback callback);

    boolean areViewsAttached();

    void attachViews();

    void attachViews(org.videolan.libvlc.interfaces.IVLCVout.OnNewVideoLayoutListener onNewVideoLayoutListener);

    void detachViews();

    void removeCallback(org.videolan.libvlc.interfaces.IVLCVout.Callback callback);

    void sendMouseEvent(int i3, int i9, int i10, int i11);

    void setSubtitlesSurface(android.graphics.SurfaceTexture surfaceTexture);

    void setSubtitlesSurface(android.view.Surface surface, android.view.SurfaceHolder surfaceHolder);

    void setSubtitlesView(android.view.SurfaceView surfaceView);

    void setSubtitlesView(android.view.TextureView textureView);

    void setVideoSurface(android.graphics.SurfaceTexture surfaceTexture);

    void setVideoSurface(android.view.Surface surface, android.view.SurfaceHolder surfaceHolder);

    void setVideoView(android.view.SurfaceView surfaceView);

    void setVideoView(android.view.TextureView textureView);

    void setWindowSize(int i3, int i9);
}
