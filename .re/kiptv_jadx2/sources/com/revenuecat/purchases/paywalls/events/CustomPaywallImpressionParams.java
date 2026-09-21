package com.revenuecat.purchases.paywalls.events;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.PresentedOfferingContext;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p070h6.c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001d\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006B\u001b\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB%\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/CustomPaywallImpressionParams;", "", "paywallId", "", "(Ljava/lang/String;)V", "offeringId", "(Ljava/lang/String;Ljava/lang/String;)V", "offering", "Lcom/revenuecat/purchases/Offering;", "(Ljava/lang/String;Lcom/revenuecat/purchases/Offering;)V", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "getOfferingId", "()Ljava/lang/String;", "getPaywallId", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomPaywallImpressionParams {
    private final String offeringId;
    private final String paywallId;
    private final PresentedOfferingContext presentedOfferingContext;

    public CustomPaywallImpressionParams() {
        this((String) null, 1, (AbstractC2541f) (0 == true ? 1 : 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomPaywallImpressionParams)) {
            return false;
        }
        CustomPaywallImpressionParams customPaywallImpressionParams = (CustomPaywallImpressionParams) obj;
        return m.a(this.paywallId, customPaywallImpressionParams.paywallId) && m.a(this.offeringId, customPaywallImpressionParams.offeringId) && m.a(this.presentedOfferingContext, customPaywallImpressionParams.presentedOfferingContext);
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final String getPaywallId() {
        return this.paywallId;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public int hashCode() {
        String str = this.paywallId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.offeringId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        return iHashCode2 + (presentedOfferingContext != null ? presentedOfferingContext.hashCode() : 0);
    }

    public String toString() {
        return "CustomPaywallImpressionParams(paywallId=" + this.paywallId + ", offeringId=" + this.offeringId + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    public CustomPaywallImpressionParams(Offering offering) {
        this((String) null, offering, 1, (AbstractC2541f) (0 == true ? 1 : 0));
        m.e(offering, "offering");
    }

    public CustomPaywallImpressionParams(String str, String str2, PresentedOfferingContext presentedOfferingContext) {
        this.paywallId = str;
        this.offeringId = str2;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public CustomPaywallImpressionParams(String str) {
        this(str, (String) null, (PresentedOfferingContext) null);
    }

    public CustomPaywallImpressionParams(String str, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : str);
    }

    @c
    public CustomPaywallImpressionParams(String str, String str2) {
        this(str, str2, (PresentedOfferingContext) null);
    }

    public CustomPaywallImpressionParams(String str, String str2, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : str, str2);
    }

    public CustomPaywallImpressionParams(String str, Offering offering, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : str, offering);
    }

    public CustomPaywallImpressionParams(String str, Offering offering) {
        this(str, offering.getIdentifier(), offering.getPresentedOfferingContext());
        m.e(offering, "offering");
    }
}
