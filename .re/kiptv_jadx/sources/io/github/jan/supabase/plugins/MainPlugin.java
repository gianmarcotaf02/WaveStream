package io.github.jan.supabase.plugins;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/github/jan/supabase/plugins/MainPlugin;", "Lio/github/jan/supabase/plugins/MainConfig;", "Config", "Lio/github/jan/supabase/plugins/SupabasePlugin;", "", "path", "resolveUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Lio/ktor/client/statement/HttpResponse;", io.sentry.protocol.Response.TYPE, "Lio/github/jan/supabase/exceptions/RestException;", "parseErrorResponse", "(Lio/ktor/client/statement/HttpResponse;Ll6/c;)Ljava/lang/Object;", "", "getApiVersion", "()I", "apiVersion", "getPluginKey", "()Ljava/lang/String;", "pluginKey", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface MainPlugin<Config extends io.github.jan.supabase.plugins.MainConfig> extends io.github.jan.supabase.plugins.SupabasePlugin<Config> {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static <Config extends io.github.jan.supabase.plugins.MainConfig> java.lang.Object close(io.github.jan.supabase.plugins.MainPlugin<Config> mainPlugin, p100l6.c cVar) {
            java.lang.Object objClose = io.github.jan.supabase.plugins.SupabasePlugin.DefaultImpls.close(mainPlugin, cVar);
            return objClose == p109m6.a.f25430h ? objClose : p070h6.A.f22523a;
        }

        public static <Config extends io.github.jan.supabase.plugins.MainConfig> void init(io.github.jan.supabase.plugins.MainPlugin<Config> mainPlugin) {
            io.github.jan.supabase.plugins.SupabasePlugin.DefaultImpls.init(mainPlugin);
        }

        public static <Config extends io.github.jan.supabase.plugins.MainConfig> java.lang.String resolveUrl(io.github.jan.supabase.plugins.MainPlugin<Config> mainPlugin, java.lang.String path) {
            kotlin.jvm.internal.m.e(path, "path");
            boolean z6 = mainPlugin.getConfig().getCustomUrl() == null;
            java.lang.String customUrl = mainPlugin.getConfig().getCustomUrl();
            if (customUrl == null) {
                customUrl = mainPlugin.getSupabaseClient().getSupabaseHttpUrl();
            }
            io.ktor.http.URLBuilder URLBuilder = io.ktor.http.URLUtilsKt.URLBuilder(customUrl);
            if (z6) {
                io.ktor.http.URLBuilderKt.appendEncodedPathSegments(URLBuilder, mainPlugin.getPluginKey(), "v" + mainPlugin.getApiVersion());
            }
            if (!O7.q.N0(path)) {
                io.ktor.http.URLBuilderKt.appendEncodedPathSegments(URLBuilder, path);
            }
            return URLBuilder.buildString();
        }

        public static /* synthetic */ java.lang.String resolveUrl$default(io.github.jan.supabase.plugins.MainPlugin mainPlugin, java.lang.String str, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveUrl");
            }
            if ((i3 & 1) != 0) {
                str = "";
            }
            return mainPlugin.resolveUrl(str);
        }
    }

    int getApiVersion();

    java.lang.String getPluginKey();

    java.lang.Object parseErrorResponse(io.ktor.client.statement.HttpResponse httpResponse, p100l6.c cVar);

    java.lang.String resolveUrl(java.lang.String path);
}
