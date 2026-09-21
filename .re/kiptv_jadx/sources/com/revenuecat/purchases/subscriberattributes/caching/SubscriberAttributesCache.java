package com.revenuecat.purchases.subscriberattributes.caching;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000e\u001a\u00020\r*\u00020\u00022*\u0010\f\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n*\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001b\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u001b\u0010\u001dJ1\u0010\u001e\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000b¢\u0006\u0004\b\u001e\u0010\u001cJ%\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b!\u0010 J\u001d\u0010\"\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010*\u001a\u00020\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;)V", "", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "updatedSubscriberAttributesForAll", "Lh6/A;", "putAttributes", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Ljava/util/Map;)V", "currentAppUserID", "Landroid/content/SharedPreferences$Editor;", "cacheEditor", "deleteSyncedSubscriberAttributesForOtherUsers", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)V", "appUserID", "filterUnsynced", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", "attributesToBeSet", "setAttributes", "(Ljava/lang/String;Ljava/util/Map;)V", "getAllStoredSubscriberAttributes", "()Ljava/util/Map;", "(Ljava/lang/String;)Ljava/util/Map;", "getUnsyncedSubscriberAttributes", "clearAllSubscriberAttributesFromUser", "(Ljava/lang/String;)V", "clearSubscriberAttributesIfSyncedForSubscriber", "cleanUpSubscriberAttributeCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "getDeviceCache$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/common/caching/DeviceCache;", "subscriberAttributesCacheKey$delegate", "Lh6/h;", "getSubscriberAttributesCacheKey$purchases_defaultsRelease", "()Ljava/lang/String;", "subscriberAttributesCacheKey", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SubscriberAttributesCache {
    private final com.revenuecat.purchases.common.caching.DeviceCache deviceCache;

    /* JADX INFO: renamed from: subscriberAttributesCacheKey$delegate, reason: from kotlin metadata */
    private final p070h6.h subscriberAttributesCacheKey;

    public SubscriberAttributesCache(com.revenuecat.purchases.common.caching.DeviceCache deviceCache) {
        kotlin.jvm.internal.m.e(deviceCache, "deviceCache");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCacheKey = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache$subscriberAttributesCacheKey$2(this));
    }

    private final synchronized void deleteSyncedSubscriberAttributesForOtherUsers(java.lang.String currentAppUserID, android.content.SharedPreferences.Editor cacheEditor) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        java.lang.String str2;
        p070h6.k kVar;
        try {
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
            com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1 subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1 = new com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1(logIntent, currentAppUserID);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (java.lang.String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (java.lang.String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (java.lang.String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (java.lang.String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (java.lang.String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (java.lang.String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (java.lang.String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (java.lang.String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (java.lang.String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (java.lang.String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke(), null);
                    break;
            }
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            java.util.ArrayList arrayList = new java.util.ArrayList(allStoredSubscriberAttributes.size());
            for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute>> entry : allStoredSubscriberAttributes.entrySet()) {
                java.lang.String key = entry.getKey();
                java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> value = entry.getValue();
                if (kotlin.jvm.internal.m.a(currentAppUserID, key)) {
                    kVar = new p070h6.k(key, value);
                } else {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> entry2 : value.entrySet()) {
                        if (!entry2.getValue().isSynced()) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    kVar = new p070h6.k(key, linkedHashMap);
                }
                arrayList.add(kVar);
            }
            java.util.Map mapX0 = p078i6.C.X0(arrayList);
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry3 : mapX0.entrySet()) {
                if (!((java.util.Map) entry3.getValue()).isEmpty()) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            cacheEditor.putString(getSubscriberAttributesCacheKey$purchases_defaultsRelease(), com.revenuecat.purchases.subscriberattributes.caching.CachingHelpersKt.toJSONObject(linkedHashMap2).toString());
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> filterUnsynced(java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> map, java.lang.String str) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> entry : map.entrySet()) {
            if (!entry.getValue().isSynced()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
        com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1 subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1 = new com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1(logIntent, linkedHashMap, str);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                }
                return linkedHashMap;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke(), null);
                return linkedHashMap;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    currentLogHandler4.d(com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke(), null);
                return linkedHashMap;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    currentLogHandler6.d(com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    currentLogHandler7.d(com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler8.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler9 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler9.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke(), null);
                return linkedHashMap;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler10 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler10.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke(), null);
                return linkedHashMap;
            default:
                return linkedHashMap;
        }
    }

    private final void putAttributes(com.revenuecat.purchases.common.caching.DeviceCache deviceCache, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute>> map) {
        com.revenuecat.purchases.common.caching.DeviceCache deviceCache2 = this.deviceCache;
        java.lang.String subscriberAttributesCacheKey$purchases_defaultsRelease = getSubscriberAttributesCacheKey$purchases_defaultsRelease();
        java.lang.String string = com.revenuecat.purchases.subscriberattributes.caching.CachingHelpersKt.toJSONObject(map).toString();
        kotlin.jvm.internal.m.d(string, "updatedSubscriberAttribu…toJSONObject().toString()");
        deviceCache2.putString$purchases_defaultsRelease(subscriberAttributesCacheKey$purchases_defaultsRelease, string);
    }

    public final synchronized void cleanUpSubscriberAttributeCache(java.lang.String currentAppUserID, android.content.SharedPreferences.Editor cacheEditor) {
        kotlin.jvm.internal.m.e(currentAppUserID, "currentAppUserID");
        kotlin.jvm.internal.m.e(cacheEditor, "cacheEditor");
        com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesMigrationExtensionsKt.migrateSubscriberAttributesIfNeeded(this, cacheEditor);
        deleteSyncedSubscriberAttributesForOtherUsers(currentAppUserID, cacheEditor);
    }

    public final synchronized void clearAllSubscriberAttributesFromUser(java.lang.String appUserID) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        java.lang.String str2;
        try {
            kotlin.jvm.internal.m.e(appUserID, "appUserID");
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
            com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1 subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1 = new com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1(logIntent, appUserID);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (java.lang.String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (java.lang.String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (java.lang.String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (java.lang.String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (java.lang.String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (java.lang.String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (java.lang.String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (java.lang.String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (java.lang.String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (java.lang.String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke(), null);
                    break;
            }
            java.util.LinkedHashMap linkedHashMapZ0 = p078i6.C.Z0(getAllStoredSubscriberAttributes());
            linkedHashMapZ0.remove(appUserID);
            putAttributes(this.deviceCache, p078i6.C.Y0(linkedHashMapZ0));
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void clearSubscriberAttributesIfSyncedForSubscriber(java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        if (getUnsyncedSubscriberAttributes(appUserID).isEmpty()) {
            clearAllSubscriberAttributesFromUser(appUserID);
        }
    }

    public final synchronized java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute>> getAllStoredSubscriberAttributes() {
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute>> mapBuildSubscriberAttributesMapPerUser;
        try {
            org.json.JSONObject jSONObjectOrNull$purchases_defaultsRelease = this.deviceCache.getJSONObjectOrNull$purchases_defaultsRelease(getSubscriberAttributesCacheKey$purchases_defaultsRelease());
            if (jSONObjectOrNull$purchases_defaultsRelease == null || (mapBuildSubscriberAttributesMapPerUser = com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt.buildSubscriberAttributesMapPerUser(jSONObjectOrNull$purchases_defaultsRelease)) == null) {
                mapBuildSubscriberAttributesMapPerUser = p078i6.x.f23206h;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return mapBuildSubscriberAttributesMapPerUser;
    }

    /* JADX INFO: renamed from: getDeviceCache$purchases_defaultsRelease, reason: from getter */
    public final com.revenuecat.purchases.common.caching.DeviceCache getDeviceCache() {
        return this.deviceCache;
    }

    public final java.lang.String getSubscriberAttributesCacheKey$purchases_defaultsRelease() {
        return (java.lang.String) this.subscriberAttributesCacheKey.getValue();
    }

    public final synchronized java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute>> getUnsyncedSubscriberAttributes() {
        java.util.LinkedHashMap linkedHashMap;
        try {
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(p078i6.D.I0(allStoredSubscriberAttributes.size()));
            for (java.lang.Object obj : allStoredSubscriberAttributes.entrySet()) {
                java.lang.Object key = ((java.util.Map.Entry) obj).getKey();
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                linkedHashMap2.put(key, filterUnsynced((java.util.Map) entry.getValue(), (java.lang.String) entry.getKey()));
            }
            linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (!((java.util.Map) entry2.getValue()).isEmpty()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return linkedHashMap;
    }

    public final synchronized void setAttributes(java.lang.String appUserID, java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> attributesToBeSet) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(attributesToBeSet, "attributesToBeSet");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
        java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> map = allStoredSubscriberAttributes.get(appUserID);
        if (map == null) {
            map = p078i6.x.f23206h;
        }
        putAttributes(this.deviceCache, p078i6.C.R0(allStoredSubscriberAttributes, p078i6.D.J0(new p070h6.k(appUserID, p078i6.C.R0(map, attributesToBeSet)))));
    }

    public final synchronized java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> getAllStoredSubscriberAttributes(java.lang.String appUserID) {
        java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> map;
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        map = getAllStoredSubscriberAttributes().get(appUserID);
        if (map == null) {
            map = p078i6.x.f23206h;
        }
        return map;
    }

    public final synchronized java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> getUnsyncedSubscriberAttributes(java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        return filterUnsynced(getAllStoredSubscriberAttributes(appUserID), appUserID);
    }
}
