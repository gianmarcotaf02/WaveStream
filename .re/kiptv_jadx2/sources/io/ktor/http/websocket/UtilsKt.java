package io.ktor.http.websocket;

import O7.a;
import O7.q;
import androidx.media3.container.NalUnitUtil;
import io.ktor.util.Base64Kt;
import io.ktor.util.CryptoKt;
import io.ktor.utils.io.core.StringsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "nonce", "websocketServerAccept", "(Ljava/lang/String;)Ljava/lang/String;", "WEBSOCKET_SERVER_ACCEPT_TAIL", "Ljava/lang/String;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UtilsKt {
    private static final String WEBSOCKET_SERVER_ACCEPT_TAIL = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    public static final String websocketServerAccept(String nonce) {
        m.e(nonce, "nonce");
        return Base64Kt.encodeBase64(CryptoKt.sha1(StringsKt.toByteArray(q.r1(nonce).toString() + WEBSOCKET_SERVER_ACCEPT_TAIL, a.f8025c)));
    }
}
