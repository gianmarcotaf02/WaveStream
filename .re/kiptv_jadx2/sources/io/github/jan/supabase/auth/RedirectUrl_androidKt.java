package io.github.jan.supabase.auth;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.annotations.SupabaseInternal;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0001¨\u0006\u0003"}, d2 = {"defaultPlatformRedirectUrl", "", "Lio/github/jan/supabase/auth/Auth;", "auth-kt_release"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RedirectUrl_androidKt {
    @SupabaseInternal
    public static final String defaultPlatformRedirectUrl(Auth auth) {
        m.e(auth, "<this>");
        return AuthConfigKt.getDeepLinkOrNull((AuthConfig) auth.getConfig());
    }
}
