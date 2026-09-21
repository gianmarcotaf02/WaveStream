package io.github.jan.supabase.auth.exception;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lio/github/jan/supabase/auth/exception/AuthWeakPasswordException;", "Lio/github/jan/supabase/auth/exception/AuthRestException;", "description", "", io.sentry.protocol.Response.TYPE, "Lio/ktor/client/statement/HttpResponse;", "reasons", "", "<init>", "(Ljava/lang/String;Lio/ktor/client/statement/HttpResponse;Ljava/util/List;)V", "getReasons", "()Ljava/util/List;", "Companion", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AuthWeakPasswordException extends io.github.jan.supabase.auth.exception.AuthRestException {
    public static final java.lang.String CODE = "weak_password";
    private final java.util.List<java.lang.String> reasons;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthWeakPasswordException(java.lang.String description, io.ktor.client.statement.HttpResponse response, java.util.List<java.lang.String> reasons) {
        super(CODE, description, response);
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(response, "response");
        kotlin.jvm.internal.m.e(reasons, "reasons");
        this.reasons = reasons;
    }

    public final java.util.List<java.lang.String> getReasons() {
        return this.reasons;
    }
}
