package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/utils/DefaultUrlConnectionFactory;", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "()V", "createConnection", "Lcom/revenuecat/purchases/utils/UrlConnection;", io.sentry.protocol.Request.JsonKeys.URL, "", "requestMethod", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultUrlConnectionFactory implements com.revenuecat.purchases.utils.UrlConnectionFactory {
    @Override // com.revenuecat.purchases.utils.UrlConnectionFactory
    public com.revenuecat.purchases.utils.UrlConnection createConnection(java.lang.String url, java.lang.String requestMethod) throws java.io.IOException {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(requestMethod, "requestMethod");
        java.net.URLConnection uRLConnectionOpenConnection = new java.net.URL(url).openConnection();
        kotlin.jvm.internal.m.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setRequestMethod(requestMethod);
        httpURLConnection.setDoInput(true);
        return new com.revenuecat.purchases.utils.DefaultUrlConnection(httpURLConnection);
    }
}
