package io.github.jan.supabase;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 %2\u00020\u0001:\u0001%J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR:\u0010$\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001dj\u0004\u0018\u0001`\u001f8&X§\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!\u0082\u0001\u0001&¨\u0006'"}, d2 = {"Lio/github/jan/supabase/SupabaseClient;", "", "Lh6/A;", "close", "(Ll6/c;)Ljava/lang/Object;", "", "getSupabaseHttpUrl", "()Ljava/lang/String;", "supabaseHttpUrl", "getSupabaseUrl", "supabaseUrl", "getSupabaseKey", "supabaseKey", "Lio/github/jan/supabase/plugins/PluginManager;", "getPluginManager", "()Lio/github/jan/supabase/plugins/PluginManager;", "pluginManager", "Lio/github/jan/supabase/network/KtorSupabaseHttpClient;", "getHttpClient", "()Lio/github/jan/supabase/network/KtorSupabaseHttpClient;", "httpClient", "", "getUseHTTPS", "()Z", "useHTTPS", "Lio/github/jan/supabase/SupabaseSerializer;", "getDefaultSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "defaultSerializer", "Lkotlin/Function1;", "Ll6/c;", "Lio/github/jan/supabase/AccessTokenProvider;", "getAccessToken", "()Lx6/j;", "getAccessToken$annotations", "()V", "accessToken", "Companion", "Lio/github/jan/supabase/SupabaseClientImpl;", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface SupabaseClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.SupabaseClient.Companion INSTANCE = io.github.jan.supabase.SupabaseClient.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lio/github/jan/supabase/SupabaseClient$Companion;", "", "<init>", "()V", "value", "Lio/github/jan/supabase/logging/LogLevel;", "DEFAULT_LOG_LEVEL", "getDEFAULT_LOG_LEVEL", "()Lio/github/jan/supabase/logging/LogLevel;", "setDEFAULT_LOG_LEVEL$supabase_kt_release", "(Lio/github/jan/supabase/logging/LogLevel;)V", "LOGGER", "Lio/github/jan/supabase/logging/KermitSupabaseLogger;", "getLOGGER$supabase_kt_release", "()Lio/github/jan/supabase/logging/KermitSupabaseLogger;", "createLogger", "tag", "", "level", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ io.github.jan.supabase.SupabaseClient.Companion $$INSTANCE;
        private static io.github.jan.supabase.logging.LogLevel DEFAULT_LOG_LEVEL;
        private static final io.github.jan.supabase.logging.KermitSupabaseLogger LOGGER;

        static {
            io.github.jan.supabase.SupabaseClient.Companion companion = new io.github.jan.supabase.SupabaseClient.Companion();
            $$INSTANCE = companion;
            DEFAULT_LOG_LEVEL = io.github.jan.supabase.logging.LogLevel.INFO;
            LOGGER = createLogger$default(companion, "Supabase-Core", null, 2, null);
        }

        private Companion() {
        }

        public static /* synthetic */ io.github.jan.supabase.logging.KermitSupabaseLogger createLogger$default(io.github.jan.supabase.SupabaseClient.Companion companion, java.lang.String str, io.github.jan.supabase.logging.LogLevel logLevel, int i3, java.lang.Object obj) {
            if ((i3 & 2) != 0) {
                logLevel = null;
            }
            return companion.createLogger(str, logLevel);
        }

        public final io.github.jan.supabase.logging.KermitSupabaseLogger createLogger(java.lang.String tag, io.github.jan.supabase.logging.LogLevel level) {
            kotlin.jvm.internal.m.e(tag, "tag");
            return new io.github.jan.supabase.logging.KermitSupabaseLogger(level, tag, null, 4, null);
        }

        public final io.github.jan.supabase.logging.LogLevel getDEFAULT_LOG_LEVEL() {
            return DEFAULT_LOG_LEVEL;
        }

        public final io.github.jan.supabase.logging.KermitSupabaseLogger getLOGGER$supabase_kt_release() {
            return LOGGER;
        }

        public final void setDEFAULT_LOG_LEVEL$supabase_kt_release(io.github.jan.supabase.logging.LogLevel logLevel) {
            kotlin.jvm.internal.m.e(logLevel, "<set-?>");
            DEFAULT_LOG_LEVEL = logLevel;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @io.github.jan.supabase.annotations.SupabaseInternal
        public static /* synthetic */ void getAccessToken$annotations() {
        }
    }

    java.lang.Object close(p100l6.c cVar);

    p194x6.j getAccessToken();

    io.github.jan.supabase.SupabaseSerializer getDefaultSerializer();

    io.github.jan.supabase.network.KtorSupabaseHttpClient getHttpClient();

    io.github.jan.supabase.plugins.PluginManager getPluginManager();

    java.lang.String getSupabaseHttpUrl();

    java.lang.String getSupabaseKey();

    java.lang.String getSupabaseUrl();

    boolean getUseHTTPS();
}
