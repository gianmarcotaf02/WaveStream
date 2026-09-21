package com.revenuecat.purchases.ads.events.types;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdRevenueData;", "", "", "networkName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "adFormat", "placement", "adUnitId", "impressionId", "", "revenueMicros", "currency", "Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision;", "precision", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/f;)V", "Ljava/lang/String;", "getNetworkName", "()Ljava/lang/String;", "getMediatorName-GyoM_N4", "getAdFormat-y0COY5Q", "getPlacement", "getAdUnitId", "getImpressionId", "J", "getRevenueMicros", "()J", "getCurrency", "getPrecision-rAcPn4k", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AdRevenueData {
    private final java.lang.String adFormat;
    private final java.lang.String adUnitId;
    private final java.lang.String currency;
    private final java.lang.String impressionId;
    private final java.lang.String mediatorName;
    private final java.lang.String networkName;
    private final java.lang.String placement;
    private final java.lang.String precision;
    private final long revenueMicros;

    public /* synthetic */ AdRevenueData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j, java.lang.String str7, java.lang.String str8, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, str3, str4, str5, str6, j, str7, str8);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.ads.events.types.AdRevenueData)) {
            return false;
        }
        com.revenuecat.purchases.ads.events.types.AdRevenueData adRevenueData = (com.revenuecat.purchases.ads.events.types.AdRevenueData) obj;
        return kotlin.jvm.internal.m.a(this.networkName, adRevenueData.networkName) && com.revenuecat.purchases.ads.events.types.AdMediatorName.m102equalsimpl0(this.mediatorName, adRevenueData.mediatorName) && com.revenuecat.purchases.ads.events.types.AdFormat.m85equalsimpl0(this.adFormat, adRevenueData.adFormat) && kotlin.jvm.internal.m.a(this.placement, adRevenueData.placement) && kotlin.jvm.internal.m.a(this.adUnitId, adRevenueData.adUnitId) && kotlin.jvm.internal.m.a(this.impressionId, adRevenueData.impressionId) && this.revenueMicros == adRevenueData.revenueMicros && kotlin.jvm.internal.m.a(this.currency, adRevenueData.currency) && com.revenuecat.purchases.ads.events.types.AdRevenuePrecision.m117equalsimpl0(this.precision, adRevenueData.precision);
    }

    /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: not valid java name and from getter */
    public final java.lang.String getAdFormat() {
        return this.adFormat;
    }

    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    public final java.lang.String getCurrency() {
        return this.currency;
    }

    public final java.lang.String getImpressionId() {
        return this.impressionId;
    }

    /* JADX INFO: renamed from: getMediatorName-GyoM_N4, reason: not valid java name and from getter */
    public final java.lang.String getMediatorName() {
        return this.mediatorName;
    }

    public final java.lang.String getNetworkName() {
        return this.networkName;
    }

    public final java.lang.String getPlacement() {
        return this.placement;
    }

    /* JADX INFO: renamed from: getPrecision-rAcPn4k, reason: not valid java name and from getter */
    public final java.lang.String getPrecision() {
        return this.precision;
    }

    public final long getRevenueMicros() {
        return this.revenueMicros;
    }

    public int hashCode() {
        java.lang.String str = this.networkName;
        int iM86hashCodeimpl = (com.revenuecat.purchases.ads.events.types.AdFormat.m86hashCodeimpl(this.adFormat) + ((com.revenuecat.purchases.ads.events.types.AdMediatorName.m103hashCodeimpl(this.mediatorName) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        java.lang.String str2 = this.placement;
        return com.revenuecat.purchases.ads.events.types.AdRevenuePrecision.m118hashCodeimpl(this.precision) + B2.a.a(p121o0.p.e(B2.a.a(B2.a.a((iM86hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.adUnitId), 31, this.impressionId), 31, this.revenueMicros), 31, this.currency);
    }

    public java.lang.String toString() {
        return "AdRevenueData(networkName=" + this.networkName + ", mediatorName=" + ((java.lang.Object) com.revenuecat.purchases.ads.events.types.AdMediatorName.m104toStringimpl(this.mediatorName)) + ", adFormat=" + ((java.lang.Object) com.revenuecat.purchases.ads.events.types.AdFormat.m87toStringimpl(this.adFormat)) + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", impressionId=" + this.impressionId + ", revenueMicros=" + this.revenueMicros + ", currency=" + this.currency + ", precision=" + ((java.lang.Object) com.revenuecat.purchases.ads.events.types.AdRevenuePrecision.m119toStringimpl(this.precision)) + ')';
    }

    private AdRevenueData(java.lang.String str, java.lang.String mediatorName, java.lang.String adFormat, java.lang.String str2, java.lang.String adUnitId, java.lang.String impressionId, long j, java.lang.String currency, java.lang.String precision) {
        kotlin.jvm.internal.m.e(mediatorName, "mediatorName");
        kotlin.jvm.internal.m.e(adFormat, "adFormat");
        kotlin.jvm.internal.m.e(adUnitId, "adUnitId");
        kotlin.jvm.internal.m.e(impressionId, "impressionId");
        kotlin.jvm.internal.m.e(currency, "currency");
        kotlin.jvm.internal.m.e(precision, "precision");
        this.networkName = str;
        this.mediatorName = mediatorName;
        this.adFormat = adFormat;
        this.placement = str2;
        this.adUnitId = adUnitId;
        this.impressionId = impressionId;
        this.revenueMicros = j;
        this.currency = currency;
        this.precision = precision;
    }
}
