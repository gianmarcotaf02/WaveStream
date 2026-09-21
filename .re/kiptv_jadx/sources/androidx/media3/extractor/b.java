package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p068h4.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16851h;

    public /* synthetic */ b(int i3) {
        this.f16851h = i3;
    }

    @Override // p068h4.l
    public final boolean apply(java.lang.Object obj) {
        switch (this.f16851h) {
            case 0:
                return androidx.media3.extractor.GaplessInfoHolder.lambda$setFromMetadata$0((androidx.media3.extractor.metadata.id3.CommentFrame) obj);
            case 1:
                return androidx.media3.extractor.GaplessInfoHolder.lambda$setFromMetadata$1((androidx.media3.extractor.metadata.id3.InternalFrame) obj);
            case 2:
                return androidx.media3.extractor.mp3.Mp3Extractor.lambda$getId3TlenUs$2((androidx.media3.extractor.metadata.id3.TextInformationFrame) obj);
            case 3:
                return androidx.media3.extractor.mp4.Mp4Extractor.lambda$maybeSetDefaultSampleOffsetForAuxiliaryTracks$4((androidx.media3.container.MdtaMetadataEntry) obj);
            case 4:
                return androidx.media3.extractor.mp4.Mp4Extractor.lambda$shouldSeekToAxteAtom$3((androidx.media3.container.MdtaMetadataEntry) obj);
            default:
                return androidx.media3.extractor.mp4.Mp4Extractor.lambda$getAuxiliaryTrackTypesForAuxiliaryTracks$5((androidx.media3.container.MdtaMetadataEntry) obj);
        }
    }
}
