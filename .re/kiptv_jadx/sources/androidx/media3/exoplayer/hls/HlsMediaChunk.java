package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
final class HlsMediaChunk extends androidx.media3.exoplayer.source.chunk.MediaChunk {
    public static final java.lang.String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    private static final java.util.concurrent.atomic.AtomicInteger uidSource = new java.util.concurrent.atomic.AtomicInteger();
    public final int discontinuitySequenceNumber;
    private final androidx.media3.common.DrmInitData drmInitData;
    private androidx.media3.exoplayer.hls.HlsMediaChunkExtractor extractor;
    private final androidx.media3.exoplayer.hls.HlsExtractorFactory extractorFactory;
    private boolean extractorInvalidated;
    private final boolean hasGapTag;
    private final androidx.media3.extractor.metadata.id3.Id3Decoder id3Decoder;
    private boolean initDataLoadRequired;
    private final androidx.media3.datasource.DataSource initDataSource;
    private final androidx.media3.datasource.DataSpec initDataSpec;
    private final boolean initSegmentEncrypted;
    public final boolean isIndependent;
    private final boolean isPrimaryTimestampSource;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private final boolean mediaSegmentEncrypted;
    private final java.util.List<androidx.media3.common.Format> muxedCaptionFormats;
    private int nextLoadPosition;
    private androidx.media3.exoplayer.hls.HlsSampleStreamWrapper output;
    public final int partIndex;
    private final androidx.media3.exoplayer.analytics.PlayerId playerId;
    public final android.net.Uri playlistUrl;
    private final androidx.media3.exoplayer.hls.HlsMediaChunkExtractor previousExtractor;
    private long publishedDurationUs;
    private p076i4.AbstractC2186b0 sampleQueueFirstSampleIndices;
    private final androidx.media3.common.util.ParsableByteArray scratchId3Data;
    private boolean shouldSpliceIn;
    private final androidx.media3.common.util.TimestampAdjuster timestampAdjuster;
    private final long timestampAdjusterInitializationTimeoutMs;
    public final int uid;

    private HlsMediaChunk(androidx.media3.exoplayer.hls.HlsExtractorFactory hlsExtractorFactory, androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, androidx.media3.common.Format format, boolean z6, androidx.media3.datasource.DataSource dataSource2, androidx.media3.datasource.DataSpec dataSpec2, boolean z9, android.net.Uri uri, java.util.List<androidx.media3.common.Format> list, int i3, java.lang.Object obj, long j, long j9, long j10, int i9, boolean z10, int i10, boolean z11, boolean z12, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, long j11, androidx.media3.common.DrmInitData drmInitData, androidx.media3.exoplayer.hls.HlsMediaChunkExtractor hlsMediaChunkExtractor, androidx.media3.extractor.metadata.id3.Id3Decoder id3Decoder, androidx.media3.common.util.ParsableByteArray parsableByteArray, boolean z13, boolean z14, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        super(dataSource, dataSpec, format, i3, obj, j, j9, j10);
        this.mediaSegmentEncrypted = z6;
        this.partIndex = i9;
        this.publishedDurationUs = z10 ? j9 - j : androidx.media3.common.C.TIME_UNSET;
        this.discontinuitySequenceNumber = i10;
        this.initDataSpec = dataSpec2;
        this.initDataSource = dataSource2;
        this.initDataLoadRequired = dataSpec2 != null;
        this.initSegmentEncrypted = z9;
        this.playlistUrl = uri;
        this.isPrimaryTimestampSource = z12;
        this.timestampAdjuster = timestampAdjuster;
        this.timestampAdjusterInitializationTimeoutMs = j11;
        this.hasGapTag = z11;
        this.extractorFactory = hlsExtractorFactory;
        this.muxedCaptionFormats = list;
        this.drmInitData = drmInitData;
        this.previousExtractor = hlsMediaChunkExtractor;
        this.id3Decoder = id3Decoder;
        this.scratchId3Data = parsableByteArray;
        this.shouldSpliceIn = z13;
        this.isIndependent = z14;
        this.playerId = playerId;
        p076i4.Z z15 = p076i4.AbstractC2186b0.f22868i;
        this.sampleQueueFirstSampleIndices = p076i4.S0.f22832l;
        this.uid = uidSource.getAndIncrement();
    }

