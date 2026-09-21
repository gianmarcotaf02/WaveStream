package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\tJ$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\t¨\u0006\u001d"}, d2 = {"Lio/ktor/http/HttpStatusCode;", "", "", "value", "", "description", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "(Ljava/lang/String;)Lio/ktor/http/HttpStatusCode;", "compareTo", "(Lio/ktor/http/HttpStatusCode;)I", "component1", "component2", "copy", "(ILjava/lang/String;)Lio/ktor/http/HttpStatusCode;", "I", "getValue", "Ljava/lang/String;", "getDescription", "Companion", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class HttpStatusCode implements java.lang.Comparable<io.ktor.http.HttpStatusCode> {
    private static final java.util.List<io.ktor.http.HttpStatusCode> allStatusCodes;
    private static final java.util.Map<java.lang.Integer, io.ktor.http.HttpStatusCode> statusCodesMap;
    private final java.lang.String description;
    private final int value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.HttpStatusCode.Companion INSTANCE = new io.ktor.http.HttpStatusCode.Companion(null);
    private static final io.ktor.http.HttpStatusCode Continue = new io.ktor.http.HttpStatusCode(100, "Continue");
    private static final io.ktor.http.HttpStatusCode SwitchingProtocols = new io.ktor.http.HttpStatusCode(101, "Switching Protocols");
    private static final io.ktor.http.HttpStatusCode Processing = new io.ktor.http.HttpStatusCode(102, "Processing");
    private static final io.ktor.http.HttpStatusCode OK = new io.ktor.http.HttpStatusCode(200, "OK");
    private static final io.ktor.http.HttpStatusCode Created = new io.ktor.http.HttpStatusCode(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.CREATED, "Created");
    private static final io.ktor.http.HttpStatusCode Accepted = new io.ktor.http.HttpStatusCode(202, "Accepted");
    private static final io.ktor.http.HttpStatusCode NonAuthoritativeInformation = new io.ktor.http.HttpStatusCode(203, "Non-Authoritative Information");
    private static final io.ktor.http.HttpStatusCode NoContent = new io.ktor.http.HttpStatusCode(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.NO_CONTENT, "No Content");
    private static final io.ktor.http.HttpStatusCode ResetContent = new io.ktor.http.HttpStatusCode(205, "Reset Content");
    private static final io.ktor.http.HttpStatusCode PartialContent = new io.ktor.http.HttpStatusCode(206, "Partial Content");
    private static final io.ktor.http.HttpStatusCode MultiStatus = new io.ktor.http.HttpStatusCode(207, "Multi-Status");
    private static final io.ktor.http.HttpStatusCode MultipleChoices = new io.ktor.http.HttpStatusCode(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.UNSUCCESSFUL, "Multiple Choices");
    private static final io.ktor.http.HttpStatusCode MovedPermanently = new io.ktor.http.HttpStatusCode(301, "Moved Permanently");
    private static final io.ktor.http.HttpStatusCode Found = new io.ktor.http.HttpStatusCode(302, "Found");
    private static final io.ktor.http.HttpStatusCode SeeOther = new io.ktor.http.HttpStatusCode(303, "See Other");
    private static final io.ktor.http.HttpStatusCode NotModified = new io.ktor.http.HttpStatusCode(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.NOT_MODIFIED, "Not Modified");
    private static final io.ktor.http.HttpStatusCode UseProxy = new io.ktor.http.HttpStatusCode(305, "Use Proxy");
    private static final io.ktor.http.HttpStatusCode SwitchProxy = new io.ktor.http.HttpStatusCode(306, "Switch Proxy");
    private static final io.ktor.http.HttpStatusCode TemporaryRedirect = new io.ktor.http.HttpStatusCode(307, "Temporary Redirect");
    private static final io.ktor.http.HttpStatusCode PermanentRedirect = new io.ktor.http.HttpStatusCode(308, "Permanent Redirect");
    private static final io.ktor.http.HttpStatusCode BadRequest = new io.ktor.http.HttpStatusCode(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST, "Bad Request");
    private static final io.ktor.http.HttpStatusCode Unauthorized = new io.ktor.http.HttpStatusCode(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.UNAUTHORIZED, "Unauthorized");
    private static final io.ktor.http.HttpStatusCode PaymentRequired = new io.ktor.http.HttpStatusCode(402, "Payment Required");
    private static final io.ktor.http.HttpStatusCode Forbidden = new io.ktor.http.HttpStatusCode(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.FORBIDDEN, "Forbidden");
    private static final io.ktor.http.HttpStatusCode NotFound = new io.ktor.http.HttpStatusCode(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.NOT_FOUND, "Not Found");
    private static final io.ktor.http.HttpStatusCode MethodNotAllowed = new io.ktor.http.HttpStatusCode(405, "Method Not Allowed");
    private static final io.ktor.http.HttpStatusCode NotAcceptable = new io.ktor.http.HttpStatusCode(406, "Not Acceptable");
    private static final io.ktor.http.HttpStatusCode ProxyAuthenticationRequired = new io.ktor.http.HttpStatusCode(407, "Proxy Authentication Required");
    private static final io.ktor.http.HttpStatusCode RequestTimeout = new io.ktor.http.HttpStatusCode(408, "Request Timeout");
    private static final io.ktor.http.HttpStatusCode Conflict = new io.ktor.http.HttpStatusCode(409, "Conflict");
    private static final io.ktor.http.HttpStatusCode Gone = new io.ktor.http.HttpStatusCode(410, "Gone");
    private static final io.ktor.http.HttpStatusCode LengthRequired = new io.ktor.http.HttpStatusCode(411, "Length Required");
    private static final io.ktor.http.HttpStatusCode PreconditionFailed = new io.ktor.http.HttpStatusCode(412, "Precondition Failed");
    private static final io.ktor.http.HttpStatusCode PayloadTooLarge = new io.ktor.http.HttpStatusCode(413, "Payload Too Large");
    private static final io.ktor.http.HttpStatusCode RequestURITooLong = new io.ktor.http.HttpStatusCode(414, "Request-URI Too Long");
    private static final io.ktor.http.HttpStatusCode UnsupportedMediaType = new io.ktor.http.HttpStatusCode(415, "Unsupported Media Type");
    private static final io.ktor.http.HttpStatusCode RequestedRangeNotSatisfiable = new io.ktor.http.HttpStatusCode(416, "Requested Range Not Satisfiable");
    private static final io.ktor.http.HttpStatusCode ExpectationFailed = new io.ktor.http.HttpStatusCode(417, "Expectation Failed");
    private static final io.ktor.http.HttpStatusCode UnprocessableEntity = new io.ktor.http.HttpStatusCode(422, "Unprocessable Entity");
    private static final io.ktor.http.HttpStatusCode Locked = new io.ktor.http.HttpStatusCode(423, "Locked");
    private static final io.ktor.http.HttpStatusCode FailedDependency = new io.ktor.http.HttpStatusCode(424, "Failed Dependency");
    private static final io.ktor.http.HttpStatusCode TooEarly = new io.ktor.http.HttpStatusCode(425, "Too Early");
    private static final io.ktor.http.HttpStatusCode UpgradeRequired = new io.ktor.http.HttpStatusCode(426, "Upgrade Required");
    private static final io.ktor.http.HttpStatusCode TooManyRequests = new io.ktor.http.HttpStatusCode(429, "Too Many Requests");
    private static final io.ktor.http.HttpStatusCode RequestHeaderFieldTooLarge = new io.ktor.http.HttpStatusCode(431, "Request Header Fields Too Large");
    private static final io.ktor.http.HttpStatusCode InternalServerError = new io.ktor.http.HttpStatusCode(500, "Internal Server Error");
    private static final io.ktor.http.HttpStatusCode NotImplemented = new io.ktor.http.HttpStatusCode(501, "Not Implemented");
    private static final io.ktor.http.HttpStatusCode BadGateway = new io.ktor.http.HttpStatusCode(502, "Bad Gateway");
    private static final io.ktor.http.HttpStatusCode ServiceUnavailable = new io.ktor.http.HttpStatusCode(503, "Service Unavailable");
    private static final io.ktor.http.HttpStatusCode GatewayTimeout = new io.ktor.http.HttpStatusCode(504, "Gateway Timeout");
    private static final io.ktor.http.HttpStatusCode VersionNotSupported = new io.ktor.http.HttpStatusCode(505, "HTTP Version Not Supported");
    private static final io.ktor.http.HttpStatusCode VariantAlsoNegotiates = new io.ktor.http.HttpStatusCode(506, "Variant Also Negotiates");
    private static final io.ktor.http.HttpStatusCode InsufficientStorage = new io.ktor.http.HttpStatusCode(507, "Insufficient Storage");

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bn\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u001b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\fR\u0017\u0010!\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\fR\u0017\u0010#\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u0017\u0010%\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010\fR\u0017\u0010'\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010\n\u001a\u0004\b(\u0010\fR\u0017\u0010)\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010\fR\u0017\u0010+\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b,\u0010\fR\u0017\u0010-\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b.\u0010\fR\u0017\u0010/\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b0\u0010\fR\u0017\u00101\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b2\u0010\fR\u0017\u00103\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b4\u0010\fR\u0017\u00105\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u0010\n\u001a\u0004\b6\u0010\fR\u0017\u00107\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b8\u0010\fR\u0017\u00109\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b:\u0010\fR\u0017\u0010;\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b<\u0010\fR\u0017\u0010=\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b>\u0010\fR\u0017\u0010?\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b@\u0010\fR\u0017\u0010A\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\fR\u0017\u0010C\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bC\u0010\n\u001a\u0004\bD\u0010\fR\u0017\u0010E\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bF\u0010\fR\u0017\u0010G\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bG\u0010\n\u001a\u0004\bH\u0010\fR\u0017\u0010I\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bJ\u0010\fR\u0017\u0010K\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bK\u0010\n\u001a\u0004\bL\u0010\fR\u0017\u0010M\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\fR\u0017\u0010O\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bO\u0010\n\u001a\u0004\bP\u0010\fR\u0017\u0010Q\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bQ\u0010\n\u001a\u0004\bR\u0010\fR\u0017\u0010S\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bS\u0010\n\u001a\u0004\bT\u0010\fR\u0017\u0010U\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bU\u0010\n\u001a\u0004\bV\u0010\fR\u0017\u0010W\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bW\u0010\n\u001a\u0004\bX\u0010\fR\u0017\u0010Y\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bY\u0010\n\u001a\u0004\bZ\u0010\fR\u0017\u0010[\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b[\u0010\n\u001a\u0004\b\\\u0010\fR\u0017\u0010]\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b]\u0010\n\u001a\u0004\b^\u0010\fR\u0017\u0010_\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b_\u0010\n\u001a\u0004\b`\u0010\fR\u0017\u0010a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\ba\u0010\n\u001a\u0004\bb\u0010\fR\u0017\u0010c\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bc\u0010\n\u001a\u0004\bd\u0010\fR\u0017\u0010e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\be\u0010\n\u001a\u0004\bf\u0010\fR\u0017\u0010g\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bg\u0010\n\u001a\u0004\bh\u0010\fR\u0017\u0010i\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bi\u0010\n\u001a\u0004\bj\u0010\fR\u0017\u0010k\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bk\u0010\n\u001a\u0004\bl\u0010\fR\u0017\u0010m\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bm\u0010\n\u001a\u0004\bn\u0010\fR\u0017\u0010o\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bo\u0010\n\u001a\u0004\bp\u0010\fR\u0017\u0010q\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bq\u0010\n\u001a\u0004\br\u0010\fR\u0017\u0010s\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bs\u0010\n\u001a\u0004\bt\u0010\fR\u001d\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00060u8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR \u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|¨\u0006}"}, d2 = {"Lio/ktor/http/HttpStatusCode$Companion;", "", "<init>", "()V", "", "value", "Lio/ktor/http/HttpStatusCode;", "fromValue", "(I)Lio/ktor/http/HttpStatusCode;", "Continue", "Lio/ktor/http/HttpStatusCode;", "getContinue", "()Lio/ktor/http/HttpStatusCode;", "SwitchingProtocols", "getSwitchingProtocols", "Processing", "getProcessing", "OK", "getOK", "Created", "getCreated", "Accepted", "getAccepted", "NonAuthoritativeInformation", "getNonAuthoritativeInformation", "NoContent", "getNoContent", "ResetContent", "getResetContent", "PartialContent", "getPartialContent", "MultiStatus", "getMultiStatus", "MultipleChoices", "getMultipleChoices", "MovedPermanently", "getMovedPermanently", "Found", "getFound", "SeeOther", "getSeeOther", "NotModified", "getNotModified", "UseProxy", "getUseProxy", "SwitchProxy", "getSwitchProxy", "TemporaryRedirect", "getTemporaryRedirect", "PermanentRedirect", "getPermanentRedirect", "BadRequest", "getBadRequest", "Unauthorized", "getUnauthorized", "PaymentRequired", "getPaymentRequired", "Forbidden", "getForbidden", "NotFound", "getNotFound", "MethodNotAllowed", "getMethodNotAllowed", "NotAcceptable", "getNotAcceptable", "ProxyAuthenticationRequired", "getProxyAuthenticationRequired", "RequestTimeout", "getRequestTimeout", "Conflict", "getConflict", "Gone", "getGone", "LengthRequired", "getLengthRequired", "PreconditionFailed", "getPreconditionFailed", "PayloadTooLarge", "getPayloadTooLarge", "RequestURITooLong", "getRequestURITooLong", "UnsupportedMediaType", "getUnsupportedMediaType", "RequestedRangeNotSatisfiable", "getRequestedRangeNotSatisfiable", "ExpectationFailed", "getExpectationFailed", "UnprocessableEntity", "getUnprocessableEntity", "Locked", "getLocked", "FailedDependency", "getFailedDependency", "TooEarly", "getTooEarly", "UpgradeRequired", "getUpgradeRequired", "TooManyRequests", "getTooManyRequests", "RequestHeaderFieldTooLarge", "getRequestHeaderFieldTooLarge", "InternalServerError", "getInternalServerError", "NotImplemented", "getNotImplemented", "BadGateway", "getBadGateway", "ServiceUnavailable", "getServiceUnavailable", "GatewayTimeout", "getGatewayTimeout", "VersionNotSupported", "getVersionNotSupported", "VariantAlsoNegotiates", "getVariantAlsoNegotiates", "InsufficientStorage", "getInsufficientStorage", "", "allStatusCodes", "Ljava/util/List;", "getAllStatusCodes", "()Ljava/util/List;", "", "statusCodesMap", "Ljava/util/Map;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final io.ktor.http.HttpStatusCode fromValue(int value) {
            io.ktor.http.HttpStatusCode httpStatusCode = (io.ktor.http.HttpStatusCode) io.ktor.http.HttpStatusCode.statusCodesMap.get(java.lang.Integer.valueOf(value));
            return httpStatusCode == null ? new io.ktor.http.HttpStatusCode(value, "Unknown Status Code") : httpStatusCode;
        }

        public final io.ktor.http.HttpStatusCode getAccepted() {
            return io.ktor.http.HttpStatusCode.Accepted;
        }

        public final java.util.List<io.ktor.http.HttpStatusCode> getAllStatusCodes() {
            return io.ktor.http.HttpStatusCode.allStatusCodes;
        }

        public final io.ktor.http.HttpStatusCode getBadGateway() {
            return io.ktor.http.HttpStatusCode.BadGateway;
        }

        public final io.ktor.http.HttpStatusCode getBadRequest() {
            return io.ktor.http.HttpStatusCode.BadRequest;
        }

        public final io.ktor.http.HttpStatusCode getConflict() {
            return io.ktor.http.HttpStatusCode.Conflict;
        }

        public final io.ktor.http.HttpStatusCode getContinue() {
            return io.ktor.http.HttpStatusCode.Continue;
        }

        public final io.ktor.http.HttpStatusCode getCreated() {
            return io.ktor.http.HttpStatusCode.Created;
        }

        public final io.ktor.http.HttpStatusCode getExpectationFailed() {
            return io.ktor.http.HttpStatusCode.ExpectationFailed;
        }

        public final io.ktor.http.HttpStatusCode getFailedDependency() {
            return io.ktor.http.HttpStatusCode.FailedDependency;
        }

        public final io.ktor.http.HttpStatusCode getForbidden() {
            return io.ktor.http.HttpStatusCode.Forbidden;
        }

        public final io.ktor.http.HttpStatusCode getFound() {
            return io.ktor.http.HttpStatusCode.Found;
        }

        public final io.ktor.http.HttpStatusCode getGatewayTimeout() {
            return io.ktor.http.HttpStatusCode.GatewayTimeout;
        }

        public final io.ktor.http.HttpStatusCode getGone() {
            return io.ktor.http.HttpStatusCode.Gone;
        }

        public final io.ktor.http.HttpStatusCode getInsufficientStorage() {
            return io.ktor.http.HttpStatusCode.InsufficientStorage;
        }

        public final io.ktor.http.HttpStatusCode getInternalServerError() {
            return io.ktor.http.HttpStatusCode.InternalServerError;
        }

        public final io.ktor.http.HttpStatusCode getLengthRequired() {
            return io.ktor.http.HttpStatusCode.LengthRequired;
        }

        public final io.ktor.http.HttpStatusCode getLocked() {
            return io.ktor.http.HttpStatusCode.Locked;
        }

        public final io.ktor.http.HttpStatusCode getMethodNotAllowed() {
            return io.ktor.http.HttpStatusCode.MethodNotAllowed;
        }

        public final io.ktor.http.HttpStatusCode getMovedPermanently() {
            return io.ktor.http.HttpStatusCode.MovedPermanently;
        }

        public final io.ktor.http.HttpStatusCode getMultiStatus() {
            return io.ktor.http.HttpStatusCode.MultiStatus;
        }

        public final io.ktor.http.HttpStatusCode getMultipleChoices() {
            return io.ktor.http.HttpStatusCode.MultipleChoices;
        }

        public final io.ktor.http.HttpStatusCode getNoContent() {
            return io.ktor.http.HttpStatusCode.NoContent;
        }

        public final io.ktor.http.HttpStatusCode getNonAuthoritativeInformation() {
            return io.ktor.http.HttpStatusCode.NonAuthoritativeInformation;
        }

        public final io.ktor.http.HttpStatusCode getNotAcceptable() {
            return io.ktor.http.HttpStatusCode.NotAcceptable;
        }

        public final io.ktor.http.HttpStatusCode getNotFound() {
            return io.ktor.http.HttpStatusCode.NotFound;
        }

        public final io.ktor.http.HttpStatusCode getNotImplemented() {
            return io.ktor.http.HttpStatusCode.NotImplemented;
        }

        public final io.ktor.http.HttpStatusCode getNotModified() {
            return io.ktor.http.HttpStatusCode.NotModified;
        }

        public final io.ktor.http.HttpStatusCode getOK() {
            return io.ktor.http.HttpStatusCode.OK;
        }

        public final io.ktor.http.HttpStatusCode getPartialContent() {
            return io.ktor.http.HttpStatusCode.PartialContent;
        }

        public final io.ktor.http.HttpStatusCode getPayloadTooLarge() {
            return io.ktor.http.HttpStatusCode.PayloadTooLarge;
        }

        public final io.ktor.http.HttpStatusCode getPaymentRequired() {
            return io.ktor.http.HttpStatusCode.PaymentRequired;
        }

        public final io.ktor.http.HttpStatusCode getPermanentRedirect() {
            return io.ktor.http.HttpStatusCode.PermanentRedirect;
        }

        public final io.ktor.http.HttpStatusCode getPreconditionFailed() {
            return io.ktor.http.HttpStatusCode.PreconditionFailed;
        }

        public final io.ktor.http.HttpStatusCode getProcessing() {
            return io.ktor.http.HttpStatusCode.Processing;
        }

        public final io.ktor.http.HttpStatusCode getProxyAuthenticationRequired() {
            return io.ktor.http.HttpStatusCode.ProxyAuthenticationRequired;
        }

        public final io.ktor.http.HttpStatusCode getRequestHeaderFieldTooLarge() {
            return io.ktor.http.HttpStatusCode.RequestHeaderFieldTooLarge;
        }

        public final io.ktor.http.HttpStatusCode getRequestTimeout() {
            return io.ktor.http.HttpStatusCode.RequestTimeout;
        }

        public final io.ktor.http.HttpStatusCode getRequestURITooLong() {
            return io.ktor.http.HttpStatusCode.RequestURITooLong;
        }

        public final io.ktor.http.HttpStatusCode getRequestedRangeNotSatisfiable() {
            return io.ktor.http.HttpStatusCode.RequestedRangeNotSatisfiable;
        }

        public final io.ktor.http.HttpStatusCode getResetContent() {
            return io.ktor.http.HttpStatusCode.ResetContent;
        }

        public final io.ktor.http.HttpStatusCode getSeeOther() {
            return io.ktor.http.HttpStatusCode.SeeOther;
        }

        public final io.ktor.http.HttpStatusCode getServiceUnavailable() {
            return io.ktor.http.HttpStatusCode.ServiceUnavailable;
        }

        public final io.ktor.http.HttpStatusCode getSwitchProxy() {
            return io.ktor.http.HttpStatusCode.SwitchProxy;
        }

        public final io.ktor.http.HttpStatusCode getSwitchingProtocols() {
            return io.ktor.http.HttpStatusCode.SwitchingProtocols;
        }

        public final io.ktor.http.HttpStatusCode getTemporaryRedirect() {
            return io.ktor.http.HttpStatusCode.TemporaryRedirect;
        }

        public final io.ktor.http.HttpStatusCode getTooEarly() {
            return io.ktor.http.HttpStatusCode.TooEarly;
        }

        public final io.ktor.http.HttpStatusCode getTooManyRequests() {
            return io.ktor.http.HttpStatusCode.TooManyRequests;
        }

        public final io.ktor.http.HttpStatusCode getUnauthorized() {
            return io.ktor.http.HttpStatusCode.Unauthorized;
        }

        public final io.ktor.http.HttpStatusCode getUnprocessableEntity() {
            return io.ktor.http.HttpStatusCode.UnprocessableEntity;
        }

        public final io.ktor.http.HttpStatusCode getUnsupportedMediaType() {
            return io.ktor.http.HttpStatusCode.UnsupportedMediaType;
        }

        public final io.ktor.http.HttpStatusCode getUpgradeRequired() {
            return io.ktor.http.HttpStatusCode.UpgradeRequired;
        }

        public final io.ktor.http.HttpStatusCode getUseProxy() {
            return io.ktor.http.HttpStatusCode.UseProxy;
        }

        public final io.ktor.http.HttpStatusCode getVariantAlsoNegotiates() {
            return io.ktor.http.HttpStatusCode.VariantAlsoNegotiates;
        }

        public final io.ktor.http.HttpStatusCode getVersionNotSupported() {
            return io.ktor.http.HttpStatusCode.VersionNotSupported;
        }

        private Companion() {
        }
    }

    static {
        java.util.List<io.ktor.http.HttpStatusCode> listAllStatusCodes = io.ktor.http.HttpStatusCodeKt.allStatusCodes();
        allStatusCodes = listAllStatusCodes;
        int iI0 = p078i6.D.I0(p078i6.q.I0(listAllStatusCodes, 10));
        if (iI0 < 16) {
            iI0 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iI0);
        for (java.lang.Object obj : listAllStatusCodes) {
            linkedHashMap.put(java.lang.Integer.valueOf(((io.ktor.http.HttpStatusCode) obj).value), obj);
        }
        statusCodesMap = linkedHashMap;
    }

    public HttpStatusCode(int i3, java.lang.String description) {
        kotlin.jvm.internal.m.e(description, "description");
        this.value = i3;
        this.description = description;
    }

    public static /* synthetic */ io.ktor.http.HttpStatusCode copy$default(io.ktor.http.HttpStatusCode httpStatusCode, int i3, java.lang.String str, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            i3 = httpStatusCode.value;
        }
        if ((i9 & 2) != 0) {
            str = httpStatusCode.description;
        }
        return httpStatusCode.copy(i3, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    public final io.ktor.http.HttpStatusCode copy(int value, java.lang.String description) {
        kotlin.jvm.internal.m.e(description, "description");
        return new io.ktor.http.HttpStatusCode(value, description);
    }

    public final io.ktor.http.HttpStatusCode description(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        return copy$default(this, 0, value, 1, null);
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof io.ktor.http.HttpStatusCode) && ((io.ktor.http.HttpStatusCode) other).value == this.value;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.value);
    }

    public java.lang.String toString() {
        return this.value + ' ' + this.description;
    }

    @Override // java.lang.Comparable
    public int compareTo(io.ktor.http.HttpStatusCode other) {
        kotlin.jvm.internal.m.e(other, "other");
        return this.value - other.value;
    }
}
