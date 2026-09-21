package io.ktor.util.logging;

import P8.b;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"LP8/b;", "Lio/ktor/util/logging/Logger;", "", SentryEvent.JsonKeys.EXCEPTION, "Lh6/A;", "error", "(LP8/b;Ljava/lang/Throwable;)V", "Lkotlin/Function0;", "", "message", "trace", "(LP8/b;Lkotlin/jvm/functions/Function0;)V", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LoggerKt {
    public static final void error(b bVar, Throwable exception) {
        m.e(bVar, "<this>");
        m.e(exception, "exception");
        String message = exception.getMessage();
        if (message == null) {
            StringBuilder sb = new StringBuilder("Exception of type ");
            message = M0.p(B.f24540a, exception.getClass(), sb);
        }
        bVar.c(message, exception);
    }

    public static final void trace(b bVar, Function0 message) {
        m.e(bVar, "<this>");
        m.e(message, "message");
        if (LoggerJvmKt.isTraceEnabled(bVar)) {
            bVar.i((String) message.invoke());
        }
    }
}
