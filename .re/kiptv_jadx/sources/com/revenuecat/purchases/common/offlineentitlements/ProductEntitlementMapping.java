package com.revenuecat.purchases.common.offlineentitlements;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB-\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\r\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "", "mappings", "", "", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping$Mapping;", "originalSource", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "loadedFromCache", "", "(Ljava/util/Map;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;Z)V", "getLoadedFromCache", "()Z", "getMappings", "()Ljava/util/Map;", "getOriginalSource", "()Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "component1", "component2", "component3", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toJson$purchases_defaultsRelease", "toString", "Companion", "Mapping", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class ProductEntitlementMapping {
    private static final java.lang.String BASE_PLAN_ID_KEY = "base_plan_id";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Companion INSTANCE = new com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Companion(null);
    private static final java.lang.String ENTITLEMENTS_KEY = "entitlements";
    private static final java.lang.String ORIGINAL_SOURCE_KEY = "rc_original_source";
    private static final java.lang.String PRODUCT_ENTITLEMENT_MAPPING_KEY = "product_entitlement_mapping";
    private static final java.lang.String PRODUCT_ID_KEY = "product_identifier";
    private final boolean loadedFromCache;
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping> mappings;
    private final com.revenuecat.purchases.common.HTTPResponseOriginalSource originalSource;

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping$Companion;", "", "()V", "BASE_PLAN_ID_KEY", "", "ENTITLEMENTS_KEY", "ORIGINAL_SOURCE_KEY", "PRODUCT_ENTITLEMENT_MAPPING_KEY", "PRODUCT_ID_KEY", "fromJson", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "json", "Lorg/json/JSONObject;", "loadedFromCache", "", "fromJson$purchases_defaultsRelease", "fromNetwork", "httpResult", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "fromNetwork$purchases_defaultsRelease", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public static /* synthetic */ com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping fromJson$purchases_defaultsRelease$default(com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Companion companion, org.json.JSONObject jSONObject, boolean z6, int i3, java.lang.Object obj) {
            if ((i3 & 2) != 0) {
                z6 = false;
            }
            return companion.fromJson$purchases_defaultsRelease(jSONObject, z6);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x008b  */
        public final com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping fromJson$purchases_defaultsRelease(org.json.JSONObject json, boolean loadedFromCache) throws org.json.JSONException {
            com.revenuecat.purchases.common.HTTPResponseOriginalSource hTTPResponseOriginalSourceValueOf;
            kotlin.jvm.internal.m.e(json, "json");
            org.json.JSONObject jSONObject = json.getJSONObject(com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.PRODUCT_ENTITLEMENT_MAPPING_KEY);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            kotlin.jvm.internal.m.d(itKeys, "productsObject.keys()");
            while (itKeys.hasNext()) {
                java.lang.String mappingIdentifier = itKeys.next();
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(mappingIdentifier);
                java.lang.String productIdentifier = jSONObject2.getString("product_identifier");
                java.lang.String strOptNullableString = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableString(jSONObject2, com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.BASE_PLAN_ID_KEY);
                org.json.JSONArray jSONArray = jSONObject2.getJSONArray("entitlements");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length = jSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    java.lang.String string = jSONArray.getString(i3);
                    kotlin.jvm.internal.m.d(string, "entitlementsArray.getString(entitlementIndex)");
                    arrayList.add(string);
                }
                kotlin.jvm.internal.m.d(mappingIdentifier, "mappingIdentifier");
                kotlin.jvm.internal.m.d(productIdentifier, "productIdentifier");
                linkedHashMap.put(mappingIdentifier, new com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping(productIdentifier, strOptNullableString, arrayList));
            }
            java.lang.String strOptNullableString2 = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableString(json, "rc_original_source");
            if (strOptNullableString2 != null) {
                try {
                    hTTPResponseOriginalSourceValueOf = com.revenuecat.purchases.common.HTTPResponseOriginalSource.valueOf(strOptNullableString2);
                } catch (java.lang.IllegalArgumentException e6) {
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", Y6.f.h("Invalid original source when reading it from JSON: ", strOptNullableString2, ". Defaulting to MAIN."), e6);
                    hTTPResponseOriginalSourceValueOf = null;
                }
                if (hTTPResponseOriginalSourceValueOf == null) {
                    hTTPResponseOriginalSourceValueOf = com.revenuecat.purchases.common.HTTPResponseOriginalSource.MAIN;
                }
            } else {
                hTTPResponseOriginalSourceValueOf = com.revenuecat.purchases.common.HTTPResponseOriginalSource.MAIN;
            }
            return new com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping(linkedHashMap, hTTPResponseOriginalSourceValueOf, loadedFromCache);
        }

        public final com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping fromNetwork$purchases_defaultsRelease(org.json.JSONObject json, com.revenuecat.purchases.common.networking.HTTPResult httpResult) throws org.json.JSONException {
            kotlin.jvm.internal.m.e(json, "json");
            kotlin.jvm.internal.m.e(httpResult, "httpResult");
            org.json.JSONObject jsonWithSource = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.copy(json, false).put("rc_original_source", com.revenuecat.purchases.common.HTTPResponseOriginalSourceKt.getOriginalDataSource(httpResult).name());
            kotlin.jvm.internal.m.d(jsonWithSource, "jsonWithSource");
            return fromJson$purchases_defaultsRelease(jsonWithSource, false);
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping$Mapping;", "", "productIdentifier", "", "basePlanId", "entitlements", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBasePlanId", "()Ljava/lang/String;", "getEntitlements", "()Ljava/util/List;", "getProductIdentifier", "component1", "component2", "component3", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Mapping {
        private final java.lang.String basePlanId;
        private final java.util.List<java.lang.String> entitlements;
        private final java.lang.String productIdentifier;

        public Mapping(java.lang.String productIdentifier, java.lang.String str, java.util.List<java.lang.String> entitlements) {
            kotlin.jvm.internal.m.e(productIdentifier, "productIdentifier");
            kotlin.jvm.internal.m.e(entitlements, "entitlements");
            this.productIdentifier = productIdentifier;
            this.basePlanId = str;
            this.entitlements = entitlements;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping copy$default(com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping mapping, java.lang.String str, java.lang.String str2, java.util.List list, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = mapping.productIdentifier;
            }
            if ((i3 & 2) != 0) {
                str2 = mapping.basePlanId;
            }
            if ((i3 & 4) != 0) {
                list = mapping.entitlements;
            }
            return mapping.copy(str, str2, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getProductIdentifier() {
            return this.productIdentifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.lang.String getBasePlanId() {
            return this.basePlanId;
        }

        public final java.util.List<java.lang.String> component3() {
            return this.entitlements;
        }

        public final com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping copy(java.lang.String productIdentifier, java.lang.String basePlanId, java.util.List<java.lang.String> entitlements) {
            kotlin.jvm.internal.m.e(productIdentifier, "productIdentifier");
            kotlin.jvm.internal.m.e(entitlements, "entitlements");
            return new com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping(productIdentifier, basePlanId, entitlements);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping)) {
                return false;
            }
            com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping mapping = (com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping) other;
            return kotlin.jvm.internal.m.a(this.productIdentifier, mapping.productIdentifier) && kotlin.jvm.internal.m.a(this.basePlanId, mapping.basePlanId) && kotlin.jvm.internal.m.a(this.entitlements, mapping.entitlements);
        }

        public final java.lang.String getBasePlanId() {
            return this.basePlanId;
        }

        public final java.util.List<java.lang.String> getEntitlements() {
            return this.entitlements;
        }

        public final java.lang.String getProductIdentifier() {
            return this.productIdentifier;
        }

        public int hashCode() {
            int iHashCode = this.productIdentifier.hashCode() * 31;
            java.lang.String str = this.basePlanId;
            return this.entitlements.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Mapping(productIdentifier=");
            sb.append(this.productIdentifier);
            sb.append(", basePlanId=");
            sb.append(this.basePlanId);
            sb.append(", entitlements=");
            return com.google.android.gms.internal.play_billing.M0.n(sb, this.entitlements, ')');
        }
    }

    public ProductEntitlementMapping(java.util.Map<java.lang.String, com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping> mappings, com.revenuecat.purchases.common.HTTPResponseOriginalSource originalSource, boolean z6) {
        kotlin.jvm.internal.m.e(mappings, "mappings");
        kotlin.jvm.internal.m.e(originalSource, "originalSource");
        this.mappings = mappings;
        this.originalSource = originalSource;
        this.loadedFromCache = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping copy$default(com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping productEntitlementMapping, java.util.Map map, com.revenuecat.purchases.common.HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            map = productEntitlementMapping.mappings;
        }
        if ((i3 & 2) != 0) {
            hTTPResponseOriginalSource = productEntitlementMapping.originalSource;
        }
        if ((i3 & 4) != 0) {
            z6 = productEntitlementMapping.loadedFromCache;
        }
        return productEntitlementMapping.copy(map, hTTPResponseOriginalSource, z6);
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping> component1() {
        return this.mappings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final com.revenuecat.purchases.common.HTTPResponseOriginalSource getOriginalSource() {
        return this.originalSource;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getLoadedFromCache() {
        return this.loadedFromCache;
    }

    public final com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping copy(java.util.Map<java.lang.String, com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping> mappings, com.revenuecat.purchases.common.HTTPResponseOriginalSource originalSource, boolean loadedFromCache) {
        kotlin.jvm.internal.m.e(mappings, "mappings");
        kotlin.jvm.internal.m.e(originalSource, "originalSource");
        return new com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping(mappings, originalSource, loadedFromCache);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping)) {
            return false;
        }
        com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping productEntitlementMapping = (com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping) other;
        return kotlin.jvm.internal.m.a(this.mappings, productEntitlementMapping.mappings) && this.originalSource == productEntitlementMapping.originalSource && this.loadedFromCache == productEntitlementMapping.loadedFromCache;
    }

    public final boolean getLoadedFromCache() {
        return this.loadedFromCache;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping> getMappings() {
        return this.mappings;
    }

    public final com.revenuecat.purchases.common.HTTPResponseOriginalSource getOriginalSource() {
        return this.originalSource;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.loadedFromCache) + ((this.originalSource.hashCode() + (this.mappings.hashCode() * 31)) * 31);
    }

    public final org.json.JSONObject toJson$purchases_defaultsRelease() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Map<java.lang.String, com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping> map = this.mappings;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(p078i6.D.I0(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping mapping = (com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Mapping) entry.getValue();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("product_identifier", mapping.getProductIdentifier());
            java.lang.String basePlanId = mapping.getBasePlanId();
            if (basePlanId != null) {
                jSONObject2.put(BASE_PLAN_ID_KEY, basePlanId);
            }
            jSONObject2.put("entitlements", new org.json.JSONArray((java.util.Collection) mapping.getEntitlements()));
            linkedHashMap.put(key, jSONObject2);
        }
        jSONObject.put(PRODUCT_ENTITLEMENT_MAPPING_KEY, new org.json.JSONObject(linkedHashMap));
        jSONObject.put("rc_original_source", this.originalSource.name());
        return jSONObject;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductEntitlementMapping(mappings=");
        sb.append(this.mappings);
        sb.append(", originalSource=");
        sb.append(this.originalSource);
        sb.append(", loadedFromCache=");
        return v5.L.a(sb, this.loadedFromCache, ')');
    }

    public /* synthetic */ ProductEntitlementMapping(java.util.Map map, com.revenuecat.purchases.common.HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(map, (i3 & 2) != 0 ? com.revenuecat.purchases.common.HTTPResponseOriginalSource.MAIN : hTTPResponseOriginalSource, (i3 & 4) != 0 ? false : z6);
    }
}
