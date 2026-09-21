package io.ktor.client.plugins.logging;

import O7.q;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/client/plugins/logging/MessageLengthLimitingLogger;", "Lio/ktor/client/plugins/logging/Logger;", "", "maxLength", "minLength", "delegate", "<init>", "(IILio/ktor/client/plugins/logging/Logger;)V", "", "message", "Lh6/A;", "logLong", "(Ljava/lang/String;)V", "log", "I", "Lio/ktor/client/plugins/logging/Logger;", "ktor-client-logging"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class MessageLengthLimitingLogger implements Logger {
    private final Logger delegate;
    private final int maxLength;
    private final int minLength;

    public MessageLengthLimitingLogger() {
        this(0, 0, null, 7, null);
    }

    private final void logLong(String message) {
        while (true) {
            int length = message.length();
            int i3 = this.maxLength;
            if (length <= i3) {
                this.delegate.log(message);
                return;
            }
            String strSubstring = message.substring(0, i3);
            m.d(strSubstring, "substring(...)");
            int i9 = this.maxLength;
            int iQ0 = q.Q0(strSubstring, 0, 6, '\n');
            if (iQ0 >= this.minLength) {
                strSubstring = strSubstring.substring(0, iQ0);
                m.d(strSubstring, "substring(...)");
                i9 = iQ0 + 1;
            }
            this.delegate.log(strSubstring);
            message = message.substring(i9);
            m.d(message, "substring(...)");
        }
    }

    @Override
    public void log(String message) {
        m.e(message, "message");
        logLong(message);
    }

    public MessageLengthLimitingLogger(int i3, int i9, Logger delegate) {
        m.e(delegate, "delegate");
        this.maxLength = i3;
        this.minLength = i9;
        this.delegate = delegate;
    }

    public MessageLengthLimitingLogger(int i3, int i9, Logger logger, int i10, AbstractC2541f abstractC2541f) {
        this((i10 & 1) != 0 ? 4000 : i3, (i10 & 2) != 0 ? 3000 : i9, (i10 & 4) != 0 ? LoggerJvmKt.getDEFAULT(Logger.INSTANCE) : logger);
    }
}
