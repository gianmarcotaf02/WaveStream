package androidx.media3.exoplayer.video.spherical;

/* JADX INFO: loaded from: classes.dex */
public final class SphericalGLSurfaceView extends android.opengl.GLSurfaceView {
    private static final int FIELD_OF_VIEW_DEGREES = 90;
    private static final float PX_PER_DEGREES = 25.0f;
    static final float UPRIGHT_ROLL = 3.1415927f;
    private static final float Z_FAR = 100.0f;
    private static final float Z_NEAR = 0.1f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f16838h = 0;
    private boolean isOrientationListenerRegistered;
    private boolean isStarted;
    private final android.os.Handler mainHandler;
    private final androidx.media3.exoplayer.video.spherical.OrientationListener orientationListener;
    private final android.hardware.Sensor orientationSensor;
    private final androidx.media3.exoplayer.video.spherical.SceneRenderer scene;
    private final android.hardware.SensorManager sensorManager;
    private android.view.Surface surface;
    private android.graphics.SurfaceTexture surfaceTexture;
    private final androidx.media3.exoplayer.video.spherical.TouchTracker touchTracker;
    private boolean useSensorRotation;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener> videoSurfaceListeners;

    public final class Renderer implements android.opengl.GLSurfaceView.Renderer, androidx.media3.exoplayer.video.spherical.TouchTracker.Listener, androidx.media3.exoplayer.video.spherical.OrientationListener.Listener {
        private final float[] deviceOrientationMatrix;
        private float deviceRoll;
        private final androidx.media3.exoplayer.video.spherical.SceneRenderer scene;
        private float touchPitch;
        private final float[] touchPitchMatrix;
        private final float[] touchYawMatrix;
        private final float[] projectionMatrix = new float[16];
        private final float[] viewProjectionMatrix = new float[16];
        private final float[] viewMatrix = new float[16];
        private final float[] tempMatrix = new float[16];

        public Renderer(androidx.media3.exoplayer.video.spherical.SceneRenderer sceneRenderer) {
            float[] fArr = new float[16];
            this.deviceOrientationMatrix = fArr;
            float[] fArr2 = new float[16];
            this.touchPitchMatrix = fArr2;
            float[] fArr3 = new float[16];
            this.touchYawMatrix = fArr3;
            this.scene = sceneRenderer;
            androidx.media3.common.util.GlUtil.setToIdentity(fArr);
            androidx.media3.common.util.GlUtil.setToIdentity(fArr2);
            androidx.media3.common.util.GlUtil.setToIdentity(fArr3);
            this.deviceRoll = androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.UPRIGHT_ROLL;
        }

        private float calculateFieldOfViewInYDirection(float f9) {
            if (f9 > 1.0f) {
                return (float) (java.lang.Math.toDegrees(java.lang.Math.atan(java.lang.Math.tan(java.lang.Math.toRadians(45.0d)) / ((double) f9))) * 2.0d);
            }
            return 90.0f;
        }

