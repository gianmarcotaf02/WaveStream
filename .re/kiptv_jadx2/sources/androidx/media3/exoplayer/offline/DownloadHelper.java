package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.DefaultRendererCapabilitiesList;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.i;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.BaseTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.SeekMap;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p068h4.v;
import p076i4.AbstractC2186b0;
import p076i4.j1;

public final class DownloadHelper {
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS;

    @Deprecated
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT;
    private static final int MODE_NOT_PREPARE = 0;
    private static final int MODE_PREPARE_NON_PROGRESSIVE_SOURCE_AND_SELECT_TRACKS = 2;
    private static final int MODE_PREPARE_PROGRESSIVE_SOURCE = 1;
    private static final String TAG = "DownloadHelper";
    private boolean areTracksSelected;
    private Callback callback;
    private final Handler callbackHandler;
    private final boolean debugLoggingEnabled;
    private List<ExoTrackSelection>[][] immutableTrackSelectionsByPeriodAndRenderer;
    private boolean isPreparedWithMedia;
    private final MediaItem.LocalConfiguration localConfiguration;
    private MappingTrackSelector.MappedTrackInfo[] mappedTrackInfos;
    private MediaPreparer mediaPreparer;
    private final MediaSource mediaSource;
    private final int mode;
    private final RendererCapabilitiesList rendererCapabilities;
    private final SparseIntArray scratchSet;
    private TrackGroupArray[] trackGroupArrays;
    private List<ExoTrackSelection>[][] trackSelectionsByPeriodAndRenderer;
    private final DefaultTrackSelector trackSelector;
    private final Timeline.Window window;

    public interface Callback {
        void onPrepareError(DownloadHelper downloadHelper, IOException iOException);

        void onPrepared(DownloadHelper downloadHelper, boolean z6);
    }

    public static final class DownloadTrackSelection extends BaseTrackSelection {

        public static final class Factory implements ExoTrackSelection.Factory {
            private Factory() {
            }

            @Override
            public ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
                ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
                for (int i3 = 0; i3 < definitionArr.length; i3++) {
                    ExoTrackSelection.Definition definition = definitionArr[i3];
                    exoTrackSelectionArr[i3] = definition == null ? null : new DownloadTrackSelection(definition.group, definition.tracks);
                }
                return exoTrackSelectionArr;
            }
        }

        public DownloadTrackSelection(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
        }

        @Override
        public int getSelectedIndex() {
            return 0;
        }

        @Override
        public Object getSelectionData() {
            return null;
        }

        @Override
        public int getSelectionReason() {
            return 0;
        }

