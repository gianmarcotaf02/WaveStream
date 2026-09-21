package com.revenuecat.purchases.common;

import S7.InterfaceC0894j;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "LS7/j;", "value", "Lh6/A;", "safeResume", "(LS7/j;Ljava/lang/Object;)V", "", SentryEvent.JsonKeys.EXCEPTION, "safeResumeWithException", "(LS7/j;Ljava/lang/Throwable;)V", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CancellableContinuationExtensionsKt {
    public static final <T> void safeResume(InterfaceC0894j interfaceC0894j, T t9) {
        m.e(interfaceC0894j, "<this>");
        if (interfaceC0894j.isActive()) {
            interfaceC0894j.resumeWith(t9);
        }
    }

    public static final <T> void safeResumeWithException(InterfaceC0894j interfaceC0894j, Throwable exception) {
        m.e(interfaceC0894j, "<this>");
        m.e(exception, "exception");
        if (interfaceC0894j.isActive()) {
            interfaceC0894j.resumeWith(P.T(exception));
        }
    }
}
