package io.github.jan.supabase.auth.status;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionStatus;", "", "NotAuthenticated", "Initializing", "RefreshFailure", "Authenticated", "Lio/github/jan/supabase/auth/status/SessionStatus$Authenticated;", "Lio/github/jan/supabase/auth/status/SessionStatus$Initializing;", "Lio/github/jan/supabase/auth/status/SessionStatus$NotAuthenticated;", "Lio/github/jan/supabase/auth/status/SessionStatus$RefreshFailure;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface SessionStatus {

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionStatus$Initializing;", "Lio/github/jan/supabase/auth/status/SessionStatus;", "<init>", "()V", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Initializing implements io.github.jan.supabase.auth.status.SessionStatus {
        public static final io.github.jan.supabase.auth.status.SessionStatus.Initializing INSTANCE = new io.github.jan.supabase.auth.status.SessionStatus.Initializing();

        private Initializing() {
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.github.jan.supabase.auth.status.SessionStatus.Initializing);
        }

        public int hashCode() {
            return 884143289;
        }

        public java.lang.String toString() {
            return "Initializing";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionStatus$NotAuthenticated;", "Lio/github/jan/supabase/auth/status/SessionStatus;", "isSignOut", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class NotAuthenticated implements io.github.jan.supabase.auth.status.SessionStatus {
        private final boolean isSignOut;

        public NotAuthenticated(boolean z6) {
            this.isSignOut = z6;
        }

        public static /* synthetic */ io.github.jan.supabase.auth.status.SessionStatus.NotAuthenticated copy$default(io.github.jan.supabase.auth.status.SessionStatus.NotAuthenticated notAuthenticated, boolean z6, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                z6 = notAuthenticated.isSignOut;
            }
            return notAuthenticated.copy(z6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsSignOut() {
            return this.isSignOut;
        }

        public final io.github.jan.supabase.auth.status.SessionStatus.NotAuthenticated copy(boolean isSignOut) {
            return new io.github.jan.supabase.auth.status.SessionStatus.NotAuthenticated(isSignOut);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.github.jan.supabase.auth.status.SessionStatus.NotAuthenticated) && this.isSignOut == ((io.github.jan.supabase.auth.status.SessionStatus.NotAuthenticated) other).isSignOut;
        }

        public int hashCode() {
            return java.lang.Boolean.hashCode(this.isSignOut);
        }

        public final boolean isSignOut() {
            return this.isSignOut;
        }

        public java.lang.String toString() {
            return v5.L.a(new java.lang.StringBuilder("NotAuthenticated(isSignOut="), this.isSignOut, ')');
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionStatus$RefreshFailure;", "Lio/github/jan/supabase/auth/status/SessionStatus;", "cause", "Lio/github/jan/supabase/auth/status/RefreshFailureCause;", "<init>", "(Lio/github/jan/supabase/auth/status/RefreshFailureCause;)V", "getCause", "()Lio/github/jan/supabase/auth/status/RefreshFailureCause;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class RefreshFailure implements io.github.jan.supabase.auth.status.SessionStatus {
        private final io.github.jan.supabase.auth.status.RefreshFailureCause cause;

        public RefreshFailure(io.github.jan.supabase.auth.status.RefreshFailureCause cause) {
            kotlin.jvm.internal.m.e(cause, "cause");
            this.cause = cause;
        }

        public static /* synthetic */ io.github.jan.supabase.auth.status.SessionStatus.RefreshFailure copy$default(io.github.jan.supabase.auth.status.SessionStatus.RefreshFailure refreshFailure, io.github.jan.supabase.auth.status.RefreshFailureCause refreshFailureCause, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                refreshFailureCause = refreshFailure.cause;
            }
            return refreshFailure.copy(refreshFailureCause);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final io.github.jan.supabase.auth.status.RefreshFailureCause getCause() {
            return this.cause;
        }

        public final io.github.jan.supabase.auth.status.SessionStatus.RefreshFailure copy(io.github.jan.supabase.auth.status.RefreshFailureCause cause) {
            kotlin.jvm.internal.m.e(cause, "cause");
            return new io.github.jan.supabase.auth.status.SessionStatus.RefreshFailure(cause);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.github.jan.supabase.auth.status.SessionStatus.RefreshFailure) && kotlin.jvm.internal.m.a(this.cause, ((io.github.jan.supabase.auth.status.SessionStatus.RefreshFailure) other).cause);
        }

        public final io.github.jan.supabase.auth.status.RefreshFailureCause getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        public java.lang.String toString() {
            return "RefreshFailure(cause=" + this.cause + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionStatus$Authenticated;", "Lio/github/jan/supabase/auth/status/SessionStatus;", "session", "Lio/github/jan/supabase/auth/user/UserSession;", "source", "Lio/github/jan/supabase/auth/status/SessionSource;", "<init>", "(Lio/github/jan/supabase/auth/user/UserSession;Lio/github/jan/supabase/auth/status/SessionSource;)V", "getSession", "()Lio/github/jan/supabase/auth/user/UserSession;", "getSource", "()Lio/github/jan/supabase/auth/status/SessionSource;", "isNew", "", "()Z", "component1", "component2", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Authenticated implements io.github.jan.supabase.auth.status.SessionStatus {
        private final boolean isNew;
        private final io.github.jan.supabase.auth.user.UserSession session;
        private final io.github.jan.supabase.auth.status.SessionSource source;

        public Authenticated(io.github.jan.supabase.auth.user.UserSession session, io.github.jan.supabase.auth.status.SessionSource source) {
            kotlin.jvm.internal.m.e(session, "session");
            kotlin.jvm.internal.m.e(source, "source");
            this.session = session;
            this.source = source;
            this.isNew = (source instanceof io.github.jan.supabase.auth.status.SessionSource.SignIn) || (source instanceof io.github.jan.supabase.auth.status.SessionSource.SignUp) || (source instanceof io.github.jan.supabase.auth.status.SessionSource.External);
        }

        public static /* synthetic */ io.github.jan.supabase.auth.status.SessionStatus.Authenticated copy$default(io.github.jan.supabase.auth.status.SessionStatus.Authenticated authenticated, io.github.jan.supabase.auth.user.UserSession userSession, io.github.jan.supabase.auth.status.SessionSource sessionSource, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                userSession = authenticated.session;
            }
            if ((i3 & 2) != 0) {
                sessionSource = authenticated.source;
            }
            return authenticated.copy(userSession, sessionSource);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final io.github.jan.supabase.auth.user.UserSession getSession() {
            return this.session;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final io.github.jan.supabase.auth.status.SessionSource getSource() {
            return this.source;
        }

        public final io.github.jan.supabase.auth.status.SessionStatus.Authenticated copy(io.github.jan.supabase.auth.user.UserSession session, io.github.jan.supabase.auth.status.SessionSource source) {
            kotlin.jvm.internal.m.e(session, "session");
            kotlin.jvm.internal.m.e(source, "source");
            return new io.github.jan.supabase.auth.status.SessionStatus.Authenticated(session, source);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof io.github.jan.supabase.auth.status.SessionStatus.Authenticated)) {
                return false;
            }
            io.github.jan.supabase.auth.status.SessionStatus.Authenticated authenticated = (io.github.jan.supabase.auth.status.SessionStatus.Authenticated) other;
            return kotlin.jvm.internal.m.a(this.session, authenticated.session) && kotlin.jvm.internal.m.a(this.source, authenticated.source);
        }

        public final io.github.jan.supabase.auth.user.UserSession getSession() {
            return this.session;
        }

        public final io.github.jan.supabase.auth.status.SessionSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode() + (this.session.hashCode() * 31);
        }

        /* JADX INFO: renamed from: isNew, reason: from getter */
        public final boolean getIsNew() {
            return this.isNew;
        }

        public java.lang.String toString() {
            return "Authenticated(session=" + this.session + ", source=" + this.source + ')';
        }

        public /* synthetic */ Authenticated(io.github.jan.supabase.auth.user.UserSession userSession, io.github.jan.supabase.auth.status.SessionSource sessionSource, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(userSession, (i3 & 2) != 0 ? io.github.jan.supabase.auth.status.SessionSource.Unknown.INSTANCE : sessionSource);
        }
    }
}
