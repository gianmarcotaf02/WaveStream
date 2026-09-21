package io.github.jan.supabase.auth.providers;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J`\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\rH¦@¢\u0006\u0004\b\u000f\u0010\u0010Jb\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\rH¦@¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/providers/AuthProvider;", "C", "R", "", "Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "Lkotlin/Function2;", "Lio/github/jan/supabase/auth/user/UserSession;", "Ll6/c;", "Lh6/A;", "onSuccess", "", "redirectUrl", "Lkotlin/Function1;", "config", "login", "(Lio/github/jan/supabase/SupabaseClient;Lx6/m;Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "signUp", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface AuthProvider<C, R> {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object login$default(io.github.jan.supabase.auth.providers.AuthProvider authProvider, io.github.jan.supabase.SupabaseClient supabaseClient, p194x6.m mVar, java.lang.String str, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i3 & 4) != 0) {
                str = null;
            }
            if ((i3 & 8) != 0) {
                jVar = null;
            }
            return authProvider.login(supabaseClient, mVar, str, jVar, cVar);
        }

        public static /* synthetic */ java.lang.Object signUp$default(io.github.jan.supabase.auth.providers.AuthProvider authProvider, io.github.jan.supabase.SupabaseClient supabaseClient, p194x6.m mVar, java.lang.String str, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signUp");
            }
            if ((i3 & 4) != 0) {
                str = null;
            }
            if ((i3 & 8) != 0) {
                jVar = null;
            }
            return authProvider.signUp(supabaseClient, mVar, str, jVar, cVar);
        }
    }

    java.lang.Object login(io.github.jan.supabase.SupabaseClient supabaseClient, p194x6.m mVar, java.lang.String str, p194x6.j jVar, p100l6.c cVar);

    java.lang.Object signUp(io.github.jan.supabase.SupabaseClient supabaseClient, p194x6.m mVar, java.lang.String str, p194x6.j jVar, p100l6.c cVar);
}
