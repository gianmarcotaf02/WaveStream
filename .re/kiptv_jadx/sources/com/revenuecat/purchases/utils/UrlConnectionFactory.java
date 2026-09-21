package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "", "createConnection", "Lcom/revenuecat/purchases/utils/UrlConnection;", io.sentry.protocol.Request.JsonKeys.URL, "", "requestMethod", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface UrlConnectionFactory {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
    }

    static /* synthetic */ com.revenuecat.purchases.utils.UrlConnection createConnection$default(com.revenuecat.purchases.utils.UrlConnectionFactory urlConnectionFactory, java.lang.String str, java.lang.String str2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConnection");
        }
        if ((i3 & 2) != 0) {
            str2 = "GET";
        }
        return urlConnectionFactory.createConnection(str, str2);
    }

    com.revenuecat.purchases.utils.UrlConnection createConnection(java.lang.String url, java.lang.String requestMethod);
}
