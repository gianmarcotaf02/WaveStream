package io.github.jan.supabase.auth.exception;

import androidx.media3.container.NalUnitUtil;
import io.ktor.client.statement.HttpResponse;
import io.sentry.protocol.Response;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lio/github/jan/supabase/auth/exception/AuthWeakPasswordException;", "Lio/github/jan/supabase/auth/exception/AuthRestException;", "description", "", Response.TYPE, "Lio/ktor/client/statement/HttpResponse;", "reasons", "", "<init>", "(Ljava/lang/String;Lio/ktor/client/statement/HttpResponse;Ljava/util/List;)V", "getReasons", "()Ljava/util/List;", "Companion", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AuthWeakPasswordException extends AuthRestException {
    public static final String CODE = "weak_password";
    private final List<String> reasons;

    public AuthWeakPasswordException(String description, HttpResponse response, List<String> reasons) {
        super(CODE, description, response);
        m.e(description, "description");
        m.e(response, "response");
        m.e(reasons, "reasons");
        this.reasons = reasons;
    }

    public final List<String> getReasons() {
        return this.reasons;
    }
}
