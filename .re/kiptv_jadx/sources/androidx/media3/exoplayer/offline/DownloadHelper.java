package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadHelper {
    public static final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS;

    @java.lang.Deprecated
    public static final androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT;
    private static final int MODE_NOT_PREPARE = 0;
    private static final int MODE_PREPARE_NON_PROGRESSIVE_SOURCE_AND_SELECT_TRACKS = 2;
    private static final int MODE_PREPARE_PROGRESSIVE_SOURCE = 1;
    private static final java.lang.String TAG = "DownloadHelper";
    private boolean areTracksSelected;
    private androidx.media3.exoplayer.offline.DownloadHelper.Callback callback;
    private final android.os.Handler callbackHandler;
    private final boolean debugLoggingEnabled;
    private java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection>[][] immutableTrackSelectionsByPeriodAndRenderer;
    private boolean isPreparedWithMedia;
    private final androidx.media3.common.MediaItem.LocalConfiguration localConfiguration;
    private androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo[] mappedTrackInfos;
    private androidx.media3.exoplayer.offline.DownloadHelper.MediaPreparer mediaPreparer;
    private final androidx.media3.exoplayer.source.MediaSource mediaSource;
    private final int mode;
    private final androidx.media3.exoplayer.RendererCapabilitiesList rendererCapabilities;
    private final android.util.SparseIntArray scratchSet;
    private androidx.media3.exoplayer.source.TrackGroupArray[] trackGroupArrays;
    private java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection>[][] trackSelectionsByPeriodAndRenderer;
    private final androidx.media3.exoplayer.trackselection.DefaultTrackSelector trackSelector;
    private final androidx.media3.common.Timeline.Window window;

    public interface Callback {
        void onPrepareError(androidx.media3.exoplayer.offline.DownloadHelper downloadHelper, java.io.IOException iOException);

        void onPrepared(androidx.media3.exoplayer.offline.DownloadHelper downloadHelper, boolean z6);
    }

    public static final class DownloadTrackSelection extends androidx.media3.exoplayer.trackselection.BaseTrackSelection {

        public static final class Factory implements androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory {
            private Factory() {
            }

            @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory
            public androidx.media3.exoplayer.trackselection.ExoTrackSelection[] createTrackSelections(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline) {
                androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr = new androidx.media3.exoplayer.trackselection.ExoTrackSelection[definitionArr.length];
                for (int i3 = 0; i3 < definitionArr.length; i3++) {
                    androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition definition = definitionArr[i3];
                    exoTrackSelectionArr[i3] = definition == null ? null : new androidx.media3.exoplayer.offline.DownloadHelper.DownloadTrackSelection(definition.group, definition.tracks);
                }
                return exoTrackSelectionArr;
            }
        }

        public DownloadTrackSelection(androidx.media3.common.TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public java.lang.Object getSelectionData() {
            return null;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j, long j9, long j10, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list, androidx.media3.exoplayer.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr) {
        }
    }

    public static final class FakeBandwidthMeter implements androidx.media3.exoplayer.upstream.BandwidthMeter {
        private FakeBandwidthMeter() {
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public void addEventListener(android.os.Handler handler, androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener) {
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public long getBitrateEstimate() {
            return 0L;
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public androidx.media3.datasource.TransferListener getTransferListener() {
            return null;
        }

        @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
        public void removeEventListener(androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener) {
        }
    }

    public static class LiveContentUnsupportedException extends java.io.IOException {
    }

    public static final class MediaPreparer implements androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller, androidx.media3.exoplayer.source.ProgressiveMediaSource.Listener, androidx.media3.exoplayer.source.MediaPeriod.Callback, android.os.Handler.Callback {
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_FAILED = 2;
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_PREPARED = 1;
        private static final int MESSAGE_CHECK_FOR_FAILURE = 2;
        private static final int MESSAGE_CONTINUE_LOADING = 3;
        private static final int MESSAGE_PREPARE_SOURCE = 1;
        private static final int MESSAGE_RELEASE = 4;
        private final androidx.media3.exoplayer.offline.DownloadHelper downloadHelper;
        public androidx.media3.exoplayer.source.MediaPeriod[] mediaPeriods;
        private final androidx.media3.exoplayer.source.MediaSource mediaSource;
        private final android.os.Handler mediaSourceHandler;
        private final android.os.HandlerThread mediaSourceThread;
        private boolean released;
        public androidx.media3.extractor.SeekMap seekMap;
        public androidx.media3.common.Timeline timeline;
        private final androidx.media3.exoplayer.upstream.Allocator allocator = new androidx.media3.exoplayer.upstream.DefaultAllocator(true, 65536);
        private final java.util.ArrayList<androidx.media3.exoplayer.source.MediaPeriod> pendingMediaPeriods = new java.util.ArrayList<>();
        private final android.os.Handler downloadHelperHandler = androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper(new androidx.media3.exoplayer.offline.c(0, this));

        public MediaPreparer(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.exoplayer.offline.DownloadHelper downloadHelper) {
            this.mediaSource = mediaSource;
            this.downloadHelper = downloadHelper;
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:DownloadHelper");
            this.mediaSourceThread = handlerThread;
            handlerThread.start();
            android.os.Handler handlerCreateHandler = androidx.media3.common.util.Util.createHandler(handlerThread.getLooper(), this);
            this.mediaSourceHandler = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean handleDownloadHelperCallbackMessage(android.os.Message message) {
            if (this.released) {
                return false;
            }
            int i3 = message.what;
            if (i3 == 1) {
                try {
                    this.downloadHelper.onMediaPrepared();
                } catch (androidx.media3.exoplayer.ExoPlaybackException e6) {
                    this.downloadHelperHandler.obtainMessage(2, new java.io.IOException(e6)).sendToTarget();
                }
                return true;
            }
            if (i3 != 2) {
                return false;
            }
            release();
            this.downloadHelper.onMediaPreparationFailed((java.io.IOException) androidx.media3.common.util.Util.castNonNull(message.obj));
            return true;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i3 = message.what;
            if (i3 == 1) {
                androidx.media3.exoplayer.source.MediaSource mediaSource = this.mediaSource;
                if (mediaSource instanceof androidx.media3.exoplayer.source.ProgressiveMediaSource) {
                    ((androidx.media3.exoplayer.source.ProgressiveMediaSource) mediaSource).setListener(this);
                }
                this.mediaSource.prepareSource(this, null, androidx.media3.exoplayer.analytics.PlayerId.UNSET);
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
                } catch (java.io.IOException e6) {
                    this.downloadHelperHandler.obtainMessage(2, e6).sendToTarget();
                }
                return true;
            }
            if (i3 == 3) {
                androidx.media3.exoplayer.source.MediaPeriod mediaPeriod = (androidx.media3.exoplayer.source.MediaPeriod) message.obj;
                if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                    mediaPeriod.continueLoading(new androidx.media3.exoplayer.LoadingInfo.Builder().setPlaybackPositionUs(0L).build());
                }
                return true;
            }
            if (i3 != 4) {
                return false;
            }
            androidx.media3.exoplayer.source.MediaPeriod[] mediaPeriodArr = this.mediaPeriods;
            if (mediaPeriodArr != null) {
                int length = mediaPeriodArr.length;
                while (i9 < length) {
                    this.mediaSource.releasePeriod(mediaPeriodArr[i9]);
                    i9++;
                }
            }
            androidx.media3.exoplayer.source.MediaSource mediaSource2 = this.mediaSource;
            if (mediaSource2 instanceof androidx.media3.exoplayer.source.ProgressiveMediaSource) {
                ((androidx.media3.exoplayer.source.ProgressiveMediaSource) mediaSource2).clearListener();
            }
            this.mediaSource.releaseSource(this);
            this.mediaSourceHandler.removeCallbacksAndMessages(null);
            this.mediaSourceThread.quit();
            return true;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
            this.pendingMediaPeriods.remove(mediaPeriod);
            if (this.pendingMediaPeriods.isEmpty()) {
                this.mediaSourceHandler.removeMessages(2);
                this.downloadHelperHandler.sendEmptyMessage(1);
            }
        }

        @Override // androidx.media3.exoplayer.source.ProgressiveMediaSource.Listener
        public void onSeekMap(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.extractor.SeekMap seekMap) {
            this.seekMap = seekMap;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
        public void onSourceInfoRefreshed(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline) {
            androidx.media3.exoplayer.source.MediaPeriod[] mediaPeriodArr;
            if (this.timeline != null) {
                return;
            }
            if (timeline.getWindow(0, new androidx.media3.common.Timeline.Window()).isLive()) {
                this.downloadHelperHandler.obtainMessage(2, new androidx.media3.exoplayer.offline.DownloadHelper.LiveContentUnsupportedException()).sendToTarget();
                return;
            }
            this.timeline = timeline;
            this.mediaPeriods = new androidx.media3.exoplayer.source.MediaPeriod[timeline.getPeriodCount()];
            int i3 = 0;
            while (true) {
                mediaPeriodArr = this.mediaPeriods;
                if (i3 >= mediaPeriodArr.length) {
                    break;
                }
                androidx.media3.exoplayer.source.MediaPeriod mediaPeriodCreatePeriod = this.mediaSource.createPeriod(new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(timeline.getUidOfPeriod(i3)), this.allocator, 0L);
                this.mediaPeriods[i3] = mediaPeriodCreatePeriod;
                this.pendingMediaPeriods.add(mediaPeriodCreatePeriod);
                i3++;
            }
            for (androidx.media3.exoplayer.source.MediaPeriod mediaPeriod : mediaPeriodArr) {
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

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
            if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                this.mediaSourceHandler.obtainMessage(3, mediaPeriod).sendToTarget();
            }
        }
    }

    public static final class UnreleaseableRendererCapabilitiesList implements androidx.media3.exoplayer.RendererCapabilitiesList {
        private final androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilities;

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList
        public androidx.media3.exoplayer.RendererCapabilities[] getRendererCapabilities() {
            return this.rendererCapabilities;
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList
        public void release() {
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList
        public int size() {
            return this.rendererCapabilities.length;
        }

        private UnreleaseableRendererCapabilitiesList(androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr) {
            this.rendererCapabilities = rendererCapabilitiesArr;
        }
    }

    static {
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parametersBuild = androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.DEFAULT.buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
        DEFAULT_TRACK_SELECTOR_PARAMETERS = parametersBuild;
        DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = parametersBuild;
    }

    public DownloadHelper(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.RendererCapabilitiesList rendererCapabilitiesList) {
        this(mediaItem, mediaSource, trackSelectionParameters, rendererCapabilitiesList, false);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private void addTrackSelectionInternal(int i3, androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        this.trackSelector.setParameters(trackSelectionParameters);
        runTrackSelection(i3);
        p076i4.j1 j1VarQ = trackSelectionParameters.overrides.values().iterator();
        while (j1VarQ.hasNext()) {
            this.trackSelector.setParameters(trackSelectionParameters.buildUpon().setOverrideForType((androidx.media3.common.TrackSelectionOverride) j1VarQ.next()).build());
            runTrackSelection(i3);
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void assertPreparedWithMedia() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.mode != 0);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.isPreparedWithMedia);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void assertPreparedWithNonProgressiveSourceAndTracksSelected() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.mode == 2);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.isPreparedWithMedia);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.areTracksSelected);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.seekMap", "mediaPreparer.mediaPeriods"})
    private void assertPreparedWithProgressiveSource() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.mode == 1);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.isPreparedWithMedia);
    }

    public static androidx.media3.exoplayer.source.MediaSource createMediaSource(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, androidx.media3.datasource.DataSource.Factory factory) {
        return createMediaSource(downloadRequest, factory, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.exoplayer.source.MediaSource createMediaSourceInternal(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.DataSource.Factory factory, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, p068h4.v vVar) {
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        localConfiguration.getClass();
        androidx.media3.exoplayer.source.MediaSource.Factory factory2 = isProgressive(localConfiguration) ? new androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory(factory) : new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(factory, androidx.media3.extractor.ExtractorsFactory.EMPTY);
        if (vVar != null) {
            factory2.setDownloadExecutor(vVar);
        }
        if (drmSessionManager != null) {
            factory2.setDrmSessionManagerProvider(new androidx.media3.exoplayer.offline.a(drmSessionManager));
        }
        return factory2.createMediaSource(mediaItem);
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.offline.DownloadHelper forMediaItem(android.content.Context context, androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        localConfiguration.getClass();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(isProgressive(localConfiguration));
        return new androidx.media3.exoplayer.offline.DownloadHelper.Factory().create(mediaItem);
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters getDefaultTrackSelectorParameters(android.content.Context context) {
        return DEFAULT_TRACK_SELECTOR_PARAMETERS;
    }

    private androidx.media3.exoplayer.offline.DownloadRequest.Builder getDownloadRequestBuilder(java.lang.String str, byte[] bArr) {
        androidx.media3.exoplayer.offline.DownloadRequest.Builder mimeType = new androidx.media3.exoplayer.offline.DownloadRequest.Builder(str, this.localConfiguration.uri).setMimeType(this.localConfiguration.mimeType);
        androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration = this.localConfiguration.drmConfiguration;
        androidx.media3.exoplayer.offline.DownloadRequest.Builder data = mimeType.setKeySetId(drmConfiguration != null ? drmConfiguration.getKeySetId() : null).setCustomCacheKey(this.localConfiguration.customCacheKey).setData(bArr);
        if (this.mode == 2) {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isProgressive(androidx.media3.common.MediaItem.LocalConfiguration localConfiguration) {
        return androidx.media3.common.util.Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType) == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.media3.exoplayer.drm.DrmSessionManager lambda$createMediaSourceInternal$4(androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.common.MediaItem mediaItem) {
        return drmSessionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onMediaPreparationFailed$3(java.io.IOException iOException) {
        androidx.media3.exoplayer.offline.DownloadHelper.Callback callback = this.callback;
        callback.getClass();
        callback.onPrepareError(this, iOException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onMediaPrepared$2(boolean z6) {
        androidx.media3.exoplayer.offline.DownloadHelper.Callback callback = this.callback;
        callback.getClass();
        callback.onPrepared(this, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$1(androidx.media3.exoplayer.offline.DownloadHelper.Callback callback) {
        callback.onPrepared(this, false);
    }

    private static void logTrackSelectorResult(int i3, androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult) {
        androidx.media3.common.util.Log.d(TAG, "Track selections changed, period index: " + i3 + ", tracks [");
        p076i4.AbstractC2186b0 groups = trackSelectorResult.tracks.getGroups();
        for (int i9 = 0; i9 < groups.size(); i9++) {
            androidx.media3.common.Tracks.Group group = (androidx.media3.common.Tracks.Group) groups.get(i9);
            androidx.media3.common.util.Log.d(TAG, "  group [");
            for (int i10 = 0; i10 < group.length; i10++) {
                java.lang.String str = group.isTrackSelected(i10) ? "[X]" : "[ ]";
                androidx.media3.common.util.Log.d(TAG, "    " + str + " Track:" + i10 + ", " + androidx.media3.common.Format.toLogString(group.getTrackFormat(i10)) + ", supported=" + androidx.media3.common.util.Util.getFormatSupportString(group.getTrackSupport(i10)));
            }
            androidx.media3.common.util.Log.d(TAG, "  ]");
        }
        androidx.media3.common.util.Log.d(TAG, "]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPreparationFailed(java.io.IOException iOException) {
        android.os.Handler handler = this.callbackHandler;
        handler.getClass();
        handler.post(new androidx.media3.exoplayer.offline.e(this, iOException, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPrepared() {
        this.mediaPreparer.getClass();
        this.mediaPreparer.mediaPeriods.getClass();
        this.mediaPreparer.timeline.getClass();
        int i3 = this.mode;
        boolean z6 = true;
        if (i3 == 2) {
            int length = this.mediaPreparer.mediaPeriods.length;
            int size = this.rendererCapabilities.size();
            this.trackSelectionsByPeriodAndRenderer = (java.util.List[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.util.List.class, length, size);
            this.immutableTrackSelectionsByPeriodAndRenderer = (java.util.List[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.util.List.class, length, size);
            for (int i9 = 0; i9 < length; i9++) {
                for (int i10 = 0; i10 < size; i10++) {
                    this.trackSelectionsByPeriodAndRenderer[i9][i10] = new java.util.ArrayList();
                    this.immutableTrackSelectionsByPeriodAndRenderer[i9][i10] = java.util.Collections.unmodifiableList(this.trackSelectionsByPeriodAndRenderer[i9][i10]);
                }
            }
            this.trackGroupArrays = new androidx.media3.exoplayer.source.TrackGroupArray[length];
            this.mappedTrackInfos = new androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.trackGroupArrays[i11] = this.mediaPreparer.mediaPeriods[i11].getTrackGroups();
                this.trackSelector.onSelectionActivated(runTrackSelection(i11).info);
                androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo[] mappedTrackInfoArr = this.mappedTrackInfos;
                androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = this.trackSelector.getCurrentMappedTrackInfo();
                currentMappedTrackInfo.getClass();
                mappedTrackInfoArr[i11] = currentMappedTrackInfo;
            }
            setPreparedWithNonProgressiveSourceAndTracksSelected();
        } else {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(i3 == 1);
            this.mediaPreparer.seekMap.getClass();
            setPreparedWithProgressiveSource();
            z6 = false;
        }
        android.os.Handler handler = this.callbackHandler;
        handler.getClass();
        handler.post(new androidx.media3.exoplayer.audio.i(1, this, z6));
    }

    private void populateDownloadRequestBuilderWithByteRange(androidx.media3.exoplayer.offline.DownloadRequest.Builder builder, long j, long j9) {
        long jMsToUs;
        assertPreparedWithProgressiveSource();
        androidx.media3.common.Timeline timeline = this.mediaPreparer.timeline;
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        long jLongValue = ((java.lang.Long) timeline.getPeriodPositionUs(window, period, 0, androidx.media3.common.util.Util.msToUs(j)).second).longValue();
        if (j9 != androidx.media3.common.C.TIME_UNSET) {
            jMsToUs = androidx.media3.common.util.Util.msToUs(j9) + jLongValue;
            long j10 = period.durationUs;
            if (j10 != androidx.media3.common.C.TIME_UNSET) {
                jMsToUs = java.lang.Math.min(jMsToUs, j10 - 1);
            }
        } else {
            jMsToUs = -9223372036854775807L;
        }
        androidx.media3.extractor.SeekMap seekMap = this.mediaPreparer.seekMap;
        if (!seekMap.isSeekable()) {
            androidx.media3.common.util.Log.w(TAG, "Cannot set download byte range for progressive stream that is unseekable");
            return;
        }
        long j11 = seekMap.getSeekPoints(jLongValue).first.position;
        long j12 = -1;
        if (jMsToUs != androidx.media3.common.C.TIME_UNSET) {
            long j13 = seekMap.getSeekPoints(jMsToUs).second.position;
            if (jLongValue == jMsToUs || j11 != j13) {
                j12 = j13 - j11;
            }
        }
        builder.setByteRange(j11, j12);
    }

    private void populateDownloadRequestBuilderWithDownloadRange(androidx.media3.exoplayer.offline.DownloadRequest.Builder builder, long j, long j9) {
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

    private void populateDownloadRequestBuilderWithTimeRange(androidx.media3.exoplayer.offline.DownloadRequest.Builder builder, long j, long j9) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        androidx.media3.common.Timeline.Window window = this.mediaPreparer.timeline.getWindow(0, new androidx.media3.common.Timeline.Window());
        long defaultPositionUs = j == androidx.media3.common.C.TIME_UNSET ? window.getDefaultPositionUs() : androidx.media3.common.util.Util.msToUs(j);
        long durationUs = window.getDurationUs();
        long jMsToUs = j9 == androidx.media3.common.C.TIME_UNSET ? durationUs : androidx.media3.common.util.Util.msToUs(j9);
        if (durationUs != androidx.media3.common.C.TIME_UNSET) {
            defaultPositionUs = java.lang.Math.min(defaultPositionUs, durationUs);
            jMsToUs = java.lang.Math.min(jMsToUs, durationUs - defaultPositionUs);
        }
        builder.setTimeRange(defaultPositionUs, jMsToUs);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private androidx.media3.exoplayer.trackselection.TrackSelectorResult runTrackSelection(int i3) {
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResultSelectTracks = this.trackSelector.selectTracks(this.rendererCapabilities.getRendererCapabilities(), this.trackGroupArrays[i3], new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(this.mediaPreparer.timeline.getUidOfPeriod(i3)), this.mediaPreparer.timeline);
        for (int i9 = 0; i9 < trackSelectorResultSelectTracks.length; i9++) {
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = trackSelectorResultSelectTracks.selections[i9];
            if (exoTrackSelection != null) {
                java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> list = this.trackSelectionsByPeriodAndRenderer[i3][i9];
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        list.add(exoTrackSelection);
                        break;
                    }
                    androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection2 = list.get(i10);
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
                        list.set(i10, new androidx.media3.exoplayer.offline.DownloadHelper.DownloadTrackSelection(exoTrackSelection2.getTrackGroup(), iArr));
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

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void setPreparedWithNonProgressiveSourceAndTracksSelected() {
        this.isPreparedWithMedia = true;
        this.areTracksSelected = true;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.seekMap", "mediaPreparer.mediaPeriods"})
    private void setPreparedWithProgressiveSource() {
        this.isPreparedWithMedia = true;
    }

    public void addAudioLanguagesToSelection(java.lang.String... strArr) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS.buildUpon();
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (androidx.media3.exoplayer.RendererCapabilities rendererCapabilities : this.rendererCapabilities.getRendererCapabilities()) {
                int trackType = rendererCapabilities.getTrackType();
                builderBuildUpon.setTrackTypeDisabled(trackType, trackType != 1);
            }
            int periodCount = getPeriodCount();
            for (java.lang.String str : strArr) {
                androidx.media3.common.TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.setPreferredAudioLanguage(str).build();
                for (int i3 = 0; i3 < periodCount; i3++) {
                    addTrackSelectionInternal(i3, trackSelectionParametersBuild);
                }
            }
        } catch (androidx.media3.exoplayer.ExoPlaybackException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    public void addTextLanguagesToSelection(boolean z6, java.lang.String... strArr) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS.buildUpon();
            builderBuildUpon.setSelectUndeterminedTextLanguage(z6);
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (androidx.media3.exoplayer.RendererCapabilities rendererCapabilities : this.rendererCapabilities.getRendererCapabilities()) {
                int trackType = rendererCapabilities.getTrackType();
                builderBuildUpon.setTrackTypeDisabled(trackType, trackType != 3);
            }
            int periodCount = getPeriodCount();
            for (java.lang.String str : strArr) {
                androidx.media3.common.TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.setPreferredTextLanguage(str).build();
                for (int i3 = 0; i3 < periodCount; i3++) {
                    addTrackSelectionInternal(i3, trackSelectionParametersBuild);
                }
            }
        } catch (androidx.media3.exoplayer.ExoPlaybackException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    public void addTrackSelection(int i3, androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            addTrackSelectionInternal(i3, trackSelectionParameters);
        } catch (androidx.media3.exoplayer.ExoPlaybackException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    public void addTrackSelectionForSingleRenderer(int i3, int i9, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, java.util.List<androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride> list) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder builderBuildUpon = parameters.buildUpon();
            int i10 = 0;
            while (i10 < this.mappedTrackInfos[i3].getRendererCount()) {
                builderBuildUpon.setRendererDisabled(i10, i10 != i9);
                i10++;
            }
            if (list.isEmpty()) {
                addTrackSelectionInternal(i3, builderBuildUpon.build());
                return;
            }
            androidx.media3.exoplayer.source.TrackGroupArray trackGroups = this.mappedTrackInfos[i3].getTrackGroups(i9);
            for (int i11 = 0; i11 < list.size(); i11++) {
                builderBuildUpon.setSelectionOverride(i9, trackGroups, list.get(i11));
                addTrackSelectionInternal(i3, builderBuildUpon.build());
            }
        } catch (androidx.media3.exoplayer.ExoPlaybackException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    public void clearTrackSelections(int i3) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        for (int i9 = 0; i9 < this.rendererCapabilities.size(); i9++) {
            this.trackSelectionsByPeriodAndRenderer[i3][i9].clear();
        }
    }

    public androidx.media3.exoplayer.offline.DownloadRequest getDownloadRequest(byte[] bArr) {
        return getDownloadRequest(this.localConfiguration.uri.toString(), bArr);
    }

    public java.lang.Object getManifest() {
        if (this.mode == 0) {
            return null;
        }
        assertPreparedWithMedia();
        if (this.mediaPreparer.timeline.getWindowCount() > 0) {
            return this.mediaPreparer.timeline.getWindow(0, this.window).manifest;
        }
        return null;
    }

    public androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo getMappedTrackInfo(int i3) {
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

    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups(int i3) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        return this.trackGroupArrays[i3];
    }

    public java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> getTrackSelections(int i3, int i9) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        return this.immutableTrackSelectionsByPeriodAndRenderer[i3][i9];
    }

    public androidx.media3.common.Tracks getTracks(int i3) {
        assertPreparedWithNonProgressiveSourceAndTracksSelected();
        return androidx.media3.exoplayer.trackselection.TrackSelectionUtil.buildTracks(this.mappedTrackInfos[i3], this.immutableTrackSelectionsByPeriodAndRenderer[i3]);
    }

    public void prepare(androidx.media3.exoplayer.offline.DownloadHelper.Callback callback) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.callback == null);
        this.callback = callback;
        if (this.mode == 0) {
            this.callbackHandler.post(new androidx.media3.exoplayer.offline.e(this, callback, 2));
            return;
        }
        androidx.media3.exoplayer.source.MediaSource mediaSource = this.mediaSource;
        mediaSource.getClass();
        this.mediaPreparer = new androidx.media3.exoplayer.offline.DownloadHelper.MediaPreparer(mediaSource, this);
    }

    public void release() {
        androidx.media3.exoplayer.offline.DownloadHelper.MediaPreparer mediaPreparer = this.mediaPreparer;
        if (mediaPreparer != null) {
            mediaPreparer.release();
        }
        this.trackSelector.release();
        this.rendererCapabilities.release();
    }

    public void replaceTrackSelections(int i3, androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithNonProgressiveSourceAndTracksSelected();
            clearTrackSelections(i3);
            addTrackSelectionInternal(i3, trackSelectionParameters);
        } catch (androidx.media3.exoplayer.ExoPlaybackException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    public DownloadHelper(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.RendererCapabilitiesList rendererCapabilitiesList, boolean z6) {
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        localConfiguration.getClass();
        this.localConfiguration = localConfiguration;
        this.mediaSource = mediaSource;
        this.mode = mediaSource == null ? 0 : mediaSource instanceof androidx.media3.exoplayer.source.ProgressiveMediaSource ? 1 : 2;
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector defaultTrackSelector = new androidx.media3.exoplayer.trackselection.DefaultTrackSelector(trackSelectionParameters, new androidx.media3.exoplayer.offline.DownloadHelper.DownloadTrackSelection.Factory());
        this.trackSelector = defaultTrackSelector;
        this.rendererCapabilities = rendererCapabilitiesList;
        this.debugLoggingEnabled = z6;
        this.scratchSet = new android.util.SparseIntArray();
        defaultTrackSelector.init(new androidx.media3.exoplayer.offline.b(), new androidx.media3.exoplayer.offline.DownloadHelper.FakeBandwidthMeter());
        this.callbackHandler = androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper();
        this.window = new androidx.media3.common.Timeline.Window();
    }

    public static androidx.media3.exoplayer.source.MediaSource createMediaSource(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, androidx.media3.datasource.DataSource.Factory factory, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager) {
        return createMediaSourceInternal(downloadRequest.toMediaItem(), factory, drmSessionManager, null);
    }

    public androidx.media3.exoplayer.offline.DownloadRequest getDownloadRequest(byte[] bArr, long j, long j9) {
        return getDownloadRequest(this.localConfiguration.uri.toString(), bArr, j, j9);
    }

    public androidx.media3.exoplayer.offline.DownloadRequest getDownloadRequest(java.lang.String str, byte[] bArr) {
        return getDownloadRequestBuilder(str, bArr).build();
    }

    public androidx.media3.exoplayer.offline.DownloadRequest getDownloadRequest(java.lang.String str, byte[] bArr, long j, long j9) {
        androidx.media3.exoplayer.offline.DownloadRequest.Builder downloadRequestBuilder = getDownloadRequestBuilder(str, bArr);
        assertPreparedWithMedia();
        populateDownloadRequestBuilderWithDownloadRange(downloadRequestBuilder, j, j9);
        return downloadRequestBuilder.build();
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.offline.DownloadHelper forMediaItem(android.content.Context context, androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.DataSource.Factory factory) {
        return new androidx.media3.exoplayer.offline.DownloadHelper.Factory().setDataSourceFactory(factory).create(mediaItem);
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.offline.DownloadHelper forMediaItem(android.content.Context context, androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.DataSource.Factory factory, boolean z6) {
        return new androidx.media3.exoplayer.offline.DownloadHelper.Factory().setDataSourceFactory(factory).setDebugLoggingEnabled(z6).create(mediaItem);
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.offline.DownloadHelper forMediaItem(android.content.Context context, androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.RenderersFactory renderersFactory, androidx.media3.datasource.DataSource.Factory factory) {
        return new androidx.media3.exoplayer.offline.DownloadHelper.Factory().setDataSourceFactory(factory).setRenderersFactory(renderersFactory).create(mediaItem);
    }

    public static final class Factory {
        private androidx.media3.datasource.DataSource.Factory dataSourceFactory;
        private boolean debugLoggingEnabled;
        private androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager;
        private androidx.media3.exoplayer.RenderersFactory renderersFactory;
        private androidx.media3.common.TrackSelectionParameters trackSelectionParameters = androidx.media3.exoplayer.offline.DownloadHelper.DEFAULT_TRACK_SELECTOR_PARAMETERS;
        private p068h4.v loadExecutorSupplier = null;

        public androidx.media3.exoplayer.offline.DownloadHelper create(androidx.media3.common.MediaItem mediaItem) {
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            localConfiguration.getClass();
            boolean zIsProgressive = androidx.media3.exoplayer.offline.DownloadHelper.isProgressive(localConfiguration);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(zIsProgressive || this.dataSourceFactory != null);
            androidx.media3.exoplayer.source.MediaSource mediaSourceCreateMediaSourceInternal = (zIsProgressive && this.dataSourceFactory == null) ? null : androidx.media3.exoplayer.offline.DownloadHelper.createMediaSourceInternal(mediaItem, (androidx.media3.datasource.DataSource.Factory) androidx.media3.common.util.Util.castNonNull(this.dataSourceFactory), this.drmSessionManager, this.loadExecutorSupplier);
            androidx.media3.common.TrackSelectionParameters trackSelectionParameters = this.trackSelectionParameters;
            androidx.media3.exoplayer.RenderersFactory renderersFactory = this.renderersFactory;
            return new androidx.media3.exoplayer.offline.DownloadHelper(mediaItem, mediaSourceCreateMediaSourceInternal, trackSelectionParameters, renderersFactory != null ? new androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory(renderersFactory).createRendererCapabilitiesList() : new androidx.media3.exoplayer.offline.DownloadHelper.UnreleaseableRendererCapabilitiesList(new androidx.media3.exoplayer.RendererCapabilities[0]), this.debugLoggingEnabled);
        }

        public androidx.media3.exoplayer.offline.DownloadHelper.Factory setDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
            this.dataSourceFactory = factory;
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadHelper.Factory setDebugLoggingEnabled(boolean z6) {
            this.debugLoggingEnabled = z6;
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadHelper.Factory setDrmSessionManager(androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager) {
            this.drmSessionManager = drmSessionManager;
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadHelper.Factory setLoadExecutor(p068h4.v vVar) {
            this.loadExecutorSupplier = vVar;
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadHelper.Factory setRenderersFactory(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            this.renderersFactory = renderersFactory;
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadHelper.Factory setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            this.trackSelectionParameters = trackSelectionParameters;
            return this;
        }

        public androidx.media3.exoplayer.offline.DownloadHelper create(androidx.media3.exoplayer.source.MediaSource mediaSource) {
            androidx.media3.exoplayer.RendererCapabilitiesList unreleaseableRendererCapabilitiesList;
            androidx.media3.common.MediaItem mediaItem = mediaSource.getMediaItem();
            androidx.media3.common.TrackSelectionParameters trackSelectionParameters = this.trackSelectionParameters;
            androidx.media3.exoplayer.RenderersFactory renderersFactory = this.renderersFactory;
            if (renderersFactory != null) {
                unreleaseableRendererCapabilitiesList = new androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory(renderersFactory).createRendererCapabilitiesList();
            } else {
                unreleaseableRendererCapabilitiesList = new androidx.media3.exoplayer.offline.DownloadHelper.UnreleaseableRendererCapabilitiesList(new androidx.media3.exoplayer.RendererCapabilities[0]);
            }
            return new androidx.media3.exoplayer.offline.DownloadHelper(mediaItem, mediaSource, trackSelectionParameters, unreleaseableRendererCapabilitiesList, this.debugLoggingEnabled);
        }
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.offline.DownloadHelper forMediaItem(android.content.Context context, androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.RenderersFactory renderersFactory, androidx.media3.datasource.DataSource.Factory factory, boolean z6) {
        return new androidx.media3.exoplayer.offline.DownloadHelper.Factory().setDataSourceFactory(factory).setRenderersFactory(renderersFactory).setDebugLoggingEnabled(z6).create(mediaItem);
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.offline.DownloadHelper forMediaItem(androidx.media3.common.MediaItem mediaItem, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.RenderersFactory renderersFactory, androidx.media3.datasource.DataSource.Factory factory) {
        return new androidx.media3.exoplayer.offline.DownloadHelper.Factory().setDataSourceFactory(factory).setTrackSelectionParameters(trackSelectionParameters).setRenderersFactory(renderersFactory).create(mediaItem);
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.offline.DownloadHelper forMediaItem(androidx.media3.common.MediaItem mediaItem, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.RenderersFactory renderersFactory, androidx.media3.datasource.DataSource.Factory factory, boolean z6) {
        return new androidx.media3.exoplayer.offline.DownloadHelper.Factory().setDataSourceFactory(factory).setTrackSelectionParameters(trackSelectionParameters).setRenderersFactory(renderersFactory).setDebugLoggingEnabled(z6).create(mediaItem);
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.offline.DownloadHelper forMediaItem(androidx.media3.common.MediaItem mediaItem, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.RenderersFactory renderersFactory, androidx.media3.datasource.DataSource.Factory factory, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager) {
        return new androidx.media3.exoplayer.offline.DownloadHelper.Factory().setDataSourceFactory(factory).setTrackSelectionParameters(trackSelectionParameters).setRenderersFactory(renderersFactory).setDrmSessionManager(drmSessionManager).create(mediaItem);
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.offline.DownloadHelper forMediaItem(androidx.media3.common.MediaItem mediaItem, androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.exoplayer.RenderersFactory renderersFactory, androidx.media3.datasource.DataSource.Factory factory, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, boolean z6) {
        return new androidx.media3.exoplayer.offline.DownloadHelper.Factory().setDataSourceFactory(factory).setTrackSelectionParameters(trackSelectionParameters).setRenderersFactory(renderersFactory).setDrmSessionManager(drmSessionManager).setDebugLoggingEnabled(z6).create(mediaItem);
    }
}
