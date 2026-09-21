package com.revenuecat.purchases.amazon;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.container.NalUnitUtil;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J \u0010%\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/amazon/DefaultPurchasingServiceProvider;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/amazon/device/iap/PurchasingListener;", "listener", "Lh6/A;", "registerListener", "(Landroid/content/Context;Lcom/amazon/device/iap/PurchasingListener;)V", "Lcom/amazon/device/iap/model/RequestId;", "getUserData", "()Lcom/amazon/device/iap/model/RequestId;", "", ProxyAmazonBillingActivity.EXTRAS_SKU, "purchase", "(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;", "", "skus", "getProductData", "(Ljava/util/Set;)Lcom/amazon/device/iap/model/RequestId;", "", "reset", "getPurchaseUpdates", "(Z)Lcom/amazon/device/iap/model/RequestId;", "receiptId", "Lcom/amazon/device/iap/model/FulfillmentResult;", "fulfillmentResult", "notifyFulfillment", "(Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultPurchasingServiceProvider implements PurchasingServiceProvider {
    public static final Parcelable.Creator<DefaultPurchasingServiceProvider> CREATOR = new Creator();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements Parcelable.Creator<DefaultPurchasingServiceProvider> {
        @Override
        public final DefaultPurchasingServiceProvider createFromParcel(Parcel parcel) {
            m.e(parcel, "parcel");
            parcel.readInt();
            return new DefaultPurchasingServiceProvider();
        }

        @Override
        public final DefaultPurchasingServiceProvider[] newArray(int i3) {
            return new DefaultPurchasingServiceProvider[i3];
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public RequestId getProductData(Set<String> skus) {
        m.e(skus, "skus");
        RequestId productData = PurchasingService.getProductData(skus);
        m.d(productData, "getProductData(skus)");
        return productData;
    }

    @Override
    public RequestId getPurchaseUpdates(boolean reset) {
        RequestId purchaseUpdates = PurchasingService.getPurchaseUpdates(reset);
        m.d(purchaseUpdates, "getPurchaseUpdates(reset)");
        return purchaseUpdates;
    }

    @Override
    public RequestId getUserData() {
        RequestId userData = PurchasingService.getUserData(UserDataRequest.newBuilder().setFetchLWAConsentStatus(true).build());
        m.d(userData, "getUserData(UserDataRequ…sentStatus(true).build())");
        return userData;
    }

    @Override
    public void notifyFulfillment(String receiptId, FulfillmentResult fulfillmentResult) {
        m.e(receiptId, "receiptId");
        m.e(fulfillmentResult, "fulfillmentResult");
        PurchasingService.notifyFulfillment(receiptId, fulfillmentResult);
    }

    @Override
    public RequestId purchase(String sku) {
        m.e(sku, "sku");
        RequestId requestIdPurchase = PurchasingService.purchase(sku);
        m.d(requestIdPurchase, "purchase(sku)");
        return requestIdPurchase;
    }

    @Override
    public void registerListener(Context context, PurchasingListener listener) {
        m.e(context, "context");
        m.e(listener, "listener");
        PurchasingService.registerListener(context, listener);
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        m.e(parcel, "out");
        parcel.writeInt(1);
    }
}
