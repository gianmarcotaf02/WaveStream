package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.analytics.PlayerId;

public final class n implements Consumer, ProgressiveMediaExtractor.Factory {

    public final int f16750h;

    public n(int i3) {
        this.f16750h = i3;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f16750h) {
            case 0:
                SampleQueue.lambda$new$0((SampleQueue.SharedSampleMetadata) obj);
                break;
            default:
                SpannedData.lambda$new$0(obj);
                break;
        }
    }

    @Override
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        return MediaParserExtractorAdapter.lambda$static$0(playerId);
    }
}
