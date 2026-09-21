package io.github.jan.supabase.plugins;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lio/github/jan/supabase/plugins/SupabasePlugin;", "Config", "", "Lh6/A;", "close", "(Ll6/c;)Ljava/lang/Object;", io.sentry.Session.JsonKeys.INIT, "()V", "getConfig", "()Ljava/lang/Object;", "config", "Lio/github/jan/supabase/SupabaseClient;", "getSupabaseClient", "()Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface SupabasePlugin<Config> {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static <Config> java.lang.Object close(io.github.jan.supabase.plugins.SupabasePlugin<Config> supabasePlugin, p100l6.c cVar) {
            return p070h6.A.f22523a;
        }

        public static <Config> void init(io.github.jan.supabase.plugins.SupabasePlugin<Config> supabasePlugin) {
        }
    }

    java.lang.Object close(p100l6.c cVar);

    Config getConfig();

    io.github.jan.supabase.SupabaseClient getSupabaseClient();

    void init();
}
