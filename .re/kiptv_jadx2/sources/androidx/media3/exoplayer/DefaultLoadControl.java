package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocation;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.exoplayer.upstream.PlayerIdAwareAllocator;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p076i4.AbstractC2186b0;
import p076i4.AbstractC2194f0;
import p076i4.AbstractC2230y;
import p076i4.X0;
import p076i4.Z;

public class DefaultLoadControl implements LoadControl {
    public static final int DEFAULT_AUDIO_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_FOR_LOCAL_PLAYBACK_MS = 1000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 2000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_FOR_LOCAL_PLAYBACK_MS = 1000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 1000;
    public static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
    public static final int DEFAULT_IMAGE_BUFFER_SIZE = 26214400;
    public static final int DEFAULT_MAX_BUFFER_FOR_LOCAL_PLAYBACK_MS = 50000;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_MAX_BUFFER_SIZE = 210239488;
    public static final int DEFAULT_METADATA_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MIN_BUFFER_FOR_LOCAL_PLAYBACK_MS = 1000;
    public static final int DEFAULT_MIN_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_MUXED_BUFFER_SIZE = 144310272;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = false;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS_FOR_LOCAL_PLAYBACK = true;
    public static final boolean DEFAULT_RETAIN_BACK_BUFFER_FROM_KEYFRAME = false;
    public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    public static final int DEFAULT_TARGET_BUFFER_BYTES_FOR_PRELOAD = 144179200;
    public static final int DEFAULT_TEXT_BUFFER_SIZE = 131072;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE = 131072000;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE_FOR_LOCAL_PLAYBACK = 19660800;
    public static final AbstractC2186b0 LOCAL_PLAYBACK_SCHEMES;
    private final DefaultAllocator allocator;
    private final long backBufferDurationUs;
    private final long bufferForPlaybackAfterRebufferForLocalPlaybackUs;
    private final long bufferForPlaybackAfterRebufferUs;
    private final long bufferForPlaybackForLocalPlaybackUs;
    private final long bufferForPlaybackUs;
    private final ConcurrentHashMap<PlayerId, PlayerLoadingState> loadingStates;
    private final long maxBufferForLocalPlaybackUs;
    private final long maxBufferUs;
    private final long minBufferForLocalPlaybackUs;
    private final long minBufferUs;
    private final Timeline.Period period;
    private final AbstractC2194f0 playerTargetBufferBytesOverwrites;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final boolean prioritizeTimeOverSizeThresholdsForLocalPlayback;
    private final boolean retainBackBufferFromKeyframe;
    private final int targetBufferBytesOverwrite;
    private long threadId;
    private final Timeline.Window window;

    public static final class Builder {
        private DefaultAllocator allocator;
        private int backBufferDurationMs;
        private int bufferForPlaybackAfterRebufferForLocalPlaybackMs;
        private int bufferForPlaybackAfterRebufferMs;
        private int bufferForPlaybackForLocalPlaybackMs;
        private int bufferForPlaybackMs;
        private boolean buildCalled;
        private int maxBufferForLocalPlaybackMs;
        private int maxBufferMs;
        private int minBufferForLocalPlaybackMs;
        private int minBufferMs;
        private Boolean onlyGenericConfigurationMethodsCalled;
        private final HashMap<String, Integer> playerTargetBufferBytes;
        private boolean prioritizeTimeOverSizeThresholds;
        private boolean prioritizeTimeOverSizeThresholdsForLocalPlayback;
        private boolean retainBackBufferFromKeyframe;
        private int targetBufferBytes;

        public Builder() {
            HashMap<String, Integer> map = new HashMap<>();
            this.playerTargetBufferBytes = map;
            map.put(PlayerId.PRELOAD.name, Integer.valueOf(DefaultLoadControl.DEFAULT_TARGET_BUFFER_BYTES_FOR_PRELOAD));
            this.minBufferMs = 50000;
            this.minBufferForLocalPlaybackMs = 1000;
            this.maxBufferMs = 50000;
            this.maxBufferForLocalPlaybackMs = 50000;
            this.bufferForPlaybackMs = 1000;
            this.bufferForPlaybackForLocalPlaybackMs = 1000;
            this.bufferForPlaybackAfterRebufferMs = 2000;
            this.bufferForPlaybackAfterRebufferForLocalPlaybackMs = 1000;
            this.targetBufferBytes = -1;
            this.prioritizeTimeOverSizeThresholds = false;
            this.prioritizeTimeOverSizeThresholdsForLocalPlayback = true;
            this.backBufferDurationMs = 0;
            this.retainBackBufferFromKeyframe = false;
        }

