package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00042\u00020\u0001:\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse;", "", "()V", "BillingUnavailable", "Companion", "DeveloperError", "Error", "FeatureNotSupported", "ItemAlreadyOwned", "ItemNotOwned", "ItemUnavailable", "NetworkError", "OK", "ServiceDisconnected", "ServiceUnavailable", "Unknown", "UserCanceled", "Lcom/revenuecat/purchases/google/BillingResponse$BillingUnavailable;", "Lcom/revenuecat/purchases/google/BillingResponse$DeveloperError;", "Lcom/revenuecat/purchases/google/BillingResponse$Error;", "Lcom/revenuecat/purchases/google/BillingResponse$FeatureNotSupported;", "Lcom/revenuecat/purchases/google/BillingResponse$ItemAlreadyOwned;", "Lcom/revenuecat/purchases/google/BillingResponse$ItemNotOwned;", "Lcom/revenuecat/purchases/google/BillingResponse$ItemUnavailable;", "Lcom/revenuecat/purchases/google/BillingResponse$NetworkError;", "Lcom/revenuecat/purchases/google/BillingResponse$OK;", "Lcom/revenuecat/purchases/google/BillingResponse$ServiceDisconnected;", "Lcom/revenuecat/purchases/google/BillingResponse$ServiceUnavailable;", "Lcom/revenuecat/purchases/google/BillingResponse$Unknown;", "Lcom/revenuecat/purchases/google/BillingResponse$UserCanceled;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class BillingResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.google.BillingResponse.Companion INSTANCE = new com.revenuecat.purchases.google.BillingResponse.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse$BillingUnavailable;", "Lcom/revenuecat/purchases/google/BillingResponse;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class BillingUnavailable extends com.revenuecat.purchases.google.BillingResponse {
        public static final com.revenuecat.purchases.google.BillingResponse.BillingUnavailable INSTANCE = new com.revenuecat.purchases.google.BillingResponse.BillingUnavailable();

        private BillingUnavailable() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse$Companion;", "", "()V", "fromCode", "Lcom/revenuecat/purchases/google/BillingResponse;", "code", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final com.revenuecat.purchases.google.BillingResponse fromCode(int code) {
            if (code == 12) {
                return com.revenuecat.purchases.google.BillingResponse.NetworkError.INSTANCE;
            }
            switch (code) {
                case -3:
                    return com.revenuecat.purchases.google.BillingResponse.ServiceUnavailable.INSTANCE;
                case -2:
                    return com.revenuecat.purchases.google.BillingResponse.FeatureNotSupported.INSTANCE;
                case -1:
                    return com.revenuecat.purchases.google.BillingResponse.ServiceDisconnected.INSTANCE;
                case 0:
                    return com.revenuecat.purchases.google.BillingResponse.OK.INSTANCE;
                case 1:
                    return com.revenuecat.purchases.google.BillingResponse.UserCanceled.INSTANCE;
                case 2:
                    return com.revenuecat.purchases.google.BillingResponse.ServiceUnavailable.INSTANCE;
                case 3:
                    return com.revenuecat.purchases.google.BillingResponse.BillingUnavailable.INSTANCE;
                case 4:
                    return com.revenuecat.purchases.google.BillingResponse.ItemUnavailable.INSTANCE;
                case 5:
                    return com.revenuecat.purchases.google.BillingResponse.DeveloperError.INSTANCE;
                case 6:
                    return com.revenuecat.purchases.google.BillingResponse.Error.INSTANCE;
                case 7:
                    return com.revenuecat.purchases.google.BillingResponse.ItemAlreadyOwned.INSTANCE;
                case 8:
                    return com.revenuecat.purchases.google.BillingResponse.ItemNotOwned.INSTANCE;
                default:
                    return com.revenuecat.purchases.google.BillingResponse.Unknown.INSTANCE;
            }
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse$DeveloperError;", "Lcom/revenuecat/purchases/google/BillingResponse;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DeveloperError extends com.revenuecat.purchases.google.BillingResponse {
        public static final com.revenuecat.purchases.google.BillingResponse.DeveloperError INSTANCE = new com.revenuecat.purchases.google.BillingResponse.DeveloperError();

        private DeveloperError() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse$Error;", "Lcom/revenuecat/purchases/google/BillingResponse;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Error extends com.revenuecat.purchases.google.BillingResponse {
        public static final com.revenuecat.purchases.google.BillingResponse.Error INSTANCE = new com.revenuecat.purchases.google.BillingResponse.Error();

        private Error() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse$FeatureNotSupported;", "Lcom/revenuecat/purchases/google/BillingResponse;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class FeatureNotSupported extends com.revenuecat.purchases.google.BillingResponse {
        public static final com.revenuecat.purchases.google.BillingResponse.FeatureNotSupported INSTANCE = new com.revenuecat.purchases.google.BillingResponse.FeatureNotSupported();

        private FeatureNotSupported() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse$ItemAlreadyOwned;", "Lcom/revenuecat/purchases/google/BillingResponse;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ItemAlreadyOwned extends com.revenuecat.purchases.google.BillingResponse {
        public static final com.revenuecat.purchases.google.BillingResponse.ItemAlreadyOwned INSTANCE = new com.revenuecat.purchases.google.BillingResponse.ItemAlreadyOwned();

        private ItemAlreadyOwned() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse$ItemNotOwned;", "Lcom/revenuecat/purchases/google/BillingResponse;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ItemNotOwned extends com.revenuecat.purchases.google.BillingResponse {
        public static final com.revenuecat.purchases.google.BillingResponse.ItemNotOwned INSTANCE = new com.revenuecat.purchases.google.BillingResponse.ItemNotOwned();

        private ItemNotOwned() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse$ItemUnavailable;", "Lcom/revenuecat/purchases/google/BillingResponse;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ItemUnavailable extends com.revenuecat.purchases.google.BillingResponse {
        public static final com.revenuecat.purchases.google.BillingResponse.ItemUnavailable INSTANCE = new com.revenuecat.purchases.google.BillingResponse.ItemUnavailable();

        private ItemUnavailable() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse$NetworkError;", "Lcom/revenuecat/purchases/google/BillingResponse;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class NetworkError extends com.revenuecat.purchases.google.BillingResponse {
        public static final com.revenuecat.purchases.google.BillingResponse.NetworkError INSTANCE = new com.revenuecat.purchases.google.BillingResponse.NetworkError();

        private NetworkError() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse$OK;", "Lcom/revenuecat/purchases/google/BillingResponse;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class OK extends com.revenuecat.purchases.google.BillingResponse {
        public static final com.revenuecat.purchases.google.BillingResponse.OK INSTANCE = new com.revenuecat.purchases.google.BillingResponse.OK();

        private OK() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse$ServiceDisconnected;", "Lcom/revenuecat/purchases/google/BillingResponse;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ServiceDisconnected extends com.revenuecat.purchases.google.BillingResponse {
        public static final com.revenuecat.purchases.google.BillingResponse.ServiceDisconnected INSTANCE = new com.revenuecat.purchases.google.BillingResponse.ServiceDisconnected();

        private ServiceDisconnected() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse$ServiceUnavailable;", "Lcom/revenuecat/purchases/google/BillingResponse;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ServiceUnavailable extends com.revenuecat.purchases.google.BillingResponse {
        public static final com.revenuecat.purchases.google.BillingResponse.ServiceUnavailable INSTANCE = new com.revenuecat.purchases.google.BillingResponse.ServiceUnavailable();

        private ServiceUnavailable() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse$Unknown;", "Lcom/revenuecat/purchases/google/BillingResponse;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Unknown extends com.revenuecat.purchases.google.BillingResponse {
        public static final com.revenuecat.purchases.google.BillingResponse.Unknown INSTANCE = new com.revenuecat.purchases.google.BillingResponse.Unknown();

        private Unknown() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/google/BillingResponse$UserCanceled;", "Lcom/revenuecat/purchases/google/BillingResponse;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class UserCanceled extends com.revenuecat.purchases.google.BillingResponse {
        public static final com.revenuecat.purchases.google.BillingResponse.UserCanceled INSTANCE = new com.revenuecat.purchases.google.BillingResponse.UserCanceled();

        private UserCanceled() {
            super(null);
        }
    }

    public /* synthetic */ BillingResponse(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this();
    }

    private BillingResponse() {
    }
}
