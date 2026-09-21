package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
final class HlsSampleStreamWrapper implements androidx.media3.exoplayer.upstream.Loader.Callback<androidx.media3.exoplayer.source.chunk.Chunk>, androidx.media3.exoplayer.upstream.Loader.ReleaseCallback, androidx.media3.exoplayer.source.SequenceableLoader, androidx.media3.extractor.ExtractorOutput, androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener {
    private static final java.util.Set<java.lang.Integer> MAPPABLE_TYPES = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(1, 2, 5)));
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_FATAL = -2;
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_NON_FATAL = -3;
    public static final int SAMPLE_QUEUE_INDEX_PENDING = -1;
    private static final java.lang.String TAG = "HlsSampleStreamWrapper";
    private final androidx.media3.exoplayer.upstream.Allocator allocator;
    private final androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback callback;
    private final androidx.media3.exoplayer.hls.HlsChunkSource chunkSource;
    private androidx.media3.common.Format downstreamTrackFormat;
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private androidx.media3.common.DrmInitData drmInitData;
    private final androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager;
    private androidx.media3.extractor.TrackOutput emsgUnwrappingTrackOutput;
    private int enabledTrackGroupCount;
    private long endPositionUs;
    private final android.os.Handler handler;
    private boolean haveAudioVideoSampleQueues;
    private final java.util.ArrayList<androidx.media3.exoplayer.hls.HlsSampleStream> hlsSampleStreams;
    private long lastSeekPositionUs;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final androidx.media3.exoplayer.upstream.Loader loader;
    private androidx.media3.exoplayer.source.chunk.Chunk loadingChunk;
    private boolean loadingFinished;
    private final java.lang.Runnable maybeFinishPrepareRunnable;
    private final java.util.ArrayList<androidx.media3.exoplayer.hls.HlsMediaChunk> mediaChunks;
    private final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final int metadataType;
    private final androidx.media3.common.Format muxedAudioFormat;
    private final androidx.media3.exoplayer.hls.HlsChunkSource.HlsChunkHolder nextChunkHolder;
    private final java.lang.Runnable onTracksEndedRunnable;
    private java.util.Set<androidx.media3.common.TrackGroup> optionalTrackGroups;
    private final java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> overridingDrmInitData;
    private long pendingResetPositionUs;
    private boolean pendingResetUpstreamFormats;
    private boolean prepared;
    private int primarySampleQueueIndex;
    private int primarySampleQueueType;
    private int primaryTrackGroupIndex;
    private final java.util.List<androidx.media3.exoplayer.hls.HlsMediaChunk> readOnlyMediaChunks;
    private boolean released;
    private long sampleOffsetUs;
    private android.util.SparseIntArray sampleQueueIndicesByType;
    private boolean[] sampleQueueIsAudioVideoFlags;
    private java.util.Set<java.lang.Integer> sampleQueueMappingDoneByType;
    private int[] sampleQueueTrackIds;
    private androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private boolean[] sampleQueuesEnabledStates;
    private boolean seenFirstTrackSelection;
    private androidx.media3.exoplayer.hls.HlsMediaChunk sourceChunk;
    private int[] trackGroupToSampleQueueIndex;
    private androidx.media3.exoplayer.source.TrackGroupArray trackGroups;
    private final int trackType;
    private boolean tracksEnded;
    private final java.lang.String uid;
    private androidx.media3.common.Format upstreamTrackFormat;

    public interface Callback extends androidx.media3.exoplayer.source.SequenceableLoader.Callback<androidx.media3.exoplayer.hls.HlsSampleStreamWrapper> {
        void onPlaylistRefreshRequired(android.net.Uri uri);

        void onPrepared();
    }

    public static final class HlsSampleQueue extends androidx.media3.exoplayer.source.SampleQueue {
        private androidx.media3.common.DrmInitData drmInitData;
        private final java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> overridingDrmInitData;

        private androidx.media3.common.Metadata getAdjustedMetadata(androidx.media3.common.Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int length = metadata.length();
            int i3 = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    i9 = -1;
                    break;
                }
                androidx.media3.common.Metadata.Entry entry = metadata.get(i9);
                if ((entry instanceof androidx.media3.extractor.metadata.id3.PrivFrame) && androidx.media3.exoplayer.hls.HlsMediaChunk.PRIV_TIMESTAMP_FRAME_OWNER.equals(((androidx.media3.extractor.metadata.id3.PrivFrame) entry).owner)) {
                    break;
                }
                i9++;
            }
            if (i9 == -1) {
                return metadata;
            }
            if (length == 1) {
                return null;
            }
            androidx.media3.common.Metadata.Entry[] entryArr = new androidx.media3.common.Metadata.Entry[length - 1];
            while (i3 < length) {
                if (i3 != i9) {
                    entryArr[i3 < i9 ? i3 : i3 - 1] = metadata.get(i3);
                }
                i3++;
            }
            return new androidx.media3.common.Metadata(entryArr);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue
        public androidx.media3.common.Format getAdjustedUpstreamFormat(androidx.media3.common.Format format) {
            androidx.media3.common.DrmInitData drmInitData;
            androidx.media3.common.DrmInitData drmInitData2 = this.drmInitData;
            if (drmInitData2 == null) {
                drmInitData2 = format.drmInitData;
            }
            if (drmInitData2 != null && (drmInitData = this.overridingDrmInitData.get(drmInitData2.schemeType)) != null) {
                drmInitData2 = drmInitData;
            }
            androidx.media3.common.Metadata adjustedMetadata = getAdjustedMetadata(format.metadata);
            if (drmInitData2 != format.drmInitData || adjustedMetadata != format.metadata) {
                format = format.buildUpon().setDrmInitData(drmInitData2).setMetadata(adjustedMetadata).build();
            }
            return super.getAdjustedUpstreamFormat(format);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j, int i3, int i9, int i10, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
            super.sampleMetadata(j, i3, i9, i10, cryptoData);
        }

        public void setDrmInitData(androidx.media3.common.DrmInitData drmInitData) {
            this.drmInitData = drmInitData;
            invalidateUpstreamFormatAdjustment();
        }

        public void setSourceChunk(androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk) {
            sourceId(hlsMediaChunk.uid);
        }

        private HlsSampleQueue(androidx.media3.exoplayer.upstream.Allocator allocator, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> map) {
            super(allocator, drmSessionManager, eventDispatcher);
            this.overridingDrmInitData = map;
        }
    }

    public HlsSampleStreamWrapper(java.lang.String str, int i3, androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback callback, androidx.media3.exoplayer.hls.HlsChunkSource hlsChunkSource, java.util.Map<java.lang.String, androidx.media3.common.DrmInitData> map, androidx.media3.exoplayer.upstream.Allocator allocator, long j, androidx.media3.common.Format format, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher2, int i9, androidx.media3.exoplayer.util.ReleasableExecutor releasableExecutor) {
        this.uid = str;
        this.trackType = i3;
        this.callback = callback;
        this.chunkSource = hlsChunkSource;
        this.overridingDrmInitData = map;
        this.allocator = allocator;
        this.muxedAudioFormat = format;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.metadataType = i9;
        this.loader = releasableExecutor != null ? new androidx.media3.exoplayer.upstream.Loader(releasableExecutor) : new androidx.media3.exoplayer.upstream.Loader("Loader:HlsSampleStreamWrapper");
        this.nextChunkHolder = new androidx.media3.exoplayer.hls.HlsChunkSource.HlsChunkHolder();
        this.sampleQueueTrackIds = new int[0];
        java.util.Set<java.lang.Integer> set = MAPPABLE_TYPES;
        this.sampleQueueMappingDoneByType = new java.util.HashSet(set.size());
        this.sampleQueueIndicesByType = new android.util.SparseIntArray(set.size());
        this.sampleQueues = new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue[0];
        this.sampleQueueIsAudioVideoFlags = new boolean[0];
        this.sampleQueuesEnabledStates = new boolean[0];
        java.util.ArrayList<androidx.media3.exoplayer.hls.HlsMediaChunk> arrayList = new java.util.ArrayList<>();
        this.mediaChunks = arrayList;
        this.readOnlyMediaChunks = java.util.Collections.unmodifiableList(arrayList);
        this.hlsSampleStreams = new java.util.ArrayList<>();
        this.maybeFinishPrepareRunnable = new androidx.media3.exoplayer.hls.k(0, this);
        this.onTracksEndedRunnable = new androidx.media3.exoplayer.hls.k(1, this);
        this.handler = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
        this.lastSeekPositionUs = j;
        this.pendingResetPositionUs = j;
        this.endPositionUs = Long.MIN_VALUE;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    private void assertIsPrepared() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.prepared);
        this.trackGroups.getClass();
        this.optionalTrackGroups.getClass();
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    private void buildTracksFromSampleStreams() {
        androidx.media3.common.Format format;
        int length = this.sampleQueues.length;
        int i3 = -2;
        int i9 = -1;
        int i10 = 0;
        while (true) {
            int i11 = 2;
            if (i10 >= length) {
                break;
            }
            androidx.media3.common.Format upstreamFormat = this.sampleQueues[i10].getUpstreamFormat();
            upstreamFormat.getClass();
            java.lang.String str = upstreamFormat.sampleMimeType;
            if (!androidx.media3.common.MimeTypes.isVideo(str)) {
                i11 = androidx.media3.common.MimeTypes.isAudio(str) ? 1 : androidx.media3.common.MimeTypes.isText(str) ? 3 : -2;
            }
            if (getTrackTypeScore(i11) > getTrackTypeScore(i3)) {
                i9 = i10;
                i3 = i11;
            } else if (i11 == i3 && i9 != -1) {
                i9 = -1;
            }
            i10++;
        }
        androidx.media3.common.TrackGroup trackGroup = this.chunkSource.getTrackGroup();
        int i12 = trackGroup.length;
        this.primaryTrackGroupIndex = -1;
        this.trackGroupToSampleQueueIndex = new int[length];
        for (int i13 = 0; i13 < length; i13++) {
            this.trackGroupToSampleQueueIndex[i13] = i13;
        }
        androidx.media3.common.TrackGroup[] trackGroupArr = new androidx.media3.common.TrackGroup[length];
        int i14 = 0;
        while (i14 < length) {
            androidx.media3.common.Format upstreamFormat2 = this.sampleQueues[i14].getUpstreamFormat();
            upstreamFormat2.getClass();
            if (i14 == i9) {
                androidx.media3.common.Format[] formatArr = new androidx.media3.common.Format[i12];
                for (int i15 = 0; i15 < i12; i15++) {
                    androidx.media3.common.Format format2 = trackGroup.getFormat(i15);
                    if (i3 == 1 && (format = this.muxedAudioFormat) != null) {
                        format2 = format2.withManifestFormatInfo(format);
                    }
                    formatArr[i15] = i12 == 1 ? upstreamFormat2.withManifestFormatInfo(format2) : deriveFormat(format2, upstreamFormat2, true);
                }
                trackGroupArr[i14] = new androidx.media3.common.TrackGroup(this.uid, formatArr);
                this.primaryTrackGroupIndex = i14;
            } else {
                androidx.media3.common.Format format3 = (i3 == 2 && androidx.media3.common.MimeTypes.isAudio(upstreamFormat2.sampleMimeType)) ? this.muxedAudioFormat : null;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.uid);
                sb.append(":muxed:");
                sb.append(i14 < i9 ? i14 : i14 - 1);
                trackGroupArr[i14] = new androidx.media3.common.TrackGroup(sb.toString(), deriveFormat(format3, upstreamFormat2, false).buildUpon().setPrimaryTrackGroupId(this.uid).build());
            }
            i14++;
        }
        this.trackGroups = createTrackGroupArrayWithDrmInfo(trackGroupArr);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.optionalTrackGroups == null);
        this.optionalTrackGroups = java.util.Collections.EMPTY_SET;
    }

    private boolean canDiscardUpstreamMediaChunksFromIndex(int i3) {
        for (int i9 = i3; i9 < this.mediaChunks.size(); i9++) {
            if (this.mediaChunks.get(i9).shouldSpliceIn()) {
                return false;
            }
        }
        androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(i3);
        for (int i10 = 0; i10 < this.sampleQueues.length; i10++) {
            if (this.sampleQueues[i10].getReadIndex() > hlsMediaChunk.getFirstSampleIndex(i10)) {
                return false;
            }
        }
        return true;
    }

    private static androidx.media3.extractor.DiscardingTrackOutput createDiscardingTrackOutput(int i3, int i9) {
        androidx.media3.common.util.Log.w(TAG, "Unmapped track with id " + i3 + " of type " + i9);
        return new androidx.media3.extractor.DiscardingTrackOutput();
    }

    private androidx.media3.exoplayer.source.SampleQueue createSampleQueue(int i3, int i9) {
        int length = this.sampleQueues.length;
        boolean z6 = true;
        if (i9 != 1 && i9 != 2) {
            z6 = false;
        }
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue = new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue(this.allocator, this.drmSessionManager, this.drmEventDispatcher, this.overridingDrmInitData);
        hlsSampleQueue.setStartTimeUs(this.lastSeekPositionUs);
        if (z6) {
            hlsSampleQueue.setDrmInitData(this.drmInitData);
        }
        hlsSampleQueue.setSampleOffsetUs(this.sampleOffsetUs);
        androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk = this.sourceChunk;
        if (hlsMediaChunk != null) {
            hlsSampleQueue.setSourceChunk(hlsMediaChunk);
        }
        hlsSampleQueue.setUpstreamFormatChangeListener(this);
        int i10 = length + 1;
        int[] iArrCopyOf = java.util.Arrays.copyOf(this.sampleQueueTrackIds, i10);
        this.sampleQueueTrackIds = iArrCopyOf;
        iArrCopyOf[length] = i3;
        this.sampleQueues = (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue[]) androidx.media3.common.util.Util.nullSafeArrayAppend(this.sampleQueues, hlsSampleQueue);
        boolean[] zArrCopyOf = java.util.Arrays.copyOf(this.sampleQueueIsAudioVideoFlags, i10);
        this.sampleQueueIsAudioVideoFlags = zArrCopyOf;
        zArrCopyOf[length] = z6;
        this.haveAudioVideoSampleQueues |= z6;
        this.sampleQueueMappingDoneByType.add(java.lang.Integer.valueOf(i9));
        this.sampleQueueIndicesByType.append(i9, length);
        if (getTrackTypeScore(i9) > getTrackTypeScore(this.primarySampleQueueType)) {
            this.primarySampleQueueIndex = length;
            this.primarySampleQueueType = i9;
        }
        this.sampleQueuesEnabledStates = java.util.Arrays.copyOf(this.sampleQueuesEnabledStates, i10);
        return hlsSampleQueue;
    }

    private androidx.media3.exoplayer.source.TrackGroupArray createTrackGroupArrayWithDrmInfo(androidx.media3.common.TrackGroup[] trackGroupArr) {
        for (int i3 = 0; i3 < trackGroupArr.length; i3++) {
            androidx.media3.common.TrackGroup trackGroup = trackGroupArr[i3];
            androidx.media3.common.Format[] formatArr = new androidx.media3.common.Format[trackGroup.length];
            for (int i9 = 0; i9 < trackGroup.length; i9++) {
                androidx.media3.common.Format format = trackGroup.getFormat(i9);
                formatArr[i9] = format.copyWithCryptoType(this.drmSessionManager.getCryptoType(format));
            }
            trackGroupArr[i3] = new androidx.media3.common.TrackGroup(trackGroup.id, formatArr);
        }
        return new androidx.media3.exoplayer.source.TrackGroupArray(trackGroupArr);
    }

    private static androidx.media3.common.Format deriveFormat(androidx.media3.common.Format format, androidx.media3.common.Format format2, boolean z6) {
        java.lang.String codecsCorrespondingToMimeType;
        java.lang.String mediaMimeType;
        if (format == null) {
            return format2;
        }
        int trackType = androidx.media3.common.MimeTypes.getTrackType(format2.sampleMimeType);
        if (androidx.media3.common.util.Util.getCodecCountOfType(format.codecs, trackType) == 1) {
            codecsCorrespondingToMimeType = androidx.media3.common.util.Util.getCodecsOfType(format.codecs, trackType);
            mediaMimeType = androidx.media3.common.MimeTypes.getMediaMimeType(codecsCorrespondingToMimeType);
        } else {
            codecsCorrespondingToMimeType = androidx.media3.common.MimeTypes.getCodecsCorrespondingToMimeType(format.codecs, format2.sampleMimeType);
            mediaMimeType = format2.sampleMimeType;
        }
        androidx.media3.common.Format.Builder codecs = format2.buildUpon().setId(format.id).setLabel(format.label).setLabels(format.labels).setLanguage(format.language).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).setAverageBitrate(z6 ? format.averageBitrate : -1).setPeakBitrate(z6 ? format.peakBitrate : -1).setCodecs(codecsCorrespondingToMimeType);
        if (trackType == 2) {
            codecs.setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate);
        }
        if (mediaMimeType != null) {
            codecs.setSampleMimeType(mediaMimeType);
        }
        int i3 = format.channelCount;
        if (i3 != -1 && trackType == 1) {
            codecs.setChannelCount(i3);
        }
        androidx.media3.common.Metadata metadataCopyWithAppendedEntriesFrom = format.metadata;
        if (metadataCopyWithAppendedEntriesFrom != null) {
            androidx.media3.common.Metadata metadata = format2.metadata;
            if (metadata != null) {
                metadataCopyWithAppendedEntriesFrom = metadata.copyWithAppendedEntriesFrom(metadataCopyWithAppendedEntriesFrom);
            }
            codecs.setMetadata(metadataCopyWithAppendedEntriesFrom);
        }
        return codecs.build();
    }

    private void discardUpstream(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.loader.isLoading());
        while (true) {
            if (i3 >= this.mediaChunks.size()) {
                i3 = -1;
                break;
            } else if (canDiscardUpstreamMediaChunksFromIndex(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        long j = getLastMediaChunk().endTimeUs;
        androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunkDiscardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(i3);
        if (this.mediaChunks.isEmpty()) {
            this.pendingResetPositionUs = this.lastSeekPositionUs;
        } else {
            ((androidx.media3.exoplayer.hls.HlsMediaChunk) p076i4.AbstractC2230y.l(this.mediaChunks)).invalidateExtractor();
        }
        this.loadingFinished = false;
        this.mediaSourceEventDispatcher.upstreamDiscarded(this.primarySampleQueueType, hlsMediaChunkDiscardUpstreamMediaChunksFromIndex.startTimeUs, j);
    }

    private androidx.media3.exoplayer.hls.HlsMediaChunk discardUpstreamMediaChunksFromIndex(int i3) {
        androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(i3);
        java.util.ArrayList<androidx.media3.exoplayer.hls.HlsMediaChunk> arrayList = this.mediaChunks;
        androidx.media3.common.util.Util.removeRange(arrayList, i3, arrayList.size());
        for (int i9 = 0; i9 < this.sampleQueues.length; i9++) {
            this.sampleQueues[i9].discardUpstreamSamples(hlsMediaChunk.getFirstSampleIndex(i9));
        }
        return hlsMediaChunk;
    }

    private boolean finishedReadingChunk(androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk) {
        int i3 = hlsMediaChunk.uid;
        int length = this.sampleQueues.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (this.sampleQueuesEnabledStates[i9] && this.sampleQueues[i9].peekSourceId() == i3) {
                return false;
            }
        }
        return true;
    }

    private static boolean formatsMatch(androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        java.lang.String str = format.sampleMimeType;
        java.lang.String str2 = format2.sampleMimeType;
        int trackType = androidx.media3.common.MimeTypes.getTrackType(str);
        if (trackType != 3) {
            return trackType == androidx.media3.common.MimeTypes.getTrackType(str2);
        }
        if (java.util.Objects.equals(str, str2)) {
            return !(androidx.media3.common.MimeTypes.APPLICATION_CEA608.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_CEA708.equals(str)) || format.accessibilityChannel == format2.accessibilityChannel;
        }
        return false;
    }

    private androidx.media3.exoplayer.hls.HlsMediaChunk getLastMediaChunk() {
        return (androidx.media3.exoplayer.hls.HlsMediaChunk) com.google.android.gms.internal.play_billing.M0.j(1, this.mediaChunks);
    }

    private androidx.media3.extractor.TrackOutput getMappedTrackOutput(int i3, int i9) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(MAPPABLE_TYPES.contains(java.lang.Integer.valueOf(i9)));
        int i10 = this.sampleQueueIndicesByType.get(i9, -1);
        if (i10 == -1) {
            return null;
        }
        if (this.sampleQueueMappingDoneByType.add(java.lang.Integer.valueOf(i9))) {
            this.sampleQueueTrackIds[i10] = i3;
        }
        return this.sampleQueueTrackIds[i10] == i3 ? this.sampleQueues[i10] : createDiscardingTrackOutput(i3, i9);
    }

    private static int getTrackTypeScore(int i3) {
        if (i3 == 1) {
            return 2;
        }
        if (i3 != 2) {
            return i3 != 3 ? 0 : 1;
        }
        return 3;
    }

    private boolean haveSampleQueuesReachedEndTimeUs() {
        int i3 = 0;
        if (!this.sampleQueuesBuilt || this.endPositionUs == Long.MIN_VALUE) {
            return false;
        }
        boolean zHasQueuedTimestampsUpToReadEndTimeUs = true;
        while (true) {
            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
            if (i3 >= hlsSampleQueueArr.length) {
                return zHasQueuedTimestampsUpToReadEndTimeUs;
            }
            if (this.sampleQueuesEnabledStates[i3] && (this.sampleQueueIsAudioVideoFlags[i3] || !this.haveAudioVideoSampleQueues)) {
                zHasQueuedTimestampsUpToReadEndTimeUs &= hlsSampleQueueArr[i3].hasQueuedTimestampsUpToReadEndTimeUs();
            }
            i3++;
        }
    }

    private void initMediaChunkLoad(androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk) {
        this.sourceChunk = hlsMediaChunk;
        this.upstreamTrackFormat = hlsMediaChunk.trackFormat;
        this.pendingResetPositionUs = androidx.media3.common.C.TIME_UNSET;
        this.mediaChunks.add(hlsMediaChunk);
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            yS.c(java.lang.Integer.valueOf(hlsSampleQueue.getWriteIndex()));
        }
        hlsMediaChunk.init(this, yS.f());
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue2 : this.sampleQueues) {
            hlsSampleQueue2.setSourceChunk(hlsMediaChunk);
            if (hlsMediaChunk.shouldSpliceIn()) {
                hlsSampleQueue2.splice();
            }
        }
    }

    private static boolean isMediaChunk(androidx.media3.exoplayer.source.chunk.Chunk chunk) {
        return chunk instanceof androidx.media3.exoplayer.hls.HlsMediaChunk;
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != androidx.media3.common.C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPlaylistUpdated$0(androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk) {
        this.callback.onPlaylistRefreshRequired(hlsMediaChunk.playlistUrl);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroups"})
    private void mapSampleQueuesToMatchTrackGroups() {
        int i3 = this.trackGroups.length;
        int[] iArr = new int[i3];
        this.trackGroupToSampleQueueIndex = iArr;
        java.util.Arrays.fill(iArr, -1);
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = 0;
            while (true) {
                androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
                if (i10 >= hlsSampleQueueArr.length) {
                    break;
                }
                androidx.media3.common.Format upstreamFormat = hlsSampleQueueArr[i10].getUpstreamFormat();
                upstreamFormat.getClass();
                if (formatsMatch(upstreamFormat, this.trackGroups.get(i9).getFormat(0))) {
                    this.trackGroupToSampleQueueIndex[i9] = i10;
                    break;
                }
                i10++;
            }
        }
        java.util.Iterator<androidx.media3.exoplayer.hls.HlsSampleStream> it = this.hlsSampleStreams.iterator();
        while (it.hasNext()) {
            it.next().bindSampleQueue();
        }
    }

    private void maybeDiscardUpstreamForNewMediaChunk(androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk) {
        if (this.mediaChunks.isEmpty()) {
            return;
        }
        if (!getLastMediaChunk().isPublished()) {
            discardUpstream(this.mediaChunks.size() - 1);
        }
        if (hlsMediaChunk.isIndependent && hlsMediaChunk.shouldSpliceIn()) {
            for (int size = this.mediaChunks.size() - 1; size >= 0; size--) {
                long j = this.mediaChunks.get(size).startTimeUs;
                long j9 = hlsMediaChunk.startTimeUs;
                if (j < j9) {
                    return;
                }
                if (j == j9 && canDiscardUpstreamMediaChunksFromIndex(size)) {
                    discardUpstream(size);
                    hlsMediaChunk.clearShouldSpliceIn();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (!this.released && this.trackGroupToSampleQueueIndex == null && this.sampleQueuesBuilt) {
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                if (hlsSampleQueue.getUpstreamFormat() == null) {
                    return;
                }
            }
            if (this.trackGroups != null) {
                mapSampleQueuesToMatchTrackGroups();
                return;
            }
            buildTracksFromSampleStreams();
            setIsPrepared();
            this.callback.onPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTracksEnded() {
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            hlsSampleQueue.setReadEndTimeUs(this.endPositionUs);
        }
        this.sampleQueuesBuilt = true;
        maybeFinishPrepare();
    }

    private void resetSampleQueues() {
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            hlsSampleQueue.reset(this.pendingResetUpstreamFormats);
        }
        this.pendingResetUpstreamFormats = false;
    }

    private boolean seekInsideBufferUs(long j, androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk) {
        boolean zSeekTo;
        int length = this.sampleQueues.length;
        int i3 = 0;
        while (true) {
            boolean z6 = true;
            if (i3 >= length) {
                return true;
            }
            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue = this.sampleQueues[i3];
            if (hlsMediaChunk != null) {
                zSeekTo = hlsSampleQueue.seekTo(hlsMediaChunk.getFirstSampleIndex(i3));
            } else {
                long nextLoadPositionUs = getNextLoadPositionUs();
                if (nextLoadPositionUs != Long.MIN_VALUE && j >= nextLoadPositionUs) {
                    z6 = false;
                }
                zSeekTo = hlsSampleQueue.seekTo(j, z6);
            }
            if (!zSeekTo && (this.sampleQueueIsAudioVideoFlags[i3] || !this.haveAudioVideoSampleQueues)) {
                return false;
            }
            i3++;
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    private void setIsPrepared() {
        this.prepared = true;
    }

    private void updateSampleStreams(androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr) {
        this.hlsSampleStreams.clear();
        for (androidx.media3.exoplayer.source.SampleStream sampleStream : sampleStreamArr) {
            if (sampleStream != null) {
                this.hlsSampleStreams.add((androidx.media3.exoplayer.hls.HlsSampleStream) sampleStream);
            }
        }
    }

    public int bindSampleQueueToSampleStream(int i3) {
        assertIsPrepared();
        this.trackGroupToSampleQueueIndex.getClass();
        int i9 = this.trackGroupToSampleQueueIndex[i3];
        if (i9 == -1) {
            return this.optionalTrackGroups.contains(this.trackGroups.get(i3)) ? -3 : -2;
        }
        boolean[] zArr = this.sampleQueuesEnabledStates;
        if (zArr[i9]) {
            return -2;
        }
        zArr[i9] = true;
        return i9;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        java.util.List<androidx.media3.exoplayer.hls.HlsMediaChunk> list;
        long j;
        long j9;
        if (this.loadingFinished || this.loader.isLoading() || this.loader.hasFatalError()) {
            return false;
        }
        if (isPendingReset()) {
            java.util.List<androidx.media3.exoplayer.hls.HlsMediaChunk> list2 = java.util.Collections.EMPTY_LIST;
            long j10 = this.pendingResetPositionUs;
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.setStartTimeUs(this.pendingResetPositionUs);
            }
            list = list2;
            j = j10;
            j9 = j;
        } else {
            java.util.List<androidx.media3.exoplayer.hls.HlsMediaChunk> list3 = this.readOnlyMediaChunks;
            androidx.media3.exoplayer.hls.HlsMediaChunk lastMediaChunk = getLastMediaChunk();
            long publishedEndTimeUs = (lastMediaChunk.isLoadCompleted() && lastMediaChunk.isPublished()) ? lastMediaChunk.getPublishedEndTimeUs() : java.lang.Math.max(this.lastSeekPositionUs, lastMediaChunk.startTimeUs);
            long jMax = this.lastSeekPositionUs;
            if (this.sampleQueuesBuilt) {
                for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue2 : this.sampleQueues) {
                    jMax = java.lang.Math.max(jMax, hlsSampleQueue2.getLargestReadTimestampUs());
                }
            }
            list = list3;
            j = publishedEndTimeUs;
            j9 = jMax;
        }
        this.nextChunkHolder.clear();
        this.chunkSource.getNextChunk(loadingInfo, j, j9, list, this.prepared || !list.isEmpty(), this.nextChunkHolder);
        androidx.media3.exoplayer.hls.HlsChunkSource.HlsChunkHolder hlsChunkHolder = this.nextChunkHolder;
        boolean z6 = hlsChunkHolder.endOfStream;
        androidx.media3.exoplayer.source.chunk.Chunk chunk = hlsChunkHolder.chunk;
        android.net.Uri uri = hlsChunkHolder.playlistUrl;
        if (z6) {
            this.pendingResetPositionUs = androidx.media3.common.C.TIME_UNSET;
            this.loadingFinished = true;
            return true;
        }
        if (chunk == null) {
            if (uri != null) {
                this.callback.onPlaylistRefreshRequired(uri);
            }
            return false;
        }
        if (isMediaChunk(chunk)) {
            androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk = (androidx.media3.exoplayer.hls.HlsMediaChunk) chunk;
            maybeDiscardUpstreamForNewMediaChunk(hlsMediaChunk);
            initMediaChunkLoad(hlsMediaChunk);
        }
        this.loadingChunk = chunk;
        this.loader.startLoading(chunk, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(chunk.type));
        return true;
    }

    public void continuePreparing() {
        if (this.prepared) {
            return;
        }
        continueLoading(new androidx.media3.exoplayer.LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
    }

    public void discardBuffer(long j, boolean z6) {
        if (!this.sampleQueuesBuilt || isPendingReset()) {
            return;
        }
        int length = this.sampleQueues.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.sampleQueues[i3].discardTo(j, z6, this.sampleQueuesEnabledStates[i3]);
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.tracksEnded = true;
        this.handler.post(this.onTracksEndedRunnable);
    }

    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        return this.chunkSource.getAdjustedSeekPositionUs(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        long jMax = this.lastSeekPositionUs;
        androidx.media3.exoplayer.hls.HlsMediaChunk lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            lastMediaChunk = this.mediaChunks.size() > 1 ? (androidx.media3.exoplayer.hls.HlsMediaChunk) com.google.android.gms.internal.play_billing.M0.j(2, this.mediaChunks) : null;
        }
        if (lastMediaChunk != null) {
            jMax = java.lang.Math.max(jMax, lastMediaChunk.endTimeUs);
        }
        if (this.sampleQueuesBuilt) {
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                jMax = java.lang.Math.max(jMax, hlsSampleQueue.getLargestQueuedTimestampUs());
            }
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        return getLastMediaChunk().endTimeUs;
    }

    public int getPrimaryTrackGroupIndex() {
        return this.primaryTrackGroupIndex;
    }

    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        assertIsPrepared();
        return this.trackGroups;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
    }

    public boolean isReady(int i3) {
        return !isPendingReset() && this.sampleQueues[i3].isReady(this.loadingFinished);
    }

    public boolean isVideoSampleStream() {
        return this.primarySampleQueueType == 2;
    }

    public void maybeThrowError(int i3) {
        maybeThrowError();
        this.sampleQueues[i3].maybeThrowError();
    }

    public void maybeThrowPrepareError() throws androidx.media3.common.ParserException {
        maybeThrowError();
        if (this.loadingFinished && !this.prepared) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            hlsSampleQueue.release();
        }
    }

    public void onNewExtractor() {
        this.sampleQueueMappingDoneByType.clear();
    }

    public boolean onPlaylistError(android.net.Uri uri, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z6) {
        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        if (!this.chunkSource.obtainsChunksForPlaylist(uri)) {
            return false;
        }
        if (z6) {
            fallbackSelectionFor = null;
        } else {
            fallbackSelectionFor = this.loadErrorHandlingPolicy.getFallbackSelectionFor(this.chunkSource.createFallbackOptions(uri), loadErrorInfo);
        }
        return this.chunkSource.onPlaylistError(uri, fallbackSelectionFor);
    }

    public void onPlaylistUpdated() {
        if (this.mediaChunks.isEmpty()) {
            return;
        }
        final androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk = (androidx.media3.exoplayer.hls.HlsMediaChunk) p076i4.AbstractC2230y.l(this.mediaChunks);
        int chunkPublicationState = this.chunkSource.getChunkPublicationState(hlsMediaChunk);
        if (chunkPublicationState == 1) {
            if (hlsMediaChunk.isPublished()) {
                return;
            }
            hlsMediaChunk.publish(this.chunkSource.getPublishedPartDurationUs(hlsMediaChunk));
        } else if (chunkPublicationState == 0) {
            this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.hls.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16673h.lambda$onPlaylistUpdated$0(hlsMediaChunk);
                }
            });
        } else if (chunkPublicationState == 2 && !this.loadingFinished && this.loader.isLoading()) {
            this.loader.cancelLoading();
        }
    }

    @Override // androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(androidx.media3.common.Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    public void prepareWithMultivariantPlaylistInfo(androidx.media3.common.TrackGroup[] trackGroupArr, int i3, int... iArr) {
        this.trackGroups = createTrackGroupArrayWithDrmInfo(trackGroupArr);
        this.optionalTrackGroups = new java.util.HashSet();
        for (int i9 : iArr) {
            this.optionalTrackGroups.add(this.trackGroups.get(i9));
        }
        this.primaryTrackGroupIndex = i3;
        android.os.Handler handler = this.handler;
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback callback = this.callback;
        java.util.Objects.requireNonNull(callback);
        handler.post(new androidx.media3.exoplayer.hls.k(2, callback));
        setIsPrepared();
    }

    public int readData(int i3, androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i9) {
        androidx.media3.common.Format format;
        if (isPendingReset()) {
            return -3;
        }
        int i10 = 0;
        if (!this.mediaChunks.isEmpty()) {
            int i11 = 0;
            while (i11 < this.mediaChunks.size() - 1 && finishedReadingChunk(this.mediaChunks.get(i11))) {
                i11++;
            }
            androidx.media3.common.util.Util.removeRange(this.mediaChunks, 0, i11);
            androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(0);
            androidx.media3.common.Format format2 = hlsMediaChunk.trackFormat;
            if (!format2.equals(this.downstreamTrackFormat)) {
                this.mediaSourceEventDispatcher.downstreamFormatChanged(this.trackType, format2, hlsMediaChunk.trackSelectionReason, hlsMediaChunk.trackSelectionData, hlsMediaChunk.startTimeUs);
            }
            this.downstreamTrackFormat = format2;
        }
        if (!this.mediaChunks.isEmpty() && !this.mediaChunks.get(0).isPublished()) {
            return -3;
        }
        int i12 = this.sampleQueues[i3].read(formatHolder, decoderInputBuffer, i9, this.loadingFinished);
        if (i12 == -5) {
            androidx.media3.common.Format formatWithManifestFormatInfo = formatHolder.format;
            formatWithManifestFormatInfo.getClass();
            if (i3 == this.primarySampleQueueIndex) {
                int iM = com.google.crypto.tink.shaded.protobuf.q0.m(this.sampleQueues[i3].peekSourceId());
                while (i10 < this.mediaChunks.size() && this.mediaChunks.get(i10).uid != iM) {
                    i10++;
                }
                if (i10 < this.mediaChunks.size()) {
                    format = this.mediaChunks.get(i10).trackFormat;
                } else {
                    format = this.upstreamTrackFormat;
                    format.getClass();
                }
                formatWithManifestFormatInfo = formatWithManifestFormatInfo.withManifestFormatInfo(format);
            }
            formatHolder.format = formatWithManifestFormatInfo;
        }
        return i12;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        if (this.loader.hasFatalError() || isPendingReset()) {
            return;
        }
        if (this.loader.isLoading()) {
            this.loadingChunk.getClass();
            if (this.chunkSource.shouldCancelLoad(j, this.loadingChunk, this.readOnlyMediaChunks)) {
                this.loader.cancelLoading();
                return;
            }
            return;
        }
        int size = this.readOnlyMediaChunks.size();
        while (size > 0 && this.chunkSource.getChunkPublicationState(this.readOnlyMediaChunks.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.readOnlyMediaChunks.size()) {
            discardUpstream(size);
        }
        int preferredQueueSize = this.chunkSource.getPreferredQueueSize(j, this.readOnlyMediaChunks);
        if (preferredQueueSize < this.mediaChunks.size()) {
            discardUpstream(preferredQueueSize);
        }
        if (haveSampleQueuesReachedEndTimeUs()) {
            this.loadingFinished = true;
        }
    }

    public void release() {
        if (this.prepared) {
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.preRelease();
            }
        }
        this.chunkSource.reset();
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.released = true;
        this.hlsSampleStreams.clear();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(androidx.media3.extractor.SeekMap seekMap) {
    }

    public boolean seekToUs(long j, boolean z6) {
        androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk;
        this.lastSeekPositionUs = j;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j;
            return true;
        }
        if (!this.chunkSource.hasIndependentSegments()) {
            hlsMediaChunk = null;
            break;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.mediaChunks.size()) {
                hlsMediaChunk = null;
                break;
            }
            hlsMediaChunk = this.mediaChunks.get(i3);
            if (hlsMediaChunk.startTimeUs == j) {
                break;
            }
            i3++;
        }
        if (this.sampleQueuesBuilt && !z6 && !this.mediaChunks.isEmpty() && seekInsideBufferUs(j, hlsMediaChunk)) {
            return false;
        }
        this.pendingResetPositionUs = j;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        if (this.loader.isLoading()) {
            if (this.sampleQueuesBuilt) {
                for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                    hlsSampleQueue.discardToEnd();
                }
            }
            this.loader.cancelLoading();
        } else {
            this.loader.clearFatalError();
            resetSampleQueues();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    public boolean selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j, boolean z6) {
        boolean z9;
        assertIsPrepared();
        int i3 = this.enabledTrackGroupCount;
        int i9 = 0;
        for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
            androidx.media3.exoplayer.hls.HlsSampleStream hlsSampleStream = (androidx.media3.exoplayer.hls.HlsSampleStream) sampleStreamArr[i10];
            if (hlsSampleStream != null && (exoTrackSelectionArr[i10] == null || !zArr[i10])) {
                this.enabledTrackGroupCount--;
                hlsSampleStream.unbindSampleQueue();
                sampleStreamArr[i10] = null;
            }
        }
        boolean z10 = z6 || (!this.seenFirstTrackSelection ? j == this.lastSeekPositionUs : i3 != 0);
        androidx.media3.exoplayer.trackselection.ExoTrackSelection trackSelection = this.chunkSource.getTrackSelection();
        boolean z11 = z10;
        androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = trackSelection;
        for (int i11 = 0; i11 < exoTrackSelectionArr.length; i11++) {
            androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection2 = exoTrackSelectionArr[i11];
            if (exoTrackSelection2 != null) {
                int iIndexOf = this.trackGroups.indexOf(exoTrackSelection2.getTrackGroup());
                if (iIndexOf == this.primaryTrackGroupIndex) {
                    this.chunkSource.setTrackSelection(exoTrackSelection2);
                    exoTrackSelection = exoTrackSelection2;
                }
                if (sampleStreamArr[i11] == null) {
                    this.enabledTrackGroupCount++;
                    androidx.media3.exoplayer.hls.HlsSampleStream hlsSampleStream2 = new androidx.media3.exoplayer.hls.HlsSampleStream(this, iIndexOf);
                    sampleStreamArr[i11] = hlsSampleStream2;
                    zArr2[i11] = true;
                    if (this.trackGroupToSampleQueueIndex != null) {
                        hlsSampleStream2.bindSampleQueue();
                        int i12 = this.trackGroupToSampleQueueIndex[iIndexOf];
                        if (!z11 && i12 >= 0) {
                            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue = this.sampleQueues[i12];
                            z11 = (hlsSampleQueue.getReadIndex() == 0 || hlsSampleQueue.seekTo(j, true)) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.enabledTrackGroupCount == 0) {
            this.chunkSource.reset();
            this.downstreamTrackFormat = null;
            this.pendingResetUpstreamFormats = true;
            this.mediaChunks.clear();
            if (this.loader.isLoading()) {
                if (this.sampleQueuesBuilt) {
                    androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
                    int length = hlsSampleQueueArr.length;
                    while (i9 < length) {
                        hlsSampleQueueArr[i9].discardToEnd();
                        i9++;
                    }
                }
                this.loader.cancelLoading();
            } else {
                resetSampleQueues();
            }
        } else {
            if (this.mediaChunks.isEmpty() || java.util.Objects.equals(exoTrackSelection, trackSelection)) {
                z9 = z6;
            } else {
                if (!this.seenFirstTrackSelection) {
                    long j9 = j < 0 ? -j : 0L;
                    androidx.media3.exoplayer.hls.HlsMediaChunk lastMediaChunk = getLastMediaChunk();
                    androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection3 = exoTrackSelection;
                    exoTrackSelection3.updateSelectedTrack(j, j9, androidx.media3.common.C.TIME_UNSET, this.readOnlyMediaChunks, this.chunkSource.createMediaChunkIterators(lastMediaChunk, j));
                    if (exoTrackSelection3.getSelectedIndexInTrackGroup() == this.chunkSource.getTrackGroup().indexOf(lastMediaChunk.trackFormat)) {
                        z9 = z6;
                    }
                }
                this.pendingResetUpstreamFormats = true;
                z9 = true;
                z11 = true;
            }
            if (z11) {
                seekToUs(j, z9);
                while (i9 < sampleStreamArr.length) {
                    if (sampleStreamArr[i9] != null) {
                        zArr2[i9] = true;
                    }
                    i9++;
                }
            }
        }
        updateSampleStreams(sampleStreamArr);
        this.seenFirstTrackSelection = true;
        return z11;
    }

    public void setDrmInitData(androidx.media3.common.DrmInitData drmInitData) {
        if (java.util.Objects.equals(this.drmInitData, drmInitData)) {
            return;
        }
        this.drmInitData = drmInitData;
        int i3 = 0;
        while (true) {
            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
            if (i3 >= hlsSampleQueueArr.length) {
                return;
            }
            if (this.sampleQueueIsAudioVideoFlags[i3]) {
                hlsSampleQueueArr[i3].setDrmInitData(drmInitData);
            }
            i3++;
        }
    }

    public void setEndPositionUs(long j) {
        this.endPositionUs = j;
        if (this.sampleQueuesBuilt) {
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.setReadEndTimeUs(j);
            }
        }
    }

    public void setIsPrimaryTimestampSource(boolean z6) {
        this.chunkSource.setIsPrimaryTimestampSource(z6);
    }

    public void setSampleOffsetUs(long j) {
        if (this.sampleOffsetUs != j) {
            this.sampleOffsetUs = j;
            for (androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.setSampleOffsetUs(j);
            }
        }
    }

    public int skipData(int i3, long j) {
        if (isPendingReset()) {
            return 0;
        }
        androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue = this.sampleQueues[i3];
        int skipCount = hlsSampleQueue.getSkipCount(j, this.loadingFinished);
        androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk = (androidx.media3.exoplayer.hls.HlsMediaChunk) p076i4.AbstractC2230y.m(this.mediaChunks);
        if (hlsMediaChunk != null && !hlsMediaChunk.isPublished()) {
            skipCount = java.lang.Math.min(skipCount, hlsMediaChunk.getFirstSampleIndex(i3) - hlsSampleQueue.getReadIndex());
        }
        hlsSampleQueue.skip(skipCount);
        return skipCount;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public androidx.media3.extractor.TrackOutput track(int i3, int i9) {
        androidx.media3.extractor.TrackOutput trackOutputCreateSampleQueue;
        if (!MAPPABLE_TYPES.contains(java.lang.Integer.valueOf(i9))) {
            int i10 = 0;
            while (true) {
                androidx.media3.extractor.TrackOutput[] trackOutputArr = this.sampleQueues;
                if (i10 >= trackOutputArr.length) {
                    trackOutputCreateSampleQueue = null;
                    break;
                }
                if (this.sampleQueueTrackIds[i10] == i3) {
                    trackOutputCreateSampleQueue = trackOutputArr[i10];
                    break;
                }
                i10++;
            }
        } else {
            trackOutputCreateSampleQueue = getMappedTrackOutput(i3, i9);
        }
        if (trackOutputCreateSampleQueue == null) {
            if (this.tracksEnded) {
                return createDiscardingTrackOutput(i3, i9);
            }
            trackOutputCreateSampleQueue = createSampleQueue(i3, i9);
        }
        if (i9 != 5) {
            return trackOutputCreateSampleQueue;
        }
        if (this.emsgUnwrappingTrackOutput == null) {
            this.emsgUnwrappingTrackOutput = new androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.EmsgUnwrappingTrackOutput(trackOutputCreateSampleQueue, this.metadataType);
        }
        return this.emsgUnwrappingTrackOutput;
    }

    public void unbindSampleQueue(int i3) {
        assertIsPrepared();
        this.trackGroupToSampleQueueIndex.getClass();
        int i9 = this.trackGroupToSampleQueueIndex[i3];
        if (i9 >= 0) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.sampleQueuesEnabledStates[i9]);
            this.sampleQueuesEnabledStates[i9] = false;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j, long j9, boolean z6) {
        this.loadingChunk = null;
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j9, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (z6) {
            return;
        }
        if (isPendingReset() || this.enabledTrackGroupCount == 0) {
            resetSampleQueues();
        }
        if (this.enabledTrackGroupCount > 0) {
            this.callback.onContinueLoadingRequested(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j, long j9) {
        this.loadingChunk = null;
        this.chunkSource.onChunkLoadCompleted(chunk);
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j9, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (this.prepared) {
            this.callback.onContinueLoadingRequested(this);
        } else {
            continueLoading(new androidx.media3.exoplayer.LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j, long j9, java.io.IOException iOException, int i3) {
        androidx.media3.exoplayer.upstream.Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        int i9;
        boolean zIsMediaChunk = isMediaChunk(chunk);
        if (zIsMediaChunk && !((androidx.media3.exoplayer.hls.HlsMediaChunk) chunk).isPublished() && (iOException instanceof androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException) && ((i9 = ((androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException) iOException).responseCode) == 410 || i9 == 404)) {
            return androidx.media3.exoplayer.upstream.Loader.RETRY;
        }
        long jBytesLoaded = chunk.bytesLoaded();
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j9, jBytesLoaded);
        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, androidx.media3.common.util.Util.usToMs(chunk.startTimeUs), androidx.media3.common.util.Util.usToMs(chunk.endTimeUs)), iOException, i3);
        boolean zOnChunkError = this.chunkSource.onChunkError(chunk, this.loadErrorHandlingPolicy.getFallbackSelectionFor(this.chunkSource.createFallbackOptions(chunk), loadErrorInfo));
        if (zOnChunkError) {
            if (zIsMediaChunk && jBytesLoaded == 0) {
                java.util.ArrayList<androidx.media3.exoplayer.hls.HlsMediaChunk> arrayList = this.mediaChunks;
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(arrayList.remove(arrayList.size() - 1) == chunk);
                if (this.mediaChunks.isEmpty()) {
                    this.pendingResetPositionUs = this.lastSeekPositionUs;
                } else {
                    ((androidx.media3.exoplayer.hls.HlsMediaChunk) p076i4.AbstractC2230y.l(this.mediaChunks)).invalidateExtractor();
                }
            }
            loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.DONT_RETRY;
        } else {
            long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo);
            loadErrorActionCreateRetryAction = retryDelayMsFor != androidx.media3.common.C.TIME_UNSET ? androidx.media3.exoplayer.upstream.Loader.createRetryAction(false, retryDelayMsFor) : androidx.media3.exoplayer.upstream.Loader.DONT_RETRY_FATAL;
        }
        androidx.media3.exoplayer.upstream.Loader.LoadErrorAction loadErrorAction = loadErrorActionCreateRetryAction;
        boolean zIsRetry = loadErrorAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.loadingChunk = null;
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        }
        if (zOnChunkError) {
            if (!this.prepared) {
                continueLoading(new androidx.media3.exoplayer.LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
                return loadErrorAction;
            }
            this.callback.onContinueLoadingRequested(this);
        }
        return loadErrorAction;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadStarted(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j, long j9, int i3) {
        this.mediaSourceEventDispatcher.loadStarted(i3 == 0 ? new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, j) : new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j9, chunk.bytesLoaded()), chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, i3);
    }

    public void maybeThrowError() {
        this.loader.maybeThrowError();
        this.chunkSource.maybeThrowError();
    }

    public static class EmsgUnwrappingTrackOutput implements androidx.media3.extractor.TrackOutput {
        private byte[] buffer;
        private int bufferPosition;
        private final androidx.media3.extractor.TrackOutput delegate;
        private final androidx.media3.common.Format delegateFormat;
        private final androidx.media3.extractor.metadata.emsg.EventMessageDecoder emsgDecoder = new androidx.media3.extractor.metadata.emsg.EventMessageDecoder();
        private androidx.media3.common.Format format;
        private static final androidx.media3.common.Format ID3_FORMAT = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_ID3).build();
        private static final androidx.media3.common.Format EMSG_FORMAT = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_EMSG).build();

        public EmsgUnwrappingTrackOutput(androidx.media3.extractor.TrackOutput trackOutput, int i3) {
            this.delegate = trackOutput;
            if (i3 == 1) {
                this.delegateFormat = ID3_FORMAT;
            } else {
                if (i3 != 3) {
                    throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "Unknown metadataType: "));
                }
                this.delegateFormat = EMSG_FORMAT;
            }
            this.buffer = new byte[0];
            this.bufferPosition = 0;
        }

        private boolean emsgContainsExpectedWrappedFormat(androidx.media3.extractor.metadata.emsg.EventMessage eventMessage) {
            androidx.media3.common.Format wrappedMetadataFormat = eventMessage.getWrappedMetadataFormat();
            return wrappedMetadataFormat != null && java.util.Objects.equals(this.delegateFormat.sampleMimeType, wrappedMetadataFormat.sampleMimeType);
        }

        private void ensureBufferCapacity(int i3) {
            byte[] bArr = this.buffer;
            if (bArr.length < i3) {
                this.buffer = java.util.Arrays.copyOf(bArr, (i3 / 2) + i3);
            }
        }

        private androidx.media3.common.util.ParsableByteArray getSampleAndTrimBuffer(int i3, int i9) {
            int i10 = this.bufferPosition - i9;
            androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(java.util.Arrays.copyOfRange(this.buffer, i10 - i3, i10));
            byte[] bArr = this.buffer;
            java.lang.System.arraycopy(bArr, i10, bArr, 0, i9);
            this.bufferPosition = i9;
            return parsableByteArray;
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void format(androidx.media3.common.Format format) {
            this.format = format;
            this.delegate.format(this.delegateFormat);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public int sampleData(androidx.media3.common.DataReader dataReader, int i3, boolean z6, int i9) throws java.io.EOFException {
            ensureBufferCapacity(this.bufferPosition + i3);
            int i10 = dataReader.read(this.buffer, this.bufferPosition, i3);
            if (i10 != -1) {
                this.bufferPosition += i10;
                return i10;
            }
            if (z6) {
                return -1;
            }
            throw new java.io.EOFException();
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j, int i3, int i9, int i10, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
            this.format.getClass();
            androidx.media3.common.util.ParsableByteArray sampleAndTrimBuffer = getSampleAndTrimBuffer(i9, i10);
            if (!java.util.Objects.equals(this.format.sampleMimeType, this.delegateFormat.sampleMimeType)) {
                if (!androidx.media3.common.MimeTypes.APPLICATION_EMSG.equals(this.format.sampleMimeType)) {
                    androidx.media3.common.util.Log.w(androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.TAG, "Ignoring sample for unsupported format: " + this.format.sampleMimeType);
                    return;
                }
                androidx.media3.extractor.metadata.emsg.EventMessage eventMessageDecode = this.emsgDecoder.decode(sampleAndTrimBuffer);
                if (!emsgContainsExpectedWrappedFormat(eventMessageDecode)) {
                    androidx.media3.common.util.Log.w(androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.TAG, "Ignoring EMSG. Expected it to contain wrapped " + this.delegateFormat.sampleMimeType + " but actual wrapped format: " + eventMessageDecode.getWrappedMetadataFormat());
                    return;
                }
                byte[] wrappedMetadataBytes = eventMessageDecode.getWrappedMetadataBytes();
                wrappedMetadataBytes.getClass();
                sampleAndTrimBuffer = new androidx.media3.common.util.ParsableByteArray(wrappedMetadataBytes);
            }
            int iBytesLeft = sampleAndTrimBuffer.bytesLeft();
            this.delegate.sampleData(sampleAndTrimBuffer, iBytesLeft);
            this.delegate.sampleMetadata(j, i3, iBytesLeft, 0, cryptoData);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9) {
            ensureBufferCapacity(this.bufferPosition + i3);
            parsableByteArray.readBytes(this.buffer, this.bufferPosition, i3);
            this.bufferPosition += i3;
        }
    }
}
