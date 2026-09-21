package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.ArrayList;
import java.util.Objects;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Y;
import p076i4.Z;

public abstract class Timeline {
    public static final Timeline EMPTY = new Timeline() {
        @Override
        public int getIndexOfPeriod(Object obj) {
            return -1;
        }

        @Override
        public Period getPeriod(int i3, Period period, boolean z6) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public int getPeriodCount() {
            return 0;
        }

        @Override
        public Object getUidOfPeriod(int i3) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public Window getWindow(int i3, Window window, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public int getWindowCount() {
            return 0;
        }
    };
    private static final String FIELD_WINDOWS = Util.intToStringMaxRadix(0);
    private static final String FIELD_PERIODS = Util.intToStringMaxRadix(1);
    private static final String FIELD_SHUFFLED_WINDOW_INDICES = Util.intToStringMaxRadix(2);

    public static final class Period {
        public AdPlaybackState adPlaybackState = AdPlaybackState.NONE;
        public long durationUs;
        public Object id;
        public boolean isPlaceholder;
        public long positionInWindowUs;
        public Object uid;
        public int windowIndex;
        private static final String FIELD_WINDOW_INDEX = Util.intToStringMaxRadix(0);
        private static final String FIELD_DURATION_US = Util.intToStringMaxRadix(1);
        private static final String FIELD_POSITION_IN_WINDOW_US = Util.intToStringMaxRadix(2);
        private static final String FIELD_PLACEHOLDER = Util.intToStringMaxRadix(3);
        private static final String FIELD_AD_PLAYBACK_STATE = Util.intToStringMaxRadix(4);

        @Deprecated
        public static Period fromBundle(Bundle bundle) {
            return fromBundle(bundle, 9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Period.class.equals(obj.getClass())) {
                Period period = (Period) obj;
                if (Objects.equals(this.id, period.id) && Objects.equals(this.uid, period.uid) && this.windowIndex == period.windowIndex && this.durationUs == period.durationUs && this.positionInWindowUs == period.positionInWindowUs && this.isPlaceholder == period.isPlaceholder && Objects.equals(this.adPlaybackState, period.adPlaybackState)) {
                    return true;
                }
            }
            return false;
        }

        public int getAdCountInAdGroup(int i3) {
            return this.adPlaybackState.getAdGroup(i3).count;
        }

        public long getAdDurationUs(int i3, int i9) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.getAdGroup(i3);
            return adGroup.count != -1 ? adGroup.durationsUs[i9] : C.TIME_UNSET;
        }

        public int getAdGroupCount() {
            return this.adPlaybackState.adGroupCount;
        }

        public int getAdGroupIndexAfterPositionUs(long j) {
            return this.adPlaybackState.getAdGroupIndexAfterPositionUs(j, this.durationUs);
        }

        public int getAdGroupIndexForPositionUs(long j) {
            return this.adPlaybackState.getAdGroupIndexForPositionUs(j, this.durationUs);
        }

        public long getAdGroupTimeUs(int i3) {
            return this.adPlaybackState.getAdGroup(i3).timeUs;
        }

        public long getAdResumePositionUs() {
            return this.adPlaybackState.adResumePositionUs;
        }

        public int getAdState(int i3, int i9) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.getAdGroup(i3);
            if (adGroup.count != -1) {
                return adGroup.states[i9];
            }
            return 0;
        }

        public Object getAdsId() {
            return this.adPlaybackState.adsId;
        }

        public long getContentResumeOffsetUs(int i3) {
            return this.adPlaybackState.getAdGroup(i3).contentResumeOffsetUs;
        }

