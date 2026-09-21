package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"backendName", "", "Lcom/revenuecat/purchases/ReplacementMode;", "getBackendName$annotations", "(Lcom/revenuecat/purchases/ReplacementMode;)V", "getBackendName", "(Lcom/revenuecat/purchases/ReplacementMode;)Ljava/lang/String;", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReplacementModeKt {
    public static final java.lang.String backendName(com.revenuecat.purchases.ReplacementMode replacementMode, com.revenuecat.purchases.Store store) {
        kotlin.jvm.internal.m.e(replacementMode, "<this>");
        kotlin.jvm.internal.m.e(store, "store");
        com.revenuecat.purchases.models.StoreReplacementMode storeReplacementModeOrNull = com.revenuecat.purchases.models.StoreReplacementModeConversionsKt.toStoreReplacementModeOrNull(replacementMode);
        if (storeReplacementModeOrNull != null) {
            return com.revenuecat.purchases.models.StoreReplacementModeConversionsKt.storeBackendName(storeReplacementModeOrNull, store);
        }
        return null;
    }

    public static final java.lang.String getBackendName(com.revenuecat.purchases.ReplacementMode replacementMode) {
        kotlin.jvm.internal.m.e(replacementMode, "<this>");
        if (replacementMode instanceof com.revenuecat.purchases.models.GoogleReplacementMode) {
            return com.revenuecat.purchases.models.StoreReplacementModeConversionsKt.legacyPlayBackendName(com.revenuecat.purchases.models.StoreReplacementModeConversionsKt.toStoreReplacementMode((com.revenuecat.purchases.models.GoogleReplacementMode) replacementMode));
        }
        return replacementMode instanceof com.revenuecat.purchases.models.StoreReplacementMode ? com.revenuecat.purchases.models.StoreReplacementModeConversionsKt.legacyPlayBackendName((com.revenuecat.purchases.models.StoreReplacementMode) replacementMode) : replacementMode.getName();
    }

    @p070h6.c
    public static /* synthetic */ void getBackendName$annotations(com.revenuecat.purchases.ReplacementMode replacementMode) {
    }
}
