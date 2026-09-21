package androidx.media3.exoplayer.video.spherical;

/* JADX INFO: loaded from: classes.dex */
final class FrameRotationQueue {
    private boolean recenterMatrixComputed;
    private final float[] recenterMatrix = new float[16];
    private final float[] rotationMatrix = new float[16];
    private final androidx.media3.common.util.TimedValueQueue<float[]> rotations = new androidx.media3.common.util.TimedValueQueue<>();

    public static void computeRecenterMatrix(float[] fArr, float[] fArr2) {
        androidx.media3.common.util.GlUtil.setToIdentity(fArr);
        float f9 = fArr2[10];
        float f10 = fArr2[8];
        float fSqrt = (float) java.lang.Math.sqrt((f10 * f10) + (f9 * f9));
        float f11 = fArr2[10];
        fArr[0] = f11 / fSqrt;
        float f12 = fArr2[8];
        fArr[2] = f12 / fSqrt;
        fArr[8] = (-f12) / fSqrt;
        fArr[10] = f11 / fSqrt;
    }

    private static void getRotationMatrixFromAngleAxis(float[] fArr, float[] fArr2) {
        float f9 = fArr2[0];
        float f10 = -fArr2[1];
        float f11 = -fArr2[2];
        float length = android.opengl.Matrix.length(f9, f10, f11);
        if (length != 0.0f) {
            android.opengl.Matrix.setRotateM(fArr, 0, (float) java.lang.Math.toDegrees(length), f9 / length, f10 / length, f11 / length);
        } else {
            androidx.media3.common.util.GlUtil.setToIdentity(fArr);
        }
    }

    public boolean pollRotationMatrix(float[] fArr, long j) {
        float[] fArrPollFloor = this.rotations.pollFloor(j);
        if (fArrPollFloor == null) {
            return false;
        }
        getRotationMatrixFromAngleAxis(this.rotationMatrix, fArrPollFloor);
        if (!this.recenterMatrixComputed) {
            computeRecenterMatrix(this.recenterMatrix, this.rotationMatrix);
            this.recenterMatrixComputed = true;
        }
        android.opengl.Matrix.multiplyMM(fArr, 0, this.recenterMatrix, 0, this.rotationMatrix, 0);
        return true;
    }

    public void reset() {
        this.rotations.clear();
        this.recenterMatrixComputed = false;
    }

    public void setRotation(long j, float[] fArr) {
        this.rotations.add(j, fArr);
    }
}
