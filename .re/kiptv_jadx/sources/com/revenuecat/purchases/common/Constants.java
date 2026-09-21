package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/Constants;", "", "()V", "AMAZON_STORE_MANAGEMENT_URL", "", "GALAXY_STORE_MANAGEMENT_URL", "GOOGLE_PLAY_MANAGEMENT_URL", "SUBS_ID_BASE_PLAN_ID_SEPARATOR", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Constants {
    public static final java.lang.String AMAZON_STORE_MANAGEMENT_URL = "amzn://apps/library/subscriptions";
    public static final java.lang.String GALAXY_STORE_MANAGEMENT_URL = "samsungapps://SubscriptionList/";
    public static final java.lang.String GOOGLE_PLAY_MANAGEMENT_URL = "https://play.google.com/store/account/subscriptions";
    public static final com.revenuecat.purchases.common.Constants INSTANCE = new com.revenuecat.purchases.common.Constants();
    public static final java.lang.String SUBS_ID_BASE_PLAN_ID_SEPARATOR = ":";

    private Constants() {
    }
}