        @Override
        public void updateSelectedTrack(long j, long j9, long j10, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        }
    }

    public static final class FakeBandwidthMeter implements BandwidthMeter {
        private FakeBandwidthMeter() {
        }

        @Override
        public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        }

        @Override
        public long getBitrateEstimate() {
            return 0L;
        }

        @Override
        public TransferListener getTransferListener() {
            return null;
        }

        @Override
        public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        }
    }

    public static class LiveContentUnsupportedException extends IOException {
    }

    public static final class MediaPreparer implements MediaSource.MediaSourceCaller, ProgressiveMediaSource.Listener, MediaPeriod.Callback, Handler.Callback {
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_FAILED = 2;
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_PREPARED = 1;
        private static final int MESSAGE_CHECK_FOR_FAILURE = 2;
        private static final int MESSAGE_CONTINUE_LOADING = 3;
        private static final int MESSAGE_PREPARE_SOURCE = 1;
        private static final int MESSAGE_RELEASE = 4;
        private final DownloadHelper downloadHelper;
        public MediaPeriod[] mediaPeriods;
        private final MediaSource mediaSource;
        private final Handler mediaSourceHandler;
        private final HandlerThread mediaSourceThread;
        private boolean released;
        public SeekMap seekMap;
        public Timeline timeline;
        private final Allocator allocator = new DefaultAllocator(true, 65536);
        private final ArrayList<MediaPeriod> pendingMediaPeriods = new ArrayList<>();
        private final Handler downloadHelperHandler = Util.createHandlerForCurrentOrMainLooper(new c(0, this));

        public MediaPreparer(MediaSource mediaSource, DownloadHelper downloadHelper) {
            this.mediaSource = mediaSource;
            this.downloadHelper = downloadHelper;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.mediaSourceThread = handlerThread;
            handlerThread.start();
            Handler handlerCreateHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.mediaSourceHandler = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(1);
        }

        public boolean handleDownloadHelperCallbackMessage(Message message) {
            if (this.released) {
                return false;
            }
            int i3 = message.what;
            if (i3 == 1) {
                try {
                    this.downloadHelper.onMediaPrepared();
                } catch (ExoPlaybackException e6) {
                    this.downloadHelperHandler.obtainMessage(2, new IOException(e6)).sendToTarget();
                }
                return true;
            }
            if (i3 != 2) {
                return false;
            }
            release();
            this.downloadHelper.onMediaPreparationFailed((IOException) Util.castNonNull(message.obj));
            return true;
        }

        @Override
        public boolean handleMessage(Message message) {
            int i3 = message.what;
            if (i3 == 1) {
                MediaSource mediaSource = this.mediaSource;
                if (mediaSource instanceof ProgressiveMediaSource) {
                    ((ProgressiveMediaSource) mediaSource).setListener(this);
                }
                this.mediaSource.prepareSource(this, null, PlayerId.UNSET);
                this.mediaSourceHandler.sendEmptyMessage(2);
                return true;
            }
            int i9 = 0;
            if (i3 == 2) {
                try {
                    if (this.mediaPeriods == null) {
                        this.mediaSource.maybeThrowSourceInfoRefreshError();
                    } else {
                        while (i9 < this.pendingMediaPeriods.size()) {
                            this.pendingMediaPeriods.get(i9).maybeThrowPrepareError();
                            i9++;
                        }
                    }
                    this.mediaSourceHandler.sendEmptyMessageDelayed(2, 100L);
                } catch (IOException e6) {
                    this.downloadHelperHandler.obtainMessage(2, e6).sendToTarget();
                }
                return true;
            }
            if (i3 == 3) {
                MediaPeriod mediaPeriod = (MediaPeriod) message.obj;
                if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                    mediaPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(0L).build());
                }
                return true;
            }
            if (i3 != 4) {
                return false;
            }
            MediaPeriod[] mediaPeriodArr = this.mediaPeriods;
            if (mediaPeriodArr != null) {
                int length = mediaPeriodArr.length;
                while (i9 < length) {
                    this.mediaSource.releasePeriod(mediaPeriodArr[i9]);
                    i9++;
                }
            }
            MediaSource mediaSource2 = this.mediaSource;
            if (mediaSource2 instanceof ProgressiveMediaSource) {
                ((ProgressiveMediaSource) mediaSource2).clearListener();
            }
            this.mediaSource.releaseSource(this);
            this.mediaSourceHandler.removeCallbacksAndMessages(null);
            this.mediaSourceThread.quit();
            return true;
        }

        @Override
        public void onPrepared(MediaPeriod mediaPeriod) {
            this.pendingMediaPeriods.remove(mediaPeriod);
            if (this.pendingMediaPeriods.isEmpty()) {
                this.mediaSourceHandler.removeMessages(2);
                this.downloadHelperHandler.sendEmptyMessage(1);
            }
        }

        @Override
        public void onSeekMap(MediaSource mediaSource, SeekMap seekMap) {
            this.seekMap = seekMap;
        }

        @Override
        public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
            MediaPeriod[] mediaPeriodArr;
            if (this.timeline != null) {
                return;
            }
            if (timeline.getWindow(0, new Timeline.Window()).isLive()) {
                this.downloadHelperHandler.obtainMessage(2, new LiveContentUnsupportedException()).sendToTarget();
                return;
            }
            this.timeline = timeline;
            this.mediaPeriods = new MediaPeriod[timeline.getPeriodCount()];
            int i3 = 0;
            while (true) {
                mediaPeriodArr = this.mediaPeriods;
                if (i3 >= mediaPeriodArr.length) {
                    break;
                }
                MediaPeriod mediaPeriodCreatePeriod = this.mediaSource.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(i3)), this.allocator, 0L);
                this.mediaPeriods[i3] = mediaPeriodCreatePeriod;
                this.pendingMediaPeriods.add(mediaPeriodCreatePeriod);
                i3++;
            }
            for (MediaPeriod mediaPeriod : mediaPeriodArr) {
                mediaPeriod.prepare(this, 0L);
            }
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            this.mediaSourceHandler.sendEmptyMessage(4);
        }

        @Override
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                this.mediaSourceHandler.obtainMessage(3, mediaPeriod).sendToTarget();
            }
        }
    }

    public static final class UnreleaseableRendererCapabilitiesList implements RendererCapabilitiesList {
        private final RendererCapabilities[] rendererCapabilities;

        @Override
        public RendererCapabilities[] getRendererCapabilities() {
            return this.rendererCapabilities;
        }

        @Override
        public void release() {
        }

        @Override
        public int size() {
            return this.rendererCapabilities.length;
        }

        private UnreleaseableRendererCapabilitiesList(RendererCapabilities[] rendererCapabilitiesArr) {
            this.rendererCapabilities = rendererCapabilitiesArr;
        }
    }

    static {
        DefaultTrackSelector.Parameters parametersBuild = DefaultTrackSelector.Parameters.DEFAULT.buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
        DEFAULT_TRACK_SELECTOR_PARAMETERS = parametersBuild;
        DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = parametersBuild;
    }

    public DownloadHelper(MediaItem mediaItem, MediaSource mediaSource, TrackSelectionParameters trackSelectionParameters, RendererCapabilitiesList rendererCapabilitiesList) {
        this(mediaItem, mediaSource, trackSelectionParameters, rendererCapabilitiesList, false);
    }

    @RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private void addTrackSelectionInternal(int i3, TrackSelectionParameters trackSelectionParameters) {
        this.trackSelector.setParameters(trackSelectionParameters);
        runTrackSelection(i3);
        j1 j1VarQ = trackSelectionParameters.overrides.values().iterator();
        while (j1VarQ.hasNext()) {
            this.trackSelector.setParameters(trackSelectionParameters.buildUpon().setOverrideForType((TrackSelectionOverride) j1VarQ.next()).build());
            runTrackSelection(i3);
        }
    }

    @EnsuresNonNull({"mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void assertPreparedWithMedia() {
        AbstractC1864o0.Y(this.mode != 0);
        AbstractC1864o0.Y(this.isPreparedWithMedia);
    }

    @EnsuresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void assertPreparedWithNonProgressiveSourceAndTracksSelected() {
        AbstractC1864o0.Y(this.mode == 2);
        AbstractC1864o0.Y(this.isPreparedWithMedia);
        AbstractC1864o0.Y(this.areTracksSelected);
    }

    @EnsuresNonNull({"mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.seekMap", "mediaPreparer.mediaPeriods"})
    private void assertPreparedWithProgressiveSource() {
        AbstractC1864o0.Y(this.mode == 1);
        AbstractC1864o0.Y(this.isPreparedWithMedia);
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory factory) {
        return createMediaSource(downloadRequest, factory, null);
    }

    public static MediaSource createMediaSourceInternal(MediaItem mediaItem, DataSource.Factory factory, DrmSessionManager drmSessionManager, v vVar) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        localConfiguration.getClass();
        MediaSource.Factory factory2 = isProgressive(localConfiguration) ? new ProgressiveMediaSource.Factory(factory) : new DefaultMediaSourceFactory(factory, ExtractorsFactory.EMPTY);
        if (vVar != null) {
            factory2.setDownloadExecutor(vVar);
        }
        if (drmSessionManager != null) {
            factory2.setDrmSessionManagerProvider(new a(drmSessionManager));
        }
        return factory2.createMediaSource(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        localConfiguration.getClass();
        AbstractC1864o0.L(isProgressive(localConfiguration));
        return new Factory().create(mediaItem);
    }

    @Deprecated
    public static DefaultTrackSelector.Parameters getDefaultTrackSelectorParameters(Context context) {
        return DEFAULT_TRACK_SELECTOR_PARAMETERS;
    }

    private DownloadRequest.Builder getDownloadRequestBuilder(String str, byte[] bArr) {
        DownloadRequest.Builder mimeType = new DownloadRequest.Builder(str, this.localConfiguration.uri).setMimeType(this.localConfiguration.mimeType);
        MediaItem.DrmConfiguration drmConfiguration = this.localConfiguration.drmConfiguration;
        DownloadRequest.Builder data = mimeType.setKeySetId(drmConfiguration != null ? drmConfiguration.getKeySetId() : null).setCustomCacheKey(this.localConfiguration.customCacheKey).setData(bArr);
        if (this.mode == 2) {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int length = this.trackSelectionsByPeriodAndRenderer.length;
            for (int i3 = 0; i3 < length; i3++) {
                arrayList2.clear();
                int length2 = this.trackSelectionsByPeriodAndRenderer[i3].length;
                for (int i9 = 0; i9 < length2; i9++) {
                    arrayList2.addAll(this.trackSelectionsByPeriodAndRenderer[i3][i9]);
                }
                arrayList.addAll(this.mediaPreparer.mediaPeriods[i3].getStreamKeys(arrayList2));
            }
            data.setStreamKeys(arrayList);
        }
        return data;
    }

    public static boolean isProgressive(MediaItem.LocalConfiguration localConfiguration) {
        return Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType) == 4;
    }

    public static DrmSessionManager lambda$createMediaSourceInternal$4(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
        return drmSessionManager;
    }

    public static void lambda$new$0() {
    }

    public void lambda$onMediaPreparationFailed$3(IOException iOException) {
        Callback callback = this.callback;
        callback.getClass();
        callback.onPrepareError(this, iOException);
    }

    public void lambda$onMediaPrepared$2(boolean z6) {
        Callback callback = this.callback;
        callback.getClass();
        callback.onPrepared(this, z6);
    }

    public void lambda$prepare$1(Callback callback) {
        callback.onPrepared(this, false);
    }

    private static void logTrackSelectorResult(int i3, TrackSelectorResult trackSelectorResult) {
        Log.d(TAG, "Track selections changed, period index: " + i3 + ", tracks [");
        AbstractC2186b0 groups = trackSelectorResult.tracks.getGroups();
        for (int i9 = 0; i9 < groups.size(); i9++) {
            Tracks.Group group = (Tracks.Group) groups.get(i9);
            Log.d(TAG, "  group [");
            for (int i10 = 0; i10 < group.length; i10++) {
                String str = group.isTrackSelected(i10) ? "[X]" : "[ ]";
                Log.d(TAG, "    " + str + " Track:" + i10 + ", " + Format.toLogString(group.getTrackFormat(i10)) + ", supported=" + Util.getFormatSupportString(group.getTrackSupport(i10)));
            }
            Log.d(TAG, "  ]");
        }
        Log.d(TAG, "]");
    }

    public void onMediaPreparationFailed(IOException iOException) {
        Handler handler = this.callbackHandler;
        handler.getClass();
        handler.post(new e(this, iOException, 1));
    }

    public void onMediaPrepared() {
        this.mediaPreparer.getClass();
        this.mediaPreparer.mediaPeriods.getClass();
        this.mediaPreparer.timeline.getClass();
        int i3 = this.mode;
        boolean z6 = true;
        if (i3 == 2) {
            int length = this.mediaPreparer.mediaPeriods.length;
            int size = this.rendererCapabilities.size();
            this.trackSelectionsByPeriodAndRenderer = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
            this.immutableTrackSelectionsByPeriodAndRenderer = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
            for (int i9 = 0; i9 < length; i9++) {
                for (int i10 = 0; i10 < size; i10++) {
                    this.trackSelectionsByPeriodAndRenderer[i9][i10] = new ArrayList();
                    this.immutableTrackSelectionsByPeriodAndRenderer[i9][i10] = Collections.unmodifiableList(this.trackSelectionsByPeriodAndRenderer[i9][i10]);
                }
            }
            this.trackGroupArrays = new TrackGroupArray[length];
            this.mappedTrackInfos = new MappingTrackSelector.MappedTrackInfo[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.trackGroupArrays[i11] = this.mediaPreparer.mediaPeriods[i11].getTrackGroups();
                this.trackSelector.onSelectionActivated(runTrackSelection(i11).info);
                MappingTrackSelector.MappedTrackInfo[] mappedTrackInfoArr = this.mappedTrackInfos;
                MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = this.trackSelector.getCurrentMappedTrackInfo();
                currentMappedTrackInfo.getClass();
                mappedTrackInfoArr[i11] = currentMappedTrackInfo;
            }
            setPreparedWithNonProgressiveSourceAndTracksSelected();
        } else {
            AbstractC1864o0.Y(i3 == 1);
            this.mediaPreparer.seekMap.getClass();
            setPreparedWithProgressiveSource();
            z6 = false;
        }
        Handler handler = this.callbackHandler;
        handler.getClass();
        handler.post(new i(1, this, z6));
    }

    private void populateDownloadRequestBuilderWithByteRange(DownloadRequest.Builder builder, long j, long j9) {
        long jMsToUs;
        assertPreparedWithProgressiveSource();
        Timeline timeline = this.mediaPreparer.timeline;
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        long jLongValue = ((Long) timeline.getPeriodPositionUs(window, period, 0, Util.msToUs(j)).second).longValue();
        if (j9 != C.TIME_UNSET) {
            jMsToUs = Util.msToUs(j9) + jLongValue;
            long j10 = period.durationUs;
            if (j10 != C.TIME_UNSET) {
                jMsToUs = Math.min(jMsToUs, j10 - 1);
            }
        } else {
            jMsToUs = -9223372036854775807L;
        }
        SeekMap seekMap = this.mediaPreparer.seekMap;
        if (!seekMap.isSeekable()) {
            Log.w(TAG, "Cannot set download byte range for progressive stream that is unseekable");
            return;
        }
        long j11 = seekMap.getSeekPoints(jLongValue).first.position;
        long j12 = -1;
        if (jMsToUs != C.TIME_UNSET) {
            long j13 = seekMap.getSeekPoints(jMsToUs).second.position;
            if (jLongValue == jMsToUs || j11 != j13) {
                j12 = j13 - j11;
            }
        }
        builder.setByteRange(j11, j12);
    }

    private void populateDownloadRequestBuilderWithDownloadRange(DownloadRequest.Builder builder, long j, long j9) {
        int i3 = this.mode;
        if (i3 == 1) {
            populateDownloadRequestBuilderWithByteRange(builder, j, j9);
        } else {
            if (i3 != 2) {
                return;
            }
            populateDownloadRequestBuilderWithTimeRange(builder, j, j9);
        }
    }

    private void populateDownloadRequestBuilderWithTimeRange(DownloadRequest.Builder builder, long j, long j9) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        Timeline.Window window = this.mediaPreparer.timeline.getWindow(0, new Timeline.Window());
        long defaultPositionUs = j == C.TIME_UNSET ? window.getDefaultPositionUs() : Util.msToUs(j);
        long durationUs = window.getDurationUs();
        long jMsToUs = j9 == C.TIME_UNSET ? durationUs : Util.msToUs(j9);
        if (durationUs != C.TIME_UNSET) {
            defaultPositionUs = Math.min(defaultPositionUs, durationUs);
            jMsToUs = Math.min(jMsToUs, durationUs - defaultPositionUs);
        }
        builder.setTimeRange(defaultPositionUs, jMsToUs);
    }

    @RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private TrackSelectorResult runTrackSelection(int i3) {
        TrackSelectorResult trackSelectorResultSelectTracks = this.trackSelector.selectTracks(this.rendererCapabilities.getRendererCapabilities(), this.trackGroupArrays[i3], new MediaSource.MediaPeriodId(this.mediaPreparer.timeline.getUidOfPeriod(i3)), this.mediaPreparer.timeline);
        for (int i9 = 0; i9 < trackSelectorResultSelectTracks.length; i9++) {
            ExoTrackSelection exoTrackSelection = trackSelectorResultSelectTracks.selections[i9];
            if (exoTrackSelection != null) {
                List<ExoTrackSelection> list = this.trackSelectionsByPeriodAndRenderer[i3][i9];
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        list.add(exoTrackSelection);
                        break;
                    }
                    ExoTrackSelection exoTrackSelection2 = list.get(i10);
                    if (exoTrackSelection2.getTrackGroup().equals(exoTrackSelection.getTrackGroup())) {
                        this.scratchSet.clear();
                        for (int i11 = 0; i11 < exoTrackSelection2.length(); i11++) {
                            this.scratchSet.put(exoTrackSelection2.getIndexInTrackGroup(i11), 0);
                        }
                        for (int i12 = 0; i12 < exoTrackSelection.length(); i12++) {
                            this.scratchSet.put(exoTrackSelection.getIndexInTrackGroup(i12), 0);
                        }
                        int[] iArr = new int[this.scratchSet.size()];
                        for (int i13 = 0; i13 < this.scratchSet.size(); i13++) {
                            iArr[i13] = this.scratchSet.keyAt(i13);
                        }
                        list.set(i10, new DownloadTrackSelection(exoTrackSelection2.getTrackGroup(), iArr));
                        break;
                    }
                    i10++;
                }
            }
        }
        if (this.debugLoggingEnabled) {
            logTrackSelectorResult(i3, trackSelectorResultSelectTracks);
        }
        return trackSelectorResultSelectTracks;
    }

    @RequiresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void setPreparedWithNonProgressiveSourceAndTracksSelected() {
        this.isPreparedWithMedia = true;
        this.areTracksSelected = true;
    }

    @RequiresNonNull({"mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.seekMap", "mediaPreparer.mediaPeriods"})
    private void setPreparedWithProgressiveSource() {
        this.isPreparedWithMedia = true;
    }

    public void addAudioLanguagesToSelection(String... strArr) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS.buildUpon();
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (RendererCapabilities rendererCapabilities : this.rendererCapabilities.getRendererCapabilities()) {
                int trackType = rendererCapabilities.getTrackType();
                builderBuildUpon.setTrackTypeDisabled(trackType, trackType != 1);
            }
            int periodCount = getPeriodCount();
            for (String str : strArr) {
                TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.setPreferredAudioLanguage(str).build();
                for (int i3 = 0; i3 < periodCount; i3++) {
                    addTrackSelectionInternal(i3, trackSelectionParametersBuild);
                }
            }
        } catch (ExoPlaybackException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public void addTextLanguagesToSelection(boolean z6, String... strArr) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS.buildUpon();
            builderBuildUpon.setSelectUndeterminedTextLanguage(z6);
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (RendererCapabilities rendererCapabilities : this.rendererCapabilities.getRendererCapabilities()) {
                int trackType = rendererCapabilities.getTrackType();
                builderBuildUpon.setTrackTypeDisabled(trackType, trackType != 3);
            }
            int periodCount = getPeriodCount();
            for (String str : strArr) {
                TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.setPreferredTextLanguage(str).build();
                for (int i3 = 0; i3 < periodCount; i3++) {
                    addTrackSelectionInternal(i3, trackSelectionParametersBuild);
                }
            }
        } catch (ExoPlaybackException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public void addTrackSelection(int i3, TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            addTrackSelectionInternal(i3, trackSelectionParameters);
        } catch (ExoPlaybackException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public void addTrackSelectionForSingleRenderer(int i3, int i9, DefaultTrackSelector.Parameters parameters, List<DefaultTrackSelector.SelectionOverride> list) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = parameters.buildUpon();
            int i10 = 0;
            while (i10 < this.mappedTrackInfos[i3].getRendererCount()) {
                builderBuildUpon.setRendererDisabled(i10, i10 != i9);
                i10++;
            }
            if (list.isEmpty()) {
                addTrackSelectionInternal(i3, builderBuildUpon.build());
                return;
            }
            TrackGroupArray trackGroups = this.mappedTrackInfos[i3].getTrackGroups(i9);
            for (int i11 = 0; i11 < list.size(); i11++) {
                builderBuildUpon.setSelectionOverride(i9, trackGroups, list.get(i11));
                addTrackSelectionInternal(i3, builderBuildUpon.build());
            }
        } catch (ExoPlaybackException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public void clearTrackSelections(int i3) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        for (int i9 = 0; i9 < this.rendererCapabilities.size(); i9++) {
            this.trackSelectionsByPeriodAndRenderer[i3][i9].clear();
        }
    }

    public DownloadRequest getDownloadRequest(byte[] bArr) {
        return getDownloadRequest(this.localConfiguration.uri.toString(), bArr);
    }

    public Object getManifest() {
        if (this.mode == 0) {
            return null;
        }
        assertPreparedWithMedia();
        if (this.mediaPreparer.timeline.getWindowCount() > 0) {
            return this.mediaPreparer.timeline.getWindow(0, this.window).manifest;
        }
        return null;
    }

    public MappingTrackSelector.MappedTrackInfo getMappedTrackInfo(int i3) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        return this.mappedTrackInfos[i3];
    }

    public int getPeriodCount() {
        if (this.mode == 0) {
            return 0;
        }
        assertPreparedWithMedia();
        return this.mediaPreparer.mediaPeriods.length;
    }

    public TrackGroupArray getTrackGroups(int i3) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        return this.trackGroupArrays[i3];
    }

    public List<ExoTrackSelection> getTrackSelections(int i3, int i9) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        return this.immutableTrackSelectionsByPeriodAndRenderer[i3][i9];
    }

    public Tracks getTracks(int i3) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        return TrackSelectionUtil.buildTracks(this.mappedTrackInfos[i3], this.immutableTrackSelectionsByPeriodAndRenderer[i3]);
    }

    public void prepare(Callback callback) {
        AbstractC1864o0.Y(this.callback == null);
        this.callback = callback;
        if (this.mode == 0) {
            this.callbackHandler.post(new e(this, callback, 2));
            return;
        }
        MediaSource mediaSource = this.mediaSource;
        mediaSource.getClass();
        this.mediaPreparer = new MediaPreparer(mediaSource, this);
    }

    public void release() {
        MediaPreparer mediaPreparer = this.mediaPreparer;
        if (mediaPreparer != null) {
            mediaPreparer.release();
        }
        this.trackSelector.release();
        this.rendererCapabilities.release();
    }

    public void replaceTrackSelections(int i3, TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            clearTrackSelections(i3);
            addTrackSelectionInternal(i3, trackSelectionParameters);
        } catch (ExoPlaybackException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public DownloadHelper(MediaItem mediaItem, MediaSource mediaSource, TrackSelectionParameters trackSelectionParameters, RendererCapabilitiesList rendererCapabilitiesList, boolean z6) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        localConfiguration.getClass();
        this.localConfiguration = localConfiguration;
        this.mediaSource = mediaSource;
        this.mode = mediaSource == null ? 0 : mediaSource instanceof ProgressiveMediaSource ? 1 : 2;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(trackSelectionParameters, new DownloadTrackSelection.Factory());
        this.trackSelector = defaultTrackSelector;
        this.rendererCapabilities = rendererCapabilitiesList;
        this.debugLoggingEnabled = z6;
        this.scratchSet = new SparseIntArray();
        defaultTrackSelector.init(new b(), new FakeBandwidthMeter());
        this.callbackHandler = Util.createHandlerForCurrentOrMainLooper();
        this.window = new Timeline.Window();
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory factory, DrmSessionManager drmSessionManager) {
        return createMediaSourceInternal(downloadRequest.toMediaItem(), factory, drmSessionManager, null);
    }

    public DownloadRequest getDownloadRequest(byte[] bArr, long j, long j9) {
        return getDownloadRequest(this.localConfiguration.uri.toString(), bArr, j, j9);
    }

    public DownloadRequest getDownloadRequest(String str, byte[] bArr) {
        return getDownloadRequestBuilder(str, bArr).build();
    }

    public DownloadRequest getDownloadRequest(String str, byte[] bArr, long j, long j9) {
        DownloadRequest.Builder downloadRequestBuilder = getDownloadRequestBuilder(str, bArr);
        assertPreparedWithMedia();
        populateDownloadRequestBuilderWithDownloadRange(downloadRequestBuilder, j, j9);
        return downloadRequestBuilder.build();
    }

    @Deprecated
    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, DataSource.Factory factory) {
        return new Factory().setDataSourceFactory(factory).create(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, DataSource.Factory factory, boolean z6) {
        return new Factory().setDataSourceFactory(factory).setDebugLoggingEnabled(z6).create(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, RenderersFactory renderersFactory, DataSource.Factory factory) {
        return new Factory().setDataSourceFactory(factory).setRenderersFactory(renderersFactory).create(mediaItem);
    }

    public static final class Factory {
        private DataSource.Factory dataSourceFactory;
        private boolean debugLoggingEnabled;
        private DrmSessionManager drmSessionManager;
        private RenderersFactory renderersFactory;
        private TrackSelectionParameters trackSelectionParameters = DownloadHelper.DEFAULT_TRACK_SELECTOR_PARAMETERS;
        private v loadExecutorSupplier = null;

        public DownloadHelper create(MediaItem mediaItem) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            localConfiguration.getClass();
            boolean zIsProgressive = DownloadHelper.isProgressive(localConfiguration);
            AbstractC1864o0.L(zIsProgressive || this.dataSourceFactory != null);
            MediaSource mediaSourceCreateMediaSourceInternal = (zIsProgressive && this.dataSourceFactory == null) ? null : DownloadHelper.createMediaSourceInternal(mediaItem, (DataSource.Factory) Util.castNonNull(this.dataSourceFactory), this.drmSessionManager, this.loadExecutorSupplier);
            TrackSelectionParameters trackSelectionParameters = this.trackSelectionParameters;
            RenderersFactory renderersFactory = this.renderersFactory;
            return new DownloadHelper(mediaItem, mediaSourceCreateMediaSourceInternal, trackSelectionParameters, renderersFactory != null ? new DefaultRendererCapabilitiesList.Factory(renderersFactory).createRendererCapabilitiesList() : new UnreleaseableRendererCapabilitiesList(new RendererCapabilities[0]), this.debugLoggingEnabled);
        }

        public Factory setDataSourceFactory(DataSource.Factory factory) {
            this.dataSourceFactory = factory;
            return this;
        }

        public Factory setDebugLoggingEnabled(boolean z6) {
            this.debugLoggingEnabled = z6;
            return this;
        }

        public Factory setDrmSessionManager(DrmSessionManager drmSessionManager) {
            this.drmSessionManager = drmSessionManager;
            return this;
        }

        public Factory setLoadExecutor(v vVar) {
            this.loadExecutorSupplier = vVar;
            return this;
        }

        public Factory setRenderersFactory(RenderersFactory renderersFactory) {
            this.renderersFactory = renderersFactory;
            return this;
        }

        public Factory setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
            this.trackSelectionParameters = trackSelectionParameters;
            return this;
        }

        public DownloadHelper create(MediaSource mediaSource) {
            RendererCapabilitiesList unreleaseableRendererCapabilitiesList;
            MediaItem mediaItem = mediaSource.getMediaItem();
            TrackSelectionParameters trackSelectionParameters = this.trackSelectionParameters;
            RenderersFactory renderersFactory = this.renderersFactory;
            if (renderersFactory != null) {
                unreleaseableRendererCapabilitiesList = new DefaultRendererCapabilitiesList.Factory(renderersFactory).createRendererCapabilitiesList();
            } else {
                unreleaseableRendererCapabilitiesList = new UnreleaseableRendererCapabilitiesList(new RendererCapabilities[0]);
            }
            return new DownloadHelper(mediaItem, mediaSource, trackSelectionParameters, unreleaseableRendererCapabilitiesList, this.debugLoggingEnabled);
        }
    }

    @Deprecated
    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, RenderersFactory renderersFactory, DataSource.Factory factory, boolean z6) {
        return new Factory().setDataSourceFactory(factory).setRenderersFactory(renderersFactory).setDebugLoggingEnabled(z6).create(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, RenderersFactory renderersFactory, DataSource.Factory factory) {
        return new Factory().setDataSourceFactory(factory).setTrackSelectionParameters(trackSelectionParameters).setRenderersFactory(renderersFactory).create(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, RenderersFactory renderersFactory, DataSource.Factory factory, boolean z6) {
        return new Factory().setDataSourceFactory(factory).setTrackSelectionParameters(trackSelectionParameters).setRenderersFactory(renderersFactory).setDebugLoggingEnabled(z6).create(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, RenderersFactory renderersFactory, DataSource.Factory factory, DrmSessionManager drmSessionManager) {
        return new Factory().setDataSourceFactory(factory).setTrackSelectionParameters(trackSelectionParameters).setRenderersFactory(renderersFactory).setDrmSessionManager(drmSessionManager).create(mediaItem);
    }

    @Deprecated
    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, RenderersFactory renderersFactory, DataSource.Factory factory, DrmSessionManager drmSessionManager, boolean z6) {
        return new Factory().setDataSourceFactory(factory).setTrackSelectionParameters(trackSelectionParameters).setRenderersFactory(renderersFactory).setDrmSessionManager(drmSessionManager).setDebugLoggingEnabled(z6).create(mediaItem);
    }
}
