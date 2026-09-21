package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE", "", "billingResponseToPurchasesError", "Lcom/revenuecat/purchases/PurchasesError;", "", "underlyingErrorMessage", "getBillingResponseCodeName", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ErrorsKt {
    public static final java.lang.String IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE = "Google Play In-app Billing API version is less than 3";

    public static final com.revenuecat.purchases.PurchasesError billingResponseToPurchasesError(int i3, java.lang.String underlyingErrorMessage) {
        com.revenuecat.purchases.PurchasesErrorCode purchasesErrorCode;
        kotlin.jvm.internal.m.e(underlyingErrorMessage, "underlyingErrorMessage");
        if (i3 != 12) {
            switch (i3) {
                case -3:
                case -1:
                case 2:
                case 6:
                    purchasesErrorCode = com.revenuecat.purchases.PurchasesErrorCode.StoreProblemError;
                    break;
                case -2:
                case 3:
                case 8:
                    purchasesErrorCode = com.revenuecat.purchases.PurchasesErrorCode.PurchaseNotAllowedError;
                    break;
                case 0:
                    purchasesErrorCode = com.revenuecat.purchases.PurchasesErrorCode.UnknownError;
                    break;
                case 1:
                    purchasesErrorCode = com.revenuecat.purchases.PurchasesErrorCode.PurchaseCancelledError;
                    break;
                case 4:
                    purchasesErrorCode = com.revenuecat.purchases.PurchasesErrorCode.ProductNotAvailableForPurchaseError;
                    break;
                case 5:
                    purchasesErrorCode = com.revenuecat.purchases.PurchasesErrorCode.PurchaseInvalidError;
                    break;
                case 7:
                    purchasesErrorCode = com.revenuecat.purchases.PurchasesErrorCode.ProductAlreadyPurchasedError;
                    break;
                default:
                    purchasesErrorCode = com.revenuecat.purchases.PurchasesErrorCode.UnknownError;
                    break;
            }
        } else {
            purchasesErrorCode = com.revenuecat.purchases.PurchasesErrorCode.NetworkError;
        }
        return new com.revenuecat.purchases.PurchasesError(purchasesErrorCode, underlyingErrorMessage);
    }

    public static final java.lang.String getBillingResponseCodeName(int i3) {
        if (i3 == 12) {
            return "NETWORK_ERROR";
        }
        switch (i3) {
            case -3:
                return "SERVICE_TIMEOUT";
            case -2:
                return "FEATURE_NOT_SUPPORTED";
            case -1:
                return "SERVICE_DISCONNECTED";
            case 0:
                return "OK";
            case 1:
                return "USER_CANCELED";
            case 2:
                return "SERVICE_UNAVAILABLE";
            case 3:
                return "BILLING_UNAVAILABLE";
            case 4:
                return "ITEM_UNAVAILABLE";
            case 5:
                return "DEVELOPER_ERROR";
            case 6:
                return "ERROR";
            case 7:
                return "ITEM_ALREADY_OWNED";
            case 8:
                return "ITEM_NOT_OWNED";
            default:
                return "UNKNOWN_BILLING_RESPONSE_CODE (" + i3 + ')';
        }
    }
}
