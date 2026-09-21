package io.github.jan.supabase.postgrest.exception;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.exceptions.RestException;
import io.ktor.client.statement.HttpResponse;
import io.sentry.protocol.Response;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lio/github/jan/supabase/postgrest/exception/PostgrestRestException;", "Lio/github/jan/supabase/exceptions/RestException;", "message", "", "hint", "details", "code", Response.TYPE, "Lio/ktor/client/statement/HttpResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/ktor/client/statement/HttpResponse;)V", "getHint", "()Ljava/lang/String;", "getDetails", "getCode", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostgrestRestException extends RestException {
    private final String code;
    private final String details;
    private final String hint;

    public PostgrestRestException(String message, String str, String str2, String str3, HttpResponse response) {
        super(message, str == null ? str2 : str, response);
        m.e(message, "message");
        m.e(response, "response");
        this.hint = str;
        this.details = str2;
        this.code = str3;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getHint() {
        return this.hint;
    }
}
