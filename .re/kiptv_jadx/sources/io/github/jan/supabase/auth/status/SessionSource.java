package io.github.jan.supabase.auth.status;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource;", "", "Storage", "AnonymousSignIn", "SignIn", "SignUp", "External", "Unknown", "Refresh", "UserChanged", "UserIdentitiesChanged", "Lio/github/jan/supabase/auth/status/SessionSource$AnonymousSignIn;", "Lio/github/jan/supabase/auth/status/SessionSource$External;", "Lio/github/jan/supabase/auth/status/SessionSource$Refresh;", "Lio/github/jan/supabase/auth/status/SessionSource$SignIn;", "Lio/github/jan/supabase/auth/status/SessionSource$SignUp;", "Lio/github/jan/supabase/auth/status/SessionSource$Storage;", "Lio/github/jan/supabase/auth/status/SessionSource$Unknown;", "Lio/github/jan/supabase/auth/status/SessionSource$UserChanged;", "Lio/github/jan/supabase/auth/status/SessionSource$UserIdentitiesChanged;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface SessionSource {

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$AnonymousSignIn;", "Lio/github/jan/supabase/auth/status/SessionSource;", "<init>", "()V", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class AnonymousSignIn implements io.github.jan.supabase.auth.status.SessionSource {
        public static final io.github.jan.supabase.auth.status.SessionSource.AnonymousSignIn INSTANCE = new io.github.jan.supabase.auth.status.SessionSource.AnonymousSignIn();

        private AnonymousSignIn() {
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.github.jan.supabase.auth.status.SessionSource.AnonymousSignIn);
        }

        public int hashCode() {
            return 119379148;
        }

        public java.lang.String toString() {
            return "AnonymousSignIn";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$External;", "Lio/github/jan/supabase/auth/status/SessionSource;", "<init>", "()V", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class External implements io.github.jan.supabase.auth.status.SessionSource {
        public static final io.github.jan.supabase.auth.status.SessionSource.External INSTANCE = new io.github.jan.supabase.auth.status.SessionSource.External();

        private External() {
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.github.jan.supabase.auth.status.SessionSource.External);
        }

        public int hashCode() {
            return 1599189038;
        }

        public java.lang.String toString() {
            return "External";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$Refresh;", "Lio/github/jan/supabase/auth/status/SessionSource;", "oldSession", "Lio/github/jan/supabase/auth/user/UserSession;", "<init>", "(Lio/github/jan/supabase/auth/user/UserSession;)V", "getOldSession", "()Lio/github/jan/supabase/auth/user/UserSession;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Refresh implements io.github.jan.supabase.auth.status.SessionSource {
        private final io.github.jan.supabase.auth.user.UserSession oldSession;

        public Refresh(io.github.jan.supabase.auth.user.UserSession oldSession) {
            kotlin.jvm.internal.m.e(oldSession, "oldSession");
            this.oldSession = oldSession;
        }

        public static /* synthetic */ io.github.jan.supabase.auth.status.SessionSource.Refresh copy$default(io.github.jan.supabase.auth.status.SessionSource.Refresh refresh, io.github.jan.supabase.auth.user.UserSession userSession, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                userSession = refresh.oldSession;
            }
            return refresh.copy(userSession);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final io.github.jan.supabase.auth.user.UserSession getOldSession() {
            return this.oldSession;
        }

        public final io.github.jan.supabase.auth.status.SessionSource.Refresh copy(io.github.jan.supabase.auth.user.UserSession oldSession) {
            kotlin.jvm.internal.m.e(oldSession, "oldSession");
            return new io.github.jan.supabase.auth.status.SessionSource.Refresh(oldSession);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.github.jan.supabase.auth.status.SessionSource.Refresh) && kotlin.jvm.internal.m.a(this.oldSession, ((io.github.jan.supabase.auth.status.SessionSource.Refresh) other).oldSession);
        }

        public final io.github.jan.supabase.auth.user.UserSession getOldSession() {
            return this.oldSession;
        }

        public int hashCode() {
            return this.oldSession.hashCode();
        }

        public java.lang.String toString() {
            return "Refresh(oldSession=" + this.oldSession + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$SignIn;", "Lio/github/jan/supabase/auth/status/SessionSource;", "provider", "Lio/github/jan/supabase/auth/providers/AuthProvider;", "<init>", "(Lio/github/jan/supabase/auth/providers/AuthProvider;)V", "getProvider", "()Lio/github/jan/supabase/auth/providers/AuthProvider;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class SignIn implements io.github.jan.supabase.auth.status.SessionSource {
        private final io.github.jan.supabase.auth.providers.AuthProvider<?, ?> provider;

        public SignIn(io.github.jan.supabase.auth.providers.AuthProvider<?, ?> provider) {
            kotlin.jvm.internal.m.e(provider, "provider");
            this.provider = provider;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.github.jan.supabase.auth.status.SessionSource.SignIn copy$default(io.github.jan.supabase.auth.status.SessionSource.SignIn signIn, io.github.jan.supabase.auth.providers.AuthProvider authProvider, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                authProvider = signIn.provider;
            }
            return signIn.copy(authProvider);
        }

        public final io.github.jan.supabase.auth.providers.AuthProvider<?, ?> component1() {
            return this.provider;
        }

        public final io.github.jan.supabase.auth.status.SessionSource.SignIn copy(io.github.jan.supabase.auth.providers.AuthProvider<?, ?> provider) {
            kotlin.jvm.internal.m.e(provider, "provider");
            return new io.github.jan.supabase.auth.status.SessionSource.SignIn(provider);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.github.jan.supabase.auth.status.SessionSource.SignIn) && kotlin.jvm.internal.m.a(this.provider, ((io.github.jan.supabase.auth.status.SessionSource.SignIn) other).provider);
        }

        public final io.github.jan.supabase.auth.providers.AuthProvider<?, ?> getProvider() {
            return this.provider;
        }

        public int hashCode() {
            return this.provider.hashCode();
        }

        public java.lang.String toString() {
            return "SignIn(provider=" + this.provider + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$SignUp;", "Lio/github/jan/supabase/auth/status/SessionSource;", "provider", "Lio/github/jan/supabase/auth/providers/AuthProvider;", "<init>", "(Lio/github/jan/supabase/auth/providers/AuthProvider;)V", "getProvider", "()Lio/github/jan/supabase/auth/providers/AuthProvider;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class SignUp implements io.github.jan.supabase.auth.status.SessionSource {
        private final io.github.jan.supabase.auth.providers.AuthProvider<?, ?> provider;

        public SignUp(io.github.jan.supabase.auth.providers.AuthProvider<?, ?> provider) {
            kotlin.jvm.internal.m.e(provider, "provider");
            this.provider = provider;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.github.jan.supabase.auth.status.SessionSource.SignUp copy$default(io.github.jan.supabase.auth.status.SessionSource.SignUp signUp, io.github.jan.supabase.auth.providers.AuthProvider authProvider, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                authProvider = signUp.provider;
            }
            return signUp.copy(authProvider);
        }

        public final io.github.jan.supabase.auth.providers.AuthProvider<?, ?> component1() {
            return this.provider;
        }

        public final io.github.jan.supabase.auth.status.SessionSource.SignUp copy(io.github.jan.supabase.auth.providers.AuthProvider<?, ?> provider) {
            kotlin.jvm.internal.m.e(provider, "provider");
            return new io.github.jan.supabase.auth.status.SessionSource.SignUp(provider);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.github.jan.supabase.auth.status.SessionSource.SignUp) && kotlin.jvm.internal.m.a(this.provider, ((io.github.jan.supabase.auth.status.SessionSource.SignUp) other).provider);
        }

        public final io.github.jan.supabase.auth.providers.AuthProvider<?, ?> getProvider() {
            return this.provider;
        }

        public int hashCode() {
            return this.provider.hashCode();
        }

        public java.lang.String toString() {
            return "SignUp(provider=" + this.provider + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$Storage;", "Lio/github/jan/supabase/auth/status/SessionSource;", "<init>", "()V", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Storage implements io.github.jan.supabase.auth.status.SessionSource {
        public static final io.github.jan.supabase.auth.status.SessionSource.Storage INSTANCE = new io.github.jan.supabase.auth.status.SessionSource.Storage();

        private Storage() {
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.github.jan.supabase.auth.status.SessionSource.Storage);
        }

        public int hashCode() {
            return 1966824888;
        }

        public java.lang.String toString() {
            return "Storage";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$Unknown;", "Lio/github/jan/supabase/auth/status/SessionSource;", "<init>", "()V", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Unknown implements io.github.jan.supabase.auth.status.SessionSource {
        public static final io.github.jan.supabase.auth.status.SessionSource.Unknown INSTANCE = new io.github.jan.supabase.auth.status.SessionSource.Unknown();

        private Unknown() {
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.github.jan.supabase.auth.status.SessionSource.Unknown);
        }

        public int hashCode() {
            return -728709241;
        }

        public java.lang.String toString() {
            return "Unknown";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$UserChanged;", "Lio/github/jan/supabase/auth/status/SessionSource;", "oldSession", "Lio/github/jan/supabase/auth/user/UserSession;", "<init>", "(Lio/github/jan/supabase/auth/user/UserSession;)V", "getOldSession", "()Lio/github/jan/supabase/auth/user/UserSession;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class UserChanged implements io.github.jan.supabase.auth.status.SessionSource {
        private final io.github.jan.supabase.auth.user.UserSession oldSession;

        public UserChanged(io.github.jan.supabase.auth.user.UserSession oldSession) {
            kotlin.jvm.internal.m.e(oldSession, "oldSession");
            this.oldSession = oldSession;
        }

        public static /* synthetic */ io.github.jan.supabase.auth.status.SessionSource.UserChanged copy$default(io.github.jan.supabase.auth.status.SessionSource.UserChanged userChanged, io.github.jan.supabase.auth.user.UserSession userSession, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                userSession = userChanged.oldSession;
            }
            return userChanged.copy(userSession);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final io.github.jan.supabase.auth.user.UserSession getOldSession() {
            return this.oldSession;
        }

        public final io.github.jan.supabase.auth.status.SessionSource.UserChanged copy(io.github.jan.supabase.auth.user.UserSession oldSession) {
            kotlin.jvm.internal.m.e(oldSession, "oldSession");
            return new io.github.jan.supabase.auth.status.SessionSource.UserChanged(oldSession);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.github.jan.supabase.auth.status.SessionSource.UserChanged) && kotlin.jvm.internal.m.a(this.oldSession, ((io.github.jan.supabase.auth.status.SessionSource.UserChanged) other).oldSession);
        }

        public final io.github.jan.supabase.auth.user.UserSession getOldSession() {
            return this.oldSession;
        }

        public int hashCode() {
            return this.oldSession.hashCode();
        }

        public java.lang.String toString() {
            return "UserChanged(oldSession=" + this.oldSession + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionSource$UserIdentitiesChanged;", "Lio/github/jan/supabase/auth/status/SessionSource;", "oldSession", "Lio/github/jan/supabase/auth/user/UserSession;", "<init>", "(Lio/github/jan/supabase/auth/user/UserSession;)V", "getOldSession", "()Lio/github/jan/supabase/auth/user/UserSession;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class UserIdentitiesChanged implements io.github.jan.supabase.auth.status.SessionSource {
        private final io.github.jan.supabase.auth.user.UserSession oldSession;

        public UserIdentitiesChanged(io.github.jan.supabase.auth.user.UserSession oldSession) {
            kotlin.jvm.internal.m.e(oldSession, "oldSession");
            this.oldSession = oldSession;
        }

        public static /* synthetic */ io.github.jan.supabase.auth.status.SessionSource.UserIdentitiesChanged copy$default(io.github.jan.supabase.auth.status.SessionSource.UserIdentitiesChanged userIdentitiesChanged, io.github.jan.supabase.auth.user.UserSession userSession, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                userSession = userIdentitiesChanged.oldSession;
            }
            return userIdentitiesChanged.copy(userSession);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final io.github.jan.supabase.auth.user.UserSession getOldSession() {
            return this.oldSession;
        }

        public final io.github.jan.supabase.auth.status.SessionSource.UserIdentitiesChanged copy(io.github.jan.supabase.auth.user.UserSession oldSession) {
            kotlin.jvm.internal.m.e(oldSession, "oldSession");
            return new io.github.jan.supabase.auth.status.SessionSource.UserIdentitiesChanged(oldSession);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.github.jan.supabase.auth.status.SessionSource.UserIdentitiesChanged) && kotlin.jvm.internal.m.a(this.oldSession, ((io.github.jan.supabase.auth.status.SessionSource.UserIdentitiesChanged) other).oldSession);
        }

        public final io.github.jan.supabase.auth.user.UserSession getOldSession() {
            return this.oldSession;
        }

        public int hashCode() {
            return this.oldSession.hashCode();
        }

        public java.lang.String toString() {
            return "UserIdentitiesChanged(oldSession=" + this.oldSession + ')';
        }
    }
}
