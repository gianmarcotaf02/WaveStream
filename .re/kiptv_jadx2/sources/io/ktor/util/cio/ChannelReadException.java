package io.ktor.util.cio;

import androidx.media3.container.NalUnitUtil;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/util/cio/ChannelReadException;", "Lio/ktor/util/cio/ChannelIOException;", "", "message", "", SentryEvent.JsonKeys.EXCEPTION, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ChannelReadException extends ChannelIOException {
    public ChannelReadException(String str, Throwable th, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? "Cannot read from a channel" : str, th);
    }

    public ChannelReadException(String message, Throwable exception) {
        super(message, exception);
        m.e(message, "message");
        m.e(exception, "exception");
    }
}
