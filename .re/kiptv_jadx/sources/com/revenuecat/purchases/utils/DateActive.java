package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/utils/DateActive;", "", "isActive", "", "inGracePeriod", "(ZZ)V", "getInGracePeriod", "()Z", "component1", "component2", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class DateActive {
    private final boolean inGracePeriod;
    private final boolean isActive;

    public DateActive(boolean z6, boolean z9) {
        this.isActive = z6;
        this.inGracePeriod = z9;
    }

    public static /* synthetic */ com.revenuecat.purchases.utils.DateActive copy$default(com.revenuecat.purchases.utils.DateActive dateActive, boolean z6, boolean z9, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = dateActive.isActive;
        }
        if ((i3 & 2) != 0) {
            z9 = dateActive.inGracePeriod;
        }
        return dateActive.copy(z6, z9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getInGracePeriod() {
        return this.inGracePeriod;
    }

    public final com.revenuecat.purchases.utils.DateActive copy(boolean isActive, boolean inGracePeriod) {
        return new com.revenuecat.purchases.utils.DateActive(isActive, inGracePeriod);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.utils.DateActive)) {
            return false;
        }
        com.revenuecat.purchases.utils.DateActive dateActive = (com.revenuecat.purchases.utils.DateActive) other;
        return this.isActive == dateActive.isActive && this.inGracePeriod == dateActive.inGracePeriod;
    }

    public final boolean getInGracePeriod() {
        return this.inGracePeriod;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.inGracePeriod) + (java.lang.Boolean.hashCode(this.isActive) * 31);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DateActive(isActive=");
        sb.append(this.isActive);
        sb.append(", inGracePeriod=");
        return v5.L.a(sb, this.inGracePeriod, ')');
    }
}
