package com.revenuecat.purchases.common;

import android.app.Activity;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.AmazonLWAConsentStatus;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p194x6.j;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001:\u0002`aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH$¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJI\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\b0\u00102\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J[\u0010!\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b2\u001c\u0010\u001f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0011\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u001e2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0015H&¢\u0006\u0004\b!\u0010\"J/\u0010)\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020#2\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*JO\u0010-\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u000e2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u00102\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0010H&¢\u0006\u0004\b-\u0010.JG\u00108\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00102\u001a\u0002012\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00107\u001a\u0004\u0018\u00010#H&¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020#H&¢\u0006\u0004\b:\u0010;JK\u0010>\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u001e\u0010=\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120<\u0012\u0004\u0012\u00020\b0\u00102\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0010H&¢\u0006\u0004\b>\u0010\u0018JO\u0010B\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000e2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u00102\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0010H\u0016¢\u0006\u0004\bB\u0010CJ3\u0010H\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00112\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\b0FH&¢\u0006\u0004\bH\u0010IJ;\u0010J\u001a\u00020\b2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u00102\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0015H&¢\u0006\u0004\bJ\u0010KJ;\u0010M\u001a\u00020\b2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\b0\u00102\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0015H\u0016¢\u0006\u0004\bM\u0010KR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010N\u001a\u0004\bO\u0010PR.\u0010S\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010Q8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010Z\u001a\u0004\u0018\u00010Y8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_¨\u0006b"}, d2 = {"Lcom/revenuecat/purchases/common/BillingAbstract;", "", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "purchasesStateProvider", "<init>", "(Lcom/revenuecat/purchases/PurchasesStateProvider;)V", "", "delayMilliseconds", "Lh6/A;", "startConnection", "(J)V", "endConnection", "()V", "close", "", "appUserID", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "onReceivePurchaseHistory", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onReceivePurchaseHistoryError", "queryAllPurchases", "(Ljava/lang/String;Lx6/j;Lx6/j;)V", "Lcom/revenuecat/purchases/ProductType;", "productType", "", "productIds", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "onError", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;Lx6/j;Lx6/j;)V", "", "finishTransactions", "purchase", "shouldConsume", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;ZLcom/revenuecat/purchases/PostReceiptInitiationSource;)V", "productId", "onCompletion", "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Lx6/j;Lx6/j;)V", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "isPersonalizedPrice", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;)V", "isConnected", "()Z", "", "onSuccess", "queryPurchases", "productID", "purchaseToken", "storeUserID", "normalizePurchaseData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx6/j;Lx6/j;)V", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "getStorefront", "(Lx6/j;Lx6/j;)V", "Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "getAmazonLWAConsentStatus", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "getPurchasesStateProvider", "()Lcom/revenuecat/purchases/PurchasesStateProvider;", "Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;", "<set-?>", "stateListener", "Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;", "getStateListener", "()Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;", "setStateListener", "(Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;)V", "Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "purchasesUpdatedListener", "Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "getPurchasesUpdatedListener", "()Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "setPurchasesUpdatedListener", "(Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;)V", "PurchasesUpdatedListener", "StateListener", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class BillingAbstract {
    private final PurchasesStateProvider purchasesStateProvider;
    private volatile PurchasesUpdatedListener purchasesUpdatedListener;
    private volatile StateListener stateListener;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchases", "Lh6/A;", "onPurchasesUpdated", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "onPurchasesFailedToUpdate", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public interface PurchasesUpdatedListener {
        void onPurchasesFailedToUpdate(PurchasesError purchasesError);

        void onPurchasesUpdated(List<StoreTransaction> purchases);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;", "", "Lh6/A;", "onConnected", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public interface StateListener {
        void onConnected();
    }

    public BillingAbstract(PurchasesStateProvider purchasesStateProvider) {
        m.e(purchasesStateProvider, "purchasesStateProvider");
        this.purchasesStateProvider = purchasesStateProvider;
    }

    public static void makePurchaseAsync$default(BillingAbstract billingAbstract, Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makePurchaseAsync");
        }
        if ((i3 & 32) != 0) {
            bool = null;
        }
        billingAbstract.makePurchaseAsync(activity, str, purchasingData, replaceProductInfo, presentedOfferingContext, bool);
    }

    public static void startConnection$default(BillingAbstract billingAbstract, long j, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startConnection");
        }
        if ((i3 & 1) != 0) {
            j = 0;
        }
        billingAbstract.startConnection(j);
    }

    public void close() {
        this.purchasesUpdatedListener = null;
        endConnection();
    }

    public abstract void consumeAndSave(boolean finishTransactions, StoreTransaction purchase, boolean shouldConsume, PostReceiptInitiationSource initiationSource);

    public abstract void endConnection();

    public abstract void findPurchaseInPurchaseHistory(String appUserID, ProductType productType, String productId, j onCompletion, j onError);

    public void getAmazonLWAConsentStatus(j onSuccess, j onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        onSuccess.invoke(AmazonLWAConsentStatus.UNAVAILABLE);
    }

    public final PurchasesStateProvider getPurchasesStateProvider() {
        return this.purchasesStateProvider;
    }

    public final synchronized PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return this.purchasesUpdatedListener;
    }

    public final synchronized StateListener getStateListener() {
        return this.stateListener;
    }

    public abstract void getStorefront(j onSuccess, j onError);

    public abstract boolean getConnected();

    public abstract void makePurchaseAsync(Activity activity, String appUserID, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean isPersonalizedPrice);

    public void normalizePurchaseData(String productID, String purchaseToken, String storeUserID, j onSuccess, j onError) {
        m.e(productID, "productID");
        m.e(purchaseToken, "purchaseToken");
        m.e(storeUserID, "storeUserID");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        onSuccess.invoke(productID);
    }

    public abstract void queryAllPurchases(String appUserID, j onReceivePurchaseHistory, j onReceivePurchaseHistoryError);

    public abstract void queryProductDetailsAsync(ProductType productType, Set<String> productIds, j onReceive, j onError);

    public abstract void queryPurchases(String appUserID, j onSuccess, j onError);

    public final void setPurchasesUpdatedListener(PurchasesUpdatedListener purchasesUpdatedListener) {
        this.purchasesUpdatedListener = purchasesUpdatedListener;
    }

    public final synchronized void setStateListener(StateListener stateListener) {
        this.stateListener = stateListener;
    }

    public abstract void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes, Function0 subscriptionStatusChange);

    public abstract void startConnection(long delayMilliseconds);
}
