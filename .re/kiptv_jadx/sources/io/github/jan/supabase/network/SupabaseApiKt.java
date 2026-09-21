package io.github.jan.supabase.network;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\b\u0002\u0010\b\u001a \b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\n\u001a\u00020\t*\u00020\u00002\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\n\u0010\u000e\u001aO\u0010\n\u001a\u00020\t*\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000f2&\b\u0002\u0010\b\u001a \b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/SupabaseClient;", "", "baseUrl", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Ll6/c;", "Lio/github/jan/supabase/exceptions/RestException;", "", "parseErrorResponse", "Lio/github/jan/supabase/network/SupabaseApi;", "supabaseApi", "(Lio/github/jan/supabase/SupabaseClient;Ljava/lang/String;Lx6/m;)Lio/github/jan/supabase/network/SupabaseApi;", "Lio/github/jan/supabase/plugins/MainPlugin;", "plugin", "(Lio/github/jan/supabase/SupabaseClient;Lio/github/jan/supabase/plugins/MainPlugin;)Lio/github/jan/supabase/network/SupabaseApi;", "Lkotlin/Function1;", "resolveUrl", "(Lio/github/jan/supabase/SupabaseClient;Lx6/j;Lx6/m;)Lio/github/jan/supabase/network/SupabaseApi;", "supabase-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SupabaseApiKt {

    /* JADX INFO: renamed from: io.github.jan.supabase.network.SupabaseApiKt$supabaseApi$2, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.j implements p194x6.j {
        public AnonymousClass2(java.lang.Object obj) {
            super(1, 0, io.github.jan.supabase.plugins.MainPlugin.class, obj, "resolveUrl", "resolveUrl(Ljava/lang/String;)Ljava/lang/String;");
        }

        @Override // p194x6.j
        public final java.lang.String invoke(java.lang.String p2) {
            kotlin.jvm.internal.m.e(p2, "p0");
            return ((io.github.jan.supabase.plugins.MainPlugin) this.receiver).resolveUrl(p2);
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.network.SupabaseApiKt$supabaseApi$3, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class AnonymousClass3 extends kotlin.jvm.internal.j implements p194x6.m {
        public AnonymousClass3(java.lang.Object obj) {
            super(2, 0, io.github.jan.supabase.plugins.MainPlugin.class, obj, "parseErrorResponse", "parseErrorResponse(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(io.ktor.client.statement.HttpResponse httpResponse, p100l6.c cVar) {
            return ((io.github.jan.supabase.plugins.MainPlugin) this.receiver).parseErrorResponse(httpResponse, cVar);
        }
    }

    @io.github.jan.supabase.annotations.SupabaseInternal
    public static final io.github.jan.supabase.network.SupabaseApi supabaseApi(io.github.jan.supabase.SupabaseClient supabaseClient, java.lang.String baseUrl, p194x6.m mVar) {
        kotlin.jvm.internal.m.e(supabaseClient, "<this>");
        kotlin.jvm.internal.m.e(baseUrl, "baseUrl");
        return supabaseApi(supabaseClient, new p052f5.a(baseUrl, 5), mVar);
    }

    public static /* synthetic */ io.github.jan.supabase.network.SupabaseApi supabaseApi$default(io.github.jan.supabase.SupabaseClient supabaseClient, java.lang.String str, p194x6.m mVar, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            mVar = null;
        }
        return supabaseApi(supabaseClient, str, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String supabaseApi$lambda$0(java.lang.String str, java.lang.String it) {
        kotlin.jvm.internal.m.e(it, "it");
        return str + it;
    }

    @io.github.jan.supabase.annotations.SupabaseInternal
    public static final io.github.jan.supabase.network.SupabaseApi supabaseApi(io.github.jan.supabase.SupabaseClient supabaseClient, io.github.jan.supabase.plugins.MainPlugin<?> plugin) {
        kotlin.jvm.internal.m.e(supabaseClient, "<this>");
        kotlin.jvm.internal.m.e(plugin, "plugin");
        return supabaseApi(supabaseClient, new io.github.jan.supabase.network.SupabaseApiKt.AnonymousClass2(plugin), new io.github.jan.supabase.network.SupabaseApiKt.AnonymousClass3(plugin));
    }

    public static /* synthetic */ io.github.jan.supabase.network.SupabaseApi supabaseApi$default(io.github.jan.supabase.SupabaseClient supabaseClient, p194x6.j jVar, p194x6.m mVar, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            mVar = null;
        }
        return supabaseApi(supabaseClient, jVar, mVar);
    }

    @io.github.jan.supabase.annotations.SupabaseInternal
    public static final io.github.jan.supabase.network.SupabaseApi supabaseApi(io.github.jan.supabase.SupabaseClient supabaseClient, p194x6.j resolveUrl, p194x6.m mVar) {
        kotlin.jvm.internal.m.e(supabaseClient, "<this>");
        kotlin.jvm.internal.m.e(resolveUrl, "resolveUrl");
        return new io.github.jan.supabase.network.SupabaseApi(resolveUrl, mVar, supabaseClient);
    }
}
