package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ1\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/PresentedOfferingContext;", "Landroid/os/Parcelable;", "", "offeringIdentifier", "placementIdentifier", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "targetingContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;)V", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;)Lcom/revenuecat/purchases/PresentedOfferingContext;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOfferingIdentifier", "()Ljava/lang/String;", "getPlacementIdentifier", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "getTargetingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "TargetingContext", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PresentedOfferingContext implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.revenuecat.purchases.PresentedOfferingContext> CREATOR = new com.revenuecat.purchases.PresentedOfferingContext.Creator();
    private final java.lang.String offeringIdentifier;
    private final java.lang.String placementIdentifier;
    private final com.revenuecat.purchases.PresentedOfferingContext.TargetingContext targetingContext;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.PresentedOfferingContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.PresentedOfferingContext createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.m.e(parcel, "parcel");
            return new com.revenuecat.purchases.PresentedOfferingContext(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : com.revenuecat.purchases.PresentedOfferingContext.TargetingContext.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.PresentedOfferingContext[] newArray(int i3) {
            return new com.revenuecat.purchases.PresentedOfferingContext[i3];
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "Landroid/os/Parcelable;", "", "revision", "", "ruleId", "<init>", "(ILjava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getRevision", "Ljava/lang/String;", "getRuleId", "()Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class TargetingContext implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.revenuecat.purchases.PresentedOfferingContext.TargetingContext> CREATOR = new com.revenuecat.purchases.PresentedOfferingContext.TargetingContext.Creator();
        private final int revision;
        private final java.lang.String ruleId;

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.PresentedOfferingContext.TargetingContext> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.revenuecat.purchases.PresentedOfferingContext.TargetingContext createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.m.e(parcel, "parcel");
                return new com.revenuecat.purchases.PresentedOfferingContext.TargetingContext(parcel.readInt(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.revenuecat.purchases.PresentedOfferingContext.TargetingContext[] newArray(int i3) {
                return new com.revenuecat.purchases.PresentedOfferingContext.TargetingContext[i3];
            }
        }

        public TargetingContext(int i3, java.lang.String ruleId) {
            kotlin.jvm.internal.m.e(ruleId, "ruleId");
            this.revision = i3;
            this.ruleId = ruleId;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.PresentedOfferingContext.TargetingContext)) {
                return false;
            }
            com.revenuecat.purchases.PresentedOfferingContext.TargetingContext targetingContext = (com.revenuecat.purchases.PresentedOfferingContext.TargetingContext) obj;
            return this.revision == targetingContext.revision && kotlin.jvm.internal.m.a(this.ruleId, targetingContext.ruleId);
        }

        public final int getRevision() {
            return this.revision;
        }

        public final java.lang.String getRuleId() {
            return this.ruleId;
        }

        public int hashCode() {
            return this.ruleId.hashCode() + (this.revision * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TargetingContext(revision=");
            sb.append(this.revision);
            sb.append(", ruleId=");
            return Y6.f.l(sb, this.ruleId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.m.e(parcel, "out");
            parcel.writeInt(this.revision);
            parcel.writeString(this.ruleId);
        }
    }

    public PresentedOfferingContext(java.lang.String offeringIdentifier, java.lang.String str, com.revenuecat.purchases.PresentedOfferingContext.TargetingContext targetingContext) {
        kotlin.jvm.internal.m.e(offeringIdentifier, "offeringIdentifier");
        this.offeringIdentifier = offeringIdentifier;
        this.placementIdentifier = str;
        this.targetingContext = targetingContext;
    }

    public static /* synthetic */ com.revenuecat.purchases.PresentedOfferingContext copy$default(com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, java.lang.String str, java.lang.String str2, com.revenuecat.purchases.PresentedOfferingContext.TargetingContext targetingContext, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = presentedOfferingContext.offeringIdentifier;
        }
        if ((i3 & 2) != 0) {
            str2 = presentedOfferingContext.placementIdentifier;
        }
        if ((i3 & 4) != 0) {
            targetingContext = presentedOfferingContext.targetingContext;
        }
        return presentedOfferingContext.copy(str, str2, targetingContext);
    }

    public final /* synthetic */ com.revenuecat.purchases.PresentedOfferingContext copy(java.lang.String offeringIdentifier, java.lang.String placementIdentifier, com.revenuecat.purchases.PresentedOfferingContext.TargetingContext targetingContext) {
        kotlin.jvm.internal.m.e(offeringIdentifier, "offeringIdentifier");
        return new com.revenuecat.purchases.PresentedOfferingContext(offeringIdentifier, placementIdentifier, targetingContext);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.PresentedOfferingContext)) {
            return false;
        }
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = (com.revenuecat.purchases.PresentedOfferingContext) obj;
        return kotlin.jvm.internal.m.a(this.offeringIdentifier, presentedOfferingContext.offeringIdentifier) && kotlin.jvm.internal.m.a(this.placementIdentifier, presentedOfferingContext.placementIdentifier) && kotlin.jvm.internal.m.a(this.targetingContext, presentedOfferingContext.targetingContext);
    }

    public final java.lang.String getOfferingIdentifier() {
        return this.offeringIdentifier;
    }

    public final java.lang.String getPlacementIdentifier() {
        return this.placementIdentifier;
    }

    public final com.revenuecat.purchases.PresentedOfferingContext.TargetingContext getTargetingContext() {
        return this.targetingContext;
    }

    public int hashCode() {
        int iHashCode = this.offeringIdentifier.hashCode() * 31;
        java.lang.String str = this.placementIdentifier;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.revenuecat.purchases.PresentedOfferingContext.TargetingContext targetingContext = this.targetingContext;
        return iHashCode2 + (targetingContext != null ? targetingContext.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PresentedOfferingContext(offeringIdentifier=" + this.offeringIdentifier + ", placementIdentifier=" + this.placementIdentifier + ", targetingContext=" + this.targetingContext + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.m.e(parcel, "out");
        parcel.writeString(this.offeringIdentifier);
        parcel.writeString(this.placementIdentifier);
        com.revenuecat.purchases.PresentedOfferingContext.TargetingContext targetingContext = this.targetingContext;
        if (targetingContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            targetingContext.writeToParcel(parcel, flags);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentedOfferingContext(java.lang.String offeringIdentifier) {
        this(offeringIdentifier, null, null);
        kotlin.jvm.internal.m.e(offeringIdentifier, "offeringIdentifier");
    }
}
