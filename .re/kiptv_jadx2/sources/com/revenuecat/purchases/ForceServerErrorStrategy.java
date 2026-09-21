package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ForceServerErrorStrategy;", "", "serverErrorURL", "", "getServerErrorURL", "()Ljava/lang/String;", "fakeResponseWithoutPerformingRequest", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "baseURL", "Ljava/net/URL;", "endpoint", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "shouldForceServerError", "", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface ForceServerErrorStrategy {

    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ForceServerErrorStrategy$Companion;", "", "()V", "doNotFail", "Lcom/revenuecat/purchases/ForceServerErrorStrategy;", "getDoNotFail", "()Lcom/revenuecat/purchases/ForceServerErrorStrategy;", "failAll", "getFailAll", "failExceptFallbackUrls", "getFailExceptFallbackUrls", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();
        private static final ForceServerErrorStrategy doNotFail;
        private static final ForceServerErrorStrategy failAll;
        private static final ForceServerErrorStrategy failExceptFallbackUrls;

        static {
            final int i3 = 0;
            doNotFail = new ForceServerErrorStrategy() {
                @Override
                public final boolean shouldForceServerError(URL url, Endpoint endpoint) {
                    switch (i3) {
                        case 0:
                            return ForceServerErrorStrategy.Companion.doNotFail$lambda$0(url, endpoint);
                        case 1:
                            return ForceServerErrorStrategy.Companion.failAll$lambda$1(url, endpoint);
                        default:
                            return ForceServerErrorStrategy.Companion.failExceptFallbackUrls$lambda$2(url, endpoint);
                    }
                }
            };
            final int i9 = 1;
            failAll = new ForceServerErrorStrategy() {
                @Override
                public final boolean shouldForceServerError(URL url, Endpoint endpoint) {
                    switch (i9) {
                        case 0:
                            return ForceServerErrorStrategy.Companion.doNotFail$lambda$0(url, endpoint);
                        case 1:
                            return ForceServerErrorStrategy.Companion.failAll$lambda$1(url, endpoint);
                        default:
                            return ForceServerErrorStrategy.Companion.failExceptFallbackUrls$lambda$2(url, endpoint);
                    }
                }
            };
            final int i10 = 2;
            failExceptFallbackUrls = new ForceServerErrorStrategy() {
                @Override
                public final boolean shouldForceServerError(URL url, Endpoint endpoint) {
                    switch (i10) {
                        case 0:
                            return ForceServerErrorStrategy.Companion.doNotFail$lambda$0(url, endpoint);
                        case 1:
                            return ForceServerErrorStrategy.Companion.failAll$lambda$1(url, endpoint);
                        default:
                            return ForceServerErrorStrategy.Companion.failExceptFallbackUrls$lambda$2(url, endpoint);
                    }
                }
            };
        }

        private Companion() {
        }

        public static final boolean doNotFail$lambda$0(URL url, Endpoint endpoint) {
            m.e(url, "<anonymous parameter 0>");
            m.e(endpoint, "<anonymous parameter 1>");
            return false;
        }

        public static final boolean failAll$lambda$1(URL url, Endpoint endpoint) {
            m.e(url, "<anonymous parameter 0>");
            m.e(endpoint, "<anonymous parameter 1>");
            return true;
        }

        public static final boolean failExceptFallbackUrls$lambda$2(URL baseURL, Endpoint endpoint) {
            m.e(baseURL, "baseURL");
            m.e(endpoint, "<anonymous parameter 1>");
            return !m.a(baseURL.toString(), AppConfig.INSTANCE.getFallbackURL().toString());
        }

        public final ForceServerErrorStrategy getDoNotFail() {
            return doNotFail;
        }

        public final ForceServerErrorStrategy getFailAll() {
            return failAll;
        }

        public final ForceServerErrorStrategy getFailExceptFallbackUrls() {
            return failExceptFallbackUrls;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @Deprecated
        public static HTTPResult fakeResponseWithoutPerformingRequest(ForceServerErrorStrategy forceServerErrorStrategy, URL baseURL, Endpoint endpoint) {
            m.e(baseURL, "baseURL");
            m.e(endpoint, "endpoint");
            return ForceServerErrorStrategy.super.fakeResponseWithoutPerformingRequest(baseURL, endpoint);
        }

        @Deprecated
        public static String getServerErrorURL(ForceServerErrorStrategy forceServerErrorStrategy) {
            return ForceServerErrorStrategy.super.getServerErrorURL();
        }
    }

    default HTTPResult fakeResponseWithoutPerformingRequest(URL baseURL, Endpoint endpoint) {
        m.e(baseURL, "baseURL");
        m.e(endpoint, "endpoint");
        return null;
    }

    default String getServerErrorURL() {
        return "https://api.revenuecat.com/force-server-failure";
    }

    boolean shouldForceServerError(URL baseURL, Endpoint endpoint);
}
