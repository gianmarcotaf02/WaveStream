package androidx.media3.exoplayer.source;

import android.os.Bundle;
import androidx.media3.common.TrackGroup;
import androidx.media3.extractor.Extractor;

public final class i implements p068h4.j {

    public final int f16742a;

    public i(int i3) {
        this.f16742a = i3;
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f16742a) {
            case 0:
                return MergingMediaPeriod.lambda$selectTracks$0((MediaPeriod) obj);
            case 1:
                return BundledExtractorsAdapter.lambda$init$0((Extractor) obj);
            case 2:
                return TrackGroupArray.lambda$getTrackTypes$0((TrackGroup) obj);
            case 3:
                return ((TrackGroup) obj).toBundle();
            default:
                return TrackGroup.fromBundle((Bundle) obj);
        }
    }
}
