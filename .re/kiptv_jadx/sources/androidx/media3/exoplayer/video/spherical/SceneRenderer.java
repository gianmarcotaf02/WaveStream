package androidx.media3.exoplayer.video.spherical;

/* JADX INFO: loaded from: classes.dex */
final class SceneRenderer implements androidx.media3.exoplayer.video.VideoFrameMetadataListener, androidx.media3.exoplayer.video.spherical.CameraMotionListener {
    private static final java.lang.String TAG = "SceneRenderer";
    private byte[] lastProjectionData;
    private android.graphics.SurfaceTexture surfaceTexture;
    private int textureId;
    private final java.util.concurrent.atomic.AtomicBoolean frameAvailable = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean resetRotationAtNextFrame = new java.util.concurrent.atomic.AtomicBoolean(true);
    private final androidx.media3.exoplayer.video.spherical.ProjectionRenderer projectionRenderer = new androidx.media3.exoplayer.video.spherical.ProjectionRenderer();
    private final androidx.media3.exoplayer.video.spherical.FrameRotationQueue frameRotationQueue = new androidx.media3.exoplayer.video.spherical.FrameRotationQueue();
    private final androidx.media3.common.util.TimedValueQueue<java.lang.Long> sampleTimestampQueue = new androidx.media3.common.util.TimedValueQueue<>();
    private final androidx.media3.common.util.TimedValueQueue<androidx.media3.exoplayer.video.spherical.Projection> projectionQueue = new androidx.media3.common.util.TimedValueQueue<>();
    private final float[] rotationMatrix = new float[16];
    private final float[] tempMatrix = new float[16];
    private volatile int defaultStereoMode = 0;
    private int lastStereoMode = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(android.graphics.SurfaceTexture surfaceTexture) {
        this.frameAvailable.set(true);
    }

    private void setProjection(byte[] bArr, int i3, long j) {
        byte[] bArr2 = this.lastProjectionData;
        int i9 = this.lastStereoMode;
        this.lastProjectionData = bArr;
        if (i3 == -1) {
            i3 = this.defaultStereoMode;
        }
        this.lastStereoMode = i3;
        if (i9 == i3 && java.util.Arrays.equals(bArr2, this.lastProjectionData)) {
            return;
        }
        byte[] bArr3 = this.lastProjectionData;
        androidx.media3.exoplayer.video.spherical.Projection projectionDecode = bArr3 != null ? androidx.media3.exoplayer.video.spherical.ProjectionDecoder.decode(bArr3, this.lastStereoMode) : null;
        if (projectionDecode == null || !androidx.media3.exoplayer.video.spherical.ProjectionRenderer.isSupported(projectionDecode)) {
            projectionDecode = androidx.media3.exoplayer.video.spherical.Projection.createEquirectangular(this.lastStereoMode);
        }
        this.projectionQueue.add(j, projectionDecode);
    }

    public void drawFrame(float[] fArr, boolean z6) {
        android.opengl.GLES20.glClear(16384);
        try {
            androidx.media3.common.util.GlUtil.checkGlError();
        } catch (androidx.media3.common.util.GlUtil.GlException e6) {
            androidx.media3.common.util.Log.e(TAG, "Failed to draw a frame", e6);
        }
        if (this.frameAvailable.compareAndSet(true, false)) {
            android.graphics.SurfaceTexture surfaceTexture = this.surfaceTexture;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                androidx.media3.common.util.GlUtil.checkGlError();
            } catch (androidx.media3.common.util.GlUtil.GlException e9) {
                androidx.media3.common.util.Log.e(TAG, "Failed to draw a frame", e9);
            }
            if (this.resetRotationAtNextFrame.compareAndSet(true, false)) {
                androidx.media3.common.util.GlUtil.setToIdentity(this.rotationMatrix);
            }
            long timestamp = this.surfaceTexture.getTimestamp();
            java.lang.Long lPoll = this.sampleTimestampQueue.poll(timestamp);
            if (lPoll != null) {
                this.frameRotationQueue.pollRotationMatrix(this.rotationMatrix, lPoll.longValue());
            }
            androidx.media3.exoplayer.video.spherical.Projection projectionPollFloor = this.projectionQueue.pollFloor(timestamp);
            if (projectionPollFloor != null) {
                this.projectionRenderer.setProjection(projectionPollFloor);
            }
        }
        android.opengl.Matrix.multiplyMM(this.tempMatrix, 0, fArr, 0, this.rotationMatrix, 0);
        this.projectionRenderer.draw(this.textureId, this.tempMatrix, z6);
    }

    public android.graphics.SurfaceTexture init() {
        try {
            android.opengl.GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            androidx.media3.common.util.GlUtil.checkGlError();
            this.projectionRenderer.init();
            androidx.media3.common.util.GlUtil.checkGlError();
            this.textureId = androidx.media3.common.util.GlUtil.createExternalTexture();
        } catch (androidx.media3.common.util.GlUtil.GlException e6) {
            androidx.media3.common.util.Log.e(TAG, "Failed to initialize the renderer", e6);
        }
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.textureId);
        this.surfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: androidx.media3.exoplayer.video.spherical.a
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                this.f16839h.lambda$init$0(surfaceTexture2);
            }
        });
        return this.surfaceTexture;
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public void onCameraMotion(long j, float[] fArr) {
        this.frameRotationQueue.setRotation(j, fArr);
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public void onCameraMotionReset() {
        this.sampleTimestampQueue.clear();
        this.frameRotationQueue.reset();
        this.resetRotationAtNextFrame.set(true);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public void onVideoFrameAboutToBeRendered(long j, long j9, androidx.media3.common.Format format, android.media.MediaFormat mediaFormat) {
        this.sampleTimestampQueue.add(j9, java.lang.Long.valueOf(j));
        setProjection(format.projectionData, format.stereoMode, j9);
    }

    public void setDefaultStereoMode(int i3) {
        this.defaultStereoMode = i3;
    }

    public void shutdown() {
        this.projectionRenderer.shutdown();
    }
}
