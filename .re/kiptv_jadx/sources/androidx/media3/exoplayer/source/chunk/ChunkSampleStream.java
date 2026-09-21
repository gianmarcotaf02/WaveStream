package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public class ChunkSampleStream<T extends androidx.media3.exoplayer.source.chunk.ChunkSource> implements androidx.media3.exoplayer.source.SampleStream, androidx.media3.exoplayer.source.SequenceableLoader, androidx.media3.exoplayer.upstream.Loader.Callback<androidx.media3.exoplayer.source.chunk.Chunk>, androidx.media3.exoplayer.upstream.Loader.ReleaseCallback {
    private static final java.lang.String TAG = "ChunkSampleStream";
    private final androidx.media3.exoplayer.source.SequenceableLoader.Callback<androidx.media3.exoplayer.source.chunk.ChunkSampleStream<T>> callback;
    private androidx.media3.exoplayer.source.chunk.BaseMediaChunk canceledMediaChunk;
    private final androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput chunkOutput;
    private final T chunkSource;
    private final androidx.media3.exoplayer.source.SampleQueue[] embeddedSampleQueues;
    private final androidx.media3.common.Format[] embeddedTrackFormats;
    private final int[] embeddedTrackTypes;
    private final boolean[] embeddedTracksSelected;
    private boolean hasInitialDiscontinuity;
    private long lastSeekPositionUs;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final androidx.media3.exoplayer.upstream.Loader loader;
    private androidx.media3.exoplayer.source.chunk.Chunk loadingChunk;
    boolean loadingFinished;
    private final java.util.ArrayList<androidx.media3.exoplayer.source.chunk.BaseMediaChunk> mediaChunks;
    private final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private boolean needToEvaluateInitialDiscontinuity;
    private final androidx.media3.exoplayer.source.chunk.ChunkHolder nextChunkHolder;
    private int nextNotifyPrimaryFormatMediaChunkIndex;
    private long pendingResetPositionUs;
    private androidx.media3.common.Format primaryDownstreamTrackFormat;
    private final androidx.media3.exoplayer.source.SampleQueue primarySampleQueue;
    public final int primaryTrackType;
    private final java.util.List<androidx.media3.exoplayer.source.chunk.BaseMediaChunk> readOnlyMediaChunks;
    private androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback<T> releaseCallback;
    private boolean suppressRead;

    public final class EmbeddedSampleStream implements androidx.media3.exoplayer.source.SampleStream {
        private final int index;
        private boolean notifiedDownstreamFormat;
        public final androidx.media3.exoplayer.source.chunk.ChunkSampleStream<T> parent;
        private final androidx.media3.exoplayer.source.SampleQueue sampleQueue;

        public EmbeddedSampleStream(androidx.media3.exoplayer.source.chunk.ChunkSampleStream<T> chunkSampleStream, androidx.media3.exoplayer.source.SampleQueue sampleQueue, int i3) {
            this.parent = chunkSampleStream;
            this.sampleQueue = sampleQueue;
            this.index = i3;
        }

        private void maybeNotifyDownstreamFormat() {
            if (this.notifiedDownstreamFormat) {
                return;
            }
            androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.mediaSourceEventDispatcher.downstreamFormatChanged(androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.embeddedTrackTypes[this.index], androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.embeddedTrackFormats[this.index], 0, null, androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.lastSeekPositionUs);
            this.notifiedDownstreamFormat = true;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return !androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.isPendingReset() && this.sampleQueue.isReady(androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.loadingFinished);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i3) {
            if (androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.isPendingReset()) {
                return -3;
            }
            if (androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.canceledMediaChunk != null && androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.canceledMediaChunk.getFirstSampleIndex(this.index + 1) <= this.sampleQueue.getReadIndex()) {
                return -3;
            }
            maybeNotifyDownstreamFormat();
            return this.sampleQueue.read(formatHolder, decoderInputBuffer, i3, androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.loadingFinished);
        }

        public void release() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.embeddedTracksSelected[this.index]);
            androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.embeddedTracksSelected[this.index] = false;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            if (androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.isPendingReset()) {
                return 0;
            }
            int skipCount = this.sampleQueue.getSkipCount(j, androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.loadingFinished);
            if (androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.canceledMediaChunk != null) {
                skipCount = java.lang.Math.min(skipCount, androidx.media3.exoplayer.source.chunk.ChunkSampleStream.this.canceledMediaChunk.getFirstSampleIndex(this.index + 1) - this.sampleQueue.getReadIndex());
            }
            this.sampleQueue.skip(skipCount);
            if (skipCount > 0) {
                maybeNotifyDownstreamFormat();
            }
            return skipCount;
        }
    }

    public interface ReleaseCallback<T extends androidx.media3.exoplayer.source.chunk.ChunkSource> {
        void onSampleStreamReleased(androidx.media3.exoplayer.source.chunk.ChunkSampleStream<T> chunkSampleStream);
    }

    public ChunkSampleStream(int i3, int[] iArr, androidx.media3.common.Format[] formatArr, T t9, androidx.media3.exoplayer.source.SequenceableLoader.Callback<androidx.media3.exoplayer.source.chunk.ChunkSampleStream<T>> callback, androidx.media3.exoplayer.upstream.Allocator allocator, long j, androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher2, boolean z6, long j9, androidx.media3.exoplayer.util.ReleasableExecutor releasableExecutor) {
        this.primaryTrackType = i3;
        iArr = iArr == null ? new int[0] : iArr;
        this.embeddedTrackTypes = iArr;
        this.embeddedTrackFormats = formatArr == null ? new androidx.media3.common.Format[0] : formatArr;
        this.chunkSource = t9;
        this.callback = callback;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.loader = releasableExecutor != null ? new androidx.media3.exoplayer.upstream.Loader(releasableExecutor) : new androidx.media3.exoplayer.upstream.Loader(TAG);
        this.nextChunkHolder = new androidx.media3.exoplayer.source.chunk.ChunkHolder();
        java.util.ArrayList<androidx.media3.exoplayer.source.chunk.BaseMediaChunk> arrayList = new java.util.ArrayList<>();
        this.mediaChunks = arrayList;
        this.readOnlyMediaChunks = java.util.Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.embeddedSampleQueues = new androidx.media3.exoplayer.source.SampleQueue[length];
        this.embeddedTracksSelected = new boolean[length];
        int i9 = length + 1;
        int[] iArr2 = new int[i9];
        androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = new androidx.media3.exoplayer.source.SampleQueue[i9];
        androidx.media3.exoplayer.source.SampleQueue sampleQueueCreateWithDrm = androidx.media3.exoplayer.source.SampleQueue.createWithDrm(allocator, drmSessionManager, eventDispatcher);
        this.primarySampleQueue = sampleQueueCreateWithDrm;
        iArr2[0] = i3;
        sampleQueueArr[0] = sampleQueueCreateWithDrm;
        int i10 = 0;
        while (i10 < length) {
            androidx.media3.exoplayer.source.SampleQueue sampleQueueCreateWithoutDrm = androidx.media3.exoplayer.source.SampleQueue.createWithoutDrm(allocator);
            this.embeddedSampleQueues[i10] = sampleQueueCreateWithoutDrm;
            int i11 = i10 + 1;
            sampleQueueArr[i11] = sampleQueueCreateWithoutDrm;
            iArr2[i11] = this.embeddedTrackTypes[i10];
            i10 = i11;
        }
        this.chunkOutput = new androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput(iArr2, sampleQueueArr);
        this.pendingResetPositionUs = j;
        this.lastSeekPositionUs = j;
        this.needToEvaluateInitialDiscontinuity = z6;
        if (!z6 || j9 == androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        this.needToEvaluateInitialDiscontinuity = false;
        this.hasInitialDiscontinuity = j9 < j;
    }

    private void discardDownstreamMediaChunks(int i3) {
        int iMin = java.lang.Math.min(primarySampleIndexToMediaChunkIndex(i3, 0), this.nextNotifyPrimaryFormatMediaChunkIndex);
        if (iMin > 0) {
            androidx.media3.common.util.Util.removeRange(this.mediaChunks, 0, iMin);
            this.nextNotifyPrimaryFormatMediaChunkIndex -= iMin;
        }
    }

    private void discardUpstream(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.loader.isLoading());
        int size = this.mediaChunks.size();
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (!haveReadFromMediaChunk(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        long j = getLastMediaChunk().endTimeUs;
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunkDiscardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(i3);
        if (this.mediaChunks.isEmpty()) {
            this.pendingResetPositionUs = this.lastSeekPositionUs;
        }
        this.loadingFinished = false;
        this.mediaSourceEventDispatcher.upstreamDiscarded(this.primaryTrackType, baseMediaChunkDiscardUpstreamMediaChunksFromIndex.startTimeUs, j);
    }

    private androidx.media3.exoplayer.source.chunk.BaseMediaChunk discardUpstreamMediaChunksFromIndex(int i3) {
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i3);
        java.util.ArrayList<androidx.media3.exoplayer.source.chunk.BaseMediaChunk> arrayList = this.mediaChunks;
        androidx.media3.common.util.Util.removeRange(arrayList, i3, arrayList.size());
        this.nextNotifyPrimaryFormatMediaChunkIndex = java.lang.Math.max(this.nextNotifyPrimaryFormatMediaChunkIndex, this.mediaChunks.size());
        int i9 = 0;
        this.primarySampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(0));
        while (true) {
            androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i9 >= sampleQueueArr.length) {
                return baseMediaChunk;
            }
            androidx.media3.exoplayer.source.SampleQueue sampleQueue = sampleQueueArr[i9];
            i9++;
            sampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(i9));
        }
    }

    private androidx.media3.exoplayer.source.chunk.BaseMediaChunk getLastMediaChunk() {
        return (androidx.media3.exoplayer.source.chunk.BaseMediaChunk) com.google.android.gms.internal.play_billing.M0.j(1, this.mediaChunks);
    }

    private boolean haveReadFromMediaChunk(int i3) {
        int readIndex;
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i3);
        if (this.primarySampleQueue.getReadIndex() > baseMediaChunk.getFirstSampleIndex(0)) {
            return true;
        }
        int i9 = 0;
        do {
            androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i9 >= sampleQueueArr.length) {
                return false;
            }
            readIndex = sampleQueueArr[i9].getReadIndex();
            i9++;
        } while (readIndex <= baseMediaChunk.getFirstSampleIndex(i9));
        return true;
    }

    private boolean isMediaChunk(androidx.media3.exoplayer.source.chunk.Chunk chunk) {
        return chunk instanceof androidx.media3.exoplayer.source.chunk.BaseMediaChunk;
    }

    private void maybeNotifyPrimaryTrackFormatChanged() {
        int iPrimarySampleIndexToMediaChunkIndex = primarySampleIndexToMediaChunkIndex(this.primarySampleQueue.getReadIndex(), this.nextNotifyPrimaryFormatMediaChunkIndex - 1);
        while (true) {
            int i3 = this.nextNotifyPrimaryFormatMediaChunkIndex;
            if (i3 > iPrimarySampleIndexToMediaChunkIndex) {
                return;
            }
            this.nextNotifyPrimaryFormatMediaChunkIndex = i3 + 1;
            maybeNotifyPrimaryTrackFormatChanged(i3);
        }
    }

    private int primarySampleIndexToMediaChunkIndex(int i3, int i9) {
        do {
            i9++;
            if (i9 >= this.mediaChunks.size()) {
                return this.mediaChunks.size() - 1;
            }
        } while (this.mediaChunks.get(i9).getFirstSampleIndex(0) <= i3);
        return i9 - 1;
    }

    private void resetSampleQueues() {
        this.primarySampleQueue.reset();
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.reset();
        }
    }

    public boolean consumeInitialDiscontinuity() {
        try {
            return this.hasInitialDiscontinuity;
        } finally {
            this.hasInitialDiscontinuity = false;
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        java.util.List<androidx.media3.exoplayer.source.chunk.BaseMediaChunk> list;
        long j;
        if (this.loadingFinished || this.loader.isLoading() || this.loader.hasFatalError()) {
            return false;
        }
        boolean zIsPendingReset = isPendingReset();
        if (zIsPendingReset) {
            list = java.util.Collections.EMPTY_LIST;
            j = this.pendingResetPositionUs;
        } else {
            list = this.readOnlyMediaChunks;
            j = getLastMediaChunk().endTimeUs;
        }
        this.chunkSource.getNextChunk(loadingInfo, j, list, this.nextChunkHolder);
        androidx.media3.exoplayer.source.chunk.ChunkHolder chunkHolder = this.nextChunkHolder;
        boolean z6 = chunkHolder.endOfStream;
        androidx.media3.exoplayer.source.chunk.Chunk chunk = chunkHolder.chunk;
        chunkHolder.clear();
        if (z6) {
            this.pendingResetPositionUs = androidx.media3.common.C.TIME_UNSET;
            this.loadingFinished = true;
            return true;
        }
        if (chunk == null) {
            return false;
        }
        this.loadingChunk = chunk;
        if (isMediaChunk(chunk)) {
            androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk = (androidx.media3.exoplayer.source.chunk.BaseMediaChunk) chunk;
            if (zIsPendingReset) {
                long j9 = baseMediaChunk.startTimeUs;
                long j10 = this.pendingResetPositionUs;
                if (j9 < j10) {
                    this.primarySampleQueue.setStartTimeUs(j10);
                    for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.embeddedSampleQueues) {
                        sampleQueue.setStartTimeUs(this.pendingResetPositionUs);
                    }
                    this.hasInitialDiscontinuity = this.needToEvaluateInitialDiscontinuity;
                }
                this.needToEvaluateInitialDiscontinuity = false;
                this.pendingResetPositionUs = androidx.media3.common.C.TIME_UNSET;
            }
            baseMediaChunk.init(this.chunkOutput);
            this.mediaChunks.add(baseMediaChunk);
        } else if (chunk instanceof androidx.media3.exoplayer.source.chunk.InitializationChunk) {
            ((androidx.media3.exoplayer.source.chunk.InitializationChunk) chunk).init(this.chunkOutput);
        }
        this.loader.startLoading(chunk, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(chunk.type));
        return true;
    }

    public void discardBuffer(long j, boolean z6) {
        if (isPendingReset()) {
            return;
        }
        int firstIndex = this.primarySampleQueue.getFirstIndex();
        this.primarySampleQueue.discardTo(j, z6, true);
        int firstIndex2 = this.primarySampleQueue.getFirstIndex();
        if (firstIndex2 > firstIndex) {
            long firstTimestampUs = this.primarySampleQueue.getFirstTimestampUs();
            int i3 = 0;
            while (true) {
                androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
                if (i3 >= sampleQueueArr.length) {
                    break;
                }
                sampleQueueArr[i3].discardTo(firstTimestampUs, z6, this.embeddedTracksSelected[i3]);
                i3++;
            }
        }
        discardDownstreamMediaChunks(firstIndex2);
    }

    public void discardUpstreamSamplesForClippedDuration(long j) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.loader.isLoading());
        if (isPendingReset() || j == androidx.media3.common.C.TIME_UNSET || this.mediaChunks.isEmpty()) {
            return;
        }
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk lastMediaChunk = getLastMediaChunk();
        long j9 = lastMediaChunk.clippedEndTimeUs;
        if (j9 == androidx.media3.common.C.TIME_UNSET) {
            j9 = lastMediaChunk.endTimeUs;
        }
        if (j9 <= j) {
            return;
        }
        long largestQueuedTimestampUs = this.primarySampleQueue.getLargestQueuedTimestampUs();
        if (largestQueuedTimestampUs <= j) {
            return;
        }
        this.primarySampleQueue.discardUpstreamFrom(java.lang.Math.max(j, this.primarySampleQueue.getLargestReadTimestampUs() + 1));
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.discardUpstreamFrom(java.lang.Math.max(j, sampleQueue.getLargestReadTimestampUs() + 1));
        }
        this.mediaSourceEventDispatcher.upstreamDiscarded(this.primaryTrackType, j, largestQueuedTimestampUs);
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
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            lastMediaChunk = this.mediaChunks.size() > 1 ? (androidx.media3.exoplayer.source.chunk.BaseMediaChunk) com.google.android.gms.internal.play_billing.M0.j(2, this.mediaChunks) : null;
        }
        if (lastMediaChunk != null) {
            jMax = java.lang.Math.max(jMax, lastMediaChunk.endTimeUs);
        }
        return java.lang.Math.max(jMax, this.primarySampleQueue.getLargestQueuedTimestampUs());
    }

    public T getChunkSource() {
        return this.chunkSource;
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

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
    }

    public boolean isPendingReset() {
        return this.pendingResetPositionUs != androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return !isPendingReset() && this.primarySampleQueue.isReady(this.loadingFinished);
    }

    public boolean mayHaveInitialDiscontinuity() {
        return ((!this.needToEvaluateInitialDiscontinuity && !this.hasInitialDiscontinuity) || this.loadingFinished || this.loader.hasFatalError()) ? false : true;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() {
        this.loader.maybeThrowError();
        this.primarySampleQueue.maybeThrowError();
        if (this.loader.isLoading()) {
            return;
        }
        this.chunkSource.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        this.primarySampleQueue.release();
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.release();
        }
        this.chunkSource.release();
        androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback<T> releaseCallback = this.releaseCallback;
        if (releaseCallback != null) {
            releaseCallback.onSampleStreamReleased(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i3) {
        if (isPendingReset() || mayHaveInitialDiscontinuity() || this.suppressRead) {
            return -3;
        }
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk = this.canceledMediaChunk;
        if (baseMediaChunk != null && baseMediaChunk.getFirstSampleIndex(0) <= this.primarySampleQueue.getReadIndex()) {
            return -3;
        }
        maybeNotifyPrimaryTrackFormatChanged();
        return this.primarySampleQueue.read(formatHolder, decoderInputBuffer, i3, this.loadingFinished);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        if (this.loader.hasFatalError() || isPendingReset()) {
            return;
        }
        if (!this.loader.isLoading()) {
            int preferredQueueSize = this.chunkSource.getPreferredQueueSize(j, this.readOnlyMediaChunks);
            if (preferredQueueSize < this.mediaChunks.size()) {
                discardUpstream(preferredQueueSize);
            }
            if (this.primarySampleQueue.hasQueuedTimestampsUpToReadEndTimeUs()) {
                this.loadingFinished = true;
                return;
            }
            return;
        }
        androidx.media3.exoplayer.source.chunk.Chunk chunk = this.loadingChunk;
        chunk.getClass();
        if (!(isMediaChunk(chunk) && haveReadFromMediaChunk(this.mediaChunks.size() - 1)) && this.chunkSource.shouldCancelLoad(j, chunk, this.readOnlyMediaChunks)) {
            this.loader.cancelLoading();
            if (isMediaChunk(chunk)) {
                this.canceledMediaChunk = (androidx.media3.exoplayer.source.chunk.BaseMediaChunk) chunk;
            }
        }
    }

    public void release() {
        release(null);
    }

    public void seekToUs(long j) {
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk;
        boolean zSeekTo;
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk2;
        this.lastSeekPositionUs = j;
        int i3 = 0;
        this.needToEvaluateInitialDiscontinuity = false;
        this.hasInitialDiscontinuity = false;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j;
            return;
        }
        int i9 = 0;
        while (true) {
            if (i9 < this.mediaChunks.size()) {
                baseMediaChunk = this.mediaChunks.get(i9);
                long j9 = baseMediaChunk.startTimeUs;
                if (j9 == j && baseMediaChunk.clippedStartTimeUs == androidx.media3.common.C.TIME_UNSET) {
                    break;
                } else if (j9 <= j) {
                    i9++;
                }
            }
            baseMediaChunk = null;
            break;
        }
        if (baseMediaChunk != null) {
            zSeekTo = this.primarySampleQueue.seekTo(baseMediaChunk.getFirstSampleIndex(0));
        } else {
            long nextLoadPositionUs = getNextLoadPositionUs();
            zSeekTo = this.primarySampleQueue.seekTo(j, nextLoadPositionUs == Long.MIN_VALUE || j < nextLoadPositionUs);
        }
        if (zSeekTo && (baseMediaChunk2 = this.canceledMediaChunk) != null && baseMediaChunk2.getFirstSampleIndex(0) <= this.primarySampleQueue.getReadIndex()) {
            zSeekTo = false;
        }
        if (zSeekTo) {
            this.nextNotifyPrimaryFormatMediaChunkIndex = primarySampleIndexToMediaChunkIndex(this.primarySampleQueue.getReadIndex(), 0);
            androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            int length = sampleQueueArr.length;
            while (i3 < length) {
                sampleQueueArr[i3].seekTo(j, true);
                i3++;
            }
            return;
        }
        this.pendingResetPositionUs = j;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        this.nextNotifyPrimaryFormatMediaChunkIndex = 0;
        if (!this.loader.isLoading()) {
            this.loader.clearFatalError();
            resetSampleQueues();
            return;
        }
        this.primarySampleQueue.discardToEnd();
        androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr2 = this.embeddedSampleQueues;
        int length2 = sampleQueueArr2.length;
        while (i3 < length2) {
            sampleQueueArr2[i3].discardToEnd();
            i3++;
        }
        this.loader.cancelLoading();
    }

    public androidx.media3.exoplayer.source.chunk.ChunkSampleStream<T>.EmbeddedSampleStream selectEmbeddedTrack(long j, int i3) {
        for (int i9 = 0; i9 < this.embeddedSampleQueues.length; i9++) {
            if (this.embeddedTrackTypes[i9] == i3) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.embeddedTracksSelected[i9]);
                this.embeddedTracksSelected[i9] = true;
                this.embeddedSampleQueues[i9].seekTo(j, true);
                return new androidx.media3.exoplayer.source.chunk.ChunkSampleStream.EmbeddedSampleStream(this, this.embeddedSampleQueues[i9], i9);
            }
        }
        throw new java.lang.IllegalStateException();
    }

    public void setEndPositionUs(long j) {
        this.primarySampleQueue.setReadEndTimeUs(j);
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.setReadEndTimeUs(j);
        }
    }

    public void setSuppressRead(boolean z6) {
        this.suppressRead = z6;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j) {
        if (isPendingReset() || mayHaveInitialDiscontinuity() || this.suppressRead) {
            return 0;
        }
        int skipCount = this.primarySampleQueue.getSkipCount(j, this.loadingFinished);
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk = this.canceledMediaChunk;
        if (baseMediaChunk != null) {
            skipCount = java.lang.Math.min(skipCount, baseMediaChunk.getFirstSampleIndex(0) - this.primarySampleQueue.getReadIndex());
        }
        this.primarySampleQueue.skip(skipCount);
        maybeNotifyPrimaryTrackFormatChanged();
        return skipCount;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j, long j9, boolean z6) {
        this.loadingChunk = null;
        this.canceledMediaChunk = null;
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j9, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (z6) {
            return;
        }
        if (isPendingReset()) {
            resetSampleQueues();
        } else if (isMediaChunk(chunk)) {
            discardUpstreamMediaChunksFromIndex(this.mediaChunks.size() - 1);
            if (this.mediaChunks.isEmpty()) {
                this.pendingResetPositionUs = this.lastSeekPositionUs;
            }
        }
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j, long j9) {
        this.loadingChunk = null;
        this.chunkSource.onChunkLoadCompleted(chunk);
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j9, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j, long j9, java.io.IOException iOException, int i3) {
        androidx.media3.exoplayer.upstream.Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        long jBytesLoaded = chunk.bytesLoaded();
        boolean zIsMediaChunk = isMediaChunk(chunk);
        int size = this.mediaChunks.size() - 1;
        boolean z6 = (jBytesLoaded != 0 && zIsMediaChunk && haveReadFromMediaChunk(size)) ? false : true;
        androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j9, jBytesLoaded);
        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, androidx.media3.common.util.Util.usToMs(chunk.startTimeUs), androidx.media3.common.util.Util.usToMs(chunk.endTimeUs)), iOException, i3);
        if (!this.chunkSource.onChunkLoadError(chunk, z6, loadErrorInfo, this.loadErrorHandlingPolicy)) {
            loadErrorActionCreateRetryAction = null;
        } else if (z6) {
            loadErrorActionCreateRetryAction = androidx.media3.exoplayer.upstream.Loader.DONT_RETRY;
            if (zIsMediaChunk) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(discardUpstreamMediaChunksFromIndex(size) == chunk);
                if (this.mediaChunks.isEmpty()) {
                    this.pendingResetPositionUs = this.lastSeekPositionUs;
                }
            }
        } else {
            androidx.media3.common.util.Log.w(TAG, "Ignoring attempt to cancel non-cancelable load.");
            loadErrorActionCreateRetryAction = null;
        }
        if (loadErrorActionCreateRetryAction == null) {
            long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo);
            loadErrorActionCreateRetryAction = retryDelayMsFor != androidx.media3.common.C.TIME_UNSET ? androidx.media3.exoplayer.upstream.Loader.createRetryAction(false, retryDelayMsFor) : androidx.media3.exoplayer.upstream.Loader.DONT_RETRY_FATAL;
        }
        boolean zIsRetry = loadErrorActionCreateRetryAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.loadingChunk = null;
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
            this.callback.onContinueLoadingRequested(this);
        }
        return loadErrorActionCreateRetryAction;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadStarted(androidx.media3.exoplayer.source.chunk.Chunk chunk, long j, long j9, int i3) {
        this.mediaSourceEventDispatcher.loadStarted(i3 == 0 ? new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, j) : new androidx.media3.exoplayer.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j9, chunk.bytesLoaded()), chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, i3);
    }

    public void release(androidx.media3.exoplayer.source.chunk.ChunkSampleStream.ReleaseCallback<T> releaseCallback) {
        this.releaseCallback = releaseCallback;
        this.primarySampleQueue.preRelease();
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.preRelease();
        }
        this.loader.release(this);
    }

    private void maybeNotifyPrimaryTrackFormatChanged(int i3) {
        androidx.media3.exoplayer.source.chunk.BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i3);
        androidx.media3.common.Format format = baseMediaChunk.trackFormat;
        if (!format.equals(this.primaryDownstreamTrackFormat)) {
            this.mediaSourceEventDispatcher.downstreamFormatChanged(this.primaryTrackType, format, baseMediaChunk.trackSelectionReason, baseMediaChunk.trackSelectionData, baseMediaChunk.startTimeUs);
        }
        this.primaryDownstreamTrackFormat = format;
    }
}
