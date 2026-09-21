package androidx.media3.exoplayer.source;

import androidx.media3.common.C;
import androidx.media3.exoplayer.LoadingInfo;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Collections;
import java.util.List;
import p076i4.AbstractC2186b0;
import p076i4.Y;

public final class CompositeSequenceableLoader implements SequenceableLoader {
    private long lastAudioVideoBufferedPositionUs;
    private final AbstractC2186b0 loadersWithTrackTypes;

    public static final class SequenceableLoaderWithTrackTypes implements SequenceableLoader {
        private final SequenceableLoader loader;
        private final AbstractC2186b0 trackTypes;

        public SequenceableLoaderWithTrackTypes(SequenceableLoader sequenceableLoader, List<Integer> list) {
            this.loader = sequenceableLoader;
            this.trackTypes = AbstractC2186b0.u(list);
        }

        @Override
        public boolean continueLoading(LoadingInfo loadingInfo) {
            return this.loader.continueLoading(loadingInfo);
        }

        @Override
        public long getBufferedPositionUs() {
            return this.loader.getBufferedPositionUs();
        }

        @Override
        public long getNextLoadPositionUs() {
            return this.loader.getNextLoadPositionUs();
        }

        public AbstractC2186b0 getTrackTypes() {
            return this.trackTypes;
        }

        @Override
        public boolean isLoading() {
            return this.loader.isLoading();
        }

        @Override
        public void reevaluateBuffer(long j) {
            this.loader.reevaluateBuffer(j);
        }
    }

    @Deprecated
    public CompositeSequenceableLoader(SequenceableLoader[] sequenceableLoaderArr) {
        this(AbstractC2186b0.v(sequenceableLoaderArr), Collections.nCopies(sequenceableLoaderArr.length, AbstractC2186b0.y(-1)));
    }

    @Override
    public boolean continueLoading(LoadingInfo loadingInfo) {
        boolean zContinueLoading;
        boolean z6 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z6;
            }
            zContinueLoading = false;
            for (int i3 = 0; i3 < this.loadersWithTrackTypes.size(); i3++) {
                long nextLoadPositionUs2 = ((SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i3)).getNextLoadPositionUs();
                boolean z9 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= loadingInfo.playbackPositionUs;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z9) {
                    zContinueLoading |= ((SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i3)).continueLoading(loadingInfo);
                }
            }
            z6 |= zContinueLoading;
        } while (zContinueLoading);
        return z6;
    }

    @Override
    public long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < this.loadersWithTrackTypes.size(); i3++) {
            SequenceableLoaderWithTrackTypes sequenceableLoaderWithTrackTypes = (SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i3);
            long bufferedPositionUs = sequenceableLoaderWithTrackTypes.getBufferedPositionUs();
            if ((sequenceableLoaderWithTrackTypes.getTrackTypes().contains(1) || sequenceableLoaderWithTrackTypes.getTrackTypes().contains(2) || sequenceableLoaderWithTrackTypes.getTrackTypes().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.lastAudioVideoBufferedPositionUs = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.lastAudioVideoBufferedPositionUs;
        return j != C.TIME_UNSET ? j : jMin2;
    }

    @Override
    public long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < this.loadersWithTrackTypes.size(); i3++) {
            long nextLoadPositionUs = ((SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i3)).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override
    public boolean isLoading() {
        for (int i3 = 0; i3 < this.loadersWithTrackTypes.size(); i3++) {
            if (((SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i3)).isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void reevaluateBuffer(long j) {
        for (int i3 = 0; i3 < this.loadersWithTrackTypes.size(); i3++) {
            ((SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i3)).reevaluateBuffer(j);
        }
    }

    public CompositeSequenceableLoader(List<? extends SequenceableLoader> list, List<List<Integer>> list2) {
        Y yS = AbstractC2186b0.s();
        AbstractC1864o0.L(list.size() == list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            yS.c(new SequenceableLoaderWithTrackTypes(list.get(i3), list2.get(i3)));
        }
        this.loadersWithTrackTypes = yS.f();
        this.lastAudioVideoBufferedPositionUs = C.TIME_UNSET;
    }
}
