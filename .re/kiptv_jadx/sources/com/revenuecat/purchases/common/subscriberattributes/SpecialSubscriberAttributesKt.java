package com.revenuecat.purchases.common.subscriberattributes;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"getSubscriberAttributeKey", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SpecialSubscriberAttributesKt {
    public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey getSubscriberAttributeKey(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (str.equals(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.EMAIL.getValue())) {
            return com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.Email.INSTANCE;
        }
        if (str.equals(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.DISPLAY_NAME.getValue())) {
            return com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.DisplayName.INSTANCE;
        }
        if (str.equals(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.PHONE_NUMBER.getValue())) {
            return com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.PhoneNumber.INSTANCE;
        }
        return str.equals(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.FCM_TOKENS.getValue()) ? com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.FCMTokens.INSTANCE : new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.Custom(str);
    }
}
