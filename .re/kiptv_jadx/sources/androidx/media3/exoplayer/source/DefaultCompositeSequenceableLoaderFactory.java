package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultCompositeSequenceableLoaderFactory implements androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory {
    @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    public androidx.media3.exoplayer.source.SequenceableLoader create(java.util.List<? extends androidx.media3.exoplayer.source.SequenceableLoader> list, java.util.List<java.util.List<java.lang.Integer>> list2) {
        return new androidx.media3.exoplayer.source.CompositeSequenceableLoader(list, list2);
    }

    @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    @java.lang.Deprecated
    public androidx.media3.exoplayer.source.SequenceableLoader createCompositeSequenceableLoader(androidx.media3.exoplayer.source.SequenceableLoader... sequenceableLoaderArr) {
        return new androidx.media3.exoplayer.source.CompositeSequenceableLoader(sequenceableLoaderArr);
    }

    @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    public androidx.media3.exoplayer.source.SequenceableLoader empty() {
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        p076i4.S0 s9 = p076i4.S0.f22832l;
        return new androidx.media3.exoplayer.source.CompositeSequenceableLoader(s9, s9);
    }
}
