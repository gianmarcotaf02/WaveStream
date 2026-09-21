package org.videolan.libvlc;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.gms.internal.play_billing.M0;
import com.kiptv.tv.R;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IVLCVout;
import org.videolan.libvlc.util.AndroidUtil;
import org.videolan.libvlc.util.DisplayManager;
import org.videolan.libvlc.util.VLCVideoLayout;

class VideoHelper implements IVLCVout.OnNewVideoLayoutListener {
    private static final String TAG = "LibVLC/VideoHelper";
    private float mCustomScale;
    private DisplayManager mDisplayManager;
    private MediaPlayer mMediaPlayer;
    private FrameLayout mVideoSurfaceFrame;
    private MediaPlayer.ScaleType mCurrentScaleType = MediaPlayer.ScaleType.SURFACE_BEST_FIT;
    private boolean mCurrentScaleCustom = false;
    private int mVideoHeight = 0;
    private int mVideoWidth = 0;
    private int mVideoVisibleHeight = 0;
    private int mVideoVisibleWidth = 0;
    private int mVideoSarNum = 0;
    private int mVideoSarDen = 0;
    private SurfaceView mVideoSurface = null;
    private SurfaceView mSubtitlesSurface = null;
    private TextureView mVideoTexture = null;
    private final Handler mHandler = new Handler();
    private View.OnLayoutChangeListener mOnLayoutChangeListener = null;

    public static class AnonymousClass2 {
        static final int[] $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType;

