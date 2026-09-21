package androidx.media3.exoplayer.source;

import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import java.util.Collections;
import java.util.List;

public interface MediaPeriod extends SequenceableLoader {

    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        void onPrepared(MediaPeriod mediaPeriod);
    }

    @Override
    boolean continueLoading(LoadingInfo loadingInfo);

    void discardBuffer(long j, boolean z6);

    long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters);

    @Override
    long getBufferedPositionUs();

    @Override
    long getNextLoadPositionUs();

    default List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return Collections.EMPTY_LIST;
    }

    TrackGroupArray getTrackGroups();

    @Override
    boolean isLoading();

    void maybeThrowPrepareError();

    void prepare(Callback callback, long j);

    long readDiscontinuity();

    @Override
    void reevaluateBuffer(long j);

    long seekToUs(long j);

    long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j);

    default long setEndPositionUs(long j) {
        return Long.MIN_VALUE;
    }
}
