package io.github.jan.supabase.postgrest.exception;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lio/github/jan/supabase/postgrest/exception/PostgrestRestException;", "Lio/github/jan/supabase/exceptions/RestException;", "message", "", "hint", "details", "code", io.sentry.protocol.Response.TYPE, "Lio/ktor/client/statement/HttpResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/ktor/client/statement/HttpResponse;)V", "getHint", "()Ljava/lang/String;", "getDetails", "getCode", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostgrestRestException extends io.github.jan.supabase.exceptions.RestException {
    private final java.lang.String code;
    private final java.lang.String details;
    private final java.lang.String hint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostgrestRestException(java.lang.String message, java.lang.String str, java.lang.String str2, java.lang.String str3, io.ktor.client.statement.HttpResponse response) {
        super(message, str == null ? str2 : str, response);
        kotlin.jvm.internal.m.e(message, "message");
        kotlin.jvm.internal.m.e(response, "response");
        this.hint = str;
        this.details = str2;
        this.code = str3;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.String getDetails() {
        return this.details;
    }

    public final java.lang.String getHint() {
        return this.hint;
    }
}
