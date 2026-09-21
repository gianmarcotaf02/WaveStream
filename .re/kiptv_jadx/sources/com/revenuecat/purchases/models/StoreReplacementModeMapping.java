package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/models/StoreReplacementModeMapping;", "", "playBillingClientMode", "", "legacyPlayBackendName", "", "galaxyBackendName", "googleReplacementMode", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "(ILjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;)V", "getGalaxyBackendName", "()Ljava/lang/String;", "getGoogleReplacementMode", "()Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getLegacyPlayBackendName", "getPlayBillingClientMode", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final /* data */ class StoreReplacementModeMapping {
    private final java.lang.String galaxyBackendName;
    private final com.revenuecat.purchases.models.GoogleReplacementMode googleReplacementMode;
    private final java.lang.String legacyPlayBackendName;
    private final int playBillingClientMode;

    public StoreReplacementModeMapping(int i3, java.lang.String legacyPlayBackendName, java.lang.String str, com.revenuecat.purchases.models.GoogleReplacementMode googleReplacementMode) {
        kotlin.jvm.internal.m.e(legacyPlayBackendName, "legacyPlayBackendName");
        kotlin.jvm.internal.m.e(googleReplacementMode, "googleReplacementMode");
        this.playBillingClientMode = i3;
        this.legacyPlayBackendName = legacyPlayBackendName;
        this.galaxyBackendName = str;
        this.googleReplacementMode = googleReplacementMode;
    }

    public static /* synthetic */ com.revenuecat.purchases.models.StoreReplacementModeMapping copy$default(com.revenuecat.purchases.models.StoreReplacementModeMapping storeReplacementModeMapping, int i3, java.lang.String str, java.lang.String str2, com.revenuecat.purchases.models.GoogleReplacementMode googleReplacementMode, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            i3 = storeReplacementModeMapping.playBillingClientMode;
        }
        if ((i9 & 2) != 0) {
            str = storeReplacementModeMapping.legacyPlayBackendName;
        }
        if ((i9 & 4) != 0) {
            str2 = storeReplacementModeMapping.galaxyBackendName;
        }
        if ((i9 & 8) != 0) {
            googleReplacementMode = storeReplacementModeMapping.googleReplacementMode;
        }
        return storeReplacementModeMapping.copy(i3, str, str2, googleReplacementMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPlayBillingClientMode() {
        return this.playBillingClientMode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getLegacyPlayBackendName() {
        return this.legacyPlayBackendName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getGalaxyBackendName() {
        return this.galaxyBackendName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final com.revenuecat.purchases.models.GoogleReplacementMode getGoogleReplacementMode() {
        return this.googleReplacementMode;
    }

    public final com.revenuecat.purchases.models.StoreReplacementModeMapping copy(int playBillingClientMode, java.lang.String legacyPlayBackendName, java.lang.String galaxyBackendName, com.revenuecat.purchases.models.GoogleReplacementMode googleReplacementMode) {
        kotlin.jvm.internal.m.e(legacyPlayBackendName, "legacyPlayBackendName");
        kotlin.jvm.internal.m.e(googleReplacementMode, "googleReplacementMode");
        return new com.revenuecat.purchases.models.StoreReplacementModeMapping(playBillingClientMode, legacyPlayBackendName, galaxyBackendName, googleReplacementMode);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.models.StoreReplacementModeMapping)) {
            return false;
        }
        com.revenuecat.purchases.models.StoreReplacementModeMapping storeReplacementModeMapping = (com.revenuecat.purchases.models.StoreReplacementModeMapping) other;
        return this.playBillingClientMode == storeReplacementModeMapping.playBillingClientMode && kotlin.jvm.internal.m.a(this.legacyPlayBackendName, storeReplacementModeMapping.legacyPlayBackendName) && kotlin.jvm.internal.m.a(this.galaxyBackendName, storeReplacementModeMapping.galaxyBackendName) && this.googleReplacementMode == storeReplacementModeMapping.googleReplacementMode;
    }

    public final java.lang.String getGalaxyBackendName() {
        return this.galaxyBackendName;
    }

    public final com.revenuecat.purchases.models.GoogleReplacementMode getGoogleReplacementMode() {
        return this.googleReplacementMode;
    }

    public final java.lang.String getLegacyPlayBackendName() {
        return this.legacyPlayBackendName;
    }

    public final int getPlayBillingClientMode() {
        return this.playBillingClientMode;
    }

    public int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.playBillingClientMode) * 31, 31, this.legacyPlayBackendName);
        java.lang.String str = this.galaxyBackendName;
        return this.googleReplacementMode.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public java.lang.String toString() {
        return "StoreReplacementModeMapping(playBillingClientMode=" + this.playBillingClientMode + ", legacyPlayBackendName=" + this.legacyPlayBackendName + ", galaxyBackendName=" + this.galaxyBackendName + ", googleReplacementMode=" + this.googleReplacementMode + ')';
    }
}
