package io.github.jan.supabase.auth.status;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.auth.user.UserSession;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import v5.L;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionStatus;", "", "NotAuthenticated", "Initializing", "RefreshFailure", "Authenticated", "Lio/github/jan/supabase/auth/status/SessionStatus$Authenticated;", "Lio/github/jan/supabase/auth/status/SessionStatus$Initializing;", "Lio/github/jan/supabase/auth/status/SessionStatus$NotAuthenticated;", "Lio/github/jan/supabase/auth/status/SessionStatus$RefreshFailure;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface SessionStatus {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionStatus$Initializing;", "Lio/github/jan/supabase/auth/status/SessionStatus;", "<init>", "()V", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Initializing implements SessionStatus {
        public static final Initializing INSTANCE = new Initializing();

        private Initializing() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Initializing);
        }

        public int hashCode() {
            return 884143289;
        }

        public String toString() {
            return "Initializing";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionStatus$NotAuthenticated;", "Lio/github/jan/supabase/auth/status/SessionStatus;", "isSignOut", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class NotAuthenticated implements SessionStatus {
        private final boolean isSignOut;

        public NotAuthenticated(boolean z6) {
            this.isSignOut = z6;
        }

        public static NotAuthenticated copy$default(NotAuthenticated notAuthenticated, boolean z6, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z6 = notAuthenticated.isSignOut;
            }
            return notAuthenticated.copy(z6);
        }

        public final boolean getIsSignOut() {
            return this.isSignOut;
        }

        public final NotAuthenticated copy(boolean isSignOut) {
            return new NotAuthenticated(isSignOut);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotAuthenticated) && this.isSignOut == ((NotAuthenticated) other).isSignOut;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSignOut);
        }

        public final boolean isSignOut() {
            return this.isSignOut;
        }

        public String toString() {
            return L.a(new StringBuilder("NotAuthenticated(isSignOut="), this.isSignOut, ')');
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionStatus$RefreshFailure;", "Lio/github/jan/supabase/auth/status/SessionStatus;", "cause", "Lio/github/jan/supabase/auth/status/RefreshFailureCause;", "<init>", "(Lio/github/jan/supabase/auth/status/RefreshFailureCause;)V", "getCause", "()Lio/github/jan/supabase/auth/status/RefreshFailureCause;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class RefreshFailure implements SessionStatus {
        private final RefreshFailureCause cause;

        public RefreshFailure(RefreshFailureCause cause) {
            m.e(cause, "cause");
            this.cause = cause;
        }

        public static RefreshFailure copy$default(RefreshFailure refreshFailure, RefreshFailureCause refreshFailureCause, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                refreshFailureCause = refreshFailure.cause;
            }
            return refreshFailure.copy(refreshFailureCause);
        }

        public final RefreshFailureCause getCause() {
            return this.cause;
        }

        public final RefreshFailure copy(RefreshFailureCause cause) {
            m.e(cause, "cause");
            return new RefreshFailure(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RefreshFailure) && m.a(this.cause, ((RefreshFailure) other).cause);
        }

        public final RefreshFailureCause getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        public String toString() {
            return "RefreshFailure(cause=" + this.cause + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/auth/status/SessionStatus$Authenticated;", "Lio/github/jan/supabase/auth/status/SessionStatus;", "session", "Lio/github/jan/supabase/auth/user/UserSession;", "source", "Lio/github/jan/supabase/auth/status/SessionSource;", "<init>", "(Lio/github/jan/supabase/auth/user/UserSession;Lio/github/jan/supabase/auth/status/SessionSource;)V", "getSession", "()Lio/github/jan/supabase/auth/user/UserSession;", "getSource", "()Lio/github/jan/supabase/auth/status/SessionSource;", "isNew", "", "()Z", "component1", "component2", "copy", "equals", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Authenticated implements SessionStatus {
        private final boolean isNew;
        private final UserSession session;
        private final SessionSource source;

        public Authenticated(UserSession session, SessionSource source) {
            m.e(session, "session");
            m.e(source, "source");
            this.session = session;
            this.source = source;
            this.isNew = (source instanceof SessionSource.SignIn) || (source instanceof SessionSource.SignUp) || (source instanceof SessionSource.External);
        }

        public static Authenticated copy$default(Authenticated authenticated, UserSession userSession, SessionSource sessionSource, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                userSession = authenticated.session;
            }
            if ((i3 & 2) != 0) {
                sessionSource = authenticated.source;
            }
            return authenticated.copy(userSession, sessionSource);
        }

        public final UserSession getSession() {
            return this.session;
        }

        public final SessionSource getSource() {
            return this.source;
        }

        public final Authenticated copy(UserSession session, SessionSource source) {
            m.e(session, "session");
            m.e(source, "source");
            return new Authenticated(session, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Authenticated)) {
                return false;
            }
            Authenticated authenticated = (Authenticated) other;
            return m.a(this.session, authenticated.session) && m.a(this.source, authenticated.source);
        }

        public final UserSession getSession() {
            return this.session;
        }

        public final SessionSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode() + (this.session.hashCode() * 31);
        }

        public final boolean getIsNew() {
            return this.isNew;
        }

        public String toString() {
            return "Authenticated(session=" + this.session + ", source=" + this.source + ')';
        }

        public Authenticated(UserSession userSession, SessionSource sessionSource, int i3, AbstractC2541f abstractC2541f) {
            this(userSession, (i3 & 2) != 0 ? SessionSource.Unknown.INSTANCE : sessionSource);
        }
    }
}
