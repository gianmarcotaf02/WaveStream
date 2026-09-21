package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class CompositeSequenceableLoader implements androidx.media3.exoplayer.source.SequenceableLoader {
    private long lastAudioVideoBufferedPositionUs;
    private final p076i4.AbstractC2186b0 loadersWithTrackTypes;

    public static final class SequenceableLoaderWithTrackTypes implements androidx.media3.exoplayer.source.SequenceableLoader {
        private final androidx.media3.exoplayer.source.SequenceableLoader loader;
        private final p076i4.AbstractC2186b0 trackTypes;

        public SequenceableLoaderWithTrackTypes(androidx.media3.exoplayer.source.SequenceableLoader sequenceableLoader, java.util.List<java.lang.Integer> list) {
            this.loader = sequenceableLoader;
            this.trackTypes = p076i4.AbstractC2186b0.u(list);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
            return this.loader.continueLoading(loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.loader.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.loader.getNextLoadPositionUs();
        }

        public p076i4.AbstractC2186b0 getTrackTypes() {
            return this.trackTypes;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return this.loader.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j) {
            this.loader.reevaluateBuffer(j);
        }
    }

    @java.lang.Deprecated
    public CompositeSequenceableLoader(androidx.media3.exoplayer.source.SequenceableLoader[] sequenceableLoaderArr) {
        this(p076i4.AbstractC2186b0.v(sequenceableLoaderArr), java.util.Collections.nCopies(sequenceableLoaderArr.length, p076i4.AbstractC2186b0.y(-1)));
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        boolean zContinueLoading;
        boolean z6 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z6;
            }
            zContinueLoading = false;
            for (int i3 = 0; i3 < this.loadersWithTrackTypes.size(); i3++) {
                long nextLoadPositionUs2 = ((androidx.media3.exoplayer.source.CompositeSequenceableLoader.SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i3)).getNextLoadPositionUs();
                boolean z9 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= loadingInfo.playbackPositionUs;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z9) {
                    zContinueLoading |= ((androidx.media3.exoplayer.source.CompositeSequenceableLoader.SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i3)).continueLoading(loadingInfo);
                }
            }
            z6 |= zContinueLoading;
        } while (zContinueLoading);
        return z6;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < this.loadersWithTrackTypes.size(); i3++) {
            androidx.media3.exoplayer.source.CompositeSequenceableLoader.SequenceableLoaderWithTrackTypes sequenceableLoaderWithTrackTypes = (androidx.media3.exoplayer.source.CompositeSequenceableLoader.SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i3);
            long bufferedPositionUs = sequenceableLoaderWithTrackTypes.getBufferedPositionUs();
            if ((sequenceableLoaderWithTrackTypes.getTrackTypes().contains(1) || sequenceableLoaderWithTrackTypes.getTrackTypes().contains(2) || sequenceableLoaderWithTrackTypes.getTrackTypes().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = java.lang.Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = java.lang.Math.min(jMin2, bufferedPositionUs);
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
        return j != androidx.media3.common.C.TIME_UNSET ? j : jMin2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < this.loadersWithTrackTypes.size(); i3++) {
            long nextLoadPositionUs = ((androidx.media3.exoplayer.source.CompositeSequenceableLoader.SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i3)).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = java.lang.Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        for (int i3 = 0; i3 < this.loadersWithTrackTypes.size(); i3++) {
            if (((androidx.media3.exoplayer.source.CompositeSequenceableLoader.SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i3)).isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        for (int i3 = 0; i3 < this.loadersWithTrackTypes.size(); i3++) {
            ((androidx.media3.exoplayer.source.CompositeSequenceableLoader.SequenceableLoaderWithTrackTypes) this.loadersWithTrackTypes.get(i3)).reevaluateBuffer(j);
        }
    }

    public CompositeSequenceableLoader(java.util.List<? extends androidx.media3.exoplayer.source.SequenceableLoader> list, java.util.List<java.util.List<java.lang.Integer>> list2) {
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(list.size() == list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            yS.c(new androidx.media3.exoplayer.source.CompositeSequenceableLoader.SequenceableLoaderWithTrackTypes(list.get(i3), list2.get(i3)));
        }
        this.loadersWithTrackTypes = yS.f();
        this.lastAudioVideoBufferedPositionUs = androidx.media3.common.C.TIME_UNSET;
    }
}
