package io.ktor.util.logging;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"LP8/b;", "Lio/ktor/util/logging/Logger;", "", io.sentry.SentryEvent.JsonKeys.EXCEPTION, "Lh6/A;", "error", "(LP8/b;Ljava/lang/Throwable;)V", "Lkotlin/Function0;", "", "message", "trace", "(LP8/b;Lkotlin/jvm/functions/Function0;)V", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LoggerKt {
    public static final void error(P8.b bVar, java.lang.Throwable exception) {
        kotlin.jvm.internal.m.e(bVar, "<this>");
        kotlin.jvm.internal.m.e(exception, "exception");
        java.lang.String message = exception.getMessage();
        if (message == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception of type ");
            message = com.google.android.gms.internal.play_billing.M0.p(kotlin.jvm.internal.B.f24540a, exception.getClass(), sb);
        }
        bVar.c(message, exception);
    }

    public static final void trace(P8.b bVar, kotlin.jvm.functions.Function0 message) {
        kotlin.jvm.internal.m.e(bVar, "<this>");
        kotlin.jvm.internal.m.e(message, "message");
        if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(bVar)) {
            bVar.i((java.lang.String) message.invoke());
        }
    }
}
