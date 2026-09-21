package androidx.media3.exoplayer.dash;

/* JADX INFO: loaded from: classes.dex */
final class DashMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader.Callback<androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource>>, androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback<androidx.media3.exoplayer.dash.DashChunkSource> {
    private static final java.util.regex.Pattern CEA608_SERVICE_DESCRIPTOR_REGEX = java.util.regex.Pattern.compile("CC([1-4])=(.+)");
    private static final java.util.regex.Pattern CEA708_SERVICE_DESCRIPTOR_REGEX = java.util.regex.Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private final androidx.media3.exoplayer.upstream.Allocator allocator;
    private final androidx.media3.exoplayer.dash.BaseUrlExclusionList baseUrlExclusionList;
    private androidx.media3.exoplayer.source.MediaPeriod.Callback callback;
    private final androidx.media3.exoplayer.dash.DashChunkSource.Factory chunkSourceFactory;
    private final androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration;
    private androidx.media3.exoplayer.source.SequenceableLoader compositeSequenceableLoader;
    private final androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final p068h4.v downloadExecutorSupplier;
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager;
    private final long elapsedRealtimeOffsetMs;
    private long endPositionUs;
    private java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> eventStreams;
    final int id;
    private long initialStartTimeUs;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private androidx.media3.exoplayer.dash.manifest.DashManifest manifest;
    private final androidx.media3.exoplayer.upstream.LoaderErrorThrower manifestLoaderErrorThrower;
    private final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private int periodIndex;
    private final androidx.media3.exoplayer.dash.PlayerEmsgHandler playerEmsgHandler;
    private final androidx.media3.exoplayer.analytics.PlayerId playerId;
    private boolean readingSuppressedWaitingForInitialDiscontinuity;
    private final androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[] trackGroupInfos;
    private final androidx.media3.exoplayer.source.TrackGroupArray trackGroups;
    private final androidx.media3.datasource.TransferListener transferListener;
    private boolean canReportInitialDiscontinuity = true;
    private androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource>[] sampleStreams = newSampleStreamArray(0);
    private androidx.media3.exoplayer.dash.EventSampleStream[] eventSampleStreams = new androidx.media3.exoplayer.dash.EventSampleStream[0];
    private final java.util.IdentityHashMap<androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource>, androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler> trackEmsgHandlerBySampleStream = new java.util.IdentityHashMap<>();

    public static final class TrackGroupInfo {
        private static final int CATEGORY_EMBEDDED = 1;
        private static final int CATEGORY_MANIFEST_EVENTS = 2;
        private static final int CATEGORY_PRIMARY = 0;
        public final int[] adaptationSetIndices;
        public final int embeddedClosedCaptionTrackGroupIndex;
        public final p076i4.AbstractC2186b0 embeddedClosedCaptionTrackOriginalFormats;
        public final int embeddedEventMessageTrackGroupIndex;
        public final int eventStreamGroupIndex;
        public final int primaryTrackGroupIndex;
        public final int trackGroupCategory;
        public final int trackType;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface TrackGroupCategory {
        }

        private TrackGroupInfo(int i3, int i9, int[] iArr, int i10, int i11, int i12, int i13, p076i4.AbstractC2186b0 abstractC2186b0) {
            this.trackType = i3;
            this.adaptationSetIndices = iArr;
            this.trackGroupCategory = i9;
            this.primaryTrackGroupIndex = i10;
            this.embeddedEventMessageTrackGroupIndex = i11;
            this.embeddedClosedCaptionTrackGroupIndex = i12;
            this.eventStreamGroupIndex = i13;
            this.embeddedClosedCaptionTrackOriginalFormats = abstractC2186b0;
        }

        public static androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo embeddedClosedCaptionTrack(int[] iArr, int i3, p076i4.AbstractC2186b0 abstractC2186b0) {
            return new androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo(3, 1, iArr, i3, -1, -1, -1, abstractC2186b0);
        }

        public static androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo embeddedEmsgTrack(int[] iArr, int i3) {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            return new androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo(5, 1, iArr, i3, -1, -1, -1, p076i4.S0.f22832l);
        }

        public static androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo mpdEventTrack(int i3) {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            return new androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo(5, 2, new int[0], -1, -1, -1, i3, p076i4.S0.f22832l);
        }

        public static androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo primaryTrack(int i3, int[] iArr, int i9, int i10, int i11) {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            return new androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo(i3, 0, iArr, i9, i10, i11, -1, p076i4.S0.f22832l);
        }
    }

