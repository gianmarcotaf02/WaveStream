package io.github.jan.supabase.auth.exception;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.exceptions.RestException;
import io.ktor.client.statement.HttpResponse;
import io.sentry.protocol.Response;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/github/jan/supabase/auth/exception/AuthRestException;", "Lio/github/jan/supabase/exceptions/RestException;", "errorCode", "", "errorDescription", Response.TYPE, "Lio/ktor/client/statement/HttpResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/client/statement/HttpResponse;)V", "getErrorDescription", "()Ljava/lang/String;", "Lio/github/jan/supabase/auth/exception/AuthErrorCode;", "getErrorCode", "()Lio/github/jan/supabase/auth/exception/AuthErrorCode;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class AuthRestException extends RestException {
    private final AuthErrorCode errorCode;
    private final String errorDescription;

    public AuthRestException(String errorCode, String errorDescription, HttpResponse response) {
        m.e(errorCode, "errorCode");
        m.e(errorDescription, "errorDescription");
        m.e(response, "response");
        StringBuilder sb = new StringBuilder();
        sb.append(errorDescription);
        super(errorCode, f.m(sb, ": ", errorCode), response);
        this.errorDescription = errorDescription;
        this.errorCode = AuthErrorCode.INSTANCE.fromValue(errorCode);
    }

    public final AuthErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }
}
