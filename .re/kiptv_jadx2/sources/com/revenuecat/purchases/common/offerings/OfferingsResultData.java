package com.revenuecat.purchases.common.offerings;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.Offerings;
import io.sentry.protocol.Request;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p121o0.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "", "offerings", "Lcom/revenuecat/purchases/Offerings;", "requestedProductIds", "", "", "notFoundProductIds", "(Lcom/revenuecat/purchases/Offerings;Ljava/util/Set;Ljava/util/Set;)V", "getNotFoundProductIds", "()Ljava/util/Set;", "getOfferings", "()Lcom/revenuecat/purchases/Offerings;", "getRequestedProductIds", "component1", "component2", "component3", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OfferingsResultData {
    private final Set<String> notFoundProductIds;
    private final Offerings offerings;
    private final Set<String> requestedProductIds;

    public OfferingsResultData(Offerings offerings, Set<String> requestedProductIds, Set<String> notFoundProductIds) {
        m.e(offerings, "offerings");
        m.e(requestedProductIds, "requestedProductIds");
        m.e(notFoundProductIds, "notFoundProductIds");
        this.offerings = offerings;
        this.requestedProductIds = requestedProductIds;
        this.notFoundProductIds = notFoundProductIds;
    }

    public static OfferingsResultData copy$default(OfferingsResultData offeringsResultData, Offerings offerings, Set set, Set set2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            offerings = offeringsResultData.offerings;
        }
        if ((i3 & 2) != 0) {
            set = offeringsResultData.requestedProductIds;
        }
        if ((i3 & 4) != 0) {
            set2 = offeringsResultData.notFoundProductIds;
        }
        return offeringsResultData.copy(offerings, set, set2);
    }

    public final Offerings getOfferings() {
        return this.offerings;
    }

    public final Set<String> component2() {
        return this.requestedProductIds;
    }

    public final Set<String> component3() {
        return this.notFoundProductIds;
    }

    public final OfferingsResultData copy(Offerings offerings, Set<String> requestedProductIds, Set<String> notFoundProductIds) {
        m.e(offerings, "offerings");
        m.e(requestedProductIds, "requestedProductIds");
        m.e(notFoundProductIds, "notFoundProductIds");
        return new OfferingsResultData(offerings, requestedProductIds, notFoundProductIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferingsResultData)) {
            return false;
        }
        OfferingsResultData offeringsResultData = (OfferingsResultData) other;
        return m.a(this.offerings, offeringsResultData.offerings) && m.a(this.requestedProductIds, offeringsResultData.requestedProductIds) && m.a(this.notFoundProductIds, offeringsResultData.notFoundProductIds);
    }

    public final Set<String> getNotFoundProductIds() {
        return this.notFoundProductIds;
    }

    public final Offerings getOfferings() {
        return this.offerings;
    }

    public final Set<String> getRequestedProductIds() {
        return this.requestedProductIds;
    }

    public int hashCode() {
        return this.notFoundProductIds.hashCode() + p.g(this.requestedProductIds, this.offerings.hashCode() * 31, 31);
    }

    public String toString() {
        return "OfferingsResultData(offerings=" + this.offerings + ", requestedProductIds=" + this.requestedProductIds + ", notFoundProductIds=" + this.notFoundProductIds + ')';
    }
}
