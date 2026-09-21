package io.ktor.client.plugins.sse;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/client/plugins/sse/SSEClientException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lio/ktor/client/statement/HttpResponse;", io.sentry.protocol.Response.TYPE, "", "cause", "", "message", "<init>", "(Lio/ktor/client/statement/HttpResponse;Ljava/lang/Throwable;Ljava/lang/String;)V", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SSEClientException extends java.lang.IllegalStateException {
    private final java.lang.Throwable cause;
    private final java.lang.String message;
    private final io.ktor.client.statement.HttpResponse response;

    public SSEClientException() {
        this(null, null, null, 7, null);
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.message;
    }

    public final io.ktor.client.statement.HttpResponse getResponse() {
        return this.response;
    }

    public /* synthetic */ SSEClientException(io.ktor.client.statement.HttpResponse httpResponse, java.lang.Throwable th, java.lang.String str, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : httpResponse, (i3 & 2) != 0 ? null : th, (i3 & 4) != 0 ? null : str);
    }

    public SSEClientException(io.ktor.client.statement.HttpResponse httpResponse, java.lang.Throwable th, java.lang.String str) {
        this.response = httpResponse;
        this.cause = th;
        this.message = str;
    }
}
