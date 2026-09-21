package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchasesOrchestrator$startProductChange$$inlined$log$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.common.LogIntent $intent;
    final /* synthetic */ java.lang.String $oldProductId$inlined;
    final /* synthetic */ com.revenuecat.purchases.PresentedOfferingContext $presentedOfferingContext$inlined;
    final /* synthetic */ com.revenuecat.purchases.models.PurchasingData $purchasingData$inlined;
    final /* synthetic */ com.revenuecat.purchases.models.StoreReplacementMode $replacementMode$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$startProductChange$$inlined$log$1(com.revenuecat.purchases.common.LogIntent logIntent, com.revenuecat.purchases.models.PurchasingData purchasingData, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, java.lang.String str, com.revenuecat.purchases.models.StoreReplacementMode storeReplacementMode) {
        super(0);
        this.$intent = logIntent;
        this.$purchasingData$inlined = purchasingData;
        this.$presentedOfferingContext$inlined = presentedOfferingContext;
        this.$oldProductId$inlined = str;
        this.$replacementMode$inlined = storeReplacementMode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.String invoke() {
        java.lang.String offeringIdentifier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p078i6.o.o1(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(io.ktor.sse.ServerSentEventKt.SPACE);
        sb2.append(this.$purchasingData$inlined);
        sb2.append(' ');
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = this.$presentedOfferingContext$inlined;
        sb2.append((presentedOfferingContext == null || (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) == null) ? null : com.revenuecat.purchases.strings.PurchaseStrings.OFFERING.concat(offeringIdentifier));
        sb2.append(" oldProductId: ");
        sb2.append(this.$oldProductId$inlined);
        sb2.append(" replacementMode ");
        sb2.append(this.$replacementMode$inlined);
        return B2.a.p(new java.lang.Object[]{sb2.toString()}, 1, com.revenuecat.purchases.strings.PurchaseStrings.PRODUCT_CHANGE_STARTED, sb);
    }
}
