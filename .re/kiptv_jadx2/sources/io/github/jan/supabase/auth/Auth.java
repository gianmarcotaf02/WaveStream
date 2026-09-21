package io.github.jan.supabase.auth;

import O7.q;
import V7.l0;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.common.util.concurrent.P;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.SupabaseClientBuilder;
import io.github.jan.supabase.auth.admin.AdminApi;
import io.github.jan.supabase.auth.mfa.MfaApi;
import io.github.jan.supabase.auth.providers.AuthProvider;
import io.github.jan.supabase.auth.providers.ExternalAuthConfigDefaults;
import io.github.jan.supabase.auth.providers.OAuthProvider;
import io.github.jan.supabase.auth.status.SessionSource;
import io.github.jan.supabase.auth.status.SessionStatus;
import io.github.jan.supabase.auth.user.Identity;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.auth.user.UserSession;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import io.github.jan.supabase.plugins.CustomSerializationPlugin;
import io.github.jan.supabase.plugins.MainPlugin;
import io.github.jan.supabase.plugins.SupabasePluginProvider;
import io.sentry.SentryEvent;
import io.sentry.Session;
import io.sentry.protocol.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p036d8.d;
import p070h6.A;
import p100l6.c;
import p117n6.e;
import p194x6.j;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u0080\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0080\u0001J`\u0010\u000e\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005\"\u0014\b\u0002\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ^\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005\"\u0014\b\u0002\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH¦@¢\u0006\u0004\b\u0010\u0010\u000fJ(\u0010\u0014\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b\u0014\u0010\u0015J<\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u00162\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u000bH¦@¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH¦@¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010!\u001a\u00020 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0\u000bH¦@¢\u0006\u0004\b!\u0010\"J:\u0010&\u001a\u00020%2\b\b\u0002\u0010#\u001a\u00020\u001b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\u000bH¦@¢\u0006\u0004\b&\u0010'J,\u0010+\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b+\u0010,J,\u0010/\u001a\u00020\f2\u0006\u0010)\u001a\u00020-2\u0006\u0010.\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b/\u00100J0\u00101\u001a\u00020\f2\u0006\u0010*\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\fH¦@¢\u0006\u0004\b3\u00104J4\u00106\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\t2\u0006\u00105\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b6\u00107J,\u00106\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\u0006\u00108\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b6\u0010,J4\u00109\u001a\u00020\f2\u0006\u0010)\u001a\u00020-2\u0006\u0010.\u001a\u00020\t2\u0006\u00105\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b9\u0010:J\u0018\u0010<\u001a\u00020%2\u0006\u0010;\u001a\u00020\tH¦@¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020%2\b\b\u0002\u0010>\u001a\u00020\u001bH¦@¢\u0006\u0004\b?\u0010@J\u001a\u0010C\u001a\u00020\f2\b\b\u0002\u0010B\u001a\u00020AH¦@¢\u0006\u0004\bC\u0010DJ,\u0010J\u001a\u00020\f2\u0006\u0010F\u001a\u00020E2\b\b\u0002\u0010G\u001a\u00020\u001b2\b\b\u0002\u0010I\u001a\u00020HH¦@¢\u0006\u0004\bJ\u0010KJ6\u0010N\u001a\u00020\f2\u0006\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\t2\b\b\u0002\u0010<\u001a\u00020\u001b2\b\b\u0002\u0010G\u001a\u00020\u001bH\u0096@¢\u0006\u0004\bN\u0010OJ\u001a\u0010P\u001a\u00020\u001b2\b\b\u0002\u0010G\u001a\u00020\u001bH¦@¢\u0006\u0004\bP\u0010@J\u0018\u0010Q\u001a\u00020E2\u0006\u0010M\u001a\u00020\tH¦@¢\u0006\u0004\bQ\u0010=J\u0010\u0010R\u001a\u00020\fH¦@¢\u0006\u0004\bR\u00104J\u0010\u0010S\u001a\u00020\fH¦@¢\u0006\u0004\bS\u00104J\"\u0010V\u001a\u00020E2\u0006\u0010T\u001a\u00020\t2\b\b\u0002\u0010U\u001a\u00020\u001bH¦@¢\u0006\u0004\bV\u0010\u001eJ\u0010\u0010W\u001a\u00020\fH¦@¢\u0006\u0004\bW\u00104JC\u0010Z\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00162\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010X\u001a\u00020\t2\u0014\b\u0002\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u000bH&¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\fH&¢\u0006\u0004\b\\\u0010]J\u0011\u0010^\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b^\u0010_J\u0011\u0010`\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\b`\u0010aJ\u0011\u0010b\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010f\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010dH\u0016¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020\fH¦@¢\u0006\u0004\bh\u00104R\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020j0i8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020p8&X¦\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8&X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~\u0082\u0001\u0002\u0081\u0001¨\u0006\u0082\u0001"}, d2 = {"Lio/github/jan/supabase/auth/Auth;", "Lio/github/jan/supabase/plugins/MainPlugin;", "Lio/github/jan/supabase/auth/AuthConfig;", "Lio/github/jan/supabase/plugins/CustomSerializationPlugin;", "C", "R", "Lio/github/jan/supabase/auth/providers/AuthProvider;", "Provider", "provider", "", "redirectUrl", "Lkotlin/Function1;", "Lh6/A;", "config", "signUpWith", "(Lio/github/jan/supabase/auth/providers/AuthProvider;Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "signInWith", "Lkotlinx/serialization/json/c;", "data", "captchaToken", "signInAnonymously", "(Lkotlinx/serialization/json/c;Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "Lio/github/jan/supabase/auth/providers/OAuthProvider;", "Lio/github/jan/supabase/auth/providers/ExternalAuthConfigDefaults;", "linkIdentity", "(Lio/github/jan/supabase/auth/providers/OAuthProvider;Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "identityId", "", "updateLocalUser", "unlinkIdentity", "(Ljava/lang/String;ZLl6/c;)Ljava/lang/Object;", "Lio/github/jan/supabase/auth/providers/builtin/SSO$Config;", "Lio/github/jan/supabase/auth/providers/builtin/SSO$Result;", "retrieveSSOUrl", "(Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "updateCurrentUser", "Lio/github/jan/supabase/auth/user/UserUpdateBuilder;", "Lio/github/jan/supabase/auth/user/UserInfo;", "updateUser", "(ZLjava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "Lio/github/jan/supabase/auth/OtpType$Email;", "type", "email", "resendEmail", "(Lio/github/jan/supabase/auth/OtpType$Email;Ljava/lang/String;Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "Lio/github/jan/supabase/auth/OtpType$Phone;", "phone", "resendPhone", "(Lio/github/jan/supabase/auth/OtpType$Phone;Ljava/lang/String;Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "resetPasswordForEmail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "reauthenticate", "(Ll6/c;)Ljava/lang/Object;", "token", "verifyEmailOtp", "(Lio/github/jan/supabase/auth/OtpType$Email;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "tokenHash", "verifyPhoneOtp", "(Lio/github/jan/supabase/auth/OtpType$Phone;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "jwt", "retrieveUser", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "updateSession", "retrieveUserForCurrentSession", "(ZLl6/c;)Ljava/lang/Object;", "Lio/github/jan/supabase/auth/SignOutScope;", "scope", "signOut", "(Lio/github/jan/supabase/auth/SignOutScope;Ll6/c;)Ljava/lang/Object;", "Lio/github/jan/supabase/auth/user/UserSession;", "session", "autoRefresh", "Lio/github/jan/supabase/auth/status/SessionSource;", "source", "importSession", "(Lio/github/jan/supabase/auth/user/UserSession;ZLio/github/jan/supabase/auth/status/SessionSource;Ll6/c;)Ljava/lang/Object;", "accessToken", "refreshToken", "importAuthToken", "(Ljava/lang/String;Ljava/lang/String;ZZLl6/c;)Ljava/lang/Object;", "loadFromStorage", "refreshSession", "refreshCurrentSession", "clearSession", "code", "saveSession", "exchangeCodeForSession", "startAutoRefreshForCurrentSession", Request.JsonKeys.URL, "additionalConfig", "getOAuthUrl", "(Lio/github/jan/supabase/auth/providers/OAuthProvider;Ljava/lang/String;Ljava/lang/String;Lx6/j;)Ljava/lang/String;", "stopAutoRefreshForCurrentSession", "()V", "currentAccessTokenOrNull", "()Ljava/lang/String;", "currentSessionOrNull", "()Lio/github/jan/supabase/auth/user/UserSession;", "currentUserOrNull", "()Lio/github/jan/supabase/auth/user/UserInfo;", "", "Lio/github/jan/supabase/auth/user/Identity;", "currentIdentitiesOrNull", "()Ljava/util/List;", "awaitInitialization", "LV7/l0;", "Lio/github/jan/supabase/auth/status/SessionStatus;", "getSessionStatus", "()LV7/l0;", "sessionStatus", "isAutoRefreshRunning", "()Z", "Lio/github/jan/supabase/auth/SessionManager;", "getSessionManager", "()Lio/github/jan/supabase/auth/SessionManager;", "sessionManager", "Lio/github/jan/supabase/auth/admin/AdminApi;", "getAdmin", "()Lio/github/jan/supabase/auth/admin/AdminApi;", "admin", "Lio/github/jan/supabase/auth/mfa/MfaApi;", "getMfa", "()Lio/github/jan/supabase/auth/mfa/MfaApi;", "mfa", "Lio/github/jan/supabase/auth/CodeVerifierCache;", "getCodeVerifierCache", "()Lio/github/jan/supabase/auth/CodeVerifierCache;", "codeVerifierCache", "Companion", "Lio/github/jan/supabase/auth/AuthImpl;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface Auth extends MainPlugin<AuthConfig>, CustomSerializationPlugin {
    public static final int API_VERSION = 1;

    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/github/jan/supabase/auth/Auth$Companion;", "Lio/github/jan/supabase/plugins/SupabasePluginProvider;", "Lio/github/jan/supabase/auth/AuthConfig;", "Lio/github/jan/supabase/auth/Auth;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", Session.JsonKeys.INIT, "createConfig", "(Lx6/j;)Lio/github/jan/supabase/auth/AuthConfig;", "Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "config", "create", "(Lio/github/jan/supabase/SupabaseClient;Lio/github/jan/supabase/auth/AuthConfig;)Lio/github/jan/supabase/auth/Auth;", "", SubscriberAttributeKt.JSON_NAME_KEY, "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Lio/github/jan/supabase/logging/SupabaseLogger;", SentryEvent.JsonKeys.LOGGER, "Lio/github/jan/supabase/logging/SupabaseLogger;", "getLogger", "()Lio/github/jan/supabase/logging/SupabaseLogger;", "", "API_VERSION", "I", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements SupabasePluginProvider<AuthConfig, Auth> {
        public static final int API_VERSION = 1;
        static final Companion $$INSTANCE = new Companion();
        private static final String key = "auth";
        private static final SupabaseLogger logger = SupabaseClient.Companion.createLogger$default(SupabaseClient.INSTANCE, "Supabase-Auth", null, 2, null);

        private Companion() {
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public SupabaseLogger getLogger() {
            return logger;
        }

        @Override
        public void setLogLevel(LogLevel logLevel) {
            SupabasePluginProvider.DefaultImpls.setLogLevel(this, logLevel);
        }

        @Override
        public void setup(SupabaseClientBuilder supabaseClientBuilder, AuthConfig authConfig) {
            SupabasePluginProvider.DefaultImpls.setup(this, supabaseClientBuilder, authConfig);
        }

        @Override
        public Auth create(SupabaseClient supabaseClient, AuthConfig config) {
            m.e(supabaseClient, "supabaseClient");
            m.e(config, "config");
            return new AuthImpl(supabaseClient, config);
        }

        @Override
        public AuthConfig createConfig(j init) {
            m.e(init, "init");
            AuthConfig authConfig = new AuthConfig();
            init.invoke(authConfig);
            return authConfig;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static Object close(Auth auth, c cVar) {
            Object objClose = MainPlugin.DefaultImpls.close(auth, cVar);
            return objClose == p109m6.a.f25430h ? objClose : A.f22523a;
        }

        public static String currentAccessTokenOrNull(Auth auth) {
            UserSession userSessionCurrentSessionOrNull = auth.currentSessionOrNull();
            if (userSessionCurrentSessionOrNull != null) {
                return userSessionCurrentSessionOrNull.getAccessToken();
            }
            return null;
        }

        public static List<Identity> currentIdentitiesOrNull(Auth auth) {
            UserInfo userInfoCurrentUserOrNull = auth.currentUserOrNull();
            if (userInfoCurrentUserOrNull != null) {
                return userInfoCurrentUserOrNull.getIdentities();
            }
            return null;
        }

        public static UserSession currentSessionOrNull(Auth auth) {
            SessionStatus sessionStatus = (SessionStatus) auth.getSessionStatus().getValue();
            if (sessionStatus instanceof SessionStatus.Authenticated) {
                return ((SessionStatus.Authenticated) sessionStatus).getSession();
            }
            return null;
        }

        public static UserInfo currentUserOrNull(Auth auth) {
            UserSession userSessionCurrentSessionOrNull = auth.currentSessionOrNull();
            if (userSessionCurrentSessionOrNull != null) {
                return userSessionCurrentSessionOrNull.getUser();
            }
            return null;
        }

        public static Object exchangeCodeForSession$default(Auth auth, String str, boolean z6, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exchangeCodeForSession");
            }
            if ((i3 & 2) != 0) {
                z6 = true;
            }
            return auth.exchangeCodeForSession(str, z6, cVar);
        }

        public static String getOAuthUrl$default(Auth auth, OAuthProvider oAuthProvider, String str, String str2, j jVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOAuthUrl");
            }
            if ((i3 & 2) != 0) {
                str = RedirectUrlKt.defaultRedirectUrl(auth);
            }
            if ((i3 & 4) != 0) {
                str2 = "authorize";
            }
            if ((i3 & 8) != 0) {
                jVar = new a(2);
            }
            return auth.getOAuthUrl(oAuthProvider, str, str2, jVar);
        }

        public static A getOAuthUrl$lambda$1(ExternalAuthConfigDefaults externalAuthConfigDefaults) {
            m.e(externalAuthConfigDefaults, "<this>");
            return A.f22523a;
        }

        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object importAuthToken(Auth auth, String str, String str2, boolean z6, boolean z9, c cVar) {
            AnonymousClass1 anonymousClass1;
            String str3;
            String str4;
            String str5;
            UserInfo userInfo;
            long j;
            boolean z10;
            String str6;
            String str7;
            Auth auth2;
            boolean z11;
            Auth auth3;
            String str8;
            long j9;
            String str9;
            String str10;
            String str11;
            if (cVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) cVar;
                int i3 = anonymousClass1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i3 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(cVar);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
            AnonymousClass1 anonymousClass2 = anonymousClass1;
            Object obj = anonymousClass2.result;
            p109m6.a aVar = p109m6.a.f25430h;
            int i9 = anonymousClass2.label;
            if (i9 != 0) {
                if (i9 == 1) {
                    j9 = anonymousClass2.J$0;
                    z11 = anonymousClass2.Z$0;
                    str11 = (String) anonymousClass2.L$5;
                    str9 = (String) anonymousClass2.L$4;
                    str10 = (String) anonymousClass2.L$3;
                    str7 = (String) anonymousClass2.L$2;
                    str8 = (String) anonymousClass2.L$1;
                    auth3 = (Auth) anonymousClass2.L$0;
                    P.u0(obj);
                } else {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    P.u0(obj);
                }
                return A.f22523a;
            }
            P.u0(obj);
            if (z6) {
                anonymousClass2.L$0 = auth;
                anonymousClass2.L$1 = str;
                anonymousClass2.L$2 = str2;
                anonymousClass2.L$3 = "";
                anonymousClass2.L$4 = "";
                anonymousClass2.L$5 = "";
                anonymousClass2.Z$0 = z9;
                anonymousClass2.J$0 = 0L;
                anonymousClass2.label = 1;
                Object objTryToGetUser = AuthKt.tryToGetUser(auth, str, anonymousClass2);
                if (objTryToGetUser != aVar) {
                    str7 = str2;
                    z11 = z9;
                    auth3 = auth;
                    str8 = str;
                    j9 = 0;
                    str9 = "";
                    str10 = str9;
                    obj = objTryToGetUser;
                    str11 = str10;
                }
            } else {
                str3 = "";
                str4 = str3;
                str5 = str4;
                userInfo = null;
                j = 0;
                z10 = z9;
                str6 = str;
                str7 = str2;
                auth2 = auth;
                UserSession userSession = new UserSession(str6, str7, str3, str4, j, str5, userInfo, (String) null, (d) null, RendererCapabilities.DECODER_SUPPORT_MASK, (AbstractC2541f) null);
                anonymousClass2.L$0 = null;
                anonymousClass2.L$1 = null;
                anonymousClass2.L$2 = null;
                anonymousClass2.L$3 = null;
                anonymousClass2.L$4 = null;
                anonymousClass2.L$5 = null;
                anonymousClass2.label = 2;
            }
            return aVar;
            String str12 = str8;
            str3 = str10;
            str6 = str12;
            j = j9;
            userInfo = (UserInfo) obj;
            str5 = str11;
            z10 = z11;
            auth2 = auth3;
            str4 = str9;
            UserSession userSession2 = new UserSession(str6, str7, str3, str4, j, str5, userInfo, (String) null, (d) null, RendererCapabilities.DECODER_SUPPORT_MASK, (AbstractC2541f) null);
            anonymousClass2.L$0 = null;
            anonymousClass2.L$1 = null;
            anonymousClass2.L$2 = null;
            anonymousClass2.L$3 = null;
            anonymousClass2.L$4 = null;
            anonymousClass2.L$5 = null;
            anonymousClass2.label = 2;
        }

        public static Object importAuthToken$default(Auth auth, String str, String str2, boolean z6, boolean z9, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: importAuthToken");
            }
            if ((i3 & 2) != 0) {
                str2 = "";
            }
            String str3 = str2;
            boolean z10 = (i3 & 4) != 0 ? false : z6;
            if ((i3 & 8) != 0) {
                z9 = !q.N0(str3) ? ((AuthConfig) auth.getConfig()).getAlwaysAutoRefresh() : false;
            }
            return auth.importAuthToken(str, str3, z10, z9, cVar);
        }

        public static Object importSession$default(Auth auth, UserSession userSession, boolean z6, SessionSource sessionSource, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: importSession");
            }
            if ((i3 & 2) != 0) {
                z6 = ((AuthConfig) auth.getConfig()).getAlwaysAutoRefresh();
            }
            if ((i3 & 4) != 0) {
                sessionSource = SessionSource.Unknown.INSTANCE;
            }
            return auth.importSession(userSession, z6, sessionSource, cVar);
        }

        public static void init(Auth auth) {
            MainPlugin.DefaultImpls.init(auth);
        }

        public static Object linkIdentity$default(Auth auth, OAuthProvider oAuthProvider, String str, j jVar, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkIdentity");
            }
            if ((i3 & 2) != 0) {
                str = RedirectUrlKt.defaultRedirectUrl(auth);
            }
            if ((i3 & 4) != 0) {
                jVar = new a(3);
            }
            return auth.linkIdentity(oAuthProvider, str, jVar, cVar);
        }

        public static A linkIdentity$lambda$0(ExternalAuthConfigDefaults externalAuthConfigDefaults) {
            m.e(externalAuthConfigDefaults, "<this>");
            return A.f22523a;
        }

        public static Object loadFromStorage$default(Auth auth, boolean z6, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadFromStorage");
            }
            if ((i3 & 1) != 0) {
                z6 = ((AuthConfig) auth.getConfig()).getAlwaysAutoRefresh();
            }
            return auth.loadFromStorage(z6, cVar);
        }

        public static Object resendEmail$default(Auth auth, OtpType.Email email, String str, String str2, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resendEmail");
            }
            if ((i3 & 4) != 0) {
                str2 = null;
            }
            return auth.resendEmail(email, str, str2, cVar);
        }

        public static Object resendPhone$default(Auth auth, OtpType.Phone phone, String str, String str2, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resendPhone");
            }
            if ((i3 & 4) != 0) {
                str2 = null;
            }
            return auth.resendPhone(phone, str, str2, cVar);
        }

        public static Object resetPasswordForEmail$default(Auth auth, String str, String str2, String str3, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetPasswordForEmail");
            }
            if ((i3 & 2) != 0) {
                str2 = RedirectUrlKt.defaultRedirectUrl(auth);
            }
            if ((i3 & 4) != 0) {
                str3 = null;
            }
            return auth.resetPasswordForEmail(str, str2, str3, cVar);
        }

        public static String resolveUrl(Auth auth, String path) {
            m.e(path, "path");
            return MainPlugin.DefaultImpls.resolveUrl(auth, path);
        }

        public static Object retrieveSSOUrl$default(Auth auth, String str, j jVar, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveSSOUrl");
            }
            if ((i3 & 1) != 0) {
                str = RedirectUrlKt.defaultRedirectUrl(auth);
            }
            return auth.retrieveSSOUrl(str, jVar, cVar);
        }

        public static Object retrieveUserForCurrentSession$default(Auth auth, boolean z6, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveUserForCurrentSession");
            }
            if ((i3 & 1) != 0) {
                z6 = false;
            }
            return auth.retrieveUserForCurrentSession(z6, cVar);
        }

        public static Object signInAnonymously$default(Auth auth, kotlinx.serialization.json.c cVar, String str, c cVar2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signInAnonymously");
            }
            if ((i3 & 1) != 0) {
                cVar = null;
            }
            if ((i3 & 2) != 0) {
                str = null;
            }
            return auth.signInAnonymously(cVar, str, cVar2);
        }

        public static Object signInWith$default(Auth auth, AuthProvider authProvider, String str, j jVar, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signInWith");
            }
            if ((i3 & 2) != 0) {
                str = RedirectUrlKt.defaultRedirectUrl(auth);
            }
            if ((i3 & 4) != 0) {
                jVar = null;
            }
            return auth.signInWith(authProvider, str, jVar, cVar);
        }

        public static Object signOut$default(Auth auth, SignOutScope signOutScope, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signOut");
            }
            if ((i3 & 1) != 0) {
                signOutScope = SignOutScope.LOCAL;
            }
            return auth.signOut(signOutScope, cVar);
        }

        public static Object signUpWith$default(Auth auth, AuthProvider authProvider, String str, j jVar, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signUpWith");
            }
            if ((i3 & 2) != 0) {
                str = RedirectUrlKt.defaultRedirectUrl(auth);
            }
            if ((i3 & 4) != 0) {
                jVar = null;
            }
            return auth.signUpWith(authProvider, str, jVar, cVar);
        }

        public static Object unlinkIdentity$default(Auth auth, String str, boolean z6, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlinkIdentity");
            }
            if ((i3 & 2) != 0) {
                z6 = true;
            }
            return auth.unlinkIdentity(str, z6, cVar);
        }

        public static Object updateUser$default(Auth auth, boolean z6, String str, j jVar, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUser");
            }
            if ((i3 & 1) != 0) {
                z6 = true;
            }
            if ((i3 & 2) != 0) {
                str = RedirectUrlKt.defaultRedirectUrl(auth);
            }
            return auth.updateUser(z6, str, jVar, cVar);
        }

        public static Object verifyEmailOtp$default(Auth auth, OtpType.Email email, String str, String str2, String str3, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyEmailOtp");
            }
            if ((i3 & 8) != 0) {
                str3 = null;
            }
            return auth.verifyEmailOtp(email, str, str2, str3, cVar);
        }

        public static Object verifyPhoneOtp$default(Auth auth, OtpType.Phone phone, String str, String str2, String str3, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyPhoneOtp");
            }
            if ((i3 & 8) != 0) {
                str3 = null;
            }
            return auth.verifyPhoneOtp(phone, str, str2, str3, cVar);
        }

        public static Object verifyEmailOtp$default(Auth auth, OtpType.Email email, String str, String str2, c cVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyEmailOtp");
            }
            if ((i3 & 4) != 0) {
                str2 = null;
            }
            return auth.verifyEmailOtp(email, str, str2, cVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.github.jan.supabase.auth.Auth$DefaultImpls", f = "Auth.kt", l = {317, 317}, m = "importAuthToken")
    public static final class AnonymousClass1 extends p117n6.c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        Object result;

        public AnonymousClass1(c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.importAuthToken(null, null, null, false, false, this);
        }
    }

    Object awaitInitialization(c cVar);

    Object clearSession(c cVar);

    String currentAccessTokenOrNull();

    List<Identity> currentIdentitiesOrNull();

    UserSession currentSessionOrNull();

    UserInfo currentUserOrNull();

    Object exchangeCodeForSession(String str, boolean z6, c cVar);

    AdminApi getAdmin();

    CodeVerifierCache getCodeVerifierCache();

    MfaApi getMfa();

    String getOAuthUrl(OAuthProvider provider, String redirectUrl, String url, j additionalConfig);

    SessionManager getSessionManager();

    l0 getSessionStatus();

    Object importAuthToken(String str, String str2, boolean z6, boolean z9, c cVar);

    Object importSession(UserSession userSession, boolean z6, SessionSource sessionSource, c cVar);

    boolean isAutoRefreshRunning();

    Object linkIdentity(OAuthProvider oAuthProvider, String str, j jVar, c cVar);

    Object loadFromStorage(boolean z6, c cVar);

    Object reauthenticate(c cVar);

    Object refreshCurrentSession(c cVar);

    Object refreshSession(String str, c cVar);

    Object resendEmail(OtpType.Email email, String str, String str2, c cVar);

    Object resendPhone(OtpType.Phone phone, String str, String str2, c cVar);

    Object resetPasswordForEmail(String str, String str2, String str3, c cVar);

    Object retrieveSSOUrl(String str, j jVar, c cVar);

    Object retrieveUser(String str, c cVar);

    Object retrieveUserForCurrentSession(boolean z6, c cVar);

    Object signInAnonymously(kotlinx.serialization.json.c cVar, String str, c cVar2);

    <C, R, Provider extends AuthProvider<C, R>> Object signInWith(Provider provider, String str, j jVar, c cVar);

    Object signOut(SignOutScope signOutScope, c cVar);

    <C, R, Provider extends AuthProvider<C, R>> Object signUpWith(Provider provider, String str, j jVar, c cVar);

    Object startAutoRefreshForCurrentSession(c cVar);

    void stopAutoRefreshForCurrentSession();

    Object unlinkIdentity(String str, boolean z6, c cVar);

    Object updateUser(boolean z6, String str, j jVar, c cVar);

    Object verifyEmailOtp(OtpType.Email email, String str, String str2, String str3, c cVar);

    Object verifyEmailOtp(OtpType.Email email, String str, String str2, c cVar);

    Object verifyPhoneOtp(OtpType.Phone phone, String str, String str2, String str3, c cVar);
}