        public DefaultLoadControl build() {
            AbstractC1864o0.Y(!this.buildCalled);
            this.buildCalled = true;
            if (this.allocator == null) {
                this.allocator = new DefaultAllocator(true, 65536);
            }
            Boolean bool = this.onlyGenericConfigurationMethodsCalled;
            if (bool != null && bool.booleanValue()) {
                this.minBufferForLocalPlaybackMs = this.minBufferMs;
                this.maxBufferForLocalPlaybackMs = this.maxBufferMs;
                this.bufferForPlaybackForLocalPlaybackMs = this.bufferForPlaybackMs;
                this.bufferForPlaybackAfterRebufferForLocalPlaybackMs = this.bufferForPlaybackAfterRebufferMs;
                this.prioritizeTimeOverSizeThresholdsForLocalPlayback = this.prioritizeTimeOverSizeThresholds;
            }
            return new DefaultLoadControl(this.allocator, this.minBufferMs, this.minBufferForLocalPlaybackMs, this.maxBufferMs, this.maxBufferForLocalPlaybackMs, this.bufferForPlaybackMs, this.bufferForPlaybackForLocalPlaybackMs, this.bufferForPlaybackAfterRebufferMs, this.bufferForPlaybackAfterRebufferForLocalPlaybackMs, this.targetBufferBytes, this.prioritizeTimeOverSizeThresholds, this.prioritizeTimeOverSizeThresholdsForLocalPlayback, this.backBufferDurationMs, this.retainBackBufferFromKeyframe, this.playerTargetBufferBytes);
        }

        public Builder setAllocator(DefaultAllocator defaultAllocator) {
            AbstractC1864o0.Y(!this.buildCalled);
            this.allocator = defaultAllocator;
            return this;
        }

        public Builder setBackBuffer(int i3, boolean z6) {
            AbstractC1864o0.Y(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i3, 0, "backBufferDurationMs", "0");
            this.backBufferDurationMs = i3;
            this.retainBackBufferFromKeyframe = z6;
            return this;
        }

        public Builder setBufferDurationsMs(int i3, int i9, int i10, int i11) {
            AbstractC1864o0.Y(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i10, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i3, i10, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i3, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i9, i3, "maxBufferMs", "minBufferMs");
            this.minBufferMs = i3;
            this.maxBufferMs = i9;
            this.bufferForPlaybackMs = i10;
            this.bufferForPlaybackAfterRebufferMs = i11;
            this.minBufferForLocalPlaybackMs = i3;
            this.maxBufferForLocalPlaybackMs = i9;
            this.bufferForPlaybackForLocalPlaybackMs = i10;
            this.bufferForPlaybackAfterRebufferForLocalPlaybackMs = i11;
            if (this.onlyGenericConfigurationMethodsCalled == null) {
                this.onlyGenericConfigurationMethodsCalled = Boolean.TRUE;
            }
            return this;
        }

        public Builder setBufferDurationsMsForLocalPlayback(int i3, int i9, int i10, int i11) {
            AbstractC1864o0.Y(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i10, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i3, i10, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i3, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i9, i3, "maxBufferMs", "minBufferMs");
            this.minBufferForLocalPlaybackMs = i3;
            this.maxBufferForLocalPlaybackMs = i9;
            this.bufferForPlaybackForLocalPlaybackMs = i10;
            this.bufferForPlaybackAfterRebufferForLocalPlaybackMs = i11;
            this.onlyGenericConfigurationMethodsCalled = Boolean.FALSE;
            return this;
        }

