package com.revenuecat.purchases.customercenter;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "", "Lcom/revenuecat/purchases/customercenter/Resumable;", "resume", "Lh6/A;", "onRestoreInitiated", "(Lcom/revenuecat/purchases/customercenter/Resumable;)V", "onRestoreStarted", "()V", "Lcom/revenuecat/purchases/PurchasesError;", "error", "onRestoreFailed", "(Lcom/revenuecat/purchases/PurchasesError;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "onRestoreCompleted", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "onShowingManageSubscriptions", "", "feedbackSurveyOptionId", "onFeedbackSurveyCompleted", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;", "action", "onManagementOptionSelected", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;)V", "actionIdentifier", "purchaseIdentifier", "onCustomActionSelected", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transaction", "onPromotionalOfferSucceeded", "(Lcom/revenuecat/purchases/CustomerInfo;Lcom/revenuecat/purchases/models/StoreTransaction;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface CustomerCenterListener {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void onCustomActionSelected(com.revenuecat.purchases.customercenter.CustomerCenterListener customerCenterListener, java.lang.String actionIdentifier, java.lang.String str) {
            kotlin.jvm.internal.m.e(actionIdentifier, "actionIdentifier");
            com.revenuecat.purchases.customercenter.CustomerCenterListener.super.onCustomActionSelected(actionIdentifier, str);
        }

        @java.lang.Deprecated
        public static void onFeedbackSurveyCompleted(com.revenuecat.purchases.customercenter.CustomerCenterListener customerCenterListener, java.lang.String feedbackSurveyOptionId) {
            kotlin.jvm.internal.m.e(feedbackSurveyOptionId, "feedbackSurveyOptionId");
            com.revenuecat.purchases.customercenter.CustomerCenterListener.super.onFeedbackSurveyCompleted(feedbackSurveyOptionId);
        }

        @java.lang.Deprecated
        public static void onManagementOptionSelected(com.revenuecat.purchases.customercenter.CustomerCenterListener customerCenterListener, com.revenuecat.purchases.customercenter.CustomerCenterManagementOption action) {
            kotlin.jvm.internal.m.e(action, "action");
            com.revenuecat.purchases.customercenter.CustomerCenterListener.super.onManagementOptionSelected(action);
        }

        @java.lang.Deprecated
        public static void onPromotionalOfferSucceeded(com.revenuecat.purchases.customercenter.CustomerCenterListener customerCenterListener, com.revenuecat.purchases.CustomerInfo customerInfo, com.revenuecat.purchases.models.StoreTransaction transaction) {
            kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
            kotlin.jvm.internal.m.e(transaction, "transaction");
            com.revenuecat.purchases.customercenter.CustomerCenterListener.super.onPromotionalOfferSucceeded(customerInfo, transaction);
        }

        @java.lang.Deprecated
        public static void onRestoreCompleted(com.revenuecat.purchases.customercenter.CustomerCenterListener customerCenterListener, com.revenuecat.purchases.CustomerInfo customerInfo) {
            kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
            com.revenuecat.purchases.customercenter.CustomerCenterListener.super.onRestoreCompleted(customerInfo);
        }

        @java.lang.Deprecated
        public static void onRestoreFailed(com.revenuecat.purchases.customercenter.CustomerCenterListener customerCenterListener, com.revenuecat.purchases.PurchasesError error) {
            kotlin.jvm.internal.m.e(error, "error");
            com.revenuecat.purchases.customercenter.CustomerCenterListener.super.onRestoreFailed(error);
        }

        @java.lang.Deprecated
        public static void onRestoreInitiated(com.revenuecat.purchases.customercenter.CustomerCenterListener customerCenterListener, com.revenuecat.purchases.customercenter.Resumable resume) {
            kotlin.jvm.internal.m.e(resume, "resume");
            com.revenuecat.purchases.customercenter.CustomerCenterListener.super.onRestoreInitiated(resume);
        }

        @java.lang.Deprecated
        public static void onRestoreStarted(com.revenuecat.purchases.customercenter.CustomerCenterListener customerCenterListener) {
            com.revenuecat.purchases.customercenter.CustomerCenterListener.super.onRestoreStarted();
        }

        @java.lang.Deprecated
        public static void onShowingManageSubscriptions(com.revenuecat.purchases.customercenter.CustomerCenterListener customerCenterListener) {
            com.revenuecat.purchases.customercenter.CustomerCenterListener.super.onShowingManageSubscriptions();
        }
    }

    default void onCustomActionSelected(java.lang.String actionIdentifier, java.lang.String purchaseIdentifier) {
        kotlin.jvm.internal.m.e(actionIdentifier, "actionIdentifier");
    }

    default void onFeedbackSurveyCompleted(java.lang.String feedbackSurveyOptionId) {
        kotlin.jvm.internal.m.e(feedbackSurveyOptionId, "feedbackSurveyOptionId");
    }

    default void onManagementOptionSelected(com.revenuecat.purchases.customercenter.CustomerCenterManagementOption action) {
        kotlin.jvm.internal.m.e(action, "action");
    }

    default void onPromotionalOfferSucceeded(com.revenuecat.purchases.CustomerInfo customerInfo, com.revenuecat.purchases.models.StoreTransaction transaction) {
        kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
        kotlin.jvm.internal.m.e(transaction, "transaction");
    }

    default void onRestoreCompleted(com.revenuecat.purchases.CustomerInfo customerInfo) {
        kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
    }

    default void onRestoreFailed(com.revenuecat.purchases.PurchasesError error) {
        kotlin.jvm.internal.m.e(error, "error");
    }

    default void onRestoreInitiated(com.revenuecat.purchases.customercenter.Resumable resume) {
        kotlin.jvm.internal.m.e(resume, "resume");
        com.revenuecat.purchases.customercenter.Resumable.invoke$default(resume, false, 1, null);
    }

    default void onRestoreStarted() {
    }

    default void onShowingManageSubscriptions() {
    }
}
