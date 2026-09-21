package com.revenuecat.purchases.ads.events.types;

import B2.a;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p121o0.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdRevenueData;", "", "", "networkName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "adFormat", "placement", "adUnitId", "impressionId", "", "revenueMicros", "currency", "Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision;", "precision", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/f;)V", "Ljava/lang/String;", "getNetworkName", "()Ljava/lang/String;", "getMediatorName-GyoM_N4", "getAdFormat-y0COY5Q", "getPlacement", "getAdUnitId", "getImpressionId", "J", "getRevenueMicros", "()J", "getCurrency", "getPrecision-rAcPn4k", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AdRevenueData {
    private final String adFormat;
    private final String adUnitId;
    private final String currency;
    private final String impressionId;
    private final String mediatorName;
    private final String networkName;
    private final String placement;
    private final String precision;
    private final long revenueMicros;

    public AdRevenueData(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, String str8, AbstractC2541f abstractC2541f) {
        this(str, str2, str3, str4, str5, str6, j, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdRevenueData)) {
            return false;
        }
        AdRevenueData adRevenueData = (AdRevenueData) obj;
        return m.a(this.networkName, adRevenueData.networkName) && AdMediatorName.m102equalsimpl0(this.mediatorName, adRevenueData.mediatorName) && AdFormat.m85equalsimpl0(this.adFormat, adRevenueData.adFormat) && m.a(this.placement, adRevenueData.placement) && m.a(this.adUnitId, adRevenueData.adUnitId) && m.a(this.impressionId, adRevenueData.impressionId) && this.revenueMicros == adRevenueData.revenueMicros && m.a(this.currency, adRevenueData.currency) && AdRevenuePrecision.m117equalsimpl0(this.precision, adRevenueData.precision);
    }

    public final String getAdFormat() {
        return this.adFormat;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    public final String getMediatorName() {
        return this.mediatorName;
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public final String getPrecision() {
        return this.precision;
    }

    public final long getRevenueMicros() {
        return this.revenueMicros;
    }

    public int hashCode() {
        String str = this.networkName;
        int iM86hashCodeimpl = (AdFormat.m86hashCodeimpl(this.adFormat) + ((AdMediatorName.m103hashCodeimpl(this.mediatorName) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        String str2 = this.placement;
        return AdRevenuePrecision.m118hashCodeimpl(this.precision) + a.a(p.e(a.a(a.a((iM86hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.adUnitId), 31, this.impressionId), 31, this.revenueMicros), 31, this.currency);
    }

    public String toString() {
        return "AdRevenueData(networkName=" + this.networkName + ", mediatorName=" + ((Object) AdMediatorName.m104toStringimpl(this.mediatorName)) + ", adFormat=" + ((Object) AdFormat.m87toStringimpl(this.adFormat)) + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", impressionId=" + this.impressionId + ", revenueMicros=" + this.revenueMicros + ", currency=" + this.currency + ", precision=" + ((Object) AdRevenuePrecision.m119toStringimpl(this.precision)) + ')';
    }

    private AdRevenueData(String str, String mediatorName, String adFormat, String str2, String adUnitId, String impressionId, long j, String currency, String precision) {
        m.e(mediatorName, "mediatorName");
        m.e(adFormat, "adFormat");
        m.e(adUnitId, "adUnitId");
        m.e(impressionId, "impressionId");
        m.e(currency, "currency");
        m.e(precision, "precision");
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
