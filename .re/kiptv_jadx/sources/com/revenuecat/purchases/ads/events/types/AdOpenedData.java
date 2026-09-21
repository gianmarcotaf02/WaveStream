package com.revenuecat.purchases.ads.events.types;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0014\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdOpenedData;", "", "", "networkName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "adFormat", "placement", "adUnitId", "impressionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/f;)V", "Ljava/lang/String;", "getNetworkName", "()Ljava/lang/String;", "getMediatorName-GyoM_N4", "getAdFormat-y0COY5Q", "getPlacement", "getAdUnitId", "getImpressionId", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AdOpenedData {
    private final java.lang.String adFormat;
    private final java.lang.String adUnitId;
    private final java.lang.String impressionId;
    private final java.lang.String mediatorName;
    private final java.lang.String networkName;
    private final java.lang.String placement;

    public /* synthetic */ AdOpenedData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.ads.events.types.AdOpenedData)) {
            return false;
        }
        com.revenuecat.purchases.ads.events.types.AdOpenedData adOpenedData = (com.revenuecat.purchases.ads.events.types.AdOpenedData) obj;
        return kotlin.jvm.internal.m.a(this.networkName, adOpenedData.networkName) && com.revenuecat.purchases.ads.events.types.AdMediatorName.m102equalsimpl0(this.mediatorName, adOpenedData.mediatorName) && com.revenuecat.purchases.ads.events.types.AdFormat.m85equalsimpl0(this.adFormat, adOpenedData.adFormat) && kotlin.jvm.internal.m.a(this.placement, adOpenedData.placement) && kotlin.jvm.internal.m.a(this.adUnitId, adOpenedData.adUnitId) && kotlin.jvm.internal.m.a(this.impressionId, adOpenedData.impressionId);
    }

    /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: not valid java name and from getter */
    public final java.lang.String getAdFormat() {
        return this.adFormat;
    }

    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
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

    public int hashCode() {
        java.lang.String str = this.networkName;
        int iM86hashCodeimpl = (com.revenuecat.purchases.ads.events.types.AdFormat.m86hashCodeimpl(this.adFormat) + ((com.revenuecat.purchases.ads.events.types.AdMediatorName.m103hashCodeimpl(this.mediatorName) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        java.lang.String str2 = this.placement;
        return this.impressionId.hashCode() + B2.a.a((iM86hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.adUnitId);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdOpenedData(networkName=");
        sb.append(this.networkName);
        sb.append(", mediatorName=");
        sb.append((java.lang.Object) com.revenuecat.purchases.ads.events.types.AdMediatorName.m104toStringimpl(this.mediatorName));
        sb.append(", adFormat=");
        sb.append((java.lang.Object) com.revenuecat.purchases.ads.events.types.AdFormat.m87toStringimpl(this.adFormat));
        sb.append(", placement=");
        sb.append(this.placement);
        sb.append(", adUnitId=");
        sb.append(this.adUnitId);
        sb.append(", impressionId=");
        return Y6.f.l(sb, this.impressionId, ')');
    }

    private AdOpenedData(java.lang.String str, java.lang.String mediatorName, java.lang.String adFormat, java.lang.String str2, java.lang.String adUnitId, java.lang.String impressionId) {
        kotlin.jvm.internal.m.e(mediatorName, "mediatorName");
        kotlin.jvm.internal.m.e(adFormat, "adFormat");
        kotlin.jvm.internal.m.e(adUnitId, "adUnitId");
        kotlin.jvm.internal.m.e(impressionId, "impressionId");
        this.networkName = str;
        this.mediatorName = mediatorName;
        this.adFormat = adFormat;
        this.placement = str2;
        this.adUnitId = adUnitId;
        this.impressionId = impressionId;
    }
}