        static {
            int[] iArr = new int[MediaPlayer.ScaleType.values().length];
            $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType = iArr;
            try {
                iArr[MediaPlayer.ScaleType.SURFACE_BEST_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_FIT_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_16_9.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_16_10.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_2_1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_221_1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_235_1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_239_1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_5_4.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_4_3.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[MediaPlayer.ScaleType.SURFACE_ORIGINAL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public VideoHelper(MediaPlayer mediaPlayer, VLCVideoLayout vLCVideoLayout, DisplayManager displayManager, boolean z6, boolean z9) {
        init(mediaPlayer, vLCVideoLayout, displayManager, z6, !z9);
    }

    private void changeMediaPlayerLayout(int i3, int i9) {
        if (this.mMediaPlayer.isReleased()) {
            return;
        }
        if (this.mCurrentScaleCustom) {
            this.mMediaPlayer.setAspectRatio(null);
            this.mMediaPlayer.setNativeScale(this.mCustomScale);
        }
        switch (AnonymousClass2.$SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[this.mCurrentScaleType.ordinal()]) {
            case 1:
                this.mMediaPlayer.setAspectRatio(null);
                this.mMediaPlayer.setNativeScale(0.0f);
                break;
            case 2:
            case 3:
                boolean z6 = true;
                IMedia.VideoTrack videoTrack = (IMedia.VideoTrack) this.mMediaPlayer.getSelectedTrack(1);
                if (videoTrack != null) {
                    int i10 = videoTrack.orientation;
                    if (i10 != 5 && i10 != 6) {
                        z6 = false;
                    }
                    if (this.mCurrentScaleType != MediaPlayer.ScaleType.SURFACE_FIT_SCREEN) {
                        this.mMediaPlayer.setNativeScale(0.0f);
                        this.mMediaPlayer.setAspectRatio(!z6 ? M0.k(i3, i9, "", ":") : M0.k(i9, i3, "", ":"));
                    } else {
                        int i11 = videoTrack.width;
                        int i12 = videoTrack.height;
                        if (z6) {
                            i12 = i11;
                            i11 = i12;
                        }
                        int i13 = videoTrack.sarNum;
                        int i14 = videoTrack.sarDen;
                        if (i13 != i14) {
                            i11 = (i11 * i13) / i14;
                        }
                        float f9 = i11;
                        float f10 = i12;
                        float f11 = i3;
                        float f12 = i9;
                        this.mMediaPlayer.setNativeScale(f11 / f12 >= f9 / f10 ? f11 / f9 : f12 / f10);
                        this.mMediaPlayer.setAspectRatio(null);
                    }
                    break;
                }
                break;
            case 4:
                this.mMediaPlayer.setAspectRatio("16:9");
                this.mMediaPlayer.setNativeScale(0.0f);
                break;
            case 5:
                this.mMediaPlayer.setAspectRatio("16:10");
                this.mMediaPlayer.setNativeScale(0.0f);
                break;
            case 6:
                this.mMediaPlayer.setAspectRatio("2:1");
                this.mMediaPlayer.setNativeScale(0.0f);
                break;
            case 7:
                this.mMediaPlayer.setAspectRatio("221:100");
                this.mMediaPlayer.setNativeScale(0.0f);
                break;
            case 8:
                this.mMediaPlayer.setAspectRatio("235:100");
                this.mMediaPlayer.setNativeScale(0.0f);
                break;
            case 9:
                this.mMediaPlayer.setAspectRatio("239:100");
                this.mMediaPlayer.setNativeScale(0.0f);
                break;
            case 10:
                this.mMediaPlayer.setAspectRatio("5:4");
                this.mMediaPlayer.setNativeScale(0.0f);
                break;
            case 11:
                this.mMediaPlayer.setAspectRatio("4:3");
                this.mMediaPlayer.setNativeScale(0.0f);
                break;
            case 12:
                this.mMediaPlayer.setAspectRatio(null);
                this.mMediaPlayer.setNativeScale(1.0f);
                break;
        }
    }

    private void init(MediaPlayer mediaPlayer, VLCVideoLayout vLCVideoLayout, DisplayManager displayManager, boolean z6, boolean z9) {
        this.mMediaPlayer = mediaPlayer;
        this.mDisplayManager = displayManager;
        if (displayManager != null && !displayManager.isPrimary()) {
            if (this.mDisplayManager.getPresentation() != null) {
                this.mVideoSurfaceFrame = this.mDisplayManager.getPresentation().getSurfaceFrame();
                this.mVideoSurface = this.mDisplayManager.getPresentation().getSurfaceView();
                this.mSubtitlesSurface = this.mDisplayManager.getPresentation().getSubtitlesSurfaceView();
                return;
            }
            return;
        }
        FrameLayout frameLayout = (FrameLayout) vLCVideoLayout.findViewById(R.id.player_surface_frame);
        this.mVideoSurfaceFrame = frameLayout;
        if (!z9) {
            ViewStub viewStub = (ViewStub) frameLayout.findViewById(R.id.texture_stub);
            this.mVideoTexture = (TextureView) (viewStub != null ? viewStub.inflate() : this.mVideoSurfaceFrame.findViewById(R.id.texture_video));
            return;
        }
        ViewStub viewStub2 = (ViewStub) frameLayout.findViewById(R.id.surface_stub);
        this.mVideoSurface = (SurfaceView) (viewStub2 != null ? viewStub2.inflate() : this.mVideoSurfaceFrame.findViewById(R.id.surface_video));
        if (z6) {
            ViewStub viewStub3 = (ViewStub) vLCVideoLayout.findViewById(R.id.subtitles_surface_stub);
            SurfaceView surfaceView = (SurfaceView) (viewStub3 != null ? viewStub3.inflate() : vLCVideoLayout.findViewById(R.id.surface_subtitles));
            this.mSubtitlesSurface = surfaceView;
            surfaceView.setZOrderMediaOverlay(true);
            this.mSubtitlesSurface.getHolder().setFormat(-3);
        }
    }

    public void attachViews() {
        if (this.mVideoSurface == null && this.mVideoTexture == null) {
            return;
        }
        IVLCVout vLCVout = this.mMediaPlayer.getVLCVout();
        SurfaceView surfaceView = this.mVideoSurface;
        if (surfaceView != null) {
            vLCVout.setVideoView(surfaceView);
            SurfaceView surfaceView2 = this.mSubtitlesSurface;
            if (surfaceView2 != null) {
                vLCVout.setSubtitlesView(surfaceView2);
            }
        } else {
            TextureView textureView = this.mVideoTexture;
            if (textureView == null) {
                return;
            } else {
                vLCVout.setVideoView(textureView);
            }
        }
        vLCVout.attachViews(this);
        if (this.mOnLayoutChangeListener == null) {
            this.mOnLayoutChangeListener = new View.OnLayoutChangeListener() {
                private final Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        if (VideoHelper.this.mVideoSurfaceFrame == null || VideoHelper.this.mOnLayoutChangeListener == null) {
                            return;
                        }
                        VideoHelper.this.updateVideoSurfaces();
                    }
                };

                @Override
                public void onLayoutChange(View view, int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                    if (i3 == i12 && i9 == i13 && i10 == i14 && i11 == i15) {
                        return;
                    }
                    VideoHelper.this.mHandler.removeCallbacks(this.runnable);
                    VideoHelper.this.mHandler.post(this.runnable);
                }
            };
        }
        this.mVideoSurfaceFrame.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        this.mMediaPlayer.setVideoTrackEnabled(true);
    }

    public void detachViews() {
        FrameLayout frameLayout;
        View.OnLayoutChangeListener onLayoutChangeListener = this.mOnLayoutChangeListener;
        if (onLayoutChangeListener != null && (frameLayout = this.mVideoSurfaceFrame) != null) {
            frameLayout.removeOnLayoutChangeListener(onLayoutChangeListener);
            this.mOnLayoutChangeListener = null;
        }
        this.mMediaPlayer.setVideoTrackEnabled(false);
        this.mMediaPlayer.getVLCVout().detachViews();
    }

    public MediaPlayer.ScaleType getVideoScale() {
        return this.mCurrentScaleType;
    }

    @Override
    public void onNewVideoLayout(IVLCVout iVLCVout, int i3, int i9, int i10, int i11, int i12, int i13) {
        if (i3 == 0 && i9 == 0 && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            this.mVideoVisibleHeight = 0;
            this.mVideoVisibleWidth = 0;
            this.mVideoHeight = 0;
            this.mVideoWidth = 0;
            this.mVideoSarDen = 0;
            this.mVideoSarNum = 0;
        } else {
            if (i3 != 0 && i9 != 0) {
                this.mVideoWidth = i3;
                this.mVideoHeight = i9;
            }
            if (i10 != 0 && i11 != 0) {
                this.mVideoVisibleWidth = i10;
                this.mVideoVisibleHeight = i11;
            }
            if (i12 != 0 && i13 != 0) {
                this.mVideoSarNum = i12;
                this.mVideoSarDen = i13;
            }
        }
        updateVideoSurfaces();
    }

    public void release() {
        if (this.mMediaPlayer.getVLCVout().areViewsAttached()) {
            detachViews();
        }
        this.mMediaPlayer = null;
        this.mVideoSurfaceFrame = null;
        this.mHandler.removeCallbacks(null);
        this.mVideoSurface = null;
        this.mSubtitlesSurface = null;
        this.mVideoTexture = null;
    }

    public void setCustomScale(float f9) {
        this.mCustomScale = f9;
        this.mCurrentScaleCustom = true;
        updateVideoSurfaces();
    }

    public void setVideoScale(MediaPlayer.ScaleType scaleType) {
        this.mCurrentScaleType = scaleType;
        this.mCurrentScaleCustom = false;
        updateVideoSurfaces();
    }

    public void updateVideoSurfaces() {
        int width;
        int height;
        double d4;
        double dFloatValue;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || mediaPlayer.isReleased() || !this.mMediaPlayer.getVLCVout().areViewsAttached()) {
            return;
        }
        DisplayManager displayManager = this.mDisplayManager;
        boolean z6 = false;
        boolean z9 = displayManager == null || displayManager.isPrimary();
        Activity activityResolveActivity = !z9 ? null : AndroidUtil.resolveActivity(this.mVideoSurfaceFrame.getContext());
        if (activityResolveActivity != null) {
            width = this.mVideoSurfaceFrame.getWidth();
            height = this.mVideoSurfaceFrame.getHeight();
        } else {
            DisplayManager displayManager2 = this.mDisplayManager;
            if (displayManager2 == null || displayManager2.getPresentation() == null || this.mDisplayManager.getPresentation().getWindow() == null) {
                return;
            }
            width = this.mDisplayManager.getPresentation().getWindow().getDecorView().getWidth();
            height = this.mDisplayManager.getPresentation().getWindow().getDecorView().getHeight();
        }
        if (width * height == 0) {
            Log.e(TAG, "Invalid surface size");
            return;
        }
        this.mMediaPlayer.getVLCVout().setWindowSize(width, height);
        View view = this.mVideoSurface;
        if (view == null) {
            view = this.mVideoTexture;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.mVideoWidth * this.mVideoHeight == 0 || (AndroidUtil.isNougatOrLater && activityResolveActivity != null && activityResolveActivity.isInPictureInPictureMode())) {
            changeMediaPlayerLayout(width, height);
            layoutParams.width = -1;
            layoutParams.height = -1;
            view.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.mVideoSurfaceFrame.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            this.mVideoSurfaceFrame.setLayoutParams(layoutParams2);
            return;
        }
        int i3 = layoutParams.width;
        if (i3 == layoutParams.height && i3 == -1) {
            this.mMediaPlayer.setAspectRatio(null);
            this.mMediaPlayer.setNativeScale(0.0f);
        }
        double d6 = width;
        double d9 = height;
        boolean z10 = this.mVideoSurfaceFrame.getResources().getConfiguration().orientation == 1;
        if (this.mMediaPlayer.useOrientationFromBounds().booleanValue()) {
            z10 = height > width;
        }
        if (z9 && z10) {
            z6 = true;
        }
        if ((width > height && z6) || (width < height && !z6)) {
            d9 = d6;
            d6 = d9;
        }
        int i9 = this.mVideoSarDen;
        int i10 = this.mVideoSarNum;
        if (i9 == i10) {
            int i11 = this.mVideoVisibleWidth;
            d4 = i11;
            dFloatValue = ((double) i11) / ((double) this.mVideoVisibleHeight);
        } else {
            d4 = (((double) this.mVideoVisibleWidth) * ((double) i10)) / ((double) i9);
            dFloatValue = d4 / ((double) this.mVideoVisibleHeight);
        }
        double d10 = d6 / d9;
        MediaPlayer.ScaleType scaleType = this.mCurrentScaleType;
        if (this.mCurrentScaleCustom) {
            float f9 = this.mCustomScale;
            d9 *= (double) f9;
            d6 *= (double) f9;
            scaleType = MediaPlayer.ScaleType.SURFACE_BEST_FIT;
        }
        int i12 = AnonymousClass2.$SwitchMap$org$videolan$libvlc$MediaPlayer$ScaleType[scaleType.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    d4 = d6;
                } else if (i12 != 12) {
                    dFloatValue = this.mCurrentScaleType.getRatio().floatValue();
                    if (d10 < dFloatValue) {
                        d9 = d6 / dFloatValue;
                        d4 = d6;
                    } else {
                        d4 = d9 * dFloatValue;
                    }
                } else {
                    d9 = this.mVideoVisibleHeight;
                }
            } else if (d10 >= dFloatValue) {
                d9 = d6 / dFloatValue;
                d4 = d6;
            } else {
                d4 = d9 * dFloatValue;
            }
        } else if (d10 < dFloatValue) {
            d9 = d6 / dFloatValue;
            d4 = d6;
        } else {
            d4 = d9 * dFloatValue;
        }
        layoutParams.width = (int) Math.ceil((d4 * ((double) this.mVideoWidth)) / ((double) this.mVideoVisibleWidth));
        layoutParams.height = (int) Math.ceil((d9 * ((double) this.mVideoHeight)) / ((double) this.mVideoVisibleHeight));
        view.setLayoutParams(layoutParams);
        view.invalidate();
    }
}
