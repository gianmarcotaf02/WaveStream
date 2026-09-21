package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013BC\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0014B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0012\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010%R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b)\u0010%R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b/\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b3\u0010%R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b\u000e\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b6\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/revenuecat/purchases/models/Transaction;", "Landroid/os/Parcelable;", "", "transactionIdentifier", "revenuecatId", "productIdentifier", "productId", "Ljava/util/Date;", "purchaseDate", "storeTransactionId", "Lcom/revenuecat/purchases/Store;", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "displayName", "", "isSandbox", "originalPurchaseDate", "Lcom/revenuecat/purchases/models/Price;", "price", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/revenuecat/purchases/Store;Ljava/lang/String;ZLjava/util/Date;Lcom/revenuecat/purchases/models/Price;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/revenuecat/purchases/Store;)V", "Lorg/json/JSONObject;", "jsonObject", "Ljava/util/Locale;", io.sentry.protocol.Device.JsonKeys.LOCALE, "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Locale;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTransactionIdentifier", "()Ljava/lang/String;", "getRevenuecatId", "getRevenuecatId$annotations", "()V", "getProductIdentifier", "getProductId", "getProductId$annotations", "Ljava/util/Date;", "getPurchaseDate", "()Ljava/util/Date;", "getStoreTransactionId", "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", "getDisplayName", "Z", "()Z", "getOriginalPurchaseDate", "Lcom/revenuecat/purchases/models/Price;", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Transaction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.revenuecat.purchases.models.Transaction> CREATOR = new com.revenuecat.purchases.models.Transaction.Creator();
    private final java.lang.String displayName;
    private final boolean isSandbox;
    private final java.util.Date originalPurchaseDate;
    private final com.revenuecat.purchases.models.Price price;
    private final java.lang.String productId;
    private final java.lang.String productIdentifier;
    private final java.util.Date purchaseDate;
    private final java.lang.String revenuecatId;
    private final com.revenuecat.purchases.Store store;
    private final java.lang.String storeTransactionId;
    private final java.lang.String transactionIdentifier;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.models.Transaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.models.Transaction createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.m.e(parcel, "parcel");
            return new com.revenuecat.purchases.models.Transaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (java.util.Date) parcel.readSerializable(), parcel.readString(), com.revenuecat.purchases.Store.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, (java.util.Date) parcel.readSerializable(), parcel.readInt() == 0 ? null : com.revenuecat.purchases.models.Price.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.models.Transaction[] newArray(int i3) {
            return new com.revenuecat.purchases.models.Transaction[i3];
        }
    }

    public Transaction(java.lang.String transactionIdentifier, java.lang.String revenuecatId, java.lang.String productIdentifier, java.lang.String productId, java.util.Date purchaseDate, java.lang.String str, com.revenuecat.purchases.Store store, java.lang.String str2, boolean z6, java.util.Date date, com.revenuecat.purchases.models.Price price) {
        kotlin.jvm.internal.m.e(transactionIdentifier, "transactionIdentifier");
        kotlin.jvm.internal.m.e(revenuecatId, "revenuecatId");
        kotlin.jvm.internal.m.e(productIdentifier, "productIdentifier");
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(purchaseDate, "purchaseDate");
        kotlin.jvm.internal.m.e(store, "store");
        this.transactionIdentifier = transactionIdentifier;
        this.revenuecatId = revenuecatId;
        this.productIdentifier = productIdentifier;
        this.productId = productId;
        this.purchaseDate = purchaseDate;
        this.storeTransactionId = str;
        this.store = store;
        this.displayName = str2;
        this.isSandbox = z6;
        this.originalPurchaseDate = date;
        this.price = price;
    }

    @p070h6.c
    public static /* synthetic */ void getProductId$annotations() {
    }

    @p070h6.c
    public static /* synthetic */ void getRevenuecatId$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.models.Transaction)) {
            return false;
        }
        com.revenuecat.purchases.models.Transaction transaction = (com.revenuecat.purchases.models.Transaction) obj;
        return kotlin.jvm.internal.m.a(this.transactionIdentifier, transaction.transactionIdentifier) && kotlin.jvm.internal.m.a(this.revenuecatId, transaction.revenuecatId) && kotlin.jvm.internal.m.a(this.productIdentifier, transaction.productIdentifier) && kotlin.jvm.internal.m.a(this.productId, transaction.productId) && kotlin.jvm.internal.m.a(this.purchaseDate, transaction.purchaseDate) && kotlin.jvm.internal.m.a(this.storeTransactionId, transaction.storeTransactionId) && this.store == transaction.store && kotlin.jvm.internal.m.a(this.displayName, transaction.displayName) && this.isSandbox == transaction.isSandbox && kotlin.jvm.internal.m.a(this.originalPurchaseDate, transaction.originalPurchaseDate) && kotlin.jvm.internal.m.a(this.price, transaction.price);
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.util.Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final com.revenuecat.purchases.models.Price getPrice() {
        return this.price;
    }

    public final java.lang.String getProductId() {
        return this.productId;
    }

    public final java.lang.String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final java.util.Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final java.lang.String getRevenuecatId() {
        return this.revenuecatId;
    }

    public final com.revenuecat.purchases.Store getStore() {
        return this.store;
    }

    public final java.lang.String getStoreTransactionId() {
        return this.storeTransactionId;
    }

    public final java.lang.String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    public int hashCode() {
        int iHashCode = (this.purchaseDate.hashCode() + B2.a.a(B2.a.a(B2.a.a(this.transactionIdentifier.hashCode() * 31, 31, this.revenuecatId), 31, this.productIdentifier), 31, this.productId)) * 31;
        java.lang.String str = this.storeTransactionId;
        int iHashCode2 = (this.store.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        java.lang.String str2 = this.displayName;
        int iF = p121o0.p.f((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isSandbox);
        java.util.Date date = this.originalPurchaseDate;
        int iHashCode3 = (iF + (date == null ? 0 : date.hashCode())) * 31;
        com.revenuecat.purchases.models.Price price = this.price;
        return iHashCode3 + (price != null ? price.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isSandbox, reason: from getter */
    public final boolean getIsSandbox() {
        return this.isSandbox;
    }

    public java.lang.String toString() {
        return "Transaction(transactionIdentifier=" + this.transactionIdentifier + ", revenuecatId=" + this.revenuecatId + ", productIdentifier=" + this.productIdentifier + ", productId=" + this.productId + ", purchaseDate=" + this.purchaseDate + ", storeTransactionId=" + this.storeTransactionId + ", store=" + this.store + ", displayName=" + this.displayName + ", isSandbox=" + this.isSandbox + ", originalPurchaseDate=" + this.originalPurchaseDate + ", price=" + this.price + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.m.e(parcel, "out");
        parcel.writeString(this.transactionIdentifier);
        parcel.writeString(this.revenuecatId);
        parcel.writeString(this.productIdentifier);
        parcel.writeString(this.productId);
        parcel.writeSerializable(this.purchaseDate);
        parcel.writeString(this.storeTransactionId);
        parcel.writeString(this.store.name());
        parcel.writeString(this.displayName);
        parcel.writeInt(this.isSandbox ? 1 : 0);
        parcel.writeSerializable(this.originalPurchaseDate);
        com.revenuecat.purchases.models.Price price = this.price;
        if (price == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            price.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ Transaction(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Date date, java.lang.String str5, com.revenuecat.purchases.Store store, java.lang.String str6, boolean z6, java.util.Date date2, com.revenuecat.purchases.models.Price price, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, str3, str4, date, str5, store, str6, (i3 & 256) != 0 ? false : z6, date2, price);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public Transaction(java.lang.String transactionIdentifier, java.lang.String revenuecatId, java.lang.String productIdentifier, java.lang.String productId, java.util.Date purchaseDate, java.lang.String str, com.revenuecat.purchases.Store store) {
        this(transactionIdentifier, revenuecatId, productIdentifier, productId, purchaseDate, str, store, null, false, null, null);
        kotlin.jvm.internal.m.e(transactionIdentifier, "transactionIdentifier");
        kotlin.jvm.internal.m.e(revenuecatId, "revenuecatId");
        kotlin.jvm.internal.m.e(productIdentifier, "productIdentifier");
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(purchaseDate, "purchaseDate");
        kotlin.jvm.internal.m.e(store, "store");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Transaction(java.lang.String str, org.json.JSONObject jSONObject, java.util.Locale locale, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        if ((i3 & 4) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.m.d(locale, "getDefault()");
        }
        this(str, jSONObject, locale);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Transaction(java.lang.String productId, org.json.JSONObject jsonObject, java.util.Locale locale) throws org.json.JSONException {
        java.lang.String string;
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(jsonObject, "jsonObject");
        kotlin.jvm.internal.m.e(locale, "locale");
        java.lang.String string2 = jsonObject.getString("id");
        kotlin.jvm.internal.m.d(string2, "jsonObject.getString(\"id\")");
        java.lang.String string3 = jsonObject.getString("id");
        kotlin.jvm.internal.m.d(string3, "jsonObject.getString(\"id\")");
        java.util.Date date = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.getDate(jsonObject, "purchase_date");
        java.lang.String it = jsonObject.optString("store_transaction_id");
        kotlin.jvm.internal.m.d(it, "it");
        com.revenuecat.purchases.models.Price price = null;
        it = O7.q.N0(it) ? null : it;
        java.lang.String it2 = jsonObject.getString(com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE);
        com.revenuecat.purchases.Store.Companion companion = com.revenuecat.purchases.Store.INSTANCE;
        kotlin.jvm.internal.m.d(it2, "it");
        com.revenuecat.purchases.Store storeFromString = companion.fromString(it2);
        java.lang.String it3 = jsonObject.optString("display_name");
        kotlin.jvm.internal.m.d(it3, "it");
        java.lang.String str = !O7.q.N0(it3) ? it3 : null;
        boolean zOptBoolean = jsonObject.optBoolean(com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.IS_SANDBOX, false);
        java.util.Date dateOptDate = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optDate(jsonObject, "original_purchase_date");
        org.json.JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("price");
        if (jSONObjectOptJSONObject != null && (string = jSONObjectOptJSONObject.toString()) != null) {
            p162s8.d json = com.revenuecat.purchases.JsonTools.INSTANCE.getJson();
            json.getClass();
            price = ((com.revenuecat.purchases.common.responses.SubscriptionInfoResponse.PriceResponse) json.b(string, com.revenuecat.purchases.common.responses.SubscriptionInfoResponse.PriceResponse.INSTANCE.serializer())).toPrice(locale);
        }
        this(string2, string3, productId, productId, date, it, storeFromString, str, zOptBoolean, dateOptDate, price);
    }
}
