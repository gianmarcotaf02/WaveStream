package com.revenuecat.purchases.common.verification;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SignatureVerificationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "apiPath", "", "(Ljava/lang/String;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SignatureVerificationException extends java.lang.Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignatureVerificationException(java.lang.String apiPath) {
        super("Failed signature verification for request with path ".concat(apiPath));
        kotlin.jvm.internal.m.e(apiPath, "apiPath");
    }
}
