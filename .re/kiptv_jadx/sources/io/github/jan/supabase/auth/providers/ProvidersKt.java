package io.github.jan.supabase.auth.providers;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0005"}, d2 = {"invoke", "Lio/github/jan/supabase/auth/providers/OAuthProvider;", "Lio/github/jan/supabase/auth/providers/OAuthProvider$Companion;", "provider", "", "auth-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ProvidersKt {
    public static final io.github.jan.supabase.auth.providers.OAuthProvider invoke(io.github.jan.supabase.auth.providers.OAuthProvider.Companion companion, java.lang.String provider) {
        kotlin.jvm.internal.m.e(companion, "<this>");
        kotlin.jvm.internal.m.e(provider, "provider");
        return new io.github.jan.supabase.auth.providers.OAuthProvider(provider) { // from class: io.github.jan.supabase.auth.providers.ProvidersKt.invoke.1
            private final java.lang.String name;

            {
                this.name = provider;
            }

            @Override // io.github.jan.supabase.auth.providers.OAuthProvider
            public java.lang.String getName() {
                return this.name;
            }
        };
    }
}
