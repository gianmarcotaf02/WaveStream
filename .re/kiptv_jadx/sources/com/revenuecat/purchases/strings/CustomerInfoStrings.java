package com.revenuecat.purchases.strings;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/strings/CustomerInfoStrings;", "", "()V", "COMPUTING_OFFLINE_CUSTOMER_INFO_FAILED", "", "CUSTOMERINFO_STALE_UPDATING_BACKGROUND", "CUSTOMERINFO_STALE_UPDATING_FOREGROUND", "CUSTOMERINFO_UPDATED_FROM_NETWORK", "CUSTOMERINFO_UPDATED_FROM_SYNCING_PENDING_PURCHASES", "CUSTOMERINFO_UPDATED_NOTIFYING_LISTENER", "ERROR_FETCHING_CUSTOMER_INFO", "INVALIDATING_CUSTOMERINFO_CACHE", "MISSING_CACHED_CUSTOMER_INFO", "NO_CACHED_CUSTOMERINFO", "RETRIEVING_CUSTOMER_INFO", "SENDING_LATEST_CUSTOMERINFO_TO_LISTENER", "VENDING_CACHE", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerInfoStrings {
    public static final java.lang.String COMPUTING_OFFLINE_CUSTOMER_INFO_FAILED = "Error computing offline CustomerInfo. Will return original error. Creation error: %s";
    public static final java.lang.String CUSTOMERINFO_STALE_UPDATING_BACKGROUND = "CustomerInfo cache is stale, updating from network in background.";
    public static final java.lang.String CUSTOMERINFO_STALE_UPDATING_FOREGROUND = "CustomerInfo cache is stale, updating from network in foreground.";
    public static final java.lang.String CUSTOMERINFO_UPDATED_FROM_NETWORK = "CustomerInfo updated from network.";
    public static final java.lang.String CUSTOMERINFO_UPDATED_FROM_SYNCING_PENDING_PURCHASES = "CustomerInfo updated from syncing pending purchases.";
    public static final java.lang.String CUSTOMERINFO_UPDATED_NOTIFYING_LISTENER = "CustomerInfo updated, sending to listener.";
    public static final java.lang.String ERROR_FETCHING_CUSTOMER_INFO = "Error fetching customer data: %s.";
    public static final com.revenuecat.purchases.strings.CustomerInfoStrings INSTANCE = new com.revenuecat.purchases.strings.CustomerInfoStrings();
    public static final java.lang.String INVALIDATING_CUSTOMERINFO_CACHE = "Invalidating CustomerInfo cache.";
    public static final java.lang.String MISSING_CACHED_CUSTOMER_INFO = "Requested a cached CustomerInfo but it's not available.";
    public static final java.lang.String NO_CACHED_CUSTOMERINFO = "No cached CustomerInfo, fetching from network.";
    public static final java.lang.String RETRIEVING_CUSTOMER_INFO = "Retrieving customer info with policy: %s";
    public static final java.lang.String SENDING_LATEST_CUSTOMERINFO_TO_LISTENER = "Sending latest CustomerInfo to listener.";
    public static final java.lang.String VENDING_CACHE = "Vending CustomerInfo from cache.";

    private CustomerInfoStrings() {
    }
}
