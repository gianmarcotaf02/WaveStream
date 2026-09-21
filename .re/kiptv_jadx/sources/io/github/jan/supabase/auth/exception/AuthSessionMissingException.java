package io.github.jan.supabase.auth.exception;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/exception/AuthSessionMissingException;", "Lio/github/jan/supabase/auth/exception/AuthRestException;", io.sentry.protocol.Response.TYPE, "Lio/ktor/client/statement/HttpResponse;", "<init>", "(Lio/ktor/client/statement/HttpResponse;)V", "Companion", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AuthSessionMissingException extends io.github.jan.supabase.auth.exception.AuthRestException {
    public static final java.lang.String CODE = "session_not_found";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthSessionMissingException(io.ktor.client.statement.HttpResponse response) {
        super(CODE, "Session not found. This can happen if the user was logged out or deleted.", response);
        kotlin.jvm.internal.m.e(response, "response");
    }
}
