package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isSuccessful", "", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BackendHelperKt {
    public static final boolean isSuccessful(com.revenuecat.purchases.common.networking.HTTPResult hTTPResult) {
        kotlin.jvm.internal.m.e(hTTPResult, "<this>");
        return hTTPResult.getResponseCode() < 300;
    }
}
