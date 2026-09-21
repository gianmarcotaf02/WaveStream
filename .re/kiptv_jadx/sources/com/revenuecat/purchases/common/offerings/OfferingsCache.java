package com.revenuecat.purchases.common.offerings;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u000fJ\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0013\u0010$\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010'\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/caching/InMemoryCachedObject;", "Lcom/revenuecat/purchases/Offerings;", "offeringsCachedObject", "Lcom/revenuecat/purchases/common/LocaleProvider;", "localeProvider", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/caching/InMemoryCachedObject;Lcom/revenuecat/purchases/common/LocaleProvider;)V", "Lh6/A;", "clearCache", "()V", "offerings", "Lorg/json/JSONObject;", "offeringsResponse", "cacheOfferings", "(Lcom/revenuecat/purchases/Offerings;Lorg/json/JSONObject;)V", "", "appInBackground", "isOfferingsCacheStale", "(Z)Z", "clearInMemoryOfferingsCache", "forceCacheStale", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/DateProvider;", "Lcom/revenuecat/purchases/common/caching/InMemoryCachedObject;", "Lcom/revenuecat/purchases/common/LocaleProvider;", "", "cachedLanguageTags", "Ljava/lang/String;", "getCachedOfferings", "()Lcom/revenuecat/purchases/Offerings;", "cachedOfferings", "getCachedOfferingsResponse", "()Lorg/json/JSONObject;", "cachedOfferingsResponse", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OfferingsCache {
    public static final java.lang.String ORIGINAL_SOURCE_KEY = "rc_original_source";
    private java.lang.String cachedLanguageTags;
    private final com.revenuecat.purchases.common.DateProvider dateProvider;
    private final com.revenuecat.purchases.common.caching.DeviceCache deviceCache;
    private final com.revenuecat.purchases.common.LocaleProvider localeProvider;
    private final com.revenuecat.purchases.common.caching.InMemoryCachedObject<com.revenuecat.purchases.Offerings> offeringsCachedObject;

    public OfferingsCache(com.revenuecat.purchases.common.caching.DeviceCache deviceCache, com.revenuecat.purchases.common.DateProvider dateProvider, com.revenuecat.purchases.common.caching.InMemoryCachedObject<com.revenuecat.purchases.Offerings> offeringsCachedObject, com.revenuecat.purchases.common.LocaleProvider localeProvider) {
        kotlin.jvm.internal.m.e(deviceCache, "deviceCache");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        kotlin.jvm.internal.m.e(offeringsCachedObject, "offeringsCachedObject");
        kotlin.jvm.internal.m.e(localeProvider, "localeProvider");
        this.deviceCache = deviceCache;
        this.dateProvider = dateProvider;
        this.offeringsCachedObject = offeringsCachedObject;
        this.localeProvider = localeProvider;
    }

    public final synchronized void cacheOfferings(com.revenuecat.purchases.Offerings offerings, org.json.JSONObject offeringsResponse) {
        kotlin.jvm.internal.m.e(offerings, "offerings");
        kotlin.jvm.internal.m.e(offeringsResponse, "offeringsResponse");
        org.json.JSONObject jSONObjectCopy = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.copy(offeringsResponse, false);
        jSONObjectCopy.put(ORIGINAL_SOURCE_KEY, offerings.getOriginalSource());
        this.offeringsCachedObject.cacheInstance(offerings);
        this.deviceCache.cacheOfferingsResponse$purchases_defaultsRelease(jSONObjectCopy);
        this.offeringsCachedObject.updateCacheTimestamp(this.dateProvider.getNow());
        char[] charArray = this.localeProvider.getCurrentLocalesLanguageTags().toCharArray();
        kotlin.jvm.internal.m.d(charArray, "toCharArray(...)");
        this.cachedLanguageTags = new java.lang.String(charArray);
    }

    public final synchronized void clearCache() {
        this.offeringsCachedObject.clearCache();
        this.deviceCache.clearOfferingsResponseCache$purchases_defaultsRelease();
        this.cachedLanguageTags = null;
    }

    public final synchronized void clearInMemoryOfferingsCache() {
        this.offeringsCachedObject.clearCache();
        this.cachedLanguageTags = null;
    }

    public final synchronized void forceCacheStale() {
        this.offeringsCachedObject.clearCacheTimestamp();
        this.cachedLanguageTags = null;
    }

    public final synchronized com.revenuecat.purchases.Offerings getCachedOfferings() {
        return this.offeringsCachedObject.getCachedInstance();
    }

    public final synchronized org.json.JSONObject getCachedOfferingsResponse() {
        return this.deviceCache.getOfferingsResponseCache$purchases_defaultsRelease();
    }

    public final synchronized boolean isOfferingsCacheStale(boolean appInBackground) {
        return com.revenuecat.purchases.common.caching.DateExtensionsKt.isCacheStale(this.offeringsCachedObject.getLastUpdatedAt(), appInBackground, this.dateProvider) || !kotlin.jvm.internal.m.a(this.cachedLanguageTags, this.localeProvider.getCurrentLocalesLanguageTags());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OfferingsCache(com.revenuecat.purchases.common.caching.DeviceCache deviceCache, com.revenuecat.purchases.common.DateProvider dateProvider, com.revenuecat.purchases.common.caching.InMemoryCachedObject inMemoryCachedObject, com.revenuecat.purchases.common.LocaleProvider localeProvider, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        dateProvider = (i3 & 2) != 0 ? new com.revenuecat.purchases.common.DefaultDateProvider() : dateProvider;
        this(deviceCache, dateProvider, (i3 & 4) != 0 ? new com.revenuecat.purchases.common.caching.InMemoryCachedObject(null, dateProvider, 1, null) : inMemoryCachedObject, localeProvider);
    }
}
