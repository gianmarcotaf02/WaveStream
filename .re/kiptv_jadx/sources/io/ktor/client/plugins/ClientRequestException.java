package io.ktor.client.plugins;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/client/plugins/ClientRequestException;", "Lio/ktor/client/plugins/ResponseException;", "Lio/ktor/client/statement/HttpResponse;", io.sentry.protocol.Response.TYPE, "", "cachedResponseText", "<init>", "(Lio/ktor/client/statement/HttpResponse;Ljava/lang/String;)V", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ClientRequestException extends io.ktor.client.plugins.ResponseException {
    private final java.lang.String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientRequestException(io.ktor.client.statement.HttpResponse response, java.lang.String cachedResponseText) {
        super(response, cachedResponseText);
        kotlin.jvm.internal.m.e(response, "response");
        kotlin.jvm.internal.m.e(cachedResponseText, "cachedResponseText");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Client request(");
        sb.append(response.getCall().getRequest().getMethod().getValue());
        sb.append(' ');
        sb.append(response.getCall().getRequest().getUrl());
        sb.append(") invalid: ");
        sb.append(response.getStatus());
        sb.append(". Text: \"");
        this.message = Y6.f.l(sb, cachedResponseText, '\"');
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.message;
    }
}
