package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.util.List;
import java.util.Random;

public final class RandomTrackSelection extends BaseTrackSelection {
    private final Random random;
    private int selectedIndex;

    public RandomTrackSelection(TrackGroup trackGroup, int[] iArr, int i3, Random random) {
        super(trackGroup, iArr, i3);
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }

    @Override
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override
    public Object getSelectionData() {
        return null;
    }

    @Override
    public int getSelectionReason() {
        return 3;
    }

    @Override
    public void updateSelectedTrack(long j, long j9, long j10, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = 0;
        for (int i9 = 0; i9 < this.length; i9++) {
            if (!isTrackExcluded(i9, jElapsedRealtime)) {
                i3++;
            }
        }
        this.selectedIndex = this.random.nextInt(i3);
        if (i3 != this.length) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.length; i11++) {
                if (!isTrackExcluded(i11, jElapsedRealtime)) {
                    int i12 = i10 + 1;
                    if (this.selectedIndex == i10) {
                        this.selectedIndex = i11;
                        return;
                    }
                    i10 = i12;
                }
            }
        }
    }

    public static final class Factory implements ExoTrackSelection.Factory {
        private final Random random;

        public Factory() {
            this.random = new Random();
        }

        public ExoTrackSelection lambda$createTrackSelections$0(ExoTrackSelection.Definition definition) {
            return new RandomTrackSelection(definition.group, definition.tracks, definition.type, this.random);
        }

        @Override
        public ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            return TrackSelectionUtil.createTrackSelectionsForDefinitions(definitionArr, new F1.e(9, this));
        }

        public Factory(int i3) {
            this.random = new Random(i3);
        }
    }
}
