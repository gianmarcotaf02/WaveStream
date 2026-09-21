package androidx.media3.exoplayer.hls;

import java.io.IOException;

public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(String str) {
        super(Y6.f.h("Unable to bind a sample queue to TrackGroup with MIME type ", str, "."));
    }
}
