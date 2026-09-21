package com.revenuecat.purchases.amazon;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonCache;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;)V", "", "", "receiptsToSkus", "Lh6/A;", "cacheSkusByToken", "(Ljava/util/Map;)V", "getReceiptSkus", "()Ljava/util/Map;", "token", "", "isAutoRenewing", "addSuccessfullyPostedToken", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "amazonPostedTokensKey$delegate", "Lh6/h;", "getAmazonPostedTokensKey$purchases_defaultsRelease", "()Ljava/lang/String;", "amazonPostedTokensKey", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AmazonCache {

    /* JADX INFO: renamed from: amazonPostedTokensKey$delegate, reason: from kotlin metadata */
    private final p070h6.h amazonPostedTokensKey;
    private final com.revenuecat.purchases.common.caching.DeviceCache deviceCache;

    public AmazonCache(com.revenuecat.purchases.common.caching.DeviceCache deviceCache) {
        kotlin.jvm.internal.m.e(deviceCache, "deviceCache");
        this.deviceCache = deviceCache;
        this.amazonPostedTokensKey = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.amazon.AmazonCache$amazonPostedTokensKey$2(this));
    }

    public static /* synthetic */ void addSuccessfullyPostedToken$default(com.revenuecat.purchases.amazon.AmazonCache amazonCache, java.lang.String str, java.lang.Boolean bool, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            bool = null;
        }
        amazonCache.addSuccessfullyPostedToken(str, bool);
    }

    public final synchronized void addSuccessfullyPostedToken(java.lang.String token, java.lang.Boolean isAutoRenewing) {
        kotlin.jvm.internal.m.e(token, "token");
        this.deviceCache.addSuccessfullyPostedToken(token, isAutoRenewing);
    }

    public final synchronized void cacheSkusByToken(java.util.Map<java.lang.String, java.lang.String> receiptsToSkus) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        java.lang.String str2;
        try {
            kotlin.jvm.internal.m.e(receiptsToSkus, "receiptsToSkus");
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
            com.revenuecat.purchases.amazon.AmazonCache$cacheSkusByToken$$inlined$log$1 amazonCache$cacheSkusByToken$$inlined$log$1 = new com.revenuecat.purchases.amazon.AmazonCache$cacheSkusByToken$$inlined$log$1(logIntent, receiptsToSkus);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (java.lang.String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (java.lang.String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (java.lang.String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (java.lang.String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (java.lang.String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (java.lang.String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (java.lang.String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (java.lang.String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (java.lang.String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (java.lang.String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke(), null);
                    break;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(p078i6.C.R0(getReceiptSkus(), receiptsToSkus));
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("receiptsToSkus", jSONObject);
            com.revenuecat.purchases.common.caching.DeviceCache deviceCache = this.deviceCache;
            java.lang.String amazonPostedTokensKey$purchases_defaultsRelease = getAmazonPostedTokensKey$purchases_defaultsRelease();
            java.lang.String string = jSONObject2.toString();
            kotlin.jvm.internal.m.d(string, "jsonToCache.toString()");
            deviceCache.putString$purchases_defaultsRelease(amazonPostedTokensKey$purchases_defaultsRelease, string);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final java.lang.String getAmazonPostedTokensKey$purchases_defaultsRelease() {
        return (java.lang.String) this.amazonPostedTokensKey.getValue();
    }

    public final synchronized java.util.Map<java.lang.String, java.lang.String> getReceiptSkus() {
        java.util.Map<java.lang.String, java.lang.String> map$default;
        try {
            org.json.JSONObject jSONObjectOrNull$purchases_defaultsRelease = this.deviceCache.getJSONObjectOrNull$purchases_defaultsRelease(getAmazonPostedTokensKey$purchases_defaultsRelease());
            org.json.JSONObject jSONObject = jSONObjectOrNull$purchases_defaultsRelease != null ? jSONObjectOrNull$purchases_defaultsRelease.getJSONObject("receiptsToSkus") : null;
            if (jSONObject == null || (map$default = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.toMap$default(jSONObject, false, 1, null)) == null) {
                map$default = p078i6.x.f23206h;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return map$default;
    }
}
