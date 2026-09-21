package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/common/PlatformInfo;", "", "flavor", "", "version", "(Ljava/lang/String;Ljava/lang/String;)V", "getFlavor", "()Ljava/lang/String;", "getVersion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PlatformInfo {
    private final java.lang.String flavor;
    private final java.lang.String version;

    public PlatformInfo(java.lang.String flavor, java.lang.String str) {
        kotlin.jvm.internal.m.e(flavor, "flavor");
        this.flavor = flavor;
        this.version = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.common.PlatformInfo)) {
            return false;
        }
        com.revenuecat.purchases.common.PlatformInfo platformInfo = (com.revenuecat.purchases.common.PlatformInfo) obj;
        return kotlin.jvm.internal.m.a(this.flavor, platformInfo.flavor) && kotlin.jvm.internal.m.a(this.version, platformInfo.version);
    }

    public final java.lang.String getFlavor() {
        return this.flavor;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = this.flavor.hashCode() * 31;
        java.lang.String str = this.version;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlatformInfo(flavor=");
        sb.append(this.flavor);
        sb.append(", version=");
        return Y6.f.l(sb, this.version, ')');
    }
}
