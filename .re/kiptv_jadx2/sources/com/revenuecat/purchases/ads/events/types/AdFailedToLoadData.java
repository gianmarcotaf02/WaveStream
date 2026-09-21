package com.revenuecat.purchases.ads.events.types;

import B2.a;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdFailedToLoadData;", "", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "adFormat", "", "placement", "adUnitId", "", "mediatorErrorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/internal/f;)V", "Ljava/lang/String;", "getMediatorName-GyoM_N4", "()Ljava/lang/String;", "getAdFormat-y0COY5Q", "getPlacement", "getAdUnitId", "Ljava/lang/Integer;", "getMediatorErrorCode", "()Ljava/lang/Integer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AdFailedToLoadData {
    private final String adFormat;
    private final String adUnitId;
    private final Integer mediatorErrorCode;
    private final String mediatorName;
    private final String placement;

    public AdFailedToLoadData(String str, String str2, String str3, String str4, Integer num, AbstractC2541f abstractC2541f) {
        this(str, str2, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdFailedToLoadData)) {
            return false;
        }
        AdFailedToLoadData adFailedToLoadData = (AdFailedToLoadData) obj;
        return AdMediatorName.m102equalsimpl0(this.mediatorName, adFailedToLoadData.mediatorName) && AdFormat.m85equalsimpl0(this.adFormat, adFailedToLoadData.adFormat) && m.a(this.placement, adFailedToLoadData.placement) && m.a(this.adUnitId, adFailedToLoadData.adUnitId) && m.a(this.mediatorErrorCode, adFailedToLoadData.mediatorErrorCode);
    }

    public final String getAdFormat() {
        return this.adFormat;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final Integer getMediatorErrorCode() {
        return this.mediatorErrorCode;
    }

    public final String getMediatorName() {
        return this.mediatorName;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        int iM86hashCodeimpl = (AdFormat.m86hashCodeimpl(this.adFormat) + (AdMediatorName.m103hashCodeimpl(this.mediatorName) * 31)) * 31;
        String str = this.placement;
        int iA = a.a((iM86hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31, 31, this.adUnitId);
        Integer num = this.mediatorErrorCode;
        return iA + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AdFailedToLoadData(mediatorName=" + ((Object) AdMediatorName.m104toStringimpl(this.mediatorName)) + ", adFormat=" + ((Object) AdFormat.m87toStringimpl(this.adFormat)) + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", mediatorErrorCode=" + this.mediatorErrorCode + ')';
    }

    private AdFailedToLoadData(String mediatorName, String adFormat, String str, String adUnitId, Integer num) {
        m.e(mediatorName, "mediatorName");
        m.e(adFormat, "adFormat");
        m.e(adUnitId, "adUnitId");
        this.mediatorName = mediatorName;
        this.adFormat = adFormat;
        this.placement = str;
        this.adUnitId = adUnitId;
        this.mediatorErrorCode = num;
    }
}
