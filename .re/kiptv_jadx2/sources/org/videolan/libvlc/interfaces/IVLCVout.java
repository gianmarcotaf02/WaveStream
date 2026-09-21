package org.videolan.libvlc.interfaces;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;

public interface IVLCVout {

    public interface Callback {
        void onSurfacesCreated(IVLCVout iVLCVout);

        void onSurfacesDestroyed(IVLCVout iVLCVout);
    }

    public interface OnNewVideoLayoutListener {
        void onNewVideoLayout(IVLCVout iVLCVout, int i3, int i9, int i10, int i11, int i12, int i13);
    }

    void addCallback(Callback callback);

    boolean areViewsAttached();

    void attachViews();

    void attachViews(OnNewVideoLayoutListener onNewVideoLayoutListener);

    void detachViews();

    void removeCallback(Callback callback);

    void sendMouseEvent(int i3, int i9, int i10, int i11);

    void setSubtitlesSurface(SurfaceTexture surfaceTexture);

    void setSubtitlesSurface(Surface surface, SurfaceHolder surfaceHolder);

    void setSubtitlesView(SurfaceView surfaceView);

    void setSubtitlesView(TextureView textureView);

    void setVideoSurface(SurfaceTexture surfaceTexture);

    void setVideoSurface(Surface surface, SurfaceHolder surfaceHolder);

    void setVideoView(SurfaceView surfaceView);

    void setVideoView(TextureView textureView);

    void setWindowSize(int i3, int i9);
}
