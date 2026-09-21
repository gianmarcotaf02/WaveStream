package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBE\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0017¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/DangerousSettings;", "Landroid/os/Parcelable;", "", "autoSyncPurchases", "customEntitlementComputation", "uiPreviewMode", "applyObfuscatedAccountIdToSubscriptionChanges", "usesRemoteConfigAPISources", "useWorkflows", "<init>", "(ZZZZZZ)V", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getAutoSyncPurchases", "()Z", "getCustomEntitlementComputation$purchases_defaultsRelease", "getUiPreviewMode$purchases_defaultsRelease", "getApplyObfuscatedAccountIdToSubscriptionChanges$purchases_defaultsRelease", "getUsesRemoteConfigAPISources$purchases_defaultsRelease", "getUseWorkflows", "getUseWorkflows$annotations", "()V", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DangerousSettings implements android.os.Parcelable {
    private final boolean applyObfuscatedAccountIdToSubscriptionChanges;
    private final boolean autoSyncPurchases;
    private final boolean customEntitlementComputation;
    private final boolean uiPreviewMode;
    private final boolean useWorkflows;
    private final boolean usesRemoteConfigAPISources;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.DangerousSettings.Companion INSTANCE = new com.revenuecat.purchases.DangerousSettings.Companion(null);
    public static final android.os.Parcelable.Creator<com.revenuecat.purchases.DangerousSettings> CREATOR = new com.revenuecat.purchases.DangerousSettings.Creator();

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/DangerousSettings$Companion;", "", "()V", "forPreviewMode", "Lcom/revenuecat/purchases/DangerousSettings;", "forWorkflows", "autoSyncPurchases", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public static /* synthetic */ com.revenuecat.purchases.DangerousSettings forWorkflows$default(com.revenuecat.purchases.DangerousSettings.Companion companion, boolean z6, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                z6 = true;
            }
            return companion.forWorkflows(z6);
        }

        public final com.revenuecat.purchases.DangerousSettings forPreviewMode() {
            return new com.revenuecat.purchases.DangerousSettings(false, false, true, false, false, false, 48, null);
        }

        public final com.revenuecat.purchases.DangerousSettings forWorkflows(boolean autoSyncPurchases) {
            return new com.revenuecat.purchases.DangerousSettings(autoSyncPurchases, false, false, false, false, true, 16, null);
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.DangerousSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.DangerousSettings createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.m.e(parcel, "parcel");
            boolean z6 = false;
            boolean z9 = true;
            if (parcel.readInt() != 0) {
                z6 = true;
            }
            if (parcel.readInt() == 0) {
                z9 = z6;
            }
            if (parcel.readInt() == 0) {
                z9 = z6;
            }
            if (parcel.readInt() == 0) {
                z9 = z6;
            }
            if (parcel.readInt() == 0) {
                z9 = z6;
            }
            return new com.revenuecat.purchases.DangerousSettings(z6, z9, z9, z9, z9, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.DangerousSettings[] newArray(int i3) {
            return new com.revenuecat.purchases.DangerousSettings[i3];
        }
    }

    public DangerousSettings() {
        this(false, false, false, false, false, false, 63, null);
    }

    public static final com.revenuecat.purchases.DangerousSettings forPreviewMode() {
        return INSTANCE.forPreviewMode();
    }

    public static final com.revenuecat.purchases.DangerousSettings forWorkflows(boolean z6) {
        return INSTANCE.forWorkflows(z6);
    }

    public static /* synthetic */ void getUseWorkflows$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.DangerousSettings)) {
            return false;
        }
        com.revenuecat.purchases.DangerousSettings dangerousSettings = (com.revenuecat.purchases.DangerousSettings) obj;
        return this.autoSyncPurchases == dangerousSettings.autoSyncPurchases && this.customEntitlementComputation == dangerousSettings.customEntitlementComputation && this.uiPreviewMode == dangerousSettings.uiPreviewMode && this.applyObfuscatedAccountIdToSubscriptionChanges == dangerousSettings.applyObfuscatedAccountIdToSubscriptionChanges && this.usesRemoteConfigAPISources == dangerousSettings.usesRemoteConfigAPISources && this.useWorkflows == dangerousSettings.useWorkflows;
    }

    /* JADX INFO: renamed from: getApplyObfuscatedAccountIdToSubscriptionChanges$purchases_defaultsRelease, reason: from getter */
    public final boolean getApplyObfuscatedAccountIdToSubscriptionChanges() {
        return this.applyObfuscatedAccountIdToSubscriptionChanges;
    }

    public final boolean getAutoSyncPurchases() {
        return this.autoSyncPurchases;
    }

    /* JADX INFO: renamed from: getCustomEntitlementComputation$purchases_defaultsRelease, reason: from getter */
    public final boolean getCustomEntitlementComputation() {
        return this.customEntitlementComputation;
    }

    /* JADX INFO: renamed from: getUiPreviewMode$purchases_defaultsRelease, reason: from getter */
    public final boolean getUiPreviewMode() {
        return this.uiPreviewMode;
    }

    public final boolean getUseWorkflows() {
        return this.useWorkflows;
    }

    /* JADX INFO: renamed from: getUsesRemoteConfigAPISources$purchases_defaultsRelease, reason: from getter */
    public final boolean getUsesRemoteConfigAPISources() {
        return this.usesRemoteConfigAPISources;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.useWorkflows) + p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(java.lang.Boolean.hashCode(this.autoSyncPurchases) * 31, 31, this.customEntitlementComputation), 31, this.uiPreviewMode), 31, this.applyObfuscatedAccountIdToSubscriptionChanges), 31, this.usesRemoteConfigAPISources);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DangerousSettings(autoSyncPurchases=");
        sb.append(this.autoSyncPurchases);
        sb.append(", customEntitlementComputation=");
        sb.append(this.customEntitlementComputation);
        sb.append(", uiPreviewMode=");
        sb.append(this.uiPreviewMode);
        sb.append(", applyObfuscatedAccountIdToSubscriptionChanges=");
        sb.append(this.applyObfuscatedAccountIdToSubscriptionChanges);
        sb.append(", usesRemoteConfigAPISources=");
        sb.append(this.usesRemoteConfigAPISources);
        sb.append(", useWorkflows=");
        return v5.L.a(sb, this.useWorkflows, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.m.e(parcel, "out");
        parcel.writeInt(this.autoSyncPurchases ? 1 : 0);
        parcel.writeInt(this.customEntitlementComputation ? 1 : 0);
        parcel.writeInt(this.uiPreviewMode ? 1 : 0);
        parcel.writeInt(this.applyObfuscatedAccountIdToSubscriptionChanges ? 1 : 0);
        parcel.writeInt(this.usesRemoteConfigAPISources ? 1 : 0);
        parcel.writeInt(this.useWorkflows ? 1 : 0);
    }

    public DangerousSettings(boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.autoSyncPurchases = z6;
        this.customEntitlementComputation = z9;
        this.uiPreviewMode = z10;
        this.applyObfuscatedAccountIdToSubscriptionChanges = z11;
        this.usesRemoteConfigAPISources = z12;
        this.useWorkflows = z13;
    }

    public /* synthetic */ DangerousSettings(boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? true : z6, (i3 & 2) != 0 ? false : z9, (i3 & 4) != 0 ? false : z10, (i3 & 8) != 0 ? false : z11, (i3 & 16) != 0 ? false : z12, (i3 & 32) != 0 ? false : z13);
    }

    public DangerousSettings(boolean z6) {
        this(z6, false, false, false, false, false);
    }

    public /* synthetic */ DangerousSettings(boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? true : z6);
    }
}
