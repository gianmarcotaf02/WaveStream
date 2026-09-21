package com.revenuecat.purchases.google;

import android.text.TextUtils;
import androidx.media3.container.NalUnitUtil;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreReplacementMode;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aP\u0010\u0005\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0012"}, d2 = {"originalGooglePurchase", "Lcom/android/billingclient/api/Purchase;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "getOriginalGooglePurchase", "(Lcom/revenuecat/purchases/models/StoreTransaction;)Lcom/android/billingclient/api/Purchase;", "toStoreTransaction", "productType", "Lcom/revenuecat/purchases/ProductType;", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "subscriptionOptionId", "", "subscriptionOptionIdForProductIDs", "", "replacementMode", "Lcom/revenuecat/purchases/models/StoreReplacementMode;", "purchaseContext", "Lcom/revenuecat/purchases/google/PurchaseContext;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class StoreTransactionConversionsKt {
    public static final Purchase getOriginalGooglePurchase(StoreTransaction storeTransaction) {
        m.e(storeTransaction, "<this>");
        String signature = storeTransaction.getSignature();
        if (signature == null) {
            return null;
        }
        if (storeTransaction.getPurchaseType() != PurchaseType.GOOGLE_PURCHASE) {
            signature = null;
        }
        if (signature != null) {
            return new Purchase(storeTransaction.getOriginalJson().toString(), signature);
        }
        return null;
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, ProductType productType, PresentedOfferingContext presentedOfferingContext, String str, Map<String, String> map, StoreReplacementMode storeReplacementMode) {
        m.e(purchase, "<this>");
        m.e(productType, "productType");
        JSONObject jSONObject = purchase.f18570c;
        String strOptString = jSONObject.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = null;
        }
        ArrayList arrayListA = purchase.a();
        long jOptLong = jSONObject.optLong("purchaseTime");
        String strB = purchase.b();
        m.d(strB, "this.purchaseToken");
        return new StoreTransaction(strOptString, arrayListA, productType, jOptLong, strB, PurchaseStateConversionsKt.toRevenueCatPurchaseState(jSONObject.optInt("purchaseState", 1) == 4 ? 2 : 1), Boolean.valueOf(jSONObject.optBoolean("autoRenewing")), purchase.f18569b, new JSONObject(purchase.f18568a), presentedOfferingContext, null, PurchaseType.GOOGLE_PURCHASE, null, str, map, storeReplacementMode);
    }

    public static StoreTransaction toStoreTransaction$default(Purchase purchase, ProductType productType, PresentedOfferingContext presentedOfferingContext, String str, Map map, StoreReplacementMode storeReplacementMode, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            presentedOfferingContext = null;
        }
        if ((i3 & 4) != 0) {
            str = null;
        }
        if ((i3 & 8) != 0) {
            map = null;
        }
        if ((i3 & 16) != 0) {
            storeReplacementMode = null;
        }
        return toStoreTransaction(purchase, productType, presentedOfferingContext, str, map, storeReplacementMode);
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, PurchaseContext purchaseContext) {
        m.e(purchase, "<this>");
        m.e(purchaseContext, "purchaseContext");
        return toStoreTransaction(purchase, purchaseContext.getProductType(), purchaseContext.getPresentedOfferingContext(), purchaseContext.getSelectedSubscriptionOptionId(), purchaseContext.getSubscriptionOptionIdForProductIDs(), purchaseContext.getReplacementMode());
    }
}
