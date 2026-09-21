package org.videolan.libvlc.util;

/* JADX INFO: loaded from: classes4.dex */
public class DisplayManager {
    private static final java.lang.String TAG = "VLC/DisplayManager";
    private android.app.Activity mActivity;
    private org.videolan.libvlc.util.DisplayManager.DisplayType mDisplayType;
    private android.media.MediaRouter mMediaRouter;
    private android.media.MediaRouter.SimpleCallback mMediaRouterCallback;
    private org.videolan.libvlc.util.DisplayManager.SecondaryDisplay mPresentation;
    private org.videolan.libvlc.RendererItem mRendererItem;
    private androidx.lifecycle.F mSelectedRenderer;
    private boolean mTextureView;
    private int mPresentationId = -1;
    private androidx.lifecycle.H mRendererObs = new androidx.lifecycle.H() { // from class: org.videolan.libvlc.util.DisplayManager.1
        @Override // androidx.lifecycle.H
        public void onChanged(org.videolan.libvlc.RendererItem rendererItem) {
            if (org.videolan.libvlc.util.DisplayManager.this.mRendererItem != rendererItem) {
                org.videolan.libvlc.util.DisplayManager.this.mRendererItem = rendererItem;
                org.videolan.libvlc.util.DisplayManager.this.updateDisplayType();
            }
        }
    };
    private android.content.DialogInterface.OnDismissListener mOnDismissListener = new android.content.DialogInterface.OnDismissListener() { // from class: org.videolan.libvlc.util.DisplayManager.2
        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            if (dialogInterface == org.videolan.libvlc.util.DisplayManager.this.mPresentation) {
                org.videolan.libvlc.util.DisplayManager.this.mPresentation = null;
                org.videolan.libvlc.util.DisplayManager.this.mPresentationId = -1;
            }
        }
    };

    public enum DisplayType {
        PRIMARY,
        PRESENTATION,
        RENDERER
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public DisplayManager(android.app.Activity activity, androidx.lifecycle.F f9, boolean z6, boolean z9, boolean z10) {
        org.videolan.libvlc.util.DisplayManager.SecondaryDisplay secondaryDisplayCreatePresentation;
        this.mActivity = activity;
        this.mSelectedRenderer = f9;
        this.mMediaRouter = (android.media.MediaRouter) activity.getApplicationContext().getSystemService(android.media.MediaRouter.class);
        this.mTextureView = z6;
        java.lang.Object obj = androidx.lifecycle.F.f16278k;
        if (z9 || z10 || f9 == null) {
            secondaryDisplayCreatePresentation = null;
        } else {
            java.lang.Object obj2 = f9.f16283e;
            if ((obj2 == obj ? null : obj2) == null) {
                secondaryDisplayCreatePresentation = createPresentation();
            } else {
                secondaryDisplayCreatePresentation = null;
            }
        }
        this.mPresentation = secondaryDisplayCreatePresentation;
        androidx.lifecycle.F f10 = this.mSelectedRenderer;
        if (f10 != null) {
            java.lang.Object obj3 = f10.f16283e;
            this.mRendererItem = (org.videolan.libvlc.RendererItem) (obj3 != obj ? obj3 : null);
            this.mSelectedRenderer.e(this.mRendererObs);
        }
        this.mDisplayType = z10 ? org.videolan.libvlc.util.DisplayManager.DisplayType.PRIMARY : getCurrentType();
    }

    private org.videolan.libvlc.util.DisplayManager.SecondaryDisplay createPresentation() {
        android.media.MediaRouter mediaRouter = this.mMediaRouter;
        if (mediaRouter == null) {
            return null;
        }
        android.media.MediaRouter.RouteInfo selectedRoute = mediaRouter.getSelectedRoute(2);
        android.view.Display presentationDisplay = selectedRoute != null ? selectedRoute.getPresentationDisplay() : null;
        if (presentationDisplay != null) {
            org.videolan.libvlc.util.DisplayManager.SecondaryDisplay secondaryDisplay = new org.videolan.libvlc.util.DisplayManager.SecondaryDisplay(this.mActivity, presentationDisplay);
            secondaryDisplay.setOnDismissListener(this.mOnDismissListener);
            try {
                secondaryDisplay.show();
                this.mPresentationId = presentationDisplay.getDisplayId();
                return secondaryDisplay;
            } catch (android.view.WindowManager.InvalidDisplayException unused) {
                this.mPresentationId = -1;
            }
        }
        return null;
    }

    private org.videolan.libvlc.util.DisplayManager.DisplayType getCurrentType() {
        if (this.mPresentationId != -1) {
            return org.videolan.libvlc.util.DisplayManager.DisplayType.PRESENTATION;
        }
        return this.mRendererItem != null ? org.videolan.libvlc.util.DisplayManager.DisplayType.RENDERER : org.videolan.libvlc.util.DisplayManager.DisplayType.PRIMARY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePresentation() {
        if (this.mMediaRouter == null) {
            return;
        }
        org.videolan.libvlc.util.DisplayManager.SecondaryDisplay secondaryDisplay = this.mPresentation;
        if (secondaryDisplay != null) {
            secondaryDisplay.dismiss();
            this.mPresentation = null;
        }
        updateDisplayType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDisplayType() {
        if (this.mDisplayType != getCurrentType()) {
            new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: org.videolan.libvlc.util.DisplayManager.3
                @Override // java.lang.Runnable
                public void run() {
                    org.videolan.libvlc.util.DisplayManager.this.mActivity.recreate();
                }
            }, 100L);
        }
    }

    public org.videolan.libvlc.util.DisplayManager.DisplayType getDisplayType() {
        return this.mDisplayType;
    }

    public org.videolan.libvlc.util.DisplayManager.SecondaryDisplay getPresentation() {
        return this.mPresentation;
    }

    public boolean isOnRenderer() {
        return this.mDisplayType == org.videolan.libvlc.util.DisplayManager.DisplayType.RENDERER;
    }

    public boolean isPrimary() {
        return this.mDisplayType == org.videolan.libvlc.util.DisplayManager.DisplayType.PRIMARY;
    }

    public boolean isSecondary() {
        return this.mDisplayType == org.videolan.libvlc.util.DisplayManager.DisplayType.PRESENTATION;
    }

    public void release() {
        org.videolan.libvlc.util.DisplayManager.SecondaryDisplay secondaryDisplay = this.mPresentation;
        if (secondaryDisplay != null) {
            secondaryDisplay.dismiss();
            this.mPresentation = null;
        }
        androidx.lifecycle.F f9 = this.mSelectedRenderer;
        if (f9 != null) {
            f9.h(this.mRendererObs);
        }
    }

    public void removeMediaRouterCallback() {
        android.media.MediaRouter mediaRouter = this.mMediaRouter;
        if (mediaRouter != null) {
            mediaRouter.removeCallback(this.mMediaRouterCallback);
        }
        this.mMediaRouterCallback = null;
    }

    public boolean setMediaRouterCallback() {
        if (this.mMediaRouter == null || this.mMediaRouterCallback != null) {
            return false;
        }
        android.media.MediaRouter.SimpleCallback simpleCallback = new android.media.MediaRouter.SimpleCallback() { // from class: org.videolan.libvlc.util.DisplayManager.4
            @Override // android.media.MediaRouter.Callback
            public void onRoutePresentationDisplayChanged(android.media.MediaRouter mediaRouter, android.media.MediaRouter.RouteInfo routeInfo) {
                int displayId = routeInfo.getPresentationDisplay() != null ? routeInfo.getPresentationDisplay().getDisplayId() : -1;
                if (displayId == org.videolan.libvlc.util.DisplayManager.this.mPresentationId) {
                    return;
                }
                org.videolan.libvlc.util.DisplayManager.this.mPresentationId = displayId;
                if (displayId == -1) {
                    org.videolan.libvlc.util.DisplayManager.this.removePresentation();
                } else {
                    org.videolan.libvlc.util.DisplayManager.this.updateDisplayType();
                }
            }
        };
        this.mMediaRouterCallback = simpleCallback;
        this.mMediaRouter.addCallback(2, simpleCallback);
        return true;
    }

    public class SecondaryDisplay extends android.app.Presentation {
        public static final java.lang.String TAG = "VLC/SecondaryDisplay";
        private android.view.SurfaceView mSubtitlesSurfaceView;
        private android.widget.FrameLayout mSurfaceFrame;
        private android.view.SurfaceView mSurfaceView;

        public SecondaryDisplay(android.content.Context context, android.view.Display display) {
            super(context, display);
        }

        public android.view.SurfaceView getSubtitlesSurfaceView() {
            return this.mSubtitlesSurfaceView;
        }

        public android.widget.FrameLayout getSurfaceFrame() {
            return this.mSurfaceFrame;
        }

        public android.view.SurfaceView getSurfaceView() {
            return this.mSurfaceView;
        }

        @Override // android.app.Dialog
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            setContentView(com.kiptv.tv.R.layout.player_remote);
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.kiptv.tv.R.id.remote_player_surface_frame);
            this.mSurfaceFrame = frameLayout;
            this.mSurfaceView = (android.view.SurfaceView) frameLayout.findViewById(com.kiptv.tv.R.id.remote_player_surface);
            android.view.SurfaceView surfaceView = (android.view.SurfaceView) this.mSurfaceFrame.findViewById(com.kiptv.tv.R.id.remote_subtitles_surface);
            this.mSubtitlesSurfaceView = surfaceView;
            surfaceView.setZOrderMediaOverlay(true);
            this.mSubtitlesSurfaceView.getHolder().setFormat(-3);
        }

        public SecondaryDisplay(android.content.Context context, android.view.Display display, int i3) {
            super(context, display, i3);
        }
    }
}
