package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0091\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u0089\u0001\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020$HÖ\u0001¢\u0006\u0004\b'\u0010&J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020$HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b\u0007\u00101R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u00101R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u00108R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b9\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b:\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b>\u0010\u001fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b?\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b\u0013\u00101R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b@\u00108R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\bA\u00108R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010ER\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010M\u001a\u00020\u00038VX\u0096\u0004¢\u0006\f\u0012\u0004\bK\u0010L\u001a\u0004\bI\u0010J¨\u0006N"}, d2 = {"Lcom/revenuecat/purchases/EntitlementInfo;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/models/RawDataContainer;", "Lorg/json/JSONObject;", "", io.sentry.protocol.ViewHierarchyNode.JsonKeys.IDENTIFIER, "", "isActive", "willRenew", "Lcom/revenuecat/purchases/PeriodType;", "periodType", "Ljava/util/Date;", "latestPurchaseDate", "originalPurchaseDate", "expirationDate", "Lcom/revenuecat/purchases/Store;", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "productIdentifier", "productPlanIdentifier", "isSandbox", "unsubscribeDetectedAt", "billingIssueDetectedAt", "Lcom/revenuecat/purchases/OwnershipType;", "ownershipType", "jsonObject", "Lcom/revenuecat/purchases/VerificationResult;", "verification", "<init>", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lorg/json/JSONObject;Lcom/revenuecat/purchases/VerificationResult;)V", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lorg/json/JSONObject;)V", "toString", "()Ljava/lang/String;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIdentifier", "Z", "()Z", "getWillRenew", "Lcom/revenuecat/purchases/PeriodType;", "getPeriodType", "()Lcom/revenuecat/purchases/PeriodType;", "Ljava/util/Date;", "getLatestPurchaseDate", "()Ljava/util/Date;", "getOriginalPurchaseDate", "getExpirationDate", "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", "getProductIdentifier", "getProductPlanIdentifier", "getUnsubscribeDetectedAt", "getBillingIssueDetectedAt", "Lcom/revenuecat/purchases/OwnershipType;", "getOwnershipType", "()Lcom/revenuecat/purchases/OwnershipType;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/VerificationResult;", "getVerification", "()Lcom/revenuecat/purchases/VerificationResult;", "getRawData", "()Lorg/json/JSONObject;", "getRawData$annotations", "()V", "rawData", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class EntitlementInfo implements android.os.Parcelable, com.revenuecat.purchases.models.RawDataContainer<org.json.JSONObject> {
    public static final android.os.Parcelable.Creator<com.revenuecat.purchases.EntitlementInfo> CREATOR = new com.revenuecat.purchases.EntitlementInfo.Creator();
    private final java.util.Date billingIssueDetectedAt;
    private final java.util.Date expirationDate;
    private final java.lang.String identifier;
    private final boolean isActive;
    private final boolean isSandbox;
    private final org.json.JSONObject jsonObject;
    private final java.util.Date latestPurchaseDate;
    private final java.util.Date originalPurchaseDate;
    private final com.revenuecat.purchases.OwnershipType ownershipType;
    private final com.revenuecat.purchases.PeriodType periodType;
    private final java.lang.String productIdentifier;
    private final java.lang.String productPlanIdentifier;
    private final com.revenuecat.purchases.Store store;
    private final java.util.Date unsubscribeDetectedAt;
    private final com.revenuecat.purchases.VerificationResult verification;
    private final boolean willRenew;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.EntitlementInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.EntitlementInfo createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.m.e(parcel, "parcel");
            java.lang.String string = parcel.readString();
            boolean z6 = false;
            boolean z9 = true;
            if (parcel.readInt() != 0) {
                z6 = true;
            }
            if (parcel.readInt() == 0) {
                z9 = z6;
            }
            com.revenuecat.purchases.PeriodType periodTypeValueOf = com.revenuecat.purchases.PeriodType.valueOf(parcel.readString());
            java.util.Date date = (java.util.Date) parcel.readSerializable();
            java.util.Date date2 = (java.util.Date) parcel.readSerializable();
            java.util.Date date3 = (java.util.Date) parcel.readSerializable();
            com.revenuecat.purchases.Store storeValueOf = com.revenuecat.purchases.Store.valueOf(parcel.readString());
            java.lang.String string2 = parcel.readString();
            boolean z10 = true;
            java.lang.String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                z10 = false;
            }
            return new com.revenuecat.purchases.EntitlementInfo(string, z6, z9, periodTypeValueOf, date, date2, date3, storeValueOf, string2, string3, z10, (java.util.Date) parcel.readSerializable(), (java.util.Date) parcel.readSerializable(), com.revenuecat.purchases.OwnershipType.valueOf(parcel.readString()), com.revenuecat.purchases.utils.JSONObjectParceler.INSTANCE.create(parcel), com.revenuecat.purchases.VerificationResult.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.EntitlementInfo[] newArray(int i3) {
            return new com.revenuecat.purchases.EntitlementInfo[i3];
        }
    }

    public EntitlementInfo(java.lang.String identifier, boolean z6, boolean z9, com.revenuecat.purchases.PeriodType periodType, java.util.Date latestPurchaseDate, java.util.Date originalPurchaseDate, java.util.Date date, com.revenuecat.purchases.Store store, java.lang.String productIdentifier, java.lang.String str, boolean z10, java.util.Date date2, java.util.Date date3, com.revenuecat.purchases.OwnershipType ownershipType, org.json.JSONObject jsonObject, com.revenuecat.purchases.VerificationResult verification) {
        kotlin.jvm.internal.m.e(identifier, "identifier");
        kotlin.jvm.internal.m.e(periodType, "periodType");
        kotlin.jvm.internal.m.e(latestPurchaseDate, "latestPurchaseDate");
        kotlin.jvm.internal.m.e(originalPurchaseDate, "originalPurchaseDate");
        kotlin.jvm.internal.m.e(store, "store");
        kotlin.jvm.internal.m.e(productIdentifier, "productIdentifier");
        kotlin.jvm.internal.m.e(ownershipType, "ownershipType");
        kotlin.jvm.internal.m.e(jsonObject, "jsonObject");
        kotlin.jvm.internal.m.e(verification, "verification");
        this.identifier = identifier;
        this.isActive = z6;
        this.willRenew = z9;
        this.periodType = periodType;
        this.latestPurchaseDate = latestPurchaseDate;
        this.originalPurchaseDate = originalPurchaseDate;
        this.expirationDate = date;
        this.store = store;
        this.productIdentifier = productIdentifier;
        this.productPlanIdentifier = str;
        this.isSandbox = z10;
        this.unsubscribeDetectedAt = date2;
        this.billingIssueDetectedAt = date3;
        this.ownershipType = ownershipType;
        this.jsonObject = jsonObject;
        this.verification = verification;
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!com.revenuecat.purchases.EntitlementInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(other, "null cannot be cast to non-null type com.revenuecat.purchases.EntitlementInfo");
        com.revenuecat.purchases.EntitlementInfo entitlementInfo = (com.revenuecat.purchases.EntitlementInfo) other;
        return kotlin.jvm.internal.m.a(this.identifier, entitlementInfo.identifier) && this.isActive == entitlementInfo.isActive && this.willRenew == entitlementInfo.willRenew && this.periodType == entitlementInfo.periodType && kotlin.jvm.internal.m.a(this.latestPurchaseDate, entitlementInfo.latestPurchaseDate) && kotlin.jvm.internal.m.a(this.originalPurchaseDate, entitlementInfo.originalPurchaseDate) && kotlin.jvm.internal.m.a(this.expirationDate, entitlementInfo.expirationDate) && this.store == entitlementInfo.store && kotlin.jvm.internal.m.a(this.productIdentifier, entitlementInfo.productIdentifier) && kotlin.jvm.internal.m.a(this.productPlanIdentifier, entitlementInfo.productPlanIdentifier) && this.isSandbox == entitlementInfo.isSandbox && kotlin.jvm.internal.m.a(this.unsubscribeDetectedAt, entitlementInfo.unsubscribeDetectedAt) && kotlin.jvm.internal.m.a(this.billingIssueDetectedAt, entitlementInfo.billingIssueDetectedAt) && this.ownershipType == entitlementInfo.ownershipType && this.verification == entitlementInfo.verification;
    }

    public final java.util.Date getBillingIssueDetectedAt() {
        return this.billingIssueDetectedAt;
    }

    public final java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    public final java.lang.String getIdentifier() {
        return this.identifier;
    }

    public final java.util.Date getLatestPurchaseDate() {
        return this.latestPurchaseDate;
    }

    public final java.util.Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final com.revenuecat.purchases.OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public final com.revenuecat.purchases.PeriodType getPeriodType() {
        return this.periodType;
    }

    public final java.lang.String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final java.lang.String getProductPlanIdentifier() {
        return this.productPlanIdentifier;
    }

    public final com.revenuecat.purchases.Store getStore() {
        return this.store;
    }

    public final java.util.Date getUnsubscribeDetectedAt() {
        return this.unsubscribeDetectedAt;
    }

    public final com.revenuecat.purchases.VerificationResult getVerification() {
        return this.verification;
    }

    public final boolean getWillRenew() {
        return this.willRenew;
    }

    public int hashCode() {
        int iHashCode = (this.originalPurchaseDate.hashCode() + ((this.latestPurchaseDate.hashCode() + ((this.periodType.hashCode() + p121o0.p.f(p121o0.p.f(this.identifier.hashCode() * 31, 31, this.isActive), 31, this.willRenew)) * 31)) * 31)) * 31;
        java.util.Date date = this.expirationDate;
        int iA = B2.a.a((this.store.hashCode() + ((iHashCode + (date != null ? date.hashCode() : 0)) * 31)) * 31, 31, this.productIdentifier);
        java.lang.String str = this.productPlanIdentifier;
        int iF = p121o0.p.f((iA + (str != null ? str.hashCode() : 0)) * 31, 31, this.isSandbox);
        java.util.Date date2 = this.unsubscribeDetectedAt;
        int iHashCode2 = (iF + (date2 != null ? date2.hashCode() : 0)) * 31;
        java.util.Date date3 = this.billingIssueDetectedAt;
        return this.ownershipType.hashCode() + ((iHashCode2 + (date3 != null ? date3.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: isSandbox, reason: from getter */
    public final boolean getIsSandbox() {
        return this.isSandbox;
    }

    public java.lang.String toString() {
        return "EntitlementInfo(identifier='" + this.identifier + "', isActive=" + this.isActive + ", willRenew=" + this.willRenew + ", periodType=" + this.periodType + ", latestPurchaseDate=" + this.latestPurchaseDate + ", originalPurchaseDate=" + this.originalPurchaseDate + ", expirationDate=" + this.expirationDate + ", store=" + this.store + ", productIdentifier='" + this.productIdentifier + "', productPlanIdentifier='" + this.productPlanIdentifier + "', isSandbox=" + this.isSandbox + ", unsubscribeDetectedAt=" + this.unsubscribeDetectedAt + ", billingIssueDetectedAt=" + this.billingIssueDetectedAt + ", ownershipType=" + this.ownershipType + ", verification=" + this.verification + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.m.e(parcel, "out");
        parcel.writeString(this.identifier);
        parcel.writeInt(this.isActive ? 1 : 0);
        parcel.writeInt(this.willRenew ? 1 : 0);
        parcel.writeString(this.periodType.name());
        parcel.writeSerializable(this.latestPurchaseDate);
        parcel.writeSerializable(this.originalPurchaseDate);
        parcel.writeSerializable(this.expirationDate);
        parcel.writeString(this.store.name());
        parcel.writeString(this.productIdentifier);
        parcel.writeString(this.productPlanIdentifier);
        parcel.writeInt(this.isSandbox ? 1 : 0);
        parcel.writeSerializable(this.unsubscribeDetectedAt);
        parcel.writeSerializable(this.billingIssueDetectedAt);
        parcel.writeString(this.ownershipType.name());
        com.revenuecat.purchases.utils.JSONObjectParceler.INSTANCE.write(this.jsonObject, parcel, flags);
        parcel.writeString(this.verification.name());
    }

    @Override // com.revenuecat.purchases.models.RawDataContainer
    /* JADX INFO: renamed from: getRawData, reason: avoid collision after fix types in other method and from getter */
    public org.json.JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public /* synthetic */ EntitlementInfo(java.lang.String str, boolean z6, boolean z9, com.revenuecat.purchases.PeriodType periodType, java.util.Date date, java.util.Date date2, java.util.Date date3, com.revenuecat.purchases.Store store, java.lang.String str2, java.lang.String str3, boolean z10, java.util.Date date4, java.util.Date date5, com.revenuecat.purchases.OwnershipType ownershipType, org.json.JSONObject jSONObject, com.revenuecat.purchases.VerificationResult verificationResult, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, z6, z9, periodType, date, date2, date3, store, str2, str3, z10, date4, date5, ownershipType, jSONObject, (i3 & 32768) != 0 ? com.revenuecat.purchases.VerificationResult.NOT_REQUESTED : verificationResult);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public EntitlementInfo(java.lang.String identifier, boolean z6, boolean z9, com.revenuecat.purchases.PeriodType periodType, java.util.Date latestPurchaseDate, java.util.Date originalPurchaseDate, java.util.Date date, com.revenuecat.purchases.Store store, java.lang.String productIdentifier, java.lang.String str, boolean z10, java.util.Date date2, java.util.Date date3, com.revenuecat.purchases.OwnershipType ownershipType, org.json.JSONObject jsonObject) {
        this(identifier, z6, z9, periodType, latestPurchaseDate, originalPurchaseDate, date, store, productIdentifier, str, z10, date2, date3, ownershipType, jsonObject, com.revenuecat.purchases.VerificationResult.NOT_REQUESTED);
        kotlin.jvm.internal.m.e(identifier, "identifier");
        kotlin.jvm.internal.m.e(periodType, "periodType");
        kotlin.jvm.internal.m.e(latestPurchaseDate, "latestPurchaseDate");
        kotlin.jvm.internal.m.e(originalPurchaseDate, "originalPurchaseDate");
        kotlin.jvm.internal.m.e(store, "store");
        kotlin.jvm.internal.m.e(productIdentifier, "productIdentifier");
        kotlin.jvm.internal.m.e(ownershipType, "ownershipType");
        kotlin.jvm.internal.m.e(jsonObject, "jsonObject");
    }
}
