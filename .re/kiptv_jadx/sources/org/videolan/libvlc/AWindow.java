package org.videolan.libvlc;

/* JADX INFO: loaded from: classes4.dex */
public class AWindow implements org.videolan.libvlc.interfaces.IVLCVout {
    private static final int AWINDOW_REGISTER_ERROR = 0;
    private static final int AWINDOW_REGISTER_FLAGS_HAS_VIDEO_LAYOUT_LISTENER = 2;
    private static final int AWINDOW_REGISTER_FLAGS_SUCCESS = 1;
    private static final int ID_MAX = 2;
    private static final int ID_SUBTITLES = 1;
    private static final int ID_VIDEO = 0;
    private static final int SURFACE_STATE_ATTACHED = 1;
    private static final int SURFACE_STATE_INIT = 0;
    private static final int SURFACE_STATE_READY = 2;
    private static final java.lang.String TAG = "AWindow";
    private final org.videolan.libvlc.AWindow.NativeLock mNativeLock;
    private final org.videolan.libvlc.AWindow.SurfaceCallback mSurfaceCallback;
    private org.videolan.libvlc.AWindow.SurfaceTextureThread mSurfaceTextureThread;
    private final java.util.concurrent.atomic.AtomicInteger mSurfacesState = new java.util.concurrent.atomic.AtomicInteger(0);
    private org.videolan.libvlc.interfaces.IVLCVout.OnNewVideoLayoutListener mOnNewVideoLayoutListener = null;
    private java.util.ArrayList<org.videolan.libvlc.interfaces.IVLCVout.Callback> mIVLCVoutCallbacks = new java.util.ArrayList<>();
    private final android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private long mCallbackNativeHandle = 0;
    private int mMouseAction = -1;
    private int mMouseButton = -1;
    private int mMouseX = -1;
    private int mMouseY = -1;
    private int mWindowWidth = -1;
    private int mWindowHeight = -1;
    private final org.videolan.libvlc.AWindow.SurfaceHelper[] mSurfaceHelpers = {null, null};
    private final android.view.Surface[] mSurfaces = {null, null};

    public static class NativeLock {
        private boolean buffersGeometryAbort;
        private boolean buffersGeometryConfigured;

        private NativeLock() {
            this.buffersGeometryConfigured = false;
            this.buffersGeometryAbort = false;
        }
    }

    public interface SurfaceCallback {
        void onSurfacesCreated(org.videolan.libvlc.AWindow aWindow);

        void onSurfacesDestroyed(org.videolan.libvlc.AWindow aWindow);
    }

    public static class SurfaceTextureThread implements java.lang.Runnable, android.graphics.SurfaceTexture.OnFrameAvailableListener {
        private boolean mDoRelease;
        private boolean mFrameAvailable;
        private boolean mIsAttached;
        private android.os.Looper mLooper;
        private android.view.Surface mSurface;
        private android.graphics.SurfaceTexture mSurfaceTexture;
        private java.lang.Thread mThread;

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized boolean attachToGLContext(int i3) {
            if (!createSurface()) {
                return false;
            }
            this.mSurfaceTexture.attachToGLContext(i3);
            this.mFrameAvailable = false;
            this.mIsAttached = true;
            return true;
        }

