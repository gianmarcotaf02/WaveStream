package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public class MediaExtractorCompatInternal {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    private static final java.lang.String TAG = "MediaExtractorCompatInt";
    private androidx.media3.datasource.DataSource currentDataSource;
    private final androidx.media3.datasource.DataSource.Factory dataSourceFactory;
    private boolean hasBeenPrepared;
    private java.util.Map<java.lang.String, java.lang.String> httpRequestHeaders;
    private android.media.metrics.LogSessionId logSessionId;
    private long offsetInCurrentFile;
    private androidx.media3.extractor.SeekPoint pendingSeek;
    private final androidx.media3.exoplayer.source.ProgressiveMediaExtractor progressiveMediaExtractor;
    private androidx.media3.extractor.SeekMap seekMap;
    private boolean tracksEnded;
    private int upstreamFormatsCount;
    private final androidx.media3.extractor.PositionHolder positionHolder = new androidx.media3.extractor.PositionHolder();
    private final androidx.media3.exoplayer.upstream.Allocator allocator = new androidx.media3.exoplayer.upstream.DefaultAllocator(true, 65536);
    private final java.util.ArrayList<androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorTrack> tracks = new java.util.ArrayList<>();
    private final android.util.SparseArray<androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorSampleQueue> sampleQueues = new android.util.SparseArray<>();
    private final androidx.media3.exoplayer.MediaExtractorCompatInternal.SampleMetadataQueue sampleMetadataQueue = new androidx.media3.exoplayer.MediaExtractorCompatInternal.SampleMetadataQueue();
    private final androidx.media3.exoplayer.FormatHolder formatHolder = new androidx.media3.exoplayer.FormatHolder();
    private final androidx.media3.decoder.DecoderInputBuffer sampleHolderWithBufferReplacementDisabled = androidx.media3.decoder.DecoderInputBuffer.newNoDataInstance();
    private final androidx.media3.decoder.DecoderInputBuffer sampleHolderWithBufferReplacementEnabled = new androidx.media3.decoder.DecoderInputBuffer(2);
    private final java.util.Set<java.lang.Integer> selectedTrackIndices = new java.util.HashSet();

    public final class ExtractorOutputImpl implements androidx.media3.extractor.ExtractorOutput {
        private ExtractorOutputImpl() {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
            androidx.media3.exoplayer.MediaExtractorCompatInternal.this.tracksEnded = true;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(androidx.media3.extractor.SeekMap seekMap) {
            androidx.media3.exoplayer.MediaExtractorCompatInternal.this.seekMap = seekMap;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public androidx.media3.extractor.TrackOutput track(int i3, int i9) {
            androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorSampleQueue mediaExtractorSampleQueue = (androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorSampleQueue) androidx.media3.exoplayer.MediaExtractorCompatInternal.this.sampleQueues.get(i3);
            if (mediaExtractorSampleQueue != null) {
                return mediaExtractorSampleQueue;
            }
            if (androidx.media3.exoplayer.MediaExtractorCompatInternal.this.tracksEnded) {
                return new androidx.media3.extractor.DiscardingTrackOutput();
            }
            androidx.media3.exoplayer.MediaExtractorCompatInternal mediaExtractorCompatInternal = androidx.media3.exoplayer.MediaExtractorCompatInternal.this;
            androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorSampleQueue mediaExtractorSampleQueue2 = mediaExtractorCompatInternal.new MediaExtractorSampleQueue(mediaExtractorCompatInternal.allocator, i3);
            androidx.media3.exoplayer.MediaExtractorCompatInternal.this.sampleQueues.put(i3, mediaExtractorSampleQueue2);
            return mediaExtractorSampleQueue2;
        }
    }

    public final class MediaExtractorSampleQueue extends androidx.media3.exoplayer.source.SampleQueue {
        private int compatibilityTrackIndex;
        private int mainTrackIndex;
        public long trackDurationUs;
        public final int trackId;

        public MediaExtractorSampleQueue(androidx.media3.exoplayer.upstream.Allocator allocator, int i3) {
            super(allocator, null, null);
            this.trackId = i3;
            this.trackDurationUs = androidx.media3.common.C.TIME_UNSET;
            this.mainTrackIndex = -1;
            this.compatibilityTrackIndex = -1;
        }

        private void queueSampleMetadata(long j, int i3) {
            int i9 = ((1073741824 & i3) != 0 ? 2 : 0) | ((i3 & 1) != 0 ? 1 : 0);
            if (this.compatibilityTrackIndex != -1) {
                androidx.media3.exoplayer.MediaExtractorCompatInternal.this.sampleMetadataQueue.addLast(j, i9, this.compatibilityTrackIndex);
            }
            androidx.media3.exoplayer.MediaExtractorCompatInternal.this.sampleMetadataQueue.addLast(j, i9, this.mainTrackIndex);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void durationUs(long j) {
            this.trackDurationUs = j;
            super.durationUs(j);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue
        public androidx.media3.common.Format getAdjustedUpstreamFormat(androidx.media3.common.Format format) {
            if (getUpstreamFormat() == null) {
                androidx.media3.exoplayer.MediaExtractorCompatInternal.this.onSampleQueueFormatInitialized(this, format);
            }
            return super.getAdjustedUpstreamFormat(format);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j, int i3, int i9, int i10, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
            int i11 = i3 & (-536870913);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.mainTrackIndex != -1);
            int writeIndex = getWriteIndex();
            super.sampleMetadata(j, i11, i9, i10, cryptoData);
            if (getWriteIndex() == writeIndex + 1) {
                queueSampleMetadata(j, i11);
            }
        }

        public void setCompatibilityTrackIndex(int i3) {
            this.compatibilityTrackIndex = i3;
        }

        public void setMainTrackIndex(int i3) {
            this.mainTrackIndex = i3;
        }

        public java.lang.String toString() {
            int i3 = this.trackId;
            int i9 = this.mainTrackIndex;
            int i10 = this.compatibilityTrackIndex;
            java.lang.StringBuilder sbS = p121o0.p.s(i3, i9, "trackId: ", ", mainTrackIndex: ", ", compatibilityTrackIndex: ");
            sbS.append(i10);
            return sbS.toString();
        }
    }

    public static final class MediaExtractorTrack {
        public final java.lang.String compatibilityTrackMimeType;
        public final boolean isCompatibilityTrack;
        public final androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorSampleQueue sampleQueue;

        /* JADX INFO: Access modifiers changed from: private */
        public androidx.media3.common.Format getFormat(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
            formatHolder.clear();
            this.sampleQueue.read(formatHolder, decoderInputBuffer, 2, false);
            androidx.media3.common.Format format = formatHolder.format;
            format.getClass();
            formatHolder.clear();
            return format;
        }

        public android.media.MediaFormat createDownstreamMediaFormat(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
            androidx.media3.common.Format format = getFormat(formatHolder, decoderInputBuffer);
            android.media.MediaFormat mediaFormatCreateMediaFormatFromFormat = androidx.media3.common.util.MediaFormatUtil.createMediaFormatFromFormat(format);
            if (this.compatibilityTrackMimeType != null) {
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    mediaFormatCreateMediaFormatFromFormat.removeKey("codecs-string");
                }
                mediaFormatCreateMediaFormatFromFormat.setString("mime", this.compatibilityTrackMimeType);
            }
            android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel = androidx.media3.common.util.CodecSpecificDataUtil.getCodecProfileAndLevel(format);
            if (codecProfileAndLevel != null) {
                mediaFormatCreateMediaFormatFromFormat.setInteger("profile", ((java.lang.Integer) codecProfileAndLevel.first).intValue());
                mediaFormatCreateMediaFormatFromFormat.setInteger("level", ((java.lang.Integer) codecProfileAndLevel.second).intValue());
            }
            return mediaFormatCreateMediaFormatFromFormat;
        }

        public void discardFrontSample() {
            this.sampleQueue.skip(1);
            this.sampleQueue.discardToRead();
        }

        public int getIdOfBackingTrack() {
            return this.sampleQueue.trackId;
        }

        public java.lang.String toString() {
            return "MediaExtractorSampleQueue: " + this.sampleQueue + ", isCompatibilityTrack: " + this.isCompatibilityTrack + ", compatibilityTrackMimeType: " + this.compatibilityTrackMimeType;
        }

        private MediaExtractorTrack(androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorSampleQueue mediaExtractorSampleQueue, boolean z6, java.lang.String str) {
            this.sampleQueue = mediaExtractorSampleQueue;
            this.isCompatibilityTrack = z6;
            this.compatibilityTrackMimeType = str;
        }
    }

    public static final class SampleMetadataQueue {
        private final java.util.ArrayDeque<androidx.media3.exoplayer.MediaExtractorCompatInternal.SampleMetadataQueue.SampleMetadata> sampleMetadataPool = new java.util.ArrayDeque<>();
        private final java.util.ArrayDeque<androidx.media3.exoplayer.MediaExtractorCompatInternal.SampleMetadataQueue.SampleMetadata> sampleMetadataQueue = new java.util.ArrayDeque<>();

        public static final class SampleMetadata {
            public int flags;
            public long timeUs;
            public int trackIndex;

            public SampleMetadata(long j, int i3, int i9) {
                set(j, i3, i9);
            }

            public void set(long j, int i3, int i9) {
                this.timeUs = j;
                this.flags = i3;
                this.trackIndex = i9;
            }
        }

        private androidx.media3.exoplayer.MediaExtractorCompatInternal.SampleMetadataQueue.SampleMetadata obtainSampleMetadata(long j, int i3, int i9) {
            androidx.media3.exoplayer.MediaExtractorCompatInternal.SampleMetadataQueue.SampleMetadata sampleMetadata = this.sampleMetadataPool.isEmpty() ? new androidx.media3.exoplayer.MediaExtractorCompatInternal.SampleMetadataQueue.SampleMetadata(j, i3, i9) : this.sampleMetadataPool.pop();
            sampleMetadata.set(j, i3, i9);
            return sampleMetadata;
        }

        public void addLast(long j, int i3, int i9) {
            this.sampleMetadataQueue.addLast(obtainSampleMetadata(j, i3, i9));
        }

        public void clear() {
            java.util.Iterator<androidx.media3.exoplayer.MediaExtractorCompatInternal.SampleMetadataQueue.SampleMetadata> it = this.sampleMetadataQueue.iterator();
            while (it.hasNext()) {
                this.sampleMetadataPool.push(it.next());
            }
            this.sampleMetadataQueue.clear();
        }

        public boolean isEmpty() {
            return this.sampleMetadataQueue.isEmpty();
        }

        public androidx.media3.exoplayer.MediaExtractorCompatInternal.SampleMetadataQueue.SampleMetadata peekFirst() {
            return this.sampleMetadataQueue.peekFirst();
        }

        public androidx.media3.exoplayer.MediaExtractorCompatInternal.SampleMetadataQueue.SampleMetadata removeFirst() {
            androidx.media3.exoplayer.MediaExtractorCompatInternal.SampleMetadataQueue.SampleMetadata sampleMetadataRemoveFirst = this.sampleMetadataQueue.removeFirst();
            this.sampleMetadataPool.push(sampleMetadataRemoveFirst);
            return sampleMetadataRemoveFirst;
        }
    }

    public MediaExtractorCompatInternal(androidx.media3.exoplayer.source.ProgressiveMediaExtractor progressiveMediaExtractor, androidx.media3.datasource.DataSource.Factory factory) {
        this.progressiveMediaExtractor = progressiveMediaExtractor;
        this.dataSourceFactory = factory;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"sampleMetadataQueue.peekFirst()"}, result = true)
    private boolean advanceToSampleOrEndOfInput() {
        try {
            maybeResolvePendingSeek();
            boolean z6 = false;
            while (true) {
                if (!this.sampleMetadataQueue.isEmpty()) {
                    java.util.Set<java.lang.Integer> set = this.selectedTrackIndices;
                    androidx.media3.exoplayer.MediaExtractorCompatInternal.SampleMetadataQueue.SampleMetadata sampleMetadataPeekFirst = this.sampleMetadataQueue.peekFirst();
                    sampleMetadataPeekFirst.getClass();
                    if (set.contains(java.lang.Integer.valueOf(sampleMetadataPeekFirst.trackIndex))) {
                        return true;
                    }
                    skipOneSample();
                } else {
                    if (z6) {
                        return false;
                    }
                    try {
                        int i3 = this.progressiveMediaExtractor.read(this.positionHolder);
                        if (i3 == -1) {
                            z6 = true;
                        } else if (i3 == 1) {
                            reopenCurrentDataSource(this.positionHolder.position);
                        }
                    } catch (java.lang.Exception | java.lang.OutOfMemoryError e6) {
                        androidx.media3.common.util.Log.w(TAG, "Treating exception as the end of input.", e6);
                    }
                }
            }
        } catch (java.io.IOException e9) {
            androidx.media3.common.util.Log.w(TAG, "Treating exception as the end of input.", e9);
            return false;
        }
    }

    private androidx.media3.datasource.DataSpec buildDataSpec(android.net.Uri uri, long j) {
        androidx.media3.datasource.DataSpec.Builder flags = new androidx.media3.datasource.DataSpec.Builder().setUri(uri).setPosition(j).setFlags(6);
        java.util.Map<java.lang.String, java.lang.String> map = this.httpRequestHeaders;
        if (map != null) {
            flags.setHttpRequestHeaders(map);
        }
        return flags.build();
    }

    private void maybeResolvePendingSeek() {
        androidx.media3.extractor.SeekPoint seekPoint = this.pendingSeek;
        if (seekPoint == null) {
            return;
        }
        seekPoint.getClass();
        this.progressiveMediaExtractor.seek(seekPoint.position, seekPoint.timeUs);
        reopenCurrentDataSource(seekPoint.position);
        this.pendingSeek = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void onSampleQueueFormatInitialized(androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorSampleQueue mediaExtractorSampleQueue, androidx.media3.common.Format format) {
        boolean z6 = true;
        this.upstreamFormatsCount++;
        mediaExtractorSampleQueue.setMainTrackIndex(this.tracks.size());
        java.lang.Object[] objArr = 0;
        this.tracks.add(new androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorTrack(mediaExtractorSampleQueue, false, null));
        java.lang.String alternativeCodecMimeType = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getAlternativeCodecMimeType(format);
        if (alternativeCodecMimeType != null) {
            mediaExtractorSampleQueue.setCompatibilityTrackIndex(this.tracks.size());
            this.tracks.add(new androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorTrack(mediaExtractorSampleQueue, z6, alternativeCodecMimeType));
        }
    }

    private void peekNextSelectedTrackSample(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
        java.util.ArrayList<androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorTrack> arrayList = this.tracks;
        androidx.media3.exoplayer.MediaExtractorCompatInternal.SampleMetadataQueue.SampleMetadata sampleMetadataPeekFirst = this.sampleMetadataQueue.peekFirst();
        sampleMetadataPeekFirst.getClass();
        androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorSampleQueue mediaExtractorSampleQueue = arrayList.get(sampleMetadataPeekFirst.trackIndex).sampleQueue;
        int i3 = mediaExtractorSampleQueue.read(this.formatHolder, decoderInputBuffer, 1, false);
        if (i3 == -5) {
            i3 = mediaExtractorSampleQueue.read(this.formatHolder, decoderInputBuffer, 1, false);
        }
        this.formatHolder.clear();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(i3 == -4);
    }

    private void populatePlatformCryptoInfoParameters(android.media.MediaCodec.CryptoInfo cryptoInfo) {
        androidx.media3.decoder.CryptoInfo cryptoInfo2 = this.sampleHolderWithBufferReplacementEnabled.cryptoInfo;
        cryptoInfo2.getClass();
        android.media.MediaCodec.CryptoInfo frameworkCryptoInfo = cryptoInfo2.getFrameworkCryptoInfo();
        cryptoInfo.numSubSamples = frameworkCryptoInfo.numSubSamples;
        cryptoInfo.numBytesOfClearData = frameworkCryptoInfo.numBytesOfClearData;
        cryptoInfo.numBytesOfEncryptedData = frameworkCryptoInfo.numBytesOfEncryptedData;
        cryptoInfo.key = frameworkCryptoInfo.key;
        cryptoInfo.iv = frameworkCryptoInfo.iv;
        cryptoInfo.mode = frameworkCryptoInfo.mode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void prepareDataSource(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.common.ParserException {
        int i3;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.hasBeenPrepared);
        this.hasBeenPrepared = true;
        this.offsetInCurrentFile = dataSpec.position;
        this.currentDataSource = dataSource;
        long jOpen = dataSource.open(dataSpec);
        androidx.media3.exoplayer.source.ProgressiveMediaExtractor progressiveMediaExtractor = this.progressiveMediaExtractor;
        androidx.media3.datasource.DataSource dataSource2 = this.currentDataSource;
        android.net.Uri uri = dataSource2.getUri();
        uri.getClass();
        java.lang.Throwable th = null;
        progressiveMediaExtractor.init(dataSource2, uri, this.currentDataSource.getResponseHeaders(), 0L, jOpen, new androidx.media3.exoplayer.MediaExtractorCompatInternal.ExtractorOutputImpl());
        boolean z6 = true;
        while (z6) {
            try {
                i3 = this.progressiveMediaExtractor.read(this.positionHolder);
            } catch (java.lang.Exception | java.lang.OutOfMemoryError e6) {
                th = e6;
                i3 = -1;
            }
            boolean z9 = !this.tracksEnded || this.upstreamFormatsCount < this.sampleQueues.size() || this.seekMap == null;
            if (th != null || (z9 && i3 == -1)) {
                release();
                throw androidx.media3.common.ParserException.createForMalformedContainer(th != null ? "Exception encountered while parsing input media." : "Reached end of input before preparation completed.", th);
            }
            if (i3 == 1) {
                reopenCurrentDataSource(this.positionHolder.position);
            }
            z6 = z9;
        }
    }

    private void reopenCurrentDataSource(long j) {
        androidx.media3.datasource.DataSource dataSource = this.currentDataSource;
        dataSource.getClass();
        android.net.Uri uri = dataSource.getUri();
        uri.getClass();
        androidx.media3.datasource.DataSourceUtil.closeQuietly(dataSource);
        long jOpen = dataSource.open(buildDataSpec(uri, this.offsetInCurrentFile + j));
        if (jOpen != -1) {
            jOpen += j;
        }
        this.progressiveMediaExtractor.init(dataSource, uri, dataSource.getResponseHeaders(), j, jOpen, new androidx.media3.exoplayer.MediaExtractorCompatInternal.ExtractorOutputImpl());
    }

    private void skipOneSample() {
        androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorTrack mediaExtractorTrack = this.tracks.get(this.sampleMetadataQueue.removeFirst().trackIndex);
        if (mediaExtractorTrack.isCompatibilityTrack) {
            return;
        }
        mediaExtractorTrack.discardFrontSample();
    }

    public boolean advance() {
        if (!advanceToSampleOrEndOfInput()) {
            return false;
        }
        skipOneSample();
        return advanceToSampleOrEndOfInput();
    }

    public androidx.media3.exoplayer.upstream.Allocator getAllocator() {
        return this.allocator;
    }

    public long getCachedDuration() {
        if (!advanceToSampleOrEndOfInput()) {
            return 0L;
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MIN_VALUE;
        for (int i3 = 0; i3 < this.tracks.size(); i3++) {
            androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorSampleQueue mediaExtractorSampleQueue = this.tracks.get(i3).sampleQueue;
            jMax2 = java.lang.Math.max(jMax2, mediaExtractorSampleQueue.getLargestReadTimestampUs());
            jMax = java.lang.Math.max(jMax, mediaExtractorSampleQueue.getLargestQueuedTimestampUs());
        }
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(jMax != Long.MIN_VALUE);
        if (jMax2 == jMax) {
            return 0L;
        }
        return (jMax - (jMax2 != Long.MIN_VALUE ? jMax2 : 0L)) + 10000;
    }

    public androidx.media3.common.DrmInitData getDrmInitData() {
        for (int i3 = 0; i3 < this.tracks.size(); i3++) {
            androidx.media3.common.DrmInitData drmInitData = this.tracks.get(i3).getFormat(this.formatHolder, this.sampleHolderWithBufferReplacementDisabled).drmInitData;
            if (drmInitData != null) {
                return drmInitData;
            }
        }
        return null;
    }

    public android.media.metrics.LogSessionId getLogSessionId() {
        android.media.metrics.LogSessionId logSessionId = this.logSessionId;
        return logSessionId != null ? logSessionId : android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE;
    }

    public android.os.PersistableBundle getMetrics() {
        java.lang.String str;
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        java.lang.String underlyingImplementationName = this.progressiveMediaExtractor.getUnderlyingImplementationName();
        if (underlyingImplementationName != null) {
            persistableBundle.putString("android.media.mediaextractor.fmt", underlyingImplementationName);
        }
        if (!this.tracks.isEmpty() && (str = this.tracks.get(0).getFormat(this.formatHolder, this.sampleHolderWithBufferReplacementDisabled).containerMimeType) != null) {
            persistableBundle.putString("android.media.mediaextractor.mime", str);
        }
        persistableBundle.putInt("android.media.mediaextractor.ntrk", this.tracks.size());
        return persistableBundle;
    }

    public java.util.Map<java.util.UUID, byte[]> getPsshInfo() {
        androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom psshAtom;
        androidx.media3.common.DrmInitData drmInitData = getDrmInitData();
        if (drmInitData == null) {
            return null;
        }
        java.util.HashMap map = new java.util.HashMap();
        for (int i3 = 0; i3 < drmInitData.schemeDataCount; i3++) {
            byte[] bArr = drmInitData.get(i3).data;
            if (bArr != null && (psshAtom = androidx.media3.extractor.mp4.PsshAtomUtil.parsePsshAtom(bArr)) != null) {
                map.put(psshAtom.uuid, psshAtom.schemeData);
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public boolean getSampleCryptoInfo(android.media.MediaCodec.CryptoInfo cryptoInfo) {
        if (!advanceToSampleOrEndOfInput() || (this.sampleMetadataQueue.peekFirst().flags & 2) == 0) {
            return false;
        }
        peekNextSelectedTrackSample(this.sampleHolderWithBufferReplacementEnabled);
        populatePlatformCryptoInfoParameters(cryptoInfo);
        return true;
    }

    public int getSampleFlags() {
        if (advanceToSampleOrEndOfInput()) {
            return this.sampleMetadataQueue.peekFirst().flags;
        }
        return -1;
    }

    public long getSampleSize() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1L;
        }
        peekNextSelectedTrackSample(this.sampleHolderWithBufferReplacementEnabled);
        java.nio.ByteBuffer byteBuffer = this.sampleHolderWithBufferReplacementEnabled.data;
        byteBuffer.getClass();
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    public long getSampleTime() {
        if (advanceToSampleOrEndOfInput()) {
            return this.sampleMetadataQueue.peekFirst().timeUs;
        }
        return -1L;
    }

    public int getSampleTrackIndex() {
        if (advanceToSampleOrEndOfInput()) {
            return this.sampleMetadataQueue.peekFirst().trackIndex;
        }
        return -1;
    }

    public int getTrackCount() {
        return this.tracks.size();
    }

    public android.media.MediaFormat getTrackFormat(int i3) {
        androidx.media3.exoplayer.MediaExtractorCompatInternal.MediaExtractorTrack mediaExtractorTrack = this.tracks.get(i3);
        android.media.MediaFormat mediaFormatCreateDownstreamMediaFormat = mediaExtractorTrack.createDownstreamMediaFormat(this.formatHolder, this.sampleHolderWithBufferReplacementDisabled);
        long j = mediaExtractorTrack.sampleQueue.trackDurationUs;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            mediaFormatCreateDownstreamMediaFormat.setLong("durationUs", j);
            return mediaFormatCreateDownstreamMediaFormat;
        }
        androidx.media3.extractor.SeekMap seekMap = this.seekMap;
        if (seekMap != null && seekMap.getDurationUs() != androidx.media3.common.C.TIME_UNSET) {
            mediaFormatCreateDownstreamMediaFormat.setLong("durationUs", this.seekMap.getDurationUs());
        }
        return mediaFormatCreateDownstreamMediaFormat;
    }

    public boolean hasCacheReachedEndOfStream() {
        return getCachedDuration() == 0;
    }

    public int readSampleData(java.nio.ByteBuffer byteBuffer, int i3) {
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        byteBuffer.position(i3);
        byteBuffer.limit(byteBuffer.capacity());
        androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer = this.sampleHolderWithBufferReplacementDisabled;
        decoderInputBuffer.data = byteBuffer;
        peekNextSelectedTrackSample(decoderInputBuffer);
        byteBuffer.flip();
        byteBuffer.position(i3);
        this.sampleHolderWithBufferReplacementDisabled.data = null;
        return byteBuffer.remaining();
    }

    public void release() {
        for (int i3 = 0; i3 < this.sampleQueues.size(); i3++) {
            this.sampleQueues.valueAt(i3).release();
        }
        this.sampleQueues.clear();
        this.progressiveMediaExtractor.release();
        this.pendingSeek = null;
        androidx.media3.datasource.DataSourceUtil.closeQuietly(this.currentDataSource);
        this.currentDataSource = null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    public void seekTo(long j, int i3) {
        androidx.media3.extractor.SeekMap.SeekPoints seekPoints;
        androidx.media3.extractor.SeekPoint seekPoint;
        if (this.seekMap == null) {
            return;
        }
        if (this.selectedTrackIndices.size() == 1) {
            androidx.media3.extractor.SeekMap seekMap = this.seekMap;
            if (seekMap instanceof androidx.media3.extractor.TrackAwareSeekMap) {
                androidx.media3.extractor.TrackAwareSeekMap trackAwareSeekMap = (androidx.media3.extractor.TrackAwareSeekMap) seekMap;
                int idOfBackingTrack = this.tracks.get(this.selectedTrackIndices.iterator().next().intValue()).getIdOfBackingTrack();
                seekPoints = trackAwareSeekMap.isSeekable(idOfBackingTrack) ? trackAwareSeekMap.getSeekPoints(j, idOfBackingTrack) : trackAwareSeekMap.getSeekPoints(j);
            } else {
                seekPoints = this.seekMap.getSeekPoints(j);
            }
        } else {
            seekPoints = this.seekMap.getSeekPoints(j);
        }
        if (i3 == 0) {
            seekPoint = seekPoints.first;
        } else if (i3 == 1) {
            seekPoint = seekPoints.second;
        } else {
            if (i3 != 2) {
                throw new java.lang.IllegalArgumentException();
            }
            seekPoint = java.lang.Math.abs(j - seekPoints.second.timeUs) < java.lang.Math.abs(j - seekPoints.first.timeUs) ? seekPoints.second : seekPoints.first;
        }
        this.sampleMetadataQueue.clear();
        for (int i9 = 0; i9 < this.sampleQueues.size(); i9++) {
            this.sampleQueues.valueAt(i9).reset();
        }
        this.pendingSeek = seekPoint;
    }

    public void selectTrack(int i3) {
        this.selectedTrackIndices.add(java.lang.Integer.valueOf(i3));
    }

    public void setDataSource(android.net.Uri uri, long j) throws androidx.media3.common.ParserException {
        prepareDataSource(this.dataSourceFactory.createDataSource(), buildDataSpec(uri, j));
    }

    public void setLogSessionId(android.media.metrics.LogSessionId logSessionId) {
        android.media.metrics.LogSessionId unused = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.logSessionId = logSessionId;
    }

    public void unselectTrack(int i3) {
        this.selectedTrackIndices.remove(java.lang.Integer.valueOf(i3));
    }

    public void setDataSource(android.content.res.AssetFileDescriptor assetFileDescriptor) throws androidx.media3.common.ParserException {
        if (assetFileDescriptor.getDeclaredLength() == -1) {
            setDataSource(assetFileDescriptor.getFileDescriptor());
        } else {
            setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
        }
    }

    public void setDataSource(java.io.FileDescriptor fileDescriptor) throws androidx.media3.common.ParserException {
        setDataSource(fileDescriptor, 0L, -1L);
    }

    public void setDataSource(java.io.FileDescriptor fileDescriptor, long j, long j9) throws androidx.media3.common.ParserException {
        prepareDataSource(new androidx.media3.datasource.FileDescriptorDataSource(fileDescriptor, j, j9), buildDataSpec(android.net.Uri.EMPTY, 0L));
    }

    public void setDataSource(android.content.Context context, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> map) throws androidx.media3.common.ParserException {
        if (androidx.media3.common.util.Util.isLocalFileUri(uri)) {
            java.lang.String path = uri.getPath();
            path.getClass();
            setDataSource(path);
            return;
        }
        try {
            android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                try {
                    setDataSource(assetFileDescriptorOpenAssetFileDescriptor);
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                assetFileDescriptorOpenAssetFileDescriptor.close();
            }
            setDataSource(uri.toString(), map);
        } catch (java.io.FileNotFoundException | java.lang.SecurityException unused) {
        }
    }

    public void setDataSource(java.lang.String str) throws androidx.media3.common.ParserException {
        setDataSource(str, (java.util.Map<java.lang.String, java.lang.String>) null);
    }

    public void setDataSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) throws androidx.media3.common.ParserException {
        this.httpRequestHeaders = map;
        prepareDataSource(this.dataSourceFactory.createDataSource(), buildDataSpec(android.net.Uri.parse(str), 0L));
    }

    public void setDataSource(android.media.MediaDataSource mediaDataSource) throws androidx.media3.common.ParserException {
        prepareDataSource(new androidx.media3.datasource.MediaDataSourceAdapter(mediaDataSource, false), buildDataSpec(android.net.Uri.EMPTY, 0L));
    }
}
