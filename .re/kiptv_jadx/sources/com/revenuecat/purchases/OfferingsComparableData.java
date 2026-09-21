package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B7\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\rHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/OfferingsComparableData;", "", "offerings", "Lcom/revenuecat/purchases/Offerings;", "(Lcom/revenuecat/purchases/Offerings;)V", io.sentry.protocol.SentryThread.JsonKeys.CURRENT, "Lcom/revenuecat/purchases/Offering;", androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL, "", "", "placements", "Lcom/revenuecat/purchases/Offerings$Placements;", "targeting", "Lcom/revenuecat/purchases/Offerings$Targeting;", "(Lcom/revenuecat/purchases/Offering;Ljava/util/Map;Lcom/revenuecat/purchases/Offerings$Placements;Lcom/revenuecat/purchases/Offerings$Targeting;)V", "getAll", "()Ljava/util/Map;", "getCurrent", "()Lcom/revenuecat/purchases/Offering;", "getPlacements", "()Lcom/revenuecat/purchases/Offerings$Placements;", "getTargeting", "()Lcom/revenuecat/purchases/Offerings$Targeting;", "component1", "component2", "component3", "component4", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final /* data */ class OfferingsComparableData {
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.Offering> all;
    private final com.revenuecat.purchases.Offering current;
    private final com.revenuecat.purchases.Offerings.Placements placements;
    private final com.revenuecat.purchases.Offerings.Targeting targeting;

    public OfferingsComparableData(com.revenuecat.purchases.Offering offering, java.util.Map<java.lang.String, com.revenuecat.purchases.Offering> all, com.revenuecat.purchases.Offerings.Placements placements, com.revenuecat.purchases.Offerings.Targeting targeting) {
        kotlin.jvm.internal.m.e(all, "all");
        this.current = offering;
        this.all = all;
        this.placements = placements;
        this.targeting = targeting;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.OfferingsComparableData copy$default(com.revenuecat.purchases.OfferingsComparableData offeringsComparableData, com.revenuecat.purchases.Offering offering, java.util.Map map, com.revenuecat.purchases.Offerings.Placements placements, com.revenuecat.purchases.Offerings.Targeting targeting, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            offering = offeringsComparableData.current;
        }
        if ((i3 & 2) != 0) {
            map = offeringsComparableData.all;
        }
        if ((i3 & 4) != 0) {
            placements = offeringsComparableData.placements;
        }
        if ((i3 & 8) != 0) {
            targeting = offeringsComparableData.targeting;
        }
        return offeringsComparableData.copy(offering, map, placements, targeting);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.Offering getCurrent() {
        return this.current;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.Offering> component2() {
        return this.all;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.revenuecat.purchases.Offerings.Placements getPlacements() {
        return this.placements;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final com.revenuecat.purchases.Offerings.Targeting getTargeting() {
        return this.targeting;
    }

    public final com.revenuecat.purchases.OfferingsComparableData copy(com.revenuecat.purchases.Offering current, java.util.Map<java.lang.String, com.revenuecat.purchases.Offering> all, com.revenuecat.purchases.Offerings.Placements placements, com.revenuecat.purchases.Offerings.Targeting targeting) {
        kotlin.jvm.internal.m.e(all, "all");
        return new com.revenuecat.purchases.OfferingsComparableData(current, all, placements, targeting);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.OfferingsComparableData)) {
            return false;
        }
        com.revenuecat.purchases.OfferingsComparableData offeringsComparableData = (com.revenuecat.purchases.OfferingsComparableData) other;
        return kotlin.jvm.internal.m.a(this.current, offeringsComparableData.current) && kotlin.jvm.internal.m.a(this.all, offeringsComparableData.all) && kotlin.jvm.internal.m.a(this.placements, offeringsComparableData.placements) && kotlin.jvm.internal.m.a(this.targeting, offeringsComparableData.targeting);
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.Offering> getAll() {
        return this.all;
    }

    public final com.revenuecat.purchases.Offering getCurrent() {
        return this.current;
    }

    public final com.revenuecat.purchases.Offerings.Placements getPlacements() {
        return this.placements;
    }

    public final com.revenuecat.purchases.Offerings.Targeting getTargeting() {
        return this.targeting;
    }

    public int hashCode() {
        com.revenuecat.purchases.Offering offering = this.current;
        int iC = B2.a.c((offering == null ? 0 : offering.hashCode()) * 31, 31, this.all);
        com.revenuecat.purchases.Offerings.Placements placements = this.placements;
        int iHashCode = (iC + (placements == null ? 0 : placements.hashCode())) * 31;
        com.revenuecat.purchases.Offerings.Targeting targeting = this.targeting;
        return iHashCode + (targeting != null ? targeting.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "OfferingsComparableData(current=" + this.current + ", all=" + this.all + ", placements=" + this.placements + ", targeting=" + this.targeting + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfferingsComparableData(com.revenuecat.purchases.Offerings offerings) {
        this(offerings.getCurrent(), offerings.getAll(), offerings.getPlacements(), offerings.getTargeting());
        kotlin.jvm.internal.m.e(offerings, "offerings");
    }
}
