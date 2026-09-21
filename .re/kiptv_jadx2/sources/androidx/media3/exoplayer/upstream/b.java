package androidx.media3.exoplayer.upstream;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Consumer;
import java.util.concurrent.ExecutorService;

public final class b implements CmcdConfiguration.Factory, Consumer {
    @Override
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override
    public CmcdConfiguration createCmcdConfiguration(MediaItem mediaItem) {
        return CmcdConfiguration.Factory.lambda$static$0(mediaItem);
    }
}
