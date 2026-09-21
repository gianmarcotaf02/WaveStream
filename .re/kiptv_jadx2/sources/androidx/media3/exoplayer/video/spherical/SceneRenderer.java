package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.Format;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

final class SceneRenderer implements VideoFrameMetadataListener, CameraMotionListener {
    private static final String TAG = "SceneRenderer";
    private byte[] lastProjectionData;
    private SurfaceTexture surfaceTexture;
    private int textureId;
    private final AtomicBoolean frameAvailable = new AtomicBoolean();
    private final AtomicBoolean resetRotationAtNextFrame = new AtomicBoolean(true);
    private final ProjectionRenderer projectionRenderer = new ProjectionRenderer();
    private final FrameRotationQueue frameRotationQueue = new FrameRotationQueue();
    private final TimedValueQueue<Long> sampleTimestampQueue = new TimedValueQueue<>();
    private final TimedValueQueue<Projection> projectionQueue = new TimedValueQueue<>();
    private final float[] rotationMatrix = new float[16];
    private final float[] tempMatrix = new float[16];
    private volatile int defaultStereoMode = 0;
    private int lastStereoMode = -1;

    public void lambda$init$0(SurfaceTexture surfaceTexture) {
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
        if (i9 == i3 && Arrays.equals(bArr2, this.lastProjectionData)) {
            return;
        }
        byte[] bArr3 = this.lastProjectionData;
        Projection projectionDecode = bArr3 != null ? ProjectionDecoder.decode(bArr3, this.lastStereoMode) : null;
        if (projectionDecode == null || !ProjectionRenderer.isSupported(projectionDecode)) {
            projectionDecode = Projection.createEquirectangular(this.lastStereoMode);
        }
        this.projectionQueue.add(j, projectionDecode);
    }

    public void drawFrame(float[] fArr, boolean z6) {
        GLES20.glClear(16384);
        try {
            GlUtil.checkGlError();
        } catch (GlUtil.GlException e6) {
            Log.e(TAG, "Failed to draw a frame", e6);
        }
        if (this.frameAvailable.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.surfaceTexture;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                GlUtil.checkGlError();
            } catch (GlUtil.GlException e9) {
                Log.e(TAG, "Failed to draw a frame", e9);
            }
            if (this.resetRotationAtNextFrame.compareAndSet(true, false)) {
                GlUtil.setToIdentity(this.rotationMatrix);
            }
            long timestamp = this.surfaceTexture.getTimestamp();
            Long lPoll = this.sampleTimestampQueue.poll(timestamp);
            if (lPoll != null) {
                this.frameRotationQueue.pollRotationMatrix(this.rotationMatrix, lPoll.longValue());
            }
            Projection projectionPollFloor = this.projectionQueue.pollFloor(timestamp);
            if (projectionPollFloor != null) {
                this.projectionRenderer.setProjection(projectionPollFloor);
            }
        }
        Matrix.multiplyMM(this.tempMatrix, 0, fArr, 0, this.rotationMatrix, 0);
        this.projectionRenderer.draw(this.textureId, this.tempMatrix, z6);
    }

    public SurfaceTexture init() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.checkGlError();
            this.projectionRenderer.init();
            GlUtil.checkGlError();
            this.textureId = GlUtil.createExternalTexture();
        } catch (GlUtil.GlException e6) {
            Log.e(TAG, "Failed to initialize the renderer", e6);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.textureId);
        this.surfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
            @Override
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f16839h.lambda$init$0(surfaceTexture2);
            }
        });
        return this.surfaceTexture;
    }

    @Override
    public void onCameraMotion(long j, float[] fArr) {
        this.frameRotationQueue.setRotation(j, fArr);
    }

    @Override
    public void onCameraMotionReset() {
        this.sampleTimestampQueue.clear();
        this.frameRotationQueue.reset();
        this.resetRotationAtNextFrame.set(true);
    }

    @Override
    public void onVideoFrameAboutToBeRendered(long j, long j9, Format format, MediaFormat mediaFormat) {
        this.sampleTimestampQueue.add(j9, Long.valueOf(j));
        setProjection(format.projectionData, format.stereoMode, j9);
    }

    public void setDefaultStereoMode(int i3) {
        this.defaultStereoMode = i3;
    }

    public void shutdown() {
        this.projectionRenderer.shutdown();
    }
}
