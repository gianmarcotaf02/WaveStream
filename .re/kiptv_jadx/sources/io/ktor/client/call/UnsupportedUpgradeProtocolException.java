package io.ktor.client.call;

/* JADX INFO: loaded from: classes4.dex */
@p070h6.c
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/call/UnsupportedUpgradeProtocolException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "Lio/ktor/http/Url;", io.sentry.protocol.Request.JsonKeys.URL, "<init>", "(Lio/ktor/http/Url;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UnsupportedUpgradeProtocolException extends java.lang.IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedUpgradeProtocolException(io.ktor.http.Url url) {
        super("Unsupported upgrade protocol exception: " + url);
        kotlin.jvm.internal.m.e(url, "url");
    }
}