        public long getDurationMs() {
            return Util.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public int getFirstAdIndexToPlay(int i3) {
            return this.adPlaybackState.getAdGroup(i3).getFirstAdIndexToPlay();
        }

        public int getNextAdIndexToPlay(int i3, int i9) {
            return this.adPlaybackState.getAdGroup(i3).getNextAdIndexToPlay(i9);
        }

        public long getPositionInWindowMs() {
            return Util.usToMs(this.positionInWindowUs);
        }

        public long getPositionInWindowUs() {
            return this.positionInWindowUs;
        }

        public int getRemovedAdGroupCount() {
            return this.adPlaybackState.removedAdGroupCount;
        }

        public boolean hasPlayedAdGroup(int i3) {
            return !this.adPlaybackState.getAdGroup(i3).hasUnplayedAds();
        }

        public int hashCode() {
            Object obj = this.id;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.uid;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.windowIndex) * 31;
            long j = this.durationUs;
            int i3 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j9 = this.positionInWindowUs;
            return this.adPlaybackState.hashCode() + ((((i3 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31);
        }

        public boolean isLivePostrollPlaceholder(int i3) {
            return i3 == getAdGroupCount() - 1 && this.adPlaybackState.isLivePostrollPlaceholder(i3);
        }

        public boolean isServerSideInsertedAdGroup(int i3) {
            return this.adPlaybackState.getAdGroup(i3).isServerSideInserted;
        }

        public Period set(Object obj, Object obj2, int i3, long j, long j9) {
            return set(obj, obj2, i3, j, j9, AdPlaybackState.NONE, false);
        }

        @Deprecated
        public Bundle toBundle() {
            return toBundle(9);
        }

        public static Period fromBundle(Bundle bundle, int i3) {
            int i9 = bundle.getInt(FIELD_WINDOW_INDEX, 0);
            long j = bundle.getLong(FIELD_DURATION_US, C.TIME_UNSET);
            long j9 = bundle.getLong(FIELD_POSITION_IN_WINDOW_US, 0L);
            boolean z6 = bundle.getBoolean(FIELD_PLACEHOLDER, false);
            Bundle bundle2 = bundle.getBundle(FIELD_AD_PLAYBACK_STATE);
            AdPlaybackState adPlaybackStateFromBundle = bundle2 != null ? AdPlaybackState.fromBundle(bundle2, i3) : AdPlaybackState.NONE;
            Period period = new Period();
            period.set(null, null, i9, j, j9, adPlaybackStateFromBundle, z6);
            return period;
        }

        public Period set(Object obj, Object obj2, int i3, long j, long j9, AdPlaybackState adPlaybackState, boolean z6) {
            this.id = obj;
            this.uid = obj2;
            this.windowIndex = i3;
            this.durationUs = j;
            this.positionInWindowUs = j9;
            this.adPlaybackState = adPlaybackState;
            this.isPlaceholder = z6;
            return this;
        }

        public Bundle toBundle(int i3) {
            Bundle bundle = new Bundle();
            int i9 = this.windowIndex;
            if (i9 != 0) {
                bundle.putInt(FIELD_WINDOW_INDEX, i9);
            }
            long j = this.durationUs;
            if (j != C.TIME_UNSET) {
                bundle.putLong(FIELD_DURATION_US, j);
            }
            long j9 = this.positionInWindowUs;
            if (j9 != 0) {
                bundle.putLong(FIELD_POSITION_IN_WINDOW_US, j9);
            }
            boolean z6 = this.isPlaceholder;
            if (z6) {
                bundle.putBoolean(FIELD_PLACEHOLDER, z6);
            }
            if (!this.adPlaybackState.equals(AdPlaybackState.NONE)) {
                bundle.putBundle(FIELD_AD_PLAYBACK_STATE, this.adPlaybackState.toBundle(i3));
            }
            return bundle;
        }
    }

    public static final class RemotableTimeline extends Timeline {
        private final AbstractC2186b0 periods;
        private final int[] shuffledWindowIndices;
        private final int[] windowIndicesInShuffled;
        private final AbstractC2186b0 windows;

        public RemotableTimeline(AbstractC2186b0 abstractC2186b0, AbstractC2186b0 abstractC2186b1, int[] iArr) {
            AbstractC1864o0.L(abstractC2186b0.size() == iArr.length);
            this.windows = abstractC2186b0;
            this.periods = abstractC2186b1;
            this.shuffledWindowIndices = iArr;
            this.windowIndicesInShuffled = new int[iArr.length];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                this.windowIndicesInShuffled[iArr[i3]] = i3;
            }
        }

        @Override
        public int getFirstWindowIndex(boolean z6) {
            if (isEmpty()) {
                return -1;
            }
            if (z6) {
                return this.shuffledWindowIndices[0];
            }
            return 0;
        }

        @Override
        public int getIndexOfPeriod(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int getLastWindowIndex(boolean z6) {
            if (isEmpty()) {
                return -1;
            }
            return z6 ? this.shuffledWindowIndices[getWindowCount() - 1] : getWindowCount() - 1;
        }

        @Override
        public int getNextWindowIndex(int i3, int i9, boolean z6) {
            if (i9 == 1) {
                return i3;
            }
            if (i3 != getLastWindowIndex(z6)) {
                return z6 ? this.shuffledWindowIndices[this.windowIndicesInShuffled[i3] + 1] : i3 + 1;
            }
            if (i9 == 2) {
                return getFirstWindowIndex(z6);
            }
            return -1;
        }

        @Override
        public Period getPeriod(int i3, Period period, boolean z6) {
            Period period2 = (Period) this.periods.get(i3);
            period.set(period2.id, period2.uid, period2.windowIndex, period2.durationUs, period2.positionInWindowUs, period2.adPlaybackState, period2.isPlaceholder);
            return period;
        }

        @Override
        public int getPeriodCount() {
            return this.periods.size();
        }

        @Override
        public int getPreviousWindowIndex(int i3, int i9, boolean z6) {
            if (i9 == 1) {
                return i3;
            }
            if (i3 != getFirstWindowIndex(z6)) {
                return z6 ? this.shuffledWindowIndices[this.windowIndicesInShuffled[i3] - 1] : i3 - 1;
            }
            if (i9 == 2) {
                return getLastWindowIndex(z6);
            }
            return -1;
        }

        @Override
        public Object getUidOfPeriod(int i3) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Window getWindow(int i3, Window window, long j) {
            Window window2 = (Window) this.windows.get(i3);
            window.set(window2.uid, window2.mediaItem, window2.manifest, window2.presentationStartTimeMs, window2.windowStartTimeMs, window2.elapsedRealtimeEpochOffsetMs, window2.isSeekable, window2.isDynamic, window2.liveConfiguration, window2.defaultPositionUs, window2.durationUs, window2.firstPeriodIndex, window2.lastPeriodIndex, window2.positionInFirstPeriodUs);
            window.isPlaceholder = window2.isPlaceholder;
            return window;
        }

        @Override
        public int getWindowCount() {
            return this.windows.size();
        }
    }

    public static final class Window {
        public long defaultPositionUs;
        public long durationUs;
        public long elapsedRealtimeEpochOffsetMs;
        public int firstPeriodIndex;
        public boolean isDynamic;
        public boolean isPlaceholder;
        public boolean isSeekable;
        public int lastPeriodIndex;
        public MediaItem.LiveConfiguration liveConfiguration;
        public Object manifest;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;

        @Deprecated
        public Object tag;
        public long windowStartTimeMs;
        public static final Object SINGLE_WINDOW_UID = new Object();
        private static final Object FAKE_WINDOW_UID = new Object();
        private static final MediaItem PLACEHOLDER_MEDIA_ITEM = new MediaItem.Builder().setMediaId("androidx.media3.common.Timeline").setUri(Uri.EMPTY).build();
        private static final String FIELD_MEDIA_ITEM = Util.intToStringMaxRadix(1);
        private static final String FIELD_PRESENTATION_START_TIME_MS = Util.intToStringMaxRadix(2);
        private static final String FIELD_WINDOW_START_TIME_MS = Util.intToStringMaxRadix(3);
        private static final String FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS = Util.intToStringMaxRadix(4);
        private static final String FIELD_IS_SEEKABLE = Util.intToStringMaxRadix(5);
        private static final String FIELD_IS_DYNAMIC = Util.intToStringMaxRadix(6);
        private static final String FIELD_LIVE_CONFIGURATION = Util.intToStringMaxRadix(7);
        private static final String FIELD_IS_PLACEHOLDER = Util.intToStringMaxRadix(8);
        private static final String FIELD_DEFAULT_POSITION_US = Util.intToStringMaxRadix(9);
        private static final String FIELD_DURATION_US = Util.intToStringMaxRadix(10);
        private static final String FIELD_FIRST_PERIOD_INDEX = Util.intToStringMaxRadix(11);
        private static final String FIELD_LAST_PERIOD_INDEX = Util.intToStringMaxRadix(12);
        private static final String FIELD_POSITION_IN_FIRST_PERIOD_US = Util.intToStringMaxRadix(13);
        public Object uid = SINGLE_WINDOW_UID;
        public MediaItem mediaItem = PLACEHOLDER_MEDIA_ITEM;

        @Deprecated
        public static Window fromBundle(Bundle bundle) {
            return fromBundle(bundle, 9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Window.class.equals(obj.getClass())) {
                Window window = (Window) obj;
                if (Objects.equals(this.uid, window.uid) && Objects.equals(this.mediaItem, window.mediaItem) && Objects.equals(this.manifest, window.manifest) && Objects.equals(this.liveConfiguration, window.liveConfiguration) && this.presentationStartTimeMs == window.presentationStartTimeMs && this.windowStartTimeMs == window.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == window.elapsedRealtimeEpochOffsetMs && this.isSeekable == window.isSeekable && this.isDynamic == window.isDynamic && this.isPlaceholder == window.isPlaceholder && this.defaultPositionUs == window.defaultPositionUs && this.durationUs == window.durationUs && this.firstPeriodIndex == window.firstPeriodIndex && this.lastPeriodIndex == window.lastPeriodIndex && this.positionInFirstPeriodUs == window.positionInFirstPeriodUs) {
                    return true;
                }
            }
            return false;
        }

        public long getCurrentUnixTimeMs() {
            return Util.getNowUnixTimeMs(this.elapsedRealtimeEpochOffsetMs);
        }

        public long getDefaultPositionMs() {
            return Util.usToMs(this.defaultPositionUs);
        }

        public long getDefaultPositionUs() {
            return this.defaultPositionUs;
        }

        public long getDurationMs() {
            return Util.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public long getPositionInFirstPeriodMs() {
            return Util.usToMs(this.positionInFirstPeriodUs);
        }

        public long getPositionInFirstPeriodUs() {
            return this.positionInFirstPeriodUs;
        }

        public int hashCode() {
            int iHashCode = (this.mediaItem.hashCode() + ((this.uid.hashCode() + 217) * 31)) * 31;
            Object obj = this.manifest;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int iHashCode3 = (iHashCode2 + (liveConfiguration != null ? liveConfiguration.hashCode() : 0)) * 31;
            long j = this.presentationStartTimeMs;
            int i3 = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j9 = this.windowStartTimeMs;
            int i9 = (i3 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.elapsedRealtimeEpochOffsetMs;
            int i10 = (((((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31) + (this.isPlaceholder ? 1 : 0)) * 31;
            long j11 = this.defaultPositionUs;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.durationUs;
            int i12 = (((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.firstPeriodIndex) * 31) + this.lastPeriodIndex) * 31;
            long j13 = this.positionInFirstPeriodUs;
            return i12 + ((int) (j13 ^ (j13 >>> 32)));
        }

        public boolean isLive() {
            return this.liveConfiguration != null;
        }

        public Window set(Object obj, MediaItem mediaItem, Object obj2, long j, long j9, long j10, boolean z6, boolean z9, MediaItem.LiveConfiguration liveConfiguration, long j11, long j12, int i3, int i9, long j13) {
            MediaItem.LocalConfiguration localConfiguration;
            this.uid = obj;
            this.mediaItem = mediaItem != null ? mediaItem : PLACEHOLDER_MEDIA_ITEM;
            this.tag = (mediaItem == null || (localConfiguration = mediaItem.localConfiguration) == null) ? null : localConfiguration.tag;
            this.manifest = obj2;
            this.presentationStartTimeMs = j;
            this.windowStartTimeMs = j9;
            this.elapsedRealtimeEpochOffsetMs = j10;
            this.isSeekable = z6;
            this.isDynamic = z9;
            this.liveConfiguration = liveConfiguration;
            this.defaultPositionUs = j11;
            this.durationUs = j12;
            this.firstPeriodIndex = i3;
            this.lastPeriodIndex = i9;
            this.positionInFirstPeriodUs = j13;
            this.isPlaceholder = false;
            return this;
        }

        @Deprecated
        public Bundle toBundle() {
            return toBundle(9);
        }

        public static Window fromBundle(Bundle bundle, int i3) {
            Bundle bundle2 = bundle.getBundle(FIELD_MEDIA_ITEM);
            MediaItem mediaItemFromBundle = bundle2 != null ? MediaItem.fromBundle(bundle2, i3) : MediaItem.EMPTY;
            long j = bundle.getLong(FIELD_PRESENTATION_START_TIME_MS, C.TIME_UNSET);
            long j9 = bundle.getLong(FIELD_WINDOW_START_TIME_MS, C.TIME_UNSET);
            long j10 = bundle.getLong(FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS, C.TIME_UNSET);
            boolean z6 = bundle.getBoolean(FIELD_IS_SEEKABLE, false);
            boolean z9 = bundle.getBoolean(FIELD_IS_DYNAMIC, false);
            Bundle bundle3 = bundle.getBundle(FIELD_LIVE_CONFIGURATION);
            MediaItem.LiveConfiguration liveConfigurationFromBundle = bundle3 != null ? MediaItem.LiveConfiguration.fromBundle(bundle3) : null;
            boolean z10 = bundle.getBoolean(FIELD_IS_PLACEHOLDER, false);
            long j11 = bundle.getLong(FIELD_DEFAULT_POSITION_US, 0L);
            long j12 = bundle.getLong(FIELD_DURATION_US, C.TIME_UNSET);
            int i9 = bundle.getInt(FIELD_FIRST_PERIOD_INDEX, 0);
            int i10 = bundle.getInt(FIELD_LAST_PERIOD_INDEX, 0);
            long j13 = bundle.getLong(FIELD_POSITION_IN_FIRST_PERIOD_US, 0L);
            Window window = new Window();
            window.set(FAKE_WINDOW_UID, mediaItemFromBundle, null, j, j9, j10, z6, z9, liveConfigurationFromBundle, j11, j12, i9, i10, j13);
            window.isPlaceholder = z10;
            return window;
        }

        public Bundle toBundle(int i3) {
            Bundle bundle = new Bundle();
            if (!MediaItem.EMPTY.equals(this.mediaItem)) {
                bundle.putBundle(FIELD_MEDIA_ITEM, this.mediaItem.toBundle(i3));
            }
            long j = this.presentationStartTimeMs;
            if (j != C.TIME_UNSET) {
                bundle.putLong(FIELD_PRESENTATION_START_TIME_MS, j);
            }
            long j9 = this.windowStartTimeMs;
            if (j9 != C.TIME_UNSET) {
                bundle.putLong(FIELD_WINDOW_START_TIME_MS, j9);
            }
            long j10 = this.elapsedRealtimeEpochOffsetMs;
            if (j10 != C.TIME_UNSET) {
                bundle.putLong(FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS, j10);
            }
            boolean z6 = this.isSeekable;
            if (z6) {
                bundle.putBoolean(FIELD_IS_SEEKABLE, z6);
            }
            boolean z9 = this.isDynamic;
            if (z9) {
                bundle.putBoolean(FIELD_IS_DYNAMIC, z9);
            }
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            if (liveConfiguration != null) {
                bundle.putBundle(FIELD_LIVE_CONFIGURATION, liveConfiguration.toBundle());
            }
            boolean z10 = this.isPlaceholder;
            if (z10) {
                bundle.putBoolean(FIELD_IS_PLACEHOLDER, z10);
            }
            long j11 = this.defaultPositionUs;
            if (j11 != 0) {
                bundle.putLong(FIELD_DEFAULT_POSITION_US, j11);
            }
            long j12 = this.durationUs;
            if (j12 != C.TIME_UNSET) {
                bundle.putLong(FIELD_DURATION_US, j12);
            }
            int i9 = this.firstPeriodIndex;
            if (i9 != 0) {
                bundle.putInt(FIELD_FIRST_PERIOD_INDEX, i9);
            }
            int i10 = this.lastPeriodIndex;
            if (i10 != 0) {
                bundle.putInt(FIELD_LAST_PERIOD_INDEX, i10);
            }
            long j13 = this.positionInFirstPeriodUs;
            if (j13 != 0) {
                bundle.putLong(FIELD_POSITION_IN_FIRST_PERIOD_US, j13);
            }
            return bundle;
        }
    }

    @Deprecated
    public static Timeline fromBundle(Bundle bundle) {
        return fromBundle(bundle, 9);
    }

    private static <T> AbstractC2186b0 fromBundleListRetriever(p068h4.j jVar, IBinder iBinder) {
        if (iBinder != null) {
            return BundleCollectionUtil.fromBundleList(jVar, BundleListRetriever.getList(iBinder));
        }
        Z z6 = AbstractC2186b0.f22868i;
        return S0.f22832l;
    }

    private static int[] generateUnshuffledIndices(int i3) {
        int[] iArr = new int[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            iArr[i9] = i9;
        }
        return iArr;
    }

    public static Window lambda$fromBundle$0(int i3, Bundle bundle) {
        return Window.fromBundle(bundle, i3);
    }

    public static Period lambda$fromBundle$1(int i3, Bundle bundle) {
        return Period.fromBundle(bundle, i3);
    }

    public final Timeline copyWithSingleWindow(int i3) {
        if (getWindowCount() == 1) {
            return this;
        }
        Window window = getWindow(i3, new Window(), 0L);
        Y yS = AbstractC2186b0.s();
        int i9 = window.firstPeriodIndex;
        while (true) {
            int i10 = window.lastPeriodIndex;
            if (i9 > i10) {
                window.lastPeriodIndex = i10 - window.firstPeriodIndex;
                window.firstPeriodIndex = 0;
                return new RemotableTimeline(AbstractC2186b0.y(window), yS.f(), new int[]{0});
            }
            Period period = getPeriod(i9, new Period(), true);
            period.windowIndex = 0;
            yS.c(period);
            i9++;
        }
    }

    public boolean equals(Object obj) {
        int lastWindowIndex;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.getWindowCount() != getWindowCount() || timeline.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        Window window = new Window();
        Period period = new Period();
        Window window2 = new Window();
        Period period2 = new Period();
        for (int i3 = 0; i3 < getWindowCount(); i3++) {
            if (!getWindow(i3, window).equals(timeline.getWindow(i3, window2))) {
                return false;
            }
        }
        for (int i9 = 0; i9 < getPeriodCount(); i9++) {
            if (!getPeriod(i9, period, true).equals(timeline.getPeriod(i9, period2, true))) {
                return false;
            }
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        if (firstWindowIndex != timeline.getFirstWindowIndex(true) || (lastWindowIndex = getLastWindowIndex(true)) != timeline.getLastWindowIndex(true)) {
            return false;
        }
        while (firstWindowIndex != lastWindowIndex) {
            int nextWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
            if (nextWindowIndex != timeline.getNextWindowIndex(firstWindowIndex, 0, true)) {
                return false;
            }
            firstWindowIndex = nextWindowIndex;
        }
        return true;
    }

    public int getFirstWindowIndex(boolean z6) {
        return isEmpty() ? -1 : 0;
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z6) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int i3, Period period, Window window, int i9, boolean z6) {
        int i10 = getPeriod(i3, period).windowIndex;
        if (getWindow(i10, window).lastPeriodIndex != i3) {
            return i3 + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i10, i9, z6);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, window).firstPeriodIndex;
    }

    public int getNextWindowIndex(int i3, int i9, boolean z6) {
        if (i9 == 0) {
            if (i3 == getLastWindowIndex(z6)) {
                return -1;
            }
            return i3 + 1;
        }
        if (i9 == 1) {
            return i3;
        }
        if (i9 == 2) {
            return i3 == getLastWindowIndex(z6) ? getFirstWindowIndex(z6) : i3 + 1;
        }
        throw new IllegalStateException();
    }

    public final Period getPeriod(int i3, Period period) {
        return getPeriod(i3, period, false);
    }

    public abstract Period getPeriod(int i3, Period period, boolean z6);

    public Period getPeriodByUid(Object obj, Period period) {
        return getPeriod(getIndexOfPeriod(obj), period, true);
    }

    public abstract int getPeriodCount();

    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i3, long j) {
        return getPeriodPositionUs(window, period, i3, j);
    }

    public final Pair<Object, Long> getPeriodPositionUs(Window window, Period period, int i3, long j) {
        Pair<Object, Long> periodPositionUs = getPeriodPositionUs(window, period, i3, j, 0L);
        periodPositionUs.getClass();
        return periodPositionUs;
    }

    public int getPreviousWindowIndex(int i3, int i9, boolean z6) {
        if (i9 == 0) {
            if (i3 == getFirstWindowIndex(z6)) {
                return -1;
            }
            return i3 - 1;
        }
        if (i9 == 1) {
            return i3;
        }
        if (i9 == 2) {
            return i3 == getFirstWindowIndex(z6) ? getLastWindowIndex(z6) : i3 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object getUidOfPeriod(int i3);

    public final Window getWindow(int i3, Window window) {
        return getWindow(i3, window, 0L);
    }

    public abstract Window getWindow(int i3, Window window, long j);

    public abstract int getWindowCount();

    public int hashCode() {
        Window window = new Window();
        Period period = new Period();
        int windowCount = getWindowCount() + 217;
        for (int i3 = 0; i3 < getWindowCount(); i3++) {
            windowCount = (windowCount * 31) + getWindow(i3, window).hashCode();
        }
        int periodCount = getPeriodCount() + (windowCount * 31);
        for (int i9 = 0; i9 < getPeriodCount(); i9++) {
            periodCount = (periodCount * 31) + getPeriod(i9, period, true).hashCode();
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        while (firstWindowIndex != -1) {
            periodCount = (periodCount * 31) + firstWindowIndex;
            firstWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
        }
        return periodCount;
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public final boolean isLastPeriod(int i3, Period period, Window window, int i9, boolean z6) {
        return getNextPeriodIndex(i3, period, window, i9, z6) == -1;
    }

    @Deprecated
    public final Bundle toBundle() {
        return toBundle(9);
    }

    public static Timeline fromBundle(Bundle bundle, final int i3) {
        final int i9 = 0;
        AbstractC2186b0 abstractC2186b0FromBundleListRetriever = fromBundleListRetriever(new p068h4.j() {
            @Override
            public final Object apply(Object obj) {
                switch (i9) {
                    case 0:
                        return Timeline.lambda$fromBundle$0(i3, (Bundle) obj);
                    default:
                        return Timeline.lambda$fromBundle$1(i3, (Bundle) obj);
                }
            }
        }, bundle.getBinder(FIELD_WINDOWS));
        final int i10 = 1;
        AbstractC2186b0 abstractC2186b0FromBundleListRetriever2 = fromBundleListRetriever(new p068h4.j() {
            @Override
            public final Object apply(Object obj) {
                switch (i10) {
                    case 0:
                        return Timeline.lambda$fromBundle$0(i3, (Bundle) obj);
                    default:
                        return Timeline.lambda$fromBundle$1(i3, (Bundle) obj);
                }
            }
        }, bundle.getBinder(FIELD_PERIODS));
        int[] intArray = bundle.getIntArray(FIELD_SHUFFLED_WINDOW_INDICES);
        if (intArray == null) {
            intArray = generateUnshuffledIndices(abstractC2186b0FromBundleListRetriever.size());
        }
        return new RemotableTimeline(abstractC2186b0FromBundleListRetriever, abstractC2186b0FromBundleListRetriever2, intArray);
    }

    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i3, long j, long j9) {
        return getPeriodPositionUs(window, period, i3, j, j9);
    }

    public final Bundle toBundle(int i3) {
        ArrayList arrayList = new ArrayList();
        int windowCount = getWindowCount();
        Window window = new Window();
        for (int i9 = 0; i9 < windowCount; i9++) {
            arrayList.add(getWindow(i9, window, 0L).toBundle(i3));
        }
        ArrayList arrayList2 = new ArrayList();
        int periodCount = getPeriodCount();
        Period period = new Period();
        for (int i10 = 0; i10 < periodCount; i10++) {
            arrayList2.add(getPeriod(i10, period, false).toBundle(i3));
        }
        int[] iArr = new int[windowCount];
        if (windowCount > 0) {
            iArr[0] = getFirstWindowIndex(true);
        }
        for (int i11 = 1; i11 < windowCount; i11++) {
            iArr[i11] = getNextWindowIndex(iArr[i11 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        bundle.putBinder(FIELD_WINDOWS, new BundleListRetriever(arrayList));
        bundle.putBinder(FIELD_PERIODS, new BundleListRetriever(arrayList2));
        bundle.putIntArray(FIELD_SHUFFLED_WINDOW_INDICES, iArr);
        return bundle;
    }

    public final Pair<Object, Long> getPeriodPositionUs(Window window, Period period, int i3, long j, long j9) {
        AbstractC1864o0.R(i3, getWindowCount());
        getWindow(i3, window, j9);
        if (j == C.TIME_UNSET) {
            j = window.getDefaultPositionUs();
            if (j == C.TIME_UNSET) {
                return null;
            }
        }
        int i9 = window.firstPeriodIndex;
        getPeriod(i9, period);
        while (i9 < window.lastPeriodIndex && period.positionInWindowUs != j) {
            int i10 = i9 + 1;
            if (getPeriod(i10, period).positionInWindowUs > j) {
                break;
            }
            i9 = i10;
        }
        getPeriod(i9, period, true);
        long jMin = j - period.positionInWindowUs;
        long j10 = period.durationUs;
        if (j10 != C.TIME_UNSET) {
            jMin = Math.min(jMin, j10 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = period.uid;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }
}
