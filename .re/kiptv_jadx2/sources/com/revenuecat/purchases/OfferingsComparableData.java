package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryThread;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B7\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\rHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/OfferingsComparableData;", "", "offerings", "Lcom/revenuecat/purchases/Offerings;", "(Lcom/revenuecat/purchases/Offerings;)V", SentryThread.JsonKeys.CURRENT, "Lcom/revenuecat/purchases/Offering;", TtmlNode.COMBINE_ALL, "", "", "placements", "Lcom/revenuecat/purchases/Offerings$Placements;", "targeting", "Lcom/revenuecat/purchases/Offerings$Targeting;", "(Lcom/revenuecat/purchases/Offering;Ljava/util/Map;Lcom/revenuecat/purchases/Offerings$Placements;Lcom/revenuecat/purchases/Offerings$Targeting;)V", "getAll", "()Ljava/util/Map;", "getCurrent", "()Lcom/revenuecat/purchases/Offering;", "getPlacements", "()Lcom/revenuecat/purchases/Offerings$Placements;", "getTargeting", "()Lcom/revenuecat/purchases/Offerings$Targeting;", "component1", "component2", "component3", "component4", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class OfferingsComparableData {
    private final Map<String, Offering> all;
    private final Offering current;
    private final Offerings.Placements placements;
    private final Offerings.Targeting targeting;

    public OfferingsComparableData(Offering offering, Map<String, Offering> all, Offerings.Placements placements, Offerings.Targeting targeting) {
        m.e(all, "all");
        this.current = offering;
        this.all = all;
        this.placements = placements;
        this.targeting = targeting;
    }

    public static OfferingsComparableData copy$default(OfferingsComparableData offeringsComparableData, Offering offering, Map map, Offerings.Placements placements, Offerings.Targeting targeting, int i3, Object obj) {
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

    public final Offering getCurrent() {
        return this.current;
    }

    public final Map<String, Offering> component2() {
        return this.all;
    }

    public final Offerings.Placements getPlacements() {
        return this.placements;
    }

    public final Offerings.Targeting getTargeting() {
        return this.targeting;
    }

    public final OfferingsComparableData copy(Offering current, Map<String, Offering> all, Offerings.Placements placements, Offerings.Targeting targeting) {
        m.e(all, "all");
        return new OfferingsComparableData(current, all, placements, targeting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferingsComparableData)) {
            return false;
        }
        OfferingsComparableData offeringsComparableData = (OfferingsComparableData) other;
        return m.a(this.current, offeringsComparableData.current) && m.a(this.all, offeringsComparableData.all) && m.a(this.placements, offeringsComparableData.placements) && m.a(this.targeting, offeringsComparableData.targeting);
    }

    public final Map<String, Offering> getAll() {
        return this.all;
    }

    public final Offering getCurrent() {
        return this.current;
    }

    public final Offerings.Placements getPlacements() {
        return this.placements;
    }

    public final Offerings.Targeting getTargeting() {
        return this.targeting;
    }

    public int hashCode() {
        Offering offering = this.current;
        int iC = B2.a.c((offering == null ? 0 : offering.hashCode()) * 31, 31, this.all);
        Offerings.Placements placements = this.placements;
        int iHashCode = (iC + (placements == null ? 0 : placements.hashCode())) * 31;
        Offerings.Targeting targeting = this.targeting;
        return iHashCode + (targeting != null ? targeting.hashCode() : 0);
    }

    public String toString() {
        return "OfferingsComparableData(current=" + this.current + ", all=" + this.all + ", placements=" + this.placements + ", targeting=" + this.targeting + ')';
    }

    public OfferingsComparableData(Offerings offerings) {
        this(offerings.getCurrent(), offerings.getAll(), offerings.getPlacements(), offerings.getTargeting());
        m.e(offerings, "offerings");
    }
}
