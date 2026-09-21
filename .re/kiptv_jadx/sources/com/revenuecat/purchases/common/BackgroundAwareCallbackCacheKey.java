package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/common/BackgroundAwareCallbackCacheKey;", "", "cacheKey", "", "", "appInBackground", "", "(Ljava/util/List;Z)V", "getAppInBackground", "()Z", "getCacheKey", "()Ljava/util/List;", "component1", "component2", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class BackgroundAwareCallbackCacheKey {
    private final boolean appInBackground;
    private final java.util.List<java.lang.String> cacheKey;

    public BackgroundAwareCallbackCacheKey(java.util.List<java.lang.String> cacheKey, boolean z6) {
        kotlin.jvm.internal.m.e(cacheKey, "cacheKey");
        this.cacheKey = cacheKey;
        this.appInBackground = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.common.BackgroundAwareCallbackCacheKey copy$default(com.revenuecat.purchases.common.BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, java.util.List list, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            list = backgroundAwareCallbackCacheKey.cacheKey;
        }
        if ((i3 & 2) != 0) {
            z6 = backgroundAwareCallbackCacheKey.appInBackground;
        }
        return backgroundAwareCallbackCacheKey.copy(list, z6);
    }

    public final java.util.List<java.lang.String> component1() {
        return this.cacheKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final com.revenuecat.purchases.common.BackgroundAwareCallbackCacheKey copy(java.util.List<java.lang.String> cacheKey, boolean appInBackground) {
        kotlin.jvm.internal.m.e(cacheKey, "cacheKey");
        return new com.revenuecat.purchases.common.BackgroundAwareCallbackCacheKey(cacheKey, appInBackground);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.BackgroundAwareCallbackCacheKey)) {
            return false;
        }
        com.revenuecat.purchases.common.BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = (com.revenuecat.purchases.common.BackgroundAwareCallbackCacheKey) other;
        return kotlin.jvm.internal.m.a(this.cacheKey, backgroundAwareCallbackCacheKey.cacheKey) && this.appInBackground == backgroundAwareCallbackCacheKey.appInBackground;
    }

    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final java.util.List<java.lang.String> getCacheKey() {
        return this.cacheKey;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.appInBackground) + (this.cacheKey.hashCode() * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BackgroundAwareCallbackCacheKey(cacheKey=");
        sb.append(this.cacheKey);
        sb.append(", appInBackground=");
        return v5.L.a(sb, this.appInBackground, ')');
    }
}
