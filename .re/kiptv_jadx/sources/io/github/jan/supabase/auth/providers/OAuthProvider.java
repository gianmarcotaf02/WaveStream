package io.github.jan.supabase.auth.providers;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\\\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\\\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/auth/providers/OAuthProvider;", "Lio/github/jan/supabase/auth/providers/AuthProvider;", "Lio/github/jan/supabase/auth/providers/ExternalAuthConfig;", "Lh6/A;", "<init>", "()V", "Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "Lkotlin/Function2;", "Lio/github/jan/supabase/auth/user/UserSession;", "Ll6/c;", "", "onSuccess", "", "redirectUrl", "Lkotlin/Function1;", "config", "login", "(Lio/github/jan/supabase/SupabaseClient;Lx6/m;Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "signUp", "getName", "()Ljava/lang/String;", "name", "Companion", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class OAuthProvider implements io.github.jan.supabase.auth.providers.AuthProvider<io.github.jan.supabase.auth.providers.ExternalAuthConfig, p070h6.A> {

    /* JADX INFO: renamed from: io.github.jan.supabase.auth.providers.OAuthProvider$login$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.github.jan.supabase.auth.providers.OAuthProvider$login$2", f = "OAuthProvider.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p117n6.i implements p194x6.m {
        final /* synthetic */ io.github.jan.supabase.auth.providers.ExternalAuthConfig $authConfig;
        final /* synthetic */ io.github.jan.supabase.SupabaseClient $supabaseClient;
        /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ io.github.jan.supabase.auth.providers.OAuthProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(io.github.jan.supabase.SupabaseClient supabaseClient, io.github.jan.supabase.auth.providers.OAuthProvider oAuthProvider, io.github.jan.supabase.auth.providers.ExternalAuthConfig externalAuthConfig, p100l6.c cVar) {
            super(2, cVar);
            this.$supabaseClient = supabaseClient;
            this.this$0 = oAuthProvider;
            this.$authConfig = externalAuthConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p070h6.A invokeSuspend$lambda$0(io.github.jan.supabase.auth.providers.ExternalAuthConfig externalAuthConfig, io.github.jan.supabase.auth.providers.ExternalAuthConfigDefaults externalAuthConfigDefaults) {
            externalAuthConfigDefaults.getScopes().addAll(externalAuthConfig.getScopes());
            externalAuthConfigDefaults.getQueryParams().putAll(externalAuthConfig.getQueryParams());
            return p070h6.A.f22523a;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            io.github.jan.supabase.auth.providers.OAuthProvider.AnonymousClass2 anonymousClass2 = new io.github.jan.supabase.auth.providers.OAuthProvider.AnonymousClass2(this.$supabaseClient, this.this$0, this.$authConfig, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            java.lang.String str = (java.lang.String) this.L$0;
            io.github.jan.supabase.auth.Auth auth = io.github.jan.supabase.auth.AuthKt.getAuth(this.$supabaseClient);
            io.github.jan.supabase.auth.providers.OAuthProvider oAuthProvider = this.this$0;
            final io.github.jan.supabase.auth.providers.ExternalAuthConfig externalAuthConfig = this.$authConfig;
            return io.github.jan.supabase.auth.Auth.DefaultImpls.getOAuthUrl$default(auth, oAuthProvider, str, null, new p194x6.j() { // from class: io.github.jan.supabase.auth.providers.a
                @Override // p194x6.j
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.github.jan.supabase.auth.providers.OAuthProvider.AnonymousClass2.invokeSuspend$lambda$0(externalAuthConfig, (io.github.jan.supabase.auth.providers.ExternalAuthConfigDefaults) obj2);
                }
            }, 4, null);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(java.lang.String str, p100l6.c cVar) {
            return ((io.github.jan.supabase.auth.providers.OAuthProvider.AnonymousClass2) create(str, cVar)).invokeSuspend(p070h6.A.f22523a);
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.auth.providers.OAuthProvider$signUp$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.github.jan.supabase.auth.providers.OAuthProvider", f = "OAuthProvider.kt", l = {androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS}, m = "signUp$suspendImpl")
    public static final class AnonymousClass1 extends p117n6.c {
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.github.jan.supabase.auth.providers.OAuthProvider.signUp$suspendImpl(io.github.jan.supabase.auth.providers.OAuthProvider.this, null, null, null, null, this);
        }
    }

    public static java.lang.Object login$suspendImpl(io.github.jan.supabase.auth.providers.OAuthProvider oAuthProvider, io.github.jan.supabase.SupabaseClient supabaseClient, p194x6.m mVar, java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        io.github.jan.supabase.auth.providers.ExternalAuthConfig externalAuthConfig = new io.github.jan.supabase.auth.providers.ExternalAuthConfig();
        if (jVar != null) {
            jVar.invoke(externalAuthConfig);
        }
        java.lang.Object objStartExternalAuth = io.github.jan.supabase.auth.Utils_androidKt.startExternalAuth(io.github.jan.supabase.auth.AuthKt.getAuth(supabaseClient), str, new io.github.jan.supabase.auth.providers.OAuthProvider.AnonymousClass2(supabaseClient, oAuthProvider, externalAuthConfig, null), mVar, cVar);
        return objStartExternalAuth == p109m6.a.f25430h ? objStartExternalAuth : p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static java.lang.Object signUp$suspendImpl(io.github.jan.supabase.auth.providers.OAuthProvider oAuthProvider, io.github.jan.supabase.SupabaseClient supabaseClient, p194x6.m mVar, java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        io.github.jan.supabase.auth.providers.OAuthProvider.AnonymousClass1 anonymousClass1;
        if (cVar instanceof io.github.jan.supabase.auth.providers.OAuthProvider.AnonymousClass1) {
            anonymousClass1 = (io.github.jan.supabase.auth.providers.OAuthProvider.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = oAuthProvider.new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = oAuthProvider.new AnonymousClass1(cVar);
        }
        io.github.jan.supabase.auth.providers.OAuthProvider.AnonymousClass1 anonymousClass2 = anonymousClass1;
        java.lang.Object obj = anonymousClass2.result;
        java.lang.Object obj2 = p109m6.a.f25430h;
        int i9 = anonymousClass2.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            anonymousClass2.label = 1;
            if (oAuthProvider.login(supabaseClient, mVar, str, jVar, anonymousClass2) == obj2) {
                return obj2;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        return p070h6.A.f22523a;
    }

    public abstract java.lang.String getName();

    @Override // io.github.jan.supabase.auth.providers.AuthProvider
    public java.lang.Object login(io.github.jan.supabase.SupabaseClient supabaseClient, p194x6.m mVar, java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return login$suspendImpl(this, supabaseClient, mVar, str, jVar, cVar);
    }

    @Override // io.github.jan.supabase.auth.providers.AuthProvider
    public java.lang.Object signUp(io.github.jan.supabase.SupabaseClient supabaseClient, p194x6.m mVar, java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return signUp$suspendImpl(this, supabaseClient, mVar, str, jVar, cVar);
    }
}
