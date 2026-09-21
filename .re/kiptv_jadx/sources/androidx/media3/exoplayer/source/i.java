package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16742a;

    public /* synthetic */ i(int i3) {
        this.f16742a = i3;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f16742a) {
            case 0:
                return androidx.media3.exoplayer.source.MergingMediaPeriod.lambda$selectTracks$0((androidx.media3.exoplayer.source.MediaPeriod) obj);
            case 1:
                return androidx.media3.exoplayer.source.BundledExtractorsAdapter.lambda$init$0((androidx.media3.extractor.Extractor) obj);
            case 2:
                return androidx.media3.exoplayer.source.TrackGroupArray.lambda$getTrackTypes$0((androidx.media3.common.TrackGroup) obj);
            case 3:
                return ((androidx.media3.common.TrackGroup) obj).toBundle();
            default:
                return androidx.media3.common.TrackGroup.fromBundle((android.os.Bundle) obj);
        }
    }
}
