package com.revenuecat.purchases.google.usecase;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/ConsumePurchaseUseCaseParams;", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "purchaseToken", "", "initiationSource", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "appInBackground", "", "(Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Z)V", "getAppInBackground", "()Z", "getInitiationSource", "()Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "getPurchaseToken", "()Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ConsumePurchaseUseCaseParams implements com.revenuecat.purchases.google.usecase.UseCaseParams {
    private final boolean appInBackground;
    private final com.revenuecat.purchases.PostReceiptInitiationSource initiationSource;
    private final java.lang.String purchaseToken;

    public ConsumePurchaseUseCaseParams(java.lang.String purchaseToken, com.revenuecat.purchases.PostReceiptInitiationSource initiationSource, boolean z6) {
        kotlin.jvm.internal.m.e(purchaseToken, "purchaseToken");
        kotlin.jvm.internal.m.e(initiationSource, "initiationSource");
        this.purchaseToken = purchaseToken;
        this.initiationSource = initiationSource;
        this.appInBackground = z6;
    }

    @Override // com.revenuecat.purchases.google.usecase.UseCaseParams
    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final com.revenuecat.purchases.PostReceiptInitiationSource getInitiationSource() {
        return this.initiationSource;
    }

    public final java.lang.String getPurchaseToken() {
        return this.purchaseToken;
    }
}
