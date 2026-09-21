package io.github.jan.supabase.exceptions;

import androidx.media3.container.NalUnitUtil;
import io.ktor.client.statement.HttpResponse;
import io.sentry.protocol.Response;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/github/jan/supabase/exceptions/UnknownRestException;", "Lio/github/jan/supabase/exceptions/RestException;", "error", "", Response.TYPE, "Lio/ktor/client/statement/HttpResponse;", "message", "<init>", "(Ljava/lang/String;Lio/ktor/client/statement/HttpResponse;Ljava/lang/String;)V", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UnknownRestException extends RestException {
    public UnknownRestException(String error, HttpResponse response, String str) {
        super(error, str, response);
        m.e(error, "error");
        m.e(response, "response");
    }

    public UnknownRestException(String str, HttpResponse httpResponse, String str2, int i3, AbstractC2541f abstractC2541f) {
        this(str, httpResponse, (i3 & 4) != 0 ? null : str2);
    }
}
