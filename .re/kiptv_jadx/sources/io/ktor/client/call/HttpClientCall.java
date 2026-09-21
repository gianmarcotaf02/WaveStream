package io.ktor.client.call;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 92\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0094@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R*\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d8\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(\"\u0004\b!\u0010 R*\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00178\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\"\u0004\b\u001c\u0010\u001bR\u001a\u0010-\u001a\u00020,8\u0014X\u0094D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lio/ktor/client/call/HttpClientCall;", "LS7/A;", "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lio/ktor/client/HttpClient;)V", "Lio/ktor/client/request/HttpRequestData;", "requestData", "Lio/ktor/client/request/HttpResponseData;", "responseData", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestData;Lio/ktor/client/request/HttpResponseData;)V", "Lio/ktor/utils/io/ByteReadChannel;", "getResponseContent", "(Ll6/c;)Ljava/lang/Object;", "Lio/ktor/util/reflect/TypeInfo;", "info", "", "bodyNullable", "(Lio/ktor/util/reflect/TypeInfo;Ll6/c;)Ljava/lang/Object;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/statement/HttpResponse;", io.sentry.protocol.Response.TYPE, "Lh6/A;", "setResponse$ktor_client_core", "(Lio/ktor/client/statement/HttpResponse;)V", "setResponse", "Lio/ktor/client/request/HttpRequest;", io.sentry.SentryBaseEvent.JsonKeys.REQUEST, "setRequest$ktor_client_core", "(Lio/ktor/client/request/HttpRequest;)V", "setRequest", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "value", "Lio/ktor/client/request/HttpRequest;", "getRequest", "()Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "", "allowDoubleReceive", "Z", "getAllowDoubleReceive", "()Z", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "coroutineContext", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "attributes", "Companion", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class HttpClientCall implements S7.A {
    private static final io.ktor.util.AttributeKey<java.lang.Object> CustomResponse;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater received$FU;
    private final boolean allowDoubleReceive;
    private final io.ktor.client.HttpClient client;
    private volatile /* synthetic */ int received;
    protected io.ktor.client.request.HttpRequest request;
    protected io.ktor.client.statement.HttpResponse response;

    /* JADX INFO: renamed from: io.ktor.client.call.HttpClientCall$body$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", l = {125}, m = androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY)
    public static final class AnonymousClass1 extends p117n6.c {
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.call.HttpClientCall.this.body(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.call.HttpClientCall$bodyNullable$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", l = {96, 99}, m = "bodyNullable")
    public static final class C23511 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C23511(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.call.HttpClientCall.this.bodyNullable(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        E6.v vVarA = null;
        E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(java.lang.Object.class);
        try {
            vVarA = kotlin.jvm.internal.B.a(java.lang.Object.class);
        } catch (java.lang.Throwable unused) {
        }
        CustomResponse = new io.ktor.util.AttributeKey<>("CustomResponse", new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarA));
        received$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.client.call.HttpClientCall.class, "received");
    }

    public HttpClientCall(io.ktor.client.HttpClient client) {
        kotlin.jvm.internal.m.e(client, "client");
        this.client = client;
        this.received = 0;
    }

    public static /* synthetic */ java.lang.Object getResponseContent$suspendImpl(io.ktor.client.call.HttpClientCall httpClientCall, p100l6.c cVar) {
        return httpClientCall.getResponse().getRawContent();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object body(io.ktor.util.reflect.TypeInfo typeInfo, p100l6.c cVar) {
        io.ktor.client.call.HttpClientCall.AnonymousClass1 anonymousClass1;
        if (cVar instanceof io.ktor.client.call.HttpClientCall.AnonymousClass1) {
            anonymousClass1 = (io.ktor.client.call.HttpClientCall.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.ktor.client.call.HttpClientCall.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.ktor.client.call.HttpClientCall.AnonymousClass1(cVar);
        }
        java.lang.Object objBodyNullable = anonymousClass1.result;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objBodyNullable);
            anonymousClass1.label = 1;
            objBodyNullable = bodyNullable(typeInfo, anonymousClass1);
            if (objBodyNullable == obj) {
                return obj;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objBodyNullable);
        }
        kotlin.jvm.internal.m.b(objBodyNullable);
        return objBodyNullable;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        if (r7 == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object bodyNullable(io.ktor.util.reflect.TypeInfo typeInfo, p100l6.c cVar) {
        io.ktor.client.call.HttpClientCall.C23511 c23511;
        io.ktor.client.call.HttpClientCall httpClientCall;
        io.ktor.client.call.HttpClientCall httpClientCall2;
        java.lang.Object response;
        if (cVar instanceof io.ktor.client.call.HttpClientCall.C23511) {
            c23511 = (io.ktor.client.call.HttpClientCall.C23511) cVar;
            int i3 = c23511.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23511.label = i3 - Integer.MIN_VALUE;
            } else {
                c23511 = new io.ktor.client.call.HttpClientCall.C23511(cVar);
            }
        } else {
            c23511 = new io.ktor.client.call.HttpClientCall.C23511(cVar);
        }
        java.lang.Object orNull = c23511.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c23511.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(orNull);
            try {
                if (io.ktor.util.reflect.TypeInfoJvmKt.instanceOf(getResponse(), typeInfo.getType())) {
                    return getResponse();
                }
                if (!getAllowDoubleReceive() && !io.ktor.client.plugins.DoubleReceivePluginKt.isSaved(getResponse()) && !received$FU.compareAndSet(this, 0, 1)) {
                    throw new io.ktor.client.call.DoubleReceiveException(this);
                }
                orNull = getAttributes().getOrNull(CustomResponse);
                if (orNull == null) {
                    c23511.L$0 = this;
                    c23511.L$1 = typeInfo;
                    c23511.label = 1;
                    orNull = getResponseContent(c23511);
                }
                httpClientCall2 = this;
            } catch (java.lang.Throwable th) {
                th = th;
                httpClientCall = this;
                S7.C.i(httpClientCall.getResponse(), S7.C.a("Receive failed", th));
                throw th;
            }
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                typeInfo = (io.ktor.util.reflect.TypeInfo) c23511.L$1;
                httpClientCall = (io.ktor.client.call.HttpClientCall) c23511.L$0;
                try {
                    com.google.common.util.concurrent.P.u0(orNull);
                    response = ((io.ktor.client.statement.HttpResponseContainer) orNull).getResponse();
                    if (!kotlin.jvm.internal.m.a(response, io.ktor.http.content.NullBody.INSTANCE)) {
                        response = null;
                    }
                    if (response != null && !io.ktor.util.reflect.TypeInfoJvmKt.instanceOf(response, typeInfo.getType())) {
                        throw new io.ktor.client.call.NoTransformationFoundException(httpClientCall.getResponse(), kotlin.jvm.internal.B.f24540a.b(response.getClass()), typeInfo.getType());
                    }
                    return response;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    S7.C.i(httpClientCall.getResponse(), S7.C.a("Receive failed", th));
                    throw th;
                }
            }
            typeInfo = (io.ktor.util.reflect.TypeInfo) c23511.L$1;
            httpClientCall2 = (io.ktor.client.call.HttpClientCall) c23511.L$0;
            try {
                com.google.common.util.concurrent.P.u0(orNull);
            } catch (java.lang.Throwable th3) {
                th = th3;
                httpClientCall = httpClientCall2;
                S7.C.i(httpClientCall.getResponse(), S7.C.a("Receive failed", th));
                throw th;
            }
        }
        io.ktor.client.statement.HttpResponseContainer httpResponseContainer = new io.ktor.client.statement.HttpResponseContainer(typeInfo, orNull);
        io.ktor.client.statement.HttpResponsePipeline responsePipeline = httpClientCall2.client.getResponsePipeline();
        c23511.L$0 = httpClientCall2;
        c23511.L$1 = typeInfo;
        c23511.label = 2;
        orNull = responsePipeline.execute(httpClientCall2, httpResponseContainer, c23511);
        if (orNull != aVar) {
            httpClientCall = httpClientCall2;
            response = ((io.ktor.client.statement.HttpResponseContainer) orNull).getResponse();
            if (!kotlin.jvm.internal.m.a(response, io.ktor.http.content.NullBody.INSTANCE)) {
                response = null;
            }
            if (response != null) {
                throw new io.ktor.client.call.NoTransformationFoundException(httpClientCall.getResponse(), kotlin.jvm.internal.B.f24540a.b(response.getClass()), typeInfo.getType());
            }
            return response;
        }
        return aVar;
    }

    public boolean getAllowDoubleReceive() {
        return this.allowDoubleReceive;
    }

    public final io.ktor.util.Attributes getAttributes() {
        return getRequest().getAttributes();
    }

    public final io.ktor.client.HttpClient getClient() {
        return this.client;
    }

    @Override // S7.A
    public p100l6.h getCoroutineContext() {
        return getResponse().getCoroutineContext();
    }

    public final io.ktor.client.request.HttpRequest getRequest() {
        io.ktor.client.request.HttpRequest httpRequest = this.request;
        if (httpRequest != null) {
            return httpRequest;
        }
        kotlin.jvm.internal.m.k(io.sentry.SentryBaseEvent.JsonKeys.REQUEST);
        throw null;
    }

    public final io.ktor.client.statement.HttpResponse getResponse() {
        io.ktor.client.statement.HttpResponse httpResponse = this.response;
        if (httpResponse != null) {
            return httpResponse;
        }
        kotlin.jvm.internal.m.k(io.sentry.protocol.Response.TYPE);
        throw null;
    }

    public java.lang.Object getResponseContent(p100l6.c cVar) {
        return getResponseContent$suspendImpl(this, cVar);
    }

    public final void setRequest(io.ktor.client.request.HttpRequest httpRequest) {
        kotlin.jvm.internal.m.e(httpRequest, "<set-?>");
        this.request = httpRequest;
    }

    public final void setRequest$ktor_client_core(io.ktor.client.request.HttpRequest request) {
        kotlin.jvm.internal.m.e(request, "request");
        setRequest(request);
    }

    public final void setResponse(io.ktor.client.statement.HttpResponse httpResponse) {
        kotlin.jvm.internal.m.e(httpResponse, "<set-?>");
        this.response = httpResponse;
    }

    public final void setResponse$ktor_client_core(io.ktor.client.statement.HttpResponse response) {
        kotlin.jvm.internal.m.e(response, "response");
        setResponse(response);
    }

    public java.lang.String toString() {
        return "HttpClientCall[" + getRequest().getUrl() + ", " + getResponse().getStatus() + ']';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @io.ktor.utils.io.InternalAPI
    public HttpClientCall(io.ktor.client.HttpClient client, io.ktor.client.request.HttpRequestData requestData, io.ktor.client.request.HttpResponseData responseData) {
        this(client);
        kotlin.jvm.internal.m.e(client, "client");
        kotlin.jvm.internal.m.e(requestData, "requestData");
        kotlin.jvm.internal.m.e(responseData, "responseData");
        setRequest(new io.ktor.client.request.DefaultHttpRequest(this, requestData));
        setResponse(new io.ktor.client.statement.DefaultHttpResponse(this, responseData));
        io.ktor.util.Attributes attributes = getAttributes();
        io.ktor.util.AttributeKey<java.lang.Object> attributeKey = CustomResponse;
        attributes.remove(attributeKey);
        if (responseData.getBody() instanceof io.ktor.utils.io.ByteReadChannel) {
            return;
        }
        getAttributes().put(attributeKey, responseData.getBody());
    }
}
