package io.github.jan.supabase.auth;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23295h;

    public /* synthetic */ a(int i3) {
        this.f23295h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23295h) {
            case 0:
                return io.github.jan.supabase.auth.AuthImpl$linkIdentity$fetchUrl$1.invokeSuspend$lambda$0((io.ktor.client.request.HttpRequestBuilder) obj);
            case 1:
                return io.github.jan.supabase.auth.AndroidKt.handleDeeplinks$lambda$0((io.github.jan.supabase.auth.user.UserSession) obj);
            case 2:
                return io.github.jan.supabase.auth.Auth.DefaultImpls.getOAuthUrl$lambda$1((io.github.jan.supabase.auth.providers.ExternalAuthConfigDefaults) obj);
            case 3:
                return io.github.jan.supabase.auth.Auth.DefaultImpls.linkIdentity$lambda$0((io.github.jan.supabase.auth.providers.ExternalAuthConfigDefaults) obj);
            case 4:
                return io.github.jan.supabase.auth.ExternalAuthAction.CustomTabs._init_$lambda$0((p128p.d) obj);
            case 5:
                return io.github.jan.supabase.auth.GoTrueErrorResponse.descriptor$lambda$0((p135p8.a) obj);
            case 6:
                return io.github.jan.supabase.auth.SettingsSessionManagerKt.settingsJson$lambda$0((p162s8.h) obj);
            default:
                return io.github.jan.supabase.auth.UtilsKt.parseFragmentAndImportSession$lambda$0((io.github.jan.supabase.auth.user.UserSession) obj);
        }
    }
}