        public Builder setBufferDurationsMsForStreaming(int i3, int i9, int i10, int i11) {
            AbstractC1864o0.Y(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i10, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i3, i10, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i3, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i9, i3, "maxBufferMs", "minBufferMs");
            this.minBufferMs = i3;
            this.maxBufferMs = i9;
            this.bufferForPlaybackMs = i10;
            this.bufferForPlaybackAfterRebufferMs = i11;
            this.onlyGenericConfigurationMethodsCalled = Boolean.FALSE;
            return this;
        }

        public Builder setPlayerTargetBufferBytes(String str, int i3) {
            AbstractC1864o0.Y(!this.buildCalled);
            this.playerTargetBufferBytes.put(str, Integer.valueOf(i3));
            return this;
        }

        public Builder setPrioritizeTimeOverSizeThresholds(boolean z6) {
            AbstractC1864o0.Y(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholds = z6;
            this.prioritizeTimeOverSizeThresholdsForLocalPlayback = z6;
            if (this.onlyGenericConfigurationMethodsCalled == null) {
                this.onlyGenericConfigurationMethodsCalled = Boolean.TRUE;
            }
            return this;
        }

        public Builder setPrioritizeTimeOverSizeThresholdsForLocalPlayback(boolean z6) {
            AbstractC1864o0.Y(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholdsForLocalPlayback = z6;
            this.onlyGenericConfigurationMethodsCalled = Boolean.FALSE;
            return this;
        }

        public Builder setPrioritizeTimeOverSizeThresholdsForStreaming(boolean z6) {
            AbstractC1864o0.Y(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholds = z6;
            this.onlyGenericConfigurationMethodsCalled = Boolean.FALSE;
            return this;
        }

        public Builder setTargetBufferBytes(int i3) {
            AbstractC1864o0.Y(!this.buildCalled);
            this.targetBufferBytes = i3;
            return this;
        }
    }

    public static class PlayerLoadingState {
        private int allocatedCounts;
        public boolean isLoading;
        public int referenceCount = 1;
        public int targetBufferBytes;

        public synchronized void decreaseAllocatedCounts() {
            this.allocatedCounts--;
        }

        public synchronized int getAllocatedCounts() {
            return this.allocatedCounts;
        }

        public synchronized void increaseAllocatedCounts() {
            this.allocatedCounts++;
        }
    }

    static {
        Z z6 = AbstractC2186b0.f22868i;
        Object[] objArr = {"file", "content", "data", "android.resource", RawResourceDataSource.RAW_RESOURCE_SCHEME, "asset"};
        AbstractC2230y.b(objArr, 6);
        LOCAL_PLAYBACK_SCHEMES = AbstractC2186b0.r(objArr, 6);
    }

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, 65536), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, -1, false, true, 0, false);
    }

    public static void assertGreaterOrEqual(int i3, int i9, String str, String str2) {
        AbstractC1864o0.Q(i3 >= i9, "%s cannot be less than %s", str, str2);
    }

    private long getBufferForPlaybackAfterRebufferUs(boolean z6) {
        return z6 ? this.bufferForPlaybackAfterRebufferForLocalPlaybackUs : this.bufferForPlaybackAfterRebufferUs;
    }

    private long getBufferForPlaybackUs(boolean z6) {
        return z6 ? this.bufferForPlaybackForLocalPlaybackUs : this.bufferForPlaybackUs;
    }

