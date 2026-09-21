package androidx.media3.exoplayer.video.spherical;

/* JADX INFO: loaded from: classes.dex */
final class OrientationListener implements android.hardware.SensorEventListener {
    private final android.view.Display display;
    private final androidx.media3.exoplayer.video.spherical.OrientationListener.Listener[] listeners;
    private boolean recenterMatrixComputed;
    private final float[] deviceOrientationMatrix4x4 = new float[16];
    private final float[] tempMatrix4x4 = new float[16];
    private final float[] recenterMatrix4x4 = new float[16];
    private final float[] angles = new float[3];

    public interface Listener {
        void onOrientationChange(float[] fArr, float f9);
    }

    public OrientationListener(android.view.Display display, androidx.media3.exoplayer.video.spherical.OrientationListener.Listener... listenerArr) {
        this.display = display;
        this.listeners = listenerArr;
    }

    private float extractRoll(float[] fArr) {
        android.hardware.SensorManager.remapCoordinateSystem(fArr, 1, 131, this.tempMatrix4x4);
        android.hardware.SensorManager.getOrientation(this.tempMatrix4x4, this.angles);
        return this.angles[2];
    }

    private void notifyListeners(float[] fArr, float f9) {
        for (androidx.media3.exoplayer.video.spherical.OrientationListener.Listener listener : this.listeners) {
            listener.onOrientationChange(fArr, f9);
        }
    }

    private void recenter(float[] fArr) {
        if (!this.recenterMatrixComputed) {
            androidx.media3.exoplayer.video.spherical.FrameRotationQueue.computeRecenterMatrix(this.recenterMatrix4x4, fArr);
            this.recenterMatrixComputed = true;
        }
        float[] fArr2 = this.tempMatrix4x4;
        java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        android.opengl.Matrix.multiplyMM(fArr, 0, this.tempMatrix4x4, 0, this.recenterMatrix4x4, 0);
    }

    private void rotateAroundZ(float[] fArr, int i3) {
        if (i3 != 0) {
            int i9 = androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AC3;
            int i10 = 1;
            if (i3 == 1) {
                i10 = 129;
                i9 = 2;
            } else if (i3 == 2) {
                i10 = 130;
            } else {
                if (i3 != 3) {
                    throw new java.lang.IllegalStateException();
                }
                i9 = 130;
            }
            float[] fArr2 = this.tempMatrix4x4;
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            android.hardware.SensorManager.remapCoordinateSystem(this.tempMatrix4x4, i9, i10, fArr);
        }
    }

    private static void rotateYtoSky(float[] fArr) {
        android.opengl.Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i3) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        android.hardware.SensorManager.getRotationMatrixFromVector(this.deviceOrientationMatrix4x4, sensorEvent.values);
        rotateAroundZ(this.deviceOrientationMatrix4x4, this.display.getRotation());
        float fExtractRoll = extractRoll(this.deviceOrientationMatrix4x4);
        rotateYtoSky(this.deviceOrientationMatrix4x4);
        recenter(this.deviceOrientationMatrix4x4);
        notifyListeners(this.deviceOrientationMatrix4x4, fExtractRoll);
    }
}
