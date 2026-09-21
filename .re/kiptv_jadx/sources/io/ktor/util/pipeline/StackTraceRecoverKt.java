package io.ktor.util.pipeline;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", io.sentry.SentryEvent.JsonKeys.EXCEPTION, "Ll6/c;", "continuation", "recoverStackTraceBridge", "(Ljava/lang/Throwable;Ll6/c;)Ljava/lang/Throwable;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class StackTraceRecoverKt {
    public static final java.lang.Throwable recoverStackTraceBridge(java.lang.Throwable exception, p100l6.c continuation) {
        kotlin.jvm.internal.m.e(exception, "exception");
        kotlin.jvm.internal.m.e(continuation, "continuation");
        try {
            return io.ktor.util.pipeline.StackTraceRecoverJvmKt.withCause(exception, exception.getCause());
        } catch (java.lang.Throwable unused) {
            return exception;
        }
    }
}
