package io.github.jan.supabase.exceptions;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/github/jan/supabase/exceptions/RestException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "", "description", io.sentry.protocol.Response.TYPE, "Lio/ktor/client/statement/HttpResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/client/statement/HttpResponse;)V", "getError", "()Ljava/lang/String;", "getDescription", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "statusCode", "", "getStatusCode", "()I", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class RestException extends java.lang.Exception {
    private final java.lang.String description;
    private final java.lang.String error;
    private final io.ktor.client.statement.HttpResponse response;
    private final int statusCode;

    public RestException(java.lang.String error, java.lang.String str, io.ktor.client.statement.HttpResponse response) {
        java.lang.String strI;
        kotlin.jvm.internal.m.e(error, "error");
        kotlin.jvm.internal.m.e(response, "response");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n        ");
        sb.append(error);
        sb.append((str == null || (strI = B2.a.i(')', " (", str)) == null) ? "" : strI);
        sb.append("\n        URL: ");
        sb.append(io.ktor.client.statement.HttpResponseKt.getRequest(response).getUrl());
        sb.append("\n        Headers: ");
        sb.append(io.ktor.client.statement.HttpResponseKt.getRequest(response).getHeaders().entries());
        sb.append("\n        Http Method: ");
        sb.append(io.ktor.client.statement.HttpResponseKt.getRequest(response).getMethod().getValue());
        sb.append('\n');
        super(O7.r.T(sb.toString()));
        this.error = error;
        this.description = str;
        this.response = response;
        this.statusCode = response.getStatus().getValue();
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getError() {
        return this.error;
    }

    public final io.ktor.client.statement.HttpResponse getResponse() {
        return this.response;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }
}