    public DashMediaPeriod(int i3, androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, androidx.media3.exoplayer.dash.BaseUrlExclusionList baseUrlExclusionList, int i9, androidx.media3.exoplayer.dash.DashChunkSource.Factory factory, androidx.media3.datasource.TransferListener transferListener, androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher2, long j, androidx.media3.exoplayer.upstream.LoaderErrorThrower loaderErrorThrower, androidx.media3.exoplayer.upstream.Allocator allocator, androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback, androidx.media3.exoplayer.analytics.PlayerId playerId, p068h4.v vVar) {
        this.id = i3;
        this.manifest = dashManifest;
        this.baseUrlExclusionList = baseUrlExclusionList;
        this.periodIndex = i9;
        this.chunkSourceFactory = factory;
        this.transferListener = transferListener;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.elapsedRealtimeOffsetMs = j;
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.playerId = playerId;
        this.downloadExecutorSupplier = vVar;
        this.playerEmsgHandler = new androidx.media3.exoplayer.dash.PlayerEmsgHandler(dashManifest, playerEmsgCallback, allocator);
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
        androidx.media3.exoplayer.dash.manifest.Period period = dashManifest.getPeriod(i9);
        java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> list = period.eventStreams;
        this.eventStreams = list;
        android.util.Pair<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[]> pairBuildTrackGroups = buildTrackGroups(drmSessionManager, factory, period.adaptationSets, list);
        this.trackGroups = (androidx.media3.exoplayer.source.TrackGroupArray) pairBuildTrackGroups.first;
        this.trackGroupInfos = (androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[]) pairBuildTrackGroups.second;
        this.endPositionUs = Long.MIN_VALUE;
    }

    private static boolean areAllSamplesSyncSamples(androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, int i3, int[] iArr, androidx.media3.exoplayer.trackselection.TrackSelection trackSelection) {
        java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list = dashManifest.getPeriod(i3).adaptationSets;
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        for (int i9 : iArr) {
            yS.d(list.get(i9).representations);
        }
        p076i4.S0 s0F = yS.f();
        for (int i10 = 0; i10 < trackSelection.length(); i10++) {
            androidx.media3.common.Format format = ((androidx.media3.exoplayer.dash.manifest.Representation) s0F.get(trackSelection.getIndexInTrackGroup(i10))).format;
            if (!androidx.media3.common.MimeTypes.allSamplesAreSyncSamples(format.sampleMimeType, format.codecs)) {
                return false;
            }
        }
        return true;
    }

