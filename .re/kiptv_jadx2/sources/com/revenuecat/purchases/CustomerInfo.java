package com.revenuecat.purchases;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.D;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.RawDataContainer;
import com.revenuecat.purchases.models.Transaction;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import io.sentry.protocol.Request;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import p070h6.h;
import p070h6.k;
import p078i6.C;
import p078i6.q;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b/\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u008d\u0001\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019By\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010!\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010#\u001a\u0004\u0018\u00010\b2\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\u001dJ\u0017\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b-\u0010,J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b2\u00103J+\u00106\u001a\b\u0012\u0004\u0012\u00020\u0007052\u0014\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010:R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010=R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010,R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\bD\u0010AR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bF\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bJ\u0010AR\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010KR\u001a\u0010\u0015\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\u0017\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010O\u001a\u0004\bP\u0010QR'\u0010X\u001a\b\u0012\u0004\u0012\u00020\u0007058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\bR\u0010S\u0012\u0004\bV\u0010W\u001a\u0004\bT\u0010UR'\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u0007058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bY\u0010S\u0012\u0004\b[\u0010W\u001a\u0004\bZ\u0010UR'\u0010`\u001a\b\u0012\u0004\u0012\u00020\u0007058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b]\u0010S\u0012\u0004\b_\u0010W\u001a\u0004\b^\u0010UR#\u0010d\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\ba\u0010S\u0012\u0004\bc\u0010W\u001a\u0004\bb\u0010AR'\u0010k\u001a\b\u0012\u0004\u0012\u00020f0e8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\bg\u0010S\u0012\u0004\bj\u0010W\u001a\u0004\bh\u0010iR-\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020l0\u00068FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\bm\u0010S\u0012\u0004\bo\u0010W\u001a\u0004\bn\u0010=R\"\u0010r\u001a\n q*\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004¢\u0006\f\n\u0004\br\u0010K\u0012\u0004\bs\u0010WR\u001a\u0010w\u001a\u00020\u00038VX\u0096\u0004¢\u0006\f\u0012\u0004\bv\u0010W\u001a\u0004\bt\u0010u¨\u0006x"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/models/RawDataContainer;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/EntitlementInfos;", CustomerInfoResponseJsonKeys.ENTITLEMENTS, "", "", "Ljava/util/Date;", "allExpirationDatesByProduct", "allPurchaseDatesByProduct", "requestDate", "", "schemaVersion", "firstSeen", "originalAppUserId", "Landroid/net/Uri;", "managementURL", "originalPurchaseDate", "jsonObject", "Lcom/revenuecat/purchases/CustomerInfoOriginalSource;", "originalSource", "", "loadedFromCache", "<init>", "(Lcom/revenuecat/purchases/EntitlementInfos;Ljava/util/Map;Ljava/util/Map;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Date;Lorg/json/JSONObject;Lcom/revenuecat/purchases/CustomerInfoOriginalSource;Z)V", "(Lcom/revenuecat/purchases/EntitlementInfos;Ljava/util/Map;Ljava/util/Map;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Date;Lorg/json/JSONObject;)V", ProxyAmazonBillingActivity.EXTRAS_SKU, "getExpirationDateForSku", "(Ljava/lang/String;)Ljava/util/Date;", "productId", "getExpirationDateForProductId", "getPurchaseDateForSku", "getPurchaseDateForProductId", "entitlement", "getExpirationDateForEntitlement", "getPurchaseDateForEntitlement", "toString", "()Ljava/lang/String;", "", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "expirations", "", "activeIdentifiers", "(Ljava/util/Map;)Ljava/util/Set;", "Lcom/revenuecat/purchases/EntitlementInfos;", "getEntitlements", "()Lcom/revenuecat/purchases/EntitlementInfos;", "Ljava/util/Map;", "getAllExpirationDatesByProduct", "()Ljava/util/Map;", "getAllPurchaseDatesByProduct", "Ljava/util/Date;", "getRequestDate", "()Ljava/util/Date;", "I", "getSchemaVersion", "getFirstSeen", "Ljava/lang/String;", "getOriginalAppUserId", "Landroid/net/Uri;", "getManagementURL", "()Landroid/net/Uri;", "getOriginalPurchaseDate", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/CustomerInfoOriginalSource;", "getOriginalSource$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/CustomerInfoOriginalSource;", "Z", "getLoadedFromCache$purchases_defaultsRelease", "()Z", "activeSubscriptions$delegate", "Lh6/h;", "getActiveSubscriptions", "()Ljava/util/Set;", "getActiveSubscriptions$annotations", "()V", "activeSubscriptions", "allPurchasedSkus$delegate", "getAllPurchasedSkus", "getAllPurchasedSkus$annotations", "allPurchasedSkus", "allPurchasedProductIds$delegate", "getAllPurchasedProductIds", "getAllPurchasedProductIds$annotations", "allPurchasedProductIds", "latestExpirationDate$delegate", "getLatestExpirationDate", "getLatestExpirationDate$annotations", "latestExpirationDate", "", "Lcom/revenuecat/purchases/models/Transaction;", "nonSubscriptionTransactions$delegate", "getNonSubscriptionTransactions", "()Ljava/util/List;", "getNonSubscriptionTransactions$annotations", "nonSubscriptionTransactions", "Lcom/revenuecat/purchases/SubscriptionInfo;", "subscriptionsByProductIdentifier$delegate", "getSubscriptionsByProductIdentifier", "getSubscriptionsByProductIdentifier$annotations", "subscriptionsByProductIdentifier", "kotlin.jvm.PlatformType", "subscriberJSONObject", "getSubscriberJSONObject$annotations", "getRawData", "()Lorg/json/JSONObject;", "getRawData$annotations", "rawData", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerInfo implements Parcelable, RawDataContainer<JSONObject> {
    public static final Parcelable.Creator<CustomerInfo> CREATOR = new Creator();

    private final h activeSubscriptions;
    private final Map<String, Date> allExpirationDatesByProduct;
    private final Map<String, Date> allPurchaseDatesByProduct;

    private final h allPurchasedProductIds;

    private final h allPurchasedSkus;
    private final EntitlementInfos entitlements;
    private final Date firstSeen;
    private final JSONObject jsonObject;

    private final h latestExpirationDate;
    private final boolean loadedFromCache;
    private final Uri managementURL;

    private final h nonSubscriptionTransactions;
    private final String originalAppUserId;
    private final Date originalPurchaseDate;
    private final CustomerInfoOriginalSource originalSource;
    private final Date requestDate;
    private final int schemaVersion;
    private final JSONObject subscriberJSONObject;

    private final h subscriptionsByProductIdentifier;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements Parcelable.Creator<CustomerInfo> {
        @Override
        public final CustomerInfo createFromParcel(Parcel parcel) {
            m.e(parcel, "parcel");
            EntitlementInfos entitlementInfosCreateFromParcel = EntitlementInfos.CREATOR.createFromParcel(parcel);
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i9 = 0; i9 != i3; i9++) {
                linkedHashMap.put(parcel.readString(), parcel.readSerializable());
            }
            int i10 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                linkedHashMap2.put(parcel.readString(), parcel.readSerializable());
            }
            return new CustomerInfo(entitlementInfosCreateFromParcel, linkedHashMap, linkedHashMap2, (Date) parcel.readSerializable(), parcel.readInt(), (Date) parcel.readSerializable(), parcel.readString(), (Uri) parcel.readParcelable(CustomerInfo.class.getClassLoader()), (Date) parcel.readSerializable(), JSONObjectParceler.INSTANCE.create(parcel), CustomerInfoOriginalSource.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override
        public final CustomerInfo[] newArray(int i3) {
            return new CustomerInfo[i3];
        }
    }

    public CustomerInfo(EntitlementInfos entitlements, Map<String, ? extends Date> allExpirationDatesByProduct, Map<String, ? extends Date> allPurchaseDatesByProduct, Date requestDate, int i3, Date firstSeen, String originalAppUserId, Uri uri, Date date, JSONObject jsonObject, CustomerInfoOriginalSource originalSource, boolean z6) {
        m.e(entitlements, "entitlements");
        m.e(allExpirationDatesByProduct, "allExpirationDatesByProduct");
        m.e(allPurchaseDatesByProduct, "allPurchaseDatesByProduct");
        m.e(requestDate, "requestDate");
        m.e(firstSeen, "firstSeen");
        m.e(originalAppUserId, "originalAppUserId");
        m.e(jsonObject, "jsonObject");
        m.e(originalSource, "originalSource");
        this.entitlements = entitlements;
        this.allExpirationDatesByProduct = allExpirationDatesByProduct;
        this.allPurchaseDatesByProduct = allPurchaseDatesByProduct;
        this.requestDate = requestDate;
        this.schemaVersion = i3;
        this.firstSeen = firstSeen;
        this.originalAppUserId = originalAppUserId;
        this.managementURL = uri;
        this.originalPurchaseDate = date;
        this.jsonObject = jsonObject;
        this.originalSource = originalSource;
        this.loadedFromCache = z6;
        this.activeSubscriptions = D.B(new CustomerInfo$activeSubscriptions$2(this));
        this.allPurchasedSkus = D.B(new CustomerInfo$allPurchasedSkus$2(this));
        this.allPurchasedProductIds = D.B(new CustomerInfo$allPurchasedProductIds$2(this));
        this.latestExpirationDate = D.B(new CustomerInfo$latestExpirationDate$2(this));
        this.nonSubscriptionTransactions = D.B(new CustomerInfo$nonSubscriptionTransactions$2(this));
        this.subscriptionsByProductIdentifier = D.B(new CustomerInfo$subscriptionsByProductIdentifier$2(this));
        this.subscriberJSONObject = jsonObject.getJSONObject(CustomerInfoResponseJsonKeys.SUBSCRIBER);
    }

    public final Set<String> activeIdentifiers(Map<String, ? extends Date> expirations) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Date> entry : expirations.entrySet()) {
            if (DateHelper.Companion.m283isDateActiveSxA4cEA$default(DateHelper.INSTANCE, entry.getValue(), this.requestDate, 0L, 4, null).isActive()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    public static void getActiveSubscriptions$annotations() {
    }

    public static void getAllPurchasedProductIds$annotations() {
    }

    @p070h6.c
    public static void getAllPurchasedSkus$annotations() {
    }

    public static void getLatestExpirationDate$annotations() {
    }

    public static void getNonSubscriptionTransactions$annotations() {
    }

    public static void getRawData$annotations() {
    }

    private static void getSubscriberJSONObject$annotations() {
    }

    public static void getSubscriptionsByProductIdentifier$annotations() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        return (other instanceof CustomerInfo) && new ComparableData(this).equals(new ComparableData((CustomerInfo) other));
    }

    public final Set<String> getActiveSubscriptions() {
        return (Set) this.activeSubscriptions.getValue();
    }

    public final Map<String, Date> getAllExpirationDatesByProduct() {
        return this.allExpirationDatesByProduct;
    }

    public final Map<String, Date> getAllPurchaseDatesByProduct() {
        return this.allPurchaseDatesByProduct;
    }

    public final Set<String> getAllPurchasedProductIds() {
        return (Set) this.allPurchasedProductIds.getValue();
    }

    public final Set<String> getAllPurchasedSkus() {
        return (Set) this.allPurchasedSkus.getValue();
    }

    public final EntitlementInfos getEntitlements() {
        return this.entitlements;
    }

    public final Date getExpirationDateForEntitlement(String entitlement) {
        m.e(entitlement, "entitlement");
        EntitlementInfo entitlementInfo = this.entitlements.getAll().get(entitlement);
        if (entitlementInfo != null) {
            return entitlementInfo.getExpirationDate();
        }
        return null;
    }

    public final Date getExpirationDateForProductId(String productId) {
        m.e(productId, "productId");
        return this.allExpirationDatesByProduct.get(productId);
    }

    @p070h6.c
    public final Date getExpirationDateForSku(String sku) {
        m.e(sku, "sku");
        return this.allExpirationDatesByProduct.get(sku);
    }

    public final Date getFirstSeen() {
        return this.firstSeen;
    }

    public final Date getLatestExpirationDate() {
        return (Date) this.latestExpirationDate.getValue();
    }

    public final boolean getLoadedFromCache() {
        return this.loadedFromCache;
    }

    public final Uri getManagementURL() {
        return this.managementURL;
    }

    public final List<Transaction> getNonSubscriptionTransactions() {
        return (List) this.nonSubscriptionTransactions.getValue();
    }

    public final String getOriginalAppUserId() {
        return this.originalAppUserId;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final CustomerInfoOriginalSource getOriginalSource() {
        return this.originalSource;
    }

    public final Date getPurchaseDateForEntitlement(String entitlement) {
        m.e(entitlement, "entitlement");
        EntitlementInfo entitlementInfo = this.entitlements.getAll().get(entitlement);
        if (entitlementInfo != null) {
            return entitlementInfo.getLatestPurchaseDate();
        }
        return null;
    }

    public final Date getPurchaseDateForProductId(String productId) {
        m.e(productId, "productId");
        return this.allPurchaseDatesByProduct.get(productId);
    }

    @p070h6.c
    public final Date getPurchaseDateForSku(String sku) {
        m.e(sku, "sku");
        return this.allPurchaseDatesByProduct.get(sku);
    }

    public final Date getRequestDate() {
        return this.requestDate;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public final Map<String, SubscriptionInfo> getSubscriptionsByProductIdentifier() {
        return (Map) this.subscriptionsByProductIdentifier.getValue();
    }

    public int hashCode() {
        return new ComparableData(this).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<CustomerInfo\n latestExpirationDate: ");
        sb.append(getLatestExpirationDate());
        sb.append("\nactiveSubscriptions:  ");
        Set<String> activeSubscriptions = getActiveSubscriptions();
        ArrayList arrayList = new ArrayList(q.I0(activeSubscriptions, 10));
        for (String str : activeSubscriptions) {
            arrayList.add(new k(str, p078i6.D.J0(new k("expiresDate", getExpirationDateForProductId(str)))));
        }
        sb.append(C.X0(arrayList));
        sb.append(",\nactiveEntitlements: ");
        Map<String, EntitlementInfo> active = this.entitlements.getActive();
        ArrayList arrayList2 = new ArrayList(active.size());
        Iterator<Map.Entry<String, EntitlementInfo>> it = active.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().toString());
        }
        sb.append(arrayList2);
        sb.append(",\nentitlements: ");
        Map<String, EntitlementInfo> all = this.entitlements.getAll();
        ArrayList arrayList3 = new ArrayList(all.size());
        Iterator<Map.Entry<String, EntitlementInfo>> it2 = all.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList3.add(it2.next().toString());
        }
        sb.append(arrayList3);
        sb.append(",\nnonSubscriptionTransactions: ");
        sb.append(getNonSubscriptionTransactions());
        sb.append(",\nrequestDate: ");
        sb.append(this.requestDate);
        sb.append("\n>");
        return sb.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        m.e(parcel, "out");
        this.entitlements.writeToParcel(parcel, flags);
        Map<String, Date> map = this.allExpirationDatesByProduct;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeSerializable(entry.getValue());
        }
        Map<String, Date> map2 = this.allPurchaseDatesByProduct;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, Date> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeSerializable(entry2.getValue());
        }
        parcel.writeSerializable(this.requestDate);
        parcel.writeInt(this.schemaVersion);
        parcel.writeSerializable(this.firstSeen);
        parcel.writeString(this.originalAppUserId);
        parcel.writeParcelable(this.managementURL, flags);
        parcel.writeSerializable(this.originalPurchaseDate);
        JSONObjectParceler.INSTANCE.write(this.jsonObject, parcel, flags);
        parcel.writeString(this.originalSource.name());
        parcel.writeInt(this.loadedFromCache ? 1 : 0);
    }

    @Override
    public JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public CustomerInfo(EntitlementInfos entitlementInfos, Map map, Map map2, Date date, int i3, Date date2, String str, Uri uri, Date date3, JSONObject jSONObject, CustomerInfoOriginalSource customerInfoOriginalSource, boolean z6, int i9, AbstractC2541f abstractC2541f) {
        this(entitlementInfos, map, map2, date, i3, date2, str, uri, date3, jSONObject, (i9 & 1024) != 0 ? CustomerInfoOriginalSource.INSTANCE.getDEFAULT() : customerInfoOriginalSource, (i9 & 2048) != 0 ? false : z6);
    }

    public CustomerInfo(EntitlementInfos entitlements, Map<String, ? extends Date> allExpirationDatesByProduct, Map<String, ? extends Date> allPurchaseDatesByProduct, Date requestDate, int i3, Date firstSeen, String originalAppUserId, Uri uri, Date date, JSONObject jsonObject) {
        this(entitlements, allExpirationDatesByProduct, allPurchaseDatesByProduct, requestDate, i3, firstSeen, originalAppUserId, uri, date, jsonObject, CustomerInfoOriginalSource.INSTANCE.getDEFAULT(), true);
        m.e(entitlements, "entitlements");
        m.e(allExpirationDatesByProduct, "allExpirationDatesByProduct");
        m.e(allPurchaseDatesByProduct, "allPurchaseDatesByProduct");
        m.e(requestDate, "requestDate");
        m.e(firstSeen, "firstSeen");
        m.e(originalAppUserId, "originalAppUserId");
        m.e(jsonObject, "jsonObject");
    }
}
