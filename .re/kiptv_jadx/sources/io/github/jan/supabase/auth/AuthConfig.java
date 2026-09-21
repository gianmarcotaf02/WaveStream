package io.github.jan.supabase.auth;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/github/jan/supabase/auth/AuthConfig;", "Lio/github/jan/supabase/plugins/CustomSerializationConfig;", "Lio/github/jan/supabase/auth/AuthConfigDefaults;", "<init>", "()V", "defaultExternalAuthAction", "Lio/github/jan/supabase/auth/ExternalAuthAction;", "getDefaultExternalAuthAction", "()Lio/github/jan/supabase/auth/ExternalAuthAction;", "setDefaultExternalAuthAction", "(Lio/github/jan/supabase/auth/ExternalAuthAction;)V", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AuthConfig extends io.github.jan.supabase.auth.AuthConfigDefaults implements io.github.jan.supabase.plugins.CustomSerializationConfig {
    private io.github.jan.supabase.auth.ExternalAuthAction defaultExternalAuthAction = io.github.jan.supabase.auth.ExternalAuthAction.INSTANCE.getDEFAULT();

    public final io.github.jan.supabase.auth.ExternalAuthAction getDefaultExternalAuthAction() {
        return this.defaultExternalAuthAction;
    }

    public final void setDefaultExternalAuthAction(io.github.jan.supabase.auth.ExternalAuthAction externalAuthAction) {
        kotlin.jvm.internal.m.e(externalAuthAction, "<set-?>");
        this.defaultExternalAuthAction = externalAuthAction;
    }
}
