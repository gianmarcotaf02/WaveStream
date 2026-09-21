package com.revenuecat.purchases.paywalls.fonts;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toDownloadableFontInfo", "Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;", "", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DownloadableFontInfoKt {
    public static final /* synthetic */ com.revenuecat.purchases.utils.Result toDownloadableFontInfo(com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Name name) {
        java.lang.String str;
        kotlin.jvm.internal.m.e(name, "<this>");
        java.lang.String url = name.getUrl();
        if (url == null || O7.q.N0(url)) {
            str = "Font URL is empty for " + name.getValue() + ". Cannot download font. Please try to re-upload your font in the RevenueCat dashboard.";
        } else {
            java.lang.String hash = name.getHash();
            if (hash == null || O7.q.N0(hash)) {
                str = "Font hash is empty for " + name.getValue() + ". Cannot validate downloaded font. Please try to re-upload your font in the RevenueCat dashboard.";
            } else {
                java.lang.String family = name.getFamily();
                if (family == null || O7.q.N0(family)) {
                    str = "Font family is empty for " + name.getValue() + ". Cannot download font. Please try to re-upload your font in the RevenueCat dashboard.";
                } else if (name.getWeight() == null) {
                    str = "Font weight is null for " + name.getValue() + ". Cannot download font. Please try to re-upload your font in the RevenueCat dashboard.";
                } else if (name.getStyle() == null) {
                    str = "Font style is null for " + name.getValue() + ". Cannot download font. Please try to re-upload your font in the RevenueCat dashboard.";
                } else {
                    str = null;
                }
            }
        }
        if (str != null) {
            return new com.revenuecat.purchases.utils.Result.Error(str);
        }
        java.lang.String url2 = name.getUrl();
        kotlin.jvm.internal.m.b(url2);
        java.lang.String hash2 = name.getHash();
        kotlin.jvm.internal.m.b(hash2);
        java.lang.String family2 = name.getFamily();
        kotlin.jvm.internal.m.b(family2);
        java.lang.Integer weight = name.getWeight();
        kotlin.jvm.internal.m.b(weight);
        int iIntValue = weight.intValue();
        com.revenuecat.purchases.paywalls.components.properties.FontStyle style = name.getStyle();
        kotlin.jvm.internal.m.b(style);
        return new com.revenuecat.purchases.utils.Result.Success(new com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo(url2, hash2, family2, iIntValue, style));
    }
}
