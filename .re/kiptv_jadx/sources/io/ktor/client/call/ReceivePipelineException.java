package io.ktor.client.call;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/client/call/ReceivePipelineException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lio/ktor/client/call/HttpClientCall;", io.sentry.SentryBaseEvent.JsonKeys.REQUEST, "Lio/ktor/util/reflect/TypeInfo;", "info", "", "cause", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Throwable;)V", "Lio/ktor/client/call/HttpClientCall;", "getRequest", "()Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/util/reflect/TypeInfo;", "getInfo", "()Lio/ktor/util/reflect/TypeInfo;", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReceivePipelineException extends java.lang.IllegalStateException {
    private final java.lang.Throwable cause;
    private final io.ktor.util.reflect.TypeInfo info;
    private final io.ktor.client.call.HttpClientCall request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceivePipelineException(io.ktor.client.call.HttpClientCall request, io.ktor.util.reflect.TypeInfo info, java.lang.Throwable cause) {
        super("Fail to run receive pipeline: " + cause);
        kotlin.jvm.internal.m.e(request, "request");
        kotlin.jvm.internal.m.e(info, "info");
        kotlin.jvm.internal.m.e(cause, "cause");
        this.request = request;
        this.info = info;
        this.cause = cause;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.cause;
    }

    public final io.ktor.util.reflect.TypeInfo getInfo() {
        return this.info;
    }

    public final io.ktor.client.call.HttpClientCall getRequest() {
        return this.request;
    }
}
