package io.ktor.client.plugins.observer;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006,"}, d2 = {"Lio/ktor/client/plugins/observer/DelegatedResponse;", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/call/HttpClientCall;", "call", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "block", "origin", "Lio/ktor/http/Headers;", "headers", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lkotlin/jvm/functions/Function0;Lio/ktor/client/statement/HttpResponse;Lio/ktor/http/Headers;)V", "content", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/client/statement/HttpResponse;Lio/ktor/http/Headers;)V", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "Lkotlin/jvm/functions/Function0;", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "Ll6/h;", "coroutineContext", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "getRawContent", "()Lio/ktor/utils/io/ByteReadChannel;", "rawContent", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/HttpProtocolVersion;", "getVersion", "()Lio/ktor/http/HttpProtocolVersion;", "version", "Lio/ktor/util/date/GMTDate;", "getRequestTime", "()Lio/ktor/util/date/GMTDate;", "requestTime", "getResponseTime", "responseTime", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DelegatedResponse extends io.ktor.client.statement.HttpResponse {
    private final kotlin.jvm.functions.Function0 block;
    private final io.ktor.client.call.HttpClientCall call;
    private final p100l6.h coroutineContext;
    private final io.ktor.http.Headers headers;
    private final io.ktor.client.statement.HttpResponse origin;

    public /* synthetic */ DelegatedResponse(io.ktor.client.call.HttpClientCall httpClientCall, kotlin.jvm.functions.Function0 function0, io.ktor.client.statement.HttpResponse httpResponse, io.ktor.http.Headers headers, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(httpClientCall, function0, httpResponse, (i3 & 8) != 0 ? httpResponse.getHeaders() : headers);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.ByteReadChannel _init_$lambda$0(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        return byteReadChannel;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public io.ktor.client.call.HttpClientCall getCall() {
        return this.call;
    }

    @Override // io.ktor.client.statement.HttpResponse, S7.A
    public p100l6.h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.http.HttpMessage
    public io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public io.ktor.utils.io.ByteReadChannel getRawContent() {
        return (io.ktor.utils.io.ByteReadChannel) this.block.invoke();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public io.ktor.util.date.GMTDate getRequestTime() {
        return this.origin.getRequestTime();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public io.ktor.util.date.GMTDate getResponseTime() {
        return this.origin.getResponseTime();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public io.ktor.http.HttpStatusCode getStatus() {
        return this.origin.getStatus();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public io.ktor.http.HttpProtocolVersion getVersion() {
        return this.origin.getVersion();
    }

    public DelegatedResponse(io.ktor.client.call.HttpClientCall call, kotlin.jvm.functions.Function0 block, io.ktor.client.statement.HttpResponse origin, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(call, "call");
        kotlin.jvm.internal.m.e(block, "block");
        kotlin.jvm.internal.m.e(origin, "origin");
        kotlin.jvm.internal.m.e(headers, "headers");
        this.call = call;
        this.block = block;
        this.origin = origin;
        this.headers = headers;
        this.coroutineContext = origin.getCoroutineContext();
    }

    public /* synthetic */ DelegatedResponse(io.ktor.client.call.HttpClientCall httpClientCall, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.client.statement.HttpResponse httpResponse, io.ktor.http.Headers headers, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(httpClientCall, byteReadChannel, httpResponse, (i3 & 8) != 0 ? httpResponse.getHeaders() : headers);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DelegatedResponse(io.ktor.client.call.HttpClientCall call, io.ktor.utils.io.ByteReadChannel content, io.ktor.client.statement.HttpResponse origin, io.ktor.http.Headers headers) {
        this(call, new io.ktor.client.plugins.observer.a(content, 1), origin, headers);
        kotlin.jvm.internal.m.e(call, "call");
        kotlin.jvm.internal.m.e(content, "content");
        kotlin.jvm.internal.m.e(origin, "origin");
        kotlin.jvm.internal.m.e(headers, "headers");
    }
}
