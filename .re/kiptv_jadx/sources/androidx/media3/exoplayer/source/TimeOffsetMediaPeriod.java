package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
final class TimeOffsetMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.MediaPeriod.Callback {
    private androidx.media3.exoplayer.source.MediaPeriod.Callback callback;
    private final androidx.media3.exoplayer.source.MediaPeriod mediaPeriod;
    private final long timeOffsetUs;

    public static final class TimeOffsetSampleStream implements androidx.media3.exoplayer.source.SampleStream {
        private final androidx.media3.exoplayer.source.SampleStream sampleStream;
        private final long timeOffsetUs;

        public TimeOffsetSampleStream(androidx.media3.exoplayer.source.SampleStream sampleStream, long j) {
            this.sampleStream = sampleStream;
            this.timeOffsetUs = j;
        }

        public androidx.media3.exoplayer.source.SampleStream getChildStream() {
            return this.sampleStream;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return this.sampleStream.isReady();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
            this.sampleStream.maybeThrowError();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i3) {
            int data = this.sampleStream.readData(formatHolder, decoderInputBuffer, i3);
            if (data == -4) {
                decoderInputBuffer.timeUs += this.timeOffsetUs;
            }
            return data;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            return this.sampleStream.skipData(j - this.timeOffsetUs);
        }
    }

    public TimeOffsetMediaPeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod, long j) {
        this.mediaPeriod = mediaPeriod;
        this.timeOffsetUs = j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        return this.mediaPeriod.continueLoading(loadingInfo.buildUpon().setPlaybackPositionUs(loadingInfo.playbackPositionUs - this.timeOffsetUs).build());
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z6) {
        this.mediaPeriod.discardBuffer(j - this.timeOffsetUs, z6);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        return this.mediaPeriod.getAdjustedSeekPositionUs(j - this.timeOffsetUs, seekParameters) + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public java.util.List<androidx.media3.common.StreamKey> getStreamKeys(java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> list) {
        return this.mediaPeriod.getStreamKeys(list);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    public androidx.media3.exoplayer.source.MediaPeriod getWrappedMediaPeriod() {
        return this.mediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() {
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        androidx.media3.exoplayer.source.MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j - this.timeOffsetUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        long discontinuity = this.mediaPeriod.readDiscontinuity();
        return discontinuity == androidx.media3.common.C.TIME_UNSET ? androidx.media3.common.C.TIME_UNSET : discontinuity + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        this.mediaPeriod.reevaluateBuffer(j - this.timeOffsetUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        return this.mediaPeriod.seekToUs(j - this.timeOffsetUs) + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr2 = new androidx.media3.exoplayer.source.SampleStream[sampleStreamArr.length];
        int i3 = 0;
        while (true) {
            androidx.media3.exoplayer.source.SampleStream childStream = null;
            if (i3 >= sampleStreamArr.length) {
                break;
            }
            androidx.media3.exoplayer.source.TimeOffsetMediaPeriod.TimeOffsetSampleStream timeOffsetSampleStream = (androidx.media3.exoplayer.source.TimeOffsetMediaPeriod.TimeOffsetSampleStream) sampleStreamArr[i3];
            if (timeOffsetSampleStream != null) {
                childStream = timeOffsetSampleStream.getChildStream();
            }
            sampleStreamArr2[i3] = childStream;
            i3++;
        }
        long jSelectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j - this.timeOffsetUs);
        for (int i9 = 0; i9 < sampleStreamArr.length; i9++) {
            androidx.media3.exoplayer.source.SampleStream sampleStream = sampleStreamArr2[i9];
            if (sampleStream == null) {
                sampleStreamArr[i9] = null;
            } else {
                androidx.media3.exoplayer.source.SampleStream sampleStream2 = sampleStreamArr[i9];
                if (sampleStream2 == null || ((androidx.media3.exoplayer.source.TimeOffsetMediaPeriod.TimeOffsetSampleStream) sampleStream2).getChildStream() != sampleStream) {
                    sampleStreamArr[i9] = new androidx.media3.exoplayer.source.TimeOffsetMediaPeriod.TimeOffsetSampleStream(sampleStream, this.timeOffsetUs);
                }
            }
        }
        return jSelectTracks + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long setEndPositionUs(long j) {
        long endPositionUs = this.mediaPeriod.setEndPositionUs(j == Long.MIN_VALUE ? Long.MIN_VALUE : j - this.timeOffsetUs);
        if (endPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return endPositionUs + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        androidx.media3.exoplayer.source.MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onContinueLoadingRequested(this);
    }
}
