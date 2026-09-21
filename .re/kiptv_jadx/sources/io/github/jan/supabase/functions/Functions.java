package io.github.jan.supabase.functions;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002<;B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0004\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0086J¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0012\u001a\u00020\u0011\"\n\b\u0000\u0010\u0015\u0018\u0001*\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0086J¢\u0006\u0004\b\u0012\u0010\u0019J,\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0086J¢\u0006\u0004\b\u0012\u0010\u001aJ)\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010.\u001a\u00020-8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lio/github/jan/supabase/functions/Functions;", "Lio/github/jan/supabase/plugins/MainPlugin;", "Lio/github/jan/supabase/functions/Functions$Config;", "Lio/github/jan/supabase/plugins/CustomSerializationPlugin;", "config", "Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "<init>", "(Lio/github/jan/supabase/functions/Functions$Config;Lio/github/jan/supabase/SupabaseClient;)V", "", io.sentry.protocol.SentryStackFrame.JsonKeys.FUNCTION, "Lio/github/jan/supabase/functions/FunctionRegion;", "region", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lh6/A;", "builder", "Lio/ktor/client/statement/HttpResponse;", "invoke", "(Ljava/lang/String;Lio/github/jan/supabase/functions/FunctionRegion;Lx6/j;Ll6/c;)Ljava/lang/Object;", "", "T", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "Lio/ktor/http/Headers;", "headers", "(Ljava/lang/String;Ljava/lang/Object;Lio/github/jan/supabase/functions/FunctionRegion;Lio/ktor/http/Headers;Ll6/c;)Ljava/lang/Object;", "(Ljava/lang/String;Lio/github/jan/supabase/functions/FunctionRegion;Lio/ktor/http/Headers;Ll6/c;)Ljava/lang/Object;", "Lio/github/jan/supabase/functions/EdgeFunction;", "buildEdgeFunction", "(Ljava/lang/String;Lio/github/jan/supabase/functions/FunctionRegion;Lio/ktor/http/Headers;)Lio/github/jan/supabase/functions/EdgeFunction;", io.sentry.protocol.Response.TYPE, "Lio/github/jan/supabase/exceptions/RestException;", "parseErrorResponse", "(Lio/ktor/client/statement/HttpResponse;Ll6/c;)Ljava/lang/Object;", "Lio/github/jan/supabase/functions/Functions$Config;", "getConfig", "()Lio/github/jan/supabase/functions/Functions$Config;", "Lio/github/jan/supabase/SupabaseClient;", "getSupabaseClient", "()Lio/github/jan/supabase/SupabaseClient;", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "api", "Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "getApi", "()Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "getApi$annotations", "()V", "", "getApiVersion", "()I", "apiVersion", "getPluginKey", "()Ljava/lang/String;", "pluginKey", "Companion", "Config", "functions-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Functions implements io.github.jan.supabase.plugins.MainPlugin<io.github.jan.supabase.functions.Functions.Config>, io.github.jan.supabase.plugins.CustomSerializationPlugin {
    public static final int API_VERSION = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.functions.Functions.Companion INSTANCE = new io.github.jan.supabase.functions.Functions.Companion(null);
    private static final java.lang.String key = "functions";
    private static final io.github.jan.supabase.logging.KermitSupabaseLogger logger = io.github.jan.supabase.SupabaseClient.Companion.createLogger$default(io.github.jan.supabase.SupabaseClient.INSTANCE, "Supabase-Functions", null, 2, null);
    private final io.github.jan.supabase.auth.AuthenticatedSupabaseApi api;
    private final io.github.jan.supabase.functions.Functions.Config config;
    private final io.github.jan.supabase.SupabaseSerializer serializer;
    private final io.github.jan.supabase.SupabaseClient supabaseClient;

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/github/jan/supabase/functions/Functions$Companion;", "Lio/github/jan/supabase/plugins/SupabasePluginProvider;", "Lio/github/jan/supabase/functions/Functions$Config;", "Lio/github/jan/supabase/functions/Functions;", "<init>", "()V", "Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "config", "create", "(Lio/github/jan/supabase/SupabaseClient;Lio/github/jan/supabase/functions/Functions$Config;)Lio/github/jan/supabase/functions/Functions;", "Lkotlin/Function1;", "Lh6/A;", io.sentry.Session.JsonKeys.INIT, "createConfig", "(Lx6/j;)Lio/github/jan/supabase/functions/Functions$Config;", "", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Lio/github/jan/supabase/logging/KermitSupabaseLogger;", io.sentry.SentryEvent.JsonKeys.LOGGER, "Lio/github/jan/supabase/logging/KermitSupabaseLogger;", "getLogger", "()Lio/github/jan/supabase/logging/KermitSupabaseLogger;", "", "API_VERSION", "I", "functions-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements io.github.jan.supabase.plugins.SupabasePluginProvider<io.github.jan.supabase.functions.Functions.Config, io.github.jan.supabase.functions.Functions> {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public java.lang.String getKey() {
            return io.github.jan.supabase.functions.Functions.key;
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public void setLogLevel(io.github.jan.supabase.logging.LogLevel logLevel) {
            io.github.jan.supabase.plugins.SupabasePluginProvider.DefaultImpls.setLogLevel(this, logLevel);
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public void setup(io.github.jan.supabase.SupabaseClientBuilder supabaseClientBuilder, io.github.jan.supabase.functions.Functions.Config config) {
            io.github.jan.supabase.plugins.SupabasePluginProvider.DefaultImpls.setup(this, supabaseClientBuilder, config);
        }

        private Companion() {
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public io.github.jan.supabase.functions.Functions create(io.github.jan.supabase.SupabaseClient supabaseClient, io.github.jan.supabase.functions.Functions.Config config) {
            kotlin.jvm.internal.m.e(supabaseClient, "supabaseClient");
            kotlin.jvm.internal.m.e(config, "config");
            return new io.github.jan.supabase.functions.Functions(config, supabaseClient);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public io.github.jan.supabase.functions.Functions.Config createConfig(p194x6.j init) {
            kotlin.jvm.internal.m.e(init, "init");
            io.github.jan.supabase.functions.Functions.Config config = new io.github.jan.supabase.functions.Functions.Config();
            init.invoke(config);
            return config;
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public io.github.jan.supabase.logging.KermitSupabaseLogger getLogger() {
            return io.github.jan.supabase.functions.Functions.logger;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/github/jan/supabase/functions/Functions$Config;", "Lio/github/jan/supabase/plugins/MainConfig;", "Lio/github/jan/supabase/plugins/CustomSerializationConfig;", "<init>", "()V", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "setSerializer", "(Lio/github/jan/supabase/SupabaseSerializer;)V", "defaultRegion", "Lio/github/jan/supabase/functions/FunctionRegion;", "getDefaultRegion", "()Lio/github/jan/supabase/functions/FunctionRegion;", "setDefaultRegion", "(Lio/github/jan/supabase/functions/FunctionRegion;)V", "functions-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Config extends io.github.jan.supabase.plugins.MainConfig implements io.github.jan.supabase.plugins.CustomSerializationConfig {
        private io.github.jan.supabase.functions.FunctionRegion defaultRegion = io.github.jan.supabase.functions.FunctionRegion.ANY;
        private io.github.jan.supabase.SupabaseSerializer serializer;

        public final io.github.jan.supabase.functions.FunctionRegion getDefaultRegion() {
            return this.defaultRegion;
        }

        @Override // io.github.jan.supabase.plugins.CustomSerializationConfig
        public io.github.jan.supabase.SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public final void setDefaultRegion(io.github.jan.supabase.functions.FunctionRegion functionRegion) {
            kotlin.jvm.internal.m.e(functionRegion, "<set-?>");
            this.defaultRegion = functionRegion;
        }

        @Override // io.github.jan.supabase.plugins.CustomSerializationConfig
        public void setSerializer(io.github.jan.supabase.SupabaseSerializer supabaseSerializer) {
            this.serializer = supabaseSerializer;
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.functions.Functions$parseErrorResponse$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.github.jan.supabase.functions.Functions", f = "Functions.kt", l = {androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AC3}, m = "parseErrorResponse")
    public static final class AnonymousClass1 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.github.jan.supabase.functions.Functions.this.parseErrorResponse(null, this);
        }
    }

    public Functions(io.github.jan.supabase.functions.Functions.Config config, io.github.jan.supabase.SupabaseClient supabaseClient) {
        kotlin.jvm.internal.m.e(config, "config");
        kotlin.jvm.internal.m.e(supabaseClient, "supabaseClient");
        this.config = config;
        this.supabaseClient = supabaseClient;
        io.github.jan.supabase.SupabaseSerializer serializer = getConfig().getSerializer();
        this.serializer = serializer == null ? getSupabaseClient().getDefaultSerializer() : serializer;
        this.api = io.github.jan.supabase.auth.AuthenticatedSupabaseApiKt.authenticatedSupabaseApi$default(getSupabaseClient(), this, (p194x6.j) null, 2, (java.lang.Object) null);
    }

    public static /* synthetic */ io.github.jan.supabase.functions.EdgeFunction buildEdgeFunction$default(io.github.jan.supabase.functions.Functions functions, java.lang.String str, io.github.jan.supabase.functions.FunctionRegion functionRegion, io.ktor.http.Headers headers, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            functionRegion = functions.getConfig().getDefaultRegion();
        }
        if ((i3 & 4) != 0) {
            headers = io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        return functions.buildEdgeFunction(str, functionRegion, headers);
    }

    public static /* synthetic */ void getApi$annotations() {
    }

    private final java.lang.Object invoke$$forInline(java.lang.String str, io.github.jan.supabase.functions.FunctionRegion functionRegion, p194x6.j jVar, p100l6.c cVar) {
        return getApi().request(str, new io.github.jan.supabase.functions.Functions$invoke$$inlined$post$1(jVar, functionRegion), cVar);
    }

    public static /* synthetic */ java.lang.Object invoke$default(io.github.jan.supabase.functions.Functions functions, java.lang.String str, io.github.jan.supabase.functions.FunctionRegion functionRegion, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            functionRegion = functions.getConfig().getDefaultRegion();
        }
        return functions.getApi().request(str, new io.github.jan.supabase.functions.Functions$invoke$$inlined$post$1(jVar, functionRegion), cVar);
    }

    public final io.github.jan.supabase.functions.EdgeFunction buildEdgeFunction(java.lang.String function, io.github.jan.supabase.functions.FunctionRegion region, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(function, "function");
        kotlin.jvm.internal.m.e(region, "region");
        kotlin.jvm.internal.m.e(headers, "headers");
        io.ktor.http.Headers.Companion companion = io.ktor.http.Headers.INSTANCE;
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
        headersBuilder.appendAll(headers);
        headersBuilder.append("x-region", region.getValue());
        return new io.github.jan.supabase.functions.EdgeFunction(function, headersBuilder.build(), getSupabaseClient());
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public java.lang.Object close(p100l6.c cVar) {
        return io.github.jan.supabase.plugins.MainPlugin.DefaultImpls.close(this, cVar);
    }

    public final io.github.jan.supabase.auth.AuthenticatedSupabaseApi getApi() {
        return this.api;
    }

    @Override // io.github.jan.supabase.plugins.MainPlugin
    public int getApiVersion() {
        return 1;
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public io.github.jan.supabase.functions.Functions.Config getConfig() {
        return this.config;
    }

    @Override // io.github.jan.supabase.plugins.MainPlugin
    public java.lang.String getPluginKey() {
        return key;
    }

    @Override // io.github.jan.supabase.plugins.CustomSerializationPlugin
    public io.github.jan.supabase.SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public io.github.jan.supabase.SupabaseClient getSupabaseClient() {
        return this.supabaseClient;
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public void init() {
        io.github.jan.supabase.plugins.MainPlugin.DefaultImpls.init(this);
    }

    public final java.lang.Object invoke(java.lang.String str, io.github.jan.supabase.functions.FunctionRegion functionRegion, p194x6.j jVar, p100l6.c cVar) {
        return getApi().request(str, new io.github.jan.supabase.functions.Functions$invoke$$inlined$post$1(jVar, functionRegion), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.github.jan.supabase.plugins.MainPlugin
    public java.lang.Object parseErrorResponse(io.ktor.client.statement.HttpResponse httpResponse, p100l6.c cVar) {
        io.github.jan.supabase.functions.Functions.AnonymousClass1 anonymousClass1;
        if (cVar instanceof io.github.jan.supabase.functions.Functions.AnonymousClass1) {
            anonymousClass1 = (io.github.jan.supabase.functions.Functions.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.github.jan.supabase.functions.Functions.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.github.jan.supabase.functions.Functions.AnonymousClass1(cVar);
        }
        java.lang.Object objBodyAsText$default = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objBodyAsText$default);
            anonymousClass1.L$0 = httpResponse;
            anonymousClass1.label = 1;
            objBodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, anonymousClass1, 1, null);
            if (objBodyAsText$default == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            httpResponse = (io.ktor.client.statement.HttpResponse) anonymousClass1.L$0;
            com.google.common.util.concurrent.P.u0(objBodyAsText$default);
        }
        io.ktor.client.statement.HttpResponse httpResponse2 = httpResponse;
        java.lang.String str = (java.lang.String) objBodyAsText$default;
        io.ktor.http.HttpStatusCode status = httpResponse2.getStatus();
        io.ktor.http.HttpStatusCode.Companion companion = io.ktor.http.HttpStatusCode.INSTANCE;
        if (kotlin.jvm.internal.m.a(status, companion.getUnauthorized())) {
            return new io.github.jan.supabase.exceptions.UnauthorizedRestException(str, httpResponse2, null, 4, null);
        }
        if (kotlin.jvm.internal.m.a(status, companion.getNotFound())) {
            return new io.github.jan.supabase.exceptions.NotFoundRestException(str, httpResponse2, null, 4, null);
        }
        return kotlin.jvm.internal.m.a(status, companion.getBadRequest()) ? new io.github.jan.supabase.exceptions.BadRequestRestException(str, httpResponse2, null, 4, null) : new io.github.jan.supabase.exceptions.UnauthorizedRestException(str, httpResponse2, null, 4, null);
    }

    @Override // io.github.jan.supabase.plugins.MainPlugin
    public java.lang.String resolveUrl(java.lang.String str) {
        return io.github.jan.supabase.plugins.MainPlugin.DefaultImpls.resolveUrl(this, str);
    }

    private final java.lang.Object invoke$$forInline(java.lang.String str, io.github.jan.supabase.functions.FunctionRegion functionRegion, io.ktor.http.Headers headers, p100l6.c cVar) {
        return getApi().request(str, new io.github.jan.supabase.functions.Functions$invoke$$inlined$invoke$default$2(getConfig().getDefaultRegion(), headers, functionRegion), cVar);
    }

    public final <T> java.lang.Object invoke(java.lang.String str, T t9, io.github.jan.supabase.functions.FunctionRegion functionRegion, io.ktor.http.Headers headers, p100l6.c cVar) {
        getConfig().getDefaultRegion();
        getApi();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public static java.lang.Object invoke$default(io.github.jan.supabase.functions.Functions functions, java.lang.String str, java.lang.Object obj, io.github.jan.supabase.functions.FunctionRegion functionRegion, io.ktor.http.Headers headers, p100l6.c cVar, int i3, java.lang.Object obj2) {
        if ((i3 & 4) != 0) {
            functions.getConfig().getDefaultRegion();
        }
        if ((i3 & 8) != 0) {
            io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        functions.getConfig().getDefaultRegion();
        functions.getApi();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final java.lang.Object invoke(java.lang.String str, io.github.jan.supabase.functions.FunctionRegion functionRegion, io.ktor.http.Headers headers, p100l6.c cVar) {
        return getApi().request(str, new io.github.jan.supabase.functions.Functions$invoke$$inlined$invoke$default$2(getConfig().getDefaultRegion(), headers, functionRegion), cVar);
    }

    public static /* synthetic */ java.lang.Object invoke$default(io.github.jan.supabase.functions.Functions functions, java.lang.String str, io.github.jan.supabase.functions.FunctionRegion functionRegion, io.ktor.http.Headers headers, p100l6.c cVar, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            functionRegion = functions.getConfig().getDefaultRegion();
        }
        if ((i3 & 4) != 0) {
            headers = io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        return functions.getApi().request(str, new io.github.jan.supabase.functions.Functions$invoke$$inlined$invoke$default$2(functions.getConfig().getDefaultRegion(), headers, functionRegion), cVar);
    }
}
