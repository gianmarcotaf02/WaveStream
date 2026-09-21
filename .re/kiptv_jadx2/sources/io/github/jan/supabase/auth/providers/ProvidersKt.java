package io.github.jan.supabase.auth.providers;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0005"}, d2 = {"invoke", "Lio/github/jan/supabase/auth/providers/OAuthProvider;", "Lio/github/jan/supabase/auth/providers/OAuthProvider$Companion;", "provider", "", "auth-kt_release"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ProvidersKt {
    public static final OAuthProvider invoke(OAuthProvider.Companion companion, String provider) {
        m.e(companion, "<this>");
        m.e(provider, "provider");
        return new OAuthProvider(provider) {
            private final String name;

            {
                this.name = provider;
            }

            @Override
            public String getName() {
                return this.name;
            }
        };
    }
}
