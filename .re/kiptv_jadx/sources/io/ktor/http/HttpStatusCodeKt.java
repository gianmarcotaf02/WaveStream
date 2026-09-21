package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Lio/ktor/http/HttpStatusCode;", "allStatusCodes", "()Ljava/util/List;", "", "isSuccess", "(Lio/ktor/http/HttpStatusCode;)Z", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpStatusCodeKt {
    public static final java.util.List<io.ktor.http.HttpStatusCode> allStatusCodes() {
        io.ktor.http.HttpStatusCode.Companion companion = io.ktor.http.HttpStatusCode.INSTANCE;
        return p078i6.p.B0(companion.getContinue(), companion.getSwitchingProtocols(), companion.getProcessing(), companion.getOK(), companion.getCreated(), companion.getAccepted(), companion.getNonAuthoritativeInformation(), companion.getNoContent(), companion.getResetContent(), companion.getPartialContent(), companion.getMultiStatus(), companion.getMultipleChoices(), companion.getMovedPermanently(), companion.getFound(), companion.getSeeOther(), companion.getNotModified(), companion.getUseProxy(), companion.getSwitchProxy(), companion.getTemporaryRedirect(), companion.getPermanentRedirect(), companion.getBadRequest(), companion.getUnauthorized(), companion.getPaymentRequired(), companion.getForbidden(), companion.getNotFound(), companion.getMethodNotAllowed(), companion.getNotAcceptable(), companion.getProxyAuthenticationRequired(), companion.getRequestTimeout(), companion.getConflict(), companion.getGone(), companion.getLengthRequired(), companion.getPreconditionFailed(), companion.getPayloadTooLarge(), companion.getRequestURITooLong(), companion.getUnsupportedMediaType(), companion.getRequestedRangeNotSatisfiable(), companion.getExpectationFailed(), companion.getUnprocessableEntity(), companion.getLocked(), companion.getFailedDependency(), companion.getTooEarly(), companion.getUpgradeRequired(), companion.getTooManyRequests(), companion.getRequestHeaderFieldTooLarge(), companion.getInternalServerError(), companion.getNotImplemented(), companion.getBadGateway(), companion.getServiceUnavailable(), companion.getGatewayTimeout(), companion.getVersionNotSupported(), companion.getVariantAlsoNegotiates(), companion.getInsufficientStorage());
    }

    public static final boolean isSuccess(io.ktor.http.HttpStatusCode httpStatusCode) {
        kotlin.jvm.internal.m.e(httpStatusCode, "<this>");
        int value = httpStatusCode.getValue();
        return 200 <= value && value < 300;
    }
}
