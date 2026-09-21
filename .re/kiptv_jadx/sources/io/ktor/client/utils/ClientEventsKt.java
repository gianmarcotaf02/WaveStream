package io.ktor.client.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\u0005\"\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u0005\"\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u0005\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, d2 = {"Lio/ktor/events/EventDefinition;", "Lio/ktor/client/request/HttpRequestBuilder;", "HttpRequestCreated", "Lio/ktor/events/EventDefinition;", "getHttpRequestCreated", "()Lio/ktor/events/EventDefinition;", "HttpRequestIsReadyForSending", "getHttpRequestIsReadyForSending", "Lio/ktor/client/statement/HttpResponse;", "HttpResponseReceived", "getHttpResponseReceived", "Lio/ktor/client/utils/HttpResponseReceiveFail;", "HttpResponseReceiveFailed", "getHttpResponseReceiveFailed", "HttpResponseCancelled", "getHttpResponseCancelled", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ClientEventsKt {
    private static final io.ktor.events.EventDefinition<io.ktor.client.request.HttpRequestBuilder> HttpRequestCreated = new io.ktor.events.EventDefinition<>();
    private static final io.ktor.events.EventDefinition<io.ktor.client.request.HttpRequestBuilder> HttpRequestIsReadyForSending = new io.ktor.events.EventDefinition<>();
    private static final io.ktor.events.EventDefinition<io.ktor.client.statement.HttpResponse> HttpResponseReceived = new io.ktor.events.EventDefinition<>();
    private static final io.ktor.events.EventDefinition<io.ktor.client.utils.HttpResponseReceiveFail> HttpResponseReceiveFailed = new io.ktor.events.EventDefinition<>();
    private static final io.ktor.events.EventDefinition<io.ktor.client.statement.HttpResponse> HttpResponseCancelled = new io.ktor.events.EventDefinition<>();

    public static final io.ktor.events.EventDefinition<io.ktor.client.request.HttpRequestBuilder> getHttpRequestCreated() {
        return HttpRequestCreated;
    }

    public static final io.ktor.events.EventDefinition<io.ktor.client.request.HttpRequestBuilder> getHttpRequestIsReadyForSending() {
        return HttpRequestIsReadyForSending;
    }

    public static final io.ktor.events.EventDefinition<io.ktor.client.statement.HttpResponse> getHttpResponseCancelled() {
        return HttpResponseCancelled;
    }

    public static final io.ktor.events.EventDefinition<io.ktor.client.utils.HttpResponseReceiveFail> getHttpResponseReceiveFailed() {
        return HttpResponseReceiveFailed;
    }

    public static final io.ktor.events.EventDefinition<io.ktor.client.statement.HttpResponse> getHttpResponseReceived() {
        return HttpResponseReceived;
    }
}
