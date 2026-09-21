package io.ktor.http.websocket;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "nonce", "websocketServerAccept", "(Ljava/lang/String;)Ljava/lang/String;", "WEBSOCKET_SERVER_ACCEPT_TAIL", "Ljava/lang/String;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UtilsKt {
    private static final java.lang.String WEBSOCKET_SERVER_ACCEPT_TAIL = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    public static final java.lang.String websocketServerAccept(java.lang.String nonce) {
        kotlin.jvm.internal.m.e(nonce, "nonce");
        return io.ktor.util.Base64Kt.encodeBase64(io.ktor.util.CryptoKt.sha1(io.ktor.utils.io.core.StringsKt.toByteArray(O7.q.r1(nonce).toString() + WEBSOCKET_SERVER_ACCEPT_TAIL, O7.a.f8025c)));
    }
}
