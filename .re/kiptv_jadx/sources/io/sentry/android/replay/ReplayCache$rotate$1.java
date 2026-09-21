package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/sentry/android/replay/ReplayFrame;", "invoke", "(Lio/sentry/android/replay/ReplayFrame;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReplayCache$rotate$1 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ kotlin.jvm.internal.A $screen;
    final /* synthetic */ long $until;
    final /* synthetic */ io.sentry.android.replay.ReplayCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayCache$rotate$1(long j, io.sentry.android.replay.ReplayCache replayCache, kotlin.jvm.internal.A a2) {
        super(1);
        this.$until = j;
        this.this$0 = replayCache;
        this.$screen = a2;
    }

    @Override // p194x6.j
    public final java.lang.Boolean invoke(io.sentry.android.replay.ReplayFrame it) {
        kotlin.jvm.internal.m.e(it, "it");
        if (it.getTimestamp() < this.$until) {
            this.this$0.deleteFile(it.getScreenshot());
            return java.lang.Boolean.TRUE;
        }
        kotlin.jvm.internal.A a2 = this.$screen;
        if (a2.f24539h == null) {
            a2.f24539h = it.getScreen();
        }
        return java.lang.Boolean.FALSE;
    }
}
