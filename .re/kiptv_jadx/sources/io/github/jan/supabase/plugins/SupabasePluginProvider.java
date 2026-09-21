package io.github.jan.supabase.plugins;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004J#\u0010\b\u001a\u00028\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lio/github/jan/supabase/plugins/SupabasePluginProvider;", "Config", "Lio/github/jan/supabase/plugins/SupabasePlugin;", "PluginInstance", "", "Lkotlin/Function1;", "Lh6/A;", io.sentry.Session.JsonKeys.INIT, "createConfig", "(Lx6/j;)Ljava/lang/Object;", "Lio/github/jan/supabase/SupabaseClientBuilder;", "builder", "config", "setup", "(Lio/github/jan/supabase/SupabaseClientBuilder;Ljava/lang/Object;)V", "Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "create", "(Lio/github/jan/supabase/SupabaseClient;Ljava/lang/Object;)Lio/github/jan/supabase/plugins/SupabasePlugin;", "Lio/github/jan/supabase/logging/LogLevel;", "level", "setLogLevel", "(Lio/github/jan/supabase/logging/LogLevel;)V", "", "getKey", "()Ljava/lang/String;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "Lio/github/jan/supabase/logging/SupabaseLogger;", "getLogger", "()Lio/github/jan/supabase/logging/SupabaseLogger;", io.sentry.SentryEvent.JsonKeys.LOGGER, "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface SupabasePluginProvider<Config, PluginInstance extends io.github.jan.supabase.plugins.SupabasePlugin<Config>> {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static <Config, PluginInstance extends io.github.jan.supabase.plugins.SupabasePlugin<Config>> void setLogLevel(io.github.jan.supabase.plugins.SupabasePluginProvider<Config, PluginInstance> supabasePluginProvider, io.github.jan.supabase.logging.LogLevel level) {
            kotlin.jvm.internal.m.e(level, "level");
            supabasePluginProvider.getLogger().setLevel(level);
        }

        public static <Config, PluginInstance extends io.github.jan.supabase.plugins.SupabasePlugin<Config>> void setup(io.github.jan.supabase.plugins.SupabasePluginProvider<Config, PluginInstance> supabasePluginProvider, io.github.jan.supabase.SupabaseClientBuilder builder, Config config) {
            kotlin.jvm.internal.m.e(builder, "builder");
        }
    }

    PluginInstance create(io.github.jan.supabase.SupabaseClient supabaseClient, Config config);

    Config createConfig(p194x6.j init);

    java.lang.String getKey();

    io.github.jan.supabase.logging.SupabaseLogger getLogger();

    void setLogLevel(io.github.jan.supabase.logging.LogLevel level);

    void setup(io.github.jan.supabase.SupabaseClientBuilder builder, Config config);
}
