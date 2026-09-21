package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J6\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007JH\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007J4\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010!\u001a\u00020\u0004H\u0002J,\u0010\"\u001a\u0004\u0018\u00010\u000e2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b2\u0006\u0010\u001b\u001a\u00020\tH$J\u001c\u0010#\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/common/OfferingParser;", "", "shouldParsePaywallComponents", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "createOffering", "Lcom/revenuecat/purchases/Offering;", "offeringJson", "Lorg/json/JSONObject;", "productsById", "", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "uiConfig", "Lcom/revenuecat/purchases/UiConfig;", "createOfferings", "Lcom/revenuecat/purchases/Offerings;", "offeringsJson", "originalSource", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "loadedFromDiskCache", "configuredStore", "Lcom/revenuecat/purchases/Store;", "createPackage", "Lcom/revenuecat/purchases/Package;", "packageJson", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "createPaywallComponents", "Lcom/revenuecat/purchases/Offering$PaywallComponents;", "paywallComponentsJson", "hasWellShaped", "findMatchingProduct", "hasWellShapedPaywallComponents", "offeringEmptyMessage", "offeringIdentifier", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class OfferingParser {
    private final kotlin.jvm.functions.Function0 shouldParsePaywallComponents;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.OfferingParser$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.common.OfferingParser.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.common.OfferingParser.AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.OfferingParser$createPaywallComponents$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ java.lang.String $rawPaywallComponents;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(java.lang.String str) {
            super(0);
            this.$rawPaywallComponents = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData invoke() {
            p162s8.d json = com.revenuecat.purchases.JsonTools.INSTANCE.getJson();
            java.lang.String str = this.$rawPaywallComponents;
            json.getClass();
            return (com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData) json.b(str, com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData.INSTANCE.serializer());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OfferingParser() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.revenuecat.purchases.Offerings createOfferings$default(com.revenuecat.purchases.common.OfferingParser offeringParser, org.json.JSONObject jSONObject, java.util.Map map, com.revenuecat.purchases.common.HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z6, com.revenuecat.purchases.Store store, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createOfferings");
        }
        if ((i3 & 4) != 0) {
            hTTPResponseOriginalSource = com.revenuecat.purchases.common.HTTPResponseOriginalSource.MAIN;
        }
        com.revenuecat.purchases.common.HTTPResponseOriginalSource hTTPResponseOriginalSource2 = hTTPResponseOriginalSource;
        if ((i3 & 8) != 0) {
            z6 = false;
        }
        boolean z9 = z6;
        if ((i3 & 16) != 0) {
            store = com.revenuecat.purchases.Store.PLAY_STORE;
        }
        return offeringParser.createOfferings(jSONObject, map, hTTPResponseOriginalSource2, z9, store);
    }

    private final com.revenuecat.purchases.Offering.PaywallComponents createPaywallComponents(org.json.JSONObject paywallComponentsJson, com.revenuecat.purchases.UiConfig uiConfig, boolean hasWellShaped) {
        if (paywallComponentsJson == null || uiConfig == null) {
            return null;
        }
        if (hasWellShaped) {
            if (!((java.lang.Boolean) this.shouldParsePaywallComponents.invoke()).booleanValue()) {
                return null;
            }
            java.lang.String string = paywallComponentsJson.toString();
            kotlin.jvm.internal.m.d(string, "paywallComponentsJson.toString()");
            return new com.revenuecat.purchases.Offering.PaywallComponents(uiConfig, com.revenuecat.purchases.common.UtilsKt.sha256(string), new com.revenuecat.purchases.common.OfferingParser.AnonymousClass2(string));
        }
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.WARN;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.w("[Purchases] - " + logLevel.name(), "Skipping paywall components data with unexpected shape for offering");
        }
        return null;
    }

    private final boolean hasWellShapedPaywallComponents(org.json.JSONObject paywallComponentsJson, com.revenuecat.purchases.UiConfig uiConfig) {
        return (paywallComponentsJson == null || uiConfig == null || !com.revenuecat.purchases.common.OfferingParserKt.hasPaywallComponentsShape(paywallComponentsJson)) ? false : true;
    }

    private final java.lang.String offeringEmptyMessage(java.lang.String offeringIdentifier, com.revenuecat.purchases.Store configuredStore) {
        return java.lang.String.format(configuredStore == com.revenuecat.purchases.Store.TEST_STORE ? com.revenuecat.purchases.strings.OfferingStrings.OFFERING_EMPTY_TEST_STORE : com.revenuecat.purchases.strings.OfferingStrings.OFFERING_EMPTY, java.util.Arrays.copyOf(new java.lang.Object[]{offeringIdentifier}, 1));
    }

    public final com.revenuecat.purchases.Offering createOffering(org.json.JSONObject offeringJson, java.util.Map<java.lang.String, ? extends java.util.List<? extends com.revenuecat.purchases.models.StoreProduct>> productsById, com.revenuecat.purchases.UiConfig uiConfig) throws org.json.JSONException {
        java.util.Map map;
        com.revenuecat.purchases.paywalls.PaywallData paywallData;
        com.revenuecat.purchases.paywalls.PaywallData paywallData2;
        kotlin.jvm.internal.m.e(offeringJson, "offeringJson");
        kotlin.jvm.internal.m.e(productsById, "productsById");
        java.lang.String offeringIdentifier = offeringJson.getString(io.sentry.protocol.ViewHierarchyNode.JsonKeys.IDENTIFIER);
        org.json.JSONObject jSONObjectOptJSONObject = offeringJson.optJSONObject(androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA);
        if (jSONObjectOptJSONObject == null || (map = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.toMap(jSONObjectOptJSONObject, true)) == null) {
            map = p078i6.x.f23206h;
        }
        java.util.Map map2 = map;
        org.json.JSONArray jSONArray = offeringJson.getJSONArray(io.sentry.protocol.SdkVersion.JsonKeys.PACKAGES);
        kotlin.jvm.internal.m.d(offeringIdentifier, "offeringIdentifier");
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = new com.revenuecat.purchases.PresentedOfferingContext(offeringIdentifier);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            org.json.JSONObject packageJson = jSONArray.getJSONObject(i3);
            kotlin.jvm.internal.m.d(packageJson, "packageJson");
            com.revenuecat.purchases.Package packageCreatePackage = createPackage(packageJson, productsById, presentedOfferingContext);
            if (packageCreatePackage != null) {
                arrayList.add(packageCreatePackage);
            }
        }
        org.json.JSONObject jSONObjectOptJSONObject2 = offeringJson.optJSONObject(com.revenuecat.purchases.common.workflows.WorkflowScreenType.PAYWALL);
        if (jSONObjectOptJSONObject2 != null) {
            try {
                p162s8.d json = com.revenuecat.purchases.JsonTools.INSTANCE.getJson();
                java.lang.String string = jSONObjectOptJSONObject2.toString();
                kotlin.jvm.internal.m.d(string, "it.toString()");
                json.getClass();
                paywallData = (com.revenuecat.purchases.paywalls.PaywallData) json.b(string, com.revenuecat.purchases.paywalls.PaywallData.INSTANCE.serializer());
            } catch (java.lang.Exception e6) {
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error deserializing paywall data", e6);
                paywallData = null;
            }
            paywallData2 = paywallData;
        } else {
            paywallData2 = null;
        }
        org.json.JSONObject jSONObjectOptJSONObject3 = offeringJson.optJSONObject("paywall_components");
        boolean zHasWellShapedPaywallComponents = hasWellShapedPaywallComponents(jSONObjectOptJSONObject3, uiConfig);
        com.revenuecat.purchases.Offering.PaywallComponents paywallComponentsCreatePaywallComponents = createPaywallComponents(jSONObjectOptJSONObject3, uiConfig, zHasWellShapedPaywallComponents);
        java.net.URL webCheckoutURL = com.revenuecat.purchases.common.OfferingParserKt.getWebCheckoutURL(offeringJson);
        if (arrayList.isEmpty()) {
            return null;
        }
        java.lang.String string2 = offeringJson.getString("description");
        kotlin.jvm.internal.m.d(string2, "offeringJson.getString(\"description\")");
        com.revenuecat.purchases.Offering offering = new com.revenuecat.purchases.Offering(offeringIdentifier, string2, map2, arrayList, paywallData2, paywallComponentsCreatePaywallComponents, webCheckoutURL);
        offering.setHasPaywallComponents$purchases_defaultsRelease(zHasWellShapedPaywallComponents);
        return offering;
    }

    public final com.revenuecat.purchases.Offerings createOfferings(org.json.JSONObject offeringsJson, java.util.Map<java.lang.String, ? extends java.util.List<? extends com.revenuecat.purchases.models.StoreProduct>> productsById) {
        kotlin.jvm.internal.m.e(offeringsJson, "offeringsJson");
        kotlin.jvm.internal.m.e(productsById, "productsById");
        return createOfferings$default(this, offeringsJson, productsById, null, false, null, 28, null);
    }

    public final com.revenuecat.purchases.Package createPackage(org.json.JSONObject packageJson, java.util.Map<java.lang.String, ? extends java.util.List<? extends com.revenuecat.purchases.models.StoreProduct>> productsById, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext) throws org.json.JSONException {
        kotlin.jvm.internal.m.e(packageJson, "packageJson");
        kotlin.jvm.internal.m.e(productsById, "productsById");
        kotlin.jvm.internal.m.e(presentedOfferingContext, "presentedOfferingContext");
        java.lang.String packageIdentifier = packageJson.getString(io.sentry.protocol.ViewHierarchyNode.JsonKeys.IDENTIFIER);
        com.revenuecat.purchases.models.StoreProduct storeProductFindMatchingProduct = findMatchingProduct(productsById, packageJson);
        kotlin.jvm.internal.m.d(packageIdentifier, "packageIdentifier");
        com.revenuecat.purchases.PackageType packageType = com.revenuecat.purchases.common.OfferingParserKt.toPackageType(packageIdentifier);
        java.net.URL webCheckoutURL = com.revenuecat.purchases.common.OfferingParserKt.getWebCheckoutURL(packageJson);
        if (storeProductFindMatchingProduct != null) {
            return new com.revenuecat.purchases.Package(packageIdentifier, packageType, storeProductFindMatchingProduct.copyWithPresentedOfferingContext(presentedOfferingContext), presentedOfferingContext, webCheckoutURL);
        }
        return null;
    }

    public abstract com.revenuecat.purchases.models.StoreProduct findMatchingProduct(java.util.Map<java.lang.String, ? extends java.util.List<? extends com.revenuecat.purchases.models.StoreProduct>> productsById, org.json.JSONObject packageJson);

    public OfferingParser(kotlin.jvm.functions.Function0 shouldParsePaywallComponents) {
        kotlin.jvm.internal.m.e(shouldParsePaywallComponents, "shouldParsePaywallComponents");
        this.shouldParsePaywallComponents = shouldParsePaywallComponents;
    }

    public final com.revenuecat.purchases.Offerings createOfferings(org.json.JSONObject offeringsJson, java.util.Map<java.lang.String, ? extends java.util.List<? extends com.revenuecat.purchases.models.StoreProduct>> productsById, com.revenuecat.purchases.common.HTTPResponseOriginalSource originalSource) {
        kotlin.jvm.internal.m.e(offeringsJson, "offeringsJson");
        kotlin.jvm.internal.m.e(productsById, "productsById");
        kotlin.jvm.internal.m.e(originalSource, "originalSource");
        return createOfferings$default(this, offeringsJson, productsById, originalSource, false, null, 24, null);
    }

    public final com.revenuecat.purchases.Offerings createOfferings(org.json.JSONObject offeringsJson, java.util.Map<java.lang.String, ? extends java.util.List<? extends com.revenuecat.purchases.models.StoreProduct>> productsById, com.revenuecat.purchases.common.HTTPResponseOriginalSource originalSource, boolean z6) {
        kotlin.jvm.internal.m.e(offeringsJson, "offeringsJson");
        kotlin.jvm.internal.m.e(productsById, "productsById");
        kotlin.jvm.internal.m.e(originalSource, "originalSource");
        return createOfferings$default(this, offeringsJson, productsById, originalSource, z6, null, 16, null);
    }

    public /* synthetic */ OfferingParser(kotlin.jvm.functions.Function0 function0, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? com.revenuecat.purchases.common.OfferingParser.AnonymousClass1.INSTANCE : function0);
    }

    public final com.revenuecat.purchases.Offerings createOfferings(org.json.JSONObject offeringsJson, java.util.Map<java.lang.String, ? extends java.util.List<? extends com.revenuecat.purchases.models.StoreProduct>> productsById, com.revenuecat.purchases.common.HTTPResponseOriginalSource originalSource, boolean loadedFromDiskCache, com.revenuecat.purchases.Store configuredStore) {
        com.revenuecat.purchases.UiConfig uiConfig;
        com.revenuecat.purchases.Offerings.Targeting targeting;
        com.revenuecat.purchases.Offerings.Placements placements;
        java.util.LinkedHashMap linkedHashMap;
        java.util.Map mapReplaceJsonNullWithKotlinNull;
        java.util.Map map$default;
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        kotlin.jvm.internal.m.e(offeringsJson, "offeringsJson");
        kotlin.jvm.internal.m.e(productsById, "productsById");
        kotlin.jvm.internal.m.e(originalSource, "originalSource");
        kotlin.jvm.internal.m.e(configuredStore, "configuredStore");
        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
        com.revenuecat.purchases.common.OfferingParser$createOfferings$$inlined$log$1 offeringParser$createOfferings$$inlined$log$1 = new com.revenuecat.purchases.common.OfferingParser$createOfferings$$inlined$log$1(logIntent, productsById);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringParser$createOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringParser$createOfferings$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringParser$createOfferings$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringParser$createOfferings$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringParser$createOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringParser$createOfferings$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringParser$createOfferings$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringParser$createOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringParser$createOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringParser$createOfferings$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringParser$createOfferings$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringParser$createOfferings$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringParser$createOfferings$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringParser$createOfferings$$inlined$log$1.invoke(), null);
                break;
        }
        org.json.JSONArray jSONArray = offeringsJson.getJSONArray("offerings");
        java.lang.String string = offeringsJson.getString("current_offering_id");
        org.json.JSONObject jSONObjectOptJSONObject = offeringsJson.optJSONObject("ui_config");
        if (jSONObjectOptJSONObject != null) {
            try {
                p162s8.d json = com.revenuecat.purchases.JsonTools.INSTANCE.getJson();
                java.lang.String string2 = jSONObjectOptJSONObject.toString();
                kotlin.jvm.internal.m.d(string2, "it.toString()");
                json.getClass();
                uiConfig = (com.revenuecat.purchases.UiConfig) json.b(string2, com.revenuecat.purchases.UiConfig.INSTANCE.serializer());
            } catch (java.lang.Throwable th) {
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error deserializing ui_config", th);
                uiConfig = null;
            }
        } else {
            uiConfig = null;
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            org.json.JSONObject offeringJson = jSONArray.getJSONObject(i3);
            kotlin.jvm.internal.m.d(offeringJson, "offeringJson");
            com.revenuecat.purchases.Offering offeringCreateOffering = createOffering(offeringJson, productsById, uiConfig);
            if (offeringCreateOffering != null) {
                linkedHashMap2.put(offeringCreateOffering.getIdentifier(), offeringCreateOffering);
                if (offeringCreateOffering.getAvailablePackages().isEmpty()) {
                    com.revenuecat.purchases.LogLevel logLevel11 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.w(com.google.android.gms.internal.play_billing.M0.m(logLevel11, new java.lang.StringBuilder("[Purchases] - ")), offeringEmptyMessage(offeringCreateOffering.getIdentifier(), configuredStore));
                    }
                }
            }
        }
        org.json.JSONObject jSONObjectOptJSONObject2 = offeringsJson.optJSONObject("targeting");
        if (jSONObjectOptJSONObject2 != null) {
            java.lang.Integer numOptNullableInt = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableInt(jSONObjectOptJSONObject2, "revision");
            java.lang.String strOptNullableString = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableString(jSONObjectOptJSONObject2, "rule_id");
            if (numOptNullableInt != null && strOptNullableString != null) {
                targeting = new com.revenuecat.purchases.Offerings.Targeting(numOptNullableInt.intValue(), strOptNullableString);
            } else {
                com.revenuecat.purchases.LogLevel logLevel12 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler9 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler9.w("[Purchases] - " + logLevel12.name(), com.revenuecat.purchases.strings.OfferingStrings.TARGETING_ERROR);
                }
                targeting = null;
            }
        } else {
            targeting = null;
        }
        org.json.JSONObject jSONObjectOptJSONObject3 = offeringsJson.optJSONObject("placements");
        if (jSONObjectOptJSONObject3 != null) {
            java.lang.String nullableString = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.getNullableString(jSONObjectOptJSONObject3, "fallback_offering_id");
            org.json.JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("offering_ids_by_placement");
            if (jSONObjectOptJSONObject4 == null || (map$default = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.toMap$default(jSONObjectOptJSONObject4, false, 1, null)) == null || (mapReplaceJsonNullWithKotlinNull = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull(map$default)) == null) {
                mapReplaceJsonNullWithKotlinNull = p078i6.x.f23206h;
            }
            placements = new com.revenuecat.purchases.Offerings.Placements(nullableString, mapReplaceJsonNullWithKotlinNull);
        } else {
            placements = null;
        }
        com.revenuecat.purchases.Offering offering = (com.revenuecat.purchases.Offering) linkedHashMap2.get(string);
        com.revenuecat.purchases.Offering offering2 = null;
        if (offering != null) {
            com.revenuecat.purchases.Offering offeringWithPresentedContext = com.revenuecat.purchases.OfferingsKt.withPresentedContext(offering, null, targeting);
            linkedHashMap = linkedHashMap2;
            offering2 = offeringWithPresentedContext;
        } else {
            linkedHashMap = linkedHashMap2;
        }
        return new com.revenuecat.purchases.Offerings(offering2, linkedHashMap, placements, targeting, originalSource, loadedFromDiskCache);
    }
}