    private static int getDefaultBufferSize(int i3, boolean z6) {
        switch (i3) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return DEFAULT_MUXED_BUFFER_SIZE;
            case 1:
                return 13107200;
            case 2:
                return z6 ? DEFAULT_VIDEO_BUFFER_SIZE_FOR_LOCAL_PLAYBACK : DEFAULT_VIDEO_BUFFER_SIZE;
            case 3:
                return 131072;
            case 4:
                return DEFAULT_IMAGE_BUFFER_SIZE;
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private long getMaxBufferUs(boolean z6) {
        return z6 ? this.maxBufferForLocalPlaybackUs : this.maxBufferUs;
    }

    private long getMinBufferUs(boolean z6) {
        return z6 ? this.minBufferForLocalPlaybackUs : this.minBufferUs;
    }

    private int getTargetBufferBytes(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        playerLoadingState.getClass();
        return playerLoadingState.targetBufferBytes;
    }

    private int getTargetBufferBytesOverwrite(PlayerId playerId) {
        Integer num = (Integer) this.playerTargetBufferBytesOverwrites.get(playerId.name);
        return (num == null || num.intValue() == -1) ? this.targetBufferBytesOverwrite : num.intValue();
    }

    public int getTotalBufferBytesAllocated(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        playerLoadingState.getClass();
        return this.allocator.getIndividualAllocationLength() * playerLoadingState.getAllocatedCounts();
    }

    private boolean isLocalPlayback(LoadControl.Parameters parameters) {
        MediaItem.LocalConfiguration localConfiguration = parameters.timeline.getWindow(parameters.timeline.getPeriodByUid(parameters.mediaPeriodId.periodUid, this.period).windowIndex, this.window).mediaItem.localConfiguration;
        if (localConfiguration == null) {
            return false;
        }
        String scheme = localConfiguration.uri.getScheme();
        return TextUtils.isEmpty(scheme) || LOCAL_PLAYBACK_SCHEMES.contains(scheme);
    }

    private boolean prioritizeTimeOverSizeThresholds(boolean z6) {
        return z6 ? this.prioritizeTimeOverSizeThresholdsForLocalPlayback : this.prioritizeTimeOverSizeThresholds;
    }

    private void removePlayer(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        if (playerLoadingState != null) {
            int i3 = playerLoadingState.referenceCount - 1;
            playerLoadingState.referenceCount = i3;
            if (i3 == 0) {
                this.loadingStates.remove(playerId);
                updateAllocator();
            }
        }
    }

    private void resetPlayerLoadingState(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        playerLoadingState.getClass();
        int targetBufferBytesOverwrite = getTargetBufferBytesOverwrite(playerId);
        if (targetBufferBytesOverwrite == -1) {
            targetBufferBytesOverwrite = 13107200;
        }
        playerLoadingState.targetBufferBytes = targetBufferBytesOverwrite;
        playerLoadingState.isLoading = false;
    }

    private void updateAllocator() {
        if (this.loadingStates.isEmpty()) {
            this.allocator.reset();
        } else {
            this.allocator.setTargetBufferSize(calculateTotalTargetBufferBytes());
        }
    }

    @Deprecated
    public int calculateTargetBufferBytes(ExoTrackSelection[] exoTrackSelectionArr) {
        return -1;
    }

    public int calculateTotalTargetBufferBytes() {
        Iterator<PlayerLoadingState> it = this.loadingStates.values().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += it.next().targetBufferBytes;
        }
        return i3;
    }

    @Override
    public Allocator getAllocator(PlayerId playerId) {
        return new PlayerIdFilteringAllocatorImpl(playerId);
    }

    @Override
    public long getBackBufferDurationUs(PlayerId playerId) {
        return this.backBufferDurationUs;
    }

