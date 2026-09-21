package com.revenuecat.purchases.common.security;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/common/security/SecureItemAttributes;", "", "includedInBackup", "", "(Z)V", "getIncludedInBackup", "()Z", "component1", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class SecureItemAttributes {
    private final boolean includedInBackup;

    public SecureItemAttributes() {
        this(false, 1, null);
    }

    public static /* synthetic */ com.revenuecat.purchases.common.security.SecureItemAttributes copy$default(com.revenuecat.purchases.common.security.SecureItemAttributes secureItemAttributes, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = secureItemAttributes.includedInBackup;
        }
        return secureItemAttributes.copy(z6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIncludedInBackup() {
        return this.includedInBackup;
    }

    public final com.revenuecat.purchases.common.security.SecureItemAttributes copy(boolean includedInBackup) {
        return new com.revenuecat.purchases.common.security.SecureItemAttributes(includedInBackup);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.revenuecat.purchases.common.security.SecureItemAttributes) && this.includedInBackup == ((com.revenuecat.purchases.common.security.SecureItemAttributes) other).includedInBackup;
    }

    public final boolean getIncludedInBackup() {
        return this.includedInBackup;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.includedInBackup);
    }

    public java.lang.String toString() {
        return v5.L.a(new java.lang.StringBuilder("SecureItemAttributes(includedInBackup="), this.includedInBackup, ')');
    }

    public SecureItemAttributes(boolean z6) {
        this.includedInBackup = z6;
    }

    public /* synthetic */ SecureItemAttributes(boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? true : z6);
    }
}
