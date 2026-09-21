package io.github.jan.supabase.auth.providers;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.common.util.concurrent.P;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.auth.Auth;
import io.github.jan.supabase.auth.AuthKt;
import io.github.jan.supabase.auth.Utils_androidKt;
import kotlin.Metadata;
import p070h6.A;
import p100l6.c;
import p117n6.e;
import p117n6.i;
import p194x6.j;
import p194x6.m;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\\\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\\\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/auth/providers/OAuthProvider;", "Lio/github/jan/supabase/auth/providers/AuthProvider;", "Lio/github/jan/supabase/auth/providers/ExternalAuthConfig;", "Lh6/A;", "<init>", "()V", "Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "Lkotlin/Function2;", "Lio/github/jan/supabase/auth/user/UserSession;", "Ll6/c;", "", "onSuccess", "", "redirectUrl", "Lkotlin/Function1;", "config", "login", "(Lio/github/jan/supabase/SupabaseClient;Lx6/m;Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "signUp", "getName", "()Ljava/lang/String;", "name", "Companion", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class OAuthProvider implements AuthProvider<ExternalAuthConfig, A> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.github.jan.supabase.auth.providers.OAuthProvider$login$2", f = "OAuthProvider.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements m {
        final ExternalAuthConfig $authConfig;
        final SupabaseClient $supabaseClient;
        Object L$0;
        int label;
        final OAuthProvider this$0;

        public AnonymousClass2(SupabaseClient supabaseClient, OAuthProvider oAuthProvider, ExternalAuthConfig externalAuthConfig, c cVar) {
            super(2, cVar);
            this.$supabaseClient = supabaseClient;
            this.this$0 = oAuthProvider;
            this.$authConfig = externalAuthConfig;
        }

        public static final A invokeSuspend$lambda$0(ExternalAuthConfig externalAuthConfig, ExternalAuthConfigDefaults externalAuthConfigDefaults) {
            externalAuthConfigDefaults.getScopes().addAll(externalAuthConfig.getScopes());
            externalAuthConfigDefaults.getQueryParams().putAll(externalAuthConfig.getQueryParams());
            return A.f22523a;
        }

        @Override
        public final c create(Object obj, c cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$supabaseClient, this.this$0, this.$authConfig, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
            String str = (String) this.L$0;
            Auth auth = AuthKt.getAuth(this.$supabaseClient);
            OAuthProvider oAuthProvider = this.this$0;
            final ExternalAuthConfig externalAuthConfig = this.$authConfig;
            return Auth.DefaultImpls.getOAuthUrl$default(auth, oAuthProvider, str, null, new j() {
                @Override
                public final Object invoke(Object obj2) {
                    return OAuthProvider.AnonymousClass2.invokeSuspend$lambda$0(externalAuthConfig, (ExternalAuthConfigDefaults) obj2);
                }
            }, 4, null);
        }

        @Override
        public final Object invoke(String str, c cVar) {
            return ((AnonymousClass2) create(str, cVar)).invokeSuspend(A.f22523a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.github.jan.supabase.auth.providers.OAuthProvider", f = "OAuthProvider.kt", l = {TsExtractor.TS_STREAM_TYPE_MHAS}, m = "signUp$suspendImpl")
    public static final class AnonymousClass1 extends p117n6.c {
        int label;
        Object result;

        public AnonymousClass1(c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OAuthProvider.signUp$suspendImpl(OAuthProvider.this, null, null, null, null, this);
        }
    }

    public static Object login$suspendImpl(OAuthProvider oAuthProvider, SupabaseClient supabaseClient, m mVar, String str, j jVar, c cVar) {
        ExternalAuthConfig externalAuthConfig = new ExternalAuthConfig();
        if (jVar != null) {
            jVar.invoke(externalAuthConfig);
        }
        Object objStartExternalAuth = Utils_androidKt.startExternalAuth(AuthKt.getAuth(supabaseClient), str, new AnonymousClass2(supabaseClient, oAuthProvider, externalAuthConfig, null), mVar, cVar);
        return objStartExternalAuth == p109m6.a.f25430h ? objStartExternalAuth : A.f22523a;
    }

    public static Object signUp$suspendImpl(OAuthProvider oAuthProvider, SupabaseClient supabaseClient, m mVar, String str, j jVar, c cVar) {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = oAuthProvider.new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = oAuthProvider.new AnonymousClass1(cVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        Object obj2 = p109m6.a.f25430h;
        int i9 = anonymousClass2.label;
        if (i9 == 0) {
            P.u0(obj);
            anonymousClass2.label = 1;
            if (oAuthProvider.login(supabaseClient, mVar, str, jVar, anonymousClass2) == obj2) {
                return obj2;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
        }
        return A.f22523a;
    }

    public abstract String getName();

    @Override
    public Object login(SupabaseClient supabaseClient, m mVar, String str, j jVar, c cVar) {
        return login$suspendImpl(this, supabaseClient, mVar, str, jVar, cVar);
    }

    @Override
    public Object signUp(SupabaseClient supabaseClient, m mVar, String str, j jVar, c cVar) {
        return signUp$suspendImpl(this, supabaseClient, mVar, str, jVar, cVar);
    }
}
