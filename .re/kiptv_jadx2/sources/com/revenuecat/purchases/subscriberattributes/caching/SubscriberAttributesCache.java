package com.revenuecat.purchases.subscriberattributes.caching;

import android.content.SharedPreferences;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.D;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import p070h6.h;
import p070h6.k;
import p078i6.C;
import p078i6.x;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000e\u001a\u00020\r*\u00020\u00022*\u0010\f\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n*\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001b\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u001b\u0010\u001dJ1\u0010\u001e\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000b¢\u0006\u0004\b\u001e\u0010\u001cJ%\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b!\u0010 J\u001d\u0010\"\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010*\u001a\u00020\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;)V", "", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "updatedSubscriberAttributesForAll", "Lh6/A;", "putAttributes", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Ljava/util/Map;)V", "currentAppUserID", "Landroid/content/SharedPreferences$Editor;", "cacheEditor", "deleteSyncedSubscriberAttributesForOtherUsers", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)V", "appUserID", "filterUnsynced", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", "attributesToBeSet", "setAttributes", "(Ljava/lang/String;Ljava/util/Map;)V", "getAllStoredSubscriberAttributes", "()Ljava/util/Map;", "(Ljava/lang/String;)Ljava/util/Map;", "getUnsyncedSubscriberAttributes", "clearAllSubscriberAttributesFromUser", "(Ljava/lang/String;)V", "clearSubscriberAttributesIfSyncedForSubscriber", "cleanUpSubscriberAttributeCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "getDeviceCache$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/common/caching/DeviceCache;", "subscriberAttributesCacheKey$delegate", "Lh6/h;", "getSubscriberAttributesCacheKey$purchases_defaultsRelease", "()Ljava/lang/String;", "subscriberAttributesCacheKey", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SubscriberAttributesCache {
    private final DeviceCache deviceCache;

    private final h subscriberAttributesCacheKey;

    public SubscriberAttributesCache(DeviceCache deviceCache) {
        m.e(deviceCache, "deviceCache");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCacheKey = D.B(new SubscriberAttributesCache$subscriberAttributesCacheKey$2(this));
    }

    private final synchronized void deleteSyncedSubscriberAttributesForOtherUsers(String currentAppUserID, SharedPreferences.Editor cacheEditor) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        k kVar;
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            SubscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1 subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1 = new SubscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1(logIntent, currentAppUserID);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$deleteSyncedSubscriberAttributesForOtherUsers$$inlined$log$1.invoke(), null);
                    break;
            }
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            ArrayList arrayList = new ArrayList(allStoredSubscriberAttributes.size());
            for (Map.Entry<String, Map<String, SubscriberAttribute>> entry : allStoredSubscriberAttributes.entrySet()) {
                String key = entry.getKey();
                Map<String, SubscriberAttribute> value = entry.getValue();
                if (m.a(currentAppUserID, key)) {
                    kVar = new k(key, value);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, SubscriberAttribute> entry2 : value.entrySet()) {
                        if (!entry2.getValue().isSynced()) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    kVar = new k(key, linkedHashMap);
                }
                arrayList.add(kVar);
            }
            Map mapX0 = C.X0(arrayList);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry3 : mapX0.entrySet()) {
                if (!((Map) entry3.getValue()).isEmpty()) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            cacheEditor.putString(getSubscriberAttributesCacheKey$purchases_defaultsRelease(), CachingHelpersKt.toJSONObject(linkedHashMap2).toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    private final Map<String, SubscriberAttribute> filterUnsynced(Map<String, SubscriberAttribute> map, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            if (!entry.getValue().isSynced()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LogIntent logIntent = LogIntent.DEBUG;
        SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1 subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1 = new SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1(logIntent, linkedHashMap, str);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d(M0.m(logLevel, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                }
                return linkedHashMap;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke(), null);
                return linkedHashMap;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(M0.m(logLevel2, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(M0.m(logLevel3, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    currentLogHandler4.d(M0.m(logLevel4, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke(), null);
                return linkedHashMap;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i(M0.m(logLevel5, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    currentLogHandler6.d(M0.m(logLevel6, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    currentLogHandler7.d(M0.m(logLevel7, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler8.w(M0.m(logLevel8, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler9.w(M0.m(logLevel9, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke(), null);
                return linkedHashMap;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler10.w(M0.m(logLevel10, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke());
                    return linkedHashMap;
                }
                return linkedHashMap;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1.invoke(), null);
                return linkedHashMap;
            default:
                return linkedHashMap;
        }
    }

    private final void putAttributes(DeviceCache deviceCache, Map<String, ? extends Map<String, SubscriberAttribute>> map) {
        DeviceCache deviceCache2 = this.deviceCache;
        String subscriberAttributesCacheKey$purchases_defaultsRelease = getSubscriberAttributesCacheKey$purchases_defaultsRelease();
        String string = CachingHelpersKt.toJSONObject(map).toString();
        m.d(string, "updatedSubscriberAttribu…toJSONObject().toString()");
        deviceCache2.putString$purchases_defaultsRelease(subscriberAttributesCacheKey$purchases_defaultsRelease, string);
    }

    public final synchronized void cleanUpSubscriberAttributeCache(String currentAppUserID, SharedPreferences.Editor cacheEditor) {
        m.e(currentAppUserID, "currentAppUserID");
        m.e(cacheEditor, "cacheEditor");
        SubscriberAttributesMigrationExtensionsKt.migrateSubscriberAttributesIfNeeded(this, cacheEditor);
        deleteSyncedSubscriberAttributesForOtherUsers(currentAppUserID, cacheEditor);
    }

    public final synchronized void clearAllSubscriberAttributesFromUser(String appUserID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            m.e(appUserID, "appUserID");
            LogIntent logIntent = LogIntent.DEBUG;
            SubscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1 subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1 = new SubscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1(logIntent, appUserID);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesCache$clearAllSubscriberAttributesFromUser$$inlined$log$1.invoke(), null);
                    break;
            }
            LinkedHashMap linkedHashMapZ0 = C.Z0(getAllStoredSubscriberAttributes());
            linkedHashMapZ0.remove(appUserID);
            putAttributes(this.deviceCache, C.Y0(linkedHashMapZ0));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void clearSubscriberAttributesIfSyncedForSubscriber(String appUserID) {
        m.e(appUserID, "appUserID");
        if (getUnsyncedSubscriberAttributes(appUserID).isEmpty()) {
            clearAllSubscriberAttributesFromUser(appUserID);
        }
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getAllStoredSubscriberAttributes() {
        Map<String, Map<String, SubscriberAttribute>> mapBuildSubscriberAttributesMapPerUser;
        try {
            JSONObject jSONObjectOrNull$purchases_defaultsRelease = this.deviceCache.getJSONObjectOrNull$purchases_defaultsRelease(getSubscriberAttributesCacheKey$purchases_defaultsRelease());
            if (jSONObjectOrNull$purchases_defaultsRelease == null || (mapBuildSubscriberAttributesMapPerUser = SubscriberAttributesFactoriesKt.buildSubscriberAttributesMapPerUser(jSONObjectOrNull$purchases_defaultsRelease)) == null) {
                mapBuildSubscriberAttributesMapPerUser = x.f23206h;
            }
        } catch (Throwable th) {
            throw th;
        }
        return mapBuildSubscriberAttributesMapPerUser;
    }

    public final DeviceCache getDeviceCache() {
        return this.deviceCache;
    }

    public final String getSubscriberAttributesCacheKey$purchases_defaultsRelease() {
        return (String) this.subscriberAttributesCacheKey.getValue();
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getUnsyncedSubscriberAttributes() {
        LinkedHashMap linkedHashMap;
        try {
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(p078i6.D.I0(allStoredSubscriberAttributes.size()));
            for (Object obj : allStoredSubscriberAttributes.entrySet()) {
                Object key = ((Map.Entry) obj).getKey();
                Map.Entry entry = (Map.Entry) obj;
                linkedHashMap2.put(key, filterUnsynced((Map) entry.getValue(), (String) entry.getKey()));
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (!((Map) entry2.getValue()).isEmpty()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return linkedHashMap;
    }

    public final synchronized void setAttributes(String appUserID, Map<String, SubscriberAttribute> attributesToBeSet) {
        m.e(appUserID, "appUserID");
        m.e(attributesToBeSet, "attributesToBeSet");
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
        Map<String, SubscriberAttribute> map = allStoredSubscriberAttributes.get(appUserID);
        if (map == null) {
            map = x.f23206h;
        }
        putAttributes(this.deviceCache, C.R0(allStoredSubscriberAttributes, p078i6.D.J0(new k(appUserID, C.R0(map, attributesToBeSet)))));
    }

    public final synchronized Map<String, SubscriberAttribute> getAllStoredSubscriberAttributes(String appUserID) {
        Map<String, SubscriberAttribute> map;
        m.e(appUserID, "appUserID");
        map = getAllStoredSubscriberAttributes().get(appUserID);
        if (map == null) {
            map = x.f23206h;
        }
        return map;
    }

    public final synchronized Map<String, SubscriberAttribute> getUnsyncedSubscriberAttributes(String appUserID) {
        m.e(appUserID, "appUserID");
        return filterUnsynced(getAllStoredSubscriberAttributes(appUserID), appUserID);
    }
}
