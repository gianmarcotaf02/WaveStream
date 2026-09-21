package io.github.jan.supabase.auth;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aC\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\b\u0002\u0010\b\u001a \b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\n\u001a\u00020\t*\u00020\u00002\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\n\u0010\u0012\u001as\u0010\n\u001a\u00020\t*\u00020\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000e2&\b\u0002\u0010\b\u001a \b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00032\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\n\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/SupabaseClient;", "", "baseUrl", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Ll6/c;", "Lio/github/jan/supabase/exceptions/RestException;", "", "parseErrorResponse", "Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "authenticatedSupabaseApi", "(Lio/github/jan/supabase/SupabaseClient;Ljava/lang/String;Lx6/m;)Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "Lio/github/jan/supabase/plugins/MainPlugin;", "plugin", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lh6/A;", "defaultRequest", "(Lio/github/jan/supabase/SupabaseClient;Lio/github/jan/supabase/plugins/MainPlugin;Lx6/j;)Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "resolveUrl", "jwtToken", "(Lio/github/jan/supabase/SupabaseClient;Lx6/j;Lx6/m;Lx6/j;Ljava/lang/String;)Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "auth-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AuthenticatedSupabaseApiKt {

    /* JADX INFO: renamed from: io.github.jan.supabase.auth.AuthenticatedSupabaseApiKt$authenticatedSupabaseApi$2, reason: invalid class name */
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

    /* JADX INFO: renamed from: io.github.jan.supabase.auth.AuthenticatedSupabaseApiKt$authenticatedSupabaseApi$3, reason: invalid class name */
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
    public static final io.github.jan.supabase.auth.AuthenticatedSupabaseApi authenticatedSupabaseApi(io.github.jan.supabase.SupabaseClient supabaseClient, java.lang.String baseUrl, p194x6.m mVar) {
        kotlin.jvm.internal.m.e(supabaseClient, "<this>");
        kotlin.jvm.internal.m.e(baseUrl, "baseUrl");
        return authenticatedSupabaseApi$default(supabaseClient, new p052f5.a(baseUrl, 4), mVar, null, null, 12, null);
    }

    public static /* synthetic */ io.github.jan.supabase.auth.AuthenticatedSupabaseApi authenticatedSupabaseApi$default(io.github.jan.supabase.SupabaseClient supabaseClient, java.lang.String str, p194x6.m mVar, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            mVar = null;
        }
        return authenticatedSupabaseApi(supabaseClient, str, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String authenticatedSupabaseApi$lambda$0(java.lang.String str, java.lang.String it) {
        kotlin.jvm.internal.m.e(it, "it");
        return str + it;
    }

    @io.github.jan.supabase.annotations.SupabaseInternal
    public static final io.github.jan.supabase.auth.AuthenticatedSupabaseApi authenticatedSupabaseApi(io.github.jan.supabase.SupabaseClient supabaseClient, io.github.jan.supabase.plugins.MainPlugin<?> plugin, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(supabaseClient, "<this>");
        kotlin.jvm.internal.m.e(plugin, "plugin");
        return authenticatedSupabaseApi(supabaseClient, new io.github.jan.supabase.auth.AuthenticatedSupabaseApiKt.AnonymousClass2(plugin), new io.github.jan.supabase.auth.AuthenticatedSupabaseApiKt.AnonymousClass3(plugin), jVar, ((io.github.jan.supabase.plugins.MainConfig) plugin.getConfig()).getJwtToken());
    }

    public static /* synthetic */ io.github.jan.supabase.auth.AuthenticatedSupabaseApi authenticatedSupabaseApi$default(io.github.jan.supabase.SupabaseClient supabaseClient, io.github.jan.supabase.plugins.MainPlugin mainPlugin, p194x6.j jVar, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            jVar = null;
        }
        return authenticatedSupabaseApi(supabaseClient, (io.github.jan.supabase.plugins.MainPlugin<?>) mainPlugin, jVar);
    }

    @io.github.jan.supabase.annotations.SupabaseInternal
    public static final io.github.jan.supabase.auth.AuthenticatedSupabaseApi authenticatedSupabaseApi(io.github.jan.supabase.SupabaseClient supabaseClient, p194x6.j resolveUrl, p194x6.m mVar, p194x6.j jVar, java.lang.String str) {
        kotlin.jvm.internal.m.e(supabaseClient, "<this>");
        kotlin.jvm.internal.m.e(resolveUrl, "resolveUrl");
        return new io.github.jan.supabase.auth.AuthenticatedSupabaseApi(resolveUrl, mVar, jVar, supabaseClient, str);
    }

    public static /* synthetic */ io.github.jan.supabase.auth.AuthenticatedSupabaseApi authenticatedSupabaseApi$default(io.github.jan.supabase.SupabaseClient supabaseClient, p194x6.j jVar, p194x6.m mVar, p194x6.j jVar2, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            mVar = null;
        }
        if ((i3 & 4) != 0) {
            jVar2 = null;
        }
        if ((i3 & 8) != 0) {
            str = null;
        }
        return authenticatedSupabaseApi(supabaseClient, jVar, mVar, jVar2, str);
    }
}