    @Override
    public void onPrepared(PlayerId playerId) {
        long id = Thread.currentThread().getId();
        long j = this.threadId;
        AbstractC1864o0.Z(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.threadId = id;
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        if (playerLoadingState == null) {
            this.loadingStates.put(playerId, new PlayerLoadingState());
        } else {
            playerLoadingState.referenceCount++;
        }
        resetPlayerLoadingState(playerId);
    }

    @Override
    public void onReleased(PlayerId playerId) {
        removePlayer(playerId);
        if (this.loadingStates.isEmpty()) {
            this.threadId = -1L;
        }
    }

    @Override
    public void onStopped(PlayerId playerId) {
        removePlayer(playerId);
    }

    @Override
    public void onTracksSelected(LoadControl.Parameters parameters, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        int targetBufferBytesOverwrite = getTargetBufferBytesOverwrite(parameters.playerId);
        PlayerLoadingState playerLoadingState = this.loadingStates.get(parameters.playerId);
        playerLoadingState.getClass();
        if (targetBufferBytesOverwrite == -1) {
            targetBufferBytesOverwrite = calculateTargetBufferBytes(parameters, exoTrackSelectionArr);
        }
        playerLoadingState.targetBufferBytes = targetBufferBytesOverwrite;
        updateAllocator();
    }

    @Override
    public boolean retainBackBufferFromKeyframe(PlayerId playerId) {
        return this.retainBackBufferFromKeyframe;
    }

    @Override
    public boolean shouldContinueLoading(LoadControl.Parameters parameters) {
        PlayerId playerId = parameters.playerId;
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        playerLoadingState.getClass();
        boolean z6 = getTotalBufferBytesAllocated(playerId) >= getTargetBufferBytes(playerId);
        if (playerId.equals(PlayerId.PRELOAD)) {
            return !z6;
        }
        boolean zIsLocalPlayback = isLocalPlayback(parameters);
        long minBufferUs = getMinBufferUs(zIsLocalPlayback);
        long maxBufferUs = getMaxBufferUs(zIsLocalPlayback);
        float f9 = parameters.playbackSpeed;
        if (f9 > 1.0f) {
            minBufferUs = Math.min(Util.getMediaDurationForPlayoutDuration(minBufferUs, f9), maxBufferUs);
        }
        long jMax = Math.max(minBufferUs, 500000L);
        long j = parameters.bufferedDurationUs;
        if (j < jMax) {
            boolean z9 = prioritizeTimeOverSizeThresholds(zIsLocalPlayback) || !z6;
            playerLoadingState.isLoading = z9;
            if (!z9 && parameters.bufferedDurationUs < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= maxBufferUs || z6) {
            playerLoadingState.isLoading = false;
        }
        return playerLoadingState.isLoading;
    }

    @Override
    public boolean shouldContinuePreloading(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j) {
        Iterator<PlayerLoadingState> it = this.loadingStates.values().iterator();
        while (it.hasNext()) {
            if (it.next().isLoading) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean shouldStartPlayback(LoadControl.Parameters parameters) {
        boolean zIsLocalPlayback = isLocalPlayback(parameters);
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(parameters.bufferedDurationUs, parameters.playbackSpeed);
        long bufferForPlaybackAfterRebufferUs = parameters.rebuffering ? getBufferForPlaybackAfterRebufferUs(zIsLocalPlayback) : getBufferForPlaybackUs(zIsLocalPlayback);
        long j = parameters.targetLiveOffsetUs;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            bufferForPlaybackAfterRebufferUs = Math.min(j / 2, bufferForPlaybackAfterRebufferUs);
        }
        if (bufferForPlaybackAfterRebufferUs <= 0 || playoutDurationForMediaDuration >= bufferForPlaybackAfterRebufferUs) {
            return true;
        }
        return !prioritizeTimeOverSizeThresholds(zIsLocalPlayback) && getTotalBufferBytesAllocated(parameters.playerId) >= getTargetBufferBytes(parameters.playerId);
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z6, boolean z9, int i17, boolean z10, Map<String, Integer> map) {
        assertGreaterOrEqual(i12, 0, "bufferForPlaybackMs", "0");
        assertGreaterOrEqual(i13, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        assertGreaterOrEqual(i14, 0, "bufferForPlaybackAfterRebufferMs", "0");
        assertGreaterOrEqual(i15, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        assertGreaterOrEqual(i3, i12, "minBufferMs", "bufferForPlaybackMs");
        assertGreaterOrEqual(i9, i13, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        assertGreaterOrEqual(i3, i14, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual(i9, i15, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        assertGreaterOrEqual(i10, i3, "maxBufferMs", "minBufferMs");
        assertGreaterOrEqual(i11, i9, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        assertGreaterOrEqual(i17, 0, "backBufferDurationMs", "0");
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.allocator = defaultAllocator;
        this.minBufferUs = Util.msToUs(i3);
        this.minBufferForLocalPlaybackUs = Util.msToUs(i9);
        this.maxBufferUs = Util.msToUs(i10);
        this.maxBufferForLocalPlaybackUs = Util.msToUs(i11);
        this.bufferForPlaybackUs = Util.msToUs(i12);
        this.bufferForPlaybackForLocalPlaybackUs = Util.msToUs(i13);
        this.bufferForPlaybackAfterRebufferUs = Util.msToUs(i14);
        this.bufferForPlaybackAfterRebufferForLocalPlaybackUs = Util.msToUs(i15);
        this.targetBufferBytesOverwrite = i16;
        this.prioritizeTimeOverSizeThresholds = z6;
        this.prioritizeTimeOverSizeThresholdsForLocalPlayback = z9;
        this.backBufferDurationUs = Util.msToUs(i17);
        this.retainBackBufferFromKeyframe = z10;
        this.loadingStates = new ConcurrentHashMap<>();
        this.playerTargetBufferBytesOverwrites = AbstractC2194f0.a(map);
        this.threadId = -1L;
    }

    public int calculateTargetBufferBytes(LoadControl.Parameters parameters, ExoTrackSelection[] exoTrackSelectionArr) {
        int iCalculateTargetBufferBytes = calculateTargetBufferBytes(exoTrackSelectionArr);
        if (iCalculateTargetBufferBytes != -1) {
            return iCalculateTargetBufferBytes;
        }
        boolean zIsLocalPlayback = isLocalPlayback(parameters);
        int defaultBufferSize = 0;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                defaultBufferSize += getDefaultBufferSize(exoTrackSelection.getTrackGroup().type, zIsLocalPlayback);
            }
        }
        return Util.constrainValue(defaultBufferSize, 13107200, DEFAULT_MAX_BUFFER_SIZE);
    }

    public final class PlayerIdFilteringAllocatorImpl implements PlayerIdAwareAllocator {
        private final HashMap<Allocation, PlayerId> allocationPlayerIdMap = new HashMap<>();
        private PlayerId playerId;

        public PlayerIdFilteringAllocatorImpl(PlayerId playerId) {
            this.playerId = playerId;
        }

        private void releaseInternal(Allocation allocation) {
            PlayerId playerIdRemove = this.allocationPlayerIdMap.remove(allocation);
            playerIdRemove.getClass();
            PlayerLoadingState playerLoadingState = (PlayerLoadingState) DefaultLoadControl.this.loadingStates.get(playerIdRemove);
            if (playerLoadingState != null) {
                playerLoadingState.decreaseAllocatedCounts();
            }
        }

        @Override
        public synchronized Allocation allocate() {
            Allocation allocationAllocate;
            allocationAllocate = DefaultLoadControl.this.allocator.allocate();
            this.allocationPlayerIdMap.put(allocationAllocate, this.playerId);
            PlayerLoadingState playerLoadingState = (PlayerLoadingState) DefaultLoadControl.this.loadingStates.get(this.playerId);
            if (playerLoadingState != null) {
                playerLoadingState.increaseAllocatedCounts();
            }
            return allocationAllocate;
        }

        @Override
        public synchronized int getIndividualAllocationLength() {
            return DefaultLoadControl.this.allocator.getIndividualAllocationLength();
        }

        @Override
        public synchronized int getTotalBytesAllocated() {
            return DefaultLoadControl.this.getTotalBufferBytesAllocated(this.playerId);
        }

        @Override
        public synchronized void release(Allocation allocation) {
            DefaultLoadControl.this.allocator.release(allocation);
            releaseInternal(allocation);
        }

        @Override
        public synchronized void setPlayerId(PlayerId playerId) {
            this.playerId = playerId;
        }

        @Override
        public synchronized void trim() {
            DefaultLoadControl.this.allocator.trim();
        }

        @Override
        public synchronized void release(Allocator.AllocationNode allocationNode) {
            DefaultLoadControl.this.allocator.release(allocationNode);
            while (allocationNode != null) {
                releaseInternal(allocationNode.getAllocation());
                allocationNode = allocationNode.next();
            }
        }
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z6, boolean z9, int i17, boolean z10) {
        this(defaultAllocator, i3, i9, i10, i11, i12, i13, i14, i15, i16, z6, z9, i17, z10, X0.f22848n);
    }
}
