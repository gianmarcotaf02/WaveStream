package androidx.media3.common;

public interface Effect {
    default long getDurationAfterEffectApplied(long j) {
        return j;
    }
}
