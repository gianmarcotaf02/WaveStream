package io.ktor.client.engine.okhttp;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0004\u0018\u0000 72\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000f\u0010\u000eJ0\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0010H\u0096@¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R$\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00101\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b2\u00103R\"\u00105\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u0006048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpEngine;", "Lio/ktor/client/engine/HttpClientEngineBase;", "Lio/ktor/client/engine/okhttp/OkHttpConfig;", "config", "<init>", "(Lio/ktor/client/engine/okhttp/OkHttpConfig;)V", "Lw8/s;", "engine", "Lw8/v;", "engineRequest", "Ll6/h;", "callContext", "Lio/ktor/client/request/HttpResponseData;", "executeWebSocketRequest", "(Lw8/s;Lw8/v;Ll6/h;Ll6/c;)Ljava/lang/Object;", "executeServerSendEventsRequest", "Lio/ktor/client/request/HttpRequestData;", "requestData", "executeHttpRequest", "(Lw8/s;Lw8/v;Ll6/h;Lio/ktor/client/request/HttpRequestData;Ll6/c;)Ljava/lang/Object;", "Lw8/B;", io.sentry.protocol.Response.TYPE, "Lio/ktor/util/date/GMTDate;", "requestTime", "", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "buildResponseData", "(Lw8/B;Lio/ktor/util/date/GMTDate;Ljava/lang/Object;Ll6/h;)Lio/ktor/client/request/HttpResponseData;", "Lio/ktor/client/plugins/HttpTimeoutConfig;", "timeoutExtension", "createOkHttpClient", "(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lw8/s;", "data", "execute", "(Lio/ktor/client/request/HttpRequestData;Ll6/c;)Ljava/lang/Object;", "Lh6/A;", "close", "()V", "Lio/ktor/client/engine/okhttp/OkHttpConfig;", "getConfig", "()Lio/ktor/client/engine/okhttp/OkHttpConfig;", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "supportedCapabilities", "Ljava/util/Set;", "getSupportedCapabilities", "()Ljava/util/Set;", "requestsJob", "Ll6/h;", "coroutineContext", "getCoroutineContext", "()Ll6/h;", "", "clientCache", "Ljava/util/Map;", "Companion", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OkHttpEngine extends io.ktor.client.engine.HttpClientEngineBase {
    private static final io.ktor.client.engine.okhttp.OkHttpEngine.Companion Companion = new io.ktor.client.engine.okhttp.OkHttpEngine.Companion(null);
    private static final p070h6.h okHttpClientPrototype$delegate = com.google.common.util.concurrent.D.B(new p026c6.a(11));
    private final java.util.Map<io.ktor.client.plugins.HttpTimeoutConfig, w8.s> clientCache;
    private final io.ktor.client.engine.okhttp.OkHttpConfig config;
    private final p100l6.h coroutineContext;
    private final p100l6.h requestsJob;
    private final java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> supportedCapabilities;

    /* JADX INFO: renamed from: io.ktor.client.engine.okhttp.OkHttpEngine$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.client.engine.okhttp.OkHttpEngine$1", f = "OkHttpEngine.kt", l = {com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p117n6.i implements p194x6.m {
        int label;

        public AnonymousClass1(p100l6.c cVar) {
            super(2, cVar);
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return io.ktor.client.engine.okhttp.OkHttpEngine.this.new AnonymousClass1(cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((io.ktor.client.engine.okhttp.OkHttpEngine.AnonymousClass1) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    com.google.common.util.concurrent.P.u0(obj);
                    p100l6.f fVar = io.ktor.client.engine.okhttp.OkHttpEngine.this.requestsJob.get(S7.C0889g0.f9584h);
                    kotlin.jvm.internal.m.b(fVar);
                    this.label = 1;
                    if (((S7.InterfaceC0891h0) fVar).z(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                }
                java.util.Iterator it = io.ktor.client.engine.okhttp.OkHttpEngine.this.clientCache.entrySet().iterator();
                while (it.hasNext()) {
                    w8.s sVar = (w8.s) ((java.util.Map.Entry) it.next()).getValue();
                    sVar.f30631i.w();
                    ((java.util.concurrent.ThreadPoolExecutor) sVar.f30630h.v()).shutdown();
                }
                return p070h6.A.f22523a;
            } catch (java.lang.Throwable th) {
                java.util.Iterator it2 = io.ktor.client.engine.okhttp.OkHttpEngine.this.clientCache.entrySet().iterator();
                while (it2.hasNext()) {
                    w8.s sVar2 = (w8.s) ((java.util.Map.Entry) it2.next()).getValue();
                    sVar2.f30631i.w();
                    ((java.util.concurrent.ThreadPoolExecutor) sVar2.f30630h.v()).shutdown();
                }
                throw th;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpEngine$Companion;", "", "<init>", "()V", "Lw8/s;", "okHttpClientPrototype$delegate", "Lh6/h;", "getOkHttpClientPrototype", "()Lw8/s;", "okHttpClientPrototype", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final w8.s getOkHttpClientPrototype() {
            return (w8.s) io.ktor.client.engine.okhttp.OkHttpEngine.okHttpClientPrototype$delegate.getValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.okhttp.OkHttpEngine$execute$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_DEBUG, androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32, 68, 69}, m = "execute")
    public static final class C23521 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C23521(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.engine.okhttp.OkHttpEngine.this.execute(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {118}, m = "executeHttpRequest")
    public static final class C23531 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        public C23531(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.engine.okhttp.OkHttpEngine.this.executeHttpRequest(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {107}, m = "executeServerSendEventsRequest")
    public static final class C23541 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        public C23541(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.engine.okhttp.OkHttpEngine.this.executeServerSendEventsRequest(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {91}, m = "executeWebSocketRequest")
    public static final class C23551 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        public C23551(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.engine.okhttp.OkHttpEngine.this.executeWebSocketRequest(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpEngine(io.ktor.client.engine.okhttp.OkHttpConfig config) {
        super("ktor-okhttp");
        kotlin.jvm.internal.m.e(config, "config");
        this.config = config;
        this.supportedCapabilities = p078i6.m.F0(new io.ktor.client.engine.HttpClientEngineCapability[]{io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE, io.ktor.client.plugins.websocket.WebSocketCapability.INSTANCE, io.ktor.client.plugins.sse.SSECapability.INSTANCE});
        this.clientCache = io.ktor.util.CacheKt.createLRUCache(new io.ktor.client.engine.okhttp.OkHttpEngine$clientCache$1(this), new io.ktor.client.a(3), getConfig().getClientCacheSize());
        p100l6.f fVar = super.getCoroutineContext().get(S7.C0889g0.f9584h);
        kotlin.jvm.internal.m.b(fVar);
        p100l6.h hVarSilentSupervisor = io.ktor.util.CoroutinesUtilsKt.SilentSupervisor((S7.InterfaceC0891h0) fVar);
        this.requestsJob = hVarSilentSupervisor;
        this.coroutineContext = super.getCoroutineContext().plus(hVarSilentSupervisor);
        S7.C.z(S7.C0877a0.f9566h, super.getCoroutineContext(), S7.B.j, new io.ktor.client.engine.okhttp.OkHttpEngine.AnonymousClass1(null));
    }

    private final io.ktor.client.request.HttpResponseData buildResponseData(w8.B response, io.ktor.util.date.GMTDate requestTime, java.lang.Object body, p100l6.h callContext) {
        return new io.ktor.client.request.HttpResponseData(new io.ktor.http.HttpStatusCode(response.f30488k, response.j), requestTime, io.ktor.client.engine.okhttp.OkUtilsKt.fromOkHttp(response.f30490m), io.ktor.client.engine.okhttp.OkUtilsKt.fromOkHttp(response.f30487i), body, callContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A clientCache$lambda$0(w8.s it) {
        kotlin.jvm.internal.m.e(it, "it");
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w8.s createOkHttpClient(io.ktor.client.plugins.HttpTimeoutConfig timeoutExtension) {
        w8.s preconfigured = getConfig().getPreconfigured();
        if (preconfigured == null) {
            preconfigured = Companion.getOkHttpClientPrototype();
        }
        w8.r rVarA = preconfigured.a();
        rVarA.f30598a = new A7.m(23);
        getConfig().getConfig().invoke(rVarA);
        java.net.Proxy proxy = getConfig().getProxy();
        if (proxy != null) {
            if (!kotlin.jvm.internal.m.a(proxy, rVarA.f30607l)) {
                rVarA.f30597A = null;
            }
            rVarA.f30607l = proxy;
        }
        if (timeoutExtension != null) {
            io.ktor.client.engine.okhttp.OkHttpEngineKt.setupTimeoutAttributes(rVarA, timeoutExtension);
        }
        return new w8.s(rVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object executeHttpRequest(w8.s sVar, w8.v vVar, p100l6.h hVar, io.ktor.client.request.HttpRequestData httpRequestData, p100l6.c cVar) {
        io.ktor.client.engine.okhttp.OkHttpEngine.C23531 c23531;
        io.ktor.util.date.GMTDate gMTDate;
        io.ktor.client.engine.okhttp.OkHttpEngine okHttpEngine;
        io.ktor.utils.io.ByteReadChannel empty;
        M8.InterfaceC0684l interfaceC0684lR;
        if (cVar instanceof io.ktor.client.engine.okhttp.OkHttpEngine.C23531) {
            c23531 = (io.ktor.client.engine.okhttp.OkHttpEngine.C23531) cVar;
            int i3 = c23531.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23531.label = i3 - Integer.MIN_VALUE;
            } else {
                c23531 = new io.ktor.client.engine.okhttp.OkHttpEngine.C23531(cVar);
            }
        } else {
            c23531 = new io.ktor.client.engine.okhttp.OkHttpEngine.C23531(cVar);
        }
        java.lang.Object obj = c23531.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c23531.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.util.date.GMTDate gMTDateGMTDate$default = io.ktor.util.date.DateJvmKt.GMTDate$default(null, 1, null);
            c23531.L$0 = this;
            c23531.L$1 = hVar;
            c23531.L$2 = httpRequestData;
            c23531.L$3 = gMTDateGMTDate$default;
            c23531.label = 1;
            java.lang.Object objExecute = io.ktor.client.engine.okhttp.OkUtilsKt.execute(sVar, vVar, httpRequestData, hVar, c23531);
            if (objExecute == aVar) {
                return aVar;
            }
            obj = objExecute;
            gMTDate = gMTDateGMTDate$default;
            okHttpEngine = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gMTDate = (io.ktor.util.date.GMTDate) c23531.L$3;
            httpRequestData = (io.ktor.client.request.HttpRequestData) c23531.L$2;
            hVar = (p100l6.h) c23531.L$1;
            okHttpEngine = (io.ktor.client.engine.okhttp.OkHttpEngine) c23531.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        w8.B b9 = (w8.B) obj;
        w8.D d4 = b9.f30491n;
        p100l6.f fVar = hVar.get(S7.C0889g0.f9584h);
        kotlin.jvm.internal.m.b(fVar);
        ((S7.InterfaceC0891h0) fVar).j(new p078i6.C2255f(6, d4));
        if (d4 == null || (interfaceC0684lR = d4.R()) == null || (empty = io.ktor.client.engine.okhttp.OkHttpEngineKt.toChannel(interfaceC0684lR, hVar, httpRequestData)) == null) {
            empty = io.ktor.utils.io.ByteReadChannel.INSTANCE.getEmpty();
        }
        return okHttpEngine.buildResponseData(b9, gMTDate, empty, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A executeHttpRequest$lambda$2(w8.D d4, java.lang.Throwable th) {
        if (d4 != null) {
            d4.close();
        }
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object executeServerSendEventsRequest(w8.s sVar, w8.v vVar, p100l6.h hVar, p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.client.engine.okhttp.OkHttpEngine.C23541 c23541;
        io.ktor.client.engine.okhttp.OkHttpEngine okHttpEngine;
        io.ktor.util.date.GMTDate gMTDate;
        io.ktor.client.engine.okhttp.OkHttpSSESession okHttpSSESession;
        if (cVar instanceof io.ktor.client.engine.okhttp.OkHttpEngine.C23541) {
            c23541 = (io.ktor.client.engine.okhttp.OkHttpEngine.C23541) cVar;
            int i3 = c23541.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23541.label = i3 - Integer.MIN_VALUE;
            } else {
                c23541 = new io.ktor.client.engine.okhttp.OkHttpEngine.C23541(cVar);
            }
        } else {
            c23541 = new io.ktor.client.engine.okhttp.OkHttpEngine.C23541(cVar);
        }
        java.lang.Object obj = c23541.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c23541.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.util.date.GMTDate gMTDateGMTDate$default = io.ktor.util.date.DateJvmKt.GMTDate$default(null, 1, null);
            io.ktor.client.engine.okhttp.OkHttpSSESession okHttpSSESession2 = new io.ktor.client.engine.okhttp.OkHttpSSESession(sVar, vVar, hVar);
            S7.InterfaceC0900p originResponse$ktor_client_okhttp = okHttpSSESession2.getOriginResponse();
            c23541.L$0 = this;
            c23541.L$1 = hVar;
            c23541.L$2 = gMTDateGMTDate$default;
            c23541.L$3 = okHttpSSESession2;
            c23541.label = 1;
            java.lang.Object objK = ((S7.C0901q) originResponse$ktor_client_okhttp).k(c23541);
            if (objK == aVar) {
                return aVar;
            }
            okHttpEngine = this;
            gMTDate = gMTDateGMTDate$default;
            obj = objK;
            okHttpSSESession = okHttpSSESession2;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            okHttpSSESession = (io.ktor.client.engine.okhttp.OkHttpSSESession) c23541.L$3;
            gMTDate = (io.ktor.util.date.GMTDate) c23541.L$2;
            hVar = (p100l6.h) c23541.L$1;
            okHttpEngine = (io.ktor.client.engine.okhttp.OkHttpEngine) c23541.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return okHttpEngine.buildResponseData((w8.B) obj, gMTDate, okHttpSSESession, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object executeWebSocketRequest(w8.s sVar, w8.v vVar, p100l6.h hVar, p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.client.engine.okhttp.OkHttpEngine.C23551 c23551;
        io.ktor.client.engine.okhttp.OkHttpEngine okHttpEngine;
        io.ktor.util.date.GMTDate gMTDate;
        io.ktor.client.engine.okhttp.OkHttpWebsocketSession okHttpWebsocketSession;
        if (cVar instanceof io.ktor.client.engine.okhttp.OkHttpEngine.C23551) {
            c23551 = (io.ktor.client.engine.okhttp.OkHttpEngine.C23551) cVar;
            int i3 = c23551.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23551.label = i3 - Integer.MIN_VALUE;
            } else {
                c23551 = new io.ktor.client.engine.okhttp.OkHttpEngine.C23551(cVar);
            }
        } else {
            c23551 = new io.ktor.client.engine.okhttp.OkHttpEngine.C23551(cVar);
        }
        java.lang.Object obj = c23551.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c23551.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.util.date.GMTDate gMTDateGMTDate$default = io.ktor.util.date.DateJvmKt.GMTDate$default(null, 1, null);
            w8.G webSocketFactory = getConfig().getWebSocketFactory();
            if (webSocketFactory == null) {
                webSocketFactory = sVar;
            }
            io.ktor.client.engine.okhttp.OkHttpWebsocketSession okHttpWebsocketSession2 = new io.ktor.client.engine.okhttp.OkHttpWebsocketSession(sVar, webSocketFactory, vVar, hVar);
            okHttpWebsocketSession2.start();
            S7.InterfaceC0900p originResponse$ktor_client_okhttp = okHttpWebsocketSession2.getOriginResponse();
            c23551.L$0 = this;
            c23551.L$1 = hVar;
            c23551.L$2 = gMTDateGMTDate$default;
            c23551.L$3 = okHttpWebsocketSession2;
            c23551.label = 1;
            java.lang.Object objK = ((S7.C0901q) originResponse$ktor_client_okhttp).k(c23551);
            if (objK == aVar) {
                return aVar;
            }
            okHttpEngine = this;
            gMTDate = gMTDateGMTDate$default;
            obj = objK;
            okHttpWebsocketSession = okHttpWebsocketSession2;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            okHttpWebsocketSession = (io.ktor.client.engine.okhttp.OkHttpWebsocketSession) c23551.L$3;
            gMTDate = (io.ktor.util.date.GMTDate) c23551.L$2;
            hVar = (p100l6.h) c23551.L$1;
            okHttpEngine = (io.ktor.client.engine.okhttp.OkHttpEngine) c23551.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return okHttpEngine.buildResponseData((w8.B) obj, gMTDate, okHttpWebsocketSession, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w8.s okHttpClientPrototype_delegate$lambda$5() {
        return new w8.s(new w8.r());
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        p100l6.f fVar = this.requestsJob.get(S7.C0889g0.f9584h);
        kotlin.jvm.internal.m.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((S7.j0) ((S7.r) fVar)).Z();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // io.ktor.client.engine.HttpClientEngine
    public java.lang.Object execute(io.ktor.client.request.HttpRequestData httpRequestData, p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.client.engine.okhttp.OkHttpEngine.C23521 c23521;
        io.ktor.client.engine.okhttp.OkHttpEngine okHttpEngine;
        if (cVar instanceof io.ktor.client.engine.okhttp.OkHttpEngine.C23521) {
            c23521 = (io.ktor.client.engine.okhttp.OkHttpEngine.C23521) cVar;
            int i3 = c23521.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23521.label = i3 - Integer.MIN_VALUE;
            } else {
                c23521 = new io.ktor.client.engine.okhttp.OkHttpEngine.C23521(cVar);
            }
        } else {
            c23521 = new io.ktor.client.engine.okhttp.OkHttpEngine.C23521(cVar);
        }
        io.ktor.client.engine.okhttp.OkHttpEngine.C23521 c23522 = c23521;
        java.lang.Object objCallContext = c23522.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c23522.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objCallContext);
            c23522.L$0 = this;
            c23522.L$1 = httpRequestData;
            c23522.label = 1;
            objCallContext = io.ktor.client.engine.UtilsKt.callContext(c23522);
            if (objCallContext != aVar) {
                okHttpEngine = this;
            }
            return aVar;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                com.google.common.util.concurrent.P.u0(objCallContext);
                return objCallContext;
            }
            if (i9 == 3) {
                com.google.common.util.concurrent.P.u0(objCallContext);
                return objCallContext;
            }
            if (i9 != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objCallContext);
            return objCallContext;
        }
        httpRequestData = (io.ktor.client.request.HttpRequestData) c23522.L$1;
        okHttpEngine = (io.ktor.client.engine.okhttp.OkHttpEngine) c23522.L$0;
        com.google.common.util.concurrent.P.u0(objCallContext);
        io.ktor.client.request.HttpRequestData httpRequestData2 = httpRequestData;
        p100l6.h hVar = (p100l6.h) objCallContext;
        w8.v vVarConvertToOkHttpRequest = io.ktor.client.engine.okhttp.OkHttpEngineKt.convertToOkHttpRequest(httpRequestData2, hVar);
        w8.s sVar = okHttpEngine.clientCache.get(httpRequestData2.getCapabilityOrNull(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE));
        if (sVar == null) {
            throw new java.lang.IllegalStateException("OkHttpClient can't be constructed because HttpTimeout plugin is not installed");
        }
        if (io.ktor.client.request.HttpRequestKt.isUpgradeRequest(httpRequestData2)) {
            c23522.L$0 = null;
            c23522.L$1 = null;
            c23522.label = 2;
            java.lang.Object objExecuteWebSocketRequest = okHttpEngine.executeWebSocketRequest(sVar, vVarConvertToOkHttpRequest, hVar, c23522);
            if (objExecuteWebSocketRequest != aVar) {
                return objExecuteWebSocketRequest;
            }
        } else if (io.ktor.client.request.HttpRequestKt.isSseRequest(httpRequestData2)) {
            c23522.L$0 = null;
            c23522.L$1 = null;
            c23522.label = 3;
            java.lang.Object objExecuteServerSendEventsRequest = okHttpEngine.executeServerSendEventsRequest(sVar, vVarConvertToOkHttpRequest, hVar, c23522);
            if (objExecuteServerSendEventsRequest != aVar) {
                return objExecuteServerSendEventsRequest;
            }
        } else {
            c23522.L$0 = null;
            c23522.L$1 = null;
            c23522.label = 4;
            java.lang.Object objExecuteHttpRequest = okHttpEngine.executeHttpRequest(sVar, vVarConvertToOkHttpRequest, hVar, httpRequestData2, c23522);
            if (objExecuteHttpRequest != aVar) {
                return objExecuteHttpRequest;
            }
        }
        return aVar;
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, io.ktor.client.engine.HttpClientEngine, S7.A
    public p100l6.h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, io.ktor.client.engine.HttpClientEngine
    public java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> getSupportedCapabilities() {
        return this.supportedCapabilities;
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public io.ktor.client.engine.okhttp.OkHttpConfig getConfig() {
        return this.config;
    }
}