    private static void buildManifestEventTrackGroupInfos(java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> list, androidx.media3.common.TrackGroup[] trackGroupArr, androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[] trackGroupInfoArr, int i3) {
        int i9 = 0;
        while (i9 < list.size()) {
            androidx.media3.exoplayer.dash.manifest.EventStream eventStream = list.get(i9);
            trackGroupArr[i3] = new androidx.media3.common.TrackGroup(eventStream.id() + ":" + i9, new androidx.media3.common.Format.Builder().setId(eventStream.id()).setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_EMSG).build());
            trackGroupInfoArr[i3] = androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo.mpdEventTrack(i9);
            i9++;
            i3++;
        }
    }

    private static int buildPrimaryAndEmbeddedTrackGroupInfos(androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.dash.DashChunkSource.Factory factory, java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, int[][] iArr, int i3, boolean[] zArr, androidx.media3.common.Format[][] formatArr, androidx.media3.common.TrackGroup[] trackGroupArr, androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[] trackGroupInfoArr) {
        int i9;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i3) {
            int[] iArr2 = iArr[i11];
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i13 : iArr2) {
                arrayList.addAll(list.get(i13).representations);
            }
            int size = arrayList.size();
            androidx.media3.common.Format[] formatArr2 = new androidx.media3.common.Format[size];
            for (int i14 = 0; i14 < size; i14++) {
                androidx.media3.common.Format format = ((androidx.media3.exoplayer.dash.manifest.Representation) arrayList.get(i14)).format;
                formatArr2[i14] = format.buildUpon().setCryptoType(drmSessionManager.getCryptoType(format)).build();
            }
            androidx.media3.exoplayer.dash.manifest.AdaptationSet adaptationSet = list.get(iArr2[0]);
            long j = adaptationSet.id;
            java.lang.String string = j != -1 ? java.lang.Long.toString(j) : com.google.android.gms.internal.play_billing.M0.l(i11, "unset:");
            int i15 = i12 + 1;
            if (zArr[i11]) {
                i9 = i12 + 2;
            } else {
                i9 = i15;
                i15 = -1;
            }
            if (formatArr[i11].length != 0) {
                i10 = i9 + 1;
            } else {
                i10 = i9;
                i9 = -1;
            }
            maybeUpdateFormatsForParsedText(factory, formatArr2);
            trackGroupArr[i12] = new androidx.media3.common.TrackGroup(string, formatArr2);
            trackGroupInfoArr[i12] = androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo.primaryTrack(adaptationSet.type, iArr2, i12, i15, i9);
            if (i15 != -1) {
                java.lang.String strO = p121o0.p.o(string, ":emsg");
                trackGroupArr[i15] = new androidx.media3.common.TrackGroup(strO, new androidx.media3.common.Format.Builder().setId(strO).setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_EMSG).setPrimaryTrackGroupId(string).build());
                trackGroupInfoArr[i15] = androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo.embeddedEmsgTrack(iArr2, i12);
            }
            if (i9 != -1) {
                java.lang.String strO2 = p121o0.p.o(string, ":cc");
                trackGroupInfoArr[i9] = androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo.embeddedClosedCaptionTrack(iArr2, i12, p076i4.AbstractC2186b0.v(formatArr[i11]));
                maybeUpdateFormatsForParsedText(factory, formatArr[i11]);
                int i16 = 0;
                while (true) {
                    androidx.media3.common.Format[] formatArr3 = formatArr[i11];
                    if (i16 >= formatArr3.length) {
                        break;
                    }
                    formatArr3[i16] = formatArr3[i16].buildUpon().setPrimaryTrackGroupId(string).build();
                    i16++;
                }
                trackGroupArr[i9] = new androidx.media3.common.TrackGroup(strO2, formatArr[i11]);
            }
            i11++;
            i12 = i10;
        }
        return i12;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> buildSampleStream(androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo trackGroupInfo, androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection, long j) {
        int i3;
        androidx.media3.common.TrackGroup trackGroup;
        p076i4.AbstractC2186b0 abstractC2186b0;
        int i9;
        androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection2;
        androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream;
        androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
        int i10 = trackGroupInfo.embeddedEventMessageTrackGroupIndex;
        boolean z6 = true;
        boolean z9 = i10 != -1;
        if (z9) {
            trackGroup = this.trackGroups.get(i10);
            i3 = 1;
        } else {
            i3 = 0;
            trackGroup = null;
        }
        int i11 = trackGroupInfo.embeddedClosedCaptionTrackGroupIndex;
        if (i11 != -1) {
            abstractC2186b0 = this.trackGroupInfos[i11].embeddedClosedCaptionTrackOriginalFormats;
        } else {
            p076i4.Z z10 = p076i4.AbstractC2186b0.f22868i;
            abstractC2186b0 = p076i4.S0.f22832l;
        }
        int size = abstractC2186b0.size() + i3;
        androidx.media3.common.Format[] formatArr = new androidx.media3.common.Format[size];
        int[] iArr = new int[size];
        if (z9) {
            formatArr[0] = trackGroup.getFormat(0);
            iArr[0] = 5;
            i9 = 1;
        } else {
            i9 = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i12 = 0; i12 < abstractC2186b0.size(); i12++) {
            androidx.media3.common.Format format = (androidx.media3.common.Format) abstractC2186b0.get(i12);
            formatArr[i9] = format;
            iArr[i9] = 3;
            arrayList.add(format);
            i9++;
        }
        androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandlerNewPlayerTrackEmsgHandler = (this.manifest.dynamic && z9) ? this.playerEmsgHandler.newPlayerTrackEmsgHandler() : null;
        long firstChunkStartTimeUs = getFirstChunkStartTimeUs(j, this.manifest, this.periodIndex, trackGroupInfo.adaptationSetIndices);
        if (this.canReportInitialDiscontinuity) {
            exoTrackSelection2 = exoTrackSelection;
            if (areAllSamplesSyncSamples(this.manifest, this.periodIndex, trackGroupInfo.adaptationSetIndices, exoTrackSelection2)) {
            }
            androidx.media3.exoplayer.dash.DashChunkSource dashChunkSourceCreateDashChunkSource = this.chunkSourceFactory.createDashChunkSource(this.manifestLoaderErrorThrower, this.manifest, this.baseUrlExclusionList, this.periodIndex, trackGroupInfo.adaptationSetIndices, exoTrackSelection2, trackGroupInfo.trackType, this.elapsedRealtimeOffsetMs, z9, arrayList, playerTrackEmsgHandlerNewPlayerTrackEmsgHandler, this.transferListener, this.playerId, this.cmcdConfiguration);
            int i13 = trackGroupInfo.trackType;
            androidx.media3.exoplayer.upstream.Allocator allocator = this.allocator;
            androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager = this.drmSessionManager;
            androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher = this.drmEventDispatcher;
            androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher2 = this.mediaSourceEventDispatcher;
            p068h4.v vVar = this.downloadExecutorSupplier;
            playerTrackEmsgHandler = playerTrackEmsgHandlerNewPlayerTrackEmsgHandler;
            chunkSampleStream = new androidx.media3.exoplayer.source.chunk.ChunkSampleStream<>(i13, iArr, formatArr, dashChunkSourceCreateDashChunkSource, this, allocator, j, drmSessionManager, eventDispatcher, loadErrorHandlingPolicy, eventDispatcher2, z6, firstChunkStartTimeUs, vVar != null ? (androidx.media3.exoplayer.util.ReleasableExecutor) vVar.get() : null);
            chunkSampleStream.setEndPositionUs(this.endPositionUs);
            synchronized (this) {
                this.trackEmsgHandlerBySampleStream.put(chunkSampleStream, playerTrackEmsgHandler);
            }
            return chunkSampleStream;
        }
        exoTrackSelection2 = exoTrackSelection;
        z6 = false;
        androidx.media3.exoplayer.dash.DashChunkSource dashChunkSourceCreateDashChunkSource2 = this.chunkSourceFactory.createDashChunkSource(this.manifestLoaderErrorThrower, this.manifest, this.baseUrlExclusionList, this.periodIndex, trackGroupInfo.adaptationSetIndices, exoTrackSelection2, trackGroupInfo.trackType, this.elapsedRealtimeOffsetMs, z9, arrayList, playerTrackEmsgHandlerNewPlayerTrackEmsgHandler, this.transferListener, this.playerId, this.cmcdConfiguration);
        int i14 = trackGroupInfo.trackType;
        androidx.media3.exoplayer.upstream.Allocator allocator2 = this.allocator;
        androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager2 = this.drmSessionManager;
        androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher3 = this.drmEventDispatcher;
        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.loadErrorHandlingPolicy;
        androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher4 = this.mediaSourceEventDispatcher;
        p068h4.v vVar2 = this.downloadExecutorSupplier;
        playerTrackEmsgHandler = playerTrackEmsgHandlerNewPlayerTrackEmsgHandler;
        chunkSampleStream = new androidx.media3.exoplayer.source.chunk.ChunkSampleStream<>(i14, iArr, formatArr, dashChunkSourceCreateDashChunkSource2, this, allocator2, j, drmSessionManager2, eventDispatcher3, loadErrorHandlingPolicy2, eventDispatcher4, z6, firstChunkStartTimeUs, vVar2 != null ? (androidx.media3.exoplayer.util.ReleasableExecutor) vVar2.get() : null);
        chunkSampleStream.setEndPositionUs(this.endPositionUs);
        synchronized (this) {
            this.trackEmsgHandlerBySampleStream.put(chunkSampleStream, playerTrackEmsgHandler);
            return chunkSampleStream;
        }
    }

    private static android.util.Pair<androidx.media3.exoplayer.source.TrackGroupArray, androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[]> buildTrackGroups(androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.dash.DashChunkSource.Factory factory, java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> list2) {
        int[][] groupedAdaptationSetIndices = getGroupedAdaptationSetIndices(list);
        int length = groupedAdaptationSetIndices.length;
        boolean[] zArr = new boolean[length];
        androidx.media3.common.Format[][] formatArr = new androidx.media3.common.Format[length][];
        int size = list2.size() + identifyEmbeddedTracks(length, list, groupedAdaptationSetIndices, zArr, formatArr) + length;
        androidx.media3.common.TrackGroup[] trackGroupArr = new androidx.media3.common.TrackGroup[size];
        androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[] trackGroupInfoArr = new androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo[size];
        buildManifestEventTrackGroupInfos(list2, trackGroupArr, trackGroupInfoArr, buildPrimaryAndEmbeddedTrackGroupInfos(drmSessionManager, factory, list, groupedAdaptationSetIndices, length, zArr, formatArr, trackGroupArr, trackGroupInfoArr));
        return android.util.Pair.create(new androidx.media3.exoplayer.source.TrackGroupArray(trackGroupArr), trackGroupInfoArr);
    }

    private static boolean canMergeAdaptationSets(androidx.media3.exoplayer.dash.manifest.AdaptationSet adaptationSet, androidx.media3.exoplayer.dash.manifest.AdaptationSet adaptationSet2) {
        if (adaptationSet.type != adaptationSet2.type) {
            return false;
        }
        if (adaptationSet.representations.isEmpty() || adaptationSet2.representations.isEmpty()) {
            return true;
        }
        androidx.media3.common.Format format = adaptationSet.representations.get(0).format;
        androidx.media3.common.Format format2 = adaptationSet2.representations.get(0).format;
        return java.util.Objects.equals(format.language, format2.language) && (format.roleFlags & (-16385)) == (format2.roleFlags & (-16385));
    }

    private static androidx.media3.exoplayer.dash.manifest.Descriptor findAdaptationSetSwitchingProperty(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list) {
        return findDescriptor(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static androidx.media3.exoplayer.dash.manifest.Descriptor findDescriptor(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list, java.lang.String str) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = list.get(i3);
            if (str.equals(descriptor.schemeIdUri)) {
                return descriptor;
            }
        }
        return null;
    }

    private static androidx.media3.exoplayer.dash.manifest.Descriptor findTrickPlayProperty(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list) {
        return findDescriptor(list, "http://dashif.org/guidelines/trickmode");
    }

    private static androidx.media3.common.Format[] getClosedCaptionTrackFormats(java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, int[] iArr) {
        for (int i3 : iArr) {
            androidx.media3.exoplayer.dash.manifest.AdaptationSet adaptationSet = list.get(i3);
            java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list2 = list.get(i3).accessibilityDescriptors;
            for (int i9 = 0; i9 < list2.size(); i9++) {
                androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = list2.get(i9);
                if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri)) {
                    return parseClosedCaptionDescriptor(descriptor, CEA608_SERVICE_DESCRIPTOR_REGEX, new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_CEA608).setId(adaptationSet.id + ":cea608").build());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri)) {
                    return parseClosedCaptionDescriptor(descriptor, CEA708_SERVICE_DESCRIPTOR_REGEX, new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_CEA708).setId(adaptationSet.id + ":cea708").build());
                }
            }
        }
        return new androidx.media3.common.Format[0];
    }

    private static long getFirstChunkStartTimeUs(long j, androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, int i3, int[] iArr) {
        androidx.media3.exoplayer.dash.DashSegmentIndex index = dashManifest.getPeriod(i3).adaptationSets.get(iArr[0]).representations.get(0).getIndex();
        return index == null ? androidx.media3.common.C.TIME_UNSET : index.getTimeUs(index.getSegmentNum(j, dashManifest.getPeriodDurationUs(i3)));
    }

    private static int[][] getGroupedAdaptationSetIndices(java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list) {
        androidx.media3.exoplayer.dash.manifest.Descriptor descriptorFindAdaptationSetSwitchingProperty;
        java.lang.Integer num;
        int size = list.size();
        java.util.HashMap map = new java.util.HashMap(p076i4.AbstractC2230y.a(size));
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        android.util.SparseArray sparseArray = new android.util.SparseArray(size);
        for (int i3 = 0; i3 < size; i3++) {
            map.put(java.lang.Long.valueOf(list.get(i3).id), java.lang.Integer.valueOf(i3));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i3));
            arrayList.add(arrayList2);
            sparseArray.put(i3, arrayList2);
        }
        for (int i9 = 0; i9 < size; i9++) {
            androidx.media3.exoplayer.dash.manifest.AdaptationSet adaptationSet = list.get(i9);
            androidx.media3.exoplayer.dash.manifest.Descriptor descriptorFindTrickPlayProperty = findTrickPlayProperty(adaptationSet.essentialProperties);
            if (descriptorFindTrickPlayProperty == null) {
                descriptorFindTrickPlayProperty = findTrickPlayProperty(adaptationSet.supplementalProperties);
            }
            int iIntValue = (descriptorFindTrickPlayProperty == null || (num = (java.lang.Integer) map.get(java.lang.Long.valueOf(java.lang.Long.parseLong(descriptorFindTrickPlayProperty.value)))) == null || !canMergeAdaptationSets(adaptationSet, list.get(num.intValue()))) ? i9 : num.intValue();
            if (iIntValue == i9 && (descriptorFindAdaptationSetSwitchingProperty = findAdaptationSetSwitchingProperty(adaptationSet.supplementalProperties)) != null) {
                for (java.lang.String str : androidx.media3.common.util.Util.split(descriptorFindAdaptationSetSwitchingProperty.value, ",")) {
                    java.lang.Integer num2 = (java.lang.Integer) map.get(java.lang.Long.valueOf(java.lang.Long.parseLong(str)));
                    if (num2 != null && canMergeAdaptationSets(adaptationSet, list.get(num2.intValue()))) {
                        iIntValue = java.lang.Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i9) {
                java.util.List list2 = (java.util.List) sparseArray.get(i9);
                java.util.List list3 = (java.util.List) sparseArray.get(iIntValue);
                list3.addAll(list2);
                sparseArray.put(i9, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i10 = 0; i10 < size2; i10++) {
            int[] iArrH = com.google.crypto.tink.shaded.protobuf.q0.H((java.util.Collection) arrayList.get(i10));
            iArr[i10] = iArrH;
            java.util.Arrays.sort(iArrH);
        }
        return iArr;
    }

    private int getPrimaryStreamIndex(int i3, int[] iArr) {
        int i9 = iArr[i3];
        if (i9 == -1) {
            return -1;
        }
        int i10 = this.trackGroupInfos[i9].primaryTrackGroupIndex;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 == i10 && this.trackGroupInfos[i12].trackGroupCategory == 0) {
                return i11;
            }
        }
        return -1;
    }

    private int[] getStreamIndexToTrackGroupIndex(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if (exoTrackSelection != null) {
                iArr[i3] = this.trackGroups.indexOf(exoTrackSelection.getTrackGroup());
            } else {
                iArr[i3] = -1;
            }
        }
        return iArr;
    }

    private static boolean hasEventMessageTrack(java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, int[] iArr) {
        for (int i3 : iArr) {
            java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> list2 = list.get(i3).representations;
            for (int i9 = 0; i9 < list2.size(); i9++) {
                if (!list2.get(i9).inbandEventStreams.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int identifyEmbeddedTracks(int i3, java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, int[][] iArr, boolean[] zArr, androidx.media3.common.Format[][] formatArr) {
        int i9 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            if (hasEventMessageTrack(list, iArr[i10])) {
                zArr[i10] = true;
                i9++;
            }
            androidx.media3.common.Format[] closedCaptionTrackFormats = getClosedCaptionTrackFormats(list, iArr[i10]);
            formatArr[i10] = closedCaptionTrackFormats;
            if (closedCaptionTrackFormats.length != 0) {
                i9++;
            }
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.List lambda$selectTracks$0(androidx.media3.exoplayer.source.chunk.ChunkSampleStream chunkSampleStream) {
        return p076i4.AbstractC2186b0.y(java.lang.Integer.valueOf(chunkSampleStream.primaryTrackType));
    }

    private boolean mayHaveAnyStreamWithPendingInitialDiscontinuity() {
        for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : this.sampleStreams) {
            if (chunkSampleStream.mayHaveInitialDiscontinuity()) {
                return true;
            }
        }
        return false;
    }

    private static void maybeUpdateFormatsForParsedText(androidx.media3.exoplayer.dash.DashChunkSource.Factory factory, androidx.media3.common.Format[] formatArr) {
        for (int i3 = 0; i3 < formatArr.length; i3++) {
            formatArr[i3] = factory.getOutputTextFormat(formatArr[i3]);
        }
    }

    private static androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource>[] newSampleStreamArray(int i3) {
        return new androidx.media3.exoplayer.source.chunk.ChunkSampleStream[i3];
    }

    private static androidx.media3.common.Format[] parseClosedCaptionDescriptor(androidx.media3.exoplayer.dash.manifest.Descriptor descriptor, java.util.regex.Pattern pattern, androidx.media3.common.Format format) {
        java.lang.String str = descriptor.value;
        if (str == null) {
            return new androidx.media3.common.Format[]{format};
        }
        java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(str, ";");
        androidx.media3.common.Format[] formatArr = new androidx.media3.common.Format[strArrSplit.length];
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            java.util.regex.Matcher matcher = pattern.matcher(strArrSplit[i3]);
            if (!matcher.matches()) {
                return new androidx.media3.common.Format[]{format};
            }
            int i9 = java.lang.Integer.parseInt(matcher.group(1));
            formatArr[i3] = format.buildUpon().setId(format.id + ":" + i9).setAccessibilityChannel(i9).setLanguage(matcher.group(2)).build();
        }
        return formatArr;
    }

    private void releaseDisabledStreams(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr) {
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            if (exoTrackSelectionArr[i3] == null || !zArr[i3]) {
                androidx.media3.exoplayer.source.SampleStream sampleStream = sampleStreamArr[i3];
                if (sampleStream instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream) {
                    ((androidx.media3.exoplayer.source.chunk.ChunkSampleStream) sampleStream).release(this);
                } else if (sampleStream instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream) {
                    ((androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream) sampleStream).release();
                }
                sampleStreamArr[i3] = null;
            }
        }
    }

    private void releaseOrphanEmbeddedStreams(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, int[] iArr) {
        boolean z6;
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            androidx.media3.exoplayer.source.SampleStream sampleStream = sampleStreamArr[i3];
            if ((sampleStream instanceof androidx.media3.exoplayer.source.EmptySampleStream) || (sampleStream instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream)) {
                int primaryStreamIndex = getPrimaryStreamIndex(i3, iArr);
                if (primaryStreamIndex == -1) {
                    z6 = sampleStreamArr[i3] instanceof androidx.media3.exoplayer.source.EmptySampleStream;
                } else {
                    androidx.media3.exoplayer.source.SampleStream sampleStream2 = sampleStreamArr[i3];
                    z6 = (sampleStream2 instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream) && ((androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream) sampleStream2).parent == sampleStreamArr[primaryStreamIndex];
                }
                if (!z6) {
                    androidx.media3.exoplayer.source.SampleStream sampleStream3 = sampleStreamArr[i3];
                    if (sampleStream3 instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream) {
                        ((androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream) sampleStream3).release();
                    }
                    sampleStreamArr[i3] = null;
                }
            }
        }
    }

    private void selectNewStreams(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr, long j, int[] iArr) {
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if (exoTrackSelection != null) {
                androidx.media3.exoplayer.source.SampleStream sampleStream = sampleStreamArr[i3];
                if (sampleStream == null) {
                    zArr[i3] = true;
                    androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo trackGroupInfo = this.trackGroupInfos[iArr[i3]];
                    int i9 = trackGroupInfo.trackGroupCategory;
                    if (i9 == 0) {
                        sampleStreamArr[i3] = buildSampleStream(trackGroupInfo, exoTrackSelection, j);
                    } else if (i9 == 2) {
                        sampleStreamArr[i3] = new androidx.media3.exoplayer.dash.EventSampleStream(this.eventStreams.get(trackGroupInfo.eventStreamGroupIndex), exoTrackSelection.getTrackGroup().getFormat(0), this.manifest.dynamic);
                    }
                } else if (sampleStream instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream) {
                    ((androidx.media3.exoplayer.dash.DashChunkSource) ((androidx.media3.exoplayer.source.chunk.ChunkSampleStream) sampleStream).getChunkSource()).updateTrackSelection(exoTrackSelection);
                }
            }
        }
        for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
            if (sampleStreamArr[i10] == null && exoTrackSelectionArr[i10] != null) {
                androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo trackGroupInfo2 = this.trackGroupInfos[iArr[i10]];
                if (trackGroupInfo2.trackGroupCategory == 1) {
                    int primaryStreamIndex = getPrimaryStreamIndex(i10, iArr);
                    if (primaryStreamIndex == -1) {
                        sampleStreamArr[i10] = new androidx.media3.exoplayer.source.EmptySampleStream();
                    } else {
                        sampleStreamArr[i10] = ((androidx.media3.exoplayer.source.chunk.ChunkSampleStream) sampleStreamArr[primaryStreamIndex]).selectEmbeddedTrack(j, trackGroupInfo2.trackType);
                    }
                }
            }
        }
    }

    private void setSuppressReadOnAllStreams(boolean z6) {
        this.readingSuppressedWaitingForInitialDiscontinuity = z6;
        for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.setSuppressRead(z6);
        }
    }

    private boolean tryConsumeInitialDiscontinuityFromStreams() {
        boolean zConsumeInitialDiscontinuity = false;
        for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : this.sampleStreams) {
            zConsumeInitialDiscontinuity |= chunkSampleStream.consumeInitialDiscontinuity();
        }
        return zConsumeInitialDiscontinuity;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        return this.compositeSequenceableLoader.continueLoading(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z6) {
        for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.discardBuffer(j, z6);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : this.sampleStreams) {
            if (chunkSampleStream.primaryTrackType == 2) {
                return chunkSampleStream.getAdjustedSeekPositionUs(j, seekParameters);
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

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public java.util.List<androidx.media3.common.StreamKey> getStreamKeys(java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> list) {
        java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list2 = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : list) {
            androidx.media3.exoplayer.dash.DashMediaPeriod.TrackGroupInfo trackGroupInfo = this.trackGroupInfos[this.trackGroups.indexOf(exoTrackSelection.getTrackGroup())];
            if (trackGroupInfo.trackGroupCategory == 0) {
                int[] iArr = trackGroupInfo.adaptationSetIndices;
                int length = exoTrackSelection.length();
                int[] iArr2 = new int[length];
                for (int i3 = 0; i3 < exoTrackSelection.length(); i3++) {
                    iArr2[i3] = exoTrackSelection.getIndexInTrackGroup(i3);
                }
                java.util.Arrays.sort(iArr2);
                int size = list2.get(iArr[0]).representations.size();
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = iArr2[i11];
                    while (true) {
                        int i13 = i10 + size;
                        if (i12 >= i13) {
                            i9++;
                            size = list2.get(iArr[i9]).representations.size();
                            i10 = i13;
                        }
                    }
                    arrayList.add(new androidx.media3.common.StreamKey(this.periodIndex, iArr[i9], i12 - i10));
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() {
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback
    public synchronized void onSampleStreamReleased(androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream) {
        androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandlerRemove = this.trackEmsgHandlerBySampleStream.remove(chunkSampleStream);
        if (playerTrackEmsgHandlerRemove != null) {
            playerTrackEmsgHandlerRemove.release();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        callback.onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        if (!this.readingSuppressedWaitingForInitialDiscontinuity) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        boolean zTryConsumeInitialDiscontinuityFromStreams = tryConsumeInitialDiscontinuityFromStreams();
        if (!mayHaveAnyStreamWithPendingInitialDiscontinuity()) {
            setSuppressReadOnAllStreams(false);
        }
        return zTryConsumeInitialDiscontinuityFromStreams ? this.initialStartTimeUs : androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : this.sampleStreams) {
            if (!chunkSampleStream.isLoading()) {
                chunkSampleStream.discardUpstreamSamplesForClippedDuration(this.manifest.getPeriodDurationUs(this.periodIndex));
            }
        }
        this.compositeSequenceableLoader.reevaluateBuffer(j);
    }

    public void release() {
        this.playerEmsgHandler.release();
        for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.release(this);
        }
        this.callback = null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.seekToUs(j);
        }
        for (androidx.media3.exoplayer.dash.EventSampleStream eventSampleStream : this.eventSampleStreams) {
            eventSampleStream.seekToUs(j);
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        int[] streamIndexToTrackGroupIndex = getStreamIndexToTrackGroupIndex(exoTrackSelectionArr);
        releaseDisabledStreams(exoTrackSelectionArr, zArr, sampleStreamArr);
        releaseOrphanEmbeddedStreams(exoTrackSelectionArr, sampleStreamArr, streamIndexToTrackGroupIndex);
        selectNewStreams(exoTrackSelectionArr, sampleStreamArr, zArr2, j, streamIndexToTrackGroupIndex);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (androidx.media3.exoplayer.source.SampleStream sampleStream : sampleStreamArr) {
            if (sampleStream instanceof androidx.media3.exoplayer.source.chunk.ChunkSampleStream) {
                arrayList.add((androidx.media3.exoplayer.source.chunk.ChunkSampleStream) sampleStream);
            } else if (sampleStream instanceof androidx.media3.exoplayer.dash.EventSampleStream) {
                arrayList2.add((androidx.media3.exoplayer.dash.EventSampleStream) sampleStream);
            }
        }
        androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource>[] chunkSampleStreamArrNewSampleStreamArray = newSampleStreamArray(arrayList.size());
        this.sampleStreams = chunkSampleStreamArrNewSampleStreamArray;
        arrayList.toArray(chunkSampleStreamArrNewSampleStreamArray);
        androidx.media3.exoplayer.dash.EventSampleStream[] eventSampleStreamArr = new androidx.media3.exoplayer.dash.EventSampleStream[arrayList2.size()];
        this.eventSampleStreams = eventSampleStreamArr;
        arrayList2.toArray(eventSampleStreamArr);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(arrayList, p076i4.AbstractC2230y.A(arrayList, new androidx.media3.exoplayer.dash.b()));
        if (this.canReportInitialDiscontinuity) {
            this.canReportInitialDiscontinuity = false;
            this.initialStartTimeUs = j;
            if (mayHaveAnyStreamWithPendingInitialDiscontinuity()) {
                setSuppressReadOnAllStreams(true);
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long setEndPositionUs(long j) {
        this.endPositionUs = j;
        for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.setEndPositionUs(j);
        }
        return j;
    }

    public void updateManifest(androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, int i3) {
        this.manifest = dashManifest;
        this.periodIndex = i3;
        this.playerEmsgHandler.updateManifest(dashManifest);
        androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource>[] chunkSampleStreamArr = this.sampleStreams;
        if (chunkSampleStreamArr != null) {
            for (androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream : chunkSampleStreamArr) {
                ((androidx.media3.exoplayer.dash.DashChunkSource) chunkSampleStream.getChunkSource()).updateManifest(dashManifest, i3);
            }
            this.callback.onContinueLoadingRequested(this);
        }
        this.eventStreams = dashManifest.getPeriod(i3).eventStreams;
        for (androidx.media3.exoplayer.dash.EventSampleStream eventSampleStream : this.eventSampleStreams) {
            for (androidx.media3.exoplayer.dash.manifest.EventStream eventStream : this.eventStreams) {
                if (eventStream.id().equals(eventSampleStream.eventStreamId())) {
                    eventSampleStream.updateEventStream(eventStream, dashManifest.dynamic && i3 == dashManifest.getPeriodCount() - 1);
                    break;
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(androidx.media3.exoplayer.source.chunk.ChunkSampleStream<androidx.media3.exoplayer.dash.DashChunkSource> chunkSampleStream) {
        this.callback.onContinueLoadingRequested(this);
    }
}
