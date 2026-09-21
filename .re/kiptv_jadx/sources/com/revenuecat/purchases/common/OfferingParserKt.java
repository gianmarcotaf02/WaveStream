package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"getWebCheckoutURL", "Ljava/net/URL;", "Lorg/json/JSONObject;", "hasPaywallComponentsShape", "", "toPackageType", "Lcom/revenuecat/purchases/PackageType;", "", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OfferingParserKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.net.URL getWebCheckoutURL(org.json.JSONObject jSONObject) {
        java.lang.String strOptString = jSONObject.optString("web_checkout_url");
        if (strOptString == null || strOptString.length() == 0) {
            strOptString = null;
        }
        if (strOptString == null) {
            return null;
        }
        try {
            return new java.net.URL(strOptString);
        } catch (java.net.MalformedURLException e6) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing web checkout URL: ".concat(strOptString), e6);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasPaywallComponentsShape(org.json.JSONObject jSONObject) {
        return jSONObject.has("template_name") && jSONObject.has("asset_base_url") && jSONObject.has("components_config") && jSONObject.has("components_localizations") && jSONObject.has("default_locale");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.revenuecat.purchases.PackageType toPackageType(java.lang.String str) {
        com.revenuecat.purchases.PackageType packageType;
        com.revenuecat.purchases.PackageType[] packageTypeArrValues = com.revenuecat.purchases.PackageType.values();
        int length = packageTypeArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                packageType = null;
                break;
            }
            packageType = packageTypeArrValues[i3];
            if (kotlin.jvm.internal.m.a(packageType.getIdentifier(), str)) {
                break;
            }
            i3++;
        }
        if (packageType == null) {
            return O7.x.x0(str, "$rc_", false) ? com.revenuecat.purchases.PackageType.UNKNOWN : com.revenuecat.purchases.PackageType.CUSTOM;
        }
        return packageType;
    }
}
