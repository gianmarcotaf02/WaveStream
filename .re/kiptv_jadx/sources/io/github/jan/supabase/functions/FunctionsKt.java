package io.github.jan.supabase.functions;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"functions", "Lio/github/jan/supabase/functions/Functions;", "Lio/github/jan/supabase/SupabaseClient;", "getFunctions", "(Lio/github/jan/supabase/SupabaseClient;)Lio/github/jan/supabase/functions/Functions;", "functions-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FunctionsKt {
    public static final io.github.jan.supabase.functions.Functions getFunctions(io.github.jan.supabase.SupabaseClient supabaseClient) {
        kotlin.jvm.internal.m.e(supabaseClient, "<this>");
        io.github.jan.supabase.plugins.PluginManager pluginManager = supabaseClient.getPluginManager();
        io.github.jan.supabase.functions.Functions.Companion companion = io.github.jan.supabase.functions.Functions.INSTANCE;
        io.github.jan.supabase.plugins.SupabasePlugin<?> supabasePlugin = pluginManager.getInstalledPlugins().get(companion.getKey());
        if (!(supabasePlugin instanceof io.github.jan.supabase.functions.Functions)) {
            supabasePlugin = null;
        }
        io.github.jan.supabase.functions.Functions functions = (io.github.jan.supabase.functions.Functions) supabasePlugin;
        if (functions != null) {
            return functions;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Plugin ");
        sb.append(companion.getKey());
        sb.append(" not installed or not of type ");
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        sb.append(c9.b(io.github.jan.supabase.functions.Functions.class).h());
        sb.append(". Consider installing ");
        sb.append(c9.b(io.github.jan.supabase.functions.Functions.class).h());
        sb.append(" within your SupabaseClientBuilder");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }
}
