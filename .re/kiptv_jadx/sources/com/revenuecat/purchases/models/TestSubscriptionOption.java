package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/models/TestSubscriptionOption;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "pricingPhases", "", "Lcom/revenuecat/purchases/models/PricingPhase;", "basePlanId", "", "tags", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "installmentsInfo", "Lcom/revenuecat/purchases/models/InstallmentsInfo;", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/InstallmentsInfo;Lcom/revenuecat/purchases/models/PurchasingData;)V", "getBasePlanId", "()Ljava/lang/String;", "id", "getId", "getInstallmentsInfo", "()Lcom/revenuecat/purchases/models/InstallmentsInfo;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingIdentifier", "getPresentedOfferingIdentifier", "getPricingPhases", "()Ljava/util/List;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "getTags", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class TestSubscriptionOption implements com.revenuecat.purchases.models.SubscriptionOption {
    private final java.lang.String basePlanId;
    private final com.revenuecat.purchases.models.InstallmentsInfo installmentsInfo;
    private final com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext;
    private final java.util.List<com.revenuecat.purchases.models.PricingPhase> pricingPhases;
    private final com.revenuecat.purchases.models.PurchasingData purchasingData;
    private final java.util.List<java.lang.String> tags;

    public TestSubscriptionOption(java.util.List<com.revenuecat.purchases.models.PricingPhase> pricingPhases, java.lang.String basePlanId, java.util.List<java.lang.String> tags, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, com.revenuecat.purchases.models.InstallmentsInfo installmentsInfo, com.revenuecat.purchases.models.PurchasingData purchasingData) {
        kotlin.jvm.internal.m.e(pricingPhases, "pricingPhases");
        kotlin.jvm.internal.m.e(basePlanId, "basePlanId");
        kotlin.jvm.internal.m.e(tags, "tags");
        kotlin.jvm.internal.m.e(presentedOfferingContext, "presentedOfferingContext");
        kotlin.jvm.internal.m.e(purchasingData, "purchasingData");
        this.pricingPhases = pricingPhases;
        this.basePlanId = basePlanId;
        this.tags = tags;
        this.presentedOfferingContext = presentedOfferingContext;
        this.installmentsInfo = installmentsInfo;
        this.purchasingData = purchasingData;
    }

    public final java.lang.String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public java.lang.String getId() {
        return getPricingPhases().size() == 1 ? this.basePlanId : Y6.f.m(new java.lang.StringBuilder(), this.basePlanId, ":testOfferId");
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public com.revenuecat.purchases.models.InstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public com.revenuecat.purchases.PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public java.lang.String getPresentedOfferingIdentifier() {
        return getPresentedOfferingContext().getOfferingIdentifier();
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public java.util.List<com.revenuecat.purchases.models.PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public com.revenuecat.purchases.models.PurchasingData getPurchasingData() {
        return this.purchasingData;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public java.util.List<java.lang.String> getTags() {
        return this.tags;
    }

    public /* synthetic */ TestSubscriptionOption(java.util.List list, java.lang.String str, java.util.List list2, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, com.revenuecat.purchases.models.InstallmentsInfo installmentsInfo, com.revenuecat.purchases.models.PurchasingData purchasingData, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(list, (i3 & 2) != 0 ? "testBasePlanId" : str, (i3 & 4) != 0 ? p078i6.w.f23205h : list2, (i3 & 8) != 0 ? new com.revenuecat.purchases.PresentedOfferingContext("offering") : presentedOfferingContext, (i3 & 16) != 0 ? null : installmentsInfo, purchasingData);
    }
}
