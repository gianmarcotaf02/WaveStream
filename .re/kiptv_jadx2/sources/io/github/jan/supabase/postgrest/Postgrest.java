package io.github.jan.supabase.postgrest;

import androidx.media3.container.NalUnitUtil;
import com.kiptv.core.model.C1933b;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.SupabaseClientBuilder;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import io.github.jan.supabase.plugins.CustomSerializationConfig;
import io.github.jan.supabase.plugins.CustomSerializationPlugin;
import io.github.jan.supabase.plugins.MainConfig;
import io.github.jan.supabase.plugins.MainPlugin;
import io.github.jan.supabase.plugins.SupabasePluginProvider;
import io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder;
import io.github.jan.supabase.postgrest.query.request.RpcRequestBuilder;
import io.ktor.client.utils.CacheControl;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEvent;
import io.sentry.Session;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryStackFrame;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p070h6.A;
import p100l6.c;
import p109m6.a;
import p194x6.j;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0018\u0017J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\nJ \u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\bJ.\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00042\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH¦@¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH¦@¢\u0006\u0004\b\u0012\u0010\u0016\u0082\u0001\u0001\u0019¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/postgrest/Postgrest;", "Lio/github/jan/supabase/plugins/MainPlugin;", "Lio/github/jan/supabase/postgrest/Postgrest$Config;", "Lio/github/jan/supabase/plugins/CustomSerializationPlugin;", "", "table", "Lio/github/jan/supabase/postgrest/query/PostgrestQueryBuilder;", "from", "(Ljava/lang/String;)Lio/github/jan/supabase/postgrest/query/PostgrestQueryBuilder;", "schema", "(Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/postgrest/query/PostgrestQueryBuilder;", "get", SentryStackFrame.JsonKeys.FUNCTION, "Lkotlin/Function1;", "Lio/github/jan/supabase/postgrest/query/request/RpcRequestBuilder;", "Lh6/A;", SentryBaseEvent.JsonKeys.REQUEST, "Lio/github/jan/supabase/postgrest/result/PostgrestResult;", "rpc", "(Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "Lkotlinx/serialization/json/c;", "parameters", "(Ljava/lang/String;Lkotlinx/serialization/json/c;Lx6/j;Ll6/c;)Ljava/lang/Object;", "Companion", "Config", "Lio/github/jan/supabase/postgrest/PostgrestImpl;", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface Postgrest extends MainPlugin<Config>, CustomSerializationPlugin {
    public static final int API_VERSION = 1;

    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/github/jan/supabase/postgrest/Postgrest$Companion;", "Lio/github/jan/supabase/plugins/SupabasePluginProvider;", "Lio/github/jan/supabase/postgrest/Postgrest$Config;", "Lio/github/jan/supabase/postgrest/Postgrest;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", Session.JsonKeys.INIT, "createConfig", "(Lx6/j;)Lio/github/jan/supabase/postgrest/Postgrest$Config;", "Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "config", "create", "(Lio/github/jan/supabase/SupabaseClient;Lio/github/jan/supabase/postgrest/Postgrest$Config;)Lio/github/jan/supabase/postgrest/Postgrest;", "", SubscriberAttributeKt.JSON_NAME_KEY, "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Lio/github/jan/supabase/logging/SupabaseLogger;", SentryEvent.JsonKeys.LOGGER, "Lio/github/jan/supabase/logging/SupabaseLogger;", "getLogger", "()Lio/github/jan/supabase/logging/SupabaseLogger;", "", "API_VERSION", "I", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements SupabasePluginProvider<Config, Postgrest> {
        public static final int API_VERSION = 1;
        static final Companion $$INSTANCE = new Companion();
        private static final String key = "rest";
        private static final SupabaseLogger logger = SupabaseClient.Companion.createLogger$default(SupabaseClient.INSTANCE, "Supabase-PostgREST", null, 2, null);

        private Companion() {
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public SupabaseLogger getLogger() {
            return logger;
        }

        @Override
        public void setLogLevel(LogLevel logLevel) {
            SupabasePluginProvider.DefaultImpls.setLogLevel(this, logLevel);
        }

        @Override
        public void setup(SupabaseClientBuilder supabaseClientBuilder, Config config) {
            SupabasePluginProvider.DefaultImpls.setup(this, supabaseClientBuilder, config);
        }

        @Override
        public Postgrest create(SupabaseClient supabaseClient, Config config) {
            m.e(supabaseClient, "supabaseClient");
            m.e(config, "config");
            return new PostgrestImpl(supabaseClient, config);
        }

        @Override
        public Config createConfig(j init) {
            m.e(init, "init");
            Config config = new Config(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            init.invoke(config);
            return config;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lio/github/jan/supabase/postgrest/Postgrest$Config;", "Lio/github/jan/supabase/plugins/MainConfig;", "Lio/github/jan/supabase/plugins/CustomSerializationConfig;", "defaultSchema", "", "propertyConversionMethod", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "<init>", "(Ljava/lang/String;Lio/github/jan/supabase/postgrest/PropertyConversionMethod;)V", "getDefaultSchema", "()Ljava/lang/String;", "setDefaultSchema", "(Ljava/lang/String;)V", "getPropertyConversionMethod", "()Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "setPropertyConversionMethod", "(Lio/github/jan/supabase/postgrest/PropertyConversionMethod;)V", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "setSerializer", "(Lio/github/jan/supabase/SupabaseSerializer;)V", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Config extends MainConfig implements CustomSerializationConfig {
        private String defaultSchema;
        private PropertyConversionMethod propertyConversionMethod;
        private SupabaseSerializer serializer;

        public Config() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static Config copy$default(Config config, String str, PropertyConversionMethod propertyConversionMethod, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = config.defaultSchema;
            }
            if ((i3 & 2) != 0) {
                propertyConversionMethod = config.propertyConversionMethod;
            }
            return config.copy(str, propertyConversionMethod);
        }

        public final String getDefaultSchema() {
            return this.defaultSchema;
        }

        public final PropertyConversionMethod getPropertyConversionMethod() {
            return this.propertyConversionMethod;
        }

        public final Config copy(String defaultSchema, PropertyConversionMethod propertyConversionMethod) {
            m.e(defaultSchema, "defaultSchema");
            m.e(propertyConversionMethod, "propertyConversionMethod");
            return new Config(defaultSchema, propertyConversionMethod);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return m.a(this.defaultSchema, config.defaultSchema) && m.a(this.propertyConversionMethod, config.propertyConversionMethod);
        }

        public final String getDefaultSchema() {
            return this.defaultSchema;
        }

        public final PropertyConversionMethod getPropertyConversionMethod() {
            return this.propertyConversionMethod;
        }

        @Override
        public SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public int hashCode() {
            return this.propertyConversionMethod.hashCode() + (this.defaultSchema.hashCode() * 31);
        }

        public final void setDefaultSchema(String str) {
            m.e(str, "<set-?>");
            this.defaultSchema = str;
        }

        public final void setPropertyConversionMethod(PropertyConversionMethod propertyConversionMethod) {
            m.e(propertyConversionMethod, "<set-?>");
            this.propertyConversionMethod = propertyConversionMethod;
        }

        @Override
        public void setSerializer(SupabaseSerializer supabaseSerializer) {
            this.serializer = supabaseSerializer;
        }

        public String toString() {
            return "Config(defaultSchema=" + this.defaultSchema + ", propertyConversionMethod=" + this.propertyConversionMethod + ')';
        }

        public Config(String str, PropertyConversionMethod propertyConversionMethod, int i3, AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? CacheControl.PUBLIC : str, (i3 & 2) != 0 ? PropertyConversionMethod.INSTANCE.getCAMEL_CASE_TO_SNAKE_CASE() : propertyConversionMethod);
        }

        public Config(String defaultSchema, PropertyConversionMethod propertyConversionMethod) {
            m.e(defaultSchema, "defaultSchema");
            m.e(propertyConversionMethod, "propertyConversionMethod");
            this.defaultSchema = defaultSchema;
            this.propertyConversionMethod = propertyConversionMethod;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static Object close(Postgrest postgrest, c cVar) {
            Object objClose = MainPlugin.DefaultImpls.close(postgrest, cVar);
            return objClose == a.f25430h ? objClose : A.f22523a;
        }

        public static PostgrestQueryBuilder get(Postgrest postgrest, String schema, String table) {
            m.e(schema, "schema");
            m.e(table, "table");
            return postgrest.from(schema, table);
        }

        public static void init(Postgrest postgrest) {
            MainPlugin.DefaultImpls.init(postgrest);
        }

        public static String resolveUrl(Postgrest postgrest, String path) {
            m.e(path, "path");
            return MainPlugin.DefaultImpls.resolveUrl(postgrest, path);
        }

        public static Object rpc$default(Postgrest postgrest, String str, j jVar, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rpc");
            }
            if ((i3 & 2) != 0) {
                jVar = new C1933b(21);
            }
            return postgrest.rpc(str, jVar, cVar);
        }

        public static A rpc$lambda$0(RpcRequestBuilder rpcRequestBuilder) {
            m.e(rpcRequestBuilder, "<this>");
            return A.f22523a;
        }

        public static A rpc$lambda$1(RpcRequestBuilder rpcRequestBuilder) {
            m.e(rpcRequestBuilder, "<this>");
            return A.f22523a;
        }

        public static PostgrestQueryBuilder get(Postgrest postgrest, String table) {
            m.e(table, "table");
            return postgrest.from(table);
        }

        public static Object rpc$default(Postgrest postgrest, String str, kotlinx.serialization.json.c cVar, j jVar, c cVar2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rpc");
            }
            if ((i3 & 4) != 0) {
                jVar = new C1933b(20);
            }
            return postgrest.rpc(str, cVar, jVar, cVar2);
        }
    }

    PostgrestQueryBuilder from(String table);

    PostgrestQueryBuilder from(String schema, String table);

    PostgrestQueryBuilder get(String table);

    PostgrestQueryBuilder get(String schema, String table);

    Object rpc(String str, kotlinx.serialization.json.c cVar, j jVar, c cVar2);

    Object rpc(String str, j jVar, c cVar);
}
