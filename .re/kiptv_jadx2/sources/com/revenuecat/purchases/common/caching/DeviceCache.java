package com.revenuecat.purchases.common.caching;

import android.content.SharedPreferences;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.D;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.CustomerInfoOriginalSource;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrenciesFactory;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;
import p070h6.h;
import p078i6.C;
import p078i6.o;
import p078i6.q;
import p078i6.x;
import p078i6.y;
import p119n8.j;
import p162s8.d;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b:\b\u0017\u0018\u0000 Ó\u00012\u00020\u0001:\u0002Ó\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010$\u001a\u0004\u0018\u00010!2\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010%\u001a\u00020!H\u0000¢\u0006\u0004\b&\u0010'J\u001f\u0010-\u001a\u00020)2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b.\u0010\u0016J\u0017\u00101\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b0\u0010\u0016J\u001f\u00101\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u00102\u001a\u00020\nH\u0000¢\u0006\u0004\b0\u00103J\u0017\u00105\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b4\u0010\u0016J\u001f\u0010:\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b8\u00109J\u0017\u0010=\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u0004H\u0000¢\u0006\u0004\b<\u0010\u0016J\u0011\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b>\u0010\u000fJ\u0017\u0010@\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\b?\u0010\u001dJ\u0017\u0010B\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0001¢\u0006\u0004\bA\u0010\u001dJ\u0019\u0010F\u001a\u0004\u0018\u00010C2\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\bD\u0010EJ\u001f\u0010J\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010G\u001a\u00020CH\u0000¢\u0006\u0004\bH\u0010IJ\u001f\u0010L\u001a\u00020)2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\bK\u0010,J\u0017\u0010N\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\bM\u0010\u0016J\u001f\u0010N\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u00102\u001a\u00020\nH\u0000¢\u0006\u0004\bM\u00103J\u000f\u0010Q\u001a\u00020\u0014H\u0000¢\u0006\u0004\bO\u0010PJ\u0015\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00040RH\u0000¢\u0006\u0004\bS\u0010TJ#\u0010X\u001a\u00020\u00142\u0006\u0010V\u001a\u00020\u00042\n\b\u0002\u0010W\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\bX\u0010YJ\u001d\u0010]\u001a\u00020\u00142\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00040RH\u0000¢\u0006\u0004\b[\u0010\\J)\u0010c\u001a\b\u0012\u0004\u0012\u00020_0`2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020_0^H\u0000¢\u0006\u0004\ba\u0010bJ)\u0010e\u001a\b\u0012\u0004\u0012\u00020_0`2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020_0^H\u0000¢\u0006\u0004\bd\u0010bJ#\u0010h\u001a\u00020\u00142\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020_0^H\u0000¢\u0006\u0004\bf\u0010gJ\u0011\u0010l\u001a\u0004\u0018\u00010iH\u0000¢\u0006\u0004\bj\u0010kJ\u0017\u0010p\u001a\u00020\u00142\u0006\u0010m\u001a\u00020iH\u0000¢\u0006\u0004\bn\u0010oJ\u000f\u0010r\u001a\u00020\u0014H\u0000¢\u0006\u0004\bq\u0010PJ\u0017\u0010w\u001a\u00020\u00142\u0006\u0010t\u001a\u00020sH\u0000¢\u0006\u0004\bu\u0010vJ\u000f\u0010y\u001a\u00020\u0014H\u0001¢\u0006\u0004\bx\u0010PJ\u000f\u0010|\u001a\u00020)H\u0000¢\u0006\u0004\bz\u0010{J\u0011\u0010\u007f\u001a\u0004\u0018\u00010sH\u0000¢\u0006\u0004\b}\u0010~J\u001d\u0010\u0083\u0001\u001a\u0004\u0018\u00010i2\u0007\u0010\u0080\u0001\u001a\u00020\u0004H\u0010¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J$\u0010\u0088\u0001\u001a\u00020\u00142\u0007\u0010\u0084\u0001\u001a\u00020\u00042\u0007\u0010\u0085\u0001\u001a\u00020\u0004H\u0010¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u008a\u0001\u001a\u00020\u00142\u0007\u0010\u0084\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0005\b\u0089\u0001\u0010\u0016J!\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040R2\u0007\u0010\u0084\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001a\u0010\u008f\u0001\u001a\u00020\u00042\u0007\u0010\u0080\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0005\b\u008e\u0001\u0010\u001dJ\u0016\u0010\u0090\u0001\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0016\u0010\u0092\u0001\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J\u001c\u0010/\u001a\u00020\n*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0005\b/\u0010\u0093\u0001J\u001a\u0010\u0094\u0001\u001a\u0002062\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0019\u0010\u0096\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0005\b\u0096\u0001\u0010\u0016J!\u0010\u0097\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0005\b\u0097\u0001\u00109J\u001a\u0010\u0098\u0001\u001a\u0002062\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0095\u0001J\u001e\u0010\u0099\u0001\u001a\u00020\n*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u0093\u0001J\u001c\u0010N\u001a\u00020\n*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0005\bN\u0010\u0093\u0001J\u001f\u0010\u009b\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u009a\u00010^H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001f\u0010\u009d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u009a\u00010^H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009c\u0001J'\u0010\u009f\u0001\u001a\u00020\u00142\u0014\u0010\u009e\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u009a\u00010^H\u0002¢\u0006\u0005\b\u009f\u0001\u0010gJ\u001a\u0010 \u0001\u001a\u00020\u00142\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0014\u0010¢\u0001\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010¤\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010¥\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010¦\u0001R\u001f\u0010ª\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0005\b©\u0001\u0010\u000fR&\u0010®\u0001\u001a\u00020\u00048@X\u0081\u0084\u0002¢\u0006\u0016\n\u0006\b«\u0001\u0010¨\u0001\u0012\u0005\b\u00ad\u0001\u0010P\u001a\u0005\b¬\u0001\u0010\u000fR&\u0010²\u0001\u001a\u00020\u00048@X\u0081\u0084\u0002¢\u0006\u0016\n\u0006\b¯\u0001\u0010¨\u0001\u0012\u0005\b±\u0001\u0010P\u001a\u0005\b°\u0001\u0010\u000fR\u001e\u0010³\u0001\u001a\u00020\u00048\u0000X\u0080D¢\u0006\u000f\n\u0006\b³\u0001\u0010¥\u0001\u001a\u0005\b´\u0001\u0010\u000fR\u001f\u0010·\u0001\u001a\u00020\u00048@X\u0080\u0084\u0002¢\u0006\u000f\n\u0006\bµ\u0001\u0010¨\u0001\u001a\u0005\b¶\u0001\u0010\u000fR\u001f\u0010º\u0001\u001a\u00020\u00048@X\u0080\u0084\u0002¢\u0006\u000f\n\u0006\b¸\u0001\u0010¨\u0001\u001a\u0005\b¹\u0001\u0010\u000fR(\u0010»\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u009a\u0001\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R&\u0010À\u0001\u001a\u00020\u00048@X\u0081\u0084\u0002¢\u0006\u0016\n\u0006\b½\u0001\u0010¨\u0001\u0012\u0005\b¿\u0001\u0010P\u001a\u0005\b¾\u0001\u0010\u000fR\u001f\u0010Ã\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÁ\u0001\u0010¨\u0001\u001a\u0005\bÂ\u0001\u0010\u000fR\u001f\u0010Æ\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÄ\u0001\u0010¨\u0001\u001a\u0005\bÅ\u0001\u0010\u000fR\u001f\u0010É\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÇ\u0001\u0010¨\u0001\u001a\u0005\bÈ\u0001\u0010\u000fR\u001f\u0010Ì\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÊ\u0001\u0010¨\u0001\u001a\u0005\bË\u0001\u0010\u000fR\u001f\u0010Ï\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÍ\u0001\u0010¨\u0001\u001a\u0005\bÎ\u0001\u0010\u000fR\u001f\u0010Ò\u0001\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÐ\u0001\u0010¨\u0001\u001a\u0005\bÑ\u0001\u0010\u000f¨\u0006Ô\u0001"}, d2 = {"Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "Landroid/content/SharedPreferences;", "preferences", "", "apiKey", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lcom/revenuecat/purchases/common/DateProvider;)V", "Landroid/content/SharedPreferences$Editor;", "startEditing$purchases_defaultsRelease", "()Landroid/content/SharedPreferences$Editor;", "startEditing", "getLegacyCachedAppUserID$purchases_defaultsRelease", "()Ljava/lang/String;", "getLegacyCachedAppUserID", "getCachedAppUserID$purchases_defaultsRelease", "getCachedAppUserID", "appUserID", "Lh6/A;", "cacheAppUserID$purchases_defaultsRelease", "(Ljava/lang/String;)V", "cacheAppUserID", "cacheEditor", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)Landroid/content/SharedPreferences$Editor;", "clearCachesForAppUserID$purchases_defaultsRelease", "clearCachesForAppUserID", "customerInfoCacheKey$purchases_defaultsRelease", "(Ljava/lang/String;)Ljava/lang/String;", "customerInfoCacheKey", "customerInfoLastUpdatedCacheKey$purchases_defaultsRelease", "customerInfoLastUpdatedCacheKey", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo$purchases_defaultsRelease", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", "info", "cacheCustomerInfo$purchases_defaultsRelease", "(Ljava/lang/String;Lcom/revenuecat/purchases/CustomerInfo;)V", "cacheCustomerInfo", "", "appInBackground", "isCustomerInfoCacheStale$purchases_defaultsRelease", "(Ljava/lang/String;Z)Z", "isCustomerInfoCacheStale", "clearCustomerInfoCacheTimestamp$purchases_defaultsRelease", "clearCustomerInfoCacheTimestamp", "clearCustomerInfoCache$purchases_defaultsRelease", "clearCustomerInfoCache", "editor", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)V", "setCustomerInfoCacheTimestampToNow$purchases_defaultsRelease", "setCustomerInfoCacheTimestampToNow", "Ljava/util/Date;", "date", "setCustomerInfoCacheTimestamp$purchases_defaultsRelease", "(Ljava/lang/String;Ljava/util/Date;)V", "setCustomerInfoCacheTimestamp", "countryCode", "setStorefront$purchases_defaultsRelease", "setStorefront", "getStorefront", "virtualCurrenciesCacheKey$purchases_defaultsRelease", "virtualCurrenciesCacheKey", "virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsRelease", "virtualCurrenciesLastUpdatedCacheKey", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "getCachedVirtualCurrencies$purchases_defaultsRelease", "(Ljava/lang/String;)Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "getCachedVirtualCurrencies", "virtualCurrencies", "cacheVirtualCurrencies$purchases_defaultsRelease", "(Ljava/lang/String;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;)V", "cacheVirtualCurrencies", "isVirtualCurrenciesCacheStale$purchases_defaultsRelease", "isVirtualCurrenciesCacheStale", "clearVirtualCurrenciesCache$purchases_defaultsRelease", "clearVirtualCurrenciesCache", "cleanupOldAttributionData$purchases_defaultsRelease", "()V", "cleanupOldAttributionData", "", "getPreviouslySentHashedTokens$purchases_defaultsRelease", "()Ljava/util/Set;", "getPreviouslySentHashedTokens", "token", "isAutoRenewing", "addSuccessfullyPostedToken", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "hashedTokens", "cleanPreviouslySentTokens$purchases_defaultsRelease", "(Ljava/util/Set;)V", "cleanPreviouslySentTokens", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "", "getActivePurchasesNotInCache$purchases_defaultsRelease", "(Ljava/util/Map;)Ljava/util/List;", "getActivePurchasesNotInCache", "getPurchasesWithAutoRenewingChange$purchases_defaultsRelease", "getPurchasesWithAutoRenewingChange", "saveAutoRenewingStatus$purchases_defaultsRelease", "(Ljava/util/Map;)V", "saveAutoRenewingStatus", "Lorg/json/JSONObject;", "getOfferingsResponseCache$purchases_defaultsRelease", "()Lorg/json/JSONObject;", "getOfferingsResponseCache", "offeringsResponse", "cacheOfferingsResponse$purchases_defaultsRelease", "(Lorg/json/JSONObject;)V", "cacheOfferingsResponse", "clearOfferingsResponseCache$purchases_defaultsRelease", "clearOfferingsResponseCache", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "cacheProductEntitlementMapping$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)V", "cacheProductEntitlementMapping", "setProductEntitlementMappingCacheTimestampToNow$purchases_defaultsRelease", "setProductEntitlementMappingCacheTimestampToNow", "isProductEntitlementMappingCacheStale$purchases_defaultsRelease", "()Z", "isProductEntitlementMappingCacheStale", "getProductEntitlementMapping$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "getProductEntitlementMapping", SubscriberAttributeKt.JSON_NAME_KEY, "getJSONObjectOrNull$purchases_defaultsRelease", "(Ljava/lang/String;)Lorg/json/JSONObject;", "getJSONObjectOrNull", "cacheKey", "value", "putString$purchases_defaultsRelease", "(Ljava/lang/String;Ljava/lang/String;)V", "putString", "remove$purchases_defaultsRelease", "remove", "findKeysThatStartWith$purchases_defaultsRelease", "(Ljava/lang/String;)Ljava/util/Set;", "findKeysThatStartWith", "newKey$purchases_defaultsRelease", "newKey", "clearCustomerInfo", "(Landroid/content/SharedPreferences$Editor;)Landroid/content/SharedPreferences$Editor;", "clearAppUserID", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", "getCustomerInfoCachesLastUpdated", "(Ljava/lang/String;)Ljava/util/Date;", "setVirtualCurrenciesCacheTimestampToNow", "setVirtualCurrenciesCacheTimestamp", "getVirtualCurrenciesCacheLastUpdated", "clearVirtualCurrenciesCacheTimestamp", "Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;", "getTokenMap", "()Ljava/util/Map;", "loadTokenMapFromPreferences", "tokenMap", "saveTokenMap", "setProductEntitlementMappingCacheTimestamp", "(Ljava/util/Date;)V", "getProductEntitlementMappingLastUpdated", "()Ljava/util/Date;", "Landroid/content/SharedPreferences;", "Ljava/lang/String;", "Lcom/revenuecat/purchases/common/DateProvider;", "apiKeyPrefix$delegate", "Lh6/h;", "getApiKeyPrefix", "apiKeyPrefix", "legacyAppUserIDCacheKey$delegate", "getLegacyAppUserIDCacheKey$purchases_defaultsRelease", "getLegacyAppUserIDCacheKey$purchases_defaultsRelease$annotations", "legacyAppUserIDCacheKey", "appUserIDCacheKey$delegate", "getAppUserIDCacheKey$purchases_defaultsRelease", "getAppUserIDCacheKey$purchases_defaultsRelease$annotations", "appUserIDCacheKey", "attributionCacheKey", "getAttributionCacheKey$purchases_defaultsRelease", "legacyTokensCacheKey$delegate", "getLegacyTokensCacheKey$purchases_defaultsRelease", "legacyTokensCacheKey", "tokensCacheKey$delegate", "getTokensCacheKey$purchases_defaultsRelease", "tokensCacheKey", "tokenMapCache", "Ljava/util/Map;", "storefrontCacheKey$delegate", "getStorefrontCacheKey$purchases_defaultsRelease", "getStorefrontCacheKey$purchases_defaultsRelease$annotations", "storefrontCacheKey", "productEntitlementMappingCacheKey$delegate", "getProductEntitlementMappingCacheKey", "productEntitlementMappingCacheKey", "productEntitlementMappingLastUpdatedCacheKey$delegate", "getProductEntitlementMappingLastUpdatedCacheKey", "productEntitlementMappingLastUpdatedCacheKey", "customerInfoCachesLastUpdatedCacheBaseKey$delegate", "getCustomerInfoCachesLastUpdatedCacheBaseKey", "customerInfoCachesLastUpdatedCacheBaseKey", "virtualCurrenciesCacheBaseKey$delegate", "getVirtualCurrenciesCacheBaseKey", "virtualCurrenciesCacheBaseKey", "virtualCurrenciesLastUpdatedCacheBaseKey$delegate", "getVirtualCurrenciesLastUpdatedCacheBaseKey", "virtualCurrenciesLastUpdatedCacheBaseKey", "offeringsResponseCacheKey$delegate", "getOfferingsResponseCacheKey", "offeringsResponseCacheKey", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class DeviceCache implements StorefrontProvider {
    private static final String CUSTOMER_INFO_ORIGINAL_SOURCE_KEY = "customer_info_original_source";
    private static final String CUSTOMER_INFO_REQUEST_DATE_KEY = "customer_info_request_date";
    private static final String CUSTOMER_INFO_SCHEMA_VERSION_KEY = "schema_version";
    private static final String CUSTOMER_INFO_VERIFICATION_RESULT_KEY = "verification_result";
    private static final Companion Companion = new Companion(null);
    private final String apiKey;

    private final h apiKeyPrefix;

    private final h appUserIDCacheKey;
    private final String attributionCacheKey;

    private final h customerInfoCachesLastUpdatedCacheBaseKey;
    private final DateProvider dateProvider;

    private final h legacyAppUserIDCacheKey;

    private final h legacyTokensCacheKey;

    private final h offeringsResponseCacheKey;
    private final SharedPreferences preferences;

    private final h productEntitlementMappingCacheKey;

    private final h productEntitlementMappingLastUpdatedCacheKey;

    private final h storefrontCacheKey;
    private Map<String, TokenCacheEntry> tokenMapCache;

    private final h tokensCacheKey;

    private final h virtualCurrenciesCacheBaseKey;

    private final h virtualCurrenciesLastUpdatedCacheBaseKey;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/caching/DeviceCache$Companion;", "", "()V", "CUSTOMER_INFO_ORIGINAL_SOURCE_KEY", "", "CUSTOMER_INFO_REQUEST_DATE_KEY", "CUSTOMER_INFO_SCHEMA_VERSION_KEY", "CUSTOMER_INFO_VERIFICATION_RESULT_KEY", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        private Companion() {
        }
    }

    public DeviceCache(SharedPreferences preferences, String apiKey, DateProvider dateProvider) {
        m.e(preferences, "preferences");
        m.e(apiKey, "apiKey");
        m.e(dateProvider, "dateProvider");
        this.preferences = preferences;
        this.apiKey = apiKey;
        this.dateProvider = dateProvider;
        this.apiKeyPrefix = D.B(new DeviceCache$apiKeyPrefix$2(this));
        this.legacyAppUserIDCacheKey = D.B(new DeviceCache$legacyAppUserIDCacheKey$2(this));
        this.appUserIDCacheKey = D.B(new DeviceCache$appUserIDCacheKey$2(this));
        this.attributionCacheKey = "com.revenuecat.purchases..attribution";
        this.legacyTokensCacheKey = D.B(new DeviceCache$legacyTokensCacheKey$2(this));
        this.tokensCacheKey = D.B(new DeviceCache$tokensCacheKey$2(this));
        this.storefrontCacheKey = D.B(DeviceCache$storefrontCacheKey$2.INSTANCE);
        this.productEntitlementMappingCacheKey = D.B(new DeviceCache$productEntitlementMappingCacheKey$2(this));
        this.productEntitlementMappingLastUpdatedCacheKey = D.B(new DeviceCache$productEntitlementMappingLastUpdatedCacheKey$2(this));
        this.customerInfoCachesLastUpdatedCacheBaseKey = D.B(new DeviceCache$customerInfoCachesLastUpdatedCacheBaseKey$2(this));
        this.virtualCurrenciesCacheBaseKey = D.B(new DeviceCache$virtualCurrenciesCacheBaseKey$2(this));
        this.virtualCurrenciesLastUpdatedCacheBaseKey = D.B(new DeviceCache$virtualCurrenciesLastUpdatedCacheBaseKey$2(this));
        this.offeringsResponseCacheKey = D.B(new DeviceCache$offeringsResponseCacheKey$2(this));
    }

    public static void addSuccessfullyPostedToken$default(DeviceCache deviceCache, String str, Boolean bool, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSuccessfullyPostedToken");
        }
        if ((i3 & 2) != 0) {
            bool = null;
        }
        deviceCache.addSuccessfullyPostedToken(str, bool);
    }

    private final SharedPreferences.Editor clearAppUserID(SharedPreferences.Editor editor) {
        editor.remove(getAppUserIDCacheKey$purchases_defaultsRelease());
        editor.remove(getLegacyAppUserIDCacheKey$purchases_defaultsRelease());
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfo(SharedPreferences.Editor editor) {
        String cachedAppUserID$purchases_defaultsRelease = getCachedAppUserID$purchases_defaultsRelease();
        if (cachedAppUserID$purchases_defaultsRelease != null) {
            editor.remove(customerInfoCacheKey$purchases_defaultsRelease(cachedAppUserID$purchases_defaultsRelease));
        }
        String legacyCachedAppUserID$purchases_defaultsRelease = getLegacyCachedAppUserID$purchases_defaultsRelease();
        if (legacyCachedAppUserID$purchases_defaultsRelease != null) {
            editor.remove(customerInfoCacheKey$purchases_defaultsRelease(legacyCachedAppUserID$purchases_defaultsRelease));
        }
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfoCacheTimestamp(SharedPreferences.Editor editor, String str) {
        editor.remove(customerInfoLastUpdatedCacheKey$purchases_defaultsRelease(str));
        return editor;
    }

    private final SharedPreferences.Editor clearVirtualCurrenciesCache(SharedPreferences.Editor editor, String str) {
        editor.remove(virtualCurrenciesCacheKey$purchases_defaultsRelease(str));
        String cachedAppUserID$purchases_defaultsRelease = getCachedAppUserID$purchases_defaultsRelease();
        if (cachedAppUserID$purchases_defaultsRelease != null) {
            editor.remove(virtualCurrenciesCacheKey$purchases_defaultsRelease(cachedAppUserID$purchases_defaultsRelease));
        }
        String legacyCachedAppUserID$purchases_defaultsRelease = getLegacyCachedAppUserID$purchases_defaultsRelease();
        if (legacyCachedAppUserID$purchases_defaultsRelease != null) {
            editor.remove(virtualCurrenciesCacheKey$purchases_defaultsRelease(legacyCachedAppUserID$purchases_defaultsRelease));
        }
        return editor;
    }

    private final SharedPreferences.Editor clearVirtualCurrenciesCacheTimestamp(SharedPreferences.Editor editor, String str) {
        editor.remove(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsRelease(str));
        String cachedAppUserID$purchases_defaultsRelease = getCachedAppUserID$purchases_defaultsRelease();
        if (cachedAppUserID$purchases_defaultsRelease != null) {
            editor.remove(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsRelease(cachedAppUserID$purchases_defaultsRelease));
        }
        String legacyCachedAppUserID$purchases_defaultsRelease = getLegacyCachedAppUserID$purchases_defaultsRelease();
        if (legacyCachedAppUserID$purchases_defaultsRelease != null) {
            editor.remove(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsRelease(legacyCachedAppUserID$purchases_defaultsRelease));
        }
        return editor;
    }

    public final String getApiKeyPrefix() {
        return (String) this.apiKeyPrefix.getValue();
    }

    public static void getAppUserIDCacheKey$purchases_defaultsRelease$annotations() {
    }

    private final synchronized Date getCustomerInfoCachesLastUpdated(String appUserID) {
        return new Date(this.preferences.getLong(customerInfoLastUpdatedCacheKey$purchases_defaultsRelease(appUserID), 0L));
    }

    private final String getCustomerInfoCachesLastUpdatedCacheBaseKey() {
        return (String) this.customerInfoCachesLastUpdatedCacheBaseKey.getValue();
    }

    public static void getLegacyAppUserIDCacheKey$purchases_defaultsRelease$annotations() {
    }

    private final String getOfferingsResponseCacheKey() {
        return (String) this.offeringsResponseCacheKey.getValue();
    }

    private final String getProductEntitlementMappingCacheKey() {
        return (String) this.productEntitlementMappingCacheKey.getValue();
    }

    private final Date getProductEntitlementMappingLastUpdated() {
        if (this.preferences.contains(getProductEntitlementMappingLastUpdatedCacheKey())) {
            return new Date(this.preferences.getLong(getProductEntitlementMappingLastUpdatedCacheKey(), -1L));
        }
        return null;
    }

    private final String getProductEntitlementMappingLastUpdatedCacheKey() {
        return (String) this.productEntitlementMappingLastUpdatedCacheKey.getValue();
    }

    public static void getStorefrontCacheKey$purchases_defaultsRelease$annotations() {
    }

    private final synchronized Map<String, TokenCacheEntry> getTokenMap() {
        Map<String, TokenCacheEntry> map = this.tokenMapCache;
        if (map != null) {
            return map;
        }
        Map<String, TokenCacheEntry> mapLoadTokenMapFromPreferences = loadTokenMapFromPreferences();
        this.tokenMapCache = mapLoadTokenMapFromPreferences;
        return mapLoadTokenMapFromPreferences;
    }

    private final String getVirtualCurrenciesCacheBaseKey() {
        return (String) this.virtualCurrenciesCacheBaseKey.getValue();
    }

    private final synchronized Date getVirtualCurrenciesCacheLastUpdated(String appUserID) {
        return new Date(this.preferences.getLong(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsRelease(appUserID), 0L));
    }

    private final String getVirtualCurrenciesLastUpdatedCacheBaseKey() {
        return (String) this.virtualCurrenciesLastUpdatedCacheBaseKey.getValue();
    }

    private final Map<String, TokenCacheEntry> loadTokenMapFromPreferences() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        String string = this.preferences.getString(getTokensCacheKey$purchases_defaultsRelease(), null);
        x xVar = x.f23206h;
        if (string != null) {
            try {
                return (Map) d.f27387d.b(string, DeviceCacheKt.tokenMapSerializer);
            } catch (j | IllegalArgumentException unused) {
                return xVar;
            }
        }
        try {
            Set<String> stringSet = this.preferences.getStringSet(getLegacyTokensCacheKey$purchases_defaultsRelease(), null);
            Set setR1 = stringSet != null ? o.R1(stringSet) : null;
            if (setR1 != null) {
                Set set = setR1;
                int iI0 = p078i6.D.I0(q.I0(set, 10));
                if (iI0 < 16) {
                    iI0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iI0);
                for (Object obj : set) {
                    linkedHashMap.put(obj, new TokenCacheEntry((Boolean) null, 1, (AbstractC2541f) null));
                }
                saveTokenMap(linkedHashMap);
                this.preferences.edit().remove(getLegacyTokensCacheKey$purchases_defaultsRelease()).apply();
                LogIntent logIntent = LogIntent.DEBUG;
                DeviceCache$loadTokenMapFromPreferences$$inlined$log$1 deviceCache$loadTokenMapFromPreferences$$inlined$log$1 = new DeviceCache$loadTokenMapFromPreferences$$inlined$log$1(logIntent, linkedHashMap);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                        return linkedHashMap;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                        return linkedHashMap;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                        return linkedHashMap;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke());
                            return linkedHashMap;
                        }
                        return linkedHashMap;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$loadTokenMapFromPreferences$$inlined$log$1.invoke(), null);
                        return linkedHashMap;
                    default:
                        return linkedHashMap;
                }
            }
        } catch (ClassCastException unused2) {
        }
        return xVar;
    }

    private final synchronized void saveTokenMap(Map<String, TokenCacheEntry> tokenMap) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            DeviceCache$saveTokenMap$$inlined$log$1 deviceCache$saveTokenMap$$inlined$log$1 = new DeviceCache$saveTokenMap$$inlined$log$1(logIntent, tokenMap);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) deviceCache$saveTokenMap$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) deviceCache$saveTokenMap$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) deviceCache$saveTokenMap$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$saveTokenMap$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$saveTokenMap$$inlined$log$1.invoke(), null);
                    break;
            }
            putString$purchases_defaultsRelease(getTokensCacheKey$purchases_defaultsRelease(), d.f27387d.d(DeviceCacheKt.tokenMapSerializer, tokenMap));
            this.tokenMapCache = tokenMap;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void setProductEntitlementMappingCacheTimestamp(Date date) {
        this.preferences.edit().putLong(getProductEntitlementMappingLastUpdatedCacheKey(), date.getTime()).apply();
    }

    private final synchronized void setVirtualCurrenciesCacheTimestamp(String appUserID, Date date) {
        this.preferences.edit().putLong(virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsRelease(appUserID), date.getTime()).apply();
    }

    private final synchronized void setVirtualCurrenciesCacheTimestampToNow(String appUserID) {
        setVirtualCurrenciesCacheTimestamp(appUserID, this.dateProvider.getNow());
    }

    public final synchronized void addSuccessfullyPostedToken(String token, Boolean isAutoRenewing) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            m.e(token, "token");
            String strSha1 = UtilsKt.sha1(token);
            LogIntent logIntent = LogIntent.DEBUG;
            DeviceCache$addSuccessfullyPostedToken$$inlined$log$1 deviceCache$addSuccessfullyPostedToken$$inlined$log$1 = new DeviceCache$addSuccessfullyPostedToken$$inlined$log$1(logIntent, token, strSha1);
            int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.d("[Purchases] - " + logLevel4.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$1.invoke(), null);
                    break;
            }
            LinkedHashMap linkedHashMapZ0 = C.Z0(getTokenMap());
            DeviceCache$addSuccessfullyPostedToken$$inlined$log$2 deviceCache$addSuccessfullyPostedToken$$inlined$log$2 = new DeviceCache$addSuccessfullyPostedToken$$inlined$log$2(logIntent, linkedHashMapZ0);
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler9.d("[Purchases] - " + logLevel11.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler10.w("[Purchases] - " + logLevel12.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler11.i("[Purchases] - " + logLevel13.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler12.d("[Purchases] - " + logLevel14.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler13.i("[Purchases] - " + logLevel15.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel16.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler15.d("[Purchases] - " + logLevel17.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel18.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel19.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler18.w("[Purchases] - " + logLevel20.name(), (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$addSuccessfullyPostedToken$$inlined$log$2.invoke(), null);
                    break;
            }
            TokenCacheEntry tokenCacheEntry = (TokenCacheEntry) linkedHashMapZ0.get(strSha1);
            if (tokenCacheEntry == null) {
                linkedHashMapZ0.put(strSha1, new TokenCacheEntry(isAutoRenewing));
                saveTokenMap(linkedHashMapZ0);
            } else if (isAutoRenewing != null && !m.a(tokenCacheEntry.isAutoRenewing(), isAutoRenewing)) {
                linkedHashMapZ0.put(strSha1, tokenCacheEntry.copy(isAutoRenewing));
                saveTokenMap(linkedHashMapZ0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void cacheAppUserID$purchases_defaultsRelease(String appUserID) {
        m.e(appUserID, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        m.d(editorEdit, "preferences.edit()");
        cacheAppUserID$purchases_defaultsRelease(appUserID, editorEdit).apply();
    }

    public final synchronized void cacheCustomerInfo$purchases_defaultsRelease(String appUserID, CustomerInfo info) {
        m.e(appUserID, "appUserID");
        m.e(info, "info");
        JSONObject jsonObject = info.getJsonObject();
        jsonObject.put(CUSTOMER_INFO_SCHEMA_VERSION_KEY, 3);
        jsonObject.put("verification_result", info.getEntitlements().getVerification().name());
        jsonObject.put(CUSTOMER_INFO_REQUEST_DATE_KEY, info.getRequestDate().getTime());
        jsonObject.put(CUSTOMER_INFO_ORIGINAL_SOURCE_KEY, info.getOriginalSource().name());
        this.preferences.edit().putString(customerInfoCacheKey$purchases_defaultsRelease(appUserID), jsonObject.toString()).apply();
        setCustomerInfoCacheTimestampToNow$purchases_defaultsRelease(appUserID);
    }

    public final synchronized void cacheOfferingsResponse$purchases_defaultsRelease(JSONObject offeringsResponse) {
        m.e(offeringsResponse, "offeringsResponse");
        this.preferences.edit().putString(getOfferingsResponseCacheKey(), offeringsResponse.toString()).apply();
    }

    public final synchronized void cacheProductEntitlementMapping$purchases_defaultsRelease(ProductEntitlementMapping productEntitlementMapping) {
        m.e(productEntitlementMapping, "productEntitlementMapping");
        this.preferences.edit().putString(getProductEntitlementMappingCacheKey(), productEntitlementMapping.toJson$purchases_defaultsRelease().toString()).apply();
        setProductEntitlementMappingCacheTimestampToNow$purchases_defaultsRelease();
    }

    public final synchronized void cacheVirtualCurrencies$purchases_defaultsRelease(String appUserID, VirtualCurrencies virtualCurrencies) {
        m.e(appUserID, "appUserID");
        m.e(virtualCurrencies, "virtualCurrencies");
        this.preferences.edit().putString(virtualCurrenciesCacheKey$purchases_defaultsRelease(appUserID), d.f27387d.d(VirtualCurrencies.INSTANCE.serializer(), virtualCurrencies)).apply();
        setVirtualCurrenciesCacheTimestampToNow(appUserID);
    }

    public final synchronized void cleanPreviouslySentTokens$purchases_defaultsRelease(Set<String> hashedTokens) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            m.e(hashedTokens, "hashedTokens");
            LogIntent logIntent = LogIntent.DEBUG;
            DeviceCache$cleanPreviouslySentTokens$$inlined$log$1 deviceCache$cleanPreviouslySentTokens$$inlined$log$1 = new DeviceCache$cleanPreviouslySentTokens$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$cleanPreviouslySentTokens$$inlined$log$1.invoke(), null);
                    break;
            }
            Map<String, TokenCacheEntry> tokenMap = getTokenMap();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, TokenCacheEntry> entry : tokenMap.entrySet()) {
                if (hashedTokens.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            saveTokenMap(linkedHashMap);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void cleanupOldAttributionData$purchases_defaultsRelease() {
        try {
            SharedPreferences.Editor editorEdit = this.preferences.edit();
            for (String str : this.preferences.getAll().keySet()) {
                if (str != null && O7.x.x0(str, this.attributionCacheKey, false)) {
                    editorEdit.remove(str);
                }
            }
            editorEdit.apply();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void clearCachesForAppUserID$purchases_defaultsRelease(String appUserID) {
        m.e(appUserID, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        m.d(editorEdit, "preferences.edit()");
        clearVirtualCurrenciesCache(clearVirtualCurrenciesCacheTimestamp(clearCustomerInfoCacheTimestamp(clearAppUserID(clearCustomerInfo(editorEdit)), appUserID), appUserID), appUserID).apply();
    }

    public final synchronized void clearCustomerInfoCache$purchases_defaultsRelease(String appUserID) {
        m.e(appUserID, "appUserID");
        SharedPreferences.Editor editor = this.preferences.edit();
        m.d(editor, "editor");
        clearCustomerInfoCache$purchases_defaultsRelease(appUserID, editor);
        editor.apply();
    }

    public final synchronized void clearCustomerInfoCacheTimestamp$purchases_defaultsRelease(String appUserID) {
        m.e(appUserID, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        m.d(editorEdit, "preferences.edit()");
        clearCustomerInfoCacheTimestamp(editorEdit, appUserID).apply();
    }

    public final synchronized void clearOfferingsResponseCache$purchases_defaultsRelease() {
        this.preferences.edit().remove(getOfferingsResponseCacheKey()).apply();
    }

    public final synchronized void clearVirtualCurrenciesCache$purchases_defaultsRelease(String appUserID) {
        m.e(appUserID, "appUserID");
        SharedPreferences.Editor editor = this.preferences.edit();
        m.d(editor, "editor");
        clearVirtualCurrenciesCache$purchases_defaultsRelease(appUserID, editor);
        editor.apply();
    }

    public final String customerInfoCacheKey$purchases_defaultsRelease(String appUserID) {
        m.e(appUserID, "appUserID");
        return getLegacyAppUserIDCacheKey$purchases_defaultsRelease() + '.' + appUserID;
    }

    public final String customerInfoLastUpdatedCacheKey$purchases_defaultsRelease(String appUserID) {
        m.e(appUserID, "appUserID");
        return getCustomerInfoCachesLastUpdatedCacheBaseKey() + '.' + appUserID;
    }

    public final Set<String> findKeysThatStartWith$purchases_defaultsRelease(String cacheKey) {
        y yVar = y.f23207h;
        m.e(cacheKey, "cacheKey");
        try {
            Map<String, ?> all = this.preferences.getAll();
            if (all != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String it = entry.getKey();
                    m.d(it, "it");
                    if (O7.x.x0(it, cacheKey, false)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set<String> setKeySet = linkedHashMap.keySet();
                if (setKeySet != null) {
                    return setKeySet;
                }
            }
        } catch (NullPointerException unused) {
        }
        return yVar;
    }

    public final synchronized List<StoreTransaction> getActivePurchasesNotInCache$purchases_defaultsRelease(Map<String, StoreTransaction> hashedTokens) {
        m.e(hashedTokens, "hashedTokens");
        return o.N1(C.P0(hashedTokens, getPreviouslySentHashedTokens$purchases_defaultsRelease()).values());
    }

    public final String getAppUserIDCacheKey$purchases_defaultsRelease() {
        return (String) this.appUserIDCacheKey.getValue();
    }

    public final String getAttributionCacheKey() {
        return this.attributionCacheKey;
    }

    public final synchronized String getCachedAppUserID$purchases_defaultsRelease() {
        return this.preferences.getString(getAppUserIDCacheKey$purchases_defaultsRelease(), null);
    }

    public final CustomerInfo getCachedCustomerInfo$purchases_defaultsRelease(String appUserID) {
        m.e(appUserID, "appUserID");
        String string = this.preferences.getString(customerInfoCacheKey$purchases_defaultsRelease(appUserID), null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                int iOptInt = jSONObject.optInt(CUSTOMER_INFO_SCHEMA_VERSION_KEY);
                String verificationResultString = jSONObject.has("verification_result") ? jSONObject.getString("verification_result") : "NOT_REQUESTED";
                Long lValueOf = Long.valueOf(jSONObject.optLong(CUSTOMER_INFO_REQUEST_DATE_KEY));
                if (lValueOf.longValue() <= 0) {
                    lValueOf = null;
                }
                Date date = lValueOf != null ? new Date(lValueOf.longValue()) : null;
                CustomerInfoOriginalSource customerInfoOriginalSourceFromString = CustomerInfoOriginalSource.INSTANCE.fromString(JSONObjectExtensionsKt.optNullableString(jSONObject, CUSTOMER_INFO_ORIGINAL_SOURCE_KEY));
                jSONObject.remove("verification_result");
                jSONObject.remove(CUSTOMER_INFO_REQUEST_DATE_KEY);
                jSONObject.remove(CUSTOMER_INFO_ORIGINAL_SOURCE_KEY);
                m.d(verificationResultString, "verificationResultString");
                VerificationResult verificationResultValueOf = VerificationResult.valueOf(verificationResultString);
                if (iOptInt == 3) {
                    return CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, date, verificationResultValueOf, customerInfoOriginalSourceFromString, true);
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final synchronized VirtualCurrencies getCachedVirtualCurrencies$purchases_defaultsRelease(String appUserID) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            m.e(appUserID, "appUserID");
            String string = this.preferences.getString(virtualCurrenciesCacheKey$purchases_defaultsRelease(appUserID), null);
            if (string != null) {
                try {
                    return VirtualCurrenciesFactory.INSTANCE.buildVirtualCurrencies(string);
                } catch (j e6) {
                    LogIntent logIntent = LogIntent.WARNING;
                    DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2 deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2 = new DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2(logIntent, e6);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                        case 1:
                            LogLevel logLevel = LogLevel.DEBUG;
                            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel2 = LogLevel.WARN;
                            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 4:
                            LogLevel logLevel3 = LogLevel.INFO;
                            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 5:
                            LogLevel logLevel4 = LogLevel.DEBUG;
                            LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                currentLogHandler5.d("[Purchases] - " + logLevel4.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel5 = LogLevel.INFO;
                            LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                currentLogHandler6.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 8:
                            LogLevel logLevel6 = LogLevel.DEBUG;
                            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                currentLogHandler7.d("[Purchases] - " + logLevel6.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 9:
                            LogLevel logLevel7 = LogLevel.DEBUG;
                            LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                currentLogHandler8.d("[Purchases] - " + logLevel7.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 10:
                            LogLevel logLevel8 = LogLevel.WARN;
                            LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                currentLogHandler9.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 11:
                            LogLevel logLevel9 = LogLevel.WARN;
                            LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                currentLogHandler10.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel10 = LogLevel.WARN;
                            LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                currentLogHandler11.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke());
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$2.invoke(), null);
                            break;
                    }
                } catch (IllegalArgumentException e9) {
                    LogIntent logIntent2 = LogIntent.WARNING;
                    DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3 deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3 = new DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3(logIntent2, e9);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel11 = LogLevel.DEBUG;
                            LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                currentLogHandler12.d("[Purchases] - " + logLevel11.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel12 = LogLevel.WARN;
                            LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler13.w("[Purchases] - " + logLevel12.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 4:
                            LogLevel logLevel13 = LogLevel.INFO;
                            LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler14.i("[Purchases] - " + logLevel13.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 5:
                            LogLevel logLevel14 = LogLevel.DEBUG;
                            LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                currentLogHandler15.d("[Purchases] - " + logLevel14.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel15 = LogLevel.INFO;
                            LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler16.i("[Purchases] - " + logLevel15.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 8:
                            LogLevel logLevel16 = LogLevel.DEBUG;
                            LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                currentLogHandler17.d("[Purchases] - " + logLevel16.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 9:
                            LogLevel logLevel17 = LogLevel.DEBUG;
                            LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                currentLogHandler18.d("[Purchases] - " + logLevel17.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 10:
                            LogLevel logLevel18 = LogLevel.WARN;
                            LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler19.w("[Purchases] - " + logLevel18.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 11:
                            LogLevel logLevel19 = LogLevel.WARN;
                            LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                currentLogHandler20.w("[Purchases] - " + logLevel19.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel20 = LogLevel.WARN;
                            LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                currentLogHandler21.w("[Purchases] - " + logLevel20.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke());
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3.invoke(), null);
                            break;
                    }
                } catch (JSONException e10) {
                    LogIntent logIntent3 = LogIntent.WARNING;
                    DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1 deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1 = new DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1(logIntent3, e10);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                        case 1:
                            LogLevel logLevel21 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                                str = "[Purchases] - " + logLevel21.name();
                                str2 = (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel22 = LogLevel.WARN;
                            LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                                currentLogHandler22.w("[Purchases] - " + logLevel22.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 4:
                            LogLevel logLevel23 = LogLevel.INFO;
                            LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                                currentLogHandler23.i("[Purchases] - " + logLevel23.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 5:
                            LogLevel logLevel24 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                                str = "[Purchases] - " + logLevel24.name();
                                str2 = (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel25 = LogLevel.INFO;
                            LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                                currentLogHandler24.i("[Purchases] - " + logLevel25.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 8:
                            LogLevel logLevel26 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                                str = "[Purchases] - " + logLevel26.name();
                                str2 = (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 9:
                            LogLevel logLevel27 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                                str = "[Purchases] - " + logLevel27.name();
                                str2 = (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 10:
                            LogLevel logLevel28 = LogLevel.WARN;
                            LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                                currentLogHandler25.w("[Purchases] - " + logLevel28.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 11:
                            LogLevel logLevel29 = LogLevel.WARN;
                            LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                                currentLogHandler26.w("[Purchases] - " + logLevel29.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel30 = LogLevel.WARN;
                            LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                                currentLogHandler27.w("[Purchases] - " + logLevel30.name(), (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public JSONObject getJSONObjectOrNull$purchases_defaultsRelease(String key) {
        m.e(key, "key");
        String string = this.preferences.getString(key, null);
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String getLegacyAppUserIDCacheKey$purchases_defaultsRelease() {
        return (String) this.legacyAppUserIDCacheKey.getValue();
    }

    public final synchronized String getLegacyCachedAppUserID$purchases_defaultsRelease() {
        return this.preferences.getString(getLegacyAppUserIDCacheKey$purchases_defaultsRelease(), null);
    }

    public final String getLegacyTokensCacheKey$purchases_defaultsRelease() {
        return (String) this.legacyTokensCacheKey.getValue();
    }

    public final synchronized JSONObject getOfferingsResponseCache$purchases_defaultsRelease() {
        return getJSONObjectOrNull$purchases_defaultsRelease(getOfferingsResponseCacheKey());
    }

    public final synchronized Set<String> getPreviouslySentHashedTokens$purchases_defaultsRelease() {
        Set<String> setKeySet;
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            setKeySet = getTokenMap().keySet();
            LogIntent logIntent = LogIntent.DEBUG;
            DeviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1 deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1 = new DeviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1(logIntent, setKeySet);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) deviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1.invoke(), null);
                    break;
            }
        } catch (Throwable th) {
            throw th;
        }
        return setKeySet;
    }

    public final synchronized ProductEntitlementMapping getProductEntitlementMapping$purchases_defaultsRelease() {
        try {
            ProductEntitlementMapping productEntitlementMappingFromJson$purchases_defaultsRelease = null;
            String string = this.preferences.getString(getProductEntitlementMappingCacheKey(), null);
            if (string == null) {
                return null;
            }
            try {
                productEntitlementMappingFromJson$purchases_defaultsRelease = ProductEntitlementMapping.INSTANCE.fromJson$purchases_defaultsRelease(new JSONObject(string), true);
            } catch (JSONException e6) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(OfflineEntitlementsStrings.ERROR_PARSING_PRODUCT_ENTITLEMENT_MAPPING, Arrays.copyOf(new Object[]{string}, 1)), e6);
                this.preferences.edit().remove(getProductEntitlementMappingCacheKey()).apply();
            }
            return productEntitlementMappingFromJson$purchases_defaultsRelease;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized List<StoreTransaction> getPurchasesWithAutoRenewingChange$purchases_defaultsRelease(Map<String, StoreTransaction> hashedTokens) {
        LinkedHashMap linkedHashMap;
        try {
            m.e(hashedTokens, "hashedTokens");
            Map<String, TokenCacheEntry> tokenMap = getTokenMap();
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, StoreTransaction> entry : hashedTokens.entrySet()) {
                String key = entry.getKey();
                StoreTransaction value = entry.getValue();
                TokenCacheEntry tokenCacheEntry = tokenMap.get(key);
                if (tokenCacheEntry != null && tokenCacheEntry.isAutoRenewing() != null && value.getIsAutoRenewing() != null && !m.a(value.getIsAutoRenewing(), tokenCacheEntry.isAutoRenewing())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return o.N1(linkedHashMap.values());
    }

    @Override
    public synchronized String getStorefront() {
        String string;
        string = this.preferences.getString(getStorefrontCacheKey$purchases_defaultsRelease(), null);
        if (string == null) {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), BillingStrings.BILLING_STOREFRONT_NULL_FROM_CACHE);
            }
        }
        return string;
    }

    public final String getStorefrontCacheKey$purchases_defaultsRelease() {
        return (String) this.storefrontCacheKey.getValue();
    }

    public final String getTokensCacheKey$purchases_defaultsRelease() {
        return (String) this.tokensCacheKey.getValue();
    }

    public final synchronized boolean isCustomerInfoCacheStale$purchases_defaultsRelease(String appUserID, boolean appInBackground) {
        m.e(appUserID, "appUserID");
        return DateExtensionsKt.isCacheStale(getCustomerInfoCachesLastUpdated(appUserID), appInBackground, this.dateProvider);
    }

    public final synchronized boolean isProductEntitlementMappingCacheStale$purchases_defaultsRelease() {
        return DateExtensionsKt.m132isCacheStale8Mi8wO0(getProductEntitlementMappingLastUpdated(), DeviceCacheKt.PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD, this.dateProvider);
    }

    public final synchronized boolean isVirtualCurrenciesCacheStale$purchases_defaultsRelease(String appUserID, boolean appInBackground) {
        m.e(appUserID, "appUserID");
        return DateExtensionsKt.isCacheStale(getVirtualCurrenciesCacheLastUpdated(appUserID), appInBackground, this.dateProvider);
    }

    public final String newKey$purchases_defaultsRelease(String key) {
        m.e(key, "key");
        return getApiKeyPrefix() + '.' + key;
    }

    public void putString$purchases_defaultsRelease(String cacheKey, String value) {
        m.e(cacheKey, "cacheKey");
        m.e(value, "value");
        this.preferences.edit().putString(cacheKey, value).apply();
    }

    public final void remove$purchases_defaultsRelease(String cacheKey) {
        m.e(cacheKey, "cacheKey");
        this.preferences.edit().remove(cacheKey).apply();
    }

    public final synchronized void saveAutoRenewingStatus$purchases_defaultsRelease(Map<String, StoreTransaction> hashedTokens) {
        try {
            m.e(hashedTokens, "hashedTokens");
            LinkedHashMap linkedHashMapZ0 = C.Z0(getTokenMap());
            boolean z6 = false;
            for (Map.Entry<String, StoreTransaction> entry : hashedTokens.entrySet()) {
                String key = entry.getKey();
                StoreTransaction value = entry.getValue();
                TokenCacheEntry tokenCacheEntry = (TokenCacheEntry) linkedHashMapZ0.get(key);
                if (tokenCacheEntry != null && value.getIsAutoRenewing() != null && !m.a(tokenCacheEntry.isAutoRenewing(), value.getIsAutoRenewing())) {
                    linkedHashMapZ0.put(key, tokenCacheEntry.copy(value.getIsAutoRenewing()));
                    z6 = true;
                }
            }
            if (z6) {
                saveTokenMap(linkedHashMapZ0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void setCustomerInfoCacheTimestamp$purchases_defaultsRelease(String appUserID, Date date) {
        m.e(appUserID, "appUserID");
        m.e(date, "date");
        this.preferences.edit().putLong(customerInfoLastUpdatedCacheKey$purchases_defaultsRelease(appUserID), date.getTime()).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestampToNow$purchases_defaultsRelease(String appUserID) {
        m.e(appUserID, "appUserID");
        setCustomerInfoCacheTimestamp$purchases_defaultsRelease(appUserID, this.dateProvider.getNow());
    }

    public final synchronized void setProductEntitlementMappingCacheTimestampToNow$purchases_defaultsRelease() {
        setProductEntitlementMappingCacheTimestamp(this.dateProvider.getNow());
    }

    public final synchronized void setStorefront$purchases_defaultsRelease(String countryCode) {
        try {
            m.e(countryCode, "countryCode");
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), String.format(BillingStrings.BILLING_STOREFRONT_CACHING, Arrays.copyOf(new Object[]{countryCode}, 1)));
            }
            this.preferences.edit().putString(getStorefrontCacheKey$purchases_defaultsRelease(), countryCode).apply();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final SharedPreferences.Editor startEditing$purchases_defaultsRelease() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        m.d(editorEdit, "preferences.edit()");
        return editorEdit;
    }

    public final String virtualCurrenciesCacheKey$purchases_defaultsRelease(String appUserID) {
        m.e(appUserID, "appUserID");
        return getVirtualCurrenciesCacheBaseKey() + '.' + appUserID;
    }

    public final String virtualCurrenciesLastUpdatedCacheKey$purchases_defaultsRelease(String appUserID) {
        m.e(appUserID, "appUserID");
        return getVirtualCurrenciesLastUpdatedCacheBaseKey() + '.' + appUserID;
    }

    public final synchronized SharedPreferences.Editor cacheAppUserID$purchases_defaultsRelease(String appUserID, SharedPreferences.Editor cacheEditor) {
        SharedPreferences.Editor editorPutString;
        m.e(appUserID, "appUserID");
        m.e(cacheEditor, "cacheEditor");
        editorPutString = cacheEditor.putString(getAppUserIDCacheKey$purchases_defaultsRelease(), appUserID);
        m.d(editorPutString, "cacheEditor.putString(ap…serIDCacheKey, appUserID)");
        return editorPutString;
    }

    public final synchronized void clearCustomerInfoCache$purchases_defaultsRelease(String appUserID, SharedPreferences.Editor editor) {
        m.e(appUserID, "appUserID");
        m.e(editor, "editor");
        clearCustomerInfoCacheTimestamp(editor, appUserID);
        editor.remove(customerInfoCacheKey$purchases_defaultsRelease(appUserID));
    }

    public final synchronized void clearVirtualCurrenciesCache$purchases_defaultsRelease(String appUserID, SharedPreferences.Editor editor) {
        m.e(appUserID, "appUserID");
        m.e(editor, "editor");
        clearVirtualCurrenciesCacheTimestamp(editor, appUserID);
        clearVirtualCurrenciesCache(editor, appUserID);
    }

    public DeviceCache(SharedPreferences sharedPreferences, String str, DateProvider dateProvider, int i3, AbstractC2541f abstractC2541f) {
        this(sharedPreferences, str, (i3 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
