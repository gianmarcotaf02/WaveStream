package com.revenuecat.purchases.ads.events.types;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdFailedToLoadData;", "", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "adFormat", "", "placement", "adUnitId", "", "mediatorErrorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/internal/f;)V", "Ljava/lang/String;", "getMediatorName-GyoM_N4", "()Ljava/lang/String;", "getAdFormat-y0COY5Q", "getPlacement", "getAdUnitId", "Ljava/lang/Integer;", "getMediatorErrorCode", "()Ljava/lang/Integer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AdFailedToLoadData {
    private final java.lang.String adFormat;
    private final java.lang.String adUnitId;
    private final java.lang.Integer mediatorErrorCode;
    private final java.lang.String mediatorName;
    private final java.lang.String placement;

    public /* synthetic */ AdFailedToLoadData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, str3, str4, num);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.ads.events.types.AdFailedToLoadData)) {
            return false;
        }
        com.revenuecat.purchases.ads.events.types.AdFailedToLoadData adFailedToLoadData = (com.revenuecat.purchases.ads.events.types.AdFailedToLoadData) obj;
        return com.revenuecat.purchases.ads.events.types.AdMediatorName.m102equalsimpl0(this.mediatorName, adFailedToLoadData.mediatorName) && com.revenuecat.purchases.ads.events.types.AdFormat.m85equalsimpl0(this.adFormat, adFailedToLoadData.adFormat) && kotlin.jvm.internal.m.a(this.placement, adFailedToLoadData.placement) && kotlin.jvm.internal.m.a(this.adUnitId, adFailedToLoadData.adUnitId) && kotlin.jvm.internal.m.a(this.mediatorErrorCode, adFailedToLoadData.mediatorErrorCode);
    }

    /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: not valid java name and from getter */
    public final java.lang.String getAdFormat() {
        return this.adFormat;
    }

    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    public final java.lang.Integer getMediatorErrorCode() {
        return this.mediatorErrorCode;
    }

    /* JADX INFO: renamed from: getMediatorName-GyoM_N4, reason: not valid java name and from getter */
    public final java.lang.String getMediatorName() {
        return this.mediatorName;
    }

    public final java.lang.String getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        int iM86hashCodeimpl = (com.revenuecat.purchases.ads.events.types.AdFormat.m86hashCodeimpl(this.adFormat) + (com.revenuecat.purchases.ads.events.types.AdMediatorName.m103hashCodeimpl(this.mediatorName) * 31)) * 31;
        java.lang.String str = this.placement;
        int iA = B2.a.a((iM86hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31, 31, this.adUnitId);
        java.lang.Integer num = this.mediatorErrorCode;
        return iA + (num != null ? num.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AdFailedToLoadData(mediatorName=" + ((java.lang.Object) com.revenuecat.purchases.ads.events.types.AdMediatorName.m104toStringimpl(this.mediatorName)) + ", adFormat=" + ((java.lang.Object) com.revenuecat.purchases.ads.events.types.AdFormat.m87toStringimpl(this.adFormat)) + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", mediatorErrorCode=" + this.mediatorErrorCode + ')';
    }

    private AdFailedToLoadData(java.lang.String mediatorName, java.lang.String adFormat, java.lang.String str, java.lang.String adUnitId, java.lang.Integer num) {
        kotlin.jvm.internal.m.e(mediatorName, "mediatorName");
        kotlin.jvm.internal.m.e(adFormat, "adFormat");
        kotlin.jvm.internal.m.e(adUnitId, "adUnitId");
        this.mediatorName = mediatorName;
        this.adFormat = adFormat;
        this.placement = str;
        this.adUnitId = adUnitId;
        this.mediatorErrorCode = num;
    }
}
