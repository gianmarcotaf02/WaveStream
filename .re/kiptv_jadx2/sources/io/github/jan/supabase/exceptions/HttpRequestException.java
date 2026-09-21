package io.github.jan.supabase.exceptions;

import androidx.media3.container.NalUnitUtil;
import io.ktor.client.request.HttpRequestBuilder;
import io.sentry.SentryBaseEvent;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/github/jan/supabase/exceptions/HttpRequestException;", "Ljava/io/IOException;", "Lkotlinx/io/IOException;", "message", "", SentryBaseEvent.JsonKeys.REQUEST, "Lio/ktor/client/request/HttpRequestBuilder;", "<init>", "(Ljava/lang/String;Lio/ktor/client/request/HttpRequestBuilder;)V", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpRequestException extends IOException {
    public HttpRequestException(String message, HttpRequestBuilder request) {
        super("HTTP request to " + request.getUrl().buildString() + " (" + request.getMethod().getValue() + ") failed with message: " + message);
        m.e(message, "message");
        m.e(request, "request");
    }
}
