package io.github.jan.supabase.postgrest;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0018\u0017J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\nJ \u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\bJ.\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00042\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH¦@¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH¦@¢\u0006\u0004\b\u0012\u0010\u0016\u0082\u0001\u0001\u0019¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/postgrest/Postgrest;", "Lio/github/jan/supabase/plugins/MainPlugin;", "Lio/github/jan/supabase/postgrest/Postgrest$Config;", "Lio/github/jan/supabase/plugins/CustomSerializationPlugin;", "", "table", "Lio/github/jan/supabase/postgrest/query/PostgrestQueryBuilder;", "from", "(Ljava/lang/String;)Lio/github/jan/supabase/postgrest/query/PostgrestQueryBuilder;", "schema", "(Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/postgrest/query/PostgrestQueryBuilder;", "get", io.sentry.protocol.SentryStackFrame.JsonKeys.FUNCTION, "Lkotlin/Function1;", "Lio/github/jan/supabase/postgrest/query/request/RpcRequestBuilder;", "Lh6/A;", io.sentry.SentryBaseEvent.JsonKeys.REQUEST, "Lio/github/jan/supabase/postgrest/result/PostgrestResult;", "rpc", "(Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "Lkotlinx/serialization/json/c;", "parameters", "(Ljava/lang/String;Lkotlinx/serialization/json/c;Lx6/j;Ll6/c;)Ljava/lang/Object;", "Companion", "Config", "Lio/github/jan/supabase/postgrest/PostgrestImpl;", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface Postgrest extends io.github.jan.supabase.plugins.MainPlugin<io.github.jan.supabase.postgrest.Postgrest.Config>, io.github.jan.supabase.plugins.CustomSerializationPlugin {
    public static final int API_VERSION = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.postgrest.Postgrest.Companion INSTANCE = io.github.jan.supabase.postgrest.Postgrest.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/github/jan/supabase/postgrest/Postgrest$Companion;", "Lio/github/jan/supabase/plugins/SupabasePluginProvider;", "Lio/github/jan/supabase/postgrest/Postgrest$Config;", "Lio/github/jan/supabase/postgrest/Postgrest;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", io.sentry.Session.JsonKeys.INIT, "createConfig", "(Lx6/j;)Lio/github/jan/supabase/postgrest/Postgrest$Config;", "Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "config", "create", "(Lio/github/jan/supabase/SupabaseClient;Lio/github/jan/supabase/postgrest/Postgrest$Config;)Lio/github/jan/supabase/postgrest/Postgrest;", "", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Lio/github/jan/supabase/logging/SupabaseLogger;", io.sentry.SentryEvent.JsonKeys.LOGGER, "Lio/github/jan/supabase/logging/SupabaseLogger;", "getLogger", "()Lio/github/jan/supabase/logging/SupabaseLogger;", "", "API_VERSION", "I", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements io.github.jan.supabase.plugins.SupabasePluginProvider<io.github.jan.supabase.postgrest.Postgrest.Config, io.github.jan.supabase.postgrest.Postgrest> {
        public static final int API_VERSION = 1;
        static final /* synthetic */ io.github.jan.supabase.postgrest.Postgrest.Companion $$INSTANCE = new io.github.jan.supabase.postgrest.Postgrest.Companion();
        private static final java.lang.String key = "rest";
        private static final io.github.jan.supabase.logging.SupabaseLogger logger = io.github.jan.supabase.SupabaseClient.Companion.createLogger$default(io.github.jan.supabase.SupabaseClient.INSTANCE, "Supabase-PostgREST", null, 2, null);

        private Companion() {
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public java.lang.String getKey() {
            return key;
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public io.github.jan.supabase.logging.SupabaseLogger getLogger() {
            return logger;
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public void setLogLevel(io.github.jan.supabase.logging.LogLevel logLevel) {
            io.github.jan.supabase.plugins.SupabasePluginProvider.DefaultImpls.setLogLevel(this, logLevel);
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public void setup(io.github.jan.supabase.SupabaseClientBuilder supabaseClientBuilder, io.github.jan.supabase.postgrest.Postgrest.Config config) {
            io.github.jan.supabase.plugins.SupabasePluginProvider.DefaultImpls.setup(this, supabaseClientBuilder, config);
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public io.github.jan.supabase.postgrest.Postgrest create(io.github.jan.supabase.SupabaseClient supabaseClient, io.github.jan.supabase.postgrest.Postgrest.Config config) {
            kotlin.jvm.internal.m.e(supabaseClient, "supabaseClient");
            kotlin.jvm.internal.m.e(config, "config");
            return new io.github.jan.supabase.postgrest.PostgrestImpl(supabaseClient, config);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public io.github.jan.supabase.postgrest.Postgrest.Config createConfig(p194x6.j init) {
            kotlin.jvm.internal.m.e(init, "init");
            io.github.jan.supabase.postgrest.Postgrest.Config config = new io.github.jan.supabase.postgrest.Postgrest.Config(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            init.invoke(config);
            return config;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lio/github/jan/supabase/postgrest/Postgrest$Config;", "Lio/github/jan/supabase/plugins/MainConfig;", "Lio/github/jan/supabase/plugins/CustomSerializationConfig;", "defaultSchema", "", "propertyConversionMethod", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "<init>", "(Ljava/lang/String;Lio/github/jan/supabase/postgrest/PropertyConversionMethod;)V", "getDefaultSchema", "()Ljava/lang/String;", "setDefaultSchema", "(Ljava/lang/String;)V", "getPropertyConversionMethod", "()Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "setPropertyConversionMethod", "(Lio/github/jan/supabase/postgrest/PropertyConversionMethod;)V", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "setSerializer", "(Lio/github/jan/supabase/SupabaseSerializer;)V", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Config extends io.github.jan.supabase.plugins.MainConfig implements io.github.jan.supabase.plugins.CustomSerializationConfig {
        private java.lang.String defaultSchema;
        private io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod;
        private io.github.jan.supabase.SupabaseSerializer serializer;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ io.github.jan.supabase.postgrest.Postgrest.Config copy$default(io.github.jan.supabase.postgrest.Postgrest.Config config, java.lang.String str, io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = config.defaultSchema;
            }
            if ((i3 & 2) != 0) {
                propertyConversionMethod = config.propertyConversionMethod;
            }
            return config.copy(str, propertyConversionMethod);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getDefaultSchema() {
            return this.defaultSchema;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final io.github.jan.supabase.postgrest.PropertyConversionMethod getPropertyConversionMethod() {
            return this.propertyConversionMethod;
        }

        public final io.github.jan.supabase.postgrest.Postgrest.Config copy(java.lang.String defaultSchema, io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod) {
            kotlin.jvm.internal.m.e(defaultSchema, "defaultSchema");
            kotlin.jvm.internal.m.e(propertyConversionMethod, "propertyConversionMethod");
            return new io.github.jan.supabase.postgrest.Postgrest.Config(defaultSchema, propertyConversionMethod);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof io.github.jan.supabase.postgrest.Postgrest.Config)) {
                return false;
            }
            io.github.jan.supabase.postgrest.Postgrest.Config config = (io.github.jan.supabase.postgrest.Postgrest.Config) other;
            return kotlin.jvm.internal.m.a(this.defaultSchema, config.defaultSchema) && kotlin.jvm.internal.m.a(this.propertyConversionMethod, config.propertyConversionMethod);
        }

        public final java.lang.String getDefaultSchema() {
            return this.defaultSchema;
        }

        public final io.github.jan.supabase.postgrest.PropertyConversionMethod getPropertyConversionMethod() {
            return this.propertyConversionMethod;
        }

        @Override // io.github.jan.supabase.plugins.CustomSerializationConfig
        public io.github.jan.supabase.SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public int hashCode() {
            return this.propertyConversionMethod.hashCode() + (this.defaultSchema.hashCode() * 31);
        }

        public final void setDefaultSchema(java.lang.String str) {
            kotlin.jvm.internal.m.e(str, "<set-?>");
            this.defaultSchema = str;
        }

        public final void setPropertyConversionMethod(io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod) {
            kotlin.jvm.internal.m.e(propertyConversionMethod, "<set-?>");
            this.propertyConversionMethod = propertyConversionMethod;
        }

        @Override // io.github.jan.supabase.plugins.CustomSerializationConfig
        public void setSerializer(io.github.jan.supabase.SupabaseSerializer supabaseSerializer) {
            this.serializer = supabaseSerializer;
        }

        public java.lang.String toString() {
            return "Config(defaultSchema=" + this.defaultSchema + ", propertyConversionMethod=" + this.propertyConversionMethod + ')';
        }

        public /* synthetic */ Config(java.lang.String str, io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? io.ktor.client.utils.CacheControl.PUBLIC : str, (i3 & 2) != 0 ? io.github.jan.supabase.postgrest.PropertyConversionMethod.INSTANCE.getCAMEL_CASE_TO_SNAKE_CASE() : propertyConversionMethod);
        }

        public Config(java.lang.String defaultSchema, io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod) {
            kotlin.jvm.internal.m.e(defaultSchema, "defaultSchema");
            kotlin.jvm.internal.m.e(propertyConversionMethod, "propertyConversionMethod");
            this.defaultSchema = defaultSchema;
            this.propertyConversionMethod = propertyConversionMethod;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static java.lang.Object close(io.github.jan.supabase.postgrest.Postgrest postgrest, p100l6.c cVar) {
            java.lang.Object objClose = io.github.jan.supabase.plugins.MainPlugin.DefaultImpls.close(postgrest, cVar);
            return objClose == p109m6.a.f25430h ? objClose : p070h6.A.f22523a;
        }

        public static io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder get(io.github.jan.supabase.postgrest.Postgrest postgrest, java.lang.String schema, java.lang.String table) {
            kotlin.jvm.internal.m.e(schema, "schema");
            kotlin.jvm.internal.m.e(table, "table");
            return postgrest.from(schema, table);
        }

        public static void init(io.github.jan.supabase.postgrest.Postgrest postgrest) {
            io.github.jan.supabase.plugins.MainPlugin.DefaultImpls.init(postgrest);
        }

        public static java.lang.String resolveUrl(io.github.jan.supabase.postgrest.Postgrest postgrest, java.lang.String path) {
            kotlin.jvm.internal.m.e(path, "path");
            return io.github.jan.supabase.plugins.MainPlugin.DefaultImpls.resolveUrl(postgrest, path);
        }

        public static /* synthetic */ java.lang.Object rpc$default(io.github.jan.supabase.postgrest.Postgrest postgrest, java.lang.String str, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rpc");
            }
            if ((i3 & 2) != 0) {
                jVar = new com.kiptv.core.model.C1933b(21);
            }
            return postgrest.rpc(str, jVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static p070h6.A rpc$lambda$0(io.github.jan.supabase.postgrest.query.request.RpcRequestBuilder rpcRequestBuilder) {
            kotlin.jvm.internal.m.e(rpcRequestBuilder, "<this>");
            return p070h6.A.f22523a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static p070h6.A rpc$lambda$1(io.github.jan.supabase.postgrest.query.request.RpcRequestBuilder rpcRequestBuilder) {
            kotlin.jvm.internal.m.e(rpcRequestBuilder, "<this>");
            return p070h6.A.f22523a;
        }

        public static io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder get(io.github.jan.supabase.postgrest.Postgrest postgrest, java.lang.String table) {
            kotlin.jvm.internal.m.e(table, "table");
            return postgrest.from(table);
        }

        public static /* synthetic */ java.lang.Object rpc$default(io.github.jan.supabase.postgrest.Postgrest postgrest, java.lang.String str, kotlinx.serialization.json.c cVar, p194x6.j jVar, p100l6.c cVar2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rpc");
            }
            if ((i3 & 4) != 0) {
                jVar = new com.kiptv.core.model.C1933b(20);
            }
            return postgrest.rpc(str, cVar, jVar, cVar2);
        }
    }

    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder from(java.lang.String table);

    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder from(java.lang.String schema, java.lang.String table);

    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder get(java.lang.String table);

    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder get(java.lang.String schema, java.lang.String table);

    java.lang.Object rpc(java.lang.String str, kotlinx.serialization.json.c cVar, p194x6.j jVar, p100l6.c cVar2);

    java.lang.Object rpc(java.lang.String str, p194x6.j jVar, p100l6.c cVar);
}
