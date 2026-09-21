package com.revenuecat.purchases.amazon;

import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.D;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import p070h6.h;
import p078i6.C;
import p078i6.x;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonCache;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;)V", "", "", "receiptsToSkus", "Lh6/A;", "cacheSkusByToken", "(Ljava/util/Map;)V", "getReceiptSkus", "()Ljava/util/Map;", "token", "", "isAutoRenewing", "addSuccessfullyPostedToken", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "amazonPostedTokensKey$delegate", "Lh6/h;", "getAmazonPostedTokensKey$purchases_defaultsRelease", "()Ljava/lang/String;", "amazonPostedTokensKey", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AmazonCache {

    private final h amazonPostedTokensKey;
    private final DeviceCache deviceCache;

    public AmazonCache(DeviceCache deviceCache) {
        m.e(deviceCache, "deviceCache");
        this.deviceCache = deviceCache;
        this.amazonPostedTokensKey = D.B(new AmazonCache$amazonPostedTokensKey$2(this));
    }

    public static void addSuccessfullyPostedToken$default(AmazonCache amazonCache, String str, Boolean bool, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            bool = null;
        }
        amazonCache.addSuccessfullyPostedToken(str, bool);
    }

    public final synchronized void addSuccessfullyPostedToken(String token, Boolean isAutoRenewing) {
        m.e(token, "token");
        this.deviceCache.addSuccessfullyPostedToken(token, isAutoRenewing);
    }

    public final synchronized void cacheSkusByToken(Map<String, String> receiptsToSkus) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            m.e(receiptsToSkus, "receiptsToSkus");
            LogIntent logIntent = LogIntent.DEBUG;
            AmazonCache$cacheSkusByToken$$inlined$log$1 amazonCache$cacheSkusByToken$$inlined$log$1 = new AmazonCache$cacheSkusByToken$$inlined$log$1(logIntent, receiptsToSkus);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonCache$cacheSkusByToken$$inlined$log$1.invoke(), null);
                    break;
            }
            JSONObject jSONObject = new JSONObject(C.R0(getReceiptSkus(), receiptsToSkus));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("receiptsToSkus", jSONObject);
            DeviceCache deviceCache = this.deviceCache;
            String amazonPostedTokensKey$purchases_defaultsRelease = getAmazonPostedTokensKey$purchases_defaultsRelease();
            String string = jSONObject2.toString();
            m.d(string, "jsonToCache.toString()");
            deviceCache.putString$purchases_defaultsRelease(amazonPostedTokensKey$purchases_defaultsRelease, string);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String getAmazonPostedTokensKey$purchases_defaultsRelease() {
        return (String) this.amazonPostedTokensKey.getValue();
    }

    public final synchronized Map<String, String> getReceiptSkus() {
        Map<String, String> map$default;
        try {
            JSONObject jSONObjectOrNull$purchases_defaultsRelease = this.deviceCache.getJSONObjectOrNull$purchases_defaultsRelease(getAmazonPostedTokensKey$purchases_defaultsRelease());
            JSONObject jSONObject = jSONObjectOrNull$purchases_defaultsRelease != null ? jSONObjectOrNull$purchases_defaultsRelease.getJSONObject("receiptsToSkus") : null;
            if (jSONObject == null || (map$default = JSONObjectExtensionsKt.toMap$default(jSONObject, false, 1, null)) == null) {
                map$default = x.f23206h;
            }
        } catch (Throwable th) {
            throw th;
        }
        return map$default;
    }
}
