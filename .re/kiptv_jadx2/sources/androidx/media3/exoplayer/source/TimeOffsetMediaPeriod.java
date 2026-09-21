package androidx.media3.exoplayer.source;

import androidx.media3.common.C;
import androidx.media3.common.StreamKey;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import java.util.List;

final class TimeOffsetMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private MediaPeriod.Callback callback;
    private final MediaPeriod mediaPeriod;
    private final long timeOffsetUs;

    public static final class TimeOffsetSampleStream implements SampleStream {
        private final SampleStream sampleStream;
        private final long timeOffsetUs;

        public TimeOffsetSampleStream(SampleStream sampleStream, long j) {
            this.sampleStream = sampleStream;
            this.timeOffsetUs = j;
        }

        public SampleStream getChildStream() {
            return this.sampleStream;
        }

        @Override
        public boolean isReady() {
            return this.sampleStream.isReady();
        }

        @Override
        public void maybeThrowError() {
            this.sampleStream.maybeThrowError();
        }

        @Override
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i3) {
            int data = this.sampleStream.readData(formatHolder, decoderInputBuffer, i3);
            if (data == -4) {
                decoderInputBuffer.timeUs += this.timeOffsetUs;
            }
            return data;
        }

        @Override
        public int skipData(long j) {
            return this.sampleStream.skipData(j - this.timeOffsetUs);
        }
    }

    public TimeOffsetMediaPeriod(MediaPeriod mediaPeriod, long j) {
        this.mediaPeriod = mediaPeriod;
        this.timeOffsetUs = j;
    }

    @Override
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return this.mediaPeriod.continueLoading(loadingInfo.buildUpon().setPlaybackPositionUs(loadingInfo.playbackPositionUs - this.timeOffsetUs).build());
    }

    @Override
    public void discardBuffer(long j, boolean z6) {
        this.mediaPeriod.discardBuffer(j - this.timeOffsetUs, z6);
    }

    @Override
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        return this.mediaPeriod.getAdjustedSeekPositionUs(j - this.timeOffsetUs, seekParameters) + this.timeOffsetUs;
    }

    @Override
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.timeOffsetUs;
    }

    @Override
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.timeOffsetUs;
    }

    @Override
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return this.mediaPeriod.getStreamKeys(list);
    }

    @Override
    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    public MediaPeriod getWrappedMediaPeriod() {
        return this.mediaPeriod;
    }

    @Override
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    @Override
    public void maybeThrowPrepareError() {
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override
    public void onPrepared(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onPrepared(this);
    }

    @Override
    public void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j - this.timeOffsetUs);
    }

    @Override
    public long readDiscontinuity() {
        long discontinuity = this.mediaPeriod.readDiscontinuity();
        return discontinuity == C.TIME_UNSET ? C.TIME_UNSET : discontinuity + this.timeOffsetUs;
    }

    @Override
    public void reevaluateBuffer(long j) {
        this.mediaPeriod.reevaluateBuffer(j - this.timeOffsetUs);
    }

    @Override
    public long seekToUs(long j) {
        return this.mediaPeriod.seekToUs(j - this.timeOffsetUs) + this.timeOffsetUs;
    }

    @Override
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i3 = 0;
        while (true) {
            SampleStream childStream = null;
            if (i3 >= sampleStreamArr.length) {
                break;
            }
            TimeOffsetSampleStream timeOffsetSampleStream = (TimeOffsetSampleStream) sampleStreamArr[i3];
            if (timeOffsetSampleStream != null) {
                childStream = timeOffsetSampleStream.getChildStream();
            }
            sampleStreamArr2[i3] = childStream;
            i3++;
        }
        long jSelectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j - this.timeOffsetUs);
        for (int i9 = 0; i9 < sampleStreamArr.length; i9++) {
            SampleStream sampleStream = sampleStreamArr2[i9];
            if (sampleStream == null) {
                sampleStreamArr[i9] = null;
            } else {
                SampleStream sampleStream2 = sampleStreamArr[i9];
                if (sampleStream2 == null || ((TimeOffsetSampleStream) sampleStream2).getChildStream() != sampleStream) {
                    sampleStreamArr[i9] = new TimeOffsetSampleStream(sampleStream, this.timeOffsetUs);
                }
            }
        }
        return jSelectTracks + this.timeOffsetUs;
    }

    @Override
    public long setEndPositionUs(long j) {
        long endPositionUs = this.mediaPeriod.setEndPositionUs(j == Long.MIN_VALUE ? Long.MIN_VALUE : j - this.timeOffsetUs);
        if (endPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return endPositionUs + this.timeOffsetUs;
    }

    @Override
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onContinueLoadingRequested(this);
    }
}
