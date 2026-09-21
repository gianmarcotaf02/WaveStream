package io.github.jan.supabase.plugins;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0010\b\u0000\u0010\b\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\t\"\u0014\b\u0002\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u0002H\u0086\b¢\u0006\u0004\b\r\u0010\u000eJF\u0010\u000f\u001a\u00028\u0000\"\u0010\b\u0000\u0010\b\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\t\"\u0014\b\u0002\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u0002H\u0086\b¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086H¢\u0006\u0004\b\u0011\u0010\u0012R'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/plugins/PluginManager;", "", "", "", "Lio/github/jan/supabase/plugins/SupabasePlugin;", "installedPlugins", "<init>", "(Ljava/util/Map;)V", "Plugin", "Config", "Lio/github/jan/supabase/plugins/SupabasePluginProvider;", "Provider", "provider", "getPluginOrNull", "(Lio/github/jan/supabase/plugins/SupabasePluginProvider;)Lio/github/jan/supabase/plugins/SupabasePlugin;", "getPlugin", "Lh6/A;", "closeAllPlugins", "(Ll6/c;)Ljava/lang/Object;", "Ljava/util/Map;", "getInstalledPlugins", "()Ljava/util/Map;", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PluginManager {
    private final java.util.Map<java.lang.String, io.github.jan.supabase.plugins.SupabasePlugin<?>> installedPlugins;

    /* JADX INFO: renamed from: io.github.jan.supabase.plugins.PluginManager$closeAllPlugins$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    @p117n6.e(c = "io.github.jan.supabase.plugins.PluginManager", f = "PluginManager.kt", l = {29}, m = "closeAllPlugins")
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
            return io.github.jan.supabase.plugins.PluginManager.this.closeAllPlugins(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PluginManager(java.util.Map<java.lang.String, ? extends io.github.jan.supabase.plugins.SupabasePlugin<?>> installedPlugins) {
        kotlin.jvm.internal.m.e(installedPlugins, "installedPlugins");
        this.installedPlugins = installedPlugins;
    }

    private final java.lang.Object closeAllPlugins$$forInline(p100l6.c cVar) {
        java.util.Iterator<T> it = getInstalledPlugins().values().iterator();
        while (it.hasNext()) {
            ((io.github.jan.supabase.plugins.SupabasePlugin) it.next()).close(null);
        }
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object closeAllPlugins(p100l6.c cVar) {
        io.github.jan.supabase.plugins.PluginManager.AnonymousClass1 anonymousClass1;
        java.util.Iterator it;
        if (cVar instanceof io.github.jan.supabase.plugins.PluginManager.AnonymousClass1) {
            anonymousClass1 = (io.github.jan.supabase.plugins.PluginManager.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.github.jan.supabase.plugins.PluginManager.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.github.jan.supabase.plugins.PluginManager.AnonymousClass1(cVar);
        }
        java.lang.Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            it = getInstalledPlugins().values().iterator();
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) anonymousClass1.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        while (it.hasNext()) {
            io.github.jan.supabase.plugins.SupabasePlugin supabasePlugin = (io.github.jan.supabase.plugins.SupabasePlugin) it.next();
            anonymousClass1.L$0 = it;
            anonymousClass1.label = 1;
            if (supabasePlugin.close(anonymousClass1) == aVar) {
                return aVar;
            }
        }
        return p070h6.A.f22523a;
    }

    public final java.util.Map<java.lang.String, io.github.jan.supabase.plugins.SupabasePlugin<?>> getInstalledPlugins() {
        return this.installedPlugins;
    }

    public final <Plugin extends io.github.jan.supabase.plugins.SupabasePlugin<Config>, Config, Provider extends io.github.jan.supabase.plugins.SupabasePluginProvider<Config, Plugin>> Plugin getPlugin(Provider provider) {
        kotlin.jvm.internal.m.e(provider, "provider");
        getInstalledPlugins().get(provider.getKey());
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final <Plugin extends io.github.jan.supabase.plugins.SupabasePlugin<Config>, Config, Provider extends io.github.jan.supabase.plugins.SupabasePluginProvider<Config, Plugin>> Plugin getPluginOrNull(Provider provider) {
        kotlin.jvm.internal.m.e(provider, "provider");
        getInstalledPlugins().get(provider.getKey());
        kotlin.jvm.internal.m.j();
        throw null;
    }
}
