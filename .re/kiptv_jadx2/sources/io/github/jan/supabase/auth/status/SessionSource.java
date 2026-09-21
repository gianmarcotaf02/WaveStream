package io.github.jan.supabase.auth.status;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.auth.providers.AuthProvider;
import io.github.jan.supabase.auth.user.UserSession;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource;", "", "Storage", "AnonymousSignIn", "SignIn", "SignUp", "External", "Unknown", "Refresh", "UserChanged", "UserIdentitiesChanged", "Lio/github/jan/supabase/auth/status/SessionSource$AnonymousSignIn;", "Lio/github/jan/supabase/auth/status/SessionSource$External;", "Lio/github/jan/supabase/auth/status/SessionSource$Refresh;", "Lio/github/jan/supabase/auth/status/SessionSource$SignIn;", "Lio/github/jan/supabase/auth/status/SessionSource$SignUp;", "Lio/github/jan/supabase/auth/status/SessionSource$Storage;", "Lio/github/jan/supabase/auth/status/SessionSource$Unknown;", "Lio/github/jan/supabase/auth/status/SessionSource$UserChanged;", "Lio/github/jan/supabase/auth/status/SessionSource$UserIdentitiesChanged;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface SessionSource {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$AnonymousSignIn;", "Lio/github/jan/supabase/auth/status/SessionSource;", "<init>", "()V", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousSignIn implements SessionSource {
        public static final AnonymousSignIn INSTANCE = new AnonymousSignIn();

        private AnonymousSignIn() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AnonymousSignIn);
        }

        public int hashCode() {
            return 119379148;
        }

        public String toString() {
            return "AnonymousSignIn";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$External;", "Lio/github/jan/supabase/auth/status/SessionSource;", "<init>", "()V", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class External implements SessionSource {
        public static final External INSTANCE = new External();

        private External() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof External);
        }

        public int hashCode() {
            return 1599189038;
        }

        public String toString() {
            return "External";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$Refresh;", "Lio/github/jan/supabase/auth/status/SessionSource;", "oldSession", "Lio/github/jan/supabase/auth/user/UserSession;", "<init>", "(Lio/github/jan/supabase/auth/user/UserSession;)V", "getOldSession", "()Lio/github/jan/supabase/auth/user/UserSession;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Refresh implements SessionSource {
        private final UserSession oldSession;

        public Refresh(UserSession oldSession) {
            m.e(oldSession, "oldSession");
            this.oldSession = oldSession;
        }

        public static Refresh copy$default(Refresh refresh, UserSession userSession, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                userSession = refresh.oldSession;
            }
            return refresh.copy(userSession);
        }

        public final UserSession getOldSession() {
            return this.oldSession;
        }

        public final Refresh copy(UserSession oldSession) {
            m.e(oldSession, "oldSession");
            return new Refresh(oldSession);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Refresh) && m.a(this.oldSession, ((Refresh) other).oldSession);
        }

        public final UserSession getOldSession() {
            return this.oldSession;
        }

        public int hashCode() {
            return this.oldSession.hashCode();
        }

        public String toString() {
            return "Refresh(oldSession=" + this.oldSession + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$SignIn;", "Lio/github/jan/supabase/auth/status/SessionSource;", "provider", "Lio/github/jan/supabase/auth/providers/AuthProvider;", "<init>", "(Lio/github/jan/supabase/auth/providers/AuthProvider;)V", "getProvider", "()Lio/github/jan/supabase/auth/providers/AuthProvider;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class SignIn implements SessionSource {
        private final AuthProvider<?, ?> provider;

        public SignIn(AuthProvider<?, ?> provider) {
            m.e(provider, "provider");
            this.provider = provider;
        }

        public static SignIn copy$default(SignIn signIn, AuthProvider authProvider, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                authProvider = signIn.provider;
            }
            return signIn.copy(authProvider);
        }

        public final AuthProvider<?, ?> component1() {
            return this.provider;
        }

        public final SignIn copy(AuthProvider<?, ?> provider) {
            m.e(provider, "provider");
            return new SignIn(provider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SignIn) && m.a(this.provider, ((SignIn) other).provider);
        }

        public final AuthProvider<?, ?> getProvider() {
            return this.provider;
        }

        public int hashCode() {
            return this.provider.hashCode();
        }

        public String toString() {
            return "SignIn(provider=" + this.provider + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$SignUp;", "Lio/github/jan/supabase/auth/status/SessionSource;", "provider", "Lio/github/jan/supabase/auth/providers/AuthProvider;", "<init>", "(Lio/github/jan/supabase/auth/providers/AuthProvider;)V", "getProvider", "()Lio/github/jan/supabase/auth/providers/AuthProvider;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class SignUp implements SessionSource {
        private final AuthProvider<?, ?> provider;

        public SignUp(AuthProvider<?, ?> provider) {
            m.e(provider, "provider");
            this.provider = provider;
        }

        public static SignUp copy$default(SignUp signUp, AuthProvider authProvider, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                authProvider = signUp.provider;
            }
            return signUp.copy(authProvider);
        }

        public final AuthProvider<?, ?> component1() {
            return this.provider;
        }

        public final SignUp copy(AuthProvider<?, ?> provider) {
            m.e(provider, "provider");
            return new SignUp(provider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SignUp) && m.a(this.provider, ((SignUp) other).provider);
        }

        public final AuthProvider<?, ?> getProvider() {
            return this.provider;
        }

        public int hashCode() {
            return this.provider.hashCode();
        }

        public String toString() {
            return "SignUp(provider=" + this.provider + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$Storage;", "Lio/github/jan/supabase/auth/status/SessionSource;", "<init>", "()V", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Storage implements SessionSource {
        public static final Storage INSTANCE = new Storage();

        private Storage() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Storage);
        }

        public int hashCode() {
            return 1966824888;
        }

        public String toString() {
            return "Storage";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$Unknown;", "Lio/github/jan/supabase/auth/status/SessionSource;", "<init>", "()V", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Unknown implements SessionSource {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return -728709241;
        }

        public String toString() {
            return "Unknown";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$UserChanged;", "Lio/github/jan/supabase/auth/status/SessionSource;", "oldSession", "Lio/github/jan/supabase/auth/user/UserSession;", "<init>", "(Lio/github/jan/supabase/auth/user/UserSession;)V", "getOldSession", "()Lio/github/jan/supabase/auth/user/UserSession;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class UserChanged implements SessionSource {
        private final UserSession oldSession;

        public UserChanged(UserSession oldSession) {
            m.e(oldSession, "oldSession");
            this.oldSession = oldSession;
        }

        public static UserChanged copy$default(UserChanged userChanged, UserSession userSession, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                userSession = userChanged.oldSession;
            }
            return userChanged.copy(userSession);
        }

        public final UserSession getOldSession() {
            return this.oldSession;
        }

        public final UserChanged copy(UserSession oldSession) {
            m.e(oldSession, "oldSession");
            return new UserChanged(oldSession);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserChanged) && m.a(this.oldSession, ((UserChanged) other).oldSession);
        }

        public final UserSession getOldSession() {
            return this.oldSession;
        }

        public int hashCode() {
            return this.oldSession.hashCode();
        }

        public String toString() {
            return "UserChanged(oldSession=" + this.oldSession + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$UserIdentitiesChanged;", "Lio/github/jan/supabase/auth/status/SessionSource;", "oldSession", "Lio/github/jan/supabase/auth/user/UserSession;", "<init>", "(Lio/github/jan/supabase/auth/user/UserSession;)V", "getOldSession", "()Lio/github/jan/supabase/auth/user/UserSession;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class UserIdentitiesChanged implements SessionSource {
        private final UserSession oldSession;

        public UserIdentitiesChanged(UserSession oldSession) {
            m.e(oldSession, "oldSession");
            this.oldSession = oldSession;
        }

        public static UserIdentitiesChanged copy$default(UserIdentitiesChanged userIdentitiesChanged, UserSession userSession, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                userSession = userIdentitiesChanged.oldSession;
            }
            return userIdentitiesChanged.copy(userSession);
        }

        public final UserSession getOldSession() {
            return this.oldSession;
        }

        public final UserIdentitiesChanged copy(UserSession oldSession) {
            m.e(oldSession, "oldSession");
            return new UserIdentitiesChanged(oldSession);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserIdentitiesChanged) && m.a(this.oldSession, ((UserIdentitiesChanged) other).oldSession);
        }

        public final UserSession getOldSession() {
            return this.oldSession;
        }

        public int hashCode() {
            return this.oldSession.hashCode();
        }

        public String toString() {
            return "UserIdentitiesChanged(oldSession=" + this.oldSession + ')';
        }
    }
}
