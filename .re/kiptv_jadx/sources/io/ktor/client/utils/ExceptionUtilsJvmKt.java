package io.ktor.client.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "unwrapCancellationException", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ExceptionUtilsJvmKt {
    public static final java.lang.Throwable unwrapCancellationException(java.lang.Throwable th) {
        kotlin.jvm.internal.m.e(th, "<this>");
        java.lang.Throwable cause = th;
        while (cause instanceof java.util.concurrent.CancellationException) {
            java.util.concurrent.CancellationException cancellationException = (java.util.concurrent.CancellationException) cause;
            if (!kotlin.jvm.internal.m.a(cause, cancellationException.getCause())) {
                cause = cancellationException.getCause();
            }
        }
        return cause == null ? th : cause;
    }
}
