package io.ktor.client.call;

import E6.InterfaceC0331d;
import E6.v;
import S7.A;
import S7.C;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.util.concurrent.P;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.DoubleReceivePluginKt;
import io.ktor.client.request.DefaultHttpRequest;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.statement.DefaultHttpResponse;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.content.NullBody;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.InternalAPI;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.Response;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import p100l6.h;
import p109m6.a;
import p117n6.c;
import p117n6.e;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 92\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0094@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R*\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d8\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(\"\u0004\b!\u0010 R*\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00178\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\"\u0004\b\u001c\u0010\u001bR\u001a\u0010-\u001a\u00020,8\u0014X\u0094D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lio/ktor/client/call/HttpClientCall;", "LS7/A;", "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lio/ktor/client/HttpClient;)V", "Lio/ktor/client/request/HttpRequestData;", "requestData", "Lio/ktor/client/request/HttpResponseData;", "responseData", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestData;Lio/ktor/client/request/HttpResponseData;)V", "Lio/ktor/utils/io/ByteReadChannel;", "getResponseContent", "(Ll6/c;)Ljava/lang/Object;", "Lio/ktor/util/reflect/TypeInfo;", "info", "", "bodyNullable", "(Lio/ktor/util/reflect/TypeInfo;Ll6/c;)Ljava/lang/Object;", TtmlNode.TAG_BODY, "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/statement/HttpResponse;", Response.TYPE, "Lh6/A;", "setResponse$ktor_client_core", "(Lio/ktor/client/statement/HttpResponse;)V", "setResponse", "Lio/ktor/client/request/HttpRequest;", SentryBaseEvent.JsonKeys.REQUEST, "setRequest$ktor_client_core", "(Lio/ktor/client/request/HttpRequest;)V", "setRequest", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "value", "Lio/ktor/client/request/HttpRequest;", "getRequest", "()Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "", "allowDoubleReceive", "Z", "getAllowDoubleReceive", "()Z", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "coroutineContext", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "attributes", "Companion", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class HttpClientCall implements A {
    private static final AttributeKey<Object> CustomResponse;
    private static final AtomicIntegerFieldUpdater received$FU;
    private final boolean allowDoubleReceive;
    private final HttpClient client;
    private volatile int received;
    protected HttpRequest request;
    protected HttpResponse response;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", l = {125}, m = TtmlNode.TAG_BODY)
    public static final class AnonymousClass1 extends c {
        int label;
        Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientCall.this.body(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", l = {96, 99}, m = "bodyNullable")
    public static final class C23511 extends c {
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public C23511(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientCall.this.bodyNullable(null, this);
        }
    }

    static {
        v vVarA = null;
        InterfaceC0331d interfaceC0331dB = B.f24540a.b(Object.class);
        try {
            vVarA = B.a(Object.class);
        } catch (Throwable unused) {
        }
        CustomResponse = new AttributeKey<>("CustomResponse", new TypeInfo(interfaceC0331dB, vVarA));
        received$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientCall.class, "received");
    }

    public HttpClientCall(HttpClient client) {
        m.e(client, "client");
        this.client = client;
        this.received = 0;
    }

    public static Object getResponseContent$suspendImpl(HttpClientCall httpClientCall, p100l6.c cVar) {
        return httpClientCall.getResponse().getRawContent();
    }

    public final Object body(TypeInfo typeInfo, p100l6.c cVar) {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objBodyNullable = anonymousClass1.result;
        Object obj = a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            P.u0(objBodyNullable);
            anonymousClass1.label = 1;
            objBodyNullable = bodyNullable(typeInfo, anonymousClass1);
            if (objBodyNullable == obj) {
                return obj;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(objBodyNullable);
        }
        m.b(objBodyNullable);
        return objBodyNullable;
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bodyNullable(TypeInfo typeInfo, p100l6.c cVar) {
        C23511 c23511;
        HttpClientCall httpClientCall;
        HttpClientCall httpClientCall2;
        Object response;
        if (cVar instanceof C23511) {
            c23511 = (C23511) cVar;
            int i3 = c23511.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23511.label = i3 - Integer.MIN_VALUE;
            } else {
                c23511 = new C23511(cVar);
            }
        } else {
            c23511 = new C23511(cVar);
        }
        Object orNull = c23511.result;
        a aVar = a.f25430h;
        int i9 = c23511.label;
        if (i9 == 0) {
            P.u0(orNull);
            try {
                if (TypeInfoJvmKt.instanceOf(getResponse(), typeInfo.getType())) {
                    return getResponse();
                }
                if (!getAllowDoubleReceive() && !DoubleReceivePluginKt.isSaved(getResponse()) && !received$FU.compareAndSet(this, 0, 1)) {
                    throw new DoubleReceiveException(this);
                }
                orNull = getAttributes().getOrNull(CustomResponse);
                if (orNull == null) {
                    c23511.L$0 = this;
                    c23511.L$1 = typeInfo;
                    c23511.label = 1;
                    orNull = getResponseContent(c23511);
                }
                httpClientCall2 = this;
            } catch (Throwable th) {
                th = th;
                httpClientCall = this;
                C.i(httpClientCall.getResponse(), C.a("Receive failed", th));
                throw th;
            }
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                typeInfo = (TypeInfo) c23511.L$1;
                httpClientCall = (HttpClientCall) c23511.L$0;
                try {
                    P.u0(orNull);
                    response = ((HttpResponseContainer) orNull).getResponse();
                    if (!m.a(response, NullBody.INSTANCE)) {
                        response = null;
                    }
                    if (response != null && !TypeInfoJvmKt.instanceOf(response, typeInfo.getType())) {
                        throw new NoTransformationFoundException(httpClientCall.getResponse(), B.f24540a.b(response.getClass()), typeInfo.getType());
                    }
                    return response;
                } catch (Throwable th2) {
                    th = th2;
                    C.i(httpClientCall.getResponse(), C.a("Receive failed", th));
                    throw th;
                }
            }
            typeInfo = (TypeInfo) c23511.L$1;
            httpClientCall2 = (HttpClientCall) c23511.L$0;
            try {
                P.u0(orNull);
            } catch (Throwable th3) {
                th = th3;
                httpClientCall = httpClientCall2;
                C.i(httpClientCall.getResponse(), C.a("Receive failed", th));
                throw th;
            }
        }
        HttpResponseContainer httpResponseContainer = new HttpResponseContainer(typeInfo, orNull);
        HttpResponsePipeline responsePipeline = httpClientCall2.client.getResponsePipeline();
        c23511.L$0 = httpClientCall2;
        c23511.L$1 = typeInfo;
        c23511.label = 2;
        orNull = responsePipeline.execute(httpClientCall2, httpResponseContainer, c23511);
        if (orNull != aVar) {
            httpClientCall = httpClientCall2;
            response = ((HttpResponseContainer) orNull).getResponse();
            if (!m.a(response, NullBody.INSTANCE)) {
                response = null;
            }
            if (response != null) {
                throw new NoTransformationFoundException(httpClientCall.getResponse(), B.f24540a.b(response.getClass()), typeInfo.getType());
            }
            return response;
        }
        return aVar;
    }

    public boolean getAllowDoubleReceive() {
        return this.allowDoubleReceive;
    }

    public final Attributes getAttributes() {
        return getRequest().getAttributes();
    }

    public final HttpClient getClient() {
        return this.client;
    }

    @Override
    public h getCoroutineContext() {
        return getResponse().getCoroutineContext();
    }

    public final HttpRequest getRequest() {
        HttpRequest httpRequest = this.request;
        if (httpRequest != null) {
            return httpRequest;
        }
        m.k(SentryBaseEvent.JsonKeys.REQUEST);
        throw null;
    }

    public final HttpResponse getResponse() {
        HttpResponse httpResponse = this.response;
        if (httpResponse != null) {
            return httpResponse;
        }
        m.k(Response.TYPE);
        throw null;
    }

    public Object getResponseContent(p100l6.c cVar) {
        return getResponseContent$suspendImpl(this, cVar);
    }

    public final void setRequest(HttpRequest httpRequest) {
        m.e(httpRequest, "<set-?>");
        this.request = httpRequest;
    }

    public final void setRequest$ktor_client_core(HttpRequest request) {
        m.e(request, "request");
        setRequest(request);
    }

    public final void setResponse(HttpResponse httpResponse) {
        m.e(httpResponse, "<set-?>");
        this.response = httpResponse;
    }

    public final void setResponse$ktor_client_core(HttpResponse response) {
        m.e(response, "response");
        setResponse(response);
    }

    public String toString() {
        return "HttpClientCall[" + getRequest().getUrl() + ", " + getResponse().getStatus() + ']';
    }

    @InternalAPI
    public HttpClientCall(HttpClient client, HttpRequestData requestData, HttpResponseData responseData) {
        this(client);
        m.e(client, "client");
        m.e(requestData, "requestData");
        m.e(responseData, "responseData");
        setRequest(new DefaultHttpRequest(this, requestData));
        setResponse(new DefaultHttpResponse(this, responseData));
        Attributes attributes = getAttributes();
        AttributeKey<Object> attributeKey = CustomResponse;
        attributes.remove(attributeKey);
        if (responseData.getBody() instanceof ByteReadChannel) {
            return;
        }
        getAttributes().put(attributeKey, responseData.getBody());
    }
}
