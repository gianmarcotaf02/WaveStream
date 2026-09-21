package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u0006"}, d2 = {"withPresentedContext", "Lcom/revenuecat/purchases/Offering;", "placementId", "", "targeting", "Lcom/revenuecat/purchases/Offerings$Targeting;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OfferingsKt {
    public static final com.revenuecat.purchases.Offering withPresentedContext(com.revenuecat.purchases.Offering offering, java.lang.String str, com.revenuecat.purchases.Offerings.Targeting targeting) {
        kotlin.jvm.internal.m.e(offering, "<this>");
        java.util.List<com.revenuecat.purchases.Package> availablePackages = offering.getAvailablePackages();
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(availablePackages, 10));
        for (com.revenuecat.purchases.Package r9 : availablePackages) {
            com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = r9.getPresentedOfferingContext();
            com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContextCopy$default = com.revenuecat.purchases.PresentedOfferingContext.copy$default(presentedOfferingContext, null, str == null ? presentedOfferingContext.getPlacementIdentifier() : str, targeting != null ? new com.revenuecat.purchases.PresentedOfferingContext.TargetingContext(targeting.getRevision(), targeting.getRuleId()) : presentedOfferingContext.getTargetingContext(), 1, null);
            arrayList.add(new com.revenuecat.purchases.Package(r9.getIdentifier(), r9.getPackageType(), r9.getProduct().copyWithPresentedOfferingContext(presentedOfferingContextCopy$default), presentedOfferingContextCopy$default, r9.getWebCheckoutURL()));
        }
        com.revenuecat.purchases.Offering offering2 = new com.revenuecat.purchases.Offering(offering.getIdentifier(), offering.getServerDescription(), offering.getMetadata(), arrayList, offering.getPaywall(), offering.getPaywallComponents(), offering.getWebCheckoutURL());
        offering2.setHasPaywallComponents$purchases_defaultsRelease(offering.getHasPaywallComponents());
        return offering2;
    }
}
