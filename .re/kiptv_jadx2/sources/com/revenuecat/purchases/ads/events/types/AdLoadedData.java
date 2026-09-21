package com.revenuecat.purchases.ads.events.types;

import B2.a;
import Y6.f;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0014\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdLoadedData;", "", "", "networkName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "adFormat", "placement", "adUnitId", "impressionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/f;)V", "Ljava/lang/String;", "getNetworkName", "()Ljava/lang/String;", "getMediatorName-GyoM_N4", "getAdFormat-y0COY5Q", "getPlacement", "getAdUnitId", "getImpressionId", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AdLoadedData {
    private final String adFormat;
    private final String adUnitId;
    private final String impressionId;
    private final String mediatorName;
    private final String networkName;
    private final String placement;

    public AdLoadedData(String str, String str2, String str3, String str4, String str5, String str6, AbstractC2541f abstractC2541f) {
        this(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdLoadedData)) {
            return false;
        }
        AdLoadedData adLoadedData = (AdLoadedData) obj;
        return m.a(this.networkName, adLoadedData.networkName) && AdMediatorName.m102equalsimpl0(this.mediatorName, adLoadedData.mediatorName) && AdFormat.m85equalsimpl0(this.adFormat, adLoadedData.adFormat) && m.a(this.placement, adLoadedData.placement) && m.a(this.adUnitId, adLoadedData.adUnitId) && m.a(this.impressionId, adLoadedData.impressionId);
    }

    public final String getAdFormat() {
        return this.adFormat;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
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

    public int hashCode() {
        String str = this.networkName;
        int iM86hashCodeimpl = (AdFormat.m86hashCodeimpl(this.adFormat) + ((AdMediatorName.m103hashCodeimpl(this.mediatorName) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        String str2 = this.placement;
        return this.impressionId.hashCode() + a.a((iM86hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.adUnitId);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdLoadedData(networkName=");
        sb.append(this.networkName);
        sb.append(", mediatorName=");
        sb.append((Object) AdMediatorName.m104toStringimpl(this.mediatorName));
        sb.append(", adFormat=");
        sb.append((Object) AdFormat.m87toStringimpl(this.adFormat));
        sb.append(", placement=");
        sb.append(this.placement);
        sb.append(", adUnitId=");
        sb.append(this.adUnitId);
        sb.append(", impressionId=");
        return f.l(sb, this.impressionId, ')');
    }

    private AdLoadedData(String str, String mediatorName, String adFormat, String str2, String adUnitId, String impressionId) {
        m.e(mediatorName, "mediatorName");
        m.e(adFormat, "adFormat");
        m.e(adUnitId, "adUnitId");
        m.e(impressionId, "impressionId");
        this.networkName = str;
        this.mediatorName = mediatorName;
        this.adFormat = adFormat;
        this.placement = str2;
        this.adUnitId = adUnitId;
        this.impressionId = impressionId;
    }
}
