package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class SessionPositionInfo {
    public static final androidx.media3.session.SessionPositionInfo DEFAULT;
    public static final androidx.media3.common.Player.PositionInfo DEFAULT_POSITION_INFO;
    private static final java.lang.String FIELD_BUFFERED_PERCENTAGE;
    static final java.lang.String FIELD_BUFFERED_POSITION_MS;
    static final java.lang.String FIELD_CONTENT_BUFFERED_POSITION_MS;
    private static final java.lang.String FIELD_CONTENT_DURATION_MS;
    private static final java.lang.String FIELD_CURRENT_LIVE_OFFSET_MS;
    private static final java.lang.String FIELD_DURATION_MS;
    private static final java.lang.String FIELD_EVENT_TIME_MS;
    private static final java.lang.String FIELD_IS_PLAYING_AD;
    static final java.lang.String FIELD_POSITION_INFO;
    private static final java.lang.String FIELD_TOTAL_BUFFERED_DURATION_MS;
    public final int bufferedPercentage;
    public final long bufferedPositionMs;
    public final long contentBufferedPositionMs;
    public final long contentDurationMs;
    public final long currentLiveOffsetMs;
    public final long durationMs;
    public final long eventTimeMs;
    public final boolean isPlayingAd;
    public final androidx.media3.common.Player.PositionInfo positionInfo;
    public final long totalBufferedDurationMs;

    static {
        androidx.media3.common.Player.PositionInfo positionInfo = new androidx.media3.common.Player.PositionInfo(null, 0, null, null, 0, 0L, 0L, -1, -1);
        DEFAULT_POSITION_INFO = positionInfo;
        DEFAULT = new androidx.media3.session.SessionPositionInfo(positionInfo, false, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, 0L, 0, 0L, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, 0L);
        FIELD_POSITION_INFO = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        FIELD_IS_PLAYING_AD = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        FIELD_EVENT_TIME_MS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        FIELD_DURATION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        FIELD_BUFFERED_POSITION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        FIELD_BUFFERED_PERCENTAGE = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        FIELD_TOTAL_BUFFERED_DURATION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        FIELD_CURRENT_LIVE_OFFSET_MS = androidx.media3.common.util.Util.intToStringMaxRadix(7);
        FIELD_CONTENT_DURATION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(8);
        FIELD_CONTENT_BUFFERED_POSITION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(9);
    }

    public SessionPositionInfo(androidx.media3.common.Player.PositionInfo positionInfo, boolean z6, long j, long j9, long j10, int i3, long j11, long j12, long j13, long j14) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(z6 == (positionInfo.adGroupIndex != -1));
        this.positionInfo = positionInfo;
        this.isPlayingAd = z6;
        this.eventTimeMs = j;
        this.durationMs = j9;
        this.bufferedPositionMs = j10;
        this.bufferedPercentage = i3;
        this.totalBufferedDurationMs = j11;
        this.currentLiveOffsetMs = j12;
        this.contentDurationMs = j13;
        this.contentBufferedPositionMs = j14;
    }

    @java.lang.Deprecated
    public static androidx.media3.session.SessionPositionInfo fromBundle(android.os.Bundle bundle) {
        return fromBundle(bundle, 9);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.session.SessionPositionInfo.class == obj.getClass()) {
            androidx.media3.session.SessionPositionInfo sessionPositionInfo = (androidx.media3.session.SessionPositionInfo) obj;
            if (this.eventTimeMs == sessionPositionInfo.eventTimeMs && this.positionInfo.equals(sessionPositionInfo.positionInfo) && this.isPlayingAd == sessionPositionInfo.isPlayingAd && this.durationMs == sessionPositionInfo.durationMs && this.bufferedPositionMs == sessionPositionInfo.bufferedPositionMs && this.bufferedPercentage == sessionPositionInfo.bufferedPercentage && this.totalBufferedDurationMs == sessionPositionInfo.totalBufferedDurationMs && this.currentLiveOffsetMs == sessionPositionInfo.currentLiveOffsetMs && this.contentDurationMs == sessionPositionInfo.contentDurationMs && this.contentBufferedPositionMs == sessionPositionInfo.contentBufferedPositionMs) {
                return true;
            }
        }
        return false;
    }

    public androidx.media3.session.SessionPositionInfo filterByAvailableCommands(boolean z6, boolean z9) {
        long j;
        long j9;
        long j10;
        if (z6 && z9) {
            return this;
        }
        androidx.media3.common.Player.PositionInfo positionInfoFilterByAvailableCommands = this.positionInfo.filterByAvailableCommands(z6, z9);
        boolean z10 = z6 && this.isPlayingAd;
        long j11 = this.eventTimeMs;
        long j12 = z6 ? this.durationMs : androidx.media3.common.C.TIME_UNSET;
        long j13 = z6 ? this.bufferedPositionMs : 0L;
        int i3 = z6 ? this.bufferedPercentage : 0;
        long j14 = z6 ? this.totalBufferedDurationMs : 0L;
        long j15 = z6 ? this.currentLiveOffsetMs : androidx.media3.common.C.TIME_UNSET;
        long j16 = z6 ? this.contentDurationMs : androidx.media3.common.C.TIME_UNSET;
        if (z6) {
            j = j12;
            j10 = this.contentBufferedPositionMs;
            j9 = j16;
        } else {
            j = j12;
            j9 = j16;
            j10 = 0;
        }
        new androidx.media3.session.SessionPositionInfo(positionInfoFilterByAvailableCommands, z10, j11, j, j13, i3, j14, j15, j9, j10);
        return r3;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.positionInfo, java.lang.Boolean.valueOf(this.isPlayingAd));
    }

    public android.os.Bundle toBundle(int i3) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (i3 < 3 || !DEFAULT_POSITION_INFO.equalsForBundling(this.positionInfo)) {
            bundle.putBundle(FIELD_POSITION_INFO, this.positionInfo.toBundle(i3));
        }
        boolean z6 = this.isPlayingAd;
        if (z6) {
            bundle.putBoolean(FIELD_IS_PLAYING_AD, z6);
        }
        long j = this.eventTimeMs;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            bundle.putLong(FIELD_EVENT_TIME_MS, j);
        }
        long j9 = this.durationMs;
        if (j9 != androidx.media3.common.C.TIME_UNSET) {
            bundle.putLong(FIELD_DURATION_MS, j9);
        }
        if (i3 < 3 || this.bufferedPositionMs != 0) {
            bundle.putLong(FIELD_BUFFERED_POSITION_MS, this.bufferedPositionMs);
        }
        int i9 = this.bufferedPercentage;
        if (i9 != 0) {
            bundle.putInt(FIELD_BUFFERED_PERCENTAGE, i9);
        }
        long j10 = this.totalBufferedDurationMs;
        if (j10 != 0) {
            bundle.putLong(FIELD_TOTAL_BUFFERED_DURATION_MS, j10);
        }
        long j11 = this.currentLiveOffsetMs;
        if (j11 != androidx.media3.common.C.TIME_UNSET) {
            bundle.putLong(FIELD_CURRENT_LIVE_OFFSET_MS, j11);
        }
        long j12 = this.contentDurationMs;
        if (j12 != androidx.media3.common.C.TIME_UNSET) {
            bundle.putLong(FIELD_CONTENT_DURATION_MS, j12);
        }
        if (i3 >= 3 && this.contentBufferedPositionMs == 0) {
            return bundle;
        }
        bundle.putLong(FIELD_CONTENT_BUFFERED_POSITION_MS, this.contentBufferedPositionMs);
        return bundle;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        sb.append(this.positionInfo.mediaItemIndex);
        sb.append(", periodIndex=");
        sb.append(this.positionInfo.periodIndex);
        sb.append(", positionMs=");
        sb.append(this.positionInfo.positionMs);
        sb.append(", contentPositionMs=");
        sb.append(this.positionInfo.contentPositionMs);
        sb.append(", adGroupIndex=");
        sb.append(this.positionInfo.adGroupIndex);
        sb.append(", adIndexInAdGroup=");
        sb.append(this.positionInfo.adIndexInAdGroup);
        sb.append("}, isPlayingAd=");
        sb.append(this.isPlayingAd);
        sb.append(", eventTimeMs=");
        sb.append(this.eventTimeMs);
        sb.append(", durationMs=");
        sb.append(this.durationMs);
        sb.append(", bufferedPositionMs=");
        sb.append(this.bufferedPositionMs);
        sb.append(", bufferedPercentage=");
        sb.append(this.bufferedPercentage);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.totalBufferedDurationMs);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.currentLiveOffsetMs);
        sb.append(", contentDurationMs=");
        sb.append(this.contentDurationMs);
        sb.append(", contentBufferedPositionMs=");
        return Y6.f.g(this.contentBufferedPositionMs, "}", sb);
    }

    public static androidx.media3.session.SessionPositionInfo fromBundle(android.os.Bundle bundle, int i3) {
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_POSITION_INFO);
        return new androidx.media3.session.SessionPositionInfo(bundle2 == null ? DEFAULT_POSITION_INFO : androidx.media3.common.Player.PositionInfo.fromBundle(bundle2, i3), bundle.getBoolean(FIELD_IS_PLAYING_AD, false), bundle.getLong(FIELD_EVENT_TIME_MS, androidx.media3.common.C.TIME_UNSET), bundle.getLong(FIELD_DURATION_MS, androidx.media3.common.C.TIME_UNSET), bundle.getLong(FIELD_BUFFERED_POSITION_MS, 0L), bundle.getInt(FIELD_BUFFERED_PERCENTAGE, 0), bundle.getLong(FIELD_TOTAL_BUFFERED_DURATION_MS, 0L), bundle.getLong(FIELD_CURRENT_LIVE_OFFSET_MS, androidx.media3.common.C.TIME_UNSET), bundle.getLong(FIELD_CONTENT_DURATION_MS, androidx.media3.common.C.TIME_UNSET), bundle.getLong(FIELD_CONTENT_BUFFERED_POSITION_MS, 0L));
    }
}
