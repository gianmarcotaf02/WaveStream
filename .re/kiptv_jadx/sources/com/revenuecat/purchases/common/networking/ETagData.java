package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/common/networking/ETagData;", "", "eTag", "", "lastRefreshTime", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)V", "getETag", "()Ljava/lang/String;", "getLastRefreshTime", "()Ljava/util/Date;", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class ETagData {
    private final java.lang.String eTag;
    private final java.util.Date lastRefreshTime;

    public ETagData(java.lang.String eTag, java.util.Date date) {
        kotlin.jvm.internal.m.e(eTag, "eTag");
        this.eTag = eTag;
        this.lastRefreshTime = date;
    }

    public static /* synthetic */ com.revenuecat.purchases.common.networking.ETagData copy$default(com.revenuecat.purchases.common.networking.ETagData eTagData, java.lang.String str, java.util.Date date, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = eTagData.eTag;
        }
        if ((i3 & 2) != 0) {
            date = eTagData.lastRefreshTime;
        }
        return eTagData.copy(str, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getETag() {
        return this.eTag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.util.Date getLastRefreshTime() {
        return this.lastRefreshTime;
    }

    public final com.revenuecat.purchases.common.networking.ETagData copy(java.lang.String eTag, java.util.Date lastRefreshTime) {
        kotlin.jvm.internal.m.e(eTag, "eTag");
        return new com.revenuecat.purchases.common.networking.ETagData(eTag, lastRefreshTime);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.networking.ETagData)) {
            return false;
        }
        com.revenuecat.purchases.common.networking.ETagData eTagData = (com.revenuecat.purchases.common.networking.ETagData) other;
        return kotlin.jvm.internal.m.a(this.eTag, eTagData.eTag) && kotlin.jvm.internal.m.a(this.lastRefreshTime, eTagData.lastRefreshTime);
    }

    public final java.lang.String getETag() {
        return this.eTag;
    }

    public final java.util.Date getLastRefreshTime() {
        return this.lastRefreshTime;
    }

    public int hashCode() {
        int iHashCode = this.eTag.hashCode() * 31;
        java.util.Date date = this.lastRefreshTime;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public java.lang.String toString() {
        return "ETagData(eTag=" + this.eTag + ", lastRefreshTime=" + this.lastRefreshTime + ')';
    }
}
