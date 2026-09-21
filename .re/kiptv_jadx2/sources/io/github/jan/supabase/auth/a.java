package io.github.jan.supabase.auth;

import io.github.jan.supabase.auth.providers.ExternalAuthConfigDefaults;
import io.github.jan.supabase.auth.user.UserSession;
import io.ktor.client.request.HttpRequestBuilder;
import p128p.d;
import p162s8.h;
import p194x6.j;

public final class a implements j {

    public final int f23295h;

    public a(int i3) {
        this.f23295h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23295h) {
            case 0:
                return AuthImpl$linkIdentity$fetchUrl$1.invokeSuspend$lambda$0((HttpRequestBuilder) obj);
            case 1:
                return AndroidKt.handleDeeplinks$lambda$0((UserSession) obj);
            case 2:
                return Auth.DefaultImpls.getOAuthUrl$lambda$1((ExternalAuthConfigDefaults) obj);
            case 3:
                return Auth.DefaultImpls.linkIdentity$lambda$0((ExternalAuthConfigDefaults) obj);
            case 4:
                return ExternalAuthAction.CustomTabs._init_$lambda$0((d) obj);
            case 5:
                return GoTrueErrorResponse.descriptor$lambda$0((p135p8.a) obj);
            case 6:
                return SettingsSessionManagerKt.settingsJson$lambda$0((h) obj);
            default:
                return UtilsKt.parseFragmentAndImportSession$lambda$0((UserSession) obj);
        }
    }
}
