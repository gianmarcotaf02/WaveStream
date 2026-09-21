package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/ConnectionErrorReason;", "", "(Ljava/lang/String;I)V", "TIMEOUT", "NO_NETWORK", "OTHER", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum ConnectionErrorReason {
    TIMEOUT,
    NO_NETWORK,
    OTHER;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.networking.ConnectionErrorReason.Companion INSTANCE = new com.revenuecat.purchases.common.networking.ConnectionErrorReason.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/ConnectionErrorReason$Companion;", "", "()V", "fromIOException", "Lcom/revenuecat/purchases/common/networking/ConnectionErrorReason;", "ioException", "Ljava/io/IOException;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final com.revenuecat.purchases.common.networking.ConnectionErrorReason fromIOException(java.io.IOException ioException) {
            kotlin.jvm.internal.m.e(ioException, "ioException");
            if (ioException instanceof java.net.SocketTimeoutException) {
                return com.revenuecat.purchases.common.networking.ConnectionErrorReason.TIMEOUT;
            }
            return ioException instanceof java.net.ConnectException ? true : ioException instanceof java.net.UnknownHostException ? com.revenuecat.purchases.common.networking.ConnectionErrorReason.NO_NETWORK : com.revenuecat.purchases.common.networking.ConnectionErrorReason.OTHER;
        }

        private Companion() {
        }
    }
}
