package io.ktor.client.engine;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000b\u0010!\u001a\u00020 8BX\u0082\u0004¨\u0006\""}, d2 = {"Lio/ktor/client/engine/HttpClientEngine;", "LS7/A;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/request/HttpRequestData;", "data", "Lio/ktor/client/request/HttpResponseData;", "execute", "(Lio/ktor/client/request/HttpRequestData;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/client/HttpClient;", "client", "Lh6/A;", "install", "(Lio/ktor/client/HttpClient;)V", "requestData", "executeWithinCallContext", "(Lio/ktor/client/request/HttpRequestData;)Lio/ktor/client/request/HttpResponseData;", "checkExtensions", "(Lio/ktor/client/request/HttpRequestData;)V", "LS7/w;", "getDispatcher", "()LS7/w;", "dispatcher", "Lio/ktor/client/engine/HttpClientEngineConfig;", "getConfig", "()Lio/ktor/client/engine/HttpClientEngineConfig;", "config", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "getSupportedCapabilities", "()Ljava/util/Set;", "supportedCapabilities", "", "closed", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface HttpClientEngine extends S7.A, java.io.Closeable {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        /* JADX INFO: Access modifiers changed from: private */
        public static void checkExtensions(io.ktor.client.engine.HttpClientEngine httpClientEngine, io.ktor.client.request.HttpRequestData httpRequestData) {
            for (io.ktor.client.engine.HttpClientEngineCapability<?> httpClientEngineCapability : httpRequestData.getRequiredCapabilities$ktor_client_core()) {
                if (!httpClientEngine.getSupportedCapabilities().contains(httpClientEngineCapability)) {
                    throw new java.lang.IllegalArgumentException(("Engine doesn't support " + httpClientEngineCapability).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static java.lang.Object executeWithinCallContext(io.ktor.client.engine.HttpClientEngine httpClientEngine, io.ktor.client.request.HttpRequestData httpRequestData, p100l6.c cVar) throws java.lang.Throwable {
            io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1 httpClientEngine$executeWithinCallContext$1;
            if (cVar instanceof io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1) {
                httpClientEngine$executeWithinCallContext$1 = (io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1) cVar;
                int i3 = httpClientEngine$executeWithinCallContext$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    httpClientEngine$executeWithinCallContext$1.label = i3 - Integer.MIN_VALUE;
                } else {
                    httpClientEngine$executeWithinCallContext$1 = new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1(cVar);
                }
            } else {
                httpClientEngine$executeWithinCallContext$1 = new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1(cVar);
            }
            java.lang.Object objCreateCallContext = httpClientEngine$executeWithinCallContext$1.result;
            p109m6.a aVar = p109m6.a.f25430h;
            int i9 = httpClientEngine$executeWithinCallContext$1.label;
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objCreateCallContext);
                S7.InterfaceC0891h0 executionContext = httpRequestData.getExecutionContext();
                httpClientEngine$executeWithinCallContext$1.L$0 = httpClientEngine;
                httpClientEngine$executeWithinCallContext$1.L$1 = httpRequestData;
                httpClientEngine$executeWithinCallContext$1.label = 1;
                objCreateCallContext = io.ktor.client.engine.HttpClientEngineKt.createCallContext(httpClientEngine, executionContext, httpClientEngine$executeWithinCallContext$1);
                if (objCreateCallContext != aVar) {
                }
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objCreateCallContext);
                return objCreateCallContext;
            }
            httpRequestData = (io.ktor.client.request.HttpRequestData) httpClientEngine$executeWithinCallContext$1.L$1;
            httpClientEngine = (io.ktor.client.engine.HttpClientEngine) httpClientEngine$executeWithinCallContext$1.L$0;
            com.google.common.util.concurrent.P.u0(objCreateCallContext);
            p100l6.h hVar = (p100l6.h) objCreateCallContext;
            S7.G gF = S7.C.f(httpClientEngine, hVar.plus(new io.ktor.client.engine.KtorCallContextElement(hVar)), new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2(httpClientEngine, httpRequestData, null), 2);
            httpClientEngine$executeWithinCallContext$1.L$0 = null;
            httpClientEngine$executeWithinCallContext$1.L$1 = null;
            httpClientEngine$executeWithinCallContext$1.label = 2;
            java.lang.Object objK = gF.k(httpClientEngine$executeWithinCallContext$1);
            return objK == aVar ? aVar : objK;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean getClosed(io.ktor.client.engine.HttpClientEngine httpClientEngine) {
            S7.InterfaceC0891h0 interfaceC0891h0 = (S7.InterfaceC0891h0) httpClientEngine.getCoroutineContext().get(S7.C0889g0.f9584h);
            return !(interfaceC0891h0 != null ? interfaceC0891h0.isActive() : false);
        }

        public static java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> getSupportedCapabilities(io.ktor.client.engine.HttpClientEngine httpClientEngine) {
            return p078i6.y.f23207h;
        }

        @io.ktor.utils.io.InternalAPI
        public static void install(io.ktor.client.engine.HttpClientEngine httpClientEngine, io.ktor.client.HttpClient client) {
            kotlin.jvm.internal.m.e(client, "client");
            client.getSendPipeline().intercept(io.ktor.client.request.HttpSendPipeline.INSTANCE.getEngine(), new io.ktor.client.engine.HttpClientEngine.AnonymousClass1(client, httpClientEngine, null));
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.HttpClientEngine$install$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content", "Lh6/A;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", l = {154, 166}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p117n6.i implements p194x6.n {
        final /* synthetic */ io.ktor.client.HttpClient $client;
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        int label;
        final /* synthetic */ io.ktor.client.engine.HttpClientEngine this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(io.ktor.client.HttpClient httpClient, io.ktor.client.engine.HttpClientEngine httpClientEngine, p100l6.c cVar) {
            super(3, cVar);
            this.$client = httpClient;
            this.this$0 = httpClientEngine;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p070h6.A invokeSuspend$lambda$2(io.ktor.client.HttpClient httpClient, io.ktor.client.statement.HttpResponse httpResponse, java.lang.Throwable th) {
            if (th != null) {
                httpClient.getMonitor().raise(io.ktor.client.utils.ClientEventsKt.getHttpResponseCancelled(), httpResponse);
            }
            return p070h6.A.f22523a;
        }

        @Override // p194x6.n
        public final java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, java.lang.Object obj, p100l6.c cVar) {
            io.ktor.client.engine.HttpClientEngine.AnonymousClass1 anonymousClass1 = new io.ktor.client.engine.HttpClientEngine.AnonymousClass1(this.$client, this.this$0, cVar);
            anonymousClass1.L$0 = pipelineContext;
            anonymousClass1.L$1 = obj;
            return anonymousClass1.invokeSuspend(p070h6.A.f22523a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
        
            if (r3.proceedWith(r5, r10) == r0) goto L31;
         */
        @Override // p117n6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            E6.v vVarA;
            io.ktor.client.request.HttpRequestData httpRequestDataBuild;
            io.ktor.util.pipeline.PipelineContext pipelineContext;
            E6.v vVarA2;
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 == 1) {
                    httpRequestDataBuild = (io.ktor.client.request.HttpRequestData) this.L$1;
                    pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.L$0;
                    com.google.common.util.concurrent.P.u0(obj);
                } else {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                }
                return p070h6.A.f22523a;
            }
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext2 = (io.ktor.util.pipeline.PipelineContext) this.L$0;
            java.lang.Object obj2 = this.L$1;
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
            httpRequestBuilder.takeFromWithExecutionContext((io.ktor.client.request.HttpRequestBuilder) pipelineContext2.getContext());
            if (obj2 == null) {
                httpRequestBuilder.setBody(io.ktor.http.content.NullBody.INSTANCE);
                E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(java.lang.Object.class);
                try {
                    vVarA2 = kotlin.jvm.internal.B.a(java.lang.Object.class);
                } catch (java.lang.Throwable unused) {
                    vVarA2 = null;
                }
                Y6.f.s(interfaceC0331dB, vVarA2, httpRequestBuilder);
            } else if (obj2 instanceof io.ktor.http.content.OutgoingContent) {
                httpRequestBuilder.setBody(obj2);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(obj2);
                E6.InterfaceC0331d interfaceC0331dB2 = kotlin.jvm.internal.B.f24540a.b(java.lang.Object.class);
                try {
                    vVarA = kotlin.jvm.internal.B.a(java.lang.Object.class);
                } catch (java.lang.Throwable unused2) {
                    vVarA = null;
                }
                Y6.f.s(interfaceC0331dB2, vVarA, httpRequestBuilder);
            }
            this.$client.getMonitor().raise(io.ktor.client.utils.ClientEventsKt.getHttpRequestIsReadyForSending(), httpRequestBuilder);
            httpRequestDataBuild = httpRequestBuilder.build();
            httpRequestDataBuild.getAttributes().put(io.ktor.client.engine.HttpClientEngineKt.getCLIENT_CONFIG(), this.$client.getConfig$ktor_client_core());
            io.ktor.client.engine.HttpClientEngineKt.validateHeaders(httpRequestDataBuild);
            io.ktor.client.engine.HttpClientEngine.DefaultImpls.checkExtensions(this.this$0, httpRequestDataBuild);
            io.ktor.client.engine.HttpClientEngine httpClientEngine = this.this$0;
            this.L$0 = pipelineContext2;
            this.L$1 = httpRequestDataBuild;
            this.label = 1;
            java.lang.Object objExecuteWithinCallContext = io.ktor.client.engine.HttpClientEngine.DefaultImpls.executeWithinCallContext(httpClientEngine, httpRequestDataBuild, this);
            if (objExecuteWithinCallContext != aVar) {
                pipelineContext = pipelineContext2;
                obj = objExecuteWithinCallContext;
            }
            return aVar;
            io.ktor.client.call.HttpClientCall httpClientCall = new io.ktor.client.call.HttpClientCall(this.$client, httpRequestDataBuild, (io.ktor.client.request.HttpResponseData) obj);
            io.ktor.client.statement.HttpResponse response = httpClientCall.getResponse();
            this.$client.getMonitor().raise(io.ktor.client.utils.ClientEventsKt.getHttpResponseReceived(), response);
            S7.C.t(response.getCoroutineContext()).j(new io.ktor.client.engine.a(this.$client, response, 0));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
    }

    @io.ktor.utils.io.InternalAPI
    java.lang.Object execute(io.ktor.client.request.HttpRequestData httpRequestData, p100l6.c cVar);

    io.ktor.client.engine.HttpClientEngineConfig getConfig();

    @Override // S7.A
    /* synthetic */ p100l6.h getCoroutineContext();

    S7.AbstractC0906w getDispatcher();

    java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> getSupportedCapabilities();

    @io.ktor.utils.io.InternalAPI
    void install(io.ktor.client.HttpClient client);
}
