package androidx.media3.common.audio;

import androidx.media3.common.C;

public interface SpeedProvider {
    public static final SpeedProvider DEFAULT = new SpeedProvider() {
        @Override
        public long getNextSpeedChangeTimeUs(long j) {
            return C.TIME_UNSET;
        }

        @Override
        public float getSpeed(long j) {
            return 1.0f;
        }
    };

    long getNextSpeedChangeTimeUs(long j);

    float getSpeed(long j);
}
