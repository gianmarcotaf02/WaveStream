package io.sentry.android.replay;

import androidx.media3.container.NalUnitUtil;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReplayCache$ongoingSegmentFile$2 extends o implements Function0 {
    final ReplayCache this$0;

    public ReplayCache$ongoingSegmentFile$2(ReplayCache replayCache) {
        super(0);
        this.this$0 = replayCache;
    }

    @Override
    public final File invoke() throws IOException {
        if (this.this$0.getReplayCacheDir$sentry_android_replay_release() == null) {
            return null;
        }
        File file = new File(this.this$0.getReplayCacheDir$sentry_android_replay_release(), ReplayCache.ONGOING_SEGMENT);
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }
}