        private void updatePitchMatrix() {
            android.opengl.Matrix.setRotateM(this.touchPitchMatrix, 0, -this.touchPitch, (float) java.lang.Math.cos(this.deviceRoll), (float) java.lang.Math.sin(this.deviceRoll), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
            synchronized (this) {
                android.opengl.Matrix.multiplyMM(this.tempMatrix, 0, this.deviceOrientationMatrix, 0, this.touchYawMatrix, 0);
                android.opengl.Matrix.multiplyMM(this.viewMatrix, 0, this.touchPitchMatrix, 0, this.tempMatrix, 0);
            }
            android.opengl.Matrix.multiplyMM(this.viewProjectionMatrix, 0, this.projectionMatrix, 0, this.viewMatrix, 0);
            this.scene.drawFrame(this.viewProjectionMatrix, false);
        }

        @Override // androidx.media3.exoplayer.video.spherical.OrientationListener.Listener
        public synchronized void onOrientationChange(float[] fArr, float f9) {
            float[] fArr2 = this.deviceOrientationMatrix;
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.deviceRoll = -f9;
            updatePitchMatrix();
        }

        @Override // androidx.media3.exoplayer.video.spherical.TouchTracker.Listener
        public synchronized void onScrollChange(android.graphics.PointF pointF) {
            this.touchPitch = pointF.y;
            updatePitchMatrix();
            android.opengl.Matrix.setRotateM(this.touchYawMatrix, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // androidx.media3.exoplayer.video.spherical.TouchTracker.Listener
        public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
            return androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i3, int i9) {
            android.opengl.GLES20.glViewport(0, 0, i3, i9);
            float f9 = i3 / i9;
            android.opengl.Matrix.perspectiveM(this.projectionMatrix, 0, calculateFieldOfViewInYDirection(f9), f9, 0.1f, androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.Z_FAR);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
            androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.this.onSurfaceTextureAvailable(this.scene.init());
        }
    }

    public interface VideoSurfaceListener {
        void onVideoSurfaceCreated(android.view.Surface surface);

        void onVideoSurfaceDestroyed(android.view.Surface surface);
    }

    public SphericalGLSurfaceView(android.content.Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDetachedFromWindow$0() {
        android.view.Surface surface = this.surface;
        if (surface != null) {
            java.util.Iterator<androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener> it = this.videoSurfaceListeners.iterator();
            while (it.hasNext()) {
                it.next().onVideoSurfaceDestroyed(surface);
            }
        }
        releaseSurface(this.surfaceTexture, surface);
        this.surfaceTexture = null;
        this.surface = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSurfaceTextureAvailable$1(android.graphics.SurfaceTexture surfaceTexture) {
        android.graphics.SurfaceTexture surfaceTexture2 = this.surfaceTexture;
        android.view.Surface surface = this.surface;
        android.view.Surface surface2 = new android.view.Surface(surfaceTexture);
        this.surfaceTexture = surfaceTexture;
        this.surface = surface2;
        java.util.Iterator<androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener> it = this.videoSurfaceListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoSurfaceCreated(surface2);
        }
        releaseSurface(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.mainHandler.post(new T7.d(this, surfaceTexture, 9));
    }

    private static void releaseSurface(android.graphics.SurfaceTexture surfaceTexture, android.view.Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void updateOrientationListenerRegistration() {
        boolean z6 = this.useSensorRotation && this.isStarted;
        android.hardware.Sensor sensor = this.orientationSensor;
        if (sensor == null || z6 == this.isOrientationListenerRegistered) {
            return;
        }
        if (z6) {
            this.sensorManager.registerListener(this.orientationListener, sensor, 0);
        } else {
            this.sensorManager.unregisterListener(this.orientationListener);
        }
        this.isOrientationListenerRegistered = z6;
    }

    public void addVideoSurfaceListener(androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener videoSurfaceListener) {
        this.videoSurfaceListeners.add(videoSurfaceListener);
    }

    public androidx.media3.exoplayer.video.spherical.CameraMotionListener getCameraMotionListener() {
        return this.scene;
    }

    public androidx.media3.exoplayer.video.VideoFrameMetadataListener getVideoFrameMetadataListener() {
        return this.scene;
    }

    public android.view.Surface getVideoSurface() {
        return this.surface;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mainHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.spherical.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f16840h.lambda$onDetachedFromWindow$0();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.isStarted = false;
        updateOrientationListenerRegistration();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.isStarted = true;
        updateOrientationListenerRegistration();
    }

    public void removeVideoSurfaceListener(androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener videoSurfaceListener) {
        this.videoSurfaceListeners.remove(videoSurfaceListener);
    }

    public void setDefaultStereoMode(int i3) {
        this.scene.setDefaultStereoMode(i3);
    }

    public void setUseSensorRotation(boolean z6) {
        this.useSensorRotation = z6;
        updateOrientationListenerRegistration();
    }

    public SphericalGLSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoSurfaceListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        java.lang.Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) systemService;
        this.sensorManager = sensorManager;
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.orientationSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        androidx.media3.exoplayer.video.spherical.SceneRenderer sceneRenderer = new androidx.media3.exoplayer.video.spherical.SceneRenderer();
        this.scene = sceneRenderer;
        androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.Renderer renderer = new androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.Renderer(sceneRenderer);
        androidx.media3.exoplayer.video.spherical.TouchTracker touchTracker = new androidx.media3.exoplayer.video.spherical.TouchTracker(context, renderer, PX_PER_DEGREES);
        this.touchTracker = touchTracker;
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.orientationListener = new androidx.media3.exoplayer.video.spherical.OrientationListener(windowManager.getDefaultDisplay(), touchTracker, renderer);
        this.useSensorRotation = true;
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setOnTouchListener(touchTracker);
    }
}
