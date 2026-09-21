package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReplayCache$ongoingSegmentFile$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ io.sentry.android.replay.ReplayCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayCache$ongoingSegmentFile$2(io.sentry.android.replay.ReplayCache replayCache) {
        super(0);
        this.this$0 = replayCache;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.io.File invoke() throws java.io.IOException {
        if (this.this$0.getReplayCacheDir$sentry_android_replay_release() == null) {
            return null;
        }
        java.io.File file = new java.io.File(this.this$0.getReplayCacheDir$sentry_android_replay_release(), io.sentry.android.replay.ReplayCache.ONGOING_SEGMENT);
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }
}
