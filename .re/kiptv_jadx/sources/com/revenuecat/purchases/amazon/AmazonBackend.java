package com.revenuecat.purchases.amazon;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R²\u0001\u0010\u0019\u001aF\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u0014\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t0\u0016j\u0002`\u00170\u00150\u00122J\u0010\u0018\u001aF\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u0014\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t0\u0016j\u0002`\u00170\u00150\u00128F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonBackend;", "", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "<init>", "(Lcom/revenuecat/purchases/common/BackendHelper;)V", "", "receiptId", "storeUserID", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "Lh6/A;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getAmazonReceiptData", "(Ljava/lang/String;Ljava/lang/String;Lx6/j;Lx6/j;)V", "Lcom/revenuecat/purchases/common/BackendHelper;", "", "", "Lcom/revenuecat/purchases/amazon/CallbackCacheKey;", "", "Lh6/k;", "Lcom/revenuecat/purchases/amazon/PostAmazonReceiptCallback;", "<set-?>", "postAmazonReceiptCallbacks", "Ljava/util/Map;", "getPostAmazonReceiptCallbacks", "()Ljava/util/Map;", "setPostAmazonReceiptCallbacks", "(Ljava/util/Map;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AmazonBackend {
    private final com.revenuecat.purchases.common.BackendHelper backendHelper;
    private volatile java.util.Map<java.util.List<java.lang.String>, java.util.List<p070h6.k>> postAmazonReceiptCallbacks;

    public AmazonBackend(com.revenuecat.purchases.common.BackendHelper backendHelper) {
        kotlin.jvm.internal.m.e(backendHelper, "backendHelper");
        this.backendHelper = backendHelper;
        this.postAmazonReceiptCallbacks = new java.util.LinkedHashMap();
    }

    public final void getAmazonReceiptData(java.lang.String receiptId, java.lang.String storeUserID, p194x6.j onSuccess, p194x6.j onError) {
        kotlin.jvm.internal.m.e(receiptId, "receiptId");
        kotlin.jvm.internal.m.e(storeUserID, "storeUserID");
        kotlin.jvm.internal.m.e(onSuccess, "onSuccess");
        kotlin.jvm.internal.m.e(onError, "onError");
        java.util.List<java.lang.String> listL0 = p078i6.m.l0(new java.lang.String[]{receiptId, storeUserID});
        com.revenuecat.purchases.amazon.AmazonBackend$getAmazonReceiptData$call$1 amazonBackend$getAmazonReceiptData$call$1 = new com.revenuecat.purchases.amazon.AmazonBackend$getAmazonReceiptData$call$1(this, storeUserID, receiptId, listL0);
        p070h6.k kVar = new p070h6.k(onSuccess, onError);
        synchronized (this) {
            try {
                if (this.postAmazonReceiptCallbacks.containsKey(listL0)) {
                    java.util.List<p070h6.k> list = this.postAmazonReceiptCallbacks.get(listL0);
                    kotlin.jvm.internal.m.b(list);
                    list.add(kVar);
                } else {
                    this.postAmazonReceiptCallbacks.put(listL0, p078i6.p.D0(kVar));
                    amazonBackend$getAmazonReceiptData$call$1.invoke();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized java.util.Map<java.util.List<java.lang.String>, java.util.List<p070h6.k>> getPostAmazonReceiptCallbacks() {
        return this.postAmazonReceiptCallbacks;
    }

    public final synchronized void setPostAmazonReceiptCallbacks(java.util.Map<java.util.List<java.lang.String>, java.util.List<p070h6.k>> map) {
        kotlin.jvm.internal.m.e(map, "<set-?>");
        this.postAmazonReceiptCallbacks = map;
    }
}
