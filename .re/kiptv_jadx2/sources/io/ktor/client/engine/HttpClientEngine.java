package io.ktor.client.engine;

import E6.InterfaceC0331d;
import E6.v;
import S7.A;
import S7.AbstractC0906w;
import S7.C;
import S7.C0889g0;
import S7.G;
import S7.InterfaceC0891h0;
import Y6.f;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.utils.ClientEventsKt;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.utils.io.InternalAPI;
import java.io.Closeable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import p078i6.y;
import p100l6.h;
import p117n6.e;
import p117n6.i;
import p194x6.n;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000b\u0010!\u001a\u00020 8BX\u0082\u0004¨\u0006\""}, d2 = {"Lio/ktor/client/engine/HttpClientEngine;", "LS7/A;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/request/HttpRequestData;", "data", "Lio/ktor/client/request/HttpResponseData;", "execute", "(Lio/ktor/client/request/HttpRequestData;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/client/HttpClient;", "client", "Lh6/A;", "install", "(Lio/ktor/client/HttpClient;)V", "requestData", "executeWithinCallContext", "(Lio/ktor/client/request/HttpRequestData;)Lio/ktor/client/request/HttpResponseData;", "checkExtensions", "(Lio/ktor/client/request/HttpRequestData;)V", "LS7/w;", "getDispatcher", "()LS7/w;", "dispatcher", "Lio/ktor/client/engine/HttpClientEngineConfig;", "getConfig", "()Lio/ktor/client/engine/HttpClientEngineConfig;", "config", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "getSupportedCapabilities", "()Ljava/util/Set;", "supportedCapabilities", "", "closed", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface HttpClientEngine extends A, Closeable {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static void checkExtensions(HttpClientEngine httpClientEngine, HttpRequestData httpRequestData) {
            for (HttpClientEngineCapability<?> httpClientEngineCapability : httpRequestData.getRequiredCapabilities$ktor_client_core()) {
                if (!httpClientEngine.getSupportedCapabilities().contains(httpClientEngineCapability)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + httpClientEngineCapability).toString());
                }
            }
        }

        public static Object executeWithinCallContext(HttpClientEngine httpClientEngine, HttpRequestData httpRequestData, p100l6.c cVar) throws Throwable {
            HttpClientEngine$executeWithinCallContext$1 httpClientEngine$executeWithinCallContext$1;
            if (cVar instanceof HttpClientEngine$executeWithinCallContext$1) {
                httpClientEngine$executeWithinCallContext$1 = (HttpClientEngine$executeWithinCallContext$1) cVar;
                int i3 = httpClientEngine$executeWithinCallContext$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    httpClientEngine$executeWithinCallContext$1.label = i3 - Integer.MIN_VALUE;
                } else {
                    httpClientEngine$executeWithinCallContext$1 = new HttpClientEngine$executeWithinCallContext$1(cVar);
                }
            } else {
                httpClientEngine$executeWithinCallContext$1 = new HttpClientEngine$executeWithinCallContext$1(cVar);
            }
            Object objCreateCallContext = httpClientEngine$executeWithinCallContext$1.result;
            p109m6.a aVar = p109m6.a.f25430h;
            int i9 = httpClientEngine$executeWithinCallContext$1.label;
            if (i9 == 0) {
                P.u0(objCreateCallContext);
                InterfaceC0891h0 executionContext = httpRequestData.getExecutionContext();
                httpClientEngine$executeWithinCallContext$1.L$0 = httpClientEngine;
                httpClientEngine$executeWithinCallContext$1.L$1 = httpRequestData;
                httpClientEngine$executeWithinCallContext$1.label = 1;
                objCreateCallContext = HttpClientEngineKt.createCallContext(httpClientEngine, executionContext, httpClientEngine$executeWithinCallContext$1);
                if (objCreateCallContext != aVar) {
                }
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(objCreateCallContext);
                return objCreateCallContext;
            }
            httpRequestData = (HttpRequestData) httpClientEngine$executeWithinCallContext$1.L$1;
            httpClientEngine = (HttpClientEngine) httpClientEngine$executeWithinCallContext$1.L$0;
            P.u0(objCreateCallContext);
            h hVar = (h) objCreateCallContext;
            G gF = C.f(httpClientEngine, hVar.plus(new KtorCallContextElement(hVar)), new HttpClientEngine$executeWithinCallContext$2(httpClientEngine, httpRequestData, null), 2);
            httpClientEngine$executeWithinCallContext$1.L$0 = null;
            httpClientEngine$executeWithinCallContext$1.L$1 = null;
            httpClientEngine$executeWithinCallContext$1.label = 2;
            Object objK = gF.k(httpClientEngine$executeWithinCallContext$1);
            return objK == aVar ? aVar : objK;
        }

        public static boolean getClosed(HttpClientEngine httpClientEngine) {
            InterfaceC0891h0 interfaceC0891h0 = (InterfaceC0891h0) httpClientEngine.getCoroutineContext().get(C0889g0.f9584h);
            return !(interfaceC0891h0 != null ? interfaceC0891h0.isActive() : false);
        }

        public static Set<HttpClientEngineCapability<?>> getSupportedCapabilities(HttpClientEngine httpClientEngine) {
            return y.f23207h;
        }

        @InternalAPI
        public static void install(HttpClientEngine httpClientEngine, HttpClient client) {
            m.e(client, "client");
            client.getSendPipeline().intercept(HttpSendPipeline.INSTANCE.getEngine(), new AnonymousClass1(client, httpClientEngine, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content", "Lh6/A;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", l = {154, 166}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements n {
        final HttpClient $client;
        private Object L$0;
        Object L$1;
        int label;
        final HttpClientEngine this$0;

        public AnonymousClass1(HttpClient httpClient, HttpClientEngine httpClientEngine, p100l6.c cVar) {
            super(3, cVar);
            this.$client = httpClient;
            this.this$0 = httpClientEngine;
        }

        public static final p070h6.A invokeSuspend$lambda$2(HttpClient httpClient, HttpResponse httpResponse, Throwable th) {
            if (th != null) {
                httpClient.getMonitor().raise(ClientEventsKt.getHttpResponseCancelled(), httpResponse);
            }
            return p070h6.A.f22523a;
        }

        @Override
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, p100l6.c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$client, this.this$0, cVar);
            anonymousClass1.L$0 = pipelineContext;
            anonymousClass1.L$1 = obj;
            return anonymousClass1.invokeSuspend(p070h6.A.f22523a);
        }

        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            v vVarA;
            HttpRequestData httpRequestDataBuild;
            PipelineContext pipelineContext;
            v vVarA2;
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 == 1) {
                    httpRequestDataBuild = (HttpRequestData) this.L$1;
                    pipelineContext = (PipelineContext) this.L$0;
                    P.u0(obj);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    P.u0(obj);
                }
                return p070h6.A.f22523a;
            }
            P.u0(obj);
            PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
            Object obj2 = this.L$1;
            HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
            httpRequestBuilder.takeFromWithExecutionContext((HttpRequestBuilder) pipelineContext2.getContext());
            if (obj2 == null) {
                httpRequestBuilder.setBody(NullBody.INSTANCE);
                InterfaceC0331d interfaceC0331dB = B.f24540a.b(Object.class);
                try {
                    vVarA2 = B.a(Object.class);
                } catch (Throwable unused) {
                    vVarA2 = null;
                }
                f.s(interfaceC0331dB, vVarA2, httpRequestBuilder);
            } else if (obj2 instanceof OutgoingContent) {
                httpRequestBuilder.setBody(obj2);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(obj2);
                InterfaceC0331d interfaceC0331dB2 = B.f24540a.b(Object.class);
                try {
                    vVarA = B.a(Object.class);
                } catch (Throwable unused2) {
                    vVarA = null;
                }
                f.s(interfaceC0331dB2, vVarA, httpRequestBuilder);
            }
            this.$client.getMonitor().raise(ClientEventsKt.getHttpRequestIsReadyForSending(), httpRequestBuilder);
            httpRequestDataBuild = httpRequestBuilder.build();
            httpRequestDataBuild.getAttributes().put(HttpClientEngineKt.getCLIENT_CONFIG(), this.$client.getConfig$ktor_client_core());
            HttpClientEngineKt.validateHeaders(httpRequestDataBuild);
            DefaultImpls.checkExtensions(this.this$0, httpRequestDataBuild);
            HttpClientEngine httpClientEngine = this.this$0;
            this.L$0 = pipelineContext2;
            this.L$1 = httpRequestDataBuild;
            this.label = 1;
            Object objExecuteWithinCallContext = DefaultImpls.executeWithinCallContext(httpClientEngine, httpRequestDataBuild, this);
            if (objExecuteWithinCallContext != aVar) {
                pipelineContext = pipelineContext2;
                obj = objExecuteWithinCallContext;
            }
            return aVar;
            HttpClientCall httpClientCall = new HttpClientCall(this.$client, httpRequestDataBuild, (HttpResponseData) obj);
            HttpResponse response = httpClientCall.getResponse();
            this.$client.getMonitor().raise(ClientEventsKt.getHttpResponseReceived(), response);
            C.t(response.getCoroutineContext()).j(new a(this.$client, response, 0));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
    }

    @InternalAPI
    Object execute(HttpRequestData httpRequestData, p100l6.c cVar);

    HttpClientEngineConfig getConfig();

    @Override
    h getCoroutineContext();

    AbstractC0906w getDispatcher();

    Set<HttpClientEngineCapability<?>> getSupportedCapabilities();

    @InternalAPI
    void install(HttpClient client);
}
