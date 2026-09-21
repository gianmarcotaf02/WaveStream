package io.github.jan.supabase.auth.user;

import E8.l;
import P7.a;
import P7.b;
import androidx.media3.container.NalUnitUtil;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.Request;
import j$.time.Clock;
import j$.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p036d8.d;
import p119n8.h;
import p119n8.i;
import p121o0.p;
import p153r8.AbstractC2686a0;
import p153r8.k0;
import p153r8.p0;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"Jp\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00105\u0012\u0004\b:\u00108\u001a\u0004\b9\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b<\u00108\u001a\u0004\b;\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b>\u00108\u001a\u0004\b=\u0010\u0017R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010?\u0012\u0004\bA\u00108\u001a\u0004\b@\u0010\u001cR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\bC\u00108\u001a\u0004\bB\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010\u001fR \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\bG\u00108\u001a\u0004\bF\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010\"¨\u0006L"}, d2 = {"Lio/github/jan/supabase/auth/user/UserSession;", "", "", "accessToken", "refreshToken", "providerRefreshToken", "providerToken", "", "expiresIn", "tokenType", "Lio/github/jan/supabase/auth/user/UserInfo;", SentryBaseEvent.JsonKeys.USER, "type", "Ld8/d;", "expiresAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lio/github/jan/supabase/auth/user/UserInfo;Ljava/lang/String;Ld8/d;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lio/github/jan/supabase/auth/user/UserInfo;Ljava/lang/String;Ld8/d;Lr8/k0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()J", "component6", "component7", "()Lio/github/jan/supabase/auth/user/UserInfo;", "component8", "component9", "()Ld8/d;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lio/github/jan/supabase/auth/user/UserInfo;Ljava/lang/String;Ld8/d;)Lio/github/jan/supabase/auth/user/UserSession;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/user/UserSession;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getAccessToken", "getAccessToken$annotations", "()V", "getRefreshToken", "getRefreshToken$annotations", "getProviderRefreshToken", "getProviderRefreshToken$annotations", "getProviderToken", "getProviderToken$annotations", "J", "getExpiresIn", "getExpiresIn$annotations", "getTokenType", "getTokenType$annotations", "Lio/github/jan/supabase/auth/user/UserInfo;", "getUser", "getType", "getType$annotations", "Ld8/d;", "getExpiresAt", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class UserSession {

    public static final Companion INSTANCE = new Companion(null);
    private final String accessToken;
    private final d expiresAt;
    private final long expiresIn;
    private final String providerRefreshToken;
    private final String providerToken;
    private final String refreshToken;
    private final String tokenType;
    private final String type;
    private final UserInfo user;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/user/UserSession$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/user/UserSession;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return UserSession$$serializer.INSTANCE;
        }

        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public UserSession(int i3, String str, String str2, String str3, String str4, long j, String str5, UserInfo userInfo, String str6, d dVar, k0 k0Var) {
        if (51 != (i3 & 51)) {
            AbstractC2686a0.l(i3, 51, UserSession$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.accessToken = str;
        this.refreshToken = str2;
        if ((i3 & 4) == 0) {
            this.providerRefreshToken = null;
        } else {
            this.providerRefreshToken = str3;
        }
        if ((i3 & 8) == 0) {
            this.providerToken = null;
        } else {
            this.providerToken = str4;
        }
        this.expiresIn = j;
        this.tokenType = str5;
        if ((i3 & 64) == 0) {
            this.user = null;
        } else {
            this.user = userInfo;
        }
        if ((i3 & 128) == 0) {
            this.type = "";
        } else {
            this.type = str6;
        }
        if ((i3 & 256) != 0) {
            this.expiresAt = dVar;
            return;
        }
        d.Companion.getClass();
        Instant instant = Clock.systemUTC().instant();
        m.d(instant, "instant(...)");
        d dVar2 = new d(instant);
        a aVar = b.f8168i;
        this.expiresAt = dVar2.b(l.O(j, P7.d.SECONDS));
    }

    public static UserSession copy$default(UserSession userSession, String str, String str2, String str3, String str4, long j, String str5, UserInfo userInfo, String str6, d dVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = userSession.accessToken;
        }
        if ((i3 & 2) != 0) {
            str2 = userSession.refreshToken;
        }
        if ((i3 & 4) != 0) {
            str3 = userSession.providerRefreshToken;
        }
        if ((i3 & 8) != 0) {
            str4 = userSession.providerToken;
        }
        if ((i3 & 16) != 0) {
            j = userSession.expiresIn;
        }
        if ((i3 & 32) != 0) {
            str5 = userSession.tokenType;
        }
        if ((i3 & 64) != 0) {
            userInfo = userSession.user;
        }
        if ((i3 & 128) != 0) {
            str6 = userSession.type;
        }
        if ((i3 & 256) != 0) {
            dVar = userSession.expiresAt;
        }
        long j9 = j;
        String str7 = str3;
        String str8 = str4;
        return userSession.copy(str, str2, str7, str8, j9, str5, userInfo, str6, dVar);
    }

    @h("access_token")
    public static void getAccessToken$annotations() {
    }

    @h("expires_in")
    public static void getExpiresIn$annotations() {
    }

    @h("provider_refresh_token")
    public static void getProviderRefreshToken$annotations() {
    }

    @h("provider_token")
    public static void getProviderToken$annotations() {
    }

    @h("refresh_token")
    public static void getRefreshToken$annotations() {
    }

    @h("token_type")
    public static void getTokenType$annotations() {
    }

    @h("type")
    public static void getType$annotations() {
    }

    public static final void write$Self$auth_kt_release(UserSession self, p143q8.b output, SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.accessToken);
        output.s(serialDesc, 1, self.refreshToken);
        if (output.E(serialDesc) || self.providerRefreshToken != null) {
            output.t(serialDesc, 2, p0.f26988a, self.providerRefreshToken);
        }
        if (output.E(serialDesc) || self.providerToken != null) {
            output.t(serialDesc, 3, p0.f26988a, self.providerToken);
        }
        output.D(serialDesc, 4, self.expiresIn);
        output.s(serialDesc, 5, self.tokenType);
        if (output.E(serialDesc) || self.user != null) {
            output.t(serialDesc, 6, UserInfo$$serializer.INSTANCE, self.user);
        }
        if (output.E(serialDesc) || !m.a(self.type, "")) {
            output.s(serialDesc, 7, self.type);
        }
        if (!output.E(serialDesc)) {
            d dVar = self.expiresAt;
            d.Companion.getClass();
            Instant instant = Clock.systemUTC().instant();
            m.d(instant, "instant(...)");
            d dVar2 = new d(instant);
            a aVar = b.f8168i;
            if (m.a(dVar, dVar2.b(l.O(self.expiresIn, P7.d.SECONDS)))) {
                return;
            }
        }
        output.h(serialDesc, 8, p087j8.a.f24333a, self.expiresAt);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getProviderRefreshToken() {
        return this.providerRefreshToken;
    }

    public final String getProviderToken() {
        return this.providerToken;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final UserInfo getUser() {
        return this.user;
    }

    public final String getType() {
        return this.type;
    }

    public final d getExpiresAt() {
        return this.expiresAt;
    }

    public final UserSession copy(String accessToken, String refreshToken, String providerRefreshToken, String providerToken, long expiresIn, String tokenType, UserInfo user, String type, d expiresAt) {
        m.e(accessToken, "accessToken");
        m.e(refreshToken, "refreshToken");
        m.e(tokenType, "tokenType");
        m.e(type, "type");
        m.e(expiresAt, "expiresAt");
        return new UserSession(accessToken, refreshToken, providerRefreshToken, providerToken, expiresIn, tokenType, user, type, expiresAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSession)) {
            return false;
        }
        UserSession userSession = (UserSession) other;
        return m.a(this.accessToken, userSession.accessToken) && m.a(this.refreshToken, userSession.refreshToken) && m.a(this.providerRefreshToken, userSession.providerRefreshToken) && m.a(this.providerToken, userSession.providerToken) && this.expiresIn == userSession.expiresIn && m.a(this.tokenType, userSession.tokenType) && m.a(this.user, userSession.user) && m.a(this.type, userSession.type) && m.a(this.expiresAt, userSession.expiresAt);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final d getExpiresAt() {
        return this.expiresAt;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public final String getProviderRefreshToken() {
        return this.providerRefreshToken;
    }

    public final String getProviderToken() {
        return this.providerToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final String getType() {
        return this.type;
    }

    public final UserInfo getUser() {
        return this.user;
    }

    public int hashCode() {
        int iA = B2.a.a(this.accessToken.hashCode() * 31, 31, this.refreshToken);
        String str = this.providerRefreshToken;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.providerToken;
        int iA2 = B2.a.a(p.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.expiresIn), 31, this.tokenType);
        UserInfo userInfo = this.user;
        return this.expiresAt.f21303h.hashCode() + B2.a.a((iA2 + (userInfo != null ? userInfo.hashCode() : 0)) * 31, 31, this.type);
    }

    public String toString() {
        return "UserSession(accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ", providerRefreshToken=" + this.providerRefreshToken + ", providerToken=" + this.providerToken + ", expiresIn=" + this.expiresIn + ", tokenType=" + this.tokenType + ", user=" + this.user + ", type=" + this.type + ", expiresAt=" + this.expiresAt + ')';
    }

    public UserSession(String accessToken, String refreshToken, String str, String str2, long j, String tokenType, UserInfo userInfo, String type, d expiresAt) {
        m.e(accessToken, "accessToken");
        m.e(refreshToken, "refreshToken");
        m.e(tokenType, "tokenType");
        m.e(type, "type");
        m.e(expiresAt, "expiresAt");
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.providerRefreshToken = str;
        this.providerToken = str2;
        this.expiresIn = j;
        this.tokenType = tokenType;
        this.user = userInfo;
        this.type = type;
        this.expiresAt = expiresAt;
    }

    public UserSession(String str, String str2, String str3, String str4, long j, String str5, UserInfo userInfo, String str6, d dVar, int i3, AbstractC2541f abstractC2541f) {
        str3 = (i3 & 4) != 0 ? null : str3;
        str4 = (i3 & 8) != 0 ? null : str4;
        userInfo = (i3 & 64) != 0 ? null : userInfo;
        str6 = (i3 & 128) != 0 ? "" : str6;
        if ((i3 & 256) != 0) {
            d.Companion.getClass();
            Instant instant = Clock.systemUTC().instant();
            m.d(instant, "instant(...)");
            d dVar2 = new d(instant);
            a aVar = b.f8168i;
            dVar = dVar2.b(l.O(j, P7.d.SECONDS));
        }
        this(str, str2, str3, str4, j, str5, userInfo, str6, dVar);
    }
}
