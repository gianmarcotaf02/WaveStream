package io.ktor.client.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/client/utils/HttpResponseReceiveFail;", "", "Lio/ktor/client/statement/HttpResponse;", io.sentry.protocol.Response.TYPE, "", "cause", "<init>", "(Lio/ktor/client/statement/HttpResponse;Ljava/lang/Throwable;)V", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpResponseReceiveFail {
    private final java.lang.Throwable cause;
    private final io.ktor.client.statement.HttpResponse response;

    public HttpResponseReceiveFail(io.ktor.client.statement.HttpResponse response, java.lang.Throwable cause) {
        kotlin.jvm.internal.m.e(response, "response");
        kotlin.jvm.internal.m.e(cause, "cause");
        this.response = response;
        this.cause = cause;
    }

    public final java.lang.Throwable getCause() {
        return this.cause;
    }

    public final io.ktor.client.statement.HttpResponse getResponse() {
        return this.response;
    }
}
