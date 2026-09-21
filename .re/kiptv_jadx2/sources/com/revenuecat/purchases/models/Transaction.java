package com.revenuecat.purchases.models;

import B2.a;
import O7.q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.JsonTools;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.common.responses.SubscriptionInfoResponse;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import io.sentry.protocol.Device;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;
import p070h6.c;
import p121o0.p;
import p162s8.d;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013BC\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0014B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0012\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010%R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b)\u0010%R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b/\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b3\u0010%R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b\u000e\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b6\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/revenuecat/purchases/models/Transaction;", "Landroid/os/Parcelable;", "", "transactionIdentifier", "revenuecatId", "productIdentifier", "productId", "Ljava/util/Date;", "purchaseDate", "storeTransactionId", "Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "displayName", "", "isSandbox", "originalPurchaseDate", "Lcom/revenuecat/purchases/models/Price;", "price", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/revenuecat/purchases/Store;Ljava/lang/String;ZLjava/util/Date;Lcom/revenuecat/purchases/models/Price;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/revenuecat/purchases/Store;)V", "Lorg/json/JSONObject;", "jsonObject", "Ljava/util/Locale;", Device.JsonKeys.LOCALE, "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Locale;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTransactionIdentifier", "()Ljava/lang/String;", "getRevenuecatId", "getRevenuecatId$annotations", "()V", "getProductIdentifier", "getProductId", "getProductId$annotations", "Ljava/util/Date;", "getPurchaseDate", "()Ljava/util/Date;", "getStoreTransactionId", "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", "getDisplayName", "Z", "()Z", "getOriginalPurchaseDate", "Lcom/revenuecat/purchases/models/Price;", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Transaction implements Parcelable {
    public static final Parcelable.Creator<Transaction> CREATOR = new Creator();
    private final String displayName;
    private final boolean isSandbox;
    private final Date originalPurchaseDate;
    private final Price price;
    private final String productId;
    private final String productIdentifier;
    private final Date purchaseDate;
    private final String revenuecatId;
    private final Store store;
    private final String storeTransactionId;
    private final String transactionIdentifier;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements Parcelable.Creator<Transaction> {
        @Override
        public final Transaction createFromParcel(Parcel parcel) {
            m.e(parcel, "parcel");
            return new Transaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), parcel.readString(), Store.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, (Date) parcel.readSerializable(), parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel));
        }

        @Override
        public final Transaction[] newArray(int i3) {
            return new Transaction[i3];
        }
    }

    public Transaction(String transactionIdentifier, String revenuecatId, String productIdentifier, String productId, Date purchaseDate, String str, Store store, String str2, boolean z6, Date date, Price price) {
        m.e(transactionIdentifier, "transactionIdentifier");
        m.e(revenuecatId, "revenuecatId");
        m.e(productIdentifier, "productIdentifier");
        m.e(productId, "productId");
        m.e(purchaseDate, "purchaseDate");
        m.e(store, "store");
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

    @c
    public static void getProductId$annotations() {
    }

    @c
    public static void getRevenuecatId$annotations() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) obj;
        return m.a(this.transactionIdentifier, transaction.transactionIdentifier) && m.a(this.revenuecatId, transaction.revenuecatId) && m.a(this.productIdentifier, transaction.productIdentifier) && m.a(this.productId, transaction.productId) && m.a(this.purchaseDate, transaction.purchaseDate) && m.a(this.storeTransactionId, transaction.storeTransactionId) && this.store == transaction.store && m.a(this.displayName, transaction.displayName) && this.isSandbox == transaction.isSandbox && m.a(this.originalPurchaseDate, transaction.originalPurchaseDate) && m.a(this.price, transaction.price);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final String getRevenuecatId() {
        return this.revenuecatId;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getStoreTransactionId() {
        return this.storeTransactionId;
    }

    public final String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    public int hashCode() {
        int iHashCode = (this.purchaseDate.hashCode() + a.a(a.a(a.a(this.transactionIdentifier.hashCode() * 31, 31, this.revenuecatId), 31, this.productIdentifier), 31, this.productId)) * 31;
        String str = this.storeTransactionId;
        int iHashCode2 = (this.store.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.displayName;
        int iF = p.f((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isSandbox);
        Date date = this.originalPurchaseDate;
        int iHashCode3 = (iF + (date == null ? 0 : date.hashCode())) * 31;
        Price price = this.price;
        return iHashCode3 + (price != null ? price.hashCode() : 0);
    }

    public final boolean getIsSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        return "Transaction(transactionIdentifier=" + this.transactionIdentifier + ", revenuecatId=" + this.revenuecatId + ", productIdentifier=" + this.productIdentifier + ", productId=" + this.productId + ", purchaseDate=" + this.purchaseDate + ", storeTransactionId=" + this.storeTransactionId + ", store=" + this.store + ", displayName=" + this.displayName + ", isSandbox=" + this.isSandbox + ", originalPurchaseDate=" + this.originalPurchaseDate + ", price=" + this.price + ')';
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        m.e(parcel, "out");
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
        Price price = this.price;
        if (price == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            price.writeToParcel(parcel, flags);
        }
    }

    public Transaction(String str, String str2, String str3, String str4, Date date, String str5, Store store, String str6, boolean z6, Date date2, Price price, int i3, AbstractC2541f abstractC2541f) {
        this(str, str2, str3, str4, date, str5, store, str6, (i3 & 256) != 0 ? false : z6, date2, price);
    }

    @c
    public Transaction(String transactionIdentifier, String revenuecatId, String productIdentifier, String productId, Date purchaseDate, String str, Store store) {
        this(transactionIdentifier, revenuecatId, productIdentifier, productId, purchaseDate, str, store, null, false, null, null);
        m.e(transactionIdentifier, "transactionIdentifier");
        m.e(revenuecatId, "revenuecatId");
        m.e(productIdentifier, "productIdentifier");
        m.e(productId, "productId");
        m.e(purchaseDate, "purchaseDate");
        m.e(store, "store");
    }

    public Transaction(String str, JSONObject jSONObject, Locale locale, int i3, AbstractC2541f abstractC2541f) {
        if ((i3 & 4) != 0) {
            locale = Locale.getDefault();
            m.d(locale, "getDefault()");
        }
        this(str, jSONObject, locale);
    }

    public Transaction(String productId, JSONObject jsonObject, Locale locale) throws JSONException {
        String string;
        m.e(productId, "productId");
        m.e(jsonObject, "jsonObject");
        m.e(locale, "locale");
        String string2 = jsonObject.getString("id");
        m.d(string2, "jsonObject.getString(\"id\")");
        String string3 = jsonObject.getString("id");
        m.d(string3, "jsonObject.getString(\"id\")");
        Date date = JSONObjectExtensionsKt.getDate(jsonObject, "purchase_date");
        String it = jsonObject.optString("store_transaction_id");
        m.d(it, "it");
        Price price = null;
        it = q.N0(it) ? null : it;
        String it2 = jsonObject.getString(ProductResponseJsonKeys.STORE);
        Store.Companion companion = Store.INSTANCE;
        m.d(it2, "it");
        Store storeFromString = companion.fromString(it2);
        String it3 = jsonObject.optString("display_name");
        m.d(it3, "it");
        String str = !q.N0(it3) ? it3 : null;
        boolean zOptBoolean = jsonObject.optBoolean(ProductResponseJsonKeys.IS_SANDBOX, false);
        Date dateOptDate = JSONObjectExtensionsKt.optDate(jsonObject, "original_purchase_date");
        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("price");
        if (jSONObjectOptJSONObject != null && (string = jSONObjectOptJSONObject.toString()) != null) {
            d json = JsonTools.INSTANCE.getJson();
            json.getClass();
            price = ((SubscriptionInfoResponse.PriceResponse) json.b(string, SubscriptionInfoResponse.PriceResponse.INSTANCE.serializer())).toPrice(locale);
        }
        this(string2, string3, productId, productId, date, it, storeFromString, str, zOptBoolean, dateOptDate, price);
    }
}