        private synchronized boolean createSurface() {
            if (this.mSurfaceTexture == null) {
                java.lang.Thread thread = new java.lang.Thread(this);
                this.mThread = thread;
                thread.start();
                while (this.mSurfaceTexture == null) {
                    try {
                        wait();
                    } catch (java.lang.InterruptedException unused) {
                        return false;
                    }
                }
                this.mSurface = new android.view.Surface(this.mSurfaceTexture);
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void detachFromGLContext() {
            if (this.mDoRelease) {
                this.mLooper.quit();
                this.mLooper = null;
                try {
                    this.mThread.join();
                } catch (java.lang.InterruptedException unused) {
                }
                this.mThread = null;
                this.mSurface.release();
                this.mSurface = null;
                this.mSurfaceTexture.release();
                this.mSurfaceTexture = null;
                this.mDoRelease = false;
            } else {
                this.mSurfaceTexture.detachFromGLContext();
            }
            this.mIsAttached = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized android.view.Surface getSurface() {
            if (!createSurface()) {
                return null;
            }
            return this.mSurface;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void release() {
            try {
                if (this.mSurfaceTexture != null) {
                    if (this.mIsAttached) {
                        this.mDoRelease = true;
                    } else {
                        this.mSurface.release();
                        this.mSurface = null;
                        this.mSurfaceTexture.release();
                        this.mSurfaceTexture = null;
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean waitAndUpdateTexImage(float[] fArr) {
            synchronized (this) {
                while (!this.mFrameAvailable) {
                    try {
                        try {
                            wait(500L);
                            if (!this.mFrameAvailable) {
                                return false;
                            }
                        } catch (java.lang.InterruptedException unused) {
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                this.mFrameAvailable = false;
                this.mSurfaceTexture.updateTexImage();
                this.mSurfaceTexture.getTransformMatrix(fArr);
                return true;
            }
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public synchronized void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
            try {
                if (surfaceTexture == this.mSurfaceTexture) {
                    if (this.mFrameAvailable) {
                        throw new java.lang.IllegalStateException("An available frame was not updated");
                    }
                    this.mFrameAvailable = true;
                    notify();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            android.os.Looper.prepare();
            synchronized (this) {
                this.mLooper = android.os.Looper.myLooper();
                android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(0);
                this.mSurfaceTexture = surfaceTexture;
                surfaceTexture.detachFromGLContext();
                this.mSurfaceTexture.setOnFrameAvailableListener(this);
                notify();
            }
            android.os.Looper.loop();
        }

        private SurfaceTextureThread() {
            this.mSurfaceTexture = null;
            this.mSurface = null;
            this.mFrameAvailable = false;
            this.mLooper = null;
            this.mThread = null;
            this.mIsAttached = false;
            this.mDoRelease = false;
        }
    }

    public AWindow(org.videolan.libvlc.AWindow.SurfaceCallback surfaceCallback) {
        this.mSurfaceTextureThread = new org.videolan.libvlc.AWindow.SurfaceTextureThread();
        this.mNativeLock = new org.videolan.libvlc.AWindow.NativeLock();
        this.mSurfaceCallback = surfaceCallback;
    }

    private void SurfaceTexture_detachFromGLContext() {
        this.mSurfaceTextureThread.detachFromGLContext();
    }

    private android.view.Surface SurfaceTexture_getSurface() {
        return this.mSurfaceTextureThread.getSurface();
    }

    private boolean SurfaceTexture_waitAndUpdateTexImage(float[] fArr) {
        return this.mSurfaceTextureThread.waitAndUpdateTexImage(fArr);
    }

    private void ensureInitState() {
        if (this.mSurfacesState.get() == 0) {
            return;
        }
        throw new java.lang.IllegalStateException("Can't set view when already attached. Current state: " + this.mSurfacesState.get() + ", mSurfaces[ID_VIDEO]: " + this.mSurfaceHelpers[0] + " / " + this.mSurfaces[0] + ", mSurfaces[ID_SUBTITLES]: " + this.mSurfaceHelpers[1] + " / " + this.mSurfaces[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.view.Surface getNativeSurface(int i3) {
        android.view.Surface surface;
        synchronized (this.mNativeLock) {
            surface = this.mSurfaces[i3];
        }
        return surface;
    }

    private android.view.Surface getSubtitlesSurface() {
        return getNativeSurface(1);
    }

    private android.view.Surface getVideoSurface() {
        return getNativeSurface(0);
    }

    private static native void nativeOnMouseEvent(long j, int i3, int i9, int i10, int i11);

    private static native void nativeOnWindowSize(long j, int i3, int i9);

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceCreated() {
        if (this.mSurfacesState.get() != 1) {
            throw new java.lang.IllegalArgumentException("invalid state");
        }
        org.videolan.libvlc.AWindow.SurfaceHelper[] surfaceHelperArr = this.mSurfaceHelpers;
        org.videolan.libvlc.AWindow.SurfaceHelper surfaceHelper = surfaceHelperArr[0];
        org.videolan.libvlc.AWindow.SurfaceHelper surfaceHelper2 = surfaceHelperArr[1];
        if (surfaceHelper == null) {
            throw new java.lang.NullPointerException("videoHelper shouldn't be null here");
        }
        if (surfaceHelper.isReady()) {
            if (surfaceHelper2 == null || surfaceHelper2.isReady()) {
                this.mSurfacesState.set(2);
                java.util.Iterator<org.videolan.libvlc.interfaces.IVLCVout.Callback> it = this.mIVLCVoutCallbacks.iterator();
                while (it.hasNext()) {
                    it.next().onSurfacesCreated(this);
                }
                org.videolan.libvlc.AWindow.SurfaceCallback surfaceCallback = this.mSurfaceCallback;
                if (surfaceCallback != null) {
                    surfaceCallback.onSurfacesCreated(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceDestroyed() {
        detachViews();
    }

    private int registerNative(long j) {
        int i3;
        if (j == 0) {
            throw new java.lang.IllegalArgumentException("nativeHandle is null");
        }
        synchronized (this.mNativeLock) {
            try {
                if (this.mCallbackNativeHandle != 0) {
                    return 0;
                }
                this.mCallbackNativeHandle = j;
                int i9 = this.mMouseAction;
                if (i9 != -1) {
                    nativeOnMouseEvent(j, i9, this.mMouseButton, this.mMouseX, this.mMouseY);
                }
                int i10 = this.mWindowWidth;
                if (i10 != -1 && (i3 = this.mWindowHeight) != -1) {
                    nativeOnWindowSize(this.mCallbackNativeHandle, i10, i3);
                }
                return this.mOnNewVideoLayoutListener != null ? 3 : 1;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private boolean setBuffersGeometry(android.view.Surface surface, int i3, int i9, int i10) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNativeSurface(int i3, android.view.Surface surface) {
        synchronized (this.mNativeLock) {
            this.mSurfaces[i3] = surface;
        }
    }

    private void setSurface(int i3, android.view.Surface surface, android.view.SurfaceHolder surfaceHolder) {
        ensureInitState();
        if (!surface.isValid() && surfaceHolder == null) {
            throw new java.lang.IllegalStateException("surface is not attached and holder is null");
        }
        org.videolan.libvlc.AWindow.SurfaceHelper surfaceHelper = this.mSurfaceHelpers[i3];
        if (surfaceHelper != null) {
            surfaceHelper.release();
        }
        this.mSurfaceHelpers[i3] = new org.videolan.libvlc.AWindow.SurfaceHelper(i3, surface, surfaceHolder);
    }

    private void setVideoLayout(final int i3, final int i9, final int i10, final int i11, final int i12, final int i13) {
        this.mHandler.post(new java.lang.Runnable() { // from class: org.videolan.libvlc.AWindow.1
            @Override // java.lang.Runnable
            public void run() {
                if (org.videolan.libvlc.AWindow.this.mOnNewVideoLayoutListener != null) {
                    org.videolan.libvlc.AWindow.this.mOnNewVideoLayoutListener.onNewVideoLayout(org.videolan.libvlc.AWindow.this, i3, i9, i10, i11, i12, i13);
                }
            }
        });
    }

    private void setView(int i3, android.view.SurfaceView surfaceView) {
        ensureInitState();
        if (surfaceView == null) {
            throw new java.lang.NullPointerException("view is null");
        }
        org.videolan.libvlc.AWindow.SurfaceHelper surfaceHelper = this.mSurfaceHelpers[i3];
        if (surfaceHelper != null) {
            surfaceHelper.release();
        }
        this.mSurfaceHelpers[i3] = new org.videolan.libvlc.AWindow.SurfaceHelper(i3, surfaceView);
    }

    private void unregisterNative() {
        synchronized (this.mNativeLock) {
            try {
                if (this.mCallbackNativeHandle == 0) {
                    throw new java.lang.IllegalArgumentException("unregister called when not registered");
                }
                this.mCallbackNativeHandle = 0L;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public boolean SurfaceTexture_attachToGLContext(int i3) {
        return this.mSurfaceTextureThread.attachToGLContext(i3);
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void addCallback(org.videolan.libvlc.interfaces.IVLCVout.Callback callback) {
        if (this.mIVLCVoutCallbacks.contains(callback)) {
            return;
        }
        this.mIVLCVoutCallbacks.add(callback);
    }

    public boolean areSurfacesWaiting() {
        return this.mSurfacesState.get() == 1;
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public boolean areViewsAttached() {
        return this.mSurfacesState.get() != 0;
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void attachViews(org.videolan.libvlc.interfaces.IVLCVout.OnNewVideoLayoutListener onNewVideoLayoutListener) {
        if (this.mSurfacesState.get() == 0) {
            if (this.mSurfaceHelpers[0] != null) {
                this.mSurfacesState.set(1);
                synchronized (this.mNativeLock) {
                    this.mOnNewVideoLayoutListener = onNewVideoLayoutListener;
                    this.mNativeLock.buffersGeometryConfigured = false;
                    this.mNativeLock.buffersGeometryAbort = false;
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    org.videolan.libvlc.AWindow.SurfaceHelper surfaceHelper = this.mSurfaceHelpers[i3];
                    if (surfaceHelper != null) {
                        surfaceHelper.attach();
                    }
                }
                return;
            }
        }
        throw new java.lang.IllegalStateException("already attached or video view not configured");
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void detachViews() {
        if (this.mSurfacesState.get() == 0) {
            return;
        }
        this.mSurfacesState.set(0);
        this.mHandler.removeCallbacksAndMessages(null);
        synchronized (this.mNativeLock) {
            this.mOnNewVideoLayoutListener = null;
            this.mNativeLock.buffersGeometryAbort = true;
            this.mNativeLock.notifyAll();
        }
        for (int i3 = 0; i3 < 2; i3++) {
            org.videolan.libvlc.AWindow.SurfaceHelper surfaceHelper = this.mSurfaceHelpers[i3];
            if (surfaceHelper != null) {
                surfaceHelper.release();
            }
            this.mSurfaceHelpers[i3] = null;
        }
        java.util.Iterator<org.videolan.libvlc.interfaces.IVLCVout.Callback> it = this.mIVLCVoutCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onSurfacesDestroyed(this);
        }
        org.videolan.libvlc.AWindow.SurfaceCallback surfaceCallback = this.mSurfaceCallback;
        if (surfaceCallback != null) {
            surfaceCallback.onSurfacesDestroyed(this);
        }
        this.mSurfaceTextureThread.release();
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void removeCallback(org.videolan.libvlc.interfaces.IVLCVout.Callback callback) {
        this.mIVLCVoutCallbacks.remove(callback);
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void sendMouseEvent(int i3, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        synchronized (this.mNativeLock) {
            try {
                long j = this.mCallbackNativeHandle;
                if (j == 0 || (this.mMouseAction == i3 && this.mMouseButton == i9 && this.mMouseX == i10 && this.mMouseY == i11)) {
                    i12 = i3;
                    i13 = i9;
                    i14 = i10;
                    i15 = i11;
                } else {
                    i12 = i3;
                    i13 = i9;
                    i14 = i10;
                    i15 = i11;
                    nativeOnMouseEvent(j, i12, i13, i14, i15);
                }
                this.mMouseAction = i12;
                this.mMouseButton = i13;
                this.mMouseX = i14;
                this.mMouseY = i15;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void setSubtitlesSurface(android.view.Surface surface, android.view.SurfaceHolder surfaceHolder) {
        setSurface(1, surface, surfaceHolder);
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void setSubtitlesView(android.view.SurfaceView surfaceView) {
        setView(1, surfaceView);
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void setVideoSurface(android.view.Surface surface, android.view.SurfaceHolder surfaceHolder) {
        setSurface(0, surface, surfaceHolder);
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void setVideoView(android.view.SurfaceView surfaceView) {
        setView(0, surfaceView);
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void setWindowSize(int i3, int i9) {
        synchronized (this.mNativeLock) {
            try {
                long j = this.mCallbackNativeHandle;
                if (j != 0 && (this.mWindowWidth != i3 || this.mWindowHeight != i9)) {
                    nativeOnWindowSize(j, i3, i9);
                }
                this.mWindowWidth = i3;
                this.mWindowHeight = i9;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void setSubtitlesSurface(android.graphics.SurfaceTexture surfaceTexture) {
        setSurface(1, new android.view.Surface(surfaceTexture), null);
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void setSubtitlesView(android.view.TextureView textureView) {
        setView(1, textureView);
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void setVideoSurface(android.graphics.SurfaceTexture surfaceTexture) {
        setSurface(0, new android.view.Surface(surfaceTexture), null);
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void setVideoView(android.view.TextureView textureView) {
        setView(0, textureView);
    }

    public class SurfaceHelper {
        private final int mId;
        private android.view.Surface mSurface;
        private final android.view.SurfaceHolder mSurfaceHolder;
        private final android.view.SurfaceHolder.Callback mSurfaceHolderCallback;
        private final android.view.TextureView.SurfaceTextureListener mSurfaceTextureListener;
        private final android.view.SurfaceView mSurfaceView;
        private final android.view.TextureView mTextureView;

        private void attachSurface() {
            android.view.SurfaceHolder surfaceHolder = this.mSurfaceHolder;
            if (surfaceHolder != null) {
                surfaceHolder.addCallback(this.mSurfaceHolderCallback);
            }
            setSurface(this.mSurface);
        }

        private void attachSurfaceView() {
            this.mSurfaceHolder.addCallback(this.mSurfaceHolderCallback);
            setSurface(this.mSurfaceHolder.getSurface());
        }

        private void attachTextureView() {
            this.mTextureView.setSurfaceTextureListener(this.mSurfaceTextureListener);
            android.graphics.SurfaceTexture surfaceTexture = this.mTextureView.getSurfaceTexture();
            if (surfaceTexture != null) {
                this.mSurfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, this.mTextureView.getWidth(), this.mTextureView.getHeight());
            }
        }

        private android.view.TextureView.SurfaceTextureListener createSurfaceTextureListener() {
            return new android.view.TextureView.SurfaceTextureListener() { // from class: org.videolan.libvlc.AWindow.SurfaceHelper.2
                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i3, int i9) {
                    org.videolan.libvlc.AWindow.SurfaceHelper.this.setSurface(new android.view.Surface(surfaceTexture));
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
                    org.videolan.libvlc.AWindow.this.onSurfaceDestroyed();
                    return true;
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i3, int i9) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
                }
            };
        }

        private void releaseTextureView() {
            android.view.TextureView textureView = this.mTextureView;
            if (textureView != null) {
                textureView.setSurfaceTextureListener(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSurface(android.view.Surface surface) {
            if (surface.isValid() && org.videolan.libvlc.AWindow.this.getNativeSurface(this.mId) == null) {
                this.mSurface = surface;
                org.videolan.libvlc.AWindow.this.setNativeSurface(this.mId, surface);
                org.videolan.libvlc.AWindow.this.onSurfaceCreated();
            }
        }

        public void attach() {
            if (this.mSurfaceView != null) {
                attachSurfaceView();
            } else if (this.mTextureView != null) {
                attachTextureView();
            } else {
                if (this.mSurface == null) {
                    throw new java.lang.IllegalStateException();
                }
                attachSurface();
            }
        }

        public android.view.Surface getSurface() {
            return this.mSurface;
        }

        public android.view.SurfaceHolder getSurfaceHolder() {
            return this.mSurfaceHolder;
        }

        public boolean isReady() {
            return this.mSurfaceView == null || this.mSurface != null;
        }

        public void release() {
            this.mSurface = null;
            org.videolan.libvlc.AWindow.this.setNativeSurface(this.mId, null);
            android.view.SurfaceHolder surfaceHolder = this.mSurfaceHolder;
            if (surfaceHolder != null) {
                surfaceHolder.removeCallback(this.mSurfaceHolderCallback);
            }
            releaseTextureView();
        }

        private SurfaceHelper(int i3, android.view.SurfaceView surfaceView) {
            this.mSurfaceHolderCallback = new android.view.SurfaceHolder.Callback() { // from class: org.videolan.libvlc.AWindow.SurfaceHelper.1
                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
                    if (surfaceHolder != org.videolan.libvlc.AWindow.SurfaceHelper.this.mSurfaceHolder) {
                        throw new java.lang.IllegalStateException("holders are different");
                    }
                    org.videolan.libvlc.AWindow.SurfaceHelper.this.setSurface(surfaceHolder.getSurface());
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
                    org.videolan.libvlc.AWindow.this.onSurfaceDestroyed();
                }
            };
            this.mSurfaceTextureListener = createSurfaceTextureListener();
            this.mId = i3;
            this.mTextureView = null;
            this.mSurfaceView = surfaceView;
            this.mSurfaceHolder = surfaceView.getHolder();
        }

        private SurfaceHelper(int i3, android.view.TextureView textureView) {
            this.mSurfaceHolderCallback = new android.view.SurfaceHolder.Callback() { // from class: org.videolan.libvlc.AWindow.SurfaceHelper.1
                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
                    if (surfaceHolder != org.videolan.libvlc.AWindow.SurfaceHelper.this.mSurfaceHolder) {
                        throw new java.lang.IllegalStateException("holders are different");
                    }
                    org.videolan.libvlc.AWindow.SurfaceHelper.this.setSurface(surfaceHolder.getSurface());
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
                    org.videolan.libvlc.AWindow.this.onSurfaceDestroyed();
                }
            };
            this.mSurfaceTextureListener = createSurfaceTextureListener();
            this.mId = i3;
            this.mSurfaceView = null;
            this.mSurfaceHolder = null;
            this.mTextureView = textureView;
        }

        private SurfaceHelper(int i3, android.view.Surface surface, android.view.SurfaceHolder surfaceHolder) {
            this.mSurfaceHolderCallback = new android.view.SurfaceHolder.Callback() { // from class: org.videolan.libvlc.AWindow.SurfaceHelper.1
                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(android.view.SurfaceHolder surfaceHolder2, int i9, int i10, int i11) {
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(android.view.SurfaceHolder surfaceHolder2) {
                    if (surfaceHolder2 != org.videolan.libvlc.AWindow.SurfaceHelper.this.mSurfaceHolder) {
                        throw new java.lang.IllegalStateException("holders are different");
                    }
                    org.videolan.libvlc.AWindow.SurfaceHelper.this.setSurface(surfaceHolder2.getSurface());
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder2) {
                    org.videolan.libvlc.AWindow.this.onSurfaceDestroyed();
                }
            };
            this.mSurfaceTextureListener = createSurfaceTextureListener();
            this.mId = i3;
            this.mSurfaceView = null;
            this.mTextureView = null;
            this.mSurfaceHolder = surfaceHolder;
            this.mSurface = surface;
        }
    }

    private void setView(int i3, android.view.TextureView textureView) {
        ensureInitState();
        if (textureView != null) {
            org.videolan.libvlc.AWindow.SurfaceHelper surfaceHelper = this.mSurfaceHelpers[i3];
            if (surfaceHelper != null) {
                surfaceHelper.release();
            }
            this.mSurfaceHelpers[i3] = new org.videolan.libvlc.AWindow.SurfaceHelper(i3, textureView);
            return;
        }
        throw new java.lang.NullPointerException("view is null");
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout
    public void attachViews() {
        attachViews(null);
    }
}
