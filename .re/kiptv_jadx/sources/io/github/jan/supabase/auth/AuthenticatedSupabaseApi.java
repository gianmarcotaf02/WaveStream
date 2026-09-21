package io.github.jan.supabase.auth;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bq\b\u0007\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012&\b\u0002\u0010\n\u001a \b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0002H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0002H\u0086@¢\u0006\u0004\b\u0015\u0010\u0017J,\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0002H\u0096@¢\u0006\u0004\b\u0019\u0010\u0016R\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "Lio/github/jan/supabase/network/SupabaseApi;", "Lkotlin/Function1;", "", "resolveUrl", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Ll6/c;", "Lio/github/jan/supabase/exceptions/RestException;", "", "parseErrorResponse", "Lio/ktor/client/request/HttpRequestBuilder;", "Lh6/A;", "defaultRequest", "Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "jwtToken", "<init>", "(Lx6/j;Lx6/m;Lx6/j;Lio/github/jan/supabase/SupabaseClient;Ljava/lang/String;)V", io.sentry.protocol.Request.JsonKeys.URL, "builder", "rawRequest", "(Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "(Lx6/j;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpStatement;", "prepareRequest", "Lx6/j;", "Ljava/lang/String;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AuthenticatedSupabaseApi extends io.github.jan.supabase.network.SupabaseApi {
    private final p194x6.j defaultRequest;
    private final java.lang.String jwtToken;

    /* JADX INFO: renamed from: io.github.jan.supabase.auth.AuthenticatedSupabaseApi$rawRequest$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.github.jan.supabase.auth.AuthenticatedSupabaseApi", f = "AuthenticatedSupabaseApi.kt", l = {24, 25}, m = "rawRequest")
    public static final class AnonymousClass1 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.github.jan.supabase.auth.AuthenticatedSupabaseApi.this.rawRequest(null, null, this);
        }
    }

    public /* synthetic */ AuthenticatedSupabaseApi(p194x6.j jVar, p194x6.m mVar, p194x6.j jVar2, io.github.jan.supabase.SupabaseClient supabaseClient, java.lang.String str, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(jVar, (i3 & 2) != 0 ? null : mVar, (i3 & 4) != 0 ? null : jVar2, supabaseClient, (i3 & 16) != 0 ? null : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A prepareRequest$lambda$1(io.github.jan.supabase.auth.AuthenticatedSupabaseApi authenticatedSupabaseApi, p194x6.j jVar, io.ktor.client.request.HttpRequestBuilder prepareRequest) {
        kotlin.jvm.internal.m.e(prepareRequest, "$this$prepareRequest");
        java.lang.String strCurrentAccessTokenOrNull = authenticatedSupabaseApi.jwtToken;
        if (strCurrentAccessTokenOrNull == null) {
            io.github.jan.supabase.plugins.SupabasePlugin<?> supabasePlugin = authenticatedSupabaseApi.getSupabaseClient().getPluginManager().getInstalledPlugins().get(io.github.jan.supabase.auth.Auth.INSTANCE.getKey());
            if (!(supabasePlugin instanceof io.github.jan.supabase.auth.Auth)) {
                supabasePlugin = null;
            }
            io.github.jan.supabase.auth.Auth auth = (io.github.jan.supabase.auth.Auth) supabasePlugin;
            strCurrentAccessTokenOrNull = auth != null ? auth.currentAccessTokenOrNull() : null;
            if (strCurrentAccessTokenOrNull == null) {
                strCurrentAccessTokenOrNull = authenticatedSupabaseApi.getSupabaseClient().getSupabaseKey();
            }
        }
        io.ktor.client.request.UtilsKt.bearerAuth(prepareRequest, strCurrentAccessTokenOrNull);
        jVar.invoke(prepareRequest);
        p194x6.j jVar2 = authenticatedSupabaseApi.defaultRequest;
        if (jVar2 != null) {
            jVar2.invoke(prepareRequest);
        }
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A rawRequest$lambda$0(java.lang.String str, p194x6.j jVar, io.github.jan.supabase.auth.AuthenticatedSupabaseApi authenticatedSupabaseApi, io.ktor.client.request.HttpRequestBuilder rawRequest) {
        kotlin.jvm.internal.m.e(rawRequest, "$this$rawRequest");
        io.ktor.client.request.UtilsKt.bearerAuth(rawRequest, str);
        jVar.invoke(rawRequest);
        p194x6.j jVar2 = authenticatedSupabaseApi.defaultRequest;
        if (jVar2 != null) {
            jVar2.invoke(rawRequest);
        }
        return p070h6.A.f22523a;
    }

    @Override // io.github.jan.supabase.network.SupabaseApi, io.github.jan.supabase.network.SupabaseHttpClient
    public java.lang.Object prepareRequest(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return super.prepareRequest(str, new p028c8.b(this, jVar, 9), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // io.github.jan.supabase.network.SupabaseApi
    public java.lang.Object rawRequest(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        io.github.jan.supabase.auth.AuthenticatedSupabaseApi.AnonymousClass1 anonymousClass1;
        io.github.jan.supabase.auth.AuthenticatedSupabaseApi authenticatedSupabaseApi;
        if (cVar instanceof io.github.jan.supabase.auth.AuthenticatedSupabaseApi.AnonymousClass1) {
            anonymousClass1 = (io.github.jan.supabase.auth.AuthenticatedSupabaseApi.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.github.jan.supabase.auth.AuthenticatedSupabaseApi.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.github.jan.supabase.auth.AuthenticatedSupabaseApi.AnonymousClass1(cVar);
        }
        io.github.jan.supabase.auth.AuthenticatedSupabaseApi.AnonymousClass1 anonymousClass2 = anonymousClass1;
        java.lang.Object objResolveAccessToken$default = anonymousClass2.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass2.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objResolveAccessToken$default);
            io.github.jan.supabase.SupabaseClient supabaseClient = getSupabaseClient();
            java.lang.String str2 = this.jwtToken;
            anonymousClass2.L$0 = this;
            anonymousClass2.L$1 = str;
            anonymousClass2.L$2 = jVar;
            anonymousClass2.label = 1;
            objResolveAccessToken$default = io.github.jan.supabase.auth.AccessTokenKt.resolveAccessToken$default(supabaseClient, str2, false, (p100l6.c) anonymousClass2, 2, (java.lang.Object) null);
            if (objResolveAccessToken$default != aVar) {
                authenticatedSupabaseApi = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objResolveAccessToken$default);
            return objResolveAccessToken$default;
        }
        jVar = (p194x6.j) anonymousClass2.L$2;
        str = (java.lang.String) anonymousClass2.L$1;
        authenticatedSupabaseApi = (io.github.jan.supabase.auth.AuthenticatedSupabaseApi) anonymousClass2.L$0;
        com.google.common.util.concurrent.P.u0(objResolveAccessToken$default);
        java.lang.String str3 = (java.lang.String) objResolveAccessToken$default;
        if (str3 == null) {
            throw new java.lang.IllegalStateException("No access token available");
        }
        D5.C0260n c0260n = new D5.C0260n(str3, jVar, authenticatedSupabaseApi, 17);
        anonymousClass2.L$0 = null;
        anonymousClass2.L$1 = null;
        anonymousClass2.L$2 = null;
        anonymousClass2.label = 2;
        java.lang.Object objRawRequest = super.rawRequest(str, c0260n, anonymousClass2);
        return objRawRequest == aVar ? aVar : objRawRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @io.github.jan.supabase.annotations.SupabaseInternal
    public AuthenticatedSupabaseApi(p194x6.j resolveUrl, p194x6.m mVar, p194x6.j jVar, io.github.jan.supabase.SupabaseClient supabaseClient, java.lang.String str) {
        super(resolveUrl, mVar, supabaseClient);
        kotlin.jvm.internal.m.e(resolveUrl, "resolveUrl");
        kotlin.jvm.internal.m.e(supabaseClient, "supabaseClient");
        this.defaultRequest = jVar;
        this.jwtToken = str;
    }

    public final java.lang.Object rawRequest(p194x6.j jVar, p100l6.c cVar) {
        return rawRequest("", jVar, cVar);
    }
}
