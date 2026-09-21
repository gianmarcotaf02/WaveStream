package io.ktor.client.plugins.websocket;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/client/plugins/websocket/WebSocketContent;", "Lio/ktor/client/request/ClientUpgradeContent;", "<init>", "()V", "Lio/ktor/http/Headers;", "headers", "Lh6/A;", "verify", "(Lio/ktor/http/Headers;)V", "", "toString", "()Ljava/lang/String;", "nonce", "Ljava/lang/String;", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WebSocketContent extends io.ktor.client.request.ClientUpgradeContent {
    private final io.ktor.http.Headers headers;
    private final java.lang.String nonce;

    public WebSocketContent() {
        java.lang.String str = io.ktor.util.Base64Kt.encodeBase64(io.ktor.util.CryptoKt.generateNonce(16));
        this.nonce = str;
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
        io.ktor.http.HttpHeaders httpHeaders = io.ktor.http.HttpHeaders.INSTANCE;
        headersBuilder.append(httpHeaders.getUpgrade(), "websocket");
        headersBuilder.append(httpHeaders.getConnection(), "Upgrade");
        headersBuilder.append(httpHeaders.getSecWebSocketKey(), str);
        headersBuilder.append(httpHeaders.getSecWebSocketVersion(), "13");
        this.headers = headersBuilder.build();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    public java.lang.String toString() {
        return "WebSocketContent";
    }

    @Override // io.ktor.client.request.ClientUpgradeContent
    public void verify(io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(headers, "headers");
        io.ktor.http.HttpHeaders httpHeaders = io.ktor.http.HttpHeaders.INSTANCE;
        java.lang.String str = headers.get(httpHeaders.getSecWebSocketAccept());
        if (str == null) {
            throw new java.lang.IllegalStateException(("Server should specify header " + httpHeaders.getSecWebSocketAccept()).toString());
        }
        java.lang.String strWebsocketServerAccept = io.ktor.http.websocket.UtilsKt.websocketServerAccept(this.nonce);
        if (!kotlin.jvm.internal.m.a(strWebsocketServerAccept, str)) {
            throw new java.lang.IllegalStateException(B2.a.m("Failed to verify server accept header. Expected: ", strWebsocketServerAccept, ", received: ", str).toString());
        }
    }
}
