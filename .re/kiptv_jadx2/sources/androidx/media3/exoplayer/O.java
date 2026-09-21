package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.source.TrackGroupArray;

public final class O implements MetadataRetrieverInternal.RetrievalTask.OnPreparedListener, MetadataRetrieverInternal.RetrievalTask.OnFailureListener {

    public final MetadataRetrieverInternal f16509a;

    public O(MetadataRetrieverInternal metadataRetrieverInternal) {
        this.f16509a = metadataRetrieverInternal;
    }

    @Override
    public void onFailure(Exception exc) {
        this.f16509a.lambda$startPreparation$2(exc);
    }

    @Override
    public void onPrepared(TrackGroupArray trackGroupArray, Timeline timeline) {
        this.f16509a.lambda$startPreparation$1(trackGroupArray, timeline);
    }
}
