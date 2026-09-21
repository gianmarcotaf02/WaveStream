package io.ktor.client;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB)\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u000b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u00002\u0016\u0010\u001a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010:\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010?\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010H\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010M\u001a\u00020L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lio/ktor/client/HttpClient;", "LS7/A;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/engine/HttpClientEngine;", "engine", "Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "userConfig", "<init>", "(Lio/ktor/client/engine/HttpClientEngine;Lio/ktor/client/HttpClientConfig;)V", "", "manageEngine", "(Lio/ktor/client/engine/HttpClientEngine;Lio/ktor/client/HttpClientConfig;Z)V", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/call/HttpClientCall;", "execute$ktor_client_core", "(Lio/ktor/client/request/HttpRequestBuilder;Ll6/c;)Ljava/lang/Object;", "execute", "Lio/ktor/client/engine/HttpClientEngineCapability;", "capability", "isSupported", "(Lio/ktor/client/engine/HttpClientEngineCapability;)Z", "Lkotlin/Function1;", "Lh6/A;", "block", "config", "(Lx6/j;)Lio/ktor/client/HttpClient;", "close", "()V", "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/engine/HttpClientEngine;", "getEngine", "()Lio/ktor/client/engine/HttpClientEngine;", "Lio/ktor/client/HttpClientConfig;", "Z", "LS7/r;", "clientJob", "LS7/r;", "Ll6/h;", "coroutineContext", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "Lio/ktor/client/request/HttpRequestPipeline;", "requestPipeline", "Lio/ktor/client/request/HttpRequestPipeline;", "getRequestPipeline", "()Lio/ktor/client/request/HttpRequestPipeline;", "Lio/ktor/client/statement/HttpResponsePipeline;", "responsePipeline", "Lio/ktor/client/statement/HttpResponsePipeline;", "getResponsePipeline", "()Lio/ktor/client/statement/HttpResponsePipeline;", "Lio/ktor/client/request/HttpSendPipeline;", "sendPipeline", "Lio/ktor/client/request/HttpSendPipeline;", "getSendPipeline", "()Lio/ktor/client/request/HttpSendPipeline;", "Lio/ktor/client/statement/HttpReceivePipeline;", "receivePipeline", "Lio/ktor/client/statement/HttpReceivePipeline;", "getReceivePipeline", "()Lio/ktor/client/statement/HttpReceivePipeline;", "Lio/ktor/util/Attributes;", "attributes", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "engineConfig", "Lio/ktor/client/engine/HttpClientEngineConfig;", "getEngineConfig", "()Lio/ktor/client/engine/HttpClientEngineConfig;", "Lio/ktor/events/Events;", "monitor", "Lio/ktor/events/Events;", "getMonitor", "()Lio/ktor/events/Events;", "getConfig$ktor_client_core", "()Lio/ktor/client/HttpClientConfig;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpClient implements S7.A, java.io.Closeable, java.lang.AutoCloseable {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater closed$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.client.HttpClient.class, "closed");
    private final io.ktor.util.Attributes attributes;
    private final S7.r clientJob;
    private volatile /* synthetic */ int closed;
    private final io.ktor.client.HttpClientConfig<io.ktor.client.engine.HttpClientEngineConfig> config;
    private final p100l6.h coroutineContext;
    private final io.ktor.client.engine.HttpClientEngine engine;
    private final io.ktor.client.engine.HttpClientEngineConfig engineConfig;
    private boolean manageEngine;
    private final io.ktor.events.Events monitor;
    private final io.ktor.client.statement.HttpReceivePipeline receivePipeline;
    private final io.ktor.client.request.HttpRequestPipeline requestPipeline;
    private final io.ktor.client.statement.HttpResponsePipeline responsePipeline;
    private final io.ktor.client.request.HttpSendPipeline sendPipeline;
    private final io.ktor.client.HttpClientConfig<? extends io.ktor.client.engine.HttpClientEngineConfig> userConfig;

    /* JADX INFO: renamed from: io.ktor.client.HttpClient$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "call", "Lh6/A;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", l = {1367, 1369}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p117n6.i implements p194x6.n {
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        int label;

        public AnonymousClass2(p100l6.c cVar) {
            super(3, cVar);
        }

        @Override // p194x6.n
        public final java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, java.lang.Object obj, p100l6.c cVar) {
            io.ktor.client.HttpClient.AnonymousClass2 anonymousClass2 = io.ktor.client.HttpClient.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = pipelineContext;
            anonymousClass2.L$1 = obj;
            return anonymousClass2.invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object obj2;
            io.ktor.util.pipeline.PipelineContext pipelineContext;
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            p070h6.A a2 = p070h6.A.f22523a;
            if (i3 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                io.ktor.util.pipeline.PipelineContext pipelineContext2 = (io.ktor.util.pipeline.PipelineContext) this.L$0;
                obj2 = this.L$1;
                if (!(obj2 instanceof io.ktor.client.call.HttpClientCall)) {
                    throw new java.lang.IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + kotlin.jvm.internal.B.f24540a.b(obj2.getClass()) + ").").toString());
                }
                io.ktor.client.statement.HttpReceivePipeline receivePipeline = io.ktor.client.HttpClient.this.getReceivePipeline();
                io.ktor.client.statement.HttpResponse response = ((io.ktor.client.call.HttpClientCall) obj2).getResponse();
                this.L$0 = pipelineContext2;
                this.L$1 = obj2;
                this.label = 1;
                java.lang.Object objExecute = receivePipeline.execute(a2, response, this);
                if (objExecute != aVar) {
                    pipelineContext = pipelineContext2;
                    obj = objExecute;
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                return a2;
            }
            obj2 = this.L$1;
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.L$0;
            com.google.common.util.concurrent.P.u0(obj);
            ((io.ktor.client.call.HttpClientCall) obj2).setResponse$ktor_client_core((io.ktor.client.statement.HttpResponse) obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            return pipelineContext.proceedWith(obj2, this) == aVar ? aVar : a2;
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.HttpClient$4, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it", "Lh6/A;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponseContainer;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", l = {1401}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends p117n6.i implements p194x6.n {
        private /* synthetic */ java.lang.Object L$0;
        int label;

        public AnonymousClass4(p100l6.c cVar) {
            super(3, cVar);
        }

        @Override // p194x6.n
        public final java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall> pipelineContext, io.ktor.client.statement.HttpResponseContainer httpResponseContainer, p100l6.c cVar) {
            io.ktor.client.HttpClient.AnonymousClass4 anonymousClass4 = io.ktor.client.HttpClient.this.new AnonymousClass4(cVar);
            anonymousClass4.L$0 = pipelineContext;
            return anonymousClass4.invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            io.ktor.util.pipeline.PipelineContext pipelineContext;
            java.lang.Throwable th;
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                io.ktor.util.pipeline.PipelineContext pipelineContext2 = (io.ktor.util.pipeline.PipelineContext) this.L$0;
                try {
                    this.L$0 = pipelineContext2;
                    this.label = 1;
                    java.lang.Object objProceed = pipelineContext2.proceed(this);
                    if (objProceed == aVar) {
                        return aVar;
                    }
                    pipelineContext = pipelineContext2;
                    obj = objProceed;
                } catch (java.lang.Throwable th2) {
                    pipelineContext = pipelineContext2;
                    th = th2;
                    io.ktor.client.HttpClient.this.getMonitor().raise(io.ktor.client.utils.ClientEventsKt.getHttpResponseReceiveFailed(), new io.ktor.client.utils.HttpResponseReceiveFail(((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getResponse(), th));
                    throw th;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.L$0;
                try {
                    com.google.common.util.concurrent.P.u0(obj);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    io.ktor.client.HttpClient.this.getMonitor().raise(io.ktor.client.utils.ClientEventsKt.getHttpResponseReceiveFailed(), new io.ktor.client.utils.HttpResponseReceiveFail(((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getResponse(), th));
                    throw th;
                }
            }
            return p070h6.A.f22523a;
        }
    }

    public HttpClient(io.ktor.client.engine.HttpClientEngine engine, io.ktor.client.HttpClientConfig<? extends io.ktor.client.engine.HttpClientEngineConfig> userConfig) {
        kotlin.jvm.internal.m.e(engine, "engine");
        kotlin.jvm.internal.m.e(userConfig, "userConfig");
        this.engine = engine;
        this.userConfig = userConfig;
        boolean z6 = false;
        this.closed = 0;
        S7.j0 j0Var = new S7.j0((S7.InterfaceC0891h0) engine.getCoroutineContext().get(S7.C0889g0.f9584h));
        this.clientJob = j0Var;
        this.coroutineContext = engine.getCoroutineContext().plus(j0Var);
        int i3 = 1;
        kotlin.jvm.internal.AbstractC2541f abstractC2541f = null;
        this.requestPipeline = new io.ktor.client.request.HttpRequestPipeline(z6, i3, abstractC2541f);
        io.ktor.client.statement.HttpResponsePipeline httpResponsePipeline = new io.ktor.client.statement.HttpResponsePipeline(z6, i3, abstractC2541f);
        this.responsePipeline = httpResponsePipeline;
        io.ktor.client.request.HttpSendPipeline httpSendPipeline = new io.ktor.client.request.HttpSendPipeline(z6, i3, abstractC2541f);
        this.sendPipeline = httpSendPipeline;
        this.receivePipeline = new io.ktor.client.statement.HttpReceivePipeline(z6, i3, abstractC2541f);
        this.attributes = io.ktor.util.AttributesJvmKt.Attributes(true);
        this.engineConfig = engine.getConfig();
        this.monitor = new io.ktor.events.Events();
        io.ktor.client.HttpClientConfig<io.ktor.client.engine.HttpClientEngineConfig> httpClientConfig = new io.ktor.client.HttpClientConfig<>();
        this.config = httpClientConfig;
        if (this.manageEngine) {
            j0Var.j(new p078i6.C2255f(3, this));
        }
        engine.install(this);
        httpSendPipeline.intercept(io.ktor.client.request.HttpSendPipeline.INSTANCE.getReceive(), new io.ktor.client.HttpClient.AnonymousClass2(null));
        io.ktor.client.HttpClientConfig.install$default(httpClientConfig, io.ktor.client.plugins.HttpRequestLifecycleKt.getHttpRequestLifecycle(), null, 2, null);
        io.ktor.client.HttpClientConfig.install$default(httpClientConfig, io.ktor.client.plugins.BodyProgressKt.getBodyProgress(), null, 2, null);
        io.ktor.client.HttpClientConfig.install$default(httpClientConfig, io.ktor.client.plugins.DoubleReceivePluginKt.getSaveBodyPlugin(), null, 2, null);
        if (userConfig.getUseDefaultTransformers()) {
            httpClientConfig.install("DefaultTransformers", new io.github.jan.supabase.storage.f(26));
        }
        io.ktor.client.HttpClientConfig.install$default(httpClientConfig, io.ktor.client.plugins.HttpSend.INSTANCE, null, 2, null);
        io.ktor.client.HttpClientConfig.install$default(httpClientConfig, io.ktor.client.plugins.HttpCallValidatorKt.getHttpCallValidator(), null, 2, null);
        if (userConfig.getFollowRedirects()) {
            io.ktor.client.HttpClientConfig.install$default(httpClientConfig, io.ktor.client.plugins.HttpRedirectKt.getHttpRedirect(), null, 2, null);
        }
        httpClientConfig.plusAssign(userConfig);
        if (userConfig.getUseDefaultTransformers()) {
            io.ktor.client.HttpClientConfig.install$default(httpClientConfig, io.ktor.client.plugins.HttpPlainTextKt.getHttpPlainText(), null, 2, null);
        }
        io.ktor.client.plugins.DefaultResponseValidationKt.addDefaultResponseValidation(httpClientConfig);
        httpClientConfig.install(this);
        httpResponsePipeline.intercept(io.ktor.client.statement.HttpResponsePipeline.INSTANCE.getReceive(), new io.ktor.client.HttpClient.AnonymousClass4(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A _init_$lambda$0(io.ktor.client.HttpClient httpClient, java.lang.Throwable th) {
        if (th != null) {
            S7.C.i(httpClient.engine, null);
        }
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A lambda$2$lambda$1(io.ktor.client.HttpClient install) {
        kotlin.jvm.internal.m.e(install, "$this$install");
        io.ktor.client.plugins.DefaultTransformKt.defaultTransformers(install);
        return p070h6.A.f22523a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        boolean zIsTerminated;
        if (closed$FU.compareAndSet(this, 0, 1)) {
            io.ktor.util.Attributes attributes = (io.ktor.util.Attributes) this.attributes.get(io.ktor.client.plugins.HttpClientPluginKt.getPLUGIN_INSTALLED_LIST());
            java.util.Iterator<T> it = attributes.getAllKeys().iterator();
            while (it.hasNext()) {
                io.ktor.util.AttributeKey attributeKey = (io.ktor.util.AttributeKey) it.next();
                kotlin.jvm.internal.m.c(attributeKey, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                java.lang.Object obj = attributes.get(attributeKey);
                if (obj instanceof java.lang.AutoCloseable) {
                    java.lang.AutoCloseable autoCloseable = (java.lang.AutoCloseable) obj;
                    if (autoCloseable instanceof java.lang.AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof java.util.concurrent.ExecutorService) {
                        java.util.concurrent.ExecutorService executorService = (java.util.concurrent.ExecutorService) autoCloseable;
                        if (executorService != java.util.concurrent.ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            boolean z6 = false;
                            while (!zIsTerminated) {
                                try {
                                    zIsTerminated = executorService.awaitTermination(1L, java.util.concurrent.TimeUnit.DAYS);
                                } catch (java.lang.InterruptedException unused) {
                                    if (!z6) {
                                        executorService.shutdownNow();
                                        z6 = true;
                                    }
                                }
                            }
                            if (z6) {
                                java.lang.Thread.currentThread().interrupt();
                            }
                        }
                    } else if (autoCloseable instanceof android.content.res.TypedArray) {
                        ((android.content.res.TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof android.media.MediaMetadataRetriever) {
                        ((android.media.MediaMetadataRetriever) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof android.media.MediaDrm)) {
                            throw new java.lang.IllegalArgumentException();
                        }
                        ((android.media.MediaDrm) autoCloseable).release();
                    }
                }
            }
            ((S7.j0) this.clientJob).Z();
            if (this.manageEngine) {
                this.engine.close();
            }
        }
    }

    public final io.ktor.client.HttpClient config(p194x6.j block) {
        kotlin.jvm.internal.m.e(block, "block");
        io.ktor.client.engine.HttpClientEngine httpClientEngine = this.engine;
        io.ktor.client.HttpClientConfig httpClientConfig = new io.ktor.client.HttpClientConfig();
        httpClientConfig.plusAssign(this.userConfig);
        block.invoke(httpClientConfig);
        return new io.ktor.client.HttpClient(httpClientEngine, httpClientConfig, this.manageEngine);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object execute$ktor_client_core(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, p100l6.c cVar) {
        io.ktor.client.HttpClient$execute$1 httpClient$execute$1;
        if (cVar instanceof io.ktor.client.HttpClient$execute$1) {
            httpClient$execute$1 = (io.ktor.client.HttpClient$execute$1) cVar;
            int i3 = httpClient$execute$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                httpClient$execute$1.label = i3 - Integer.MIN_VALUE;
            } else {
                httpClient$execute$1 = new io.ktor.client.HttpClient$execute$1(this, cVar);
            }
        } else {
            httpClient$execute$1 = new io.ktor.client.HttpClient$execute$1(this, cVar);
        }
        java.lang.Object objExecute = httpClient$execute$1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = httpClient$execute$1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objExecute);
            this.monitor.raise(io.ktor.client.utils.ClientEventsKt.getHttpRequestCreated(), httpRequestBuilder);
            io.ktor.client.request.HttpRequestPipeline httpRequestPipeline = this.requestPipeline;
            java.lang.Object body = httpRequestBuilder.getBody();
            httpClient$execute$1.label = 1;
            objExecute = httpRequestPipeline.execute(httpRequestBuilder, body, httpClient$execute$1);
            if (objExecute == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objExecute);
        }
        kotlin.jvm.internal.m.c(objExecute, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (io.ktor.client.call.HttpClientCall) objExecute;
    }

    public final io.ktor.util.Attributes getAttributes() {
        return this.attributes;
    }

    public final io.ktor.client.HttpClientConfig<io.ktor.client.engine.HttpClientEngineConfig> getConfig$ktor_client_core() {
        return this.config;
    }

    @Override // S7.A
    public p100l6.h getCoroutineContext() {
        return this.coroutineContext;
    }

    public final io.ktor.client.engine.HttpClientEngine getEngine() {
        return this.engine;
    }

    public final io.ktor.client.engine.HttpClientEngineConfig getEngineConfig() {
        return this.engineConfig;
    }

    public final io.ktor.events.Events getMonitor() {
        return this.monitor;
    }

    public final io.ktor.client.statement.HttpReceivePipeline getReceivePipeline() {
        return this.receivePipeline;
    }

    public final io.ktor.client.request.HttpRequestPipeline getRequestPipeline() {
        return this.requestPipeline;
    }

    public final io.ktor.client.statement.HttpResponsePipeline getResponsePipeline() {
        return this.responsePipeline;
    }

    public final io.ktor.client.request.HttpSendPipeline getSendPipeline() {
        return this.sendPipeline;
    }

    public final boolean isSupported(io.ktor.client.engine.HttpClientEngineCapability<?> capability) {
        kotlin.jvm.internal.m.e(capability, "capability");
        return this.engine.getSupportedCapabilities().contains(capability);
    }

    public java.lang.String toString() {
        return "HttpClient[" + this.engine + ']';
    }

    public /* synthetic */ HttpClient(io.ktor.client.engine.HttpClientEngine httpClientEngine, io.ktor.client.HttpClientConfig httpClientConfig, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(httpClientEngine, (i3 & 2) != 0 ? new io.ktor.client.HttpClientConfig() : httpClientConfig);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpClient(io.ktor.client.engine.HttpClientEngine engine, io.ktor.client.HttpClientConfig<? extends io.ktor.client.engine.HttpClientEngineConfig> userConfig, boolean z6) {
        this(engine, userConfig);
        kotlin.jvm.internal.m.e(engine, "engine");
        kotlin.jvm.internal.m.e(userConfig, "userConfig");
        this.manageEngine = z6;
    }
}
