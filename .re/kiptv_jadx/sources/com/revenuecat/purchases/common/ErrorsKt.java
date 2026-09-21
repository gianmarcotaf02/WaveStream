package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u00060\u0006j\u0002`\u0007H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0002¨\u0006\n"}, d2 = {"toPurchasesError", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/common/BackendErrorCode;", "underlyingErrorMessage", "", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "toPurchasesErrorCode", "Lcom/revenuecat/purchases/PurchasesErrorCode;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ErrorsKt {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.common.BackendErrorCode.values().length];
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendStoreProblem.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendCannotTransferPurchase.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendInvalidReceiptToken.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendInvalidPlayStoreCredentials.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendInvalidAuthToken.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendInvalidAPIKey.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendInvalidPaymentModeOrIntroPriceNotProvided.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendProductIdForGoogleReceiptNotProvided.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendEmptyAppUserId.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendInvalidAppUserId.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendPlayStoreQuotaExceeded.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendPlayStoreInvalidPackageName.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendInvalidPlatform.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendPlayStoreGenericError.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendUserIneligibleForPromoOffer.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendInvalidSubscriberAttributes.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendInvalidSubscriberAttributesBody.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendInvalidAppStoreSharedSecret.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendInvalidAppleSubscriptionKey.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendBadRequest.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendInternalServerError.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendRequestAlreadyInProgress.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendSubscriberAttributesAreBeingUpdated.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendPaymentNotComplete.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendCouldNotCreateAlias.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendProductIDsMalformed.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendInvalidWebRedemptionToken.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendPurchaseBelongsToOtherUser.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr[com.revenuecat.purchases.common.BackendErrorCode.BackendExpiredWebRedemptionToken.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final com.revenuecat.purchases.PurchasesError toPurchasesError(java.lang.Exception exc) {
        java.lang.String localizedMessage;
        kotlin.jvm.internal.m.e(exc, "<this>");
        if (exc instanceof org.json.JSONException ? true : exc instanceof java.io.IOException) {
            return new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.NetworkError, exc.getLocalizedMessage());
        }
        if (exc instanceof java.lang.SecurityException) {
            return new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.InsufficientPermissionsError, ((java.lang.SecurityException) exc).getLocalizedMessage());
        }
        if (exc instanceof com.revenuecat.purchases.common.verification.SignatureVerificationException) {
            return new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.SignatureVerificationError, ((com.revenuecat.purchases.common.verification.SignatureVerificationException) exc).getLocalizedMessage());
        }
        if (!(exc instanceof com.revenuecat.purchases.common.networking.NullPointerReadingErrorStreamException)) {
            return new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.UnknownError, exc.getLocalizedMessage());
        }
        com.revenuecat.purchases.PurchasesErrorCode purchasesErrorCode = com.revenuecat.purchases.PurchasesErrorCode.UnknownError;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("In some devices, there seems to be an error when trying to parse the error response. Original error message: ");
        java.lang.Throwable cause = exc.getCause();
        if (cause == null || (localizedMessage = cause.getLocalizedMessage()) == null) {
            localizedMessage = ((com.revenuecat.purchases.common.networking.NullPointerReadingErrorStreamException) exc).getLocalizedMessage();
        }
        sb.append(localizedMessage);
        return new com.revenuecat.purchases.PurchasesError(purchasesErrorCode, sb.toString());
    }

    private static final com.revenuecat.purchases.PurchasesErrorCode toPurchasesErrorCode(com.revenuecat.purchases.common.BackendErrorCode backendErrorCode) {
        switch (com.revenuecat.purchases.common.ErrorsKt.WhenMappings.$EnumSwitchMapping$0[backendErrorCode.ordinal()]) {
            case 1:
                return com.revenuecat.purchases.PurchasesErrorCode.StoreProblemError;
            case 2:
                return com.revenuecat.purchases.PurchasesErrorCode.ReceiptAlreadyInUseError;
            case 3:
                return com.revenuecat.purchases.PurchasesErrorCode.InvalidReceiptError;
            case 4:
            case 5:
            case 6:
                return com.revenuecat.purchases.PurchasesErrorCode.InvalidCredentialsError;
            case 7:
            case 8:
                return com.revenuecat.purchases.PurchasesErrorCode.PurchaseInvalidError;
            case 9:
            case 10:
                return com.revenuecat.purchases.PurchasesErrorCode.InvalidAppUserIdError;
            case 11:
                return com.revenuecat.purchases.PurchasesErrorCode.StoreProblemError;
            case 12:
            case 13:
                return com.revenuecat.purchases.PurchasesErrorCode.ConfigurationError;
            case 14:
                return com.revenuecat.purchases.PurchasesErrorCode.StoreProblemError;
            case 15:
                return com.revenuecat.purchases.PurchasesErrorCode.IneligibleError;
            case 16:
            case 17:
                return com.revenuecat.purchases.PurchasesErrorCode.InvalidSubscriberAttributesError;
            case 18:
            case 19:
            case 20:
            case 21:
                return com.revenuecat.purchases.PurchasesErrorCode.UnexpectedBackendResponseError;
            case 22:
            case 23:
                return com.revenuecat.purchases.PurchasesErrorCode.OperationAlreadyInProgressError;
            case 24:
                return com.revenuecat.purchases.PurchasesErrorCode.PaymentPendingError;
            case 25:
                return com.revenuecat.purchases.PurchasesErrorCode.ConfigurationError;
            case 26:
                return com.revenuecat.purchases.PurchasesErrorCode.UnsupportedError;
            case 27:
                return com.revenuecat.purchases.PurchasesErrorCode.PurchaseInvalidError;
            case 28:
                return com.revenuecat.purchases.PurchasesErrorCode.ProductAlreadyPurchasedError;
            case 29:
                return com.revenuecat.purchases.PurchasesErrorCode.PurchaseInvalidError;
            default:
                throw new I3.b();
        }
    }

    private static final com.revenuecat.purchases.PurchasesError toPurchasesError(com.revenuecat.purchases.common.BackendErrorCode backendErrorCode, java.lang.String str) {
        return new com.revenuecat.purchases.PurchasesError(toPurchasesErrorCode(backendErrorCode), str);
    }

    public static final com.revenuecat.purchases.PurchasesError toPurchasesError(com.revenuecat.purchases.common.networking.HTTPResult hTTPResult) {
        com.revenuecat.purchases.PurchasesError purchasesError;
        kotlin.jvm.internal.m.e(hTTPResult, "<this>");
        java.lang.Integer backendErrorCode = hTTPResult.getBackendErrorCode();
        java.lang.String backendErrorMessage = hTTPResult.getBackendErrorMessage();
        if (backendErrorMessage == null) {
            backendErrorMessage = "";
        }
        if (backendErrorCode != null) {
            com.revenuecat.purchases.common.BackendErrorCode backendErrorCodeValueOf = com.revenuecat.purchases.common.BackendErrorCode.INSTANCE.valueOf(backendErrorCode.intValue());
            if (backendErrorCodeValueOf != null && (purchasesError = toPurchasesError(backendErrorCodeValueOf, backendErrorMessage)) != null) {
                return purchasesError;
            }
        }
        com.revenuecat.purchases.PurchasesErrorCode purchasesErrorCode = com.revenuecat.purchases.PurchasesErrorCode.UnknownBackendError;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Backend Code: ");
        java.lang.Object obj = backendErrorCode;
        if (backendErrorCode == null) {
            obj = "N/A";
        }
        sb.append(obj);
        sb.append(" - ");
        sb.append(backendErrorMessage);
        return new com.revenuecat.purchases.PurchasesError(purchasesErrorCode, sb.toString());
    }
}
