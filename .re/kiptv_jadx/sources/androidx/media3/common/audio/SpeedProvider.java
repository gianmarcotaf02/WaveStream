package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public interface SpeedProvider {
    public static final androidx.media3.common.audio.SpeedProvider DEFAULT = new androidx.media3.common.audio.SpeedProvider() { // from class: androidx.media3.common.audio.SpeedProvider.1
        @Override // androidx.media3.common.audio.SpeedProvider
        public long getNextSpeedChangeTimeUs(long j) {
            return androidx.media3.common.C.TIME_UNSET;
        }

        @Override // androidx.media3.common.audio.SpeedProvider
        public float getSpeed(long j) {
            return 1.0f;
        }
    };

    long getNextSpeedChangeTimeUs(long j);

    float getSpeed(long j);
}
