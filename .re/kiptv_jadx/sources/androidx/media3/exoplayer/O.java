package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O implements androidx.media3.exoplayer.MetadataRetrieverInternal.RetrievalTask.OnPreparedListener, androidx.media3.exoplayer.MetadataRetrieverInternal.RetrievalTask.OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.MetadataRetrieverInternal f16509a;

    public /* synthetic */ O(androidx.media3.exoplayer.MetadataRetrieverInternal metadataRetrieverInternal) {
        this.f16509a = metadataRetrieverInternal;
    }

    @Override // androidx.media3.exoplayer.MetadataRetrieverInternal.RetrievalTask.OnFailureListener
    public void onFailure(java.lang.Exception exc) {
        this.f16509a.lambda$startPreparation$2(exc);
    }

    @Override // androidx.media3.exoplayer.MetadataRetrieverInternal.RetrievalTask.OnPreparedListener
    public void onPrepared(androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.common.Timeline timeline) {
        this.f16509a.lambda$startPreparation$1(trackGroupArray, timeline);
    }
}
