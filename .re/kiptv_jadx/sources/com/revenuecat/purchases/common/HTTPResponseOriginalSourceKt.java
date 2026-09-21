package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"originalDataSource", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "getOriginalDataSource$annotations", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)V", "getOriginalDataSource", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HTTPResponseOriginalSourceKt {
    public static final com.revenuecat.purchases.common.HTTPResponseOriginalSource getOriginalDataSource(com.revenuecat.purchases.common.networking.HTTPResult hTTPResult) {
        kotlin.jvm.internal.m.e(hTTPResult, "<this>");
        if (hTTPResult.isLoadShedderResponse() && hTTPResult.isFallbackURL()) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Request to fallback URL was handled by load shedder, which should never happen. Defaulting to fallback source.", null);
        }
        if (hTTPResult.isFallbackURL()) {
            return com.revenuecat.purchases.common.HTTPResponseOriginalSource.FALLBACK;
        }
        return hTTPResult.isLoadShedderResponse() ? com.revenuecat.purchases.common.HTTPResponseOriginalSource.LOAD_SHEDDER : com.revenuecat.purchases.common.HTTPResponseOriginalSource.MAIN;
    }

    public static /* synthetic */ void getOriginalDataSource$annotations(com.revenuecat.purchases.common.networking.HTTPResult hTTPResult) {
    }
}
