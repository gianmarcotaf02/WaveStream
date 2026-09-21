package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ForceServerErrorStrategy;", "", "serverErrorURL", "", "getServerErrorURL", "()Ljava/lang/String;", "fakeResponseWithoutPerformingRequest", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "baseURL", "Ljava/net/URL;", "endpoint", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "shouldForceServerError", "", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface ForceServerErrorStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.ForceServerErrorStrategy.Companion INSTANCE = com.revenuecat.purchases.ForceServerErrorStrategy.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ForceServerErrorStrategy$Companion;", "", "()V", "doNotFail", "Lcom/revenuecat/purchases/ForceServerErrorStrategy;", "getDoNotFail", "()Lcom/revenuecat/purchases/ForceServerErrorStrategy;", "failAll", "getFailAll", "failExceptFallbackUrls", "getFailExceptFallbackUrls", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ com.revenuecat.purchases.ForceServerErrorStrategy.Companion $$INSTANCE = new com.revenuecat.purchases.ForceServerErrorStrategy.Companion();
        private static final com.revenuecat.purchases.ForceServerErrorStrategy doNotFail;
        private static final com.revenuecat.purchases.ForceServerErrorStrategy failAll;
        private static final com.revenuecat.purchases.ForceServerErrorStrategy failExceptFallbackUrls;

        static {
            final int i3 = 0;
            doNotFail = new com.revenuecat.purchases.ForceServerErrorStrategy() { // from class: com.revenuecat.purchases.b
                @Override // com.revenuecat.purchases.ForceServerErrorStrategy
                public final boolean shouldForceServerError(java.net.URL url, com.revenuecat.purchases.common.networking.Endpoint endpoint) {
                    switch (i3) {
                        case 0:
                            return com.revenuecat.purchases.ForceServerErrorStrategy.Companion.doNotFail$lambda$0(url, endpoint);
                        case 1:
                            return com.revenuecat.purchases.ForceServerErrorStrategy.Companion.failAll$lambda$1(url, endpoint);
                        default:
                            return com.revenuecat.purchases.ForceServerErrorStrategy.Companion.failExceptFallbackUrls$lambda$2(url, endpoint);
                    }
                }
            };
            final int i9 = 1;
            failAll = new com.revenuecat.purchases.ForceServerErrorStrategy() { // from class: com.revenuecat.purchases.b
                @Override // com.revenuecat.purchases.ForceServerErrorStrategy
                public final boolean shouldForceServerError(java.net.URL url, com.revenuecat.purchases.common.networking.Endpoint endpoint) {
                    switch (i9) {
                        case 0:
                            return com.revenuecat.purchases.ForceServerErrorStrategy.Companion.doNotFail$lambda$0(url, endpoint);
                        case 1:
                            return com.revenuecat.purchases.ForceServerErrorStrategy.Companion.failAll$lambda$1(url, endpoint);
                        default:
                            return com.revenuecat.purchases.ForceServerErrorStrategy.Companion.failExceptFallbackUrls$lambda$2(url, endpoint);
                    }
                }
            };
            final int i10 = 2;
            failExceptFallbackUrls = new com.revenuecat.purchases.ForceServerErrorStrategy() { // from class: com.revenuecat.purchases.b
                @Override // com.revenuecat.purchases.ForceServerErrorStrategy
                public final boolean shouldForceServerError(java.net.URL url, com.revenuecat.purchases.common.networking.Endpoint endpoint) {
                    switch (i10) {
                        case 0:
                            return com.revenuecat.purchases.ForceServerErrorStrategy.Companion.doNotFail$lambda$0(url, endpoint);
                        case 1:
                            return com.revenuecat.purchases.ForceServerErrorStrategy.Companion.failAll$lambda$1(url, endpoint);
                        default:
                            return com.revenuecat.purchases.ForceServerErrorStrategy.Companion.failExceptFallbackUrls$lambda$2(url, endpoint);
                    }
                }
            };
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean doNotFail$lambda$0(java.net.URL url, com.revenuecat.purchases.common.networking.Endpoint endpoint) {
            kotlin.jvm.internal.m.e(url, "<anonymous parameter 0>");
            kotlin.jvm.internal.m.e(endpoint, "<anonymous parameter 1>");
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean failAll$lambda$1(java.net.URL url, com.revenuecat.purchases.common.networking.Endpoint endpoint) {
            kotlin.jvm.internal.m.e(url, "<anonymous parameter 0>");
            kotlin.jvm.internal.m.e(endpoint, "<anonymous parameter 1>");
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean failExceptFallbackUrls$lambda$2(java.net.URL baseURL, com.revenuecat.purchases.common.networking.Endpoint endpoint) {
            kotlin.jvm.internal.m.e(baseURL, "baseURL");
            kotlin.jvm.internal.m.e(endpoint, "<anonymous parameter 1>");
            return !kotlin.jvm.internal.m.a(baseURL.toString(), com.revenuecat.purchases.common.AppConfig.INSTANCE.getFallbackURL().toString());
        }

        public final com.revenuecat.purchases.ForceServerErrorStrategy getDoNotFail() {
            return doNotFail;
        }

        public final com.revenuecat.purchases.ForceServerErrorStrategy getFailAll() {
            return failAll;
        }

        public final com.revenuecat.purchases.ForceServerErrorStrategy getFailExceptFallbackUrls() {
            return failExceptFallbackUrls;
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static com.revenuecat.purchases.common.networking.HTTPResult fakeResponseWithoutPerformingRequest(com.revenuecat.purchases.ForceServerErrorStrategy forceServerErrorStrategy, java.net.URL baseURL, com.revenuecat.purchases.common.networking.Endpoint endpoint) {
            kotlin.jvm.internal.m.e(baseURL, "baseURL");
            kotlin.jvm.internal.m.e(endpoint, "endpoint");
            return com.revenuecat.purchases.ForceServerErrorStrategy.super.fakeResponseWithoutPerformingRequest(baseURL, endpoint);
        }

        @java.lang.Deprecated
        public static java.lang.String getServerErrorURL(com.revenuecat.purchases.ForceServerErrorStrategy forceServerErrorStrategy) {
            return com.revenuecat.purchases.ForceServerErrorStrategy.super.getServerErrorURL();
        }
    }

    default com.revenuecat.purchases.common.networking.HTTPResult fakeResponseWithoutPerformingRequest(java.net.URL baseURL, com.revenuecat.purchases.common.networking.Endpoint endpoint) {
        kotlin.jvm.internal.m.e(baseURL, "baseURL");
        kotlin.jvm.internal.m.e(endpoint, "endpoint");
        return null;
    }

    default java.lang.String getServerErrorURL() {
        return "https://api.revenuecat.com/force-server-failure";
    }

    boolean shouldForceServerError(java.net.URL baseURL, com.revenuecat.purchases.common.networking.Endpoint endpoint);
}
