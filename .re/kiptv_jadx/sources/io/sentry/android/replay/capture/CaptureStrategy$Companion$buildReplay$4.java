package io.sentry.android.replay.capture;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/rrweb/RRWebEvent;", "event", "Lh6/A;", "invoke", "(Lio/sentry/rrweb/RRWebEvent;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class CaptureStrategy$Companion$buildReplay$4 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ java.util.List<io.sentry.rrweb.RRWebEvent> $recordingPayload;
    final /* synthetic */ java.util.Date $segmentTimestamp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureStrategy$Companion$buildReplay$4(java.util.Date date, java.util.List<io.sentry.rrweb.RRWebEvent> list) {
        super(1);
        this.$segmentTimestamp = date;
        this.$recordingPayload = list;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((io.sentry.rrweb.RRWebEvent) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(io.sentry.rrweb.RRWebEvent event) {
        kotlin.jvm.internal.m.e(event, "event");
        if (event.getTimestamp() >= this.$segmentTimestamp.getTime()) {
            this.$recordingPayload.add(event);
        }
    }
}
