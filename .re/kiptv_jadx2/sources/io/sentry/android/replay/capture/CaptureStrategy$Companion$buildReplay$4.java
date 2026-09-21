package io.sentry.android.replay.capture;

import io.sentry.rrweb.RRWebEvent;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/rrweb/RRWebEvent;", "event", "Lh6/A;", "invoke", "(Lio/sentry/rrweb/RRWebEvent;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class CaptureStrategy$Companion$buildReplay$4 extends o implements j {
    final List<RRWebEvent> $recordingPayload;
    final Date $segmentTimestamp;

    public CaptureStrategy$Companion$buildReplay$4(Date date, List<RRWebEvent> list) {
        super(1);
        this.$segmentTimestamp = date;
        this.$recordingPayload = list;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((RRWebEvent) obj);
        return A.f22523a;
    }

    public final void invoke(RRWebEvent event) {
        m.e(event, "event");
        if (event.getTimestamp() >= this.$segmentTimestamp.getTime()) {
            this.$recordingPayload.add(event);
        }
    }
}
