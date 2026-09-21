package io.ktor.client.plugins.cookies;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00060\u0001j\u0002`\u0002:\u0002'&B;\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00060\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0080@¢\u0006\u0004\b\u0017\u0010\u0015J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0080@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R6\u0010\n\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u001a\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b#\u0010$\u0012\u0004\b%\u0010\u001f¨\u0006("}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "storage", "", "Lkotlin/Function2;", "Ll6/c;", "Lh6/A;", "", com.revenuecat.purchases.api.BuildConfig.FLAVOR, "<init>", "(Lio/ktor/client/plugins/cookies/CookiesStorage;Ljava/util/List;)V", "Lio/ktor/http/Url;", "requestUrl", "Lio/ktor/http/Cookie;", "get", "(Lio/ktor/http/Url;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "captureHeaderCookies$ktor_client_core", "(Lio/ktor/client/request/HttpRequestBuilder;Ll6/c;)Ljava/lang/Object;", "captureHeaderCookies", "sendCookiesWith$ktor_client_core", "sendCookiesWith", "Lio/ktor/client/statement/HttpResponse;", io.sentry.protocol.Response.TYPE, "saveCookiesFrom$ktor_client_core", "(Lio/ktor/client/statement/HttpResponse;Ll6/c;)Ljava/lang/Object;", "saveCookiesFrom", "close", "()V", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Ljava/util/List;", "LS7/h0;", "initializer", "LS7/h0;", "getInitializer$annotations", "Companion", "Config", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpCookies implements java.io.Closeable, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.client.plugins.cookies.HttpCookies.Companion INSTANCE = new io.ktor.client.plugins.cookies.HttpCookies.Companion(0 == true ? 1 : 0);
    private static final io.ktor.util.AttributeKey<io.ktor.client.plugins.cookies.HttpCookies> key;
    private final java.util.List<p194x6.m> defaults;
    private final S7.InterfaceC0891h0 initializer;
    private final io.ktor.client.plugins.cookies.CookiesStorage storage;

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/cookies/HttpCookies$Config;", "Lio/ktor/client/plugins/cookies/HttpCookies;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "block", "prepare", "(Lx6/j;)Lio/ktor/client/plugins/cookies/HttpCookies;", "plugin", "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/cookies/HttpCookies;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements io.ktor.client.plugins.HttpClientPlugin<io.ktor.client.plugins.cookies.HttpCookies.Config, io.ktor.client.plugins.cookies.HttpCookies> {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public io.ktor.util.AttributeKey<io.ktor.client.plugins.cookies.HttpCookies> getKey() {
            return io.ktor.client.plugins.cookies.HttpCookies.key;
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(io.ktor.client.plugins.cookies.HttpCookies plugin, io.ktor.client.HttpClient scope) {
            kotlin.jvm.internal.m.e(plugin, "plugin");
            kotlin.jvm.internal.m.e(scope, "scope");
            scope.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getState(), new io.ktor.client.plugins.cookies.HttpCookies$Companion$install$1(plugin, null));
            scope.getSendPipeline().intercept(io.ktor.client.request.HttpSendPipeline.INSTANCE.getState(), new io.ktor.client.plugins.cookies.HttpCookies$Companion$install$2(plugin, null));
            scope.getReceivePipeline().intercept(io.ktor.client.statement.HttpReceivePipeline.INSTANCE.getState(), new io.ktor.client.plugins.cookies.HttpCookies$Companion$install$3(plugin, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public io.ktor.client.plugins.cookies.HttpCookies prepare(p194x6.j block) {
            kotlin.jvm.internal.m.e(block, "block");
            io.ktor.client.plugins.cookies.HttpCookies.Config config = new io.ktor.client.plugins.cookies.HttpCookies.Config();
            block.invoke(config);
            return config.build$ktor_client_core();
        }
    }

    @io.ktor.utils.io.KtorDsl
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00020\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rR6\u0010\u0010\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies$Config;", "", "<init>", "()V", "Lkotlin/Function2;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Ll6/c;", "Lh6/A;", "block", "default", "(Lx6/m;)V", "Lio/ktor/client/plugins/cookies/HttpCookies;", "build$ktor_client_core", "()Lio/ktor/client/plugins/cookies/HttpCookies;", io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, "", com.revenuecat.purchases.api.BuildConfig.FLAVOR, "Ljava/util/List;", "storage", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "getStorage", "()Lio/ktor/client/plugins/cookies/CookiesStorage;", "setStorage", "(Lio/ktor/client/plugins/cookies/CookiesStorage;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Config {
        private final java.util.List<p194x6.m> defaults = new java.util.ArrayList();
        private io.ktor.client.plugins.cookies.CookiesStorage storage = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage(null, 1, 0 == true ? 1 : 0);

        public final io.ktor.client.plugins.cookies.HttpCookies build$ktor_client_core() {
            return new io.ktor.client.plugins.cookies.HttpCookies(this.storage, this.defaults);
        }

        /* JADX INFO: renamed from: default, reason: not valid java name */
        public final void m389default(p194x6.m block) {
            kotlin.jvm.internal.m.e(block, "block");
            this.defaults.add(block);
        }

        public final io.ktor.client.plugins.cookies.CookiesStorage getStorage() {
            return this.storage;
        }

        public final void setStorage(io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage) {
            kotlin.jvm.internal.m.e(cookiesStorage, "<set-?>");
            this.storage = cookiesStorage;
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cookies.HttpCookies$get$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", l = {43, 44}, m = "get")
    public static final class AnonymousClass1 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.plugins.cookies.HttpCookies.this.get(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        E6.v vVarA = null;
        E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(io.ktor.client.plugins.cookies.HttpCookies.class);
        try {
            vVarA = kotlin.jvm.internal.B.a(io.ktor.client.plugins.cookies.HttpCookies.class);
        } catch (java.lang.Throwable unused) {
        }
        key = new io.ktor.util.AttributeKey<>("HttpCookies", new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarA));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpCookies(io.ktor.client.plugins.cookies.CookiesStorage storage, java.util.List<? extends p194x6.m> defaults) {
        kotlin.jvm.internal.m.e(storage, "storage");
        kotlin.jvm.internal.m.e(defaults, "defaults");
        this.storage = storage;
        this.defaults = defaults;
        this.initializer = S7.C.A(S7.C0877a0.f9566h, S7.M.f9550b, new io.ktor.client.plugins.cookies.HttpCookies$initializer$1(this, null), 2);
    }

    private static /* synthetic */ void getInitializer$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object captureHeaderCookies$ktor_client_core(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, p100l6.c cVar) {
        io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1 httpCookies$captureHeaderCookies$1;
        io.ktor.client.plugins.cookies.HttpCookies httpCookies;
        java.util.Iterator it;
        io.ktor.http.Url url;
        io.ktor.client.plugins.cookies.HttpCookies httpCookies2;
        if (cVar instanceof io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1) {
            httpCookies$captureHeaderCookies$1 = (io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1) cVar;
            int i3 = httpCookies$captureHeaderCookies$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                httpCookies$captureHeaderCookies$1.label = i3 - Integer.MIN_VALUE;
                httpCookies = this;
            } else {
                httpCookies = this;
                httpCookies$captureHeaderCookies$1 = new io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1(httpCookies, cVar);
            }
        } else {
            httpCookies = this;
            httpCookies$captureHeaderCookies$1 = new io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1(httpCookies, cVar);
        }
        java.lang.Object obj = httpCookies$captureHeaderCookies$1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = httpCookies$captureHeaderCookies$1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.http.Url urlBuild = io.ktor.http.URLBuilderKt.clone(httpRequestBuilder.getUrl()).build();
            java.lang.String str = httpRequestBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getCookie());
            java.util.ArrayList arrayList = null;
            if (str != null) {
                P8.b bVar = io.ktor.client.plugins.cookies.HttpCookiesKt.LOGGER;
                java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Saving cookie ", str, " for ");
                sbQ.append(httpRequestBuilder.getUrl());
                bVar.i(sbQ.toString());
                java.util.Map clientCookiesHeader$default = io.ktor.http.CookieKt.parseClientCookiesHeader$default(str, false, 2, null);
                arrayList = new java.util.ArrayList(clientCookiesHeader$default.size());
                for (java.util.Map.Entry entry : clientCookiesHeader$default.entrySet()) {
                    arrayList.add(new io.ktor.http.Cookie((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), (io.ktor.http.CookieEncoding) null, (java.lang.Integer) null, (io.ktor.util.date.GMTDate) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.util.Map) null, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_VIDEO_DISABLED, (kotlin.jvm.internal.AbstractC2541f) null));
                }
            }
            if (arrayList != null) {
                it = arrayList.iterator();
                url = urlBuild;
                httpCookies2 = httpCookies;
            }
            return p070h6.A.f22523a;
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = (java.util.Iterator) httpCookies$captureHeaderCookies$1.L$2;
        url = (io.ktor.http.Url) httpCookies$captureHeaderCookies$1.L$1;
        httpCookies2 = (io.ktor.client.plugins.cookies.HttpCookies) httpCookies$captureHeaderCookies$1.L$0;
        com.google.common.util.concurrent.P.u0(obj);
        while (it.hasNext()) {
            io.ktor.http.Cookie cookie = (io.ktor.http.Cookie) it.next();
            io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage = httpCookies2.storage;
            httpCookies$captureHeaderCookies$1.L$0 = httpCookies2;
            httpCookies$captureHeaderCookies$1.L$1 = url;
            httpCookies$captureHeaderCookies$1.L$2 = it;
            httpCookies$captureHeaderCookies$1.label = 1;
            if (cookiesStorage.addCookie(url, cookie, httpCookies$captureHeaderCookies$1) == aVar) {
                return aVar;
            }
        }
        return p070h6.A.f22523a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.storage.close();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object get(io.ktor.http.Url url, p100l6.c cVar) {
        io.ktor.client.plugins.cookies.HttpCookies.AnonymousClass1 anonymousClass1;
        io.ktor.client.plugins.cookies.HttpCookies httpCookies;
        if (cVar instanceof io.ktor.client.plugins.cookies.HttpCookies.AnonymousClass1) {
            anonymousClass1 = (io.ktor.client.plugins.cookies.HttpCookies.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.ktor.client.plugins.cookies.HttpCookies.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.ktor.client.plugins.cookies.HttpCookies.AnonymousClass1(cVar);
        }
        java.lang.Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            S7.InterfaceC0891h0 interfaceC0891h0 = this.initializer;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = url;
            anonymousClass1.label = 1;
            if (interfaceC0891h0.z(anonymousClass1) != aVar) {
                httpCookies = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            return obj;
        }
        url = (io.ktor.http.Url) anonymousClass1.L$1;
        httpCookies = (io.ktor.client.plugins.cookies.HttpCookies) anonymousClass1.L$0;
        com.google.common.util.concurrent.P.u0(obj);
        io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage = httpCookies.storage;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        java.lang.Object obj2 = cookiesStorage.get(url, anonymousClass1);
        return obj2 == aVar ? aVar : obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object saveCookiesFrom$ktor_client_core(io.ktor.client.statement.HttpResponse httpResponse, p100l6.c cVar) {
        io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1 httpCookies$saveCookiesFrom$1;
        java.util.Iterator it;
        io.ktor.client.plugins.cookies.HttpCookies httpCookies;
        io.ktor.http.Url url;
        if (cVar instanceof io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1) {
            httpCookies$saveCookiesFrom$1 = (io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1) cVar;
            int i3 = httpCookies$saveCookiesFrom$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                httpCookies$saveCookiesFrom$1.label = i3 - Integer.MIN_VALUE;
            } else {
                httpCookies$saveCookiesFrom$1 = new io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1(this, cVar);
            }
        } else {
            httpCookies$saveCookiesFrom$1 = new io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1(this, cVar);
        }
        java.lang.Object obj = httpCookies$saveCookiesFrom$1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = httpCookies$saveCookiesFrom$1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.http.Url url2 = io.ktor.client.statement.HttpResponseKt.getRequest(httpResponse).getUrl();
            java.util.List<java.lang.String> all = httpResponse.getHeaders().getAll(io.ktor.http.HttpHeaders.INSTANCE.getSetCookie());
            if (all != null) {
                for (java.lang.String str : all) {
                    P8.b bVar = io.ktor.client.plugins.cookies.HttpCookiesKt.LOGGER;
                    java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Received cookie ", str, " in response for ");
                    sbQ.append(httpResponse.getCall().getRequest().getUrl());
                    bVar.i(sbQ.toString());
                }
            }
            it = io.ktor.http.HttpMessagePropertiesKt.setCookie(httpResponse).iterator();
            httpCookies = this;
            url = url2;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) httpCookies$saveCookiesFrom$1.L$2;
            url = (io.ktor.http.Url) httpCookies$saveCookiesFrom$1.L$1;
            httpCookies = (io.ktor.client.plugins.cookies.HttpCookies) httpCookies$saveCookiesFrom$1.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        while (it.hasNext()) {
            io.ktor.http.Cookie cookie = (io.ktor.http.Cookie) it.next();
            io.ktor.client.plugins.cookies.CookiesStorage cookiesStorage = httpCookies.storage;
            httpCookies$saveCookiesFrom$1.L$0 = httpCookies;
            httpCookies$saveCookiesFrom$1.L$1 = url;
            httpCookies$saveCookiesFrom$1.L$2 = it;
            httpCookies$saveCookiesFrom$1.label = 1;
            if (cookiesStorage.addCookie(url, cookie, httpCookies$saveCookiesFrom$1) == aVar) {
                return aVar;
            }
        }
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object sendCookiesWith$ktor_client_core(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, p100l6.c cVar) {
        io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1 httpCookies$sendCookiesWith$1;
        if (cVar instanceof io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1) {
            httpCookies$sendCookiesWith$1 = (io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1) cVar;
            int i3 = httpCookies$sendCookiesWith$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                httpCookies$sendCookiesWith$1.label = i3 - Integer.MIN_VALUE;
            } else {
                httpCookies$sendCookiesWith$1 = new io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1(this, cVar);
            }
        } else {
            httpCookies$sendCookiesWith$1 = new io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1(this, cVar);
        }
        java.lang.Object obj = httpCookies$sendCookiesWith$1.result;
        java.lang.Object obj2 = p109m6.a.f25430h;
        int i9 = httpCookies$sendCookiesWith$1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.http.Url urlBuild = io.ktor.http.URLBuilderKt.clone(httpRequestBuilder.getUrl()).build();
            httpCookies$sendCookiesWith$1.L$0 = httpRequestBuilder;
            httpCookies$sendCookiesWith$1.label = 1;
            obj = get(urlBuild, httpCookies$sendCookiesWith$1);
            if (obj == obj2) {
                return obj2;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) httpCookies$sendCookiesWith$1.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        java.util.List list = (java.util.List) obj;
        if (list.isEmpty()) {
            httpRequestBuilder.getHeaders().remove(io.ktor.http.HttpHeaders.INSTANCE.getCookie());
        } else {
            java.lang.String strRenderClientCookies = io.ktor.client.plugins.cookies.HttpCookiesKt.renderClientCookies(list);
            httpRequestBuilder.getHeaders().set(io.ktor.http.HttpHeaders.INSTANCE.getCookie(), strRenderClientCookies);
            P8.b bVar = io.ktor.client.plugins.cookies.HttpCookiesKt.LOGGER;
            java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Sending cookie ", strRenderClientCookies, " for ");
            sbQ.append(httpRequestBuilder.getUrl());
            bVar.i(sbQ.toString());
        }
        return p070h6.A.f22523a;
    }
}
