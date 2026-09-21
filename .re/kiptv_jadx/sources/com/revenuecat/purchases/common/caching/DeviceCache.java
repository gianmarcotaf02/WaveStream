package com.revenuecat.purchases.common.caching;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b:\b\u0017\u0018\u0000 Ó\u00012\u00020\u0001:\u0002Ó\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010$\u001a\u0004\u0018\u00010!2\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010%\u001a\u00020!H\u0000¢\u0006\u0004\b&\u0010'J\u001f\u0010-\u001a\u00020)2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b.\u0010\u0016J\u0017\u00101\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b0\u0010\u0016J\u001f\u00101\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u00102\u001a\u00020\nH\u0000¢\u0006\u0004\b0\u00103J\u0017\u00105\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b4\u0010\u0016J\u001f\u0010:\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b8\u00109J\u0017\u0010=\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u0004H\u0000¢\u0006\u0004\b<\u0010\u0016J\u0011\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b>\u0010\u000fJ\u0017\u0010@\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\b?\u0010\u001dJ\u0017\u0010B\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\bA\u0010\u001dJ\u0019\u0010F\u001a\u0004\u0018\u00010C2\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\bD\u0010EJ\u001f\u0010J\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010G\u001a\u00020CH\u0000¢\u0006\u0004\bH\u0010IJ\u001f\u0010L\u001a\u00020)2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\bK\u0010,J\u0017\u0010N\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\bM\u0010\u0016J\u001f\u0010N\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u00102\u001a\u00020\nH\u0000¢\u0006\u0004\bM\u00103J\u000f\u0010Q\u001a\u00020\u0014H\u0000¢\u0006\u0004\bO\u0010PJ\u0015\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00040RH\u0000¢\u0006\u0004\bS\u0010TJ#\u0010X\u001a\u00020\u00142\u0006\u0010V\u001a\u00020\u00042\n\b\u0002\u0010W\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\bX\u0010YJ\u001d\u0010]\u001a\u00020\u00142\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00040RH\u0000¢\u0006\u0004\b[\u0010\\J)\u0010c\u001a\b\u0012\u0004\u0012\u00020_0`2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020_0^H\u0000¢\u0006\u0004\ba\u0010bJ)\u0010e\u001a\b\u0012\u0004\u0012\u00020_0`2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020_0^H\u0000¢\u0006\u0004\bd\u0010bJ#\u0010h\u001a\u00020\u00142\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020_0^H\u0000¢\u0006\u0004\bf\u0010gJ\u0011\u0010l\u001a\u0004\u0018\u00010iH\u0000¢\u0006\u0004\bj\u0010kJ\u0017\u0010p\u001a\u00020\u00142\u0006\u0010m\u001a\u00020iH\u0000¢\u0006\u0004\bn\u0010oJ\u000f\u0010r\u001a\u00020\u0014H\u0000¢\u0006\u0004\bq\u0010PJ\u0017\u0010w\u001a\u00020\u00142\u0006\u0010t\u001a\u00020sH\u0000¢\u0006\u0004\bu\u0010vJ\u000f\u0010y\u001a\u00020\u0014H\u0001¢\u0006\u0004\bx\u0010PJ\u000f\u0010|\u001a\u00020)H\u0000¢\u0006\u0004\bz\u0010{J\u0011\u0010\u007f\u001a\u0004\u0018\u00010sH\u0000¢\u0006\u0004\b}\u0010~J\u001d\u0010\u0083\u0001\u001a\u0004\u0018\u00010i2\u0007\u0010\u0080\u0001\u001a\u00020\u0004H\u0010¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J$\u0010\u0088\u0001\u001a\u00020\u00142\u0007\u0010\u0084\u0001\u001a\u00020\u00042\u0007\u0010\u0085\u0001\u001a\u00020\u0004H\u0010¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u008a\u0001\u001a\u00020\u00142\u0007\u0010\u0084\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0005\b\u0089\u0001\u0010\u0016J!\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040R2\u0007\u0010\u0084\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001a\u0010\u008f\u0001\u001a\u00020\u00042\u0007\u0010\u0080\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0005\b\u008e\u0001\u0010\u001dJ\u0016\u0010\u0090\u0001\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0016\u0010\u0092\u0001\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J\u001c\u0010/\u001a\u00020\n*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0005\b/\u0010\u0093\u0001J\u001a\u0010\u0094\u0001\u001a\u0002062\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0019\u0010\u0096\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0005\b\u0096\u0001\u0010\u0016J!\u0010\u0097\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0005\b\u0097\u0001\u00109J\u001a\u0010\u0098\u0001\u001a\u0002062\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0095\u0001J\u001e\u0010\u0099\u0001\u001a\u00020\n*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u0093\u0001J\u001c\u0010N\u001a\u00020\n*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0005\bN\u0010\u0093\u0001J\u001f\u0010\u009b\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u009a\u00010^H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001f\u0010\u009d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u009a\u00010^H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009c\u0001J'\u0010\u009f\u0001\u001a\u00020\u00142\u0014\u0010\u009e\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u009a\u00010^H\u0002¢\u0006\u0005\b\u009f\u0001\u0010gJ\u001a\u0010 \u0001\u001a\u00020\u00142\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0014\u0010¢\u0001\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010¤\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010¥\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010¦\u0001R\u001f\u0010ª\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0005\b©\u0001\u0010\u000fR&\u0010®\u0001\u001a\u00020\u00048@X\u0081\u0084\u0002¢\u0006\u0016\n\u0006\b«\u0001\u0010¨\u0001\u0012\u0005\b\u00ad\u0001\u0010P\u001a\u0005\b¬\u0001\u0010\u000fR&\u0010²\u0001\u001a\u00020\u00048@X\u0081\u0084\u0002¢\u0006\u0016\n\u0006\b¯\u0001\u0010¨\u0001\u0012\u0005\b±\u0001\u0010P\u001a\u0005\b°\u0001\u0010\u000fR\u001e\u0010³\u0001\u001a\u00020\u00048\u0000X\u0080D¢\u0006\u000f\n\u0006\b³\u0001\u0010¥\u0001\u001a\u0005\b´\u0001\u0010\u000fR\u001f\u0010·\u0001\u001a\u00020\u00048@X\u0080\u0084\u0002¢\u0006\u000f\n\u0006\bµ\u0001\u0010¨\u0001\u001a\u0005\b¶\u0001\u0010\u000fR\u001f\u0010º\u0001\u001a\u00020\u00048@X\u0080\u0084\u0002¢\u0006\u000f\n\u0006\b¸\u0001\u0010¨\u0001\u001a\u0005\b¹\u0001\u0010\u000fR(\u0010»\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u009a\u0001\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R&\u0010À\u0001\u001a\u00020\u00048@X\u0081\u0084\u0002¢\u0006\u0016\n\u0006\b½\u0001\u0010¨\u0001\u0012\u0005\b¿\u0001\u0010P\u001a\u0005\b¾\u0001\u0010\u000fR\u001f\u0010Ã\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÁ\u0001\u0010¨\u0001\u001a\u0005\bÂ\u0001\u0010\u000fR\u001f\u0010Æ\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÄ\u0001\u0010¨\u0001\u001a\u0005\bÅ\u0001\u0010\u000fR\u001f\u0010É\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÇ\u0001\u0010¨\u0001\u001a\u0005\bÈ\u0001\u0010\u000fR\u001f\u0010Ì\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÊ\u0001\u0010¨\u0001\u001a\u0005\bË\u0001\u0010\u000fR\u001f\u0010Ï\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÍ\u0001\u0010¨\u0001\u001a\u0005\bÎ\u0001\u0010\u000fR\u001f\u0010Ò\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÐ\u0001\u0010¨\u0001\u001a\u0005\bÑ\u0001\u0010\u000f¨\u0006Ô\u0001"}, d2 = {"Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "Landroid/content/SharedPreferences;", "preferences", "", "apiKey", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lcom/revenuecat/purchases/common/DateProvider;)V", "Landroid/content/SharedPreferences$Editor;", "startEditing$purchases_defaultsRelease", "()Landroid/content/SharedPreferences$Editor;", "startEditing", "getLegacyCachedAppUserID$purchases_defaultsRelease", "()Ljava/lang/String;", "getLegacyCachedAppUserID", "getCachedAppUserID$purchases_defaultsRelease", "getCachedAppUserID", "appUserID", "Lh6/A;", "cacheAppUserID$purchases_defaultsRelease", "(Ljava/lang/String;)V", "cacheAppUserID", "cacheEditor", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)Landroid/content/SharedPreferences$Editor;", "clearCachesForAppUserID$purchases_defaultsRelease", "clearCachesForAppUserID", "customerInfoCacheKey$purchases_defaultsRelease", "(Ljava/lang/String;)Ljava/lang/String;", "customerInfoCacheKey", "customerInfoLastUpdatedCacheKey$purchases_defaultsRelease", "customerInfoLastUpdatedCacheKey", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo$purchases_defaultsRelease", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", "info", "cacheCustomerInfo$purchases_defaultsRelease", "(Ljava/lang/String;Lcom/revenuecat/purchases/CustomerInfo;)V", "cacheCustomerInfo", "", "appInBackground", "isCustomerInfoCacheStale$purchases_defaultsRelease", "(Ljava/lang/String;Z)Z", "isCustomerInfoCacheStale", "clearCustomerInfoCacheTimestamp$purchases_defaultsRelease", "clearCustomerInfoCacheTimestamp", "clearCustomerInfoCache$purchases_defaultsRelease", "clearCustomerInfoCache", "editor", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)V", "setCustomerInfoCacheTimestampToNow$purchases_defaultsRelease", "setCustomerInfoCacheTimestampToNow", "Ljava/util/Date;", "date", "setCustomerInfoCacheTimestamp$purchases_defaultsRelease", "(Ljava/lang/String;Ljava/util/Date;)V", "setCustomerInfoCacheTimestamp", "countryCode", "setStorefront$purchases_defaultsRelease", "setStorefront", "getStorefront", "virtualCurrenciesCacheKey$purchases_defaultsRelease", "virtualCurrenciesCacheKey", "virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsRelease", "virtualCurrenciesLastUpdatedCacheKey", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "getCachedVirtualCurrencies$purchases_defaultsRelease", "(Ljava/lang/String;)Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "getCachedVirtualCurrencies", "virtualCurrencies", "cacheVirtualCurrencies$purchases_defaultsRelease", "(Ljava/lang/String;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;)V", "cacheVirtualCurrencies", "isVirtualCurrenciesCacheStale$purchases_defaultsRelease", "isVirtualCurrenciesCacheStale", "clearVirtualCurrenciesCache$purchases_defaultsRelease", "clearVirtualCurrenciesCache", "cleanupOldAttributionData$purchases_defaultsRelease", "()V", "cleanupOldAttributionData", "", "getPreviouslySentHashedTokens$purchases_defaultsRelease", "()Ljava/util/Set;", "getPreviouslySentHashedTokens", "token", "isAutoRenewing", "addSuccessfullyPostedToken", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "hashedTokens", "cleanPreviouslySentTokens$purchases_defaultsRelease", "(Ljava/util/Set;)V", "cleanPreviouslySentTokens", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "", "getActivePurchasesNotInCache$purchases_defaultsRelease", "(Ljava/util/Map;)Ljava/util/List;", "getActivePurchasesNotInCache", "getPurchasesWithAutoRenewingChange$purchases_defaultsRelease", "getPurchasesWithAutoRenewingChange", "saveAutoRenewingStatus$purchases_defaultsRelease", "(Ljava/util/Map;)V", "saveAutoRenewingStatus", "Lorg/json/JSONObject;", "getOfferingsResponseCache$purchases_defaultsRelease", "()Lorg/json/JSONObject;", "getOfferingsResponseCache", "offeringsResponse", "cacheOfferingsResponse$purchases_defaultsRelease", "(Lorg/json/JSONObject;)V", "cacheOfferingsResponse", "clearOfferingsResponseCache$purchases_defaultsRelease", "clearOfferingsResponseCache", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "cacheProductEntitlementMapping$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)V", "cacheProductEntitlementMapping", "setProductEntitlementMappingCacheTimestampToNow$purchases_defaultsRelease", "setProductEntitlementMappingCacheTimestampToNow", "isProductEntitlementMappingCacheStale$purchases_defaultsRelease", "()Z", "isProductEntitlementMappingCacheStale", "getProductEntitlementMapping$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "getProductEntitlementMapping", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "getJSONObjectOrNull$purchases_defaultsRelease", "(Ljava/lang/String;)Lorg/json/JSONObject;", "getJSONObjectOrNull", "cacheKey", "value", "putString$purchases_defaultsRelease", "(Ljava/lang/String;Ljava/lang/String;)V", "putString", "remove$purchases_defaultsRelease", "remove", "findKeysThatStartWith$purchases_defaultsRelease", "(Ljava/lang/String;)Ljava/util/Set;", "findKeysThatStartWith", "newKey$purchases_defaultsRelease", "newKey", "clearCustomerInfo", "(Landroid/content/SharedPreferences$Editor;)Landroid/content/SharedPreferences$Editor;", "clearAppUserID", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", "getCustomerInfoCachesLastUpdated", "(Ljava/lang/String;)Ljava/util/Date;", "setVirtualCurrenciesCacheTimestampToNow", "setVirtualCurrenciesCacheTimestamp", "getVirtualCurrenciesCacheLastUpdated", "clearVirtualCurrenciesCacheTimestamp", "Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;", "getTokenMap", "()Ljava/util/Map;", "loadTokenMapFromPreferences", "tokenMap", "saveTokenMap", "setProductEntitlementMappingCacheTimestamp", "(Ljava/util/Date;)V", "getProductEntitlementMappingLastUpdated", "()Ljava/util/Date;", "Landroid/content/SharedPreferences;", "Ljava/lang/String;", "Lcom/revenuecat/purchases/common/DateProvider;", "apiKeyPrefix$delegate", "Lh6/h;", "getApiKeyPrefix", "apiKeyPrefix", "legacyAppUserIDCacheKey$delegate", "getLegacyAppUserIDCacheKey$purchases_defaultsRelease", "getLegacyAppUserIDCacheKey$purchases_defaultsRelease$annotations", "legacyAppUserIDCacheKey", "appUserIDCacheKey$delegate", "getAppUserIDCacheKey$purchases_defaultsRelease", "getAppUserIDCacheKey$purchases_defaultsRelease$annotations", "appUserIDCacheKey", "attributionCacheKey", "getAttributionCacheKey$purchases_defaultsRelease", "legacyTokensCacheKey$delegate", "getLegacyTokensCacheKey$purchases_defaultsRelease", "legacyTokensCacheKey", "tokensCacheKey$delegate", "getTokensCacheKey$purchases_defaultsRelease", "tokensCacheKey", "tokenMapCache", "Ljava/util/Map;", "storefrontCacheKey$delegate", "getStorefrontCacheKey$purchases_defaultsRelease", "getStorefrontCacheKey$purchases_defaultsRelease$annotations", "storefrontCacheKey", "productEntitlementMappingCacheKey$delegate", "getProductEntitlementMappingCacheKey", "productEntitlementMappingCacheKey", "productEntitlementMappingLastUpdatedCacheKey$delegate", "getProductEntitlementMappingLastUpdatedCacheKey", "productEntitlementMappingLastUpdatedCacheKey", "customerInfoCachesLastUpdatedCacheBaseKey$delegate", "getCustomerInfoCachesLastUpdatedCacheBaseKey", "customerInfoCachesLastUpdatedCacheBaseKey", "virtualCurrenciesCacheBaseKey$delegate", "getVirtualCurrenciesCacheBaseKey", "virtualCurrenciesCacheBaseKey", "virtualCurrenciesLastUpdatedCacheBaseKey$delegate", "getVirtualCurrenciesLastUpdatedCacheBaseKey", "virtualCurrenciesLastUpdatedCacheBaseKey", "offeringsResponseCacheKey$delegate", "getOfferingsResponseCacheKey", "offeringsResponseCacheKey", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class DeviceCache implements com.revenuecat.purchases.interfaces.StorefrontProvider {
    private static final java.lang.String CUSTOMER_INFO_ORIGINAL_SOURCE_KEY = "customer_info_original_source";
    private static final java.lang.String CUSTOMER_INFO_REQUEST_DATE_KEY = "customer_info_request_date";
    private static final java.lang.String CUSTOMER_INFO_SCHEMA_VERSION_KEY = "schema_version";
    private static final java.lang.String CUSTOMER_INFO_VERIFICATION_RESULT_KEY = "verification_result";
    private static final com.revenuecat.purchases.common.caching.DeviceCache.Companion Companion = new com.revenuecat.purchases.common.caching.DeviceCache.Companion(null);
    private final java.lang.String apiKey;

    /* JADX INFO: renamed from: apiKeyPrefix$delegate, reason: from kotlin metadata */
    private final p070h6.h apiKeyPrefix;

    /* JADX INFO: renamed from: appUserIDCacheKey$delegate, reason: from kotlin metadata */
    private final p070h6.h appUserIDCacheKey;
    private final java.lang.String attributionCacheKey;

    /* JADX INFO: renamed from: customerInfoCachesLastUpdatedCacheBaseKey$delegate, reason: from kotlin metadata */
    private final p070h6.h customerInfoCachesLastUpdatedCacheBaseKey;
    private final com.revenuecat.purchases.common.DateProvider dateProvider;

    /* JADX INFO: renamed from: legacyAppUserIDCacheKey$delegate, reason: from kotlin metadata */
    private final p070h6.h legacyAppUserIDCacheKey;

    /* JADX INFO: renamed from: legacyTokensCacheKey$delegate, reason: from kotlin metadata */
    private final p070h6.h legacyTokensCacheKey;

    /* JADX INFO: renamed from: offeringsResponseCacheKey$delegate, reason: from kotlin metadata */
    private final p070h6.h offeringsResponseCacheKey;
    private final android.content.SharedPreferences preferences;

    /* JADX INFO: renamed from: productEntitlementMappingCacheKey$delegate, reason: from kotlin metadata */
    private final p070h6.h productEntitlementMappingCacheKey;

    /* JADX INFO: renamed from: productEntitlementMappingLastUpdatedCacheKey$delegate, reason: from kotlin metadata */
    private final p070h6.h productEntitlementMappingLastUpdatedCacheKey;

    /* JADX INFO: renamed from: storefrontCacheKey$delegate, reason: from kotlin metadata */
    private final p070h6.h storefrontCacheKey;
    private java.util.Map<java.lang.String, com.revenuecat.purchases.common.caching.TokenCacheEntry> tokenMapCache;

    /* JADX INFO: renamed from: tokensCacheKey$delegate, reason: from kotlin metadata */
    private final p070h6.h tokensCacheKey;

    /* JADX INFO: renamed from: virtualCurrenciesCacheBaseKey$delegate, reason: from kotlin metadata */
    private final p070h6.h virtualCurrenciesCacheBaseKey;

    /* JADX INFO: renamed from: virtualCurrenciesLastUpdatedCacheBaseKey$delegate, reason: from kotlin metadata */
    private final p070h6.h virtualCurrenciesLastUpdatedCacheBaseKey;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/caching/DeviceCache$Companion;", "", "()V", "CUSTOMER_INFO_ORIGINAL_SOURCE_KEY", "", "CUSTOMER_INFO_REQUEST_DATE_KEY", "CUSTOMER_INFO_SCHEMA_VERSION_KEY", "CUSTOMER_INFO_VERIFICATION_RESULT_KEY", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private Companion() {
        }
    }

    public DeviceCache(android.content.SharedPreferences preferences, java.lang.String apiKey, com.revenuecat.purchases.common.DateProvider dateProvider) {
        kotlin.jvm.internal.m.e(preferences, "preferences");
        kotlin.jvm.internal.m.e(apiKey, "apiKey");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        this.preferences = preferences;
        this.apiKey = apiKey;
        this.dateProvider = dateProvider;
        this.apiKeyPrefix = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.common.caching.DeviceCache$apiKeyPrefix$2(this));
        this.legacyAppUserIDCacheKey = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.common.caching.DeviceCache$legacyAppUserIDCacheKey$2(this));
        this.appUserIDCacheKey = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.common.caching.DeviceCache$appUserIDCacheKey$2(this));
        this.attributionCacheKey = "com.revenuecat.purchases..attribution";
        this.legacyTokensCacheKey = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.common.caching.DeviceCache$legacyTokensCacheKey$2(this));
        this.tokensCacheKey = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.common.caching.DeviceCache$tokensCacheKey$2(this));
        this.storefrontCacheKey = com.google.common.util.concurrent.D.B(com.revenuecat.purchases.common.caching.DeviceCache$storefrontCacheKey$2.INSTANCE);
        this.productEntitlementMappingCacheKey = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.common.caching.DeviceCache$productEntitlementMappingCacheKey$2(this));
        this.productEntitlementMappingLastUpdatedCacheKey = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.common.caching.DeviceCache$productEntitlementMappingLastUpdatedCacheKey$2(this));
        this.customerInfoCachesLastUpdatedCacheBaseKey = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.common.caching.DeviceCache$customerInfoCachesLastUpdatedCacheBaseKey$2(this));
        this.virtualCurrenciesCacheBaseKey = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.common.caching.DeviceCache$virtualCurrenciesCacheBaseKey$2(this));
        this.virtualCurrenciesLastUpdatedCacheBaseKey = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.common.caching.DeviceCache$virtualCurrenciesLastUpdatedCacheBaseKey$2(this));
        this.offeringsResponseCacheKey = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.common.caching.DeviceCache$offeringsResponseCacheKey$2(this));
    }

    public static /* synthetic */ void addSuccessfullyPostedToken$default(com.revenuecat.purchases.common.caching.DeviceCache deviceCache, java.lang.String str, java.lang.Boolean bool, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSuccessfullyPostedToken");
        }
        if ((i3 & 2) != 0) {
            bool = null;
        }
        deviceCache.addSuccessfullyPostedToken(str, bool);
    }

    private final android.content.SharedPreferences.Editor clearAppUserID(android.content.SharedPreferences.Editor editor) {
        editor.remove(getAppUserIDCacheKey$purchases_defaultsRelease());
        editor.remove(getLegacyAppUserIDCacheKey$purchases_defaultsRelease());
        return editor;
    }

    private final android.content.SharedPreferences.Editor clearCustomerInfo(android.content.SharedPreferences.Editor editor) {
        java.lang.String cachedAppUserID$purchases_defaultsRelease = getCachedAppUserID$purchases_defaultsRelease();
        if (cachedAppUserID$purchases_defaultsRelease != null) {
            editor.remove(customerInfoCacheKey$purchases_defaultsRelease(cachedAppUserID$purchases_defaultsRelease));
        }
        java.lang.String legacyCachedAppUserID$purchases_defaultsRelease = getLegacyCachedAppUserID$purchases_defaultsRelease();
        if (legacyCachedAppUserID$purchases_defaultsRelease != null) {
            editor.remove(customerInfoCacheKey$purchases_defaultsRelease(legacyCachedAppUserID$purchases_defaultsRelease));
        }
        return editor;
    }

    private final android.content.SharedPreferences.Editor clearCustomerInfoCacheTimestamp(android.content.SharedPreferences.Editor editor, java.lang.String str) {
        editor.remove(customerInfoLastUpdatedCacheKey$purchases_defaultsRelease(str));
        return editor;
    }

    private final android.content.SharedPreferences.Editor clearVirtualCurrenciesCache(android.content.SharedPreferences.Editor editor, java.lang.String str) {
        editor.remove(virtualCurrenciesCacheKey$purchases_defaultsRelease(str));
        java.lang.String cachedAppUserID$purchases_defaultsRelease = getCachedAppUserID$purchases_defaultsRelease();
        if (cachedAppUserID$purchases_defaultsRelease != null) {
            editor.remove(virtualCurrenciesCacheKey$purchases_defaultsRelease(cachedAppUserID$purchases_defaultsRelease));
        }
        java.lang.String legacyCachedAppUserID$purchases_defaultsRelease = getLegacyCachedAppUserID$purchases_defaultsRelease();
        if (legacyCachedAppUserID$purchases_defaultsRelease != null) {
            editor.remove(virtualCurrenciesCacheKey$purchases_defaultsRelease(legacyCachedAppUserID$purchases_defaultsRelease));
        }
        return editor;
    }

    private final android.content.SharedPreferences.Editor clearVirtualCurrenciesCacheTimestamp(android.content.SharedPreferences.Editor editor, java.lang.String str) {
        editor.remove(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsRelease(str));
        java.lang.String cachedAppUserID$purchases_defaultsRelease = getCachedAppUserID$purchases_defaultsRelease();
        if (cachedAppUserID$purchases_defaultsRelease != null) {
            editor.remove(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsRelease(cachedAppUserID$purchases_defaultsRelease));
        }
        java.lang.String legacyCachedAppUserID$purchases_defaultsRelease = getLegacyCachedAppUserID$purchases_defaultsRelease();
        if (legacyCachedAppUserID$purchases_defaultsRelease != null) {
            editor.remove(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsRelease(legacyCachedAppUserID$purchases_defaultsRelease));
        }
        return editor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String getApiKeyPrefix() {
        return (java.lang.String) this.apiKeyPrefix.getValue();
    }

    public static /* synthetic */ void getAppUserIDCacheKey$purchases_defaultsRelease$annotations() {
    }

    private final synchronized java.util.Date getCustomerInfoCachesLastUpdated(java.lang.String appUserID) {
        return new java.util.Date(this.preferences.getLong(customerInfoLastUpdatedCacheKey$purchases_defaultsRelease(appUserID), 0L));
    }

    private final java.lang.String getCustomerInfoCachesLastUpdatedCacheBaseKey() {
        return (java.lang.String) this.customerInfoCachesLastUpdatedCacheBaseKey.getValue();
    }

    public static /* synthetic */ void getLegacyAppUserIDCacheKey$purchases_defaultsRelease$annotations() {
    }

    private final java.lang.String getOfferingsResponseCacheKey() {
        return (java.lang.String) this.offeringsResponseCacheKey.getValue();
    }

    private final java.lang.String getProductEntitlementMappingCacheKey() {
        return (java.lang.String) this.productEntitlementMappingCacheKey.getValue();
    }

    private final java.util.Date getProductEntitlementMappingLastUpdated() {
        if (this.preferences.contains(getProductEntitlementMappingLastUpdatedCacheKey())) {
            return new java.util.Date(this.preferences.getLong(getProductEntitlementMappingLastUpdatedCacheKey(), -1L));
        }
        return null;
    }

    private final java.lang.String getProductEntitlementMappingLastUpdatedCacheKey() {
        return (java.lang.String) this.productEntitlementMappingLastUpdatedCacheKey.getValue();
    }

    public static /* synthetic */ void getStorefrontCacheKey$purchases_defaultsRelease$annotations() {
    }

    private final synchronized java.util.Map<java.lang.String, com.revenuecat.purchases.common.caching.TokenCacheEntry> getTokenMap() {
        java.util.Map<java.lang.String, com.revenuecat.purchases.common.caching.TokenCacheEntry> map = this.tokenMapCache;
        if (map != null) {
            return map;
        }
        java.util.Map<java.lang.String, com.revenuecat.purchases.common.caching.TokenCacheEntry> mapLoadTokenMapFromPreferences = loadTokenMapFromPreferences();
        this.tokenMapCache = mapLoadTokenMapFromPreferences;
        return mapLoadTokenMapFromPreferences;
    }

    private final java.lang.String getVirtualCurrenciesCacheBaseKey() {
        return (java.lang.String) this.virtualCurrenciesCacheBaseKey.getValue();
    }

    private final synchronized java.util.Date getVirtualCurrenciesCacheLastUpdated(java.lang.String appUserID) {
        return new java.util.Date(this.preferences.getLong(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsRelease(appUserID), 0L));
    }

    private final java.lang.String getVirtualCurrenciesLastUpdatedCacheBaseKey() {
        return (java.lang.String) this.virtualCurrenciesLastUpdatedCacheBaseKey.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.common.caching.TokenCacheEntry> loadTokenMapFromPreferences() {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string = this.preferences.getString(getTokensCacheKey$purchases_defaultsRelease(), null);
        p078i6.x xVar = p078i6.x.f23206h;
        if (string != null) {
            try {
                return (java.util.Map) p162s8.d.f27387d.b(string, com.revenuecat.purchases.common.caching.DeviceCacheKt.tokenMapSerializer);
            } catch (p119n8.j | java.lang.IllegalArgumentException unused) {
                return xVar;
            }
        }
        try {
            java.util.Set<java.lang.String> stringSet = this.preferences.getStringSet(getLegacyTokensCacheKey$purchases_defaultsRelease(), null);
            java.util.Set setR1 = stringSet != null ? p078i6.o.R1(stringSet) : null;
            if (setR1 != null) {
                java.util.Set set = setR1;
                int iI0 = p078i6.D.I0(p078i6.q.I0(set, 10));
                if (iI0 < 16) {
                    iI0 = 16;
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iI0);
                for (java.lang.Object obj : set) {
                    linkedHashMap.put(obj, new com.revenuecat.purchases.common.caching.TokenCacheEntry((java.lang.Boolean) null, 1, (kotlin.jvm.internal.AbstractC2541f) null));
                }
                saveTokenMap(linkedHashMap);
                this.preferences.edit().remove(getLegacyTokensCacheKey$purchases_defaultsRelease()).apply();
                com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
                com.revenuecat.purchases.common.caching.DeviceCache$loadTokenMapFromPreferences$$inlined$log$1 deviceCache$loadTokenMapFromPreferences$$inlined$log$1 = new com.revenuecat.purchases.common.caching.DeviceCache$loadTokenMapFromPreferences$$inlined$log$1(logIntent, linkedHashMap);
                switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (java.lang.String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 2:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                        return linkedHashMap;
                    case 3:
                        com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (java.lang.String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 4:
                        com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (java.lang.String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 5:
                        com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (java.lang.String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 6:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                        return linkedHashMap;
                    case 7:
                        com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (java.lang.String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 8:
                        com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (java.lang.String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 9:
                        com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (java.lang.String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 10:
                        com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (java.lang.String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 11:
                        com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (java.lang.String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 12:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                        return linkedHashMap;
                    case 13:
                        com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (java.lang.String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 14:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                        return linkedHashMap;
                    default:
                        return linkedHashMap;
                }
            }
        } catch (java.lang.ClassCastException unused2) {
        }
        return xVar;
    }

    private final synchronized void saveTokenMap(java.util.Map<java.lang.String, com.revenuecat.purchases.common.caching.TokenCacheEntry> tokenMap) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        java.lang.String str2;
        try {
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
            com.revenuecat.purchases.common.caching.DeviceCache$saveTokenMap$$inlined$log$1 deviceCache$saveTokenMap$$inlined$log$1 = new com.revenuecat.purchases.common.caching.DeviceCache$saveTokenMap$$inlined$log$1(logIntent, tokenMap);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (java.lang.String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (java.lang.String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (java.lang.String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (java.lang.String) deviceCache$saveTokenMap$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (java.lang.String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (java.lang.String) deviceCache$saveTokenMap$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (java.lang.String) deviceCache$saveTokenMap$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (java.lang.String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (java.lang.String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (java.lang.String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
            }
            putString$purchases_defaultsRelease(getTokensCacheKey$purchases_defaultsRelease(), p162s8.d.f27387d.d(com.revenuecat.purchases.common.caching.DeviceCacheKt.tokenMapSerializer, tokenMap));
            this.tokenMapCache = tokenMap;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final void setProductEntitlementMappingCacheTimestamp(java.util.Date date) {
        this.preferences.edit().putLong(getProductEntitlementMappingLastUpdatedCacheKey(), date.getTime()).apply();
    }

    private final synchronized void setVirtualCurrenciesCacheTimestamp(java.lang.String appUserID, java.util.Date date) {
        this.preferences.edit().putLong(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsRelease(appUserID), date.getTime()).apply();
    }

    private final synchronized void setVirtualCurrenciesCacheTimestampToNow(java.lang.String appUserID) {
        setVirtualCurrenciesCacheTimestamp(appUserID, this.dateProvider.getNow());
    }

    public final synchronized void addSuccessfullyPostedToken(java.lang.String token, java.lang.Boolean isAutoRenewing) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        java.lang.String str2;
        try {
            kotlin.jvm.internal.m.e(token, "token");
            java.lang.String strSha1 = com.revenuecat.purchases.common.UtilsKt.sha1(token);
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
            com.revenuecat.purchases.common.caching.DeviceCache$addSuccessfullyPostedToken$$inlined$log$1 deviceCache$addSuccessfullyPostedToken$$inlined$log$1 = new com.revenuecat.purchases.common.caching.DeviceCache$addSuccessfullyPostedToken$$inlined$log$1(logIntent, token, strSha1);
            int[] iArr = com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.d("[Purchases] - " + logLevel4.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
            }
            java.util.LinkedHashMap linkedHashMapZ0 = p078i6.C.Z0(getTokenMap());
            com.revenuecat.purchases.common.caching.DeviceCache$addSuccessfullyPostedToken$$inlined$log$2 deviceCache$addSuccessfullyPostedToken$$inlined$log$2 = new com.revenuecat.purchases.common.caching.DeviceCache$addSuccessfullyPostedToken$$inlined$log$2(logIntent, linkedHashMapZ0);
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel11 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler9 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler9.d("[Purchases] - " + logLevel11.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel12 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler10 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler10.w("[Purchases] - " + logLevel12.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel13 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler11 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler11.i("[Purchases] - " + logLevel13.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel14 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler12 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler12.d("[Purchases] - " + logLevel14.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel15 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler13 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler13.i("[Purchases] - " + logLevel15.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel16 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler14 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel16.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel17 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler15 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler15.d("[Purchases] - " + logLevel17.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel18 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler16 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel18.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel19 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler17 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel19.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel20 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler18 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler18.w("[Purchases] - " + logLevel20.name(), (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
            }
            com.revenuecat.purchases.common.caching.TokenCacheEntry tokenCacheEntry = (com.revenuecat.purchases.common.caching.TokenCacheEntry) linkedHashMapZ0.get(strSha1);
            if (tokenCacheEntry == null) {
                linkedHashMapZ0.put(strSha1, new com.revenuecat.purchases.common.caching.TokenCacheEntry(isAutoRenewing));
                saveTokenMap(linkedHashMapZ0);
            } else if (isAutoRenewing != null && !kotlin.jvm.internal.m.a(tokenCacheEntry.isAutoRenewing(), isAutoRenewing)) {
                linkedHashMapZ0.put(strSha1, tokenCacheEntry.copy(isAutoRenewing));
                saveTokenMap(linkedHashMapZ0);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void cacheAppUserID$purchases_defaultsRelease(java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        android.content.SharedPreferences.Editor editorEdit = this.preferences.edit();
        kotlin.jvm.internal.m.d(editorEdit, "preferences.edit()");
        cacheAppUserID$purchases_defaultsRelease(appUserID, editorEdit).apply();
    }

    public final synchronized void cacheCustomerInfo$purchases_defaultsRelease(java.lang.String appUserID, com.revenuecat.purchases.CustomerInfo info) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(info, "info");
        org.json.JSONObject jsonObject = info.getJsonObject();
        jsonObject.put(CUSTOMER_INFO_SCHEMA_VERSION_KEY, 3);
        jsonObject.put("verification_result", info.getEntitlements().getVerification().name());
        jsonObject.put(CUSTOMER_INFO_REQUEST_DATE_KEY, info.getRequestDate().getTime());
        jsonObject.put(CUSTOMER_INFO_ORIGINAL_SOURCE_KEY, info.getOriginalSource().name());
        this.preferences.edit().putString(customerInfoCacheKey$purchases_defaultsRelease(appUserID), jsonObject.toString()).apply();
        setCustomerInfoCacheTimestampToNow$purchases_defaultsRelease(appUserID);
    }

    public final synchronized void cacheOfferingsResponse$purchases_defaultsRelease(org.json.JSONObject offeringsResponse) {
        kotlin.jvm.internal.m.e(offeringsResponse, "offeringsResponse");
        this.preferences.edit().putString(getOfferingsResponseCacheKey(), offeringsResponse.toString()).apply();
    }

    public final synchronized void cacheProductEntitlementMapping$purchases_defaultsRelease(com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping productEntitlementMapping) {
        kotlin.jvm.internal.m.e(productEntitlementMapping, "productEntitlementMapping");
        this.preferences.edit().putString(getProductEntitlementMappingCacheKey(), productEntitlementMapping.toJson$purchases_defaultsRelease().toString()).apply();
        setProductEntitlementMappingCacheTimestampToNow$purchases_defaultsRelease();
    }

    public final synchronized void cacheVirtualCurrencies$purchases_defaultsRelease(java.lang.String appUserID, com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies virtualCurrencies) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(virtualCurrencies, "virtualCurrencies");
        this.preferences.edit().putString(virtualCurrenciesCacheKey$purchases_defaultsRelease(appUserID), p162s8.d.f27387d.d(com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies.INSTANCE.serializer(), virtualCurrencies)).apply();
        setVirtualCurrenciesCacheTimestampToNow(appUserID);
    }

    public final synchronized void cleanPreviouslySentTokens$purchases_defaultsRelease(java.util.Set<java.lang.String> hashedTokens) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        java.lang.String str2;
        try {
            kotlin.jvm.internal.m.e(hashedTokens, "hashedTokens");
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
            com.revenuecat.purchases.common.caching.DeviceCache$cleanPreviouslySentTokens$$inlined$log$1 deviceCache$cleanPreviouslySentTokens$$inlined$log$1 = new com.revenuecat.purchases.common.caching.DeviceCache$cleanPreviouslySentTokens$$inlined$log$1(logIntent);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (java.lang.String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (java.lang.String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (java.lang.String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (java.lang.String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (java.lang.String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (java.lang.String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (java.lang.String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (java.lang.String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (java.lang.String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (java.lang.String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
            }
            java.util.Map<java.lang.String, com.revenuecat.purchases.common.caching.TokenCacheEntry> tokenMap = getTokenMap();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.common.caching.TokenCacheEntry> entry : tokenMap.entrySet()) {
                if (hashedTokens.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            saveTokenMap(linkedHashMap);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void cleanupOldAttributionData$purchases_defaultsRelease() {
        try {
            android.content.SharedPreferences.Editor editorEdit = this.preferences.edit();
            for (java.lang.String str : this.preferences.getAll().keySet()) {
                if (str != null && O7.x.x0(str, this.attributionCacheKey, false)) {
                    editorEdit.remove(str);
                }
            }
            editorEdit.apply();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void clearCachesForAppUserID$purchases_defaultsRelease(java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        android.content.SharedPreferences.Editor editorEdit = this.preferences.edit();
        kotlin.jvm.internal.m.d(editorEdit, "preferences.edit()");
        clearVirtualCurrenciesCache(clearVirtualCurrenciesCacheTimestamp(clearCustomerInfoCacheTimestamp(clearAppUserID(clearCustomerInfo(editorEdit)), appUserID), appUserID), appUserID).apply();
    }

    public final synchronized void clearCustomerInfoCache$purchases_defaultsRelease(java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        android.content.SharedPreferences.Editor editor = this.preferences.edit();
        kotlin.jvm.internal.m.d(editor, "editor");
        clearCustomerInfoCache$purchases_defaultsRelease(appUserID, editor);
        editor.apply();
    }

    public final synchronized void clearCustomerInfoCacheTimestamp$purchases_defaultsRelease(java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        android.content.SharedPreferences.Editor editorEdit = this.preferences.edit();
        kotlin.jvm.internal.m.d(editorEdit, "preferences.edit()");
        clearCustomerInfoCacheTimestamp(editorEdit, appUserID).apply();
    }

    public final synchronized void clearOfferingsResponseCache$purchases_defaultsRelease() {
        this.preferences.edit().remove(getOfferingsResponseCacheKey()).apply();
    }

    public final synchronized void clearVirtualCurrenciesCache$purchases_defaultsRelease(java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        android.content.SharedPreferences.Editor editor = this.preferences.edit();
        kotlin.jvm.internal.m.d(editor, "editor");
        clearVirtualCurrenciesCache$purchases_defaultsRelease(appUserID, editor);
        editor.apply();
    }

    public final java.lang.String customerInfoCacheKey$purchases_defaultsRelease(java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        return getLegacyAppUserIDCacheKey$purchases_defaultsRelease() + '.' + appUserID;
    }

    public final java.lang.String customerInfoLastUpdatedCacheKey$purchases_defaultsRelease(java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        return getCustomerInfoCachesLastUpdatedCacheBaseKey() + '.' + appUserID;
    }

    public final java.util.Set<java.lang.String> findKeysThatStartWith$purchases_defaultsRelease(java.lang.String cacheKey) {
        p078i6.y yVar = p078i6.y.f23207h;
        kotlin.jvm.internal.m.e(cacheKey, "cacheKey");
        try {
            java.util.Map<java.lang.String, ?> all = this.preferences.getAll();
            if (all != null) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
                    java.lang.String it = entry.getKey();
                    kotlin.jvm.internal.m.d(it, "it");
                    if (O7.x.x0(it, cacheKey, false)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                java.util.Set<java.lang.String> setKeySet = linkedHashMap.keySet();
                if (setKeySet != null) {
                    return setKeySet;
                }
            }
        } catch (java.lang.NullPointerException unused) {
        }
        return yVar;
    }

    public final synchronized java.util.List<com.revenuecat.purchases.models.StoreTransaction> getActivePurchasesNotInCache$purchases_defaultsRelease(java.util.Map<java.lang.String, com.revenuecat.purchases.models.StoreTransaction> hashedTokens) {
        kotlin.jvm.internal.m.e(hashedTokens, "hashedTokens");
        return p078i6.o.N1(p078i6.C.P0(hashedTokens, getPreviouslySentHashedTokens$purchases_defaultsRelease()).values());
    }

    public final java.lang.String getAppUserIDCacheKey$purchases_defaultsRelease() {
        return (java.lang.String) this.appUserIDCacheKey.getValue();
    }

    /* JADX INFO: renamed from: getAttributionCacheKey$purchases_defaultsRelease, reason: from getter */
    public final java.lang.String getAttributionCacheKey() {
        return this.attributionCacheKey;
    }

    public final synchronized java.lang.String getCachedAppUserID$purchases_defaultsRelease() {
        return this.preferences.getString(getAppUserIDCacheKey$purchases_defaultsRelease(), null);
    }

    public final com.revenuecat.purchases.CustomerInfo getCachedCustomerInfo$purchases_defaultsRelease(java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        java.lang.String string = this.preferences.getString(customerInfoCacheKey$purchases_defaultsRelease(appUserID), null);
        if (string != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                int iOptInt = jSONObject.optInt(CUSTOMER_INFO_SCHEMA_VERSION_KEY);
                java.lang.String verificationResultString = jSONObject.has("verification_result") ? jSONObject.getString("verification_result") : "NOT_REQUESTED";
                java.lang.Long lValueOf = java.lang.Long.valueOf(jSONObject.optLong(CUSTOMER_INFO_REQUEST_DATE_KEY));
                if (lValueOf.longValue() <= 0) {
                    lValueOf = null;
                }
                java.util.Date date = lValueOf != null ? new java.util.Date(lValueOf.longValue()) : null;
                com.revenuecat.purchases.CustomerInfoOriginalSource customerInfoOriginalSourceFromString = com.revenuecat.purchases.CustomerInfoOriginalSource.INSTANCE.fromString(com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableString(jSONObject, CUSTOMER_INFO_ORIGINAL_SOURCE_KEY));
                jSONObject.remove("verification_result");
                jSONObject.remove(CUSTOMER_INFO_REQUEST_DATE_KEY);
                jSONObject.remove(CUSTOMER_INFO_ORIGINAL_SOURCE_KEY);
                kotlin.jvm.internal.m.d(verificationResultString, "verificationResultString");
                com.revenuecat.purchases.VerificationResult verificationResultValueOf = com.revenuecat.purchases.VerificationResult.valueOf(verificationResultString);
                if (iOptInt == 3) {
                    return com.revenuecat.purchases.common.CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, date, verificationResultValueOf, customerInfoOriginalSourceFromString, true);
                }
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }

    public final synchronized com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies getCachedVirtualCurrencies$purchases_defaultsRelease(java.lang.String appUserID) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        java.lang.String str2;
        try {
            kotlin.jvm.internal.m.e(appUserID, "appUserID");
            java.lang.String string = this.preferences.getString(virtualCurrenciesCacheKey$purchases_defaultsRelease(appUserID), null);
            if (string != null) {
                try {
                    return com.revenuecat.purchases.virtualcurrencies.VirtualCurrenciesFactory.INSTANCE.buildVirtualCurrencies(string);
                } catch (p119n8.j e6) {
                    com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.WARNING;
                    com.revenuecat.purchases.common.caching.DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2 deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2 = new com.revenuecat.purchases.common.caching.DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2(logIntent, e6);
                    switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                        case 1:
                            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                            com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                currentLogHandler2.d("[Purchases] - " + logLevel.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 2:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                            break;
                        case 3:
                            com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 4:
                            com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                            com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 5:
                            com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                            com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                currentLogHandler5.d("[Purchases] - " + logLevel4.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 6:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                            break;
                        case 7:
                            com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                            com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                currentLogHandler6.i("[Purchases] - " + logLevel5.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 8:
                            com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                            com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                currentLogHandler7.d("[Purchases] - " + logLevel6.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 9:
                            com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                            com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                currentLogHandler8.d("[Purchases] - " + logLevel7.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 10:
                            com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler9 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                currentLogHandler9.w("[Purchases] - " + logLevel8.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 11:
                            com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler10 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                currentLogHandler10.w("[Purchases] - " + logLevel9.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 12:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                            break;
                        case 13:
                            com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler11 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                currentLogHandler11.w("[Purchases] - " + logLevel10.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 14:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                            break;
                    }
                } catch (java.lang.IllegalArgumentException e9) {
                    com.revenuecat.purchases.common.LogIntent logIntent2 = com.revenuecat.purchases.common.LogIntent.WARNING;
                    com.revenuecat.purchases.common.caching.DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3 deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3 = new com.revenuecat.purchases.common.caching.DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3(logIntent2, e9);
                    switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                        case 1:
                            com.revenuecat.purchases.LogLevel logLevel11 = com.revenuecat.purchases.LogLevel.DEBUG;
                            com.revenuecat.purchases.LogHandler currentLogHandler12 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                currentLogHandler12.d("[Purchases] - " + logLevel11.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 2:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                            break;
                        case 3:
                            com.revenuecat.purchases.LogLevel logLevel12 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler13 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler13.w("[Purchases] - " + logLevel12.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 4:
                            com.revenuecat.purchases.LogLevel logLevel13 = com.revenuecat.purchases.LogLevel.INFO;
                            com.revenuecat.purchases.LogHandler currentLogHandler14 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler14.i("[Purchases] - " + logLevel13.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 5:
                            com.revenuecat.purchases.LogLevel logLevel14 = com.revenuecat.purchases.LogLevel.DEBUG;
                            com.revenuecat.purchases.LogHandler currentLogHandler15 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                currentLogHandler15.d("[Purchases] - " + logLevel14.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 6:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                            break;
                        case 7:
                            com.revenuecat.purchases.LogLevel logLevel15 = com.revenuecat.purchases.LogLevel.INFO;
                            com.revenuecat.purchases.LogHandler currentLogHandler16 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler16.i("[Purchases] - " + logLevel15.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 8:
                            com.revenuecat.purchases.LogLevel logLevel16 = com.revenuecat.purchases.LogLevel.DEBUG;
                            com.revenuecat.purchases.LogHandler currentLogHandler17 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                currentLogHandler17.d("[Purchases] - " + logLevel16.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 9:
                            com.revenuecat.purchases.LogLevel logLevel17 = com.revenuecat.purchases.LogLevel.DEBUG;
                            com.revenuecat.purchases.LogHandler currentLogHandler18 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                currentLogHandler18.d("[Purchases] - " + logLevel17.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 10:
                            com.revenuecat.purchases.LogLevel logLevel18 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler19 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler19.w("[Purchases] - " + logLevel18.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 11:
                            com.revenuecat.purchases.LogLevel logLevel19 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler20 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                currentLogHandler20.w("[Purchases] - " + logLevel19.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 12:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                            break;
                        case 13:
                            com.revenuecat.purchases.LogLevel logLevel20 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler21 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                currentLogHandler21.w("[Purchases] - " + logLevel20.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 14:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                            break;
                    }
                } catch (org.json.JSONException e10) {
                    com.revenuecat.purchases.common.LogIntent logIntent3 = com.revenuecat.purchases.common.LogIntent.WARNING;
                    com.revenuecat.purchases.common.caching.DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1 deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1 = new com.revenuecat.purchases.common.caching.DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1(logIntent3, e10);
                    switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                        case 1:
                            com.revenuecat.purchases.LogLevel logLevel21 = com.revenuecat.purchases.LogLevel.DEBUG;
                            currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                                str = "[Purchases] - " + logLevel21.name();
                                str2 = (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 2:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                        case 3:
                            com.revenuecat.purchases.LogLevel logLevel22 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler22 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                                currentLogHandler22.w("[Purchases] - " + logLevel22.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 4:
                            com.revenuecat.purchases.LogLevel logLevel23 = com.revenuecat.purchases.LogLevel.INFO;
                            com.revenuecat.purchases.LogHandler currentLogHandler23 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                                currentLogHandler23.i("[Purchases] - " + logLevel23.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 5:
                            com.revenuecat.purchases.LogLevel logLevel24 = com.revenuecat.purchases.LogLevel.DEBUG;
                            currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                                str = "[Purchases] - " + logLevel24.name();
                                str2 = (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 6:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                        case 7:
                            com.revenuecat.purchases.LogLevel logLevel25 = com.revenuecat.purchases.LogLevel.INFO;
                            com.revenuecat.purchases.LogHandler currentLogHandler24 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                                currentLogHandler24.i("[Purchases] - " + logLevel25.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 8:
                            com.revenuecat.purchases.LogLevel logLevel26 = com.revenuecat.purchases.LogLevel.DEBUG;
                            currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                                str = "[Purchases] - " + logLevel26.name();
                                str2 = (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 9:
                            com.revenuecat.purchases.LogLevel logLevel27 = com.revenuecat.purchases.LogLevel.DEBUG;
                            currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                                str = "[Purchases] - " + logLevel27.name();
                                str2 = (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 10:
                            com.revenuecat.purchases.LogLevel logLevel28 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler25 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                                currentLogHandler25.w("[Purchases] - " + logLevel28.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 11:
                            com.revenuecat.purchases.LogLevel logLevel29 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler26 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                                currentLogHandler26.w("[Purchases] - " + logLevel29.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 12:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                        case 13:
                            com.revenuecat.purchases.LogLevel logLevel30 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler27 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                                currentLogHandler27.w("[Purchases] - " + logLevel30.name(), (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 14:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                    }
                }
            }
            return null;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public org.json.JSONObject getJSONObjectOrNull$purchases_defaultsRelease(java.lang.String key) {
        kotlin.jvm.internal.m.e(key, "key");
        java.lang.String string = this.preferences.getString(key, null);
        if (string == null) {
            return null;
        }
        try {
            return new org.json.JSONObject(string);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public final java.lang.String getLegacyAppUserIDCacheKey$purchases_defaultsRelease() {
        return (java.lang.String) this.legacyAppUserIDCacheKey.getValue();
    }

    public final synchronized java.lang.String getLegacyCachedAppUserID$purchases_defaultsRelease() {
        return this.preferences.getString(getLegacyAppUserIDCacheKey$purchases_defaultsRelease(), null);
    }

    public final java.lang.String getLegacyTokensCacheKey$purchases_defaultsRelease() {
        return (java.lang.String) this.legacyTokensCacheKey.getValue();
    }

    public final synchronized org.json.JSONObject getOfferingsResponseCache$purchases_defaultsRelease() {
        return getJSONObjectOrNull$purchases_defaultsRelease(getOfferingsResponseCacheKey());
    }

    public final synchronized java.util.Set<java.lang.String> getPreviouslySentHashedTokens$purchases_defaultsRelease() {
        java.util.Set<java.lang.String> setKeySet;
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        java.lang.String str2;
        try {
            setKeySet = getTokenMap().keySet();
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
            com.revenuecat.purchases.common.caching.DeviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1 deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1 = new com.revenuecat.purchases.common.caching.DeviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1(logIntent, setKeySet);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (java.lang.String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (java.lang.String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (java.lang.String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (java.lang.String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (java.lang.String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (java.lang.String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (java.lang.String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (java.lang.String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (java.lang.String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (java.lang.String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return setKeySet;
    }

    public final synchronized com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping getProductEntitlementMapping$purchases_defaultsRelease() {
        com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping productEntitlementMappingFromJson$purchases_defaultsRelease = null;
        java.lang.String string = this.preferences.getString(getProductEntitlementMappingCacheKey(), null);
        if (string == null) {
            return null;
        }
        try {
            productEntitlementMappingFromJson$purchases_defaultsRelease = com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.INSTANCE.fromJson$purchases_defaultsRelease(new org.json.JSONObject(string), true);
        } catch (org.json.JSONException e6) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", java.lang.String.format(com.revenuecat.purchases.strings.OfflineEntitlementsStrings.ERROR_PARSING_PRODUCT_ENTITLEMENT_MAPPING, java.util.Arrays.copyOf(new java.lang.Object[]{string}, 1)), e6);
            this.preferences.edit().remove(getProductEntitlementMappingCacheKey()).apply();
        }
        return productEntitlementMappingFromJson$purchases_defaultsRelease;
    }

    public final synchronized java.util.List<com.revenuecat.purchases.models.StoreTransaction> getPurchasesWithAutoRenewingChange$purchases_defaultsRelease(java.util.Map<java.lang.String, com.revenuecat.purchases.models.StoreTransaction> hashedTokens) {
        java.util.LinkedHashMap linkedHashMap;
        try {
            kotlin.jvm.internal.m.e(hashedTokens, "hashedTokens");
            java.util.Map<java.lang.String, com.revenuecat.purchases.common.caching.TokenCacheEntry> tokenMap = getTokenMap();
            linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.models.StoreTransaction> entry : hashedTokens.entrySet()) {
                java.lang.String key = entry.getKey();
                com.revenuecat.purchases.models.StoreTransaction value = entry.getValue();
                com.revenuecat.purchases.common.caching.TokenCacheEntry tokenCacheEntry = tokenMap.get(key);
                if (tokenCacheEntry != null && tokenCacheEntry.isAutoRenewing() != null && value.getIsAutoRenewing() != null && !kotlin.jvm.internal.m.a(value.getIsAutoRenewing(), tokenCacheEntry.isAutoRenewing())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return p078i6.o.N1(linkedHashMap.values());
    }

    @Override // com.revenuecat.purchases.interfaces.StorefrontProvider
    public synchronized java.lang.String getStorefront() {
        java.lang.String string;
        string = this.preferences.getString(getStorefrontCacheKey$purchases_defaultsRelease(), null);
        if (string == null) {
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), com.revenuecat.purchases.strings.BillingStrings.BILLING_STOREFRONT_NULL_FROM_CACHE);
            }
        }
        return string;
    }

    public final java.lang.String getStorefrontCacheKey$purchases_defaultsRelease() {
        return (java.lang.String) this.storefrontCacheKey.getValue();
    }

    public final java.lang.String getTokensCacheKey$purchases_defaultsRelease() {
        return (java.lang.String) this.tokensCacheKey.getValue();
    }

    public final synchronized boolean isCustomerInfoCacheStale$purchases_defaultsRelease(java.lang.String appUserID, boolean appInBackground) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        return com.revenuecat.purchases.common.caching.DateExtensionsKt.isCacheStale(getCustomerInfoCachesLastUpdated(appUserID), appInBackground, this.dateProvider);
    }

    public final synchronized boolean isProductEntitlementMappingCacheStale$purchases_defaultsRelease() {
        return com.revenuecat.purchases.common.caching.DateExtensionsKt.m132isCacheStale8Mi8wO0(getProductEntitlementMappingLastUpdated(), com.revenuecat.purchases.common.caching.DeviceCacheKt.PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD, this.dateProvider);
    }

    public final synchronized boolean isVirtualCurrenciesCacheStale$purchases_defaultsRelease(java.lang.String appUserID, boolean appInBackground) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        return com.revenuecat.purchases.common.caching.DateExtensionsKt.isCacheStale(getVirtualCurrenciesCacheLastUpdated(appUserID), appInBackground, this.dateProvider);
    }

    public final java.lang.String newKey$purchases_defaultsRelease(java.lang.String key) {
        kotlin.jvm.internal.m.e(key, "key");
        return getApiKeyPrefix() + '.' + key;
    }

    public void putString$purchases_defaultsRelease(java.lang.String cacheKey, java.lang.String value) {
        kotlin.jvm.internal.m.e(cacheKey, "cacheKey");
        kotlin.jvm.internal.m.e(value, "value");
        this.preferences.edit().putString(cacheKey, value).apply();
    }

    public final void remove$purchases_defaultsRelease(java.lang.String cacheKey) {
        kotlin.jvm.internal.m.e(cacheKey, "cacheKey");
        this.preferences.edit().remove(cacheKey).apply();
    }

    public final synchronized void saveAutoRenewingStatus$purchases_defaultsRelease(java.util.Map<java.lang.String, com.revenuecat.purchases.models.StoreTransaction> hashedTokens) {
        try {
            kotlin.jvm.internal.m.e(hashedTokens, "hashedTokens");
            java.util.LinkedHashMap linkedHashMapZ0 = p078i6.C.Z0(getTokenMap());
            boolean z6 = false;
            for (java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.models.StoreTransaction> entry : hashedTokens.entrySet()) {
                java.lang.String key = entry.getKey();
                com.revenuecat.purchases.models.StoreTransaction value = entry.getValue();
                com.revenuecat.purchases.common.caching.TokenCacheEntry tokenCacheEntry = (com.revenuecat.purchases.common.caching.TokenCacheEntry) linkedHashMapZ0.get(key);
                if (tokenCacheEntry != null && value.getIsAutoRenewing() != null && !kotlin.jvm.internal.m.a(tokenCacheEntry.isAutoRenewing(), value.getIsAutoRenewing())) {
                    linkedHashMapZ0.put(key, tokenCacheEntry.copy(value.getIsAutoRenewing()));
                    z6 = true;
                }
            }
            if (z6) {
                saveTokenMap(linkedHashMapZ0);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void setCustomerInfoCacheTimestamp$purchases_defaultsRelease(java.lang.String appUserID, java.util.Date date) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(date, "date");
        this.preferences.edit().putLong(customerInfoLastUpdatedCacheKey$purchases_defaultsRelease(appUserID), date.getTime()).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestampToNow$purchases_defaultsRelease(java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        setCustomerInfoCacheTimestamp$purchases_defaultsRelease(appUserID, this.dateProvider.getNow());
    }

    public final synchronized void setProductEntitlementMappingCacheTimestampToNow$purchases_defaultsRelease() {
        setProductEntitlementMappingCacheTimestamp(this.dateProvider.getNow());
    }

    public final synchronized void setStorefront$purchases_defaultsRelease(java.lang.String countryCode) {
        try {
            kotlin.jvm.internal.m.e(countryCode, "countryCode");
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), java.lang.String.format(com.revenuecat.purchases.strings.BillingStrings.BILLING_STOREFRONT_CACHING, java.util.Arrays.copyOf(new java.lang.Object[]{countryCode}, 1)));
            }
            this.preferences.edit().putString(getStorefrontCacheKey$purchases_defaultsRelease(), countryCode).apply();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final android.content.SharedPreferences.Editor startEditing$purchases_defaultsRelease() {
        android.content.SharedPreferences.Editor editorEdit = this.preferences.edit();
        kotlin.jvm.internal.m.d(editorEdit, "preferences.edit()");
        return editorEdit;
    }

    public final java.lang.String virtualCurrenciesCacheKey$purchases_defaultsRelease(java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        return getVirtualCurrenciesCacheBaseKey() + '.' + appUserID;
    }

    public final java.lang.String virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsRelease(java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        return getVirtualCurrenciesLastUpdatedCacheBaseKey() + '.' + appUserID;
    }

    public final synchronized android.content.SharedPreferences.Editor cacheAppUserID$purchases_defaultsRelease(java.lang.String appUserID, android.content.SharedPreferences.Editor cacheEditor) {
        android.content.SharedPreferences.Editor editorPutString;
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(cacheEditor, "cacheEditor");
        editorPutString = cacheEditor.putString(getAppUserIDCacheKey$purchases_defaultsRelease(), appUserID);
        kotlin.jvm.internal.m.d(editorPutString, "cacheEditor.putString(ap…serIDCacheKey, appUserID)");
        return editorPutString;
    }

    public final synchronized void clearCustomerInfoCache$purchases_defaultsRelease(java.lang.String appUserID, android.content.SharedPreferences.Editor editor) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(editor, "editor");
        clearCustomerInfoCacheTimestamp(editor, appUserID);
        editor.remove(customerInfoCacheKey$purchases_defaultsRelease(appUserID));
    }

    public final synchronized void clearVirtualCurrenciesCache$purchases_defaultsRelease(java.lang.String appUserID, android.content.SharedPreferences.Editor editor) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(editor, "editor");
        clearVirtualCurrenciesCacheTimestamp(editor, appUserID);
        clearVirtualCurrenciesCache(editor, appUserID);
    }

    public /* synthetic */ DeviceCache(android.content.SharedPreferences sharedPreferences, java.lang.String str, com.revenuecat.purchases.common.DateProvider dateProvider, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(sharedPreferences, str, (i3 & 4) != 0 ? new com.revenuecat.purchases.common.DefaultDateProvider() : dateProvider);
    }
}
