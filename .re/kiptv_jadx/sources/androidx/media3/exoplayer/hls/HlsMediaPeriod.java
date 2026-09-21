package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
final class HlsMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener {
    private final androidx.media3.exoplayer.upstream.Allocator allocator;
    private final boolean allowChunklessPreparation;
    private int audioVideoSampleStreamWrapperCount;
    private final androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration;
    private androidx.media3.exoplayer.source.SequenceableLoader compositeSequenceableLoader;
    private final androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final androidx.media3.exoplayer.hls.HlsDataSourceFactory dataSourceFactory;
    private final p068h4.v downloadExecutorSupplier;
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager;
    private final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher;
    private final androidx.media3.exoplayer.hls.HlsExtractorFactory extractorFactory;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private androidx.media3.exoplayer.source.MediaPeriod.Callback mediaPeriodCallback;
    private final androidx.media3.datasource.TransferListener mediaTransferListener;
    private final int metadataType;
    private int pendingPrepareCount;
    private final androidx.media3.exoplayer.analytics.PlayerId playerId;
    private final androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker playlistTracker;
    private final long timestampAdjusterInitializationTimeoutMs;
    private androidx.media3.exoplayer.source.TrackGroupArray trackGroups;
    private final boolean useSessionKeys;
    private final androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback sampleStreamWrapperCallback = new androidx.media3.exoplayer.hls.HlsMediaPeriod.SampleStreamWrapperCallback();
    private final java.util.IdentityHashMap<androidx.media3.exoplayer.source.SampleStream, java.lang.Integer> streamWrapperIndices = new java.util.IdentityHashMap<>();
    private final androidx.media3.exoplayer.hls.TimestampAdjusterProvider timestampAdjusterProvider = new androidx.media3.exoplayer.hls.TimestampAdjusterProvider();
    private androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] sampleStreamWrappers = new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[0];
    private androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] enabledSampleStreamWrappers = new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[0];
    private int[][] redundantGroupIndicesPerWrapper = new int[0][];
    private long endPositionUs = Long.MIN_VALUE;

    public class SampleStreamWrapperCallback implements androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback {
        private SampleStreamWrapperCallback() {
        }

        @Override // androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback
        public void onPlaylistRefreshRequired(android.net.Uri uri) {
            androidx.media3.exoplayer.hls.HlsMediaPeriod.this.playlistTracker.refreshPlaylist(uri);
        }

        @Override // androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback
        public void onPrepared() {
            if (androidx.media3.exoplayer.hls.HlsMediaPeriod.access$106(androidx.media3.exoplayer.hls.HlsMediaPeriod.this) > 0) {
                return;
            }
            int i3 = 0;
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : androidx.media3.exoplayer.hls.HlsMediaPeriod.this.sampleStreamWrappers) {
                i3 += hlsSampleStreamWrapper.getTrackGroups().length;
            }
            androidx.media3.common.TrackGroup[] trackGroupArr = new androidx.media3.common.TrackGroup[i3];
            int i9 = 0;
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper2 : androidx.media3.exoplayer.hls.HlsMediaPeriod.this.sampleStreamWrappers) {
                int i10 = hlsSampleStreamWrapper2.getTrackGroups().length;
                int i11 = 0;
                while (i11 < i10) {
                    trackGroupArr[i9] = hlsSampleStreamWrapper2.getTrackGroups().get(i11);
                    i11++;
                    i9++;
                }
            }
            androidx.media3.exoplayer.hls.HlsMediaPeriod.this.trackGroups = new androidx.media3.exoplayer.source.TrackGroupArray(trackGroupArr);
            androidx.media3.exoplayer.hls.HlsMediaPeriod.this.mediaPeriodCallback.onPrepared(androidx.media3.exoplayer.hls.HlsMediaPeriod.this);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper) {
            androidx.media3.exoplayer.hls.HlsMediaPeriod.this.mediaPeriodCallback.onContinueLoadingRequested(androidx.media3.exoplayer.hls.HlsMediaPeriod.this);
        }
    }

    public HlsMediaPeriod(androidx.media3.exoplayer.hls.HlsExtractorFactory hlsExtractorFactory, androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker hlsPlaylistTracker, androidx.media3.exoplayer.hls.HlsDataSourceFactory hlsDataSourceFactory, androidx.media3.datasource.TransferListener transferListener, androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher2, androidx.media3.exoplayer.upstream.Allocator allocator, androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, boolean z6, int i3, boolean z9, androidx.media3.exoplayer.analytics.PlayerId playerId, long j, p068h4.v vVar) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.dataSourceFactory = hlsDataSourceFactory;
        this.mediaTransferListener = transferListener;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.eventDispatcher = eventDispatcher2;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.allowChunklessPreparation = z6;
        this.metadataType = i3;
        this.useSessionKeys = z9;
        this.playerId = playerId;
        this.timestampAdjusterInitializationTimeoutMs = j;
        this.downloadExecutorSupplier = vVar;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
    }

    public static /* synthetic */ int access$106(androidx.media3.exoplayer.hls.HlsMediaPeriod hlsMediaPeriod) {
        int i3 = hlsMediaPeriod.pendingPrepareCount - 1;
        hlsMediaPeriod.pendingPrepareCount = i3;
        return i3;
    }

    private void buildAndPrepareAudioSampleStreamWrappers(long j, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup> list, java.util.List<androidx.media3.exoplayer.hls.HlsSampleStreamWrapper> list2, java.util.List<int[]> list3, java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
        java.util.ArrayList arrayList3 = new java.util.ArrayList(list.size());
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i3 = 0; i3 < list.size(); i3++) {
            java.lang.String str = list.get(i3).groupKey.name;
            str.getClass();
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z6 = true;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    if (str.equals(list.get(i9).groupKey.name)) {
                        androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup hlsRedundantGroup = list.get(i9);
                        androidx.media3.common.Format format = hlsRedundantGroup.groupKey.format;
                        arrayList3.add(java.lang.Integer.valueOf(i9));
                        arrayList.add(hlsRedundantGroup);
                        arrayList2.add(format);
                        z6 &= androidx.media3.common.util.Util.getCodecCountOfType(format.codecs, 1) == 1;
                    }
                }
                java.lang.String strConcat = "audio:".concat(str);
                androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(strConcat, 1, (androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup[]) arrayList.toArray((androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup[]) androidx.media3.common.util.Util.castNonNullTypeArray(new androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup[0])), (androidx.media3.common.Format[]) arrayList2.toArray(new androidx.media3.common.Format[0]), null, java.util.Collections.EMPTY_LIST, map, j);
                list3.add(com.google.crypto.tink.shaded.protobuf.q0.H(arrayList3));
                list2.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
                if (this.allowChunklessPreparation && z6) {
                    hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(new androidx.media3.common.TrackGroup[]{new androidx.media3.common.TrackGroup(strConcat, (androidx.media3.common.Format[]) arrayList2.toArray(new androidx.media3.common.Format[0])), new androidx.media3.common.TrackGroup(p121o0.p.o(strConcat, ":id3"), new androidx.media3.common.Format.Builder().setId("ID3").setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_ID3).setPrimaryTrackGroupId(strConcat).build())}, 0, 1);
                }
            }
        }
    }

    private void buildAndPrepareMainSampleStreamWrapper(java.util.List<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup> list, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup> list2, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Format> list3, long j, java.util.List<androidx.media3.exoplayer.hls.HlsSampleStreamWrapper> list4, java.util.List<int[]> list5, java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> map) {
        int i3;
        boolean z6;
        boolean z9;
        int size = list.size();
        int[] iArr = new int[size];
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            androidx.media3.common.Format format2 = list.get(i11).groupKey.format;
            if (format2.height > 0 || androidx.media3.common.util.Util.getCodecsOfType(format2.codecs, 2) != null) {
                iArr[i11] = 2;
                i9++;
            } else if (androidx.media3.common.util.Util.getCodecsOfType(format2.codecs, 1) != null) {
                iArr[i11] = 1;
                i10++;
            } else {
                iArr[i11] = -1;
            }
        }
        if (i9 > 0) {
            i3 = i9;
            z9 = false;
            z6 = true;
        } else if (i10 < size) {
            i3 = size - i10;
            z6 = false;
            z9 = true;
        } else {
            i3 = size;
            z6 = false;
            z9 = false;
        }
        androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup[] hlsRedundantGroupArr = new androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup[i3];
        boolean z10 = z9;
        androidx.media3.common.Format[] formatArr = new androidx.media3.common.Format[i3];
        int[] iArr2 = new int[i3];
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            if ((!z6 || iArr[i13] == 2) && (!z10 || iArr[i13] != 1)) {
                androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup hlsRedundantGroup = list.get(i13);
                hlsRedundantGroupArr[i12] = hlsRedundantGroup;
                formatArr[i12] = hlsRedundantGroup.groupKey.format;
                iArr2[i12] = i13;
                i12++;
            }
        }
        java.lang.String str = formatArr[0].codecs;
        int codecCountOfType = androidx.media3.common.util.Util.getCodecCountOfType(str, 2);
        int codecCountOfType2 = androidx.media3.common.util.Util.getCodecCountOfType(str, 1);
        boolean z11 = (codecCountOfType2 == 1 || (codecCountOfType2 == 0 && list2.isEmpty())) && codecCountOfType <= 1 && codecCountOfType2 + codecCountOfType > 0;
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(io.sentry.protocol.SentryThread.JsonKeys.MAIN, (z6 || codecCountOfType2 <= 0) ? 0 : 1, hlsRedundantGroupArr, formatArr, format, list3, map, j);
        list4.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
        list5.add(iArr2);
        if (this.allowChunklessPreparation && z11) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (codecCountOfType > 0) {
                androidx.media3.common.Format[] formatArr2 = new androidx.media3.common.Format[i3];
                for (int i14 = 0; i14 < i3; i14++) {
                    formatArr2[i14] = deriveVideoFormat(formatArr[i14]);
                }
                arrayList.add(new androidx.media3.common.TrackGroup(io.sentry.protocol.SentryThread.JsonKeys.MAIN, formatArr2));
                if (codecCountOfType2 > 0 && (format != null || list2.isEmpty())) {
                    arrayList.add(new androidx.media3.common.TrackGroup("main:audio", deriveAudioFormat(formatArr[0], format, false).buildUpon().setPrimaryTrackGroupId(io.sentry.protocol.SentryThread.JsonKeys.MAIN).build()));
                }
                if (list3 != null) {
                    for (int i15 = 0; i15 < list3.size(); i15++) {
                        arrayList.add(new androidx.media3.common.TrackGroup(com.google.android.gms.internal.play_billing.M0.l(i15, "main:cc:"), this.extractorFactory.getOutputTextFormat(list3.get(i15)).buildUpon().setPrimaryTrackGroupId(io.sentry.protocol.SentryThread.JsonKeys.MAIN).build()));
                    }
                }
            } else {
                androidx.media3.common.Format[] formatArr3 = new androidx.media3.common.Format[i3];
                for (int i16 = 0; i16 < i3; i16++) {
                    formatArr3[i16] = deriveAudioFormat(formatArr[i16], format, true);
                }
                arrayList.add(new androidx.media3.common.TrackGroup(io.sentry.protocol.SentryThread.JsonKeys.MAIN, formatArr3));
            }
            androidx.media3.common.TrackGroup trackGroup = new androidx.media3.common.TrackGroup("main:id3", new androidx.media3.common.Format.Builder().setId("ID3").setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_ID3).setPrimaryTrackGroupId(io.sentry.protocol.SentryThread.JsonKeys.MAIN).build());
            arrayList.add(trackGroup);
            hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo((androidx.media3.common.TrackGroup[]) arrayList.toArray(new androidx.media3.common.TrackGroup[0]), 0, arrayList.indexOf(trackGroup));
        }
    }

    private void buildAndPrepareSampleStreamWrappers(long j) {
        long j9;
        androidx.media3.exoplayer.hls.HlsMediaPeriod hlsMediaPeriod;
        androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist multivariantPlaylist = this.playlistTracker.getMultivariantPlaylist();
        multivariantPlaylist.getClass();
        java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> mapDeriveOverridingDrmInitData = this.useSessionKeys ? deriveOverridingDrmInitData(multivariantPlaylist.sessionKeyDrmInitData) : java.util.Collections.EMPTY_MAP;
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup> redundantGroups = this.playlistTracker.getRedundantGroups(0);
        redundantGroups.getClass();
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup> redundantGroups2 = this.playlistTracker.getRedundantGroups(2);
        redundantGroups2.getClass();
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup> redundantGroups3 = this.playlistTracker.getRedundantGroups(3);
        redundantGroups3.getClass();
        boolean zIsEmpty = redundantGroups.isEmpty();
        this.pendingPrepareCount = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (zIsEmpty) {
            j9 = j;
            hlsMediaPeriod = this;
        } else {
            hlsMediaPeriod = this;
            hlsMediaPeriod.buildAndPrepareMainSampleStreamWrapper(redundantGroups, redundantGroups2, multivariantPlaylist.muxedAudioFormat, multivariantPlaylist.muxedCaptionFormats, j, arrayList, arrayList2, mapDeriveOverridingDrmInitData);
            j9 = j;
            arrayList = arrayList;
            arrayList2 = arrayList2;
            mapDeriveOverridingDrmInitData = mapDeriveOverridingDrmInitData;
        }
        hlsMediaPeriod.buildAndPrepareAudioSampleStreamWrappers(j9, redundantGroups2, arrayList, arrayList2, mapDeriveOverridingDrmInitData);
        hlsMediaPeriod.audioVideoSampleStreamWrapperCount = arrayList.size();
        hlsMediaPeriod.buildAndPrepareSubtitleSampleStreamWrappers(j9, redundantGroups3, arrayList, arrayList2, mapDeriveOverridingDrmInitData);
        hlsMediaPeriod.sampleStreamWrappers = (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[]) arrayList.toArray(new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[0]);
        hlsMediaPeriod.redundantGroupIndicesPerWrapper = (int[][]) arrayList2.toArray(new int[0][]);
        hlsMediaPeriod.pendingPrepareCount = hlsMediaPeriod.sampleStreamWrappers.length;
        for (int i3 = 0; i3 < hlsMediaPeriod.audioVideoSampleStreamWrapperCount; i3++) {
            hlsMediaPeriod.sampleStreamWrappers[i3].setIsPrimaryTimestampSource(true);
        }
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : hlsMediaPeriod.sampleStreamWrappers) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        hlsMediaPeriod.enabledSampleStreamWrappers = hlsMediaPeriod.sampleStreamWrappers;
    }

    private void buildAndPrepareSubtitleSampleStreamWrappers(long j, java.util.List<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup> list, java.util.List<androidx.media3.exoplayer.hls.HlsSampleStreamWrapper> list2, java.util.List<int[]> list3, java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> map) {
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup> list4 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(list4.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list4.size());
        java.util.ArrayList arrayList3 = new java.util.ArrayList(list4.size());
        java.util.HashSet hashSet = new java.util.HashSet();
        int i3 = 0;
        int i9 = 0;
        while (i9 < list4.size()) {
            java.lang.String str = list4.get(i9).groupKey.name;
            str.getClass();
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                for (int i10 = i3; i10 < list4.size(); i10++) {
                    if (str.equals(list4.get(i10).groupKey.name)) {
                        androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup hlsRedundantGroup = list4.get(i10);
                        arrayList3.add(java.lang.Integer.valueOf(i10));
                        arrayList.add(hlsRedundantGroup);
                        arrayList2.add(hlsRedundantGroup.groupKey.format);
                    }
                }
                java.lang.String strConcat = "subtitle:".concat(str);
                androidx.media3.common.Format[] formatArr = (androidx.media3.common.Format[]) arrayList2.toArray(new androidx.media3.common.Format[i3]);
                androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup[] hlsRedundantGroupArr = (androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup[]) arrayList.toArray((androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup[]) androidx.media3.common.util.Util.castNonNullTypeArray(new androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup[i3]));
                p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
                androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(strConcat, 3, hlsRedundantGroupArr, formatArr, null, p076i4.S0.f22832l, map, j);
                list3.add(com.google.crypto.tink.shaded.protobuf.q0.H(arrayList3));
                list2.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
                int length = formatArr.length;
                androidx.media3.common.Format[] formatArr2 = new androidx.media3.common.Format[length];
                for (int i11 = i3; i11 < length; i11++) {
                    formatArr2[i11] = this.extractorFactory.getOutputTextFormat(formatArr[i11]);
                }
                i3 = 0;
                hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(new androidx.media3.common.TrackGroup[]{new androidx.media3.common.TrackGroup(strConcat, formatArr2)}, 0, new int[0]);
            }
            i9++;
            list4 = list;
        }
    }

    private androidx.media3.exoplayer.hls.HlsSampleStreamWrapper buildSampleStreamWrapper(java.lang.String str, int i3, androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup[] hlsRedundantGroupArr, androidx.media3.common.Format[] formatArr, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Format> list, java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> map, long j) {
        androidx.media3.exoplayer.hls.HlsChunkSource hlsChunkSource = new androidx.media3.exoplayer.hls.HlsChunkSource(this.extractorFactory, this.playlistTracker, hlsRedundantGroupArr, formatArr, this.dataSourceFactory, this.mediaTransferListener, this.timestampAdjusterProvider, this.timestampAdjusterInitializationTimeoutMs, list, this.playerId, this.cmcdConfiguration);
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback callback = this.sampleStreamWrapperCallback;
        androidx.media3.exoplayer.upstream.Allocator allocator = this.allocator;
        androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager = this.drmSessionManager;
        androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher = this.drmEventDispatcher;
        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
        androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher2 = this.eventDispatcher;
        int i9 = this.metadataType;
        p068h4.v vVar = this.downloadExecutorSupplier;
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper = new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper(str, i3, callback, hlsChunkSource, map, allocator, j, format, drmSessionManager, eventDispatcher, loadErrorHandlingPolicy, eventDispatcher2, i9, vVar != null ? (androidx.media3.exoplayer.util.ReleasableExecutor) vVar.get() : null);
        hlsSampleStreamWrapper.setEndPositionUs(this.endPositionUs);
        return hlsSampleStreamWrapper;
    }

    private static androidx.media3.common.Format deriveAudioFormat(androidx.media3.common.Format format, androidx.media3.common.Format format2, boolean z6) {
        androidx.media3.common.Metadata metadata;
        int i3;
        java.lang.String str;
        java.lang.String str2;
        java.util.List<androidx.media3.common.Label> list;
        int i9;
        int i10;
        java.lang.String str3;
        p076i4.Z z9 = p076i4.AbstractC2186b0.f22868i;
        p076i4.S0 s9 = p076i4.S0.f22832l;
        if (format2 != null) {
            str2 = format2.codecs;
            metadata = format2.metadata;
            i9 = format2.channelCount;
            i3 = format2.selectionFlags;
            i10 = format2.roleFlags;
            str = format2.language;
            str3 = format2.label;
            list = format2.labels;
        } else {
            java.lang.String codecsOfType = androidx.media3.common.util.Util.getCodecsOfType(format.codecs, 1);
            metadata = format.metadata;
            if (z6) {
                i9 = format.channelCount;
                i3 = format.selectionFlags;
                i10 = format.roleFlags;
                str = format.language;
                str3 = format.label;
                str2 = codecsOfType;
                list = format.labels;
            } else {
                i3 = 0;
                str = null;
                str2 = codecsOfType;
                list = s9;
                i9 = -1;
                i10 = 0;
                str3 = null;
            }
        }
        return new androidx.media3.common.Format.Builder().setId(format.id).setLabel(str3).setLabels(list).setContainerMimeType(format.containerMimeType).setSampleMimeType(androidx.media3.common.MimeTypes.getMediaMimeType(str2)).setCodecs(str2).setMetadata(metadata).setAverageBitrate(z6 ? format.averageBitrate : -1).setPeakBitrate(z6 ? format.peakBitrate : -1).setChannelCount(i9).setSelectionFlags(i3).setRoleFlags(i10).setLanguage(str).build();
    }

    private static java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> deriveOverridingDrmInitData(java.util.List<androidx.media3.common.DrmInitData> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.HashMap map = new java.util.HashMap();
        int i3 = 0;
        while (i3 < arrayList.size()) {
            androidx.media3.common.DrmInitData drmInitDataMerge = list.get(i3);
            java.lang.String str = drmInitDataMerge.schemeType;
            i3++;
            int i9 = i3;
            while (i9 < arrayList.size()) {
                androidx.media3.common.DrmInitData drmInitData = (androidx.media3.common.DrmInitData) arrayList.get(i9);
                if (android.text.TextUtils.equals(drmInitData.schemeType, str)) {
                    drmInitDataMerge = drmInitDataMerge.merge(drmInitData);
                    arrayList.remove(i9);
                } else {
                    i9++;
                }
            }
            map.put(str, drmInitDataMerge);
        }
        return map;
    }

    private static androidx.media3.common.Format deriveVideoFormat(androidx.media3.common.Format format) {
        java.lang.String codecsOfType = androidx.media3.common.util.Util.getCodecsOfType(format.codecs, 2);
        return new androidx.media3.common.Format.Builder().setId(format.id).setLabel(format.label).setLabels(format.labels).setContainerMimeType(format.containerMimeType).setSampleMimeType(androidx.media3.common.MimeTypes.getMediaMimeType(codecsOfType)).setCodecs(codecsOfType).setMetadata(format.metadata).setAverageBitrate(format.averageBitrate).setPeakBitrate(format.peakBitrate).setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).setColorInfo(format.colorInfo).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.List lambda$selectTracks$0(androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        return hlsSampleStreamWrapper.getTrackGroups().getTrackTypes();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        if (this.trackGroups != null) {
            return this.compositeSequenceableLoader.continueLoading(loadingInfo);
        }
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z6) {
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            hlsSampleStreamWrapper.discardBuffer(j, z6);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            if (hlsSampleStreamWrapper.isVideoSampleStream()) {
                return hlsSampleStreamWrapper.getAdjustedSeekPositionUs(j, seekParameters);
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v27 */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public java.util.List<androidx.media3.common.StreamKey> getStreamKeys(java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> list) {
        int[] iArr;
        androidx.media3.exoplayer.source.TrackGroupArray trackGroups;
        int primaryTrackGroupIndex;
        int i3;
        androidx.media3.exoplayer.hls.HlsMediaPeriod hlsMediaPeriod = this;
        androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist multivariantPlaylist = hlsMediaPeriod.playlistTracker.getMultivariantPlaylist();
        multivariantPlaylist.getClass();
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup> redundantGroups = hlsMediaPeriod.playlistTracker.getRedundantGroups(0);
        redundantGroups.getClass();
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup> redundantGroups2 = hlsMediaPeriod.playlistTracker.getRedundantGroups(2);
        redundantGroups2.getClass();
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup> redundantGroups3 = hlsMediaPeriod.playlistTracker.getRedundantGroups(3);
        redundantGroups3.getClass();
        boolean zIsEmpty = multivariantPlaylist.variants.isEmpty();
        boolean z6 = !zIsEmpty;
        if (zIsEmpty) {
            iArr = new int[0];
            trackGroups = androidx.media3.exoplayer.source.TrackGroupArray.EMPTY;
            primaryTrackGroupIndex = 0;
        } else {
            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper = hlsMediaPeriod.sampleStreamWrappers[0];
            iArr = hlsMediaPeriod.redundantGroupIndicesPerWrapper[0];
            trackGroups = hlsSampleStreamWrapper.getTrackGroups();
            primaryTrackGroupIndex = hlsSampleStreamWrapper.getPrimaryTrackGroupIndex();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z9 = false;
        boolean z10 = false;
        for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : list) {
            androidx.media3.common.TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
            int iIndexOf = trackGroups.indexOf(trackGroup);
            if (iIndexOf == -1) {
                i3 = primaryTrackGroupIndex;
                ?? r9 = z6;
                while (true) {
                    androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = hlsMediaPeriod.sampleStreamWrappers;
                    if (r9 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    androidx.media3.exoplayer.source.TrackGroupArray trackGroups2 = hlsSampleStreamWrapperArr[r9].getTrackGroups();
                    int iIndexOf2 = trackGroups2.indexOf(trackGroup);
                    ?? r19 = r9;
                    if (iIndexOf2 != -1) {
                        int i9 = trackGroups2.get(iIndexOf2).type == 1 ? 1 : 2;
                        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup> list2 = i9 == 1 ? redundantGroups2 : redundantGroups3;
                        int[] iArr2 = hlsMediaPeriod.redundantGroupIndicesPerWrapper[r19 == true ? 1 : 0];
                        int i10 = 0;
                        while (i10 < exoTrackSelection.length()) {
                            java.util.List<androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup> list3 = list2;
                            for (p076i4.Z zListIterator = list2.get(iArr2[exoTrackSelection.getIndexInTrackGroup(i10)]).getIndicesInMultivariantPlaylist().listIterator(0); zListIterator.hasNext(); zListIterator = zListIterator) {
                                arrayList.add(new androidx.media3.common.StreamKey(i9, ((java.lang.Integer) zListIterator.next()).intValue()));
                            }
                            i10++;
                            list2 = list3;
                        }
                        break;
                    }
                    r9 = (r19 == true ? 1 : 0) + 1;
                    hlsMediaPeriod = this;
                }
            } else if (iIndexOf == primaryTrackGroupIndex) {
                for (int i11 = 0; i11 < exoTrackSelection.length(); i11++) {
                    int i12 = 0;
                    p076i4.Z zListIterator2 = redundantGroups.get(iArr[exoTrackSelection.getIndexInTrackGroup(i11)]).getIndicesInMultivariantPlaylist().listIterator(0);
                    while (zListIterator2.hasNext()) {
                        arrayList.add(new androidx.media3.common.StreamKey(i12, ((java.lang.Integer) zListIterator2.next()).intValue()));
                        primaryTrackGroupIndex = primaryTrackGroupIndex;
                        i12 = 0;
                    }
                }
                i3 = primaryTrackGroupIndex;
                z10 = true;
            } else {
                i3 = primaryTrackGroupIndex;
                z9 = true;
            }
            hlsMediaPeriod = this;
            primaryTrackGroupIndex = i3;
        }
        if (z9 && !z10) {
            int i13 = iArr[0];
            int i14 = redundantGroups.get(i13).groupKey.format.bitrate;
            for (int i15 = 1; i15 < iArr.length; i15++) {
                int i16 = redundantGroups.get(iArr[i15]).groupKey.format.bitrate;
                if (i16 < i14) {
                    i13 = iArr[i15];
                    i14 = i16;
                }
            }
            p076i4.Z zListIterator3 = redundantGroups.get(i13).getIndicesInMultivariantPlaylist().listIterator(0);
            while (zListIterator3.hasNext()) {
                arrayList.add(new androidx.media3.common.StreamKey(0, ((java.lang.Integer) zListIterator3.next()).intValue()));
            }
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray = this.trackGroups;
        trackGroupArray.getClass();
        return trackGroupArray;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws androidx.media3.common.ParserException {
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public void onPlaylistChanged() {
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.onPlaylistUpdated();
        }
        this.mediaPeriodCallback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public boolean onPlaylistError(android.net.Uri uri, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z6) {
        boolean zOnPlaylistError = false;
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            zOnPlaylistError |= hlsSampleStreamWrapper.onPlaylistError(uri, loadErrorInfo, z6);
        }
        this.mediaPeriodCallback.onContinueLoadingRequested(this);
        return zOnPlaylistError;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        this.mediaPeriodCallback = callback;
        this.playlistTracker.addListener(this);
        buildAndPrepareSampleStreamWrappers(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        this.compositeSequenceableLoader.reevaluateBuffer(j);
    }

    public void release() {
        this.playlistTracker.removeListener(this);
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.release();
        }
        this.mediaPeriodCallback = null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.enabledSampleStreamWrappers;
        if (hlsSampleStreamWrapperArr.length > 0) {
            boolean zSeekToUs = hlsSampleStreamWrapperArr[0].seekToUs(j, false);
            int i3 = 1;
            while (true) {
                androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = this.enabledSampleStreamWrappers;
                if (i3 >= hlsSampleStreamWrapperArr2.length) {
                    break;
                }
                hlsSampleStreamWrapperArr2[i3].seekToUs(j, zSeekToUs);
                i3++;
            }
            if (zSeekToUs) {
                this.timestampAdjusterProvider.reset();
            }
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d8  */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            androidx.media3.exoplayer.source.SampleStream sampleStream = sampleStreamArr[i3];
            iArr[i3] = sampleStream == null ? -1 : this.streamWrapperIndices.get(sampleStream).intValue();
            iArr2[i3] = -1;
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if (exoTrackSelection != null) {
                androidx.media3.common.TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                int i9 = 0;
                while (true) {
                    androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.sampleStreamWrappers;
                    if (i9 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[i9].getTrackGroups().indexOf(trackGroup) != -1) {
                        iArr2[i3] = i9;
                        break;
                    }
                    i9++;
                }
            }
        }
        this.streamWrapperIndices.clear();
        int length = exoTrackSelectionArr.length;
        androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr2 = new androidx.media3.exoplayer.source.SampleStream[length];
        androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr3 = new androidx.media3.exoplayer.source.SampleStream[exoTrackSelectionArr.length];
        androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr2 = new androidx.media3.exoplayer.trackselection.ExoTrackSelection[exoTrackSelectionArr.length];
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[this.sampleStreamWrappers.length];
        int i10 = 0;
        int i11 = 0;
        boolean z6 = false;
        while (i10 < this.sampleStreamWrappers.length) {
            for (int i12 = 0; i12 < exoTrackSelectionArr.length; i12++) {
                androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection2 = null;
                sampleStreamArr3[i12] = iArr[i12] == i10 ? sampleStreamArr[i12] : null;
                if (iArr2[i12] == i10) {
                    exoTrackSelection2 = exoTrackSelectionArr[i12];
                }
                exoTrackSelectionArr2[i12] = exoTrackSelection2;
            }
            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper = this.sampleStreamWrappers[i10];
            int[] iArr3 = iArr;
            int i13 = i10;
            int i14 = i11;
            boolean zSelectTracks = hlsSampleStreamWrapper.selectTracks(exoTrackSelectionArr2, zArr, sampleStreamArr3, zArr2, j, z6);
            boolean z9 = false;
            for (int i15 = 0; i15 < exoTrackSelectionArr.length; i15++) {
                androidx.media3.exoplayer.source.SampleStream sampleStream2 = sampleStreamArr3[i15];
                if (iArr2[i15] == i13) {
                    sampleStream2.getClass();
                    sampleStreamArr2[i15] = sampleStream2;
                    this.streamWrapperIndices.put(sampleStream2, java.lang.Integer.valueOf(i13));
                    z9 = true;
                } else if (iArr3[i15] == i13) {
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(sampleStream2 == null);
                }
            }
            if (z9) {
                hlsSampleStreamWrapperArr2[i14] = hlsSampleStreamWrapper;
                i11 = i14 + 1;
                if (i14 == 0) {
                    hlsSampleStreamWrapper.setIsPrimaryTimestampSource(true);
                    if (zSelectTracks) {
                        this.timestampAdjusterProvider.reset();
                        z6 = true;
                    } else {
                        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr3 = this.enabledSampleStreamWrappers;
                        if (hlsSampleStreamWrapperArr3.length == 0 || hlsSampleStreamWrapper != hlsSampleStreamWrapperArr3[0]) {
                            this.timestampAdjusterProvider.reset();
                            z6 = true;
                        }
                    }
                } else {
                    hlsSampleStreamWrapper.setIsPrimaryTimestampSource(i13 < this.audioVideoSampleStreamWrapperCount);
                }
            } else {
                i11 = i14;
            }
            i10 = i13 + 1;
            iArr = iArr3;
        }
        java.lang.System.arraycopy(sampleStreamArr2, 0, sampleStreamArr, 0, length);
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr4 = (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper[]) androidx.media3.common.util.Util.nullSafeArrayCopy(hlsSampleStreamWrapperArr2, i11);
        this.enabledSampleStreamWrappers = hlsSampleStreamWrapperArr4;
        p076i4.S0 s0V = p076i4.AbstractC2186b0.v(hlsSampleStreamWrapperArr4);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(s0V, p076i4.AbstractC2230y.A(s0V, new androidx.media3.exoplayer.hls.j()));
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long setEndPositionUs(long j) {
        this.endPositionUs = j;
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.setEndPositionUs(j);
        }
        return j;
    }
}