    private static androidx.media3.datasource.DataSource buildDataSource(androidx.media3.datasource.DataSource dataSource, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return dataSource;
        }
        bArr2.getClass();
        return new androidx.media3.exoplayer.hls.Aes128DataSource(dataSource, bArr, bArr2);
    }

    public static androidx.media3.exoplayer.hls.HlsMediaChunk createInstance(androidx.media3.exoplayer.hls.HlsExtractorFactory hlsExtractorFactory, androidx.media3.datasource.DataSource dataSource, androidx.media3.common.Format format, long j, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.exoplayer.hls.HlsChunkSource.SegmentBaseHolder segmentBaseHolder, android.net.Uri uri, java.util.List<androidx.media3.common.Format> list, int i3, java.lang.Object obj, boolean z6, androidx.media3.exoplayer.hls.TimestampAdjusterProvider timestampAdjusterProvider, long j9, androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk, byte[] bArr, byte[] bArr2, boolean z9, boolean z10, androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.exoplayer.upstream.CmcdData.Factory factory) {
        byte[] encryptionIvArray;
        boolean z11;
        androidx.media3.datasource.DataSource dataSourceBuildDataSource;
        androidx.media3.datasource.DataSpec dataSpecBuild;
        boolean z12;
        android.net.Uri uri2;
        androidx.media3.extractor.metadata.id3.Id3Decoder id3Decoder;
        androidx.media3.common.util.ParsableByteArray parsableByteArray;
        androidx.media3.exoplayer.hls.HlsMediaChunkExtractor hlsMediaChunkExtractor;
        byte[] encryptionIvArray2;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        androidx.media3.datasource.DataSpec dataSpecBuild2 = new androidx.media3.datasource.DataSpec.Builder().setUri(androidx.media3.common.util.UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segmentBase.url)).setPosition(segmentBase.byteRangeOffset).setLength(segmentBase.byteRangeLength).setFlags(segmentBaseHolder.isPreload ? 8 : 0).build();
        if (factory != null) {
            dataSpecBuild2 = factory.createCmcdData().addToDataSpec(dataSpecBuild2);
        }
        androidx.media3.datasource.DataSpec dataSpec = dataSpecBuild2;
        boolean z13 = bArr != null;
        if (z13) {
            java.lang.String str = segmentBase.encryptionIV;
            str.getClass();
            encryptionIvArray = getEncryptionIvArray(str);
        } else {
            encryptionIvArray = null;
        }
        androidx.media3.datasource.DataSource dataSourceBuildDataSource2 = buildDataSource(dataSource, bArr, encryptionIvArray);
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment = segmentBase.initializationSegment;
        if (segment != null) {
            boolean z14 = bArr2 != null;
            if (z14) {
                java.lang.String str2 = segment.encryptionIV;
                str2.getClass();
                encryptionIvArray2 = getEncryptionIvArray(str2);
            } else {
                encryptionIvArray2 = null;
            }
            z11 = true;
            dataSpecBuild = new androidx.media3.datasource.DataSpec.Builder().setUri(androidx.media3.common.util.UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segment.url)).setPosition(segment.byteRangeOffset).setLength(segment.byteRangeLength).build();
            if (factory != null) {
                dataSpecBuild = factory.setObjectType(androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_INIT_SEGMENT).createCmcdData().addToDataSpec(dataSpecBuild);
            }
            dataSourceBuildDataSource = buildDataSource(dataSource, bArr2, encryptionIvArray2);
            z12 = z14;
        } else {
            z11 = true;
            dataSourceBuildDataSource = null;
            dataSpecBuild = null;
            z12 = false;
        }
        long j10 = j + segmentBase.relativeStartTimeUs;
        long j11 = j10 + segmentBase.durationUs;
        int i9 = hlsMediaPlaylist.discontinuitySequence + segmentBase.relativeDiscontinuitySequence;
        if (hlsMediaChunk != null) {
            androidx.media3.datasource.DataSpec dataSpec2 = hlsMediaChunk.initDataSpec;
            boolean z15 = (dataSpecBuild == dataSpec2 || (dataSpecBuild != null && dataSpec2 != null && dataSpecBuild.uri.equals(dataSpec2.uri) && dataSpecBuild.position == hlsMediaChunk.initDataSpec.position)) ? z11 : false;
            uri2 = uri;
            boolean z16 = (uri2.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted) ? z11 : false;
            id3Decoder = hlsMediaChunk.id3Decoder;
            parsableByteArray = hlsMediaChunk.scratchId3Data;
            hlsMediaChunkExtractor = (z15 && z16 && !hlsMediaChunk.extractorInvalidated && hlsMediaChunk.discontinuitySequenceNumber == i9) ? hlsMediaChunk.extractor : null;
        } else {
            uri2 = uri;
            id3Decoder = new androidx.media3.extractor.metadata.id3.Id3Decoder();
            parsableByteArray = new androidx.media3.common.util.ParsableByteArray(10);
            hlsMediaChunkExtractor = null;
        }
        return new androidx.media3.exoplayer.hls.HlsMediaChunk(hlsExtractorFactory, dataSourceBuildDataSource2, dataSpec, format, z13, dataSourceBuildDataSource, dataSpecBuild, z12, uri2, list, i3, obj, j10, j11, segmentBaseHolder.mediaSequence, segmentBaseHolder.partIndex, !segmentBaseHolder.isPreload, i9, segmentBase.hasGapTag, z6, timestampAdjusterProvider.getAdjuster(i9), j9, segmentBase.drmInitData, hlsMediaChunkExtractor, id3Decoder, parsableByteArray, z9, z10, playerId);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void feedDataToExtractor(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z6, boolean z9) {
        androidx.media3.datasource.DataSpec dataSpecSubrange;
        long position;
        long j;
        boolean z10 = false;
        if (z6) {
            z10 = this.nextLoadPosition != 0;
            dataSpecSubrange = dataSpec;
        } else {
            dataSpecSubrange = dataSpec.subrange(this.nextLoadPosition);
        }
        try {
            androidx.media3.extractor.DefaultExtractorInput defaultExtractorInputPrepareExtraction = prepareExtraction(dataSource, dataSpecSubrange, z9);
            if (z10) {
                defaultExtractorInputPrepareExtraction.skipFully(this.nextLoadPosition);
            }
            while (!this.loadCanceled && this.extractor.read(defaultExtractorInputPrepareExtraction)) {
                try {
                    try {
                    } catch (java.io.EOFException e6) {
                        if ((this.trackFormat.roleFlags & 16384) == 0) {
                            throw e6;
                        }
                        this.extractor.onTruncatedSegmentParsed();
                        position = defaultExtractorInputPrepareExtraction.getPosition();
                        j = dataSpec.position;
                    }
                } catch (java.lang.Throwable th) {
                    this.nextLoadPosition = (int) (defaultExtractorInputPrepareExtraction.getPosition() - dataSpec.position);
                    throw th;
                }
            }
            position = defaultExtractorInputPrepareExtraction.getPosition();
            j = dataSpec.position;
            this.nextLoadPosition = (int) (position - j);
            androidx.media3.datasource.DataSourceUtil.closeQuietly(dataSource);
        } catch (java.lang.Throwable th2) {
            androidx.media3.datasource.DataSourceUtil.closeQuietly(dataSource);
            throw th2;
        }
    }

    private static byte[] getEncryptionIvArray(java.lang.String str) {
        if (com.google.crypto.tink.shaded.protobuf.AbstractC1909d.i0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new java.math.BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        java.lang.System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$peekId3PrivTimestamp$0(androidx.media3.extractor.metadata.id3.PrivFrame privFrame) {
        return privFrame.owner.equals(PRIV_TIMESTAMP_FRAME_OWNER);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void loadMedia() {
        feedDataToExtractor(this.dataSource, this.dataSpec, this.mediaSegmentEncrypted, true);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private void maybeLoadInitData() {
        if (this.initDataLoadRequired) {
            this.initDataSource.getClass();
            this.initDataSpec.getClass();
            feedDataToExtractor(this.initDataSource, this.initDataSpec, this.initSegmentEncrypted, false);
            this.nextLoadPosition = 0;
            this.initDataLoadRequired = false;
        }
    }

    private long peekId3PrivTimestamp(androidx.media3.extractor.ExtractorInput extractorInput) throws java.lang.Throwable {
        androidx.media3.extractor.metadata.id3.PrivFrame privFrame;
        extractorInput.resetPeekPosition();
        try {
            this.scratchId3Data.reset(10);
            extractorInput.peekFully(this.scratchId3Data.getData(), 0, 10);
            if (this.scratchId3Data.readUnsignedInt24() != 4801587) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            this.scratchId3Data.skipBytes(3);
            int synchSafeInt = this.scratchId3Data.readSynchSafeInt();
            int i3 = synchSafeInt + 10;
            if (i3 > this.scratchId3Data.capacity()) {
                byte[] data = this.scratchId3Data.getData();
                this.scratchId3Data.reset(i3);
                java.lang.System.arraycopy(data, 0, this.scratchId3Data.getData(), 0, 10);
            }
            extractorInput.peekFully(this.scratchId3Data.getData(), 10, synchSafeInt);
            androidx.media3.common.Metadata metadataDecode = this.id3Decoder.decode(this.scratchId3Data.getData(), synchSafeInt);
            if (metadataDecode == null || (privFrame = (androidx.media3.extractor.metadata.id3.PrivFrame) metadataDecode.getFirstMatchingEntry(androidx.media3.extractor.metadata.id3.PrivFrame.class, new androidx.media3.exoplayer.hls.i())) == null) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            java.lang.System.arraycopy(privFrame.privateData, 0, this.scratchId3Data.getData(), 0, 8);
            this.scratchId3Data.setPosition(0);
            this.scratchId3Data.setLimit(8);
            return this.scratchId3Data.readLong() & 8589934591L;
        } catch (java.io.EOFException unused) {
            return androidx.media3.common.C.TIME_UNSET;
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractor"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private androidx.media3.extractor.DefaultExtractorInput prepareExtraction(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z6) throws java.lang.Throwable {
        androidx.media3.exoplayer.hls.HlsMediaChunkExtractor hlsMediaChunkExtractorCreateExtractor;
        long jOpen = dataSource.open(dataSpec);
        if (z6) {
            try {
                this.timestampAdjuster.sharedInitializeOrWait(this.isPrimaryTimestampSource, this.startTimeUs, this.timestampAdjusterInitializationTimeoutMs);
            } catch (java.lang.InterruptedException unused) {
                throw new java.io.InterruptedIOException();
            } catch (java.util.concurrent.TimeoutException e6) {
                throw new java.io.IOException(e6);
            }
        }
        androidx.media3.extractor.DefaultExtractorInput defaultExtractorInput = new androidx.media3.extractor.DefaultExtractorInput(dataSource, dataSpec.position, jOpen);
        if (this.extractor == null) {
            long jPeekId3PrivTimestamp = peekId3PrivTimestamp(defaultExtractorInput);
            defaultExtractorInput.resetPeekPosition();
            androidx.media3.exoplayer.hls.HlsMediaChunkExtractor hlsMediaChunkExtractor = this.previousExtractor;
            if (hlsMediaChunkExtractor != null) {
                hlsMediaChunkExtractorCreateExtractor = hlsMediaChunkExtractor.recreate();
            } else {
                hlsMediaChunkExtractorCreateExtractor = this.extractorFactory.createExtractor(dataSpec.uri, this.trackFormat, this.muxedCaptionFormats, this.timestampAdjuster, dataSource.getResponseHeaders(), defaultExtractorInput, this.playerId);
                defaultExtractorInput = defaultExtractorInput;
            }
            this.extractor = hlsMediaChunkExtractorCreateExtractor;
            if (hlsMediaChunkExtractorCreateExtractor.isPackedAudioExtractor()) {
                this.output.setSampleOffsetUs(jPeekId3PrivTimestamp != androidx.media3.common.C.TIME_UNSET ? this.timestampAdjuster.adjustTsTimestamp(jPeekId3PrivTimestamp) : this.startTimeUs);
            } else {
                this.output.setSampleOffsetUs(0L);
            }
            this.output.onNewExtractor();
            this.extractor.init(this.output);
        }
        this.output.setDrmInitData(this.drmInitData);
        return defaultExtractorInput;
    }

    public static boolean shouldSpliceIn(androidx.media3.exoplayer.hls.HlsMediaChunk hlsMediaChunk, long j, android.net.Uri uri, boolean z6, androidx.media3.exoplayer.hls.HlsChunkSource.SegmentBaseHolder segmentBaseHolder, long j9) {
        if (hlsMediaChunk == null) {
            return false;
        }
        if (uri.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted) {
            return false;
        }
        return !z6 || j9 + segmentBaseHolder.segmentBase.relativeStartTimeUs < j;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public void clearShouldSpliceIn() {
        this.shouldSpliceIn = false;
    }

    public int getFirstSampleIndex(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.shouldSpliceIn);
        if (i3 >= this.sampleQueueFirstSampleIndices.size()) {
            return 0;
        }
        return ((java.lang.Integer) this.sampleQueueFirstSampleIndices.get(i3)).intValue();
    }

    public long getPublishedEndTimeUs() {
        long j = this.publishedDurationUs;
        return j != androidx.media3.common.C.TIME_UNSET ? this.startTimeUs + j : androidx.media3.common.C.TIME_UNSET;
    }

    public void init(androidx.media3.exoplayer.hls.HlsSampleStreamWrapper hlsSampleStreamWrapper, p076i4.AbstractC2186b0 abstractC2186b0) {
        this.output = hlsSampleStreamWrapper;
        this.sampleQueueFirstSampleIndices = abstractC2186b0;
    }

    public void invalidateExtractor() {
        this.extractorInvalidated = true;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    public boolean isPublished() {
        return this.publishedDurationUs != androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void load() {
        androidx.media3.exoplayer.hls.HlsMediaChunkExtractor hlsMediaChunkExtractor;
        this.output.getClass();
        if (this.extractor == null && (hlsMediaChunkExtractor = this.previousExtractor) != null && hlsMediaChunkExtractor.isReusable()) {
            this.extractor = this.previousExtractor;
            this.initDataLoadRequired = false;
        }
        maybeLoadInitData();
        if (this.loadCanceled) {
            return;
        }
        if (!this.hasGapTag) {
            loadMedia();
        }
        this.loadCompleted = !this.loadCanceled;
    }

    public void publish(long j) {
        this.publishedDurationUs = j;
    }

    public boolean shouldSpliceIn() {
        return this.shouldSpliceIn;
    }
}
