package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/utils/DefaultUrlConnection;", "Lcom/revenuecat/purchases/utils/UrlConnection;", "Ljava/net/HttpURLConnection;", "connection", "<init>", "(Ljava/net/HttpURLConnection;)V", "Lh6/A;", "disconnect", "()V", "Ljava/net/HttpURLConnection;", "", "getResponseCode", "()I", "responseCode", "Ljava/io/InputStream;", "getInputStream", "()Ljava/io/InputStream;", "inputStream", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class DefaultUrlConnection implements com.revenuecat.purchases.utils.UrlConnection {
    private final java.net.HttpURLConnection connection;

    public DefaultUrlConnection(java.net.HttpURLConnection connection) {
        kotlin.jvm.internal.m.e(connection, "connection");
        this.connection = connection;
    }

    @Override // com.revenuecat.purchases.utils.UrlConnection
    public void disconnect() {
        this.connection.disconnect();
    }

    @Override // com.revenuecat.purchases.utils.UrlConnection
    public java.io.InputStream getInputStream() throws java.io.IOException {
        java.io.InputStream inputStream = this.connection.getInputStream();
        kotlin.jvm.internal.m.d(inputStream, "connection.inputStream");
        return inputStream;
    }

    @Override // com.revenuecat.purchases.utils.UrlConnection
    public int getResponseCode() {
        return this.connection.getResponseCode();
    }
}
