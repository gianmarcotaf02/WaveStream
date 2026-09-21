package com.revenuecat.purchases.paywalls;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0007\u0018\u0000 N2\u00020\u0001:\u0004ONPQB\u0087\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b\u0012 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b0\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B©\u0001\b\u0011\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0001\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\"\b\u0001\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J)\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0007¢\u0006\u0004\b \u0010!J\u008b\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b2 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b0\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\"\u0010#J5\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b0\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fH\u0002¢\u0006\u0004\b$\u0010\u001cJ(\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(HÁ\u0001¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b2\u00103\u001a\u0004\b1\u00100R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u00106R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00107\u0012\u0004\b:\u00103\u001a\u0004\b8\u00109R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010=R,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\bA\u00103\u001a\u0004\b?\u0010@R8\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b0\u000b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010>\u0012\u0004\bC\u00103\u001a\u0004\bB\u0010@R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010D\u0012\u0004\bG\u00103\u001a\u0004\bE\u0010FR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010.\u0012\u0004\bI\u00103\u001a\u0004\bH\u00100R\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u001a8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR)\u0010M\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b0\u001a8F¢\u0006\u0006\u001a\u0004\bL\u0010K¨\u0006R"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData;", "", "", "id", "templateName", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "config", "Ljava/net/URL;", "assetBaseURL", "", "revision", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "localization", "localizationByTier", "", "zeroDecimalPlaceCountries", "defaultLocale", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Lr8/k0;)V", "Ljava/util/Locale;", "locales", "Lh6/k;", "localizedConfiguration", "(Ljava/util/List;)Lh6/k;", "requiredLocale", "configForLocale", "(Ljava/util/Locale;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "tieredConfigForLocale", "(Ljava/util/Locale;)Ljava/util/Map;", "copy", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData;", "tieredConfigForLocales", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/PaywallData;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTemplateName", "getTemplateName$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "getConfig", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "Ljava/net/URL;", "getAssetBaseURL", "()Ljava/net/URL;", "getAssetBaseURL$annotations", "I", "getRevision", "()I", "Ljava/util/Map;", "getLocalization$purchases_defaultsRelease", "()Ljava/util/Map;", "getLocalization$purchases_defaultsRelease$annotations", "getLocalizationByTier$purchases_defaultsRelease", "getLocalizationByTier$purchases_defaultsRelease$annotations", "Ljava/util/List;", "getZeroDecimalPlaceCountries", "()Ljava/util/List;", "getZeroDecimalPlaceCountries$annotations", "getDefaultLocale", "getDefaultLocale$annotations", "getLocalizedConfiguration", "()Lh6/k;", "getTieredLocalizedConfiguration", "tieredLocalizedConfiguration", "Companion", "$serializer", "Configuration", "LocalizedConfiguration", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class PaywallData {
    private static final kotlinx.serialization.KSerializer[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.PaywallData.Companion INSTANCE = new com.revenuecat.purchases.paywalls.PaywallData.Companion(null);
    private final java.net.URL assetBaseURL;
    private final com.revenuecat.purchases.paywalls.PaywallData.Configuration config;
    private final java.lang.String defaultLocale;
    private final java.lang.String id;
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration> localization;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration>> localizationByTier;
    private final int revision;
    private final java.lang.String templateName;
    private final java.util.List<java.lang.String> zeroDecimalPlaceCountries;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.PaywallData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
        $childSerializers = new kotlinx.serialization.KSerializer[]{null, null, null, null, null, new p153r8.F(p0Var, paywallData$LocalizedConfiguration$$serializer, 1), new p153r8.F(p0Var, new p153r8.F(p0Var, paywallData$LocalizedConfiguration$$serializer, 1), 1), null, null};
    }

    @p070h6.c
    public /* synthetic */ PaywallData(int i3, java.lang.String str, @p119n8.h("template_name") java.lang.String str2, com.revenuecat.purchases.paywalls.PaywallData.Configuration configuration, @p119n8.h("asset_base_url") @p119n8.i(with = com.revenuecat.purchases.utils.serializers.URLSerializer.class) java.net.URL url, int i9, @p119n8.h("localized_strings") java.util.Map map, @p119n8.h("localized_strings_by_tier") java.util.Map map2, @p119n8.h("zero_decimal_place_countries") @p119n8.i(with = com.revenuecat.purchases.utils.serializers.GoogleListSerializer.class) java.util.List list, @p119n8.h("default_locale") java.lang.String str3, p153r8.k0 k0Var) {
        if (46 != (i3 & 46)) {
            p153r8.AbstractC2686a0.l(i3, 46, com.revenuecat.purchases.paywalls.PaywallData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.templateName = str2;
        this.config = configuration;
        this.assetBaseURL = url;
        if ((i3 & 16) == 0) {
            this.revision = 0;
        } else {
            this.revision = i9;
        }
        this.localization = map;
        if ((i3 & 64) == 0) {
            this.localizationByTier = p078i6.x.f23206h;
        } else {
            this.localizationByTier = map2;
        }
        if ((i3 & 128) == 0) {
            this.zeroDecimalPlaceCountries = p078i6.w.f23205h;
        } else {
            this.zeroDecimalPlaceCountries = list;
        }
        if ((i3 & 256) == 0) {
            this.defaultLocale = null;
        } else {
            this.defaultLocale = str3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.paywalls.PaywallData copy$default(com.revenuecat.purchases.paywalls.PaywallData paywallData, java.lang.String str, com.revenuecat.purchases.paywalls.PaywallData.Configuration configuration, java.net.URL url, int i3, java.util.Map map, java.util.Map map2, java.util.List list, java.lang.String str2, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            str = paywallData.templateName;
        }
        if ((i9 & 2) != 0) {
            configuration = paywallData.config;
        }
        if ((i9 & 4) != 0) {
            url = paywallData.assetBaseURL;
        }
        if ((i9 & 8) != 0) {
            i3 = paywallData.revision;
        }
        if ((i9 & 16) != 0) {
            map = paywallData.localization;
        }
        if ((i9 & 32) != 0) {
            map2 = paywallData.localizationByTier;
        }
        if ((i9 & 64) != 0) {
            list = paywallData.zeroDecimalPlaceCountries;
        }
        if ((i9 & 128) != 0) {
            str2 = paywallData.defaultLocale;
        }
        java.util.List list2 = list;
        java.lang.String str3 = str2;
        java.util.Map map3 = map;
        java.util.Map map4 = map2;
        return paywallData.copy(str, configuration, url, i3, map3, map4, list2, str3);
    }

    @p119n8.h("asset_base_url")
    @p119n8.i(with = com.revenuecat.purchases.utils.serializers.URLSerializer.class)
    public static /* synthetic */ void getAssetBaseURL$annotations() {
    }

    @p119n8.h("default_locale")
    public static /* synthetic */ void getDefaultLocale$annotations() {
    }

    @p119n8.h("localized_strings")
    public static /* synthetic */ void getLocalization$purchases_defaultsRelease$annotations() {
    }

    @p119n8.h("localized_strings_by_tier")
    public static /* synthetic */ void getLocalizationByTier$purchases_defaultsRelease$annotations() {
    }

    @p119n8.h("template_name")
    public static /* synthetic */ void getTemplateName$annotations() {
    }

    @p119n8.h("zero_decimal_place_countries")
    @p119n8.i(with = com.revenuecat.purchases.utils.serializers.GoogleListSerializer.class)
    public static /* synthetic */ void getZeroDecimalPlaceCountries$annotations() {
    }

    private final p070h6.k tieredConfigForLocales(java.util.List<java.util.Locale> locales) {
        java.lang.Object next;
        java.util.Iterator<java.util.Locale> it = locales.iterator();
        while (it.hasNext()) {
            java.util.Locale localeConvertToCorrectlyFormattedLocale = com.revenuecat.purchases.utils.LocaleExtensionsKt.convertToCorrectlyFormattedLocale(it.next());
            java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration> mapTieredConfigForLocale = tieredConfigForLocale(localeConvertToCorrectlyFormattedLocale);
            if (mapTieredConfigForLocale != null) {
                return new p070h6.k(localeConvertToCorrectlyFormattedLocale, mapTieredConfigForLocale);
            }
        }
        java.lang.String str = this.defaultLocale;
        if (str != null) {
            java.util.Iterator<T> it2 = this.localizationByTier.entrySet().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!kotlin.jvm.internal.m.a(com.revenuecat.purchases.utils.LocaleExtensionsKt.toLocale((java.lang.String) ((java.util.Map.Entry) next).getKey()), com.revenuecat.purchases.utils.LocaleExtensionsKt.toLocale(str)));
            java.util.Map.Entry entry = (java.util.Map.Entry) next;
            if (entry != null) {
                return new p070h6.k(com.revenuecat.purchases.utils.LocaleExtensionsKt.toLocale((java.lang.String) entry.getKey()), entry.getValue());
            }
        }
        java.util.Map.Entry entry2 = (java.util.Map.Entry) p078i6.o.g1(this.localizationByTier.entrySet());
        return new p070h6.k(com.revenuecat.purchases.utils.LocaleExtensionsKt.toLocale((java.lang.String) entry2.getKey()), entry2.getValue());
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.PaywallData self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
        if (output.E(serialDesc) || self.id != null) {
            output.t(serialDesc, 0, p153r8.p0.f26988a, self.id);
        }
        output.s(serialDesc, 1, self.templateName);
        output.h(serialDesc, 2, com.revenuecat.purchases.paywalls.PaywallData$Configuration$$serializer.INSTANCE, self.config);
        output.h(serialDesc, 3, com.revenuecat.purchases.utils.serializers.URLSerializer.INSTANCE, self.assetBaseURL);
        if (output.E(serialDesc) || self.revision != 0) {
            output.n(4, self.revision, serialDesc);
        }
        output.h(serialDesc, 5, kSerializerArr[5], self.localization);
        if (output.E(serialDesc) || !kotlin.jvm.internal.m.a(self.localizationByTier, p078i6.x.f23206h)) {
            output.h(serialDesc, 6, kSerializerArr[6], self.localizationByTier);
        }
        if (output.E(serialDesc) || !kotlin.jvm.internal.m.a(self.zeroDecimalPlaceCountries, p078i6.w.f23205h)) {
            output.h(serialDesc, 7, com.revenuecat.purchases.utils.serializers.GoogleListSerializer.INSTANCE, self.zeroDecimalPlaceCountries);
        }
        if (!output.E(serialDesc) && self.defaultLocale == null) {
            return;
        }
        output.t(serialDesc, 8, p153r8.p0.f26988a, self.defaultLocale);
    }

    public final com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration configForLocale(java.util.Locale requiredLocale) {
        java.lang.Object next;
        kotlin.jvm.internal.m.e(requiredLocale, "requiredLocale");
        com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration localizedConfiguration = this.localization.get(requiredLocale.toString());
        if (localizedConfiguration != null) {
            return localizedConfiguration;
        }
        java.util.Iterator<T> it = this.localization.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!com.revenuecat.purchases.utils.LocaleExtensionsKt.sharedLanguageCodeWith(requiredLocale, com.revenuecat.purchases.utils.LocaleExtensionsKt.toLocale((java.lang.String) ((java.util.Map.Entry) next).getKey())));
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        if (entry != null) {
            return (com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration) entry.getValue();
        }
        return null;
    }

    public final com.revenuecat.purchases.paywalls.PaywallData copy(java.lang.String templateName, com.revenuecat.purchases.paywalls.PaywallData.Configuration config, java.net.URL assetBaseURL, int revision, java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration> localization, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration>> localizationByTier, java.util.List<java.lang.String> zeroDecimalPlaceCountries, java.lang.String defaultLocale) {
        kotlin.jvm.internal.m.e(templateName, "templateName");
        kotlin.jvm.internal.m.e(config, "config");
        kotlin.jvm.internal.m.e(assetBaseURL, "assetBaseURL");
        kotlin.jvm.internal.m.e(localization, "localization");
        kotlin.jvm.internal.m.e(localizationByTier, "localizationByTier");
        kotlin.jvm.internal.m.e(zeroDecimalPlaceCountries, "zeroDecimalPlaceCountries");
        return new com.revenuecat.purchases.paywalls.PaywallData((java.lang.String) null, templateName, config, assetBaseURL, revision, localization, localizationByTier, zeroDecimalPlaceCountries, defaultLocale, 1, (kotlin.jvm.internal.AbstractC2541f) null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.PaywallData)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.PaywallData paywallData = (com.revenuecat.purchases.paywalls.PaywallData) obj;
        return kotlin.jvm.internal.m.a(this.id, paywallData.id) && kotlin.jvm.internal.m.a(this.templateName, paywallData.templateName) && kotlin.jvm.internal.m.a(this.config, paywallData.config) && kotlin.jvm.internal.m.a(this.assetBaseURL, paywallData.assetBaseURL) && this.revision == paywallData.revision && kotlin.jvm.internal.m.a(this.localization, paywallData.localization) && kotlin.jvm.internal.m.a(this.localizationByTier, paywallData.localizationByTier) && kotlin.jvm.internal.m.a(this.zeroDecimalPlaceCountries, paywallData.zeroDecimalPlaceCountries) && kotlin.jvm.internal.m.a(this.defaultLocale, paywallData.defaultLocale);
    }

    public final java.net.URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final com.revenuecat.purchases.paywalls.PaywallData.Configuration getConfig() {
        return this.config;
    }

    public final java.lang.String getDefaultLocale() {
        return this.defaultLocale;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration> getLocalization$purchases_defaultsRelease() {
        return this.localization;
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration>> getLocalizationByTier$purchases_defaultsRelease() {
        return this.localizationByTier;
    }

    public final p070h6.k getLocalizedConfiguration() {
        return localizedConfiguration(com.revenuecat.purchases.utils.LocaleExtensionsKt.getDefaultLocales());
    }

    public final int getRevision() {
        return this.revision;
    }

    public final java.lang.String getTemplateName() {
        return this.templateName;
    }

    public final p070h6.k getTieredLocalizedConfiguration() {
        return tieredConfigForLocales(com.revenuecat.purchases.utils.LocaleExtensionsKt.getDefaultLocales());
    }

    public final java.util.List<java.lang.String> getZeroDecimalPlaceCountries() {
        return this.zeroDecimalPlaceCountries;
    }

    public int hashCode() {
        java.lang.String str = this.id;
        int iB = B2.a.b(B2.a.c(B2.a.c((((this.assetBaseURL.hashCode() + ((this.config.hashCode() + B2.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.templateName)) * 31)) * 31) + this.revision) * 31, 31, this.localization), 31, this.localizationByTier), 31, this.zeroDecimalPlaceCountries);
        java.lang.String str2 = this.defaultLocale;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }

    public final p070h6.k localizedConfiguration(java.util.List<java.util.Locale> locales) {
        java.lang.Object next;
        kotlin.jvm.internal.m.e(locales, "locales");
        java.util.Iterator<java.util.Locale> it = locales.iterator();
        while (it.hasNext()) {
            java.util.Locale localeConvertToCorrectlyFormattedLocale = com.revenuecat.purchases.utils.LocaleExtensionsKt.convertToCorrectlyFormattedLocale(it.next());
            com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration localizedConfigurationConfigForLocale = configForLocale(localeConvertToCorrectlyFormattedLocale);
            if (localizedConfigurationConfigForLocale != null) {
                return new p070h6.k(localeConvertToCorrectlyFormattedLocale, localizedConfigurationConfigForLocale);
            }
        }
        java.lang.String str = this.defaultLocale;
        if (str != null) {
            java.util.Iterator<T> it2 = this.localization.entrySet().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!kotlin.jvm.internal.m.a(com.revenuecat.purchases.utils.LocaleExtensionsKt.toLocale((java.lang.String) ((java.util.Map.Entry) next).getKey()), com.revenuecat.purchases.utils.LocaleExtensionsKt.toLocale(str)));
            java.util.Map.Entry entry = (java.util.Map.Entry) next;
            if (entry != null) {
                return new p070h6.k(com.revenuecat.purchases.utils.LocaleExtensionsKt.toLocale((java.lang.String) entry.getKey()), entry.getValue());
            }
        }
        java.util.Map.Entry entry2 = (java.util.Map.Entry) p078i6.o.g1(this.localization.entrySet());
        return new p070h6.k(com.revenuecat.purchases.utils.LocaleExtensionsKt.toLocale((java.lang.String) entry2.getKey()), entry2.getValue());
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration> tieredConfigForLocale(java.util.Locale requiredLocale) {
        java.lang.Object next;
        kotlin.jvm.internal.m.e(requiredLocale, "requiredLocale");
        java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration> map = this.localizationByTier.get(requiredLocale.toString());
        if (map != null) {
            return map;
        }
        java.util.Iterator<T> it = this.localizationByTier.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!com.revenuecat.purchases.utils.LocaleExtensionsKt.sharedLanguageCodeWith(requiredLocale, com.revenuecat.purchases.utils.LocaleExtensionsKt.toLocale((java.lang.String) ((java.util.Map.Entry) next).getKey())));
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        if (entry != null) {
            return (java.util.Map) entry.getValue();
        }
        return null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaywallData(id=");
        sb.append(this.id);
        sb.append(", templateName=");
        sb.append(this.templateName);
        sb.append(", config=");
        sb.append(this.config);
        sb.append(", assetBaseURL=");
        sb.append(this.assetBaseURL);
        sb.append(", revision=");
        sb.append(this.revision);
        sb.append(", localization=");
        sb.append(this.localization);
        sb.append(", localizationByTier=");
        sb.append(this.localizationByTier);
        sb.append(", zeroDecimalPlaceCountries=");
        sb.append(this.zeroDecimalPlaceCountries);
        sb.append(", defaultLocale=");
        return Y6.f.l(sb, this.defaultLocale, ')');
    }

    @kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0007\u0018\u0000 S2\u00020\u0001:\u0006TUVSWXB½\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018B¡\u0001\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u001aBÓ\u0001\b\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0016\b\u0001\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0017\u0010\u001fJÇ\u0001\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b \u0010!J(\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%HÁ\u0001¢\u0006\u0004\b(\u0010)R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b3\u0010/\u001a\u0004\b1\u00102R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b7\u0010/\u001a\u0004\b5\u00106R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b9\u0010/\u001a\u0004\b8\u00106R.\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010:\u0012\u0004\b=\u0010/\u001a\u0004\b;\u0010<R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010>\u0012\u0004\bA\u0010/\u001a\u0004\b?\u0010@R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\bC\u0010/\u001a\u0004\bB\u0010@R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010D\u0012\u0004\bG\u0010/\u001a\u0004\bE\u0010FR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010D\u0012\u0004\bI\u0010/\u001a\u0004\bH\u0010FR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bK\u0010LR.\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010:\u0012\u0004\bN\u0010/\u001a\u0004\bM\u0010<R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\bO\u0010-R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u00100\u0012\u0004\bQ\u0010/\u001a\u0004\bP\u00102R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bR\u00106¨\u0006Y"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "", "", "", "packageIds", "defaultPackage", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "imagesWebp", "legacyImages", "", "imagesByTier", "", "blurredBackgroundImage", "displayRestorePurchases", "Ljava/net/URL;", "termsOfServiceURL", "privacyURL", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "colors", "colorsByTier", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "tiers", "defaultTier", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", io.sentry.protocol.DebugMeta.JsonKeys.IMAGES, "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;ZZLjava/net/URL;Ljava/net/URL;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Lr8/k0;)V", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPackageIds", "()Ljava/util/List;", "getPackageIds$annotations", "()V", "Ljava/lang/String;", "getDefaultPackage", "()Ljava/lang/String;", "getDefaultPackage$annotations", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "getImagesWebp$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "getImagesWebp$purchases_defaultsRelease$annotations", "getLegacyImages$purchases_defaultsRelease", "getLegacyImages$purchases_defaultsRelease$annotations", "Ljava/util/Map;", "getImagesByTier", "()Ljava/util/Map;", "getImagesByTier$annotations", "Z", "getBlurredBackgroundImage", "()Z", "getBlurredBackgroundImage$annotations", "getDisplayRestorePurchases", "getDisplayRestorePurchases$annotations", "Ljava/net/URL;", "getTermsOfServiceURL", "()Ljava/net/URL;", "getTermsOfServiceURL$annotations", "getPrivacyURL", "getPrivacyURL$annotations", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "getColors", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "getColorsByTier", "getColorsByTier$annotations", "getTiers", "getDefaultTier", "getDefaultTier$annotations", "getImages", "Companion", "$serializer", "ColorInformation", "Colors", "Images", "Tier", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Configuration {
        private static final kotlinx.serialization.KSerializer[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.PaywallData.Configuration.Companion INSTANCE = new com.revenuecat.purchases.paywalls.PaywallData.Configuration.Companion(null);
        private final boolean blurredBackgroundImage;
        private final com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation colors;
        private final java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation> colorsByTier;
        private final java.lang.String defaultPackage;
        private final java.lang.String defaultTier;
        private final boolean displayRestorePurchases;
        private final java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images> imagesByTier;
        private final com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images imagesWebp;
        private final com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images legacyImages;
        private final java.util.List<java.lang.String> packageIds;
        private final java.net.URL privacyURL;
        private final java.net.URL termsOfServiceURL;
        private final java.util.List<com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier> tiers;

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "light", "dark", "<init>", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "getLight", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "getDark", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class ColorInformation {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation.Companion INSTANCE = new com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation.Companion(null);
            private final com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors dark;
            private final com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors light;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.paywalls.PaywallData$Configuration$ColorInformation$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @p070h6.c
            public /* synthetic */ ColorInformation(int i3, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors colors, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors colors2, p153r8.k0 k0Var) {
                if (1 != (i3 & 1)) {
                    p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.paywalls.PaywallData$Configuration$ColorInformation$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.light = colors;
                if ((i3 & 2) == 0) {
                    this.dark = null;
                } else {
                    this.dark = colors2;
                }
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.revenuecat.purchases.paywalls.PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = com.revenuecat.purchases.paywalls.PaywallData$Configuration$Colors$$serializer.INSTANCE;
                output.h(serialDesc, 0, paywallData$Configuration$Colors$$serializer, self.light);
                if (!output.E(serialDesc) && self.dark == null) {
                    return;
                }
                output.t(serialDesc, 1, paywallData$Configuration$Colors$$serializer, self.dark);
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation colorInformation = (com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation) obj;
                return kotlin.jvm.internal.m.a(this.light, colorInformation.light) && kotlin.jvm.internal.m.a(this.dark, colorInformation.dark);
            }

            public final com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors getDark() {
                return this.dark;
            }

            public final com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors getLight() {
                return this.light;
            }

            public int hashCode() {
                int iHashCode = this.light.hashCode() * 31;
                com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors colors = this.dark;
                return iHashCode + (colors == null ? 0 : colors.hashCode());
            }

            public java.lang.String toString() {
                return "ColorInformation(light=" + this.light + ", dark=" + this.dark + ')';
            }

            public ColorInformation(com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors light, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors colors) {
                kotlin.jvm.internal.m.e(light, "light");
                this.light = light;
                this.dark = colors;
            }

            public /* synthetic */ ColorInformation(com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors colors, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors colors2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this(colors, (i3 & 2) != 0 ? null : colors2);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0007\u0018\u0000 C2\u00020\u0001:\u0002DCB«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013BÏ\u0001\b\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J(\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cHÁ\u0001¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010$R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b.\u0010&\u001a\u0004\b-\u0010$R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b0\u0010&\u001a\u0004\b/\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\"\u0012\u0004\b2\u0010&\u001a\u0004\b1\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\"\u0012\u0004\b4\u0010&\u001a\u0004\b3\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\"\u0012\u0004\b6\u0010&\u001a\u0004\b5\u0010$R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\"\u0012\u0004\b8\u0010&\u001a\u0004\b7\u0010$R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\"\u0012\u0004\b:\u0010&\u001a\u0004\b9\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\"\u0012\u0004\b<\u0010&\u001a\u0004\b;\u0010$R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\"\u0012\u0004\b>\u0010&\u001a\u0004\b=\u0010$R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\"\u0012\u0004\b@\u0010&\u001a\u0004\b?\u0010$R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\"\u0012\u0004\bB\u0010&\u001a\u0004\bA\u0010$¨\u0006E"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "background", "text1", "text2", "text3", "callToActionBackground", "callToActionForeground", "callToActionSecondaryBackground", "accent1", "accent2", "accent3", "closeButton", "tierControlBackground", "tierControlForeground", "tierControlSelectedBackground", "tierControlSelectedForeground", "<init>", "(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/PaywallColor;", "getBackground$annotations", "()V", "getText1", "getText1$annotations", "getText2", "getText2$annotations", "getText3", "getText3$annotations", "getCallToActionBackground", "getCallToActionBackground$annotations", "getCallToActionForeground", "getCallToActionForeground$annotations", "getCallToActionSecondaryBackground", "getCallToActionSecondaryBackground$annotations", "getAccent1", "getAccent1$annotations", "getAccent2", "getAccent2$annotations", "getAccent3", "getAccent3$annotations", "getCloseButton", "getCloseButton$annotations", "getTierControlBackground", "getTierControlBackground$annotations", "getTierControlForeground", "getTierControlForeground$annotations", "getTierControlSelectedBackground", "getTierControlSelectedBackground$annotations", "getTierControlSelectedForeground", "getTierControlSelectedForeground$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class Colors {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors.Companion INSTANCE = new com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors.Companion(null);
            private final com.revenuecat.purchases.paywalls.PaywallColor accent1;
            private final com.revenuecat.purchases.paywalls.PaywallColor accent2;
            private final com.revenuecat.purchases.paywalls.PaywallColor accent3;
            private final com.revenuecat.purchases.paywalls.PaywallColor background;
            private final com.revenuecat.purchases.paywalls.PaywallColor callToActionBackground;
            private final com.revenuecat.purchases.paywalls.PaywallColor callToActionForeground;
            private final com.revenuecat.purchases.paywalls.PaywallColor callToActionSecondaryBackground;
            private final com.revenuecat.purchases.paywalls.PaywallColor closeButton;
            private final com.revenuecat.purchases.paywalls.PaywallColor text1;
            private final com.revenuecat.purchases.paywalls.PaywallColor text2;
            private final com.revenuecat.purchases.paywalls.PaywallColor text3;
            private final com.revenuecat.purchases.paywalls.PaywallColor tierControlBackground;
            private final com.revenuecat.purchases.paywalls.PaywallColor tierControlForeground;
            private final com.revenuecat.purchases.paywalls.PaywallColor tierControlSelectedBackground;
            private final com.revenuecat.purchases.paywalls.PaywallColor tierControlSelectedForeground;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.paywalls.PaywallData$Configuration$Colors$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @p070h6.c
            public /* synthetic */ Colors(int i3, @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor, @p119n8.h("text_1") @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor2, @p119n8.h("text_2") @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor3, @p119n8.h("text_3") @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor4, @p119n8.h("call_to_action_background") @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor5, @p119n8.h("call_to_action_foreground") @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor6, @p119n8.h("call_to_action_secondary_background") @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor7, @p119n8.h("accent_1") @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor8, @p119n8.h("accent_2") @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor9, @p119n8.h("accent_3") @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor10, @p119n8.h("close_button") @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor11, @p119n8.h("tier_control_background") @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor12, @p119n8.h("tier_control_foreground") @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor13, @p119n8.h("tier_control_selected_background") @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor14, @p119n8.h("tier_control_selected_foreground") @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class) com.revenuecat.purchases.paywalls.PaywallColor paywallColor15, p153r8.k0 k0Var) {
                if (51 != (i3 & 51)) {
                    p153r8.AbstractC2686a0.l(i3, 51, com.revenuecat.purchases.paywalls.PaywallData$Configuration$Colors$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.background = paywallColor;
                this.text1 = paywallColor2;
                if ((i3 & 4) == 0) {
                    this.text2 = null;
                } else {
                    this.text2 = paywallColor3;
                }
                if ((i3 & 8) == 0) {
                    this.text3 = null;
                } else {
                    this.text3 = paywallColor4;
                }
                this.callToActionBackground = paywallColor5;
                this.callToActionForeground = paywallColor6;
                if ((i3 & 64) == 0) {
                    this.callToActionSecondaryBackground = null;
                } else {
                    this.callToActionSecondaryBackground = paywallColor7;
                }
                if ((i3 & 128) == 0) {
                    this.accent1 = null;
                } else {
                    this.accent1 = paywallColor8;
                }
                if ((i3 & 256) == 0) {
                    this.accent2 = null;
                } else {
                    this.accent2 = paywallColor9;
                }
                if ((i3 & 512) == 0) {
                    this.accent3 = null;
                } else {
                    this.accent3 = paywallColor10;
                }
                if ((i3 & 1024) == 0) {
                    this.closeButton = null;
                } else {
                    this.closeButton = paywallColor11;
                }
                if ((i3 & 2048) == 0) {
                    this.tierControlBackground = null;
                } else {
                    this.tierControlBackground = paywallColor12;
                }
                if ((i3 & 4096) == 0) {
                    this.tierControlForeground = null;
                } else {
                    this.tierControlForeground = paywallColor13;
                }
                if ((i3 & 8192) == 0) {
                    this.tierControlSelectedBackground = null;
                } else {
                    this.tierControlSelectedBackground = paywallColor14;
                }
                if ((i3 & 16384) == 0) {
                    this.tierControlSelectedForeground = null;
                } else {
                    this.tierControlSelectedForeground = paywallColor15;
                }
            }

            @p119n8.h("accent_1")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent1$annotations() {
            }

            @p119n8.h("accent_2")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent2$annotations() {
            }

            @p119n8.h("accent_3")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent3$annotations() {
            }

            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getBackground$annotations() {
            }

            @p119n8.h("call_to_action_background")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionBackground$annotations() {
            }

            @p119n8.h("call_to_action_foreground")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionForeground$annotations() {
            }

            @p119n8.h("call_to_action_secondary_background")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionSecondaryBackground$annotations() {
            }

            @p119n8.h("close_button")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getCloseButton$annotations() {
            }

            @p119n8.h("text_1")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getText1$annotations() {
            }

            @p119n8.h("text_2")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getText2$annotations() {
            }

            @p119n8.h("text_3")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getText3$annotations() {
            }

            @p119n8.h("tier_control_background")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getTierControlBackground$annotations() {
            }

            @p119n8.h("tier_control_foreground")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getTierControlForeground$annotations() {
            }

            @p119n8.h("tier_control_selected_background")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getTierControlSelectedBackground$annotations() {
            }

            @p119n8.h("tier_control_selected_foreground")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.class)
            public static /* synthetic */ void getTierControlSelectedForeground$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.revenuecat.purchases.paywalls.PaywallColor.Serializer serializer = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE;
                output.h(serialDesc, 0, serializer, self.background);
                output.h(serialDesc, 1, serializer, self.text1);
                if (output.E(serialDesc) || self.text2 != null) {
                    output.t(serialDesc, 2, serializer, self.text2);
                }
                if (output.E(serialDesc) || self.text3 != null) {
                    output.t(serialDesc, 3, serializer, self.text3);
                }
                output.h(serialDesc, 4, serializer, self.callToActionBackground);
                output.h(serialDesc, 5, serializer, self.callToActionForeground);
                if (output.E(serialDesc) || self.callToActionSecondaryBackground != null) {
                    output.t(serialDesc, 6, serializer, self.callToActionSecondaryBackground);
                }
                if (output.E(serialDesc) || self.accent1 != null) {
                    output.t(serialDesc, 7, serializer, self.accent1);
                }
                if (output.E(serialDesc) || self.accent2 != null) {
                    output.t(serialDesc, 8, serializer, self.accent2);
                }
                if (output.E(serialDesc) || self.accent3 != null) {
                    output.t(serialDesc, 9, serializer, self.accent3);
                }
                if (output.E(serialDesc) || self.closeButton != null) {
                    output.t(serialDesc, 10, serializer, self.closeButton);
                }
                if (output.E(serialDesc) || self.tierControlBackground != null) {
                    output.t(serialDesc, 11, serializer, self.tierControlBackground);
                }
                if (output.E(serialDesc) || self.tierControlForeground != null) {
                    output.t(serialDesc, 12, serializer, self.tierControlForeground);
                }
                if (output.E(serialDesc) || self.tierControlSelectedBackground != null) {
                    output.t(serialDesc, 13, serializer, self.tierControlSelectedBackground);
                }
                if (!output.E(serialDesc) && self.tierControlSelectedForeground == null) {
                    return;
                }
                output.t(serialDesc, 14, serializer, self.tierControlSelectedForeground);
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors colors = (com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors) obj;
                return kotlin.jvm.internal.m.a(this.background, colors.background) && kotlin.jvm.internal.m.a(this.text1, colors.text1) && kotlin.jvm.internal.m.a(this.text2, colors.text2) && kotlin.jvm.internal.m.a(this.text3, colors.text3) && kotlin.jvm.internal.m.a(this.callToActionBackground, colors.callToActionBackground) && kotlin.jvm.internal.m.a(this.callToActionForeground, colors.callToActionForeground) && kotlin.jvm.internal.m.a(this.callToActionSecondaryBackground, colors.callToActionSecondaryBackground) && kotlin.jvm.internal.m.a(this.accent1, colors.accent1) && kotlin.jvm.internal.m.a(this.accent2, colors.accent2) && kotlin.jvm.internal.m.a(this.accent3, colors.accent3) && kotlin.jvm.internal.m.a(this.closeButton, colors.closeButton) && kotlin.jvm.internal.m.a(this.tierControlBackground, colors.tierControlBackground) && kotlin.jvm.internal.m.a(this.tierControlForeground, colors.tierControlForeground) && kotlin.jvm.internal.m.a(this.tierControlSelectedBackground, colors.tierControlSelectedBackground) && kotlin.jvm.internal.m.a(this.tierControlSelectedForeground, colors.tierControlSelectedForeground);
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getAccent1() {
                return this.accent1;
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getAccent2() {
                return this.accent2;
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getAccent3() {
                return this.accent3;
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getBackground() {
                return this.background;
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getCallToActionBackground() {
                return this.callToActionBackground;
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getCallToActionForeground() {
                return this.callToActionForeground;
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getCallToActionSecondaryBackground() {
                return this.callToActionSecondaryBackground;
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getCloseButton() {
                return this.closeButton;
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getText1() {
                return this.text1;
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getText2() {
                return this.text2;
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getText3() {
                return this.text3;
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getTierControlBackground() {
                return this.tierControlBackground;
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getTierControlForeground() {
                return this.tierControlForeground;
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getTierControlSelectedBackground() {
                return this.tierControlSelectedBackground;
            }

            public final com.revenuecat.purchases.paywalls.PaywallColor getTierControlSelectedForeground() {
                return this.tierControlSelectedForeground;
            }

            public int hashCode() {
                int iHashCode = (this.text1.hashCode() + (this.background.hashCode() * 31)) * 31;
                com.revenuecat.purchases.paywalls.PaywallColor paywallColor = this.text2;
                int iHashCode2 = (iHashCode + (paywallColor == null ? 0 : paywallColor.hashCode())) * 31;
                com.revenuecat.purchases.paywalls.PaywallColor paywallColor2 = this.text3;
                int iHashCode3 = (this.callToActionForeground.hashCode() + ((this.callToActionBackground.hashCode() + ((iHashCode2 + (paywallColor2 == null ? 0 : paywallColor2.hashCode())) * 31)) * 31)) * 31;
                com.revenuecat.purchases.paywalls.PaywallColor paywallColor3 = this.callToActionSecondaryBackground;
                int iHashCode4 = (iHashCode3 + (paywallColor3 == null ? 0 : paywallColor3.hashCode())) * 31;
                com.revenuecat.purchases.paywalls.PaywallColor paywallColor4 = this.accent1;
                int iHashCode5 = (iHashCode4 + (paywallColor4 == null ? 0 : paywallColor4.hashCode())) * 31;
                com.revenuecat.purchases.paywalls.PaywallColor paywallColor5 = this.accent2;
                int iHashCode6 = (iHashCode5 + (paywallColor5 == null ? 0 : paywallColor5.hashCode())) * 31;
                com.revenuecat.purchases.paywalls.PaywallColor paywallColor6 = this.accent3;
                int iHashCode7 = (iHashCode6 + (paywallColor6 == null ? 0 : paywallColor6.hashCode())) * 31;
                com.revenuecat.purchases.paywalls.PaywallColor paywallColor7 = this.closeButton;
                int iHashCode8 = (iHashCode7 + (paywallColor7 == null ? 0 : paywallColor7.hashCode())) * 31;
                com.revenuecat.purchases.paywalls.PaywallColor paywallColor8 = this.tierControlBackground;
                int iHashCode9 = (iHashCode8 + (paywallColor8 == null ? 0 : paywallColor8.hashCode())) * 31;
                com.revenuecat.purchases.paywalls.PaywallColor paywallColor9 = this.tierControlForeground;
                int iHashCode10 = (iHashCode9 + (paywallColor9 == null ? 0 : paywallColor9.hashCode())) * 31;
                com.revenuecat.purchases.paywalls.PaywallColor paywallColor10 = this.tierControlSelectedBackground;
                int iHashCode11 = (iHashCode10 + (paywallColor10 == null ? 0 : paywallColor10.hashCode())) * 31;
                com.revenuecat.purchases.paywalls.PaywallColor paywallColor11 = this.tierControlSelectedForeground;
                return iHashCode11 + (paywallColor11 != null ? paywallColor11.hashCode() : 0);
            }

            public java.lang.String toString() {
                return "Colors(background=" + this.background + ", text1=" + this.text1 + ", text2=" + this.text2 + ", text3=" + this.text3 + ", callToActionBackground=" + this.callToActionBackground + ", callToActionForeground=" + this.callToActionForeground + ", callToActionSecondaryBackground=" + this.callToActionSecondaryBackground + ", accent1=" + this.accent1 + ", accent2=" + this.accent2 + ", accent3=" + this.accent3 + ", closeButton=" + this.closeButton + ", tierControlBackground=" + this.tierControlBackground + ", tierControlForeground=" + this.tierControlForeground + ", tierControlSelectedBackground=" + this.tierControlSelectedBackground + ", tierControlSelectedForeground=" + this.tierControlSelectedForeground + ')';
            }

            public Colors(com.revenuecat.purchases.paywalls.PaywallColor background, com.revenuecat.purchases.paywalls.PaywallColor text1, com.revenuecat.purchases.paywalls.PaywallColor paywallColor, com.revenuecat.purchases.paywalls.PaywallColor paywallColor2, com.revenuecat.purchases.paywalls.PaywallColor callToActionBackground, com.revenuecat.purchases.paywalls.PaywallColor callToActionForeground, com.revenuecat.purchases.paywalls.PaywallColor paywallColor3, com.revenuecat.purchases.paywalls.PaywallColor paywallColor4, com.revenuecat.purchases.paywalls.PaywallColor paywallColor5, com.revenuecat.purchases.paywalls.PaywallColor paywallColor6, com.revenuecat.purchases.paywalls.PaywallColor paywallColor7, com.revenuecat.purchases.paywalls.PaywallColor paywallColor8, com.revenuecat.purchases.paywalls.PaywallColor paywallColor9, com.revenuecat.purchases.paywalls.PaywallColor paywallColor10, com.revenuecat.purchases.paywalls.PaywallColor paywallColor11) {
                kotlin.jvm.internal.m.e(background, "background");
                kotlin.jvm.internal.m.e(text1, "text1");
                kotlin.jvm.internal.m.e(callToActionBackground, "callToActionBackground");
                kotlin.jvm.internal.m.e(callToActionForeground, "callToActionForeground");
                this.background = background;
                this.text1 = text1;
                this.text2 = paywallColor;
                this.text3 = paywallColor2;
                this.callToActionBackground = callToActionBackground;
                this.callToActionForeground = callToActionForeground;
                this.callToActionSecondaryBackground = paywallColor3;
                this.accent1 = paywallColor4;
                this.accent2 = paywallColor5;
                this.accent3 = paywallColor6;
                this.closeButton = paywallColor7;
                this.tierControlBackground = paywallColor8;
                this.tierControlForeground = paywallColor9;
                this.tierControlSelectedBackground = paywallColor10;
                this.tierControlSelectedForeground = paywallColor11;
            }

            public /* synthetic */ Colors(com.revenuecat.purchases.paywalls.PaywallColor paywallColor, com.revenuecat.purchases.paywalls.PaywallColor paywallColor2, com.revenuecat.purchases.paywalls.PaywallColor paywallColor3, com.revenuecat.purchases.paywalls.PaywallColor paywallColor4, com.revenuecat.purchases.paywalls.PaywallColor paywallColor5, com.revenuecat.purchases.paywalls.PaywallColor paywallColor6, com.revenuecat.purchases.paywalls.PaywallColor paywallColor7, com.revenuecat.purchases.paywalls.PaywallColor paywallColor8, com.revenuecat.purchases.paywalls.PaywallColor paywallColor9, com.revenuecat.purchases.paywalls.PaywallColor paywallColor10, com.revenuecat.purchases.paywalls.PaywallColor paywallColor11, com.revenuecat.purchases.paywalls.PaywallColor paywallColor12, com.revenuecat.purchases.paywalls.PaywallColor paywallColor13, com.revenuecat.purchases.paywalls.PaywallColor paywallColor14, com.revenuecat.purchases.paywalls.PaywallColor paywallColor15, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this(paywallColor, paywallColor2, (i3 & 4) != 0 ? null : paywallColor3, (i3 & 8) != 0 ? null : paywallColor4, paywallColor5, paywallColor6, (i3 & 64) != 0 ? null : paywallColor7, (i3 & 128) != 0 ? null : paywallColor8, (i3 & 256) != 0 ? null : paywallColor9, (i3 & 512) != 0 ? null : paywallColor10, (i3 & 1024) != 0 ? null : paywallColor11, (i3 & 2048) != 0 ? null : paywallColor12, (i3 & 4096) != 0 ? null : paywallColor13, (i3 & 8192) != 0 ? null : paywallColor14, (i3 & 16384) != 0 ? null : paywallColor15);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.PaywallData$Configuration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002$#B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "", "", "header", "background", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getHeader", "()Ljava/lang/String;", "getHeader$annotations", "()V", "getBackground", "getBackground$annotations", "getIcon", "getIcon$annotations", "", "getAll$purchases_defaultsRelease", "()Ljava/util/List;", androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL, "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class Images {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images.Companion INSTANCE = new com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images.Companion(null);
            private final java.lang.String background;
            private final java.lang.String header;
            private final java.lang.String icon;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public Images() {
                this((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (kotlin.jvm.internal.AbstractC2541f) null);
            }

            @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getBackground$annotations() {
            }

            @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getHeader$annotations() {
            }

            @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getIcon$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                if (output.E(serialDesc) || self.header != null) {
                    output.t(serialDesc, 0, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, self.header);
                }
                if (output.E(serialDesc) || self.background != null) {
                    output.t(serialDesc, 1, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, self.background);
                }
                if (!output.E(serialDesc) && self.icon == null) {
                    return;
                }
                output.t(serialDesc, 2, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, self.icon);
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images = (com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images) obj;
                return kotlin.jvm.internal.m.a(this.header, images.header) && kotlin.jvm.internal.m.a(this.background, images.background) && kotlin.jvm.internal.m.a(this.icon, images.icon);
            }

            public final java.util.List<java.lang.String> getAll$purchases_defaultsRelease() {
                return p078i6.m.l0(new java.lang.String[]{this.header, this.background, this.icon});
            }

            public final java.lang.String getBackground() {
                return this.background;
            }

            public final java.lang.String getHeader() {
                return this.header;
            }

            public final java.lang.String getIcon() {
                return this.icon;
            }

            public int hashCode() {
                java.lang.String str = this.header;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.String str2 = this.background;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.String str3 = this.icon;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Images(header=");
                sb.append(this.header);
                sb.append(", background=");
                sb.append(this.background);
                sb.append(", icon=");
                return Y6.f.l(sb, this.icon, ')');
            }

            @p070h6.c
            public /* synthetic */ Images(int i3, @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class) java.lang.String str, @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class) java.lang.String str2, @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class) java.lang.String str3, p153r8.k0 k0Var) {
                if ((i3 & 1) == 0) {
                    this.header = null;
                } else {
                    this.header = str;
                }
                if ((i3 & 2) == 0) {
                    this.background = null;
                } else {
                    this.background = str2;
                }
                if ((i3 & 4) == 0) {
                    this.icon = null;
                } else {
                    this.icon = str3;
                }
            }

            public Images(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                this.header = str;
                this.background = str2;
                this.icon = str3;
            }

            public /* synthetic */ Images(java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3);
            }
        }

        @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\"!B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u0019¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "", "", "id", "", "packageIds", "defaultPackageId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/List;", "getPackageIds", "()Ljava/util/List;", "getPackageIds$annotations", "()V", "getDefaultPackageId", "getDefaultPackageId$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class Tier {
            private final java.lang.String defaultPackageId;
            private final java.lang.String id;
            private final java.util.List<java.lang.String> packageIds;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier.Companion INSTANCE = new com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier.Companion(null);
            private static final kotlinx.serialization.KSerializer[] $childSerializers = {null, new p153r8.C2691d(p153r8.p0.f26988a, 0), null};

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.paywalls.PaywallData$Configuration$Tier$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @p070h6.c
            public /* synthetic */ Tier(int i3, java.lang.String str, @p119n8.h(io.sentry.protocol.SdkVersion.JsonKeys.PACKAGES) java.util.List list, @p119n8.h("default_package") java.lang.String str2, p153r8.k0 k0Var) {
                if (7 != (i3 & 7)) {
                    p153r8.AbstractC2686a0.l(i3, 7, com.revenuecat.purchases.paywalls.PaywallData$Configuration$Tier$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.id = str;
                this.packageIds = list;
                this.defaultPackageId = str2;
            }

            @p119n8.h("default_package")
            public static /* synthetic */ void getDefaultPackageId$annotations() {
            }

            @p119n8.h(io.sentry.protocol.SdkVersion.JsonKeys.PACKAGES)
            public static /* synthetic */ void getPackageIds$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
                output.s(serialDesc, 0, self.id);
                output.h(serialDesc, 1, kSerializerArr[1], self.packageIds);
                output.s(serialDesc, 2, self.defaultPackageId);
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier tier = (com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier) obj;
                return kotlin.jvm.internal.m.a(this.id, tier.id) && kotlin.jvm.internal.m.a(this.packageIds, tier.packageIds) && kotlin.jvm.internal.m.a(this.defaultPackageId, tier.defaultPackageId);
            }

            public final java.lang.String getDefaultPackageId() {
                return this.defaultPackageId;
            }

            public final java.lang.String getId() {
                return this.id;
            }

            public final java.util.List<java.lang.String> getPackageIds() {
                return this.packageIds;
            }

            public int hashCode() {
                return this.defaultPackageId.hashCode() + B2.a.b(this.id.hashCode() * 31, 31, this.packageIds);
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Tier(id=");
                sb.append(this.id);
                sb.append(", packageIds=");
                sb.append(this.packageIds);
                sb.append(", defaultPackageId=");
                return Y6.f.l(sb, this.defaultPackageId, ')');
            }

            public Tier(java.lang.String id, java.util.List<java.lang.String> packageIds, java.lang.String defaultPackageId) {
                kotlin.jvm.internal.m.e(id, "id");
                kotlin.jvm.internal.m.e(packageIds, "packageIds");
                kotlin.jvm.internal.m.e(defaultPackageId, "defaultPackageId");
                this.id = id;
                this.packageIds = packageIds;
                this.defaultPackageId = defaultPackageId;
            }
        }

        static {
            p153r8.p0 p0Var = p153r8.p0.f26988a;
            $childSerializers = new kotlinx.serialization.KSerializer[]{new p153r8.C2691d(p0Var, 0), null, null, null, new p153r8.F(p0Var, com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images$$serializer.INSTANCE, 1), null, null, null, null, null, new p153r8.F(p0Var, com.revenuecat.purchases.paywalls.PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, 1), new p153r8.C2691d(com.revenuecat.purchases.paywalls.PaywallData$Configuration$Tier$$serializer.INSTANCE, 0), null};
        }

        @p070h6.c
        public /* synthetic */ Configuration(int i3, @p119n8.h(io.sentry.protocol.SdkVersion.JsonKeys.PACKAGES) java.util.List list, @p119n8.h("default_package") java.lang.String str, @p119n8.h("images_webp") com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images, @p119n8.h(io.sentry.protocol.DebugMeta.JsonKeys.IMAGES) com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images2, @p119n8.h("images_by_tier") java.util.Map map, @p119n8.h("blurred_background_image") boolean z6, @p119n8.h("display_restore_purchases") boolean z9, @p119n8.h("tos_url") @p119n8.i(with = com.revenuecat.purchases.utils.serializers.OptionalURLSerializer.class) java.net.URL url, @p119n8.h("privacy_url") @p119n8.i(with = com.revenuecat.purchases.utils.serializers.OptionalURLSerializer.class) java.net.URL url2, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation colorInformation, @p119n8.h("colors_by_tier") java.util.Map map2, java.util.List list2, @p119n8.h("default_tier") java.lang.String str2, p153r8.k0 k0Var) {
            if (512 != (i3 & 512)) {
                p153r8.AbstractC2686a0.l(i3, 512, com.revenuecat.purchases.paywalls.PaywallData$Configuration$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.packageIds = (i3 & 1) == 0 ? p078i6.w.f23205h : list;
            if ((i3 & 2) == 0) {
                this.defaultPackage = null;
            } else {
                this.defaultPackage = str;
            }
            if ((i3 & 4) == 0) {
                this.imagesWebp = null;
            } else {
                this.imagesWebp = images;
            }
            if ((i3 & 8) == 0) {
                this.legacyImages = null;
            } else {
                this.legacyImages = images2;
            }
            if ((i3 & 16) == 0) {
                this.imagesByTier = null;
            } else {
                this.imagesByTier = map;
            }
            if ((i3 & 32) == 0) {
                this.blurredBackgroundImage = false;
            } else {
                this.blurredBackgroundImage = z6;
            }
            if ((i3 & 64) == 0) {
                this.displayRestorePurchases = true;
            } else {
                this.displayRestorePurchases = z9;
            }
            if ((i3 & 128) == 0) {
                this.termsOfServiceURL = null;
            } else {
                this.termsOfServiceURL = url;
            }
            if ((i3 & 256) == 0) {
                this.privacyURL = null;
            } else {
                this.privacyURL = url2;
            }
            this.colors = colorInformation;
            if ((i3 & 1024) == 0) {
                this.colorsByTier = null;
            } else {
                this.colorsByTier = map2;
            }
            if ((i3 & 2048) == 0) {
                this.tiers = null;
            } else {
                this.tiers = list2;
            }
            if ((i3 & 4096) == 0) {
                this.defaultTier = null;
            } else {
                this.defaultTier = str2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.revenuecat.purchases.paywalls.PaywallData.Configuration copy$default(com.revenuecat.purchases.paywalls.PaywallData.Configuration configuration, java.util.List list, java.lang.String str, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images2, java.util.Map map, boolean z6, boolean z9, java.net.URL url, java.net.URL url2, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation colorInformation, java.util.Map map2, java.util.List list2, java.lang.String str2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                list = configuration.packageIds;
            }
            return configuration.copy(list, (i3 & 2) != 0 ? configuration.defaultPackage : str, (i3 & 4) != 0 ? configuration.imagesWebp : images, (i3 & 8) != 0 ? configuration.legacyImages : images2, (i3 & 16) != 0 ? configuration.imagesByTier : map, (i3 & 32) != 0 ? configuration.blurredBackgroundImage : z6, (i3 & 64) != 0 ? configuration.displayRestorePurchases : z9, (i3 & 128) != 0 ? configuration.termsOfServiceURL : url, (i3 & 256) != 0 ? configuration.privacyURL : url2, (i3 & 512) != 0 ? configuration.colors : colorInformation, (i3 & 1024) != 0 ? configuration.colorsByTier : map2, (i3 & 2048) != 0 ? configuration.tiers : list2, (i3 & 4096) != 0 ? configuration.defaultTier : str2);
        }

        @p119n8.h("blurred_background_image")
        public static /* synthetic */ void getBlurredBackgroundImage$annotations() {
        }

        @p119n8.h("colors_by_tier")
        public static /* synthetic */ void getColorsByTier$annotations() {
        }

        @p119n8.h("default_package")
        public static /* synthetic */ void getDefaultPackage$annotations() {
        }

        @p119n8.h("default_tier")
        public static /* synthetic */ void getDefaultTier$annotations() {
        }

        @p119n8.h("display_restore_purchases")
        public static /* synthetic */ void getDisplayRestorePurchases$annotations() {
        }

        @p119n8.h("images_by_tier")
        public static /* synthetic */ void getImagesByTier$annotations() {
        }

        @p119n8.h("images_webp")
        public static /* synthetic */ void getImagesWebp$purchases_defaultsRelease$annotations() {
        }

        @p119n8.h(io.sentry.protocol.DebugMeta.JsonKeys.IMAGES)
        public static /* synthetic */ void getLegacyImages$purchases_defaultsRelease$annotations() {
        }

        @p119n8.h(io.sentry.protocol.SdkVersion.JsonKeys.PACKAGES)
        public static /* synthetic */ void getPackageIds$annotations() {
        }

        @p119n8.h("privacy_url")
        @p119n8.i(with = com.revenuecat.purchases.utils.serializers.OptionalURLSerializer.class)
        public static /* synthetic */ void getPrivacyURL$annotations() {
        }

        @p119n8.h("tos_url")
        @p119n8.i(with = com.revenuecat.purchases.utils.serializers.OptionalURLSerializer.class)
        public static /* synthetic */ void getTermsOfServiceURL$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.PaywallData.Configuration self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
            if (output.E(serialDesc) || !kotlin.jvm.internal.m.a(self.packageIds, p078i6.w.f23205h)) {
                output.h(serialDesc, 0, kSerializerArr[0], self.packageIds);
            }
            if (output.E(serialDesc) || self.defaultPackage != null) {
                output.t(serialDesc, 1, p153r8.p0.f26988a, self.defaultPackage);
            }
            if (output.E(serialDesc) || self.imagesWebp != null) {
                output.t(serialDesc, 2, com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images$$serializer.INSTANCE, self.imagesWebp);
            }
            if (output.E(serialDesc) || self.legacyImages != null) {
                output.t(serialDesc, 3, com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images$$serializer.INSTANCE, self.legacyImages);
            }
            if (output.E(serialDesc) || self.imagesByTier != null) {
                output.t(serialDesc, 4, kSerializerArr[4], self.imagesByTier);
            }
            if (output.E(serialDesc) || self.blurredBackgroundImage) {
                output.q(serialDesc, 5, self.blurredBackgroundImage);
            }
            if (output.E(serialDesc) || !self.displayRestorePurchases) {
                output.q(serialDesc, 6, self.displayRestorePurchases);
            }
            if (output.E(serialDesc) || self.termsOfServiceURL != null) {
                output.t(serialDesc, 7, com.revenuecat.purchases.utils.serializers.OptionalURLSerializer.INSTANCE, self.termsOfServiceURL);
            }
            if (output.E(serialDesc) || self.privacyURL != null) {
                output.t(serialDesc, 8, com.revenuecat.purchases.utils.serializers.OptionalURLSerializer.INSTANCE, self.privacyURL);
            }
            output.h(serialDesc, 9, com.revenuecat.purchases.paywalls.PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, self.colors);
            if (output.E(serialDesc) || self.colorsByTier != null) {
                output.t(serialDesc, 10, kSerializerArr[10], self.colorsByTier);
            }
            if (output.E(serialDesc) || self.tiers != null) {
                output.t(serialDesc, 11, kSerializerArr[11], self.tiers);
            }
            if (!output.E(serialDesc) && self.defaultTier == null) {
                return;
            }
            output.t(serialDesc, 12, p153r8.p0.f26988a, self.defaultTier);
        }

        public final com.revenuecat.purchases.paywalls.PaywallData.Configuration copy(java.util.List<java.lang.String> packageIds, java.lang.String defaultPackage, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images imagesWebp, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images legacyImages, java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images> imagesByTier, boolean blurredBackgroundImage, boolean displayRestorePurchases, java.net.URL termsOfServiceURL, java.net.URL privacyURL, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation colors, java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation> colorsByTier, java.util.List<com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier> tiers, java.lang.String defaultTier) {
            kotlin.jvm.internal.m.e(packageIds, "packageIds");
            kotlin.jvm.internal.m.e(colors, "colors");
            return new com.revenuecat.purchases.paywalls.PaywallData.Configuration(packageIds, defaultPackage, imagesWebp, legacyImages, imagesByTier, blurredBackgroundImage, displayRestorePurchases, termsOfServiceURL, privacyURL, colors, colorsByTier, tiers, defaultTier);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.paywalls.PaywallData.Configuration)) {
                return false;
            }
            com.revenuecat.purchases.paywalls.PaywallData.Configuration configuration = (com.revenuecat.purchases.paywalls.PaywallData.Configuration) obj;
            return kotlin.jvm.internal.m.a(this.packageIds, configuration.packageIds) && kotlin.jvm.internal.m.a(this.defaultPackage, configuration.defaultPackage) && kotlin.jvm.internal.m.a(this.imagesWebp, configuration.imagesWebp) && kotlin.jvm.internal.m.a(this.legacyImages, configuration.legacyImages) && kotlin.jvm.internal.m.a(this.imagesByTier, configuration.imagesByTier) && this.blurredBackgroundImage == configuration.blurredBackgroundImage && this.displayRestorePurchases == configuration.displayRestorePurchases && kotlin.jvm.internal.m.a(this.termsOfServiceURL, configuration.termsOfServiceURL) && kotlin.jvm.internal.m.a(this.privacyURL, configuration.privacyURL) && kotlin.jvm.internal.m.a(this.colors, configuration.colors) && kotlin.jvm.internal.m.a(this.colorsByTier, configuration.colorsByTier) && kotlin.jvm.internal.m.a(this.tiers, configuration.tiers) && kotlin.jvm.internal.m.a(this.defaultTier, configuration.defaultTier);
        }

        public final boolean getBlurredBackgroundImage() {
            return this.blurredBackgroundImage;
        }

        public final com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation getColors() {
            return this.colors;
        }

        public final java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation> getColorsByTier() {
            return this.colorsByTier;
        }

        public final java.lang.String getDefaultPackage() {
            return this.defaultPackage;
        }

        public final java.lang.String getDefaultTier() {
            return this.defaultTier;
        }

        public final boolean getDisplayRestorePurchases() {
            return this.displayRestorePurchases;
        }

        public final com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images getImages() {
            java.lang.String header;
            java.lang.String background;
            java.lang.String icon;
            com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images = this.imagesWebp;
            java.lang.String icon2 = null;
            if (images == null || (header = images.getHeader()) == null) {
                com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images2 = this.legacyImages;
                header = images2 != null ? images2.getHeader() : null;
            }
            com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images3 = this.imagesWebp;
            if (images3 == null || (background = images3.getBackground()) == null) {
                com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images4 = this.legacyImages;
                background = images4 != null ? images4.getBackground() : null;
            }
            com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images5 = this.imagesWebp;
            if (images5 == null || (icon = images5.getIcon()) == null) {
                com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images6 = this.legacyImages;
                if (images6 != null) {
                    icon2 = images6.getIcon();
                }
            } else {
                icon2 = icon;
            }
            return new com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images(header, background, icon2);
        }

        public final java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images> getImagesByTier() {
            return this.imagesByTier;
        }

        /* JADX INFO: renamed from: getImagesWebp$purchases_defaultsRelease, reason: from getter */
        public final com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images getImagesWebp() {
            return this.imagesWebp;
        }

        /* JADX INFO: renamed from: getLegacyImages$purchases_defaultsRelease, reason: from getter */
        public final com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images getLegacyImages() {
            return this.legacyImages;
        }

        public final java.util.List<java.lang.String> getPackageIds() {
            return this.packageIds;
        }

        public final java.net.URL getPrivacyURL() {
            return this.privacyURL;
        }

        public final java.net.URL getTermsOfServiceURL() {
            return this.termsOfServiceURL;
        }

        public final java.util.List<com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier> getTiers() {
            return this.tiers;
        }

        public int hashCode() {
            int iHashCode = this.packageIds.hashCode() * 31;
            java.lang.String str = this.defaultPackage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images = this.imagesWebp;
            int iHashCode3 = (iHashCode2 + (images == null ? 0 : images.hashCode())) * 31;
            com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images2 = this.legacyImages;
            int iHashCode4 = (iHashCode3 + (images2 == null ? 0 : images2.hashCode())) * 31;
            java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images> map = this.imagesByTier;
            int iF = p121o0.p.f(p121o0.p.f((iHashCode4 + (map == null ? 0 : map.hashCode())) * 31, 31, this.blurredBackgroundImage), 31, this.displayRestorePurchases);
            java.net.URL url = this.termsOfServiceURL;
            int iHashCode5 = (iF + (url == null ? 0 : url.hashCode())) * 31;
            java.net.URL url2 = this.privacyURL;
            int iHashCode6 = (this.colors.hashCode() + ((iHashCode5 + (url2 == null ? 0 : url2.hashCode())) * 31)) * 31;
            java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation> map2 = this.colorsByTier;
            int iHashCode7 = (iHashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
            java.util.List<com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier> list = this.tiers;
            int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            java.lang.String str2 = this.defaultTier;
            return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Configuration(packageIds=");
            sb.append(this.packageIds);
            sb.append(", defaultPackage=");
            sb.append(this.defaultPackage);
            sb.append(", imagesWebp=");
            sb.append(this.imagesWebp);
            sb.append(", legacyImages=");
            sb.append(this.legacyImages);
            sb.append(", imagesByTier=");
            sb.append(this.imagesByTier);
            sb.append(", blurredBackgroundImage=");
            sb.append(this.blurredBackgroundImage);
            sb.append(", displayRestorePurchases=");
            sb.append(this.displayRestorePurchases);
            sb.append(", termsOfServiceURL=");
            sb.append(this.termsOfServiceURL);
            sb.append(", privacyURL=");
            sb.append(this.privacyURL);
            sb.append(", colors=");
            sb.append(this.colors);
            sb.append(", colorsByTier=");
            sb.append(this.colorsByTier);
            sb.append(", tiers=");
            sb.append(this.tiers);
            sb.append(", defaultTier=");
            return Y6.f.l(sb, this.defaultTier, ')');
        }

        public Configuration(java.util.List<java.lang.String> packageIds, java.lang.String str, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images2, java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images> map, boolean z6, boolean z9, java.net.URL url, java.net.URL url2, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation colors, java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation> map2, java.util.List<com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier> list, java.lang.String str2) {
            kotlin.jvm.internal.m.e(packageIds, "packageIds");
            kotlin.jvm.internal.m.e(colors, "colors");
            this.packageIds = packageIds;
            this.defaultPackage = str;
            this.imagesWebp = images;
            this.legacyImages = images2;
            this.imagesByTier = map;
            this.blurredBackgroundImage = z6;
            this.displayRestorePurchases = z9;
            this.termsOfServiceURL = url;
            this.privacyURL = url2;
            this.colors = colors;
            this.colorsByTier = map2;
            this.tiers = list;
            this.defaultTier = str2;
        }

        public /* synthetic */ Configuration(java.util.List list, java.lang.String str, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images2, java.util.Map map, boolean z6, boolean z9, java.net.URL url, java.net.URL url2, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation colorInformation, java.util.Map map2, java.util.List list2, java.lang.String str2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this((java.util.List<java.lang.String>) ((i3 & 1) != 0 ? p078i6.w.f23205h : list), (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : images, (i3 & 8) != 0 ? null : images2, (java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images>) ((i3 & 16) != 0 ? null : map), (i3 & 32) != 0 ? false : z6, (i3 & 64) != 0 ? true : z9, (i3 & 128) != 0 ? null : url, (i3 & 256) != 0 ? null : url2, colorInformation, (java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation>) ((i3 & 1024) != 0 ? null : map2), (java.util.List<com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier>) ((i3 & 2048) != 0 ? null : list2), (i3 & 4096) != 0 ? null : str2);
        }

        public /* synthetic */ Configuration(java.util.List list, java.lang.String str, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images, java.util.Map map, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation colorInformation, java.util.Map map2, java.util.List list2, boolean z6, boolean z9, java.net.URL url, java.net.URL url2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(list, (i3 & 2) != 0 ? null : str, images, (i3 & 8) != 0 ? null : map, colorInformation, (i3 & 32) != 0 ? null : map2, (i3 & 64) != 0 ? null : list2, (i3 & 128) != 0 ? false : z6, (i3 & 256) != 0 ? true : z9, (i3 & 512) != 0 ? null : url, (i3 & 1024) != 0 ? null : url2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(java.util.List<java.lang.String> packageIds, java.lang.String str, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images images, java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images> map, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation colors, java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation> map2, java.util.List<com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier> list, boolean z6, boolean z9, java.net.URL url, java.net.URL url2) {
            this(packageIds, str, images, (com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images) null, map, z6, z9, url, url2, colors, map2, list, (java.lang.String) null, 4104, (kotlin.jvm.internal.AbstractC2541f) null);
            kotlin.jvm.internal.m.e(packageIds, "packageIds");
            kotlin.jvm.internal.m.e(images, "images");
            kotlin.jvm.internal.m.e(colors, "colors");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0007\u0018\u0000 @2\u00020\u0001:\u0004A@BCB\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014B¹\u0001\b\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J(\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÁ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010%R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010#\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010#\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010%R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010#\u0012\u0004\b4\u0010(\u001a\u0004\b3\u0010%R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010#\u0012\u0004\b6\u0010(\u001a\u0004\b5\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010#\u0012\u0004\b;\u0010(\u001a\u0004\b:\u0010%R,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010<\u0012\u0004\b?\u0010(\u001a\u0004\b=\u0010>¨\u0006D"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "", "", io.ktor.http.LinkHeader.Parameters.Title, "subtitle", "callToAction", "callToActionWithIntroOffer", "callToActionWithMultipleIntroOffers", "offerDetails", "offerDetailsWithIntroOffer", "offerDetailsWithMultipleIntroOffers", "offerName", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "features", "tierName", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "offerOverrides", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getSubtitle$annotations", "()V", "getCallToAction", "getCallToAction$annotations", "getCallToActionWithIntroOffer", "getCallToActionWithIntroOffer$annotations", "getCallToActionWithMultipleIntroOffers", "getCallToActionWithMultipleIntroOffers$annotations", "getOfferDetails", "getOfferDetails$annotations", "getOfferDetailsWithIntroOffer", "getOfferDetailsWithIntroOffer$annotations", "getOfferDetailsWithMultipleIntroOffers", "getOfferDetailsWithMultipleIntroOffers$annotations", "getOfferName", "getOfferName$annotations", "Ljava/util/List;", "getFeatures", "()Ljava/util/List;", "getTierName", "getTierName$annotations", "Ljava/util/Map;", "getOfferOverrides", "()Ljava/util/Map;", "getOfferOverrides$annotations", "Companion", "$serializer", "Feature", "OfferOverride", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class LocalizedConfiguration {
        private final java.lang.String callToAction;
        private final java.lang.String callToActionWithIntroOffer;
        private final java.lang.String callToActionWithMultipleIntroOffers;
        private final java.util.List<com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature> features;
        private final java.lang.String offerDetails;
        private final java.lang.String offerDetailsWithIntroOffer;
        private final java.lang.String offerDetailsWithMultipleIntroOffers;
        private final java.lang.String offerName;
        private final java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride> offerOverrides;
        private final java.lang.String subtitle;
        private final java.lang.String tierName;
        private final java.lang.String title;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Companion INSTANCE = new com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Companion(null);
        private static final kotlinx.serialization.KSerializer[] $childSerializers = {null, null, null, null, null, null, null, null, null, new p153r8.C2691d(com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE, 0), null, new p153r8.F(p153r8.p0.f26988a, com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE, 1)};

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001a¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "", "", io.ktor.http.LinkHeader.Parameters.Title, "content", "iconID", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getContent", "getIconID", "getIconID$annotations", "()V", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class Feature {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature.Companion INSTANCE = new com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature.Companion(null);
            private final java.lang.String content;
            private final java.lang.String iconID;
            private final java.lang.String title;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @p070h6.c
            public /* synthetic */ Feature(int i3, java.lang.String str, java.lang.String str2, @p119n8.h("icon_id") java.lang.String str3, p153r8.k0 k0Var) {
                if (1 != (i3 & 1)) {
                    p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.title = str;
                if ((i3 & 2) == 0) {
                    this.content = null;
                } else {
                    this.content = str2;
                }
                if ((i3 & 4) == 0) {
                    this.iconID = null;
                } else {
                    this.iconID = str3;
                }
            }

            public static /* synthetic */ com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature copy$default(com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature feature, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    str = feature.title;
                }
                if ((i3 & 2) != 0) {
                    str2 = feature.content;
                }
                if ((i3 & 4) != 0) {
                    str3 = feature.iconID;
                }
                return feature.copy(str, str2, str3);
            }

            @p119n8.h("icon_id")
            public static /* synthetic */ void getIconID$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.s(serialDesc, 0, self.title);
                if (output.E(serialDesc) || self.content != null) {
                    output.t(serialDesc, 1, p153r8.p0.f26988a, self.content);
                }
                if (!output.E(serialDesc) && self.iconID == null) {
                    return;
                }
                output.t(serialDesc, 2, p153r8.p0.f26988a, self.iconID);
            }

            public final /* synthetic */ com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature copy(java.lang.String title, java.lang.String content, java.lang.String iconID) {
                kotlin.jvm.internal.m.e(title, "title");
                return new com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature(title, content, iconID);
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature feature = (com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature) obj;
                return kotlin.jvm.internal.m.a(this.title, feature.title) && kotlin.jvm.internal.m.a(this.content, feature.content) && kotlin.jvm.internal.m.a(this.iconID, feature.iconID);
            }

            public final java.lang.String getContent() {
                return this.content;
            }

            public final java.lang.String getIconID() {
                return this.iconID;
            }

            public final java.lang.String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                java.lang.String str = this.content;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                java.lang.String str2 = this.iconID;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Feature(title=");
                sb.append(this.title);
                sb.append(", content=");
                sb.append(this.content);
                sb.append(", iconID=");
                return Y6.f.l(sb, this.iconID, ')');
            }

            public Feature(java.lang.String title, java.lang.String str, java.lang.String str2) {
                kotlin.jvm.internal.m.e(title, "title");
                this.title = title;
                this.content = str;
                this.iconID = str2;
            }

            public /* synthetic */ Feature(java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002&%B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBW\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b!\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u0012\u0004\b$\u0010\u001c\u001a\u0004\b#\u0010\u001a¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "", "", "offerName", "offerDetails", "offerDetailsWithIntroOffer", "offerDetailsWithMultipleIntroOffers", "offerBadge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOfferName", "()Ljava/lang/String;", "getOfferName$annotations", "()V", "getOfferDetails", "getOfferDetails$annotations", "getOfferDetailsWithIntroOffer", "getOfferDetailsWithIntroOffer$annotations", "getOfferDetailsWithMultipleIntroOffers", "getOfferDetailsWithMultipleIntroOffers$annotations", "getOfferBadge", "getOfferBadge$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class OfferOverride {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride.Companion INSTANCE = new com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride.Companion(null);
            private final java.lang.String offerBadge;
            private final java.lang.String offerDetails;
            private final java.lang.String offerDetailsWithIntroOffer;
            private final java.lang.String offerDetailsWithMultipleIntroOffers;
            private final java.lang.String offerName;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @p070h6.c
            public /* synthetic */ OfferOverride(int i3, @p119n8.h("offer_name") java.lang.String str, @p119n8.h("offer_details") java.lang.String str2, @p119n8.h("offer_details_with_intro_offer") @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class) java.lang.String str3, @p119n8.h("offer_details_with_multiple_intro_offers") @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class) java.lang.String str4, @p119n8.h("offer_badge") @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class) java.lang.String str5, p153r8.k0 k0Var) {
                if (3 != (i3 & 3)) {
                    p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.offerName = str;
                this.offerDetails = str2;
                if ((i3 & 4) == 0) {
                    this.offerDetailsWithIntroOffer = null;
                } else {
                    this.offerDetailsWithIntroOffer = str3;
                }
                if ((i3 & 8) == 0) {
                    this.offerDetailsWithMultipleIntroOffers = null;
                } else {
                    this.offerDetailsWithMultipleIntroOffers = str4;
                }
                if ((i3 & 16) == 0) {
                    this.offerBadge = null;
                } else {
                    this.offerBadge = str5;
                }
            }

            @p119n8.h("offer_badge")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getOfferBadge$annotations() {
            }

            @p119n8.h("offer_details")
            public static /* synthetic */ void getOfferDetails$annotations() {
            }

            @p119n8.h("offer_details_with_intro_offer")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
            }

            @p119n8.h("offer_details_with_multiple_intro_offers")
            @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
            }

            @p119n8.h("offer_name")
            public static /* synthetic */ void getOfferName$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.s(serialDesc, 0, self.offerName);
                output.s(serialDesc, 1, self.offerDetails);
                if (output.E(serialDesc) || self.offerDetailsWithIntroOffer != null) {
                    output.t(serialDesc, 2, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, self.offerDetailsWithIntroOffer);
                }
                if (output.E(serialDesc) || self.offerDetailsWithMultipleIntroOffers != null) {
                    output.t(serialDesc, 3, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, self.offerDetailsWithMultipleIntroOffers);
                }
                if (!output.E(serialDesc) && self.offerBadge == null) {
                    return;
                }
                output.t(serialDesc, 4, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, self.offerBadge);
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride offerOverride = (com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride) obj;
                return kotlin.jvm.internal.m.a(this.offerName, offerOverride.offerName) && kotlin.jvm.internal.m.a(this.offerDetails, offerOverride.offerDetails) && kotlin.jvm.internal.m.a(this.offerDetailsWithIntroOffer, offerOverride.offerDetailsWithIntroOffer) && kotlin.jvm.internal.m.a(this.offerDetailsWithMultipleIntroOffers, offerOverride.offerDetailsWithMultipleIntroOffers) && kotlin.jvm.internal.m.a(this.offerBadge, offerOverride.offerBadge);
            }

            public final java.lang.String getOfferBadge() {
                return this.offerBadge;
            }

            public final java.lang.String getOfferDetails() {
                return this.offerDetails;
            }

            public final java.lang.String getOfferDetailsWithIntroOffer() {
                return this.offerDetailsWithIntroOffer;
            }

            public final java.lang.String getOfferDetailsWithMultipleIntroOffers() {
                return this.offerDetailsWithMultipleIntroOffers;
            }

            public final java.lang.String getOfferName() {
                return this.offerName;
            }

            public int hashCode() {
                int iA = B2.a.a(this.offerName.hashCode() * 31, 31, this.offerDetails);
                java.lang.String str = this.offerDetailsWithIntroOffer;
                int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
                java.lang.String str2 = this.offerDetailsWithMultipleIntroOffers;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.String str3 = this.offerBadge;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OfferOverride(offerName=");
                sb.append(this.offerName);
                sb.append(", offerDetails=");
                sb.append(this.offerDetails);
                sb.append(", offerDetailsWithIntroOffer=");
                sb.append(this.offerDetailsWithIntroOffer);
                sb.append(", offerDetailsWithMultipleIntroOffers=");
                sb.append(this.offerDetailsWithMultipleIntroOffers);
                sb.append(", offerBadge=");
                return Y6.f.l(sb, this.offerBadge, ')');
            }

            public OfferOverride(java.lang.String offerName, java.lang.String offerDetails, java.lang.String str, java.lang.String str2, java.lang.String str3) {
                kotlin.jvm.internal.m.e(offerName, "offerName");
                kotlin.jvm.internal.m.e(offerDetails, "offerDetails");
                this.offerName = offerName;
                this.offerDetails = offerDetails;
                this.offerDetailsWithIntroOffer = str;
                this.offerDetailsWithMultipleIntroOffers = str2;
                this.offerBadge = str3;
            }

            public /* synthetic */ OfferOverride(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this(str, str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : str5);
            }
        }

        @p070h6.c
        public /* synthetic */ LocalizedConfiguration(int i3, java.lang.String str, @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class) java.lang.String str2, @p119n8.h("call_to_action") java.lang.String str3, @p119n8.h("call_to_action_with_intro_offer") @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class) java.lang.String str4, @p119n8.h("call_to_action_with_multiple_intro_offers") @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class) java.lang.String str5, @p119n8.h("offer_details") @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class) java.lang.String str6, @p119n8.h("offer_details_with_intro_offer") @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class) java.lang.String str7, @p119n8.h("offer_details_with_multiple_intro_offers") @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class) java.lang.String str8, @p119n8.h("offer_name") @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class) java.lang.String str9, java.util.List list, @p119n8.h("tier_name") @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class) java.lang.String str10, @p119n8.h("offer_overrides") java.util.Map map, p153r8.k0 k0Var) {
            if (5 != (i3 & 5)) {
                p153r8.AbstractC2686a0.l(i3, 5, com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.title = str;
            if ((i3 & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            this.callToAction = str3;
            if ((i3 & 8) == 0) {
                this.callToActionWithIntroOffer = null;
            } else {
                this.callToActionWithIntroOffer = str4;
            }
            if ((i3 & 16) == 0) {
                this.callToActionWithMultipleIntroOffers = null;
            } else {
                this.callToActionWithMultipleIntroOffers = str5;
            }
            if ((i3 & 32) == 0) {
                this.offerDetails = null;
            } else {
                this.offerDetails = str6;
            }
            if ((i3 & 64) == 0) {
                this.offerDetailsWithIntroOffer = null;
            } else {
                this.offerDetailsWithIntroOffer = str7;
            }
            if ((i3 & 128) == 0) {
                this.offerDetailsWithMultipleIntroOffers = null;
            } else {
                this.offerDetailsWithMultipleIntroOffers = str8;
            }
            if ((i3 & 256) == 0) {
                this.offerName = null;
            } else {
                this.offerName = str9;
            }
            if ((i3 & 512) == 0) {
                this.features = p078i6.w.f23205h;
            } else {
                this.features = list;
            }
            if ((i3 & 1024) == 0) {
                this.tierName = null;
            } else {
                this.tierName = str10;
            }
            this.offerOverrides = (i3 & 2048) == 0 ? p078i6.x.f23206h : map;
        }

        @p119n8.h("call_to_action")
        public static /* synthetic */ void getCallToAction$annotations() {
        }

        @p119n8.h("call_to_action_with_intro_offer")
        @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getCallToActionWithIntroOffer$annotations() {
        }

        @p119n8.h("call_to_action_with_multiple_intro_offers")
        @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getCallToActionWithMultipleIntroOffers$annotations() {
        }

        @p119n8.h("offer_details")
        @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetails$annotations() {
        }

        @p119n8.h("offer_details_with_intro_offer")
        @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
        }

        @p119n8.h("offer_details_with_multiple_intro_offers")
        @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
        }

        @p119n8.h("offer_name")
        @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferName$annotations() {
        }

        @p119n8.h("offer_overrides")
        public static /* synthetic */ void getOfferOverrides$annotations() {
        }

        @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getSubtitle$annotations() {
        }

        @p119n8.h("tier_name")
        @p119n8.i(with = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getTierName$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
            output.s(serialDesc, 0, self.title);
            if (output.E(serialDesc) || self.subtitle != null) {
                output.t(serialDesc, 1, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, self.subtitle);
            }
            output.s(serialDesc, 2, self.callToAction);
            if (output.E(serialDesc) || self.callToActionWithIntroOffer != null) {
                output.t(serialDesc, 3, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, self.callToActionWithIntroOffer);
            }
            if (output.E(serialDesc) || self.callToActionWithMultipleIntroOffers != null) {
                output.t(serialDesc, 4, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, self.callToActionWithMultipleIntroOffers);
            }
            if (output.E(serialDesc) || self.offerDetails != null) {
                output.t(serialDesc, 5, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, self.offerDetails);
            }
            if (output.E(serialDesc) || self.offerDetailsWithIntroOffer != null) {
                output.t(serialDesc, 6, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, self.offerDetailsWithIntroOffer);
            }
            if (output.E(serialDesc) || self.offerDetailsWithMultipleIntroOffers != null) {
                output.t(serialDesc, 7, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, self.offerDetailsWithMultipleIntroOffers);
            }
            if (output.E(serialDesc) || self.offerName != null) {
                output.t(serialDesc, 8, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, self.offerName);
            }
            if (output.E(serialDesc) || !kotlin.jvm.internal.m.a(self.features, p078i6.w.f23205h)) {
                output.h(serialDesc, 9, kSerializerArr[9], self.features);
            }
            if (output.E(serialDesc) || self.tierName != null) {
                output.t(serialDesc, 10, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, self.tierName);
            }
            if (!output.E(serialDesc) && kotlin.jvm.internal.m.a(self.offerOverrides, p078i6.x.f23206h)) {
                return;
            }
            output.h(serialDesc, 11, kSerializerArr[11], self.offerOverrides);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration)) {
                return false;
            }
            com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration localizedConfiguration = (com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration) obj;
            return kotlin.jvm.internal.m.a(this.title, localizedConfiguration.title) && kotlin.jvm.internal.m.a(this.subtitle, localizedConfiguration.subtitle) && kotlin.jvm.internal.m.a(this.callToAction, localizedConfiguration.callToAction) && kotlin.jvm.internal.m.a(this.callToActionWithIntroOffer, localizedConfiguration.callToActionWithIntroOffer) && kotlin.jvm.internal.m.a(this.callToActionWithMultipleIntroOffers, localizedConfiguration.callToActionWithMultipleIntroOffers) && kotlin.jvm.internal.m.a(this.offerDetails, localizedConfiguration.offerDetails) && kotlin.jvm.internal.m.a(this.offerDetailsWithIntroOffer, localizedConfiguration.offerDetailsWithIntroOffer) && kotlin.jvm.internal.m.a(this.offerDetailsWithMultipleIntroOffers, localizedConfiguration.offerDetailsWithMultipleIntroOffers) && kotlin.jvm.internal.m.a(this.offerName, localizedConfiguration.offerName) && kotlin.jvm.internal.m.a(this.features, localizedConfiguration.features) && kotlin.jvm.internal.m.a(this.tierName, localizedConfiguration.tierName) && kotlin.jvm.internal.m.a(this.offerOverrides, localizedConfiguration.offerOverrides);
        }

        public final java.lang.String getCallToAction() {
            return this.callToAction;
        }

        public final java.lang.String getCallToActionWithIntroOffer() {
            return this.callToActionWithIntroOffer;
        }

        public final java.lang.String getCallToActionWithMultipleIntroOffers() {
            return this.callToActionWithMultipleIntroOffers;
        }

        public final java.util.List<com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature> getFeatures() {
            return this.features;
        }

        public final java.lang.String getOfferDetails() {
            return this.offerDetails;
        }

        public final java.lang.String getOfferDetailsWithIntroOffer() {
            return this.offerDetailsWithIntroOffer;
        }

        public final java.lang.String getOfferDetailsWithMultipleIntroOffers() {
            return this.offerDetailsWithMultipleIntroOffers;
        }

        public final java.lang.String getOfferName() {
            return this.offerName;
        }

        public final java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride> getOfferOverrides() {
            return this.offerOverrides;
        }

        public final java.lang.String getSubtitle() {
            return this.subtitle;
        }

        public final java.lang.String getTierName() {
            return this.tierName;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            java.lang.String str = this.subtitle;
            int iA = B2.a.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.callToAction);
            java.lang.String str2 = this.callToActionWithIntroOffer;
            int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.callToActionWithMultipleIntroOffers;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.String str4 = this.offerDetails;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            java.lang.String str5 = this.offerDetailsWithIntroOffer;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            java.lang.String str6 = this.offerDetailsWithMultipleIntroOffers;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            java.lang.String str7 = this.offerName;
            int iB = B2.a.b((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.features);
            java.lang.String str8 = this.tierName;
            return this.offerOverrides.hashCode() + ((iB + (str8 != null ? str8.hashCode() : 0)) * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LocalizedConfiguration(title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", callToAction=");
            sb.append(this.callToAction);
            sb.append(", callToActionWithIntroOffer=");
            sb.append(this.callToActionWithIntroOffer);
            sb.append(", callToActionWithMultipleIntroOffers=");
            sb.append(this.callToActionWithMultipleIntroOffers);
            sb.append(", offerDetails=");
            sb.append(this.offerDetails);
            sb.append(", offerDetailsWithIntroOffer=");
            sb.append(this.offerDetailsWithIntroOffer);
            sb.append(", offerDetailsWithMultipleIntroOffers=");
            sb.append(this.offerDetailsWithMultipleIntroOffers);
            sb.append(", offerName=");
            sb.append(this.offerName);
            sb.append(", features=");
            sb.append(this.features);
            sb.append(", tierName=");
            sb.append(this.tierName);
            sb.append(", offerOverrides=");
            return p121o0.p.r(sb, this.offerOverrides, ')');
        }

        public LocalizedConfiguration(java.lang.String title, java.lang.String str, java.lang.String callToAction, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.util.List<com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature> features, java.lang.String str8, java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride> offerOverrides) {
            kotlin.jvm.internal.m.e(title, "title");
            kotlin.jvm.internal.m.e(callToAction, "callToAction");
            kotlin.jvm.internal.m.e(features, "features");
            kotlin.jvm.internal.m.e(offerOverrides, "offerOverrides");
            this.title = title;
            this.subtitle = str;
            this.callToAction = callToAction;
            this.callToActionWithIntroOffer = str2;
            this.callToActionWithMultipleIntroOffers = str3;
            this.offerDetails = str4;
            this.offerDetailsWithIntroOffer = str5;
            this.offerDetailsWithMultipleIntroOffers = str6;
            this.offerName = str7;
            this.features = features;
            this.tierName = str8;
            this.offerOverrides = offerOverrides;
        }

        public /* synthetic */ LocalizedConfiguration(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.util.List list, java.lang.String str10, java.util.Map map, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(str, (i3 & 2) != 0 ? null : str2, str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : str5, (i3 & 32) != 0 ? null : str6, (i3 & 64) != 0 ? null : str7, (i3 & 128) != 0 ? null : str8, (i3 & 256) != 0 ? null : str9, (i3 & 512) != 0 ? p078i6.w.f23205h : list, (i3 & 1024) != 0 ? null : str10, (i3 & 2048) != 0 ? p078i6.x.f23206h : map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallData(java.lang.String str, java.lang.String templateName, com.revenuecat.purchases.paywalls.PaywallData.Configuration config, java.net.URL assetBaseURL, int i3, java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration> localization, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration>> localizationByTier, java.util.List<java.lang.String> zeroDecimalPlaceCountries, java.lang.String str2) {
        kotlin.jvm.internal.m.e(templateName, "templateName");
        kotlin.jvm.internal.m.e(config, "config");
        kotlin.jvm.internal.m.e(assetBaseURL, "assetBaseURL");
        kotlin.jvm.internal.m.e(localization, "localization");
        kotlin.jvm.internal.m.e(localizationByTier, "localizationByTier");
        kotlin.jvm.internal.m.e(zeroDecimalPlaceCountries, "zeroDecimalPlaceCountries");
        this.id = str;
        this.templateName = templateName;
        this.config = config;
        this.assetBaseURL = assetBaseURL;
        this.revision = i3;
        this.localization = localization;
        this.localizationByTier = localizationByTier;
        this.zeroDecimalPlaceCountries = zeroDecimalPlaceCountries;
        this.defaultLocale = str2;
    }

    public /* synthetic */ PaywallData(java.lang.String str, java.lang.String str2, com.revenuecat.purchases.paywalls.PaywallData.Configuration configuration, java.net.URL url, int i3, java.util.Map map, java.util.Map map2, java.util.List list, java.lang.String str3, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i9 & 1) != 0 ? null : str, str2, configuration, url, (i9 & 16) != 0 ? 0 : i3, map, (i9 & 64) != 0 ? p078i6.x.f23206h : map2, (i9 & 128) != 0 ? p078i6.w.f23205h : list, (i9 & 256) != 0 ? null : str3);
    }
}
