package io.github.jan.supabase.plugins;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.SupabaseClient;
import io.sentry.Session;
import kotlin.Metadata;
import p070h6.A;
import p100l6.c;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lio/github/jan/supabase/plugins/SupabasePlugin;", "Config", "", "Lh6/A;", "close", "(Ll6/c;)Ljava/lang/Object;", Session.JsonKeys.INIT, "()V", "getConfig", "()Ljava/lang/Object;", "config", "Lio/github/jan/supabase/SupabaseClient;", "getSupabaseClient", "()Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface SupabasePlugin<Config> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static <Config> Object close(SupabasePlugin<Config> supabasePlugin, c cVar) {
            return A.f22523a;
        }

        public static <Config> void init(SupabasePlugin<Config> supabasePlugin) {
        }
    }

    Object close(c cVar);

    Config getConfig();

    SupabaseClient getSupabaseClient();

    void init();
}
