package io.github.jan.supabase.auth.exception;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/github/jan/supabase/auth/exception/AuthRestException;", "Lio/github/jan/supabase/exceptions/RestException;", "errorCode", "", "errorDescription", io.sentry.protocol.Response.TYPE, "Lio/ktor/client/statement/HttpResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/client/statement/HttpResponse;)V", "getErrorDescription", "()Ljava/lang/String;", "Lio/github/jan/supabase/auth/exception/AuthErrorCode;", "getErrorCode", "()Lio/github/jan/supabase/auth/exception/AuthErrorCode;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class AuthRestException extends io.github.jan.supabase.exceptions.RestException {
    private final io.github.jan.supabase.auth.exception.AuthErrorCode errorCode;
    private final java.lang.String errorDescription;

    public AuthRestException(java.lang.String errorCode, java.lang.String errorDescription, io.ktor.client.statement.HttpResponse response) {
        kotlin.jvm.internal.m.e(errorCode, "errorCode");
        kotlin.jvm.internal.m.e(errorDescription, "errorDescription");
        kotlin.jvm.internal.m.e(response, "response");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(errorDescription);
        super(errorCode, Y6.f.m(sb, ": ", errorCode), response);
        this.errorDescription = errorDescription;
        this.errorCode = io.github.jan.supabase.auth.exception.AuthErrorCode.INSTANCE.fromValue(errorCode);
    }

    public final io.github.jan.supabase.auth.exception.AuthErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.String getErrorDescription() {
        return this.errorDescription;
    }
}
