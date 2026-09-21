package io.ktor.client.call;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "contentLength", "bodySize", "Lio/ktor/http/HttpMethod;", io.sentry.protocol.Request.JsonKeys.METHOD, "Lh6/A;", "checkContentLength", "(Ljava/lang/Long;JLio/ktor/http/HttpMethod;)V", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UtilsKt {
    public static final void checkContentLength(java.lang.Long l2, long j, io.ktor.http.HttpMethod method) {
        kotlin.jvm.internal.m.e(method, "method");
        if (l2 == null || l2.longValue() < 0 || method.equals(io.ktor.http.HttpMethod.INSTANCE.getHead()) || l2.longValue() == j) {
            return;
        }
        throw new java.lang.IllegalStateException("Content-Length mismatch: expected " + l2 + " bytes, but received " + j + " bytes");
    }
}
