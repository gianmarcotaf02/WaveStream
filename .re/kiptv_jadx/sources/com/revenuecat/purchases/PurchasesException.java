package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/PurchasesException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Lcom/revenuecat/purchases/PurchasesError;", "(Lcom/revenuecat/purchases/PurchasesError;)V", "overridenMessage", "", "(Lcom/revenuecat/purchases/PurchasesError;Ljava/lang/String;)V", "code", "Lcom/revenuecat/purchases/PurchasesErrorCode;", "getCode", "()Lcom/revenuecat/purchases/PurchasesErrorCode;", "getError", "()Lcom/revenuecat/purchases/PurchasesError;", "message", "getMessage", "()Ljava/lang/String;", "getOverridenMessage$purchases_defaultsRelease", "underlyingErrorMessage", "getUnderlyingErrorMessage", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class PurchasesException extends java.lang.Exception {
    private final com.revenuecat.purchases.PurchasesError error;
    private final java.lang.String overridenMessage;

    public /* synthetic */ PurchasesException(com.revenuecat.purchases.PurchasesError purchasesError, java.lang.String str, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(purchasesError, (i3 & 2) != 0 ? null : str);
    }

    public final com.revenuecat.purchases.PurchasesErrorCode getCode() {
        return this.error.getCode();
    }

    public final com.revenuecat.purchases.PurchasesError getError() {
        return this.error;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.String str = this.overridenMessage;
        return str == null ? this.error.getMessage() : str;
    }

    /* JADX INFO: renamed from: getOverridenMessage$purchases_defaultsRelease, reason: from getter */
    public final java.lang.String getOverridenMessage() {
        return this.overridenMessage;
    }

    public final java.lang.String getUnderlyingErrorMessage() {
        return this.error.getUnderlyingErrorMessage();
    }

    public PurchasesException(com.revenuecat.purchases.PurchasesError error, java.lang.String str) {
        kotlin.jvm.internal.m.e(error, "error");
        this.error = error;
        this.overridenMessage = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PurchasesException(com.revenuecat.purchases.PurchasesError error) {
        this(error, null);
        kotlin.jvm.internal.m.e(error, "error");
    }
}
