package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class SeekParameters {
    public static final androidx.media3.exoplayer.SeekParameters CLOSEST_SYNC;
    public static final androidx.media3.exoplayer.SeekParameters DEFAULT;
    public static final androidx.media3.exoplayer.SeekParameters EXACT;
    public static final androidx.media3.exoplayer.SeekParameters NEXT_SYNC;
    public static final androidx.media3.exoplayer.SeekParameters PREVIOUS_SYNC;
    public final long toleranceAfterUs;
    public final long toleranceBeforeUs;

    static {
        androidx.media3.exoplayer.SeekParameters seekParameters = new androidx.media3.exoplayer.SeekParameters(0L, 0L);
        EXACT = seekParameters;
        CLOSEST_SYNC = new androidx.media3.exoplayer.SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        PREVIOUS_SYNC = new androidx.media3.exoplayer.SeekParameters(Long.MAX_VALUE, 0L);
        NEXT_SYNC = new androidx.media3.exoplayer.SeekParameters(0L, Long.MAX_VALUE);
        DEFAULT = seekParameters;
    }

    public SeekParameters(long j, long j9) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j >= 0);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j9 >= 0);
        this.toleranceBeforeUs = j;
        this.toleranceAfterUs = j9;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.exoplayer.SeekParameters.class == obj.getClass()) {
            androidx.media3.exoplayer.SeekParameters seekParameters = (androidx.media3.exoplayer.SeekParameters) obj;
            if (this.toleranceBeforeUs == seekParameters.toleranceBeforeUs && this.toleranceAfterUs == seekParameters.toleranceAfterUs) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.toleranceBeforeUs) * 31) + ((int) this.toleranceAfterUs);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[RETURN] */
    public long resolveSeekPositionUs(long j, long j9, long j10) {
        long j11 = this.toleranceBeforeUs;
        if (j11 == 0 && this.toleranceAfterUs == 0) {
            return j;
        }
        long jSubtractWithOverflowDefault = androidx.media3.common.util.Util.subtractWithOverflowDefault(j, j11, Long.MIN_VALUE);
        long jAddWithOverflowDefault = androidx.media3.common.util.Util.addWithOverflowDefault(j, this.toleranceAfterUs, Long.MAX_VALUE);
        boolean z6 = false;
        boolean z9 = jSubtractWithOverflowDefault <= j9 && j9 <= jAddWithOverflowDefault;
        if (jSubtractWithOverflowDefault <= j10 && j10 <= jAddWithOverflowDefault) {
            z6 = true;
        }
        if (z9 && z6) {
            if (java.lang.Math.abs(j9 - j) <= java.lang.Math.abs(j10 - j)) {
                return j9;
            }
            return j10;
        }
        if (!z9) {
            if (z6) {
                return j10;
            }
            return jSubtractWithOverflowDefault;
        }
        return j9;
    }
}
