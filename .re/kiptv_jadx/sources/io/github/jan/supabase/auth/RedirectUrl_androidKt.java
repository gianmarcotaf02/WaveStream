package io.github.jan.supabase.auth;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0001¨\u0006\u0003"}, d2 = {"defaultPlatformRedirectUrl", "", "Lio/github/jan/supabase/auth/Auth;", "auth-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RedirectUrl_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    @io.github.jan.supabase.annotations.SupabaseInternal
    public static final java.lang.String defaultPlatformRedirectUrl(io.github.jan.supabase.auth.Auth auth) {
        kotlin.jvm.internal.m.e(auth, "<this>");
        return io.github.jan.supabase.auth.AuthConfigKt.getDeepLinkOrNull((io.github.jan.supabase.auth.AuthConfig) auth.getConfig());
    }
}
