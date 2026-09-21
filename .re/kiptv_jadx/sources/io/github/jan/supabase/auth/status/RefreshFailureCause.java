package io.github.jan.supabase.auth.status;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lio/github/jan/supabase/auth/status/RefreshFailureCause;", "", "NetworkError", "InternalServerError", "Lio/github/jan/supabase/auth/status/RefreshFailureCause$InternalServerError;", "Lio/github/jan/supabase/auth/status/RefreshFailureCause$NetworkError;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface RefreshFailureCause {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/status/RefreshFailureCause$InternalServerError;", "Lio/github/jan/supabase/auth/status/RefreshFailureCause;", io.sentry.SentryEvent.JsonKeys.EXCEPTION, "Lio/github/jan/supabase/exceptions/RestException;", "<init>", "(Lio/github/jan/supabase/exceptions/RestException;)V", "getException", "()Lio/github/jan/supabase/exceptions/RestException;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class InternalServerError implements io.github.jan.supabase.auth.status.RefreshFailureCause {
        private final io.github.jan.supabase.exceptions.RestException exception;

        public InternalServerError(io.github.jan.supabase.exceptions.RestException exception) {
            kotlin.jvm.internal.m.e(exception, "exception");
            this.exception = exception;
        }

        public static /* synthetic */ io.github.jan.supabase.auth.status.RefreshFailureCause.InternalServerError copy$default(io.github.jan.supabase.auth.status.RefreshFailureCause.InternalServerError internalServerError, io.github.jan.supabase.exceptions.RestException restException, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                restException = internalServerError.exception;
            }
            return internalServerError.copy(restException);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final io.github.jan.supabase.exceptions.RestException getException() {
            return this.exception;
        }

        public final io.github.jan.supabase.auth.status.RefreshFailureCause.InternalServerError copy(io.github.jan.supabase.exceptions.RestException exception) {
            kotlin.jvm.internal.m.e(exception, "exception");
            return new io.github.jan.supabase.auth.status.RefreshFailureCause.InternalServerError(exception);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.github.jan.supabase.auth.status.RefreshFailureCause.InternalServerError) && kotlin.jvm.internal.m.a(this.exception, ((io.github.jan.supabase.auth.status.RefreshFailureCause.InternalServerError) other).exception);
        }

        public final io.github.jan.supabase.exceptions.RestException getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public java.lang.String toString() {
            return "InternalServerError(exception=" + this.exception + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/status/RefreshFailureCause$NetworkError;", "Lio/github/jan/supabase/auth/status/RefreshFailureCause;", io.sentry.SentryEvent.JsonKeys.EXCEPTION, "", "<init>", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class NetworkError implements io.github.jan.supabase.auth.status.RefreshFailureCause {
        private final java.lang.Throwable exception;

        public NetworkError(java.lang.Throwable exception) {
            kotlin.jvm.internal.m.e(exception, "exception");
            this.exception = exception;
        }

        public static /* synthetic */ io.github.jan.supabase.auth.status.RefreshFailureCause.NetworkError copy$default(io.github.jan.supabase.auth.status.RefreshFailureCause.NetworkError networkError, java.lang.Throwable th, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                th = networkError.exception;
            }
            return networkError.copy(th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.Throwable getException() {
            return this.exception;
        }

        public final io.github.jan.supabase.auth.status.RefreshFailureCause.NetworkError copy(java.lang.Throwable exception) {
            kotlin.jvm.internal.m.e(exception, "exception");
            return new io.github.jan.supabase.auth.status.RefreshFailureCause.NetworkError(exception);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.github.jan.supabase.auth.status.RefreshFailureCause.NetworkError) && kotlin.jvm.internal.m.a(this.exception, ((io.github.jan.supabase.auth.status.RefreshFailureCause.NetworkError) other).exception);
        }

        public final java.lang.Throwable getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public java.lang.String toString() {
            return "NetworkError(exception=" + this.exception + ')';
        }
    }
}
